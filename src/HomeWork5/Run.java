package HomeWork5;

import com.sun.deploy.net.MessageHeader;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Run {

    public static final String path = "src/new.csv";
    public static ArrayList<FileObject> fileObjectArrayList = new ArrayList<>();
    public static final String title = "value1"+ ";" + "value2"
            + ";" + "value3" + ";"+ System.getProperty("line.separator");


    public static void main(String[] args) throws IOException {

        AppData data = new AppData();
        int[][] result = new int[3][3];

        createList();
        writer();


        AppData appData = readToObject();



        try (FileWriter  writer = new FileWriter(path)) {
            for (int i = 1; i < 4; i++) {

                writer.write("Value" + i + "; ");

            }
            System.out.println();

            for (int i = 1; i < result.length+1; i++) {
                writer.write(String.valueOf(fileObjectArrayList));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new
                FileReader(path))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private static void createList() {
        Random random = new Random();
        for (int i = 1; i < 10; i++) {

            fileObjectArrayList.add(new FileObject(i, random.nextInt(1000), random.nextInt(10000)));
        }
    }


    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(path);){
            writer.write(title);
            for(FileObject fIleObject : fileObjectArrayList) {
                writer.write(fIleObject.getValue() + ";" + fIleObject.getValueFrom()
                        + ";" + fIleObject.getValueFrom() + ";"+ System.getProperty("line.separator"));
            }
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        };

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;

    }


}

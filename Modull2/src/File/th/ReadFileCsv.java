package File.th;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {
    private static final String FILE_QUOCGIA_CSV="F:\\CODEGYM\\Modull2\\src\\File\\th\\quocgia.csv";

    public static List<QuocGia> readListCSV(){
        List<QuocGia> quocGiaList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_QUOCGIA_CSV);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            QuocGia quocGia;
            while ((line = bufferedReader.readLine())!= null){
                temp =line.split(",");
                int id= Integer.parseInt(temp[0]);
                String code = temp[1];
                String name =temp[2];
                quocGia = new QuocGia(id,code,name);
                quocGiaList.add(quocGia);
            }
        }  catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            try{
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return quocGiaList;
    }

    public static  void writeListCSV(List<QuocGia> quocGiaList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_QUOCGIA_CSV);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str= "";
        for(QuocGia quocGia : quocGiaList ){
            str+= quocGia.getId()+"," +quocGia.getCode()+","+ quocGia.getName()+"\n";
        }
        if(str != null && !str.isEmpty()){
            bufferedWriter.write(str);
        }
        bufferedWriter.close();
    }

    public static void main(String[] args) {
        List<QuocGia> quocGiaList = readListCSV();
        for(QuocGia quocGia: quocGiaList){
            System.out.println(quocGia);
        }
    }


}

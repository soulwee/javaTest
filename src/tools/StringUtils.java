package tools;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StringUtils {

    //单元测试方法必须是public void ,且不能带有任何参数
    @Test
    public void testAppend(){
        try {
            appendChar(",");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        Integer f1=100,f2=100,f3=150,f4=150;System.out.println(f1==f2);System.out.println(f3==f4);

    }

    private static void appendChar(String type) throws Exception {
        File f = new File("data.txt");
        File f2 = new File("data2.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2)));
        String str = "";
        while((str = br.readLine()) != null){
            if(",".equals(type)){ //基础版
                bw.write(str.trim()+type);
            }else if(",,".equals(type)){ //加强版（去特殊字符）
                StringBuilder tmpStr= new StringBuilder();
                if(str.length()>0){
                    for(int i=0;i<str.length();i++){
                        String tmp=""+str.charAt(i);
                        if((tmp).matches("[0-9.]")){
                            tmpStr.append(tmp);
                        }
                    }
                }
                bw.write(tmpStr.toString().trim()+type);
            }else if("'".equals(type)){
                bw.write(type+str.trim()+type+",");
            }
            bw.newLine();
        }
        bw.flush();
    }



    public static void main(String[] args) {
        try {
            appendChar("'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

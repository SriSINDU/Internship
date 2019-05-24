import java.util.*;
import java.io.*;
public class TrySerDeser {
    public static void main(String[] args){
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1,"sindhu");
        m.put(2,"siddhi");
        List<String> l=new ArrayList<>();
        l.add("hi");
        l.add("hello");
        HashMap<Integer,List<String>> mapp1=new HashMap<>();
        mapp1.put(1,l);
        try{
            FileOutputStream fos = new FileOutputStream("contactone.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.writeObject(mapp1);
            oos.close();
            fos.close();

        }catch(Exception e){
                System.out.println(e.getStackTrace());
        }
        HashMap<Integer, String> map = null;
        HashMap<Integer,List<String>> mapp2=null;
        try{
            FileInputStream fis = new FileInputStream("contactone.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            map = (HashMap) ois.readObject();
            mapp2=(HashMap) ois.readObject();

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(map);
        System.out.println(mapp2);
    }
}

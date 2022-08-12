import javax.swing.*;

public class Vaccine {
    public static void main(String[] args) {
        String vaccine_name= JOptionPane.showInputDialog("請輸入疫苗名稱(AZ,BNT,Moderna)");
        //轉換成小寫
        vaccine_name=vaccine_name.toLowerCase();

        if(vaccine_name.equals("az"))
            JOptionPane.showMessageDialog(null,"AZ\n疫苗類型:腸病毒疫苗\n劑量:2\n保護率:81%");
        else if (vaccine_name.equals("bnt"))
            JOptionPane.showMessageDialog(null,"BNT\n疫苗類型:mRNA疫苗\n劑量:2\n保護率:95%");
        else if(vaccine_name.equals("moderna"))
            JOptionPane.showMessageDialog(null,"Moderna\n疫苗類型:mRNA疫苗\n劑量:2\n保護率:94%");
        else
            JOptionPane.showMessageDialog(null,"無法辨別輸入內容,請輸入英文名稱");
    }
}

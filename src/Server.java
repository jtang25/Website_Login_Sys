import java.io.*;

public class Server {

    public static void registerAccount(String usernameToken, String passwordToken){
        int hashedUsernameToken = jtHash(usernameToken);
        int hashedPasswordToken = jtHash(passwordToken);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Jason_yj4bjfp\\IdeaProjects\\Website_Login_Sys\\src\\AccountInfo", true));
            bw.write(hashedUsernameToken+" "+hashedPasswordToken);
            bw.newLine();
            bw.flush();
            bw.close();
            System.out.println("Account info stored");
        }
        catch(IOException e) {
            System.out.println("Error 15: File Not Found");
            e.printStackTrace();
        }
    }

    public static boolean verifyLogin(String usernameToken, String passwordToken){
        int hashedUsernameToken = jtHash(usernameToken);
        int hashedPasswordToken = jtHash(passwordToken);
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Jason_yj4bjfp\\IdeaProjects\\Website_Login_Sys\\src\\AccountInfo"));
            String line;
            while((line = br.readLine()) != null){
                String[] account = line.split(" ");
                if(Integer.parseInt(account[0]) == hashedUsernameToken && Integer.parseInt(account[1]) == hashedPasswordToken){
                    return true;
                }
            }
            return false;
        }
        catch (IOException e){
            System.out.println("Error 15: File Not Found");
            e.printStackTrace();
        }
        return false;
    }

    private static int jtHash(String token){
        int hash = 7;
        for(int x = 0; x < token.length(); x++){
            hash = hash*37 + token.charAt(x);
        }
        return hash;
    }
}

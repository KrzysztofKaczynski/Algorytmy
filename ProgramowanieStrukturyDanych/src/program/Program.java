package program;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Program {
    /**
     Enter the text you want to enscript by MD5
     Type "quit" to exit the progam
     */
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        String input = "";
        while (true) {
            myVar = new Scanner(System.in);
            input = myVar.nextLine();
            if ("quit".equals(input)) break;
            Digest digest = new Digest();
            System.out.println("After run: " + digest.run(input));
            System.out.println("============================================");
            System.out.println("Type next input: ");
        }
        myVar.close();
        System.out.println("System close");
    }

    public static class Digest {
        private String algorithm;

        Digest () {
            this.algorithm = "MD5";
        }

        Digest (String algorithm) {
            this.algorithm = "MD5";
        }

        public String run(String value) {
            StringBuffer sb = new StringBuffer();
            try {
                System.out.println("Before run " + this.algorithm + "digest : " + value);
                MessageDigest md = MessageDigest.getInstance(this.algorithm);
                md.update(value.getBytes());
                byte[] digest = md.digest();
                for (byte b : digest) {
                    sb.append(String.format("%02x", b & 0xff));
                }
            } catch (NoSuchAlgorithmException e) {
                return "error";
            }
            return sb.toString();
        }
    }
}


package tctest;

import java.io.*;

public class MyUtils {
    private MyUtils(){
        throw new AssertionError("can not construct the object!");
    }

    public static void fileCopy(String source, String target) throws IOException {
        try (InputStream inputStream = new FileInputStream(source)) {
            try (OutputStream outputStream = new FileOutputStream(target)) {
                byte[] buffer = new byte[4096];
                int bytesToRead;
                while ((bytesToRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesToRead);
                }
            }
        }
    }

    public static int findWordNum(String fileName, String keyword) {
        int total = 0;

        return total;
    }
}

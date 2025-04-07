package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
   public static void main(String[] args) throws IOException {
//      생선 종류를 파일에 출력한 뒤
//      입력받은 내용을 모두 콘솔에 출력한다.
//      생선은 3마리다.
      final String PATH = "fish.txt";

      String[] fishes = { "고등어", "삼치", "연어" };
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH));
      BufferedReader bufferedReader = null;
      String line = null;

      for (int i = 0; i < fishes.length; i++) {
         bufferedWriter.write(fishes[i] + "\n");
      }

      bufferedWriter.close();

      try {
         bufferedReader = new BufferedReader(new FileReader(PATH));

         while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
         }

      } catch (FileNotFoundException e) {
         System.out.println("경로를 다시 확인하십시오.");
      } finally {
         bufferedReader.close();
      }

//      고등어를 감성돔로 변경
      String temp = "";

      try {
         bufferedReader = new BufferedReader(new FileReader(PATH));

         while ((line = bufferedReader.readLine()) != null) {

//            1. 고등어 찾기
            if (line.equals("고등어")) {
//               2. 고등어 대신 감성돔 넣기
               temp += "감성돔\n";
               continue;
            }

//            3. 고등어가 아니면 그대로 넣기
            temp += line + "\n";
         }

      } catch (FileNotFoundException e) {
         System.out.println("경로를 다시 확인하십시오.");
      } finally {
         bufferedReader.close();
      }

//      4. 완성된 문자열로 덮어쓰기
      bufferedWriter = new BufferedWriter(new FileWriter(PATH));
      bufferedWriter.write(temp);
      bufferedWriter.close();

//      감성돔 삭제하기
//      고등어를 감성돔로 변경
      temp = "";

      try {
         bufferedReader = new BufferedReader(new FileReader(PATH));

         while ((line = bufferedReader.readLine()) != null) {

//            1. 감성돔 찾기
            if (line.equals("감성돔")) {
//               2. 고등어는 건너뛴다.
               continue;
            }

//            2. 감성돔이 아니면 그대로 넣기
            temp += line + "\n";
         }

      } catch (FileNotFoundException e) {
         System.out.println("경로를 다시 확인하십시오.");
      } finally {
         bufferedReader.close();
      }

//      3. 완성된 문자열로 덮어쓰기
      bufferedWriter = new BufferedWriter(new FileWriter(PATH));
      bufferedWriter.write(temp);
      bufferedWriter.close();
   }

}

package MathAndFile;

import java.io.File;

/**
 * Math and File
 *
 * 编写一个程序，在命令行中以树状结构展现特定的文件夹以及子文件(夹)
 *
 * https://www.youtube.com/watch?v=YLqDTiOwDuM&index=112&list=PLEdG6ih2rJtG5xRuKpzgRnqfZPR6EDbGu
 *
 * Created by Allen on 16/12/20.
 */
public class Test {
    public static void findDir(File f, int level) {
        // 根据 level 进行缩进，使其更好的 readable
        String preStr = "";
        for (int i = 0; i < level; i++) {
            preStr += "     ";
        }

        File[] children = f.listFiles();
        for (File file : children) {
            System.out.println(file.getName());
            if (file.isDirectory()) {
                findDir(file, level + 1);
            }
        }

    }
    public static void main(String[] args) {
        String filename = "d:/A";
        File f = new File(filename);
        int level = 1;
        System.out.println(f.getName());
        findDir(f, level);
    }

}

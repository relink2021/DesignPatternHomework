package Homework14;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import java.io.File;
import java.util.ArrayList;

/* 逻辑控制 */
public class GUIController {

    public static ArrayList<String> s = new ArrayList<>();

    private Directory root;
    private Directory temp;

    @FXML
    private TextArea context;

    @FXML
    private AnchorPane rootLayout;

    @FXML
    /* 浏览需要遍历的文件 */
    private void viewFile() {
        try {
            Stage stage = (Stage) rootLayout.getScene().getWindow();
            DirectoryChooser directoryChooser = new DirectoryChooser();
            directoryChooser.setTitle("选择文件夹");
            File file = directoryChooser.showDialog(stage);
            root = new Directory(file.getName());
            recursion(file);
            while(root.getParent() != null) {
                System.out.println(root);
                root.printList_();
                root = root.getParent();
            }
            StringBuilder str = new StringBuilder("");
            for(int i = 0; i < s.size(); i++) {
                str.append(s.get(i));
            }
            context.setText(str.toString());
            str = new StringBuilder("");
            s.clear();
        } catch (Exception e) {
            context.setText("打开文件失败");
        }
    }

    /* 递归遍历文件 */
    private void recursion(File file) {
        if(file.isDirectory()) {
            temp = new Directory(file.getName());
            temp.setParent(root);
            root = temp;
            File[] files = file.listFiles();
            if(files != null) {
                for(File file1 : files) {
                    if(file1.isDirectory()) {
                        Directory directory = new Directory(file1.getName());
                        temp.add(directory);
                    } else {
                        Homework14.File file_x = new Homework14.File(file1.getName(), (int)file1.length());
                        temp.add(file_x);
                    }
                    recursion(file1);
                }
            }
        }
    }
}

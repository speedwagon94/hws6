package presenter;

import model.FamilyTree;
import model.Handler;
import model.interfaces.Writable;
import ui.interfaces.View;

import java.io.IOException;

import static model.Dynasty.dynasty;


public class Presenter {
    private View view;
    private FamilyTree familyTree = new FamilyTree();
    private Writable handler = new Handler();

    public Presenter(View view) {
        this.view = view;
        dynasty(familyTree);
        view.setPresenter(this);
    }

    public void addRecord(String nextLine) {
        System.out.println("В разработке");
    }

    public void wholeList() {
        familyTree.List();
        System.out.println();
    }
    public void search(String search) {
        familyTree.search(search);
        System.out.println();
    }
    public void sorting() {
        familyTree.sortByName();
        familyTree.List();
        System.out.println();
    }
    public void save() throws IOException {
        handler.save(familyTree);
        System.out.println("Список успешно сохранен!");
        System.out.println();
    }
    public void read() throws IOException, ClassNotFoundException {
        System.out.println("Список из файла");
        System.out.println();
        handler.read();
        System.out.println();
    }
}

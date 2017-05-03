package school;

/**
 * Created by Formando on 03/05/2017.
 */
public class Student extends Person {
    public String studentNumber;
    private String studentFileName; // "Nome da ficha"
    //"<Número do aluno><Nome>"
    public String getStudentFileName(){
        return studentNumber+name;
    }

}

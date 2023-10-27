import model.Pessoa;
public class App {
    public static void main(String[] args) throws Exception {
        

        Pessoa x = new Pessoa();
        String x1 = "Jorge";
        x.setNome(x1);
        
        x.setData_nascimento("30-05-2002");
        System.out.println(x.getNome()+"\n"+x.getData_nascimento());
    }
}

package Project;

public class MainProcess{
    LoginView loginView;

    StartMenu accountBook;
   
    public static void main(String[] args) {
        // ����Ŭ���� ����
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // �α���â ���̱�
        main.loginView.setMain(main); // �α���â���� ���� Ŭ����������
        
    }
   
    public void showAccountBook(){
        loginView.dispose(); // �α��� â�ݱ�
        this.accountBook = new StartMenu(); // ����� ����
    }
}


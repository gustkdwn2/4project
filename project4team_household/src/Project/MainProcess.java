package Project;

public class MainProcess{
    LoginView loginView;

    StartMenu accountBook;
   
    public static void main(String[] args) {
        // 메인클래스 실행
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // 로그인창 보이기
        main.loginView.setMain(main); // 로그인창에게 메인 클래스보내기
        
    }
   
    public void showAccountBook(){
        loginView.dispose(); // 로그인 창닫기
        this.accountBook = new StartMenu(); // 가계부 오픈
    }
}


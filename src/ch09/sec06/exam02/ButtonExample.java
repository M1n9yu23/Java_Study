package ch09.sec06.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();

        class OkListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        btn.setClickListener(new OkListener());

        btn.click();


        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("Cancel 버튼을 클릭했습니다. ");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }
}

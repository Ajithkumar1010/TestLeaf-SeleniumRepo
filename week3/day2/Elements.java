package week3.day2;

public class Elements extends Button {
		

	public static void main(String[] args) {
		
		

		Button buttonObj = new Button();
        buttonObj.setText("Button inherited");
        buttonObj.click();
        buttonObj.submit();

        System.out.println("\n---------------------------");

        CheckBoxButton checkBoxObj = new CheckBoxButton();
        checkBoxObj.setText("CheckBoxButton inherited");
        checkBoxObj.click();
        checkBoxObj.submit();
        checkBoxObj.clickCheckButton();

        System.out.println("\n---------------------------");

        RadioButton radioObj = new RadioButton();
        radioObj.setText("RadioButton inherited");
        radioObj.click();
        radioObj.submit();
        radioObj.selectRadioButton();

        System.out.println("\n---------------------------");

        TextField textObj = new TextField();
        textObj.setText("TextField inherited");
        textObj.click();
        textObj.getText();

        System.out.println("\n---------------------------");

        Elements elementsObj = new Elements();
        elementsObj.setText("Elements class inherited");
        elementsObj.click();
        elementsObj.submit();
	}

}

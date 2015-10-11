package com.example.mehul.justjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){

        int pricePercup = 5;
        CheckBox whippedCreamCheckBox = (CheckBox)findViewById(R.id.whipped_cream_checkbox);
        CheckBox chocolateCheckBox = (CheckBox)findViewById(R.id.chocolate_checkbox);
        EditText nameEditText = (EditText)findViewById(R.id.name_edit_text);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        boolean hasChocolate = chocolateCheckBox.isChecked();

        if (hasWhippedCream){
            pricePercup +=1;
        }
        if (hasChocolate){
            pricePercup +=2;
        }

        String name = nameEditText.getText().toString();

        String priceMessage = "Name: "+name+"\nQuantity: "+quantity+"\nTotal: $"+ quantity*pricePercup;
        priceMessage = priceMessage + "\nAdd Whipped Cream: "+ hasWhippedCream;
        priceMessage = priceMessage + "\nAdd Chocolate: "+ hasChocolate;
        priceMessage = priceMessage + "\nThank you!";
        String subject = "Coffee order for "+ name;
        displayMessage(subject, priceMessage);

      //   display(quantity);
      //  displayPrice(quantity * 5);
    }
    public void increment(View view){

        quantity += 1;

        display(quantity);

    }
    public void decrement(View view){
        if (quantity > 0 ){
            quantity -= 1;
            display(quantity);
        }
        else {
            quantity = 0;
            display(quantity);
        }


    }

    private void display(int number) {
        TextView quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }
    private void displayPrice(int number){
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String subject, String message){
      //  TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
      //  priceTextView.setText(message);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


}

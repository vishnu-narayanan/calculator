package com.vn.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.Stack;


public class MainActivity extends ActionBarActivity {

    public static final  String TAG = MainActivity.class.getSimpleName();

    TextView mNumView;
    Stack<BigDecimal> mStack;
    boolean mPopReady = true;
    boolean mNewNum;

    public  static  final String DIVISION_BY_ZERO = "Division by Zero error";
    public  static  final  int MAX_DIGITS_ALLOWED = 20;
    public  static  final  int ROUNDING_PLACES = 20;
    public  static  final  String MAX_DIGITS_MESSAGE = "max no of digits("+ MAX_DIGITS_ALLOWED+") excerded";
    public  static  final  String OVERFLOW_ERROR = "overflow";
    public  static  final  String LARGEST_NUMBER = "99999999999999999999";
    public  static  final  String SMALLEST_STRING = "-99999999999999999999";

    BigDecimal mLagestNumber;
    BigDecimal mSmallestNumber;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

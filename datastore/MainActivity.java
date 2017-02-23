package com.codalo.datastore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    DatabaseHandler db;

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHandler(this);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);

        createContact("rima", "886");
        updateContact(10 , "tanji", "777");
        deleteContact(8);
        readContact();
        totalContactCount();


    }

    private void totalContactCount() {
        int contactCount = db.getContactsCount();
        String countResult = "Total count: "+contactCount+"\n\n";
        tv2.setText(countResult);
    }

    private void createContact(String name, String phone){
        db.addContact(new Contact(name, phone));
    }

    private void updateContact(int id, String name, String phone){
        int updateResult = db.updateContact(new Contact(id, name, phone));
        tv4.setText("Update Status: "+updateResult+"");
    }

    private void deleteContact(int id){
        int deleteResult = db.deleteContact(new Contact(id, "", ""));
        tv3.setText("Delete Status: "+deleteResult+"");
    }

    private void readContact(){
        String result = "";

        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts){
            String log = "ID: "+cn.getID()+" ,Name: "+cn.getName()+
                    " ,Phone: "+cn.getPhoneNumber();
            result += log+"\n\n";
            Log.e("Name: ", log);
        }

        tv1.setText(result);
    }


}

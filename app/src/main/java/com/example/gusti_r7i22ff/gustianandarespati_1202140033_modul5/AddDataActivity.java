package com.example.gusti_r7i22ff.gustianandarespati_1202140033_modul5;

/**
 * Created by gusti_r7i22ff on 25/03/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddDataActivity {
    //deklarasi variable
    String Todo, Desc, Prior;

    //konstruktor
    public AddDataActivity(String todo, String desc, String prior){
        this.Todo=todo;
        this.Desc=desc;
        this.Prior=prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return Todo;
    }

    public void settodo(String todo) {
        this.Todo = todo;
    }

    public String getDesc() {
        return Desc;
    }

    public void setdesc(String desc) {
        this.Desc = desc;
    }

    public String getPrior() {
        return Prior;
    }

    public void setprior (String prior) {
        this.Prior = prior;
    }
}

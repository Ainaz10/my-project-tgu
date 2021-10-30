package com.example.projecttgu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val  TAG = "MainActivity"
private const val MY_OWN_TAG = "MyOwnLog"

class MainActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(MY_OWN_TAG, "onCreate(Ты видел деву на скале\n" +
                "В одежде белой над волнами)")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_OWN_TAG, "onStart(Когда, бушуя в бурной мгле,\n" +
                "Играло море с берегами,)")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_TAG, "onResume(Когда луч молний озарял\n" +
                "Ее всечасно блеском алым)")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_TAG, "onPause(И ветер бился и летал\n" +
                "С ее летучим покрывалом?)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_TAG, "onStop(Прекрасно море в бурной мгле\n" +
                "И небо в блесках без лазури;)")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_OWN_TAG, "onRestart(Но верь мне: дева на скале)")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_TAG, "onDestroy(Прекрасней волн, небес и бури.)")
    }

}





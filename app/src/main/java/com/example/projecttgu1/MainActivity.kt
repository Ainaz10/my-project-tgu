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

        Log.d(MY_OWN_TAG, "onCreate(_1_Ты видел деву на скале\n" +
                "В одежде белой над волнами)")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_OWN_TAG, "onStart(_2_Когда, бушуя в бурной мгле,\n" +
                "Играло море с берегами,)")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_TAG, "onResume(_3_Когда луч молний озарял\n" +
                "Ее всечасно блеском алым)")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_TAG, "onPause(_4_И ветер бился и летал\n" +
                "С ее летучим покрывалом?)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_TAG, "onStop(_5_Прекрасно море в бурной мгле\n" +
                "И небо в блесках без лазури;)")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_OWN_TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_TAG, "_6_onDestroy(Но верь мне: дева на скале\n" +
                "Прекрасней волн, небес и бури.)")
    }

}





package demo.procrastination.com

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        tf_remaining_time.text = intent.getStringExtra("remaining_time") + " Tage verbleiben"
        tf_excuse_1.text = intent.getStringExtra("excuse_1")
        tf_excuse_2.text = intent.getStringExtra("excuse_2")
    }

    override fun onBackPressed() {
        finish()
    }

}
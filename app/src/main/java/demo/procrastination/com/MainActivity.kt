package demo.procrastination.com

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_get_excuses.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("remaining_time", remainingTime(TimeUnit.DAYS).toString())
            intent.putExtra("excuse_1", Excuses.getRandomExcuse())
            intent.putExtra("excuse_2", Excuses.getRandomExcuse())
            startActivity(intent)
        }
    }

    private fun remainingTime(timeUnit: TimeUnit): Long {
        val calendar: Calendar = Calendar.getInstance()
        calendar.set(datepicker.year, datepicker.month, datepicker.dayOfMonth)
        return timeUnit.convert(calendar.timeInMillis - System.currentTimeMillis(), TimeUnit.MILLISECONDS)
    }

}
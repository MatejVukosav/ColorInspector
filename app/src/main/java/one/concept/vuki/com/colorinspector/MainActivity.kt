package one.concept.vuki.com.colorinspector

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.graphics.Palette
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image)
        val palette = Palette.from((image.drawable as BitmapDrawable).bitmap).generate()

        val lightVibrant = findViewById<Button>(R.id.lightVibrant)
        lightVibrant.setBackgroundColor(palette.lightVibrantSwatch!!.rgb)
        val vibrant = findViewById<Button>(R.id.vibrant)
        vibrant.setBackgroundColor(palette.vibrantSwatch!!.rgb)

        val darkVibrant = findViewById<Button>(R.id.darkVibrant)
        darkVibrant.setBackgroundColor(palette.darkVibrantSwatch!!.rgb)

        val lightMuted = findViewById<Button>(R.id.lightMuted)
        lightMuted.setBackgroundColor(palette.lightMutedSwatch!!.rgb)

        val muted = findViewById<Button>(R.id.muted)
        muted.setBackgroundColor(palette.mutedSwatch!!.rgb)

        val darkMuted = findViewById<Button>(R.id.darkMuted)
        darkMuted.setBackgroundColor(palette.darkMutedSwatch!!.rgb)


    }
}

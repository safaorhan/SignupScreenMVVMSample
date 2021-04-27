package school.cactus.cactusnotesmvvmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import school.cactus.cactusnotesmvvmsample.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private val viewModel: SignupViewModel by viewModels { SignupViewModelFactory(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivitySignupBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_signup)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}
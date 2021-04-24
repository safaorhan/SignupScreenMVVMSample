package school.cactus.cactusnotesmvvmsample

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("android:error")
fun setError(textInputLayout: TextInputLayout,  error: String?) {
    textInputLayout.error = error
    textInputLayout.isErrorEnabled = error != null
}

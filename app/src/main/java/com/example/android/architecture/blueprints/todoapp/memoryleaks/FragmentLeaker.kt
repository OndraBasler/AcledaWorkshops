package com.example.android.architecture.blueprints.todoapp.memoryleaks

import androidx.fragment.app.Fragment

/**
 * Don't do this in production code!
 * For demonstration of memory leaks
 */
object FragmentLeaker {
    var leakedFragment: Fragment? = null
}
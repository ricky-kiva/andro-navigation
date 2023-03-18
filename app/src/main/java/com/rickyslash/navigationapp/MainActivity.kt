package com.rickyslash.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// Navigation examples:
// - Navigation Component: A 'new component' in 'Android Jetpack' Package to 'navigate between Activity/Fragment' in 'easy way' (Later will be discussed further)
// - App Bar: Is the bar in the 'above' of an 'app'. also often called 'Action Bar' (Basic app)
// - Toolbar: Is the 'replacement' for 'Action Bar' that 'has more flexibility'. Is a 'new feature' in Material Design
// --- Toolbar is being inserted to layout, thus it's easy to position, animate, and being controlled
// - Navigation Drawer: 'Panel' in the 'left side' of an app, or inside 'hamburger' (Gmail)
// - Bottom Navigation: A 'navigation in the bottom' of an app with the form of 'row' (Instagram)
// - Tab Layout: a navigation in the 'form of tab row'. Usually combined with 'ViewPager' so it could be 'swiped' (Whatsapp)

// 'Navigation Component' benefits:
// - Can 'see' the 'flow of navigation' 'easily' via Android Studio
// - Handle 'Fragment move' 'faster'
// - Handle 'Up/Back Navigation' 'precisely' in 'default'
// - Handle 'transition animation' 'easily'
// - 'Helps' to implement 'DeepLink'
// - Contains 'NavigationUI', like Navigation Drawer / Bottom Navigation
// - 'Safe Args' to send data 'safely from null pointer exception'

// 5 Navigation Principal:
// - There need to be a 'settled' 'start destination'
// - 'Stack' must 'save state' if decided to 'go back'
// - 'Up' (The one in app bar (<-)) & 'Down' (The one in bottom navbar (->))button needs to 'correspond' to the 'navigation'
// - 'Up' button 'not causing exiting app'. 'Back Button/Gesture' need to be always 'implemented' to 'exit' the app
// - 'Deep Link' need to have 'backstack flow' that same as 'manual navigation'

// 'Navigation' parts:
// - Navigation Graph: 'XML resource' in 'res -> navigation' that contains all 'navigation data' such:
// --- Destination: 'Activity/Fragment' that is 'interconnected'
// --- Action: the 'action' that 'contains' the 'destination of Fragment'. It also to set animation, pop behavior (action on 'back' button clicked), launch option, etc
// --- Argument: to 'define' the 'data' that's going to be 'send' via 'Fragment'
// --- DeepLink: 'Open fragment' using 'URL'
// - NavHostFragment: 'basic XML layout' that 'act as a host' 'from every page'.
// --- usually is inside activity that contains fragment
// - NavController: 'class' to 'execute navigation'

// Sending data using 'SafeArgs':
// - add: classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.5.1" to build.gradle(Project)
// - add: id 'androidx.navigation.safeargs' to build.gradle(Module)
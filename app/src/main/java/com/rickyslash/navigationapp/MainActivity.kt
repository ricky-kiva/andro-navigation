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
// - Bottom Navigation: A 'navigation in the bottom' of an app with the form of 'row', usually about 3-5 item (Instagram)
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

// AppBar function:
// - Give space to 'app identity' / 'user location'
// - access to 'important action' like search
// - as 'navigation' & 'switch' between views

// 2 types of AppBar:
// - ActionBar: default AppBar that could be assigned useful element
// --- container: component that 'act as container' 'for another element'
// --- navigation icon: icon to 'open' up 'Navigation Drawer' (hamburger icon). Could also be 'up arrow' for navigation to parent
// --- title: to 'show the name' of the app
// --- action items: some item icon with 'important action' (like search)
// --- overflow menu: put 'action' that 'not as important compared to' the one in 'action item'
// --- example: https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/original/academy/dos:b9955b35f934a7cbd84e9499a82351b120210917104559.png
// - ToolBar: 'alternatives' for ActionBar that has 'more control & flexibility', like maybe add app icon on the AppBar
// --- example: https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/original/academy/dos:e63cf273861f12ad6d46fc2d063d44f920210917110216.jpeg

// Usage of Navigation Drawer:
// - if the app has 'top level views' (has 'multiple' 'main menu' that has their own submenu)
// - if you want to 'give speed' to the 'user to access' 'all available menu'
// - if the app 'need to go back' to the 'main screen' 'fast'

// Bottom Navigation used when:
// - 'Feature of main menu' need to be 'accessed anywhere in the app'
// - There is only 3-5 menu
// - 'Device used' is only for 'phone & tab'

// TabLayout used when:
// - 'Feature' between 'menus' is 'familiar' & 'is within the same level'
// - 'Fast move' to 'another menu' via 'swipe'
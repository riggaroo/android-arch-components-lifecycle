# Android Architecture Components - LifecycleObserver Demo

A demo application showcasing the use of the new Android Architecture Components Lifecycle classes. 
In this example, a Lifecycle Aware Video Player is created based off the Exoplayer2 Sample app that can be found here: 
https://github.com/google/ExoPlayer/blob/release-v2/demo/src/main/java/com/google/android/exoplayer2/demo/


This version uses `LifecycleObserver` annotations which abstracts out the Video Player specific code into a `VideoPlayerComponent`.
This component is then aware of things such as when the activity is paused, resumed, stopped etc.

This repository is a demonstration of the Lifecycle APIs and how it can clean up your activities. 

**IMPORTANT NOTE**: This is not a full implementation for ExoPlayer to play all different kinds of content (DRM session management etc).
This is purely to demonstrate the power of a LifecycleObserver and how it can remove a lot of code from your activities.
Please refer to the above URL for a more complete example that takes care of more erroneous situations.

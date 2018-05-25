# Log Util

A simple android utility library to make your logging easy in your android app. this has features to use a custom tag for your so that you dont need to write teh log tag again and again. also this can be made different for the logs you want to assign different tag. you can just block the logs in release apk with a single flag.

## 1. Add to Gradle
### To Project Level Gradle
```ss
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### To app Level Gradle
```ss
dependencies {
	        implementation 'com.github.sagarnayak:LogUtil:1.0.1'
	}
```
## 2. Initialise
You can do the initialisation at the application class to keep it centralised. also this approach is good for using the dependency injection.
```ss
LogUtil.Builder builder = new LogUtil.Builder()
                .setCustomLogTag("Custom_Log_Tag")
                .setShouldHideLogInReleaseMode(true, BuildConfig.DEBUG);
LogUtil logUtil = builder.build();
```
## 3. Start Logging
you can do all levels of logging with the help of logV(), logD(), logI(), logW(), logE(), logA() meothods. all these meothds can either take you string log message or if you want you can send this message with a custom log tag.
### Normal Tag
```ss
logUtil.logD("Test debug log.");
```
### Log with custom Tag
```ss
logUtil.logD("CustomDebugTag","Test log with custom tag.");
```

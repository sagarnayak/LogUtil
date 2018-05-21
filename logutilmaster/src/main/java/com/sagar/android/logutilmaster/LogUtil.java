package com.sagar.android.logutilmaster;

import android.util.Log;

/**
 * created by SAGAR KUMAR NAYAK
 * this is a class for control all your log printing.
 * this can print log of any length.
 * with several log types.
 * can block logs in release apk.
 * <p>
 * the exposed methods are
 * {@link #logV(String)}
 * {@link #logV(String, String)}
 * {@link #logD(String)}
 * {@link #logD(String, String)}
 * {@link #logI(String)}
 * {@link #logI(String, String)}
 * {@link #logW(String)}
 * {@link #logW(String, String)}
 * {@link #logE(String)}
 * {@link #logE(String, String)}
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class LogUtil {

    /**
     * This is the custom log tag for the application. this tag will be used for whole application as
     * the log tag. you can change this as per your application.
     * unless you use a method that has a custom tag argument this tag will be used.
     * the methods those who will use this tag as log tag are
     * {@link #logV(String)}{@link #logD(String)}{@link #logI(String)}{@link #logW(String)}
     * {@link #logE(String)}
     * and the methods that will use the custom tag provided by the user are
     * {@link #logV(String, String)}{@link #logD(String, String)}{@link #logI(String, String)}
     * {@link #logW(String, String)}{@link #logE(String, String)}
     */
    private String LOG_TAG;

    /**
     * by default the class will not print any logs in release apk. and if you want to print logs
     * even in release apk then just make this value as TRUE. otherwise make it FALSE.
     */
    private boolean OVERRIDE_LOG_CONTROL;

    /**
     * this is the max length of the log after which the longer logs are split. log of any length
     * will be split into parts and printed.
     */
    private final int MAX_LOG_LENGTH = 1000;

    private boolean isRunningInDebugMode;

    @SuppressWarnings("WeakerAccess")
    public LogUtil(final Builder builder) {
        this.LOG_TAG = builder.customLogTag;
        this.OVERRIDE_LOG_CONTROL = builder.shouldHideLogInReleaseMode;
        this.isRunningInDebugMode = builder.isRunningInDebugMode;
    }

    /**
     * method to print a log with V TAG with custom tag
     *
     * @param message message to print
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logV(String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.v(LOG_TAG, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with D TAG with custom tag
     *
     * @param message message to print
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logD(String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.d(LOG_TAG, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with I TAG with custom tag
     *
     * @param message message to print
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logI(String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.i(LOG_TAG, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with W TAG with custom tag
     *
     * @param message message to print
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logW(String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.w(LOG_TAG, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with E TAG with custom tag
     *
     * @param message message to print
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logE(String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.e(LOG_TAG, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with V TAG with tag provided by user
     *
     * @param tag     Custom tag for log
     * @param message log message
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logV(String tag, String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.v(tag, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with D TAG with tag provided by user
     *
     * @param tag     Custom tag for log
     * @param message log message
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logD(String tag, String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.d(tag, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with I TAG with tag provided by user
     *
     * @param tag     Custom tag for log
     * @param message log message
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logI(String tag, String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.i(tag, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with W TAG with tag provided by user
     *
     * @param tag     Custom tag for log
     * @param message log message
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logW(String tag, String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.w(tag, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to print a log with E TAG with tag provided by user
     *
     * @param tag     Custom tag for log
     * @param message log message
     */
    @SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
    public void logE(String tag, String message) {
        if (isRunningInDebugMode || OVERRIDE_LOG_CONTROL)
            for (int i = 0; i <= message.length() / MAX_LOG_LENGTH; i++) {
                int start = i * MAX_LOG_LENGTH;
                int end = (i + 1) * MAX_LOG_LENGTH;
                end = end > message.length() ? message.length() : end;
                Log.e(tag, getFormattedString(message, i, start, end));
            }
    }

    /**
     * method to get the split log message with formatted string added.
     * the longer logs will be divided into splits of and passed into this
     * method. this method will add a identifier to the message to that it can be identified that
     * this is the part of previous log.
     *
     * @param msg   message to print
     * @param index index of split
     * @param start starting point of the split
     * @param end   end of split
     * @return formatted log message to print
     */
    private String getFormattedString(String msg, int index, int start, int end) {
        if (index > 0)
            return String.valueOf(
                    ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +
                            "Part " +
                            (index + 1) +
                            " of previous Log " +
                            "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<" +
                            "\n" +
                            msg.substring(start, end));
        else
            return (msg.substring(start, end));
    }

    /**
     * Builder class for LogUtil.
     */
    @SuppressWarnings("unused")
    public static class Builder {
        private String customLogTag = "LogUtil_TAG";
        private boolean isRunningInDebugMode = false;
        private boolean shouldHideLogInReleaseMode = false;

        public Builder() {
        }

        public Builder setCustomLogTag(String customLogTag) {
            this.customLogTag = customLogTag;
            return this;
        }

        public Builder setShouldHideLogInReleaseMode(boolean shouldHideLogInReleaseMode, boolean runningInDebugMode) {
            this.shouldHideLogInReleaseMode = shouldHideLogInReleaseMode;
            isRunningInDebugMode = runningInDebugMode;
            return this;
        }

        public LogUtil build() {
            return new LogUtil(this);
        }
    }
}

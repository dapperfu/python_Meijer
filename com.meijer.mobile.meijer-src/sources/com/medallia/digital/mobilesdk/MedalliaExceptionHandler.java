package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.text.TextUtils;
import com.fullstory.FS;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class MedalliaExceptionHandler implements Thread.UncaughtExceptionHandler {
    protected static final String CRASHES_FOLDER = ".crashes";
    private static final String FILE_NAME = "crash.txt";
    protected static final String FILE_PATH = ".crashes/crash.txt";
    private Thread.UncaughtExceptionHandler defaultExceptionHandler;
    private String filePath;
    private boolean isRegistered;

    MedalliaExceptionHandler(Context context) {
        if (context != null) {
            this.filePath = getPath(CRASHES_FOLDER, context);
        }
    }

    private String getPath(String str, Context context) {
        if (context == null) {
            return null;
        }
        return String.format("%s/%s", getSdkDirectoryPath(context), str);
    }

    private String getSdkDirectoryPath(Context context) {
        if (context == null) {
            return null;
        }
        return String.format("%s/%s", context.getFilesDir().getPath(), "medalliaDigitalSDK");
    }

    private String getStackTrace(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        String string = stringWriter.toString();
        printWriter.close();
        return string;
    }

    private void saveCrashReport(Throwable th2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("stacktrace", getStackTrace(th2));
            writeToFile(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    private void writeToFile(String str) throws IOException {
        if (TextUtils.isEmpty(FILE_NAME) || str == null || this.filePath == null) {
            return;
        }
        File file = new File(this.filePath + q2.f93563c + FILE_NAME);
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    protected boolean isRegistered() {
        return this.isRegistered;
    }

    protected void register() {
        if (this.isRegistered) {
            return;
        }
        this.isRegistered = true;
        this.defaultExceptionHandler = FS.getDefaultUncaughtExceptionHandler();
        FS.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) throws JSONException {
        saveCrashReport(th2);
        this.defaultExceptionHandler.uncaughtException(thread, th2);
    }

    protected void unregister() {
        if (this.isRegistered) {
            FS.setDefaultUncaughtExceptionHandler(this.defaultExceptionHandler);
            this.isRegistered = false;
        }
    }

    protected void updateFilePath(Context context) {
        if (context != null) {
            this.filePath = getPath(CRASHES_FOLDER, context);
        }
    }
}

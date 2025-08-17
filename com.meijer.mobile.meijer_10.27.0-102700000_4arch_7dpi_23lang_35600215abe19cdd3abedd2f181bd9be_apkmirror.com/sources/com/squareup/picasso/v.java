package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import com.fullstory.FS;
import java.io.File;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes11.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    static final StringBuilder f126609a = new StringBuilder();

    private static class d {
        static Downloader a(Context context) {
            return new n(context);
        }
    }

    private static class e extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            super.run();
        }

        public e(Runnable runnable) {
            super(runnable);
        }
    }

    static class f implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }

        f() {
        }
    }

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    @TargetApi(11)
    private static class b {
        static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    private static class c {
        static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) j(context, "activity");
        boolean z10 = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z10) {
            memoryClass = b.a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    static File d(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static Downloader e(Context context) {
        try {
            int i10 = hu.i.f136365A;
            return d.a(context);
        } catch (ClassNotFoundException unused) {
            return new u(context);
        }
    }

    static void f(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    static String h(com.squareup.picasso.c cVar) {
        return i(cVar, "");
    }

    static String i(com.squareup.picasso.c cVar, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        com.squareup.picasso.a aVarH = cVar.h();
        if (aVarH != null) {
            throw null;
        }
        List<com.squareup.picasso.a> listI = cVar.i();
        if (listI == null || listI.size() <= 0) {
            return sb2.toString();
        }
        if (aVarH != null) {
            sb2.append(", ");
        }
        listI.get(0).getClass();
        throw null;
    }

    static void n(String str, String str2, String str3) {
        o(str, str2, str3, "");
    }

    static void o(String str, String str2, String str3, String str4) {
        FS.log_d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    static long a(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (statFs.getBlockCount() * statFs.getBlockSize()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), 5242880L);
    }

    static void c() {
        if (m()) {
        } else {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static int g(Bitmap bitmap) {
        int iA = c.a(bitmap);
        if (iA >= 0) {
            return iA;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static <T> T j(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    static boolean k(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    static boolean l(Context context) {
        if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    static boolean m() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}

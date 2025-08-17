package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.f;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ProfileInstallerInitializer implements D4.a<b> {

    public static class b {
    }

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: p4.e
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                f.h(context);
            }
        });
    }

    @Override // D4.a
    public List<Class<? extends D4.a<?>>> b() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: p4.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.h(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @Override // D4.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b a(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: p4.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f155484a.g(applicationContext);
            }
        });
        return new b();
    }
}

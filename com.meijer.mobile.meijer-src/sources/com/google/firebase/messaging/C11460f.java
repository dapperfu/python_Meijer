package com.google.firebase.messaging;

import Vd.C5519m;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.m;
import com.fullstory.FS;
import com.google.firebase.messaging.C11458d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C11460f {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f89753a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f89754b;

    /* renamed from: c, reason: collision with root package name */
    private final L f89755c;

    private void c(C11458d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f89754b.getSystemService("notification")).notify(aVar.f89742b, aVar.f89743c, aVar.f89741a.c());
    }

    private boolean b() {
        if (((KeyguardManager) this.f89754b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.n.d()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f89754b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private H d() {
        H hD = H.d(this.f89755c.p("gcm.n.image"));
        if (hD != null) {
            hD.h(this.f89753a);
        }
        return hD;
    }

    private void e(m.e eVar, H h10) {
        if (h10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C5519m.b(h10.g(), 5L, TimeUnit.SECONDS);
            eVar.q(bitmap);
            eVar.A(new m.b().j(bitmap).h(null));
        } catch (InterruptedException unused) {
            FS.log_w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            h10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            FS.log_w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            FS.log_w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            h10.close();
        }
    }

    boolean a() throws PackageManager.NameNotFoundException {
        if (this.f89755c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        H hD = d();
        C11458d.a aVarE = C11458d.e(this.f89754b, this.f89755c);
        e(aVarE.f89741a, hD);
        c(aVarE);
        return true;
    }

    public C11460f(Context context, L l10, ExecutorService executorService) {
        this.f89753a = executorService;
        this.f89754b = context;
        this.f89755c = l10;
    }
}

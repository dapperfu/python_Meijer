package com.google.firebase.messaging;

import Td.C5235m;
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
import com.google.firebase.messaging.C11333d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C11335f {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f88922a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f88923b;

    /* renamed from: c, reason: collision with root package name */
    private final J f88924c;

    private void c(C11333d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f88923b.getSystemService("notification")).notify(aVar.f88905b, aVar.f88906c, aVar.f88904a.c());
    }

    private boolean b() {
        if (((KeyguardManager) this.f88923b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.n.d()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f88923b.getSystemService("activity")).getRunningAppProcesses();
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

    private F d() {
        F fD = F.d(this.f88924c.p("gcm.n.image"));
        if (fD != null) {
            fD.h(this.f88922a);
        }
        return fD;
    }

    private void e(m.e eVar, F f10) {
        if (f10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C5235m.b(f10.g(), 5L, TimeUnit.SECONDS);
            eVar.q(bitmap);
            eVar.A(new m.b().j(bitmap).h(null));
        } catch (InterruptedException unused) {
            FS.log_w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            f10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            FS.log_w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            FS.log_w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            f10.close();
        }
    }

    boolean a() throws PackageManager.NameNotFoundException {
        if (this.f88924c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        F fD = d();
        C11333d.a aVarE = C11333d.e(this.f88923b, this.f88924c);
        e(aVarE.f88904a, fD);
        c(aVarE);
        return true;
    }

    public C11335f(Context context, J j10, ExecutorService executorService) {
        this.f88922a = executorService;
        this.f88923b = context;
        this.f88924c = j10;
    }
}

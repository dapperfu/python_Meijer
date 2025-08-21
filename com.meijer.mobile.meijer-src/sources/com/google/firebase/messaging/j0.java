package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class j0 {

    /* renamed from: a, reason: collision with root package name */
    static final long f89789a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f89790b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Ud.a f89791c;

    private static void b(Context context) {
        if (f89791c == null) {
            Ud.a aVar = new Ud.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f89791c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f89790b) {
            try {
                if (f89791c != null && d(intent)) {
                    f(intent, false);
                    f89791c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    @SuppressLint({"TaskMainThread"})
    static void e(Context context, o0 o0Var, final Intent intent) {
        synchronized (f89790b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f89791c.a(f89789a);
                }
                o0Var.d(intent).c(new InterfaceC5511e() { // from class: com.google.firebase.messaging.i0
                    @Override // Vd.InterfaceC5511e
                    public final void onComplete(AbstractC5516j abstractC5516j) {
                        j0.c(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void f(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    static ComponentName g(Context context, Intent intent) {
        synchronized (f89790b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f89791c.a(f89789a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

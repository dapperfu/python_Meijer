package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
final class h0 {

    /* renamed from: a, reason: collision with root package name */
    static final long f88941a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f88942b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Sd.a f88943c;

    private static void b(Context context) {
        if (f88943c == null) {
            Sd.a aVar = new Sd.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f88943c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f88942b) {
            try {
                if (f88943c != null && d(intent)) {
                    f(intent, false);
                    f88943c.c();
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
    static void e(Context context, m0 m0Var, final Intent intent) {
        synchronized (f88942b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f88943c.a(f88941a);
                }
                m0Var.d(intent).c(new InterfaceC5227e() { // from class: com.google.firebase.messaging.g0
                    @Override // Td.InterfaceC5227e
                    public final void onComplete(AbstractC5232j abstractC5232j) {
                        h0.c(intent);
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
        synchronized (f88942b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f88943c.a(f88941a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

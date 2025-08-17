package com.google.firebase.messaging;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.fullstory.FS;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C11343n {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f88962c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static m0 f88963d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f88964a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f88965b = new androidx.privacysandbox.ads.adservices.measurement.k();

    public static /* synthetic */ Integer c(AbstractC5232j abstractC5232j) {
        return -1;
    }

    private static AbstractC5232j<Integer> e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Binding to service");
        }
        m0 m0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return m0VarF.d(intent).j(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5225c() { // from class: com.google.firebase.messaging.m
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    return C11343n.c(abstractC5232j);
                }
            });
        }
        if (W.b().e(context)) {
            h0.e(context, m0VarF, intent);
        } else {
            m0VarF.d(intent);
        }
        return C5235m.f(-1);
    }

    public static /* synthetic */ Integer d(AbstractC5232j abstractC5232j) {
        return 403;
    }

    private static m0 f(Context context, String str) {
        m0 m0Var;
        synchronized (f88962c) {
            try {
                if (f88963d == null) {
                    f88963d = new m0(context, str);
                }
                m0Var = f88963d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m0Var;
    }

    public AbstractC5232j<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f88964a, intent);
    }

    public C11343n(Context context) {
        this.f88964a = context;
    }

    public static /* synthetic */ AbstractC5232j a(Context context, Intent intent, boolean z10, AbstractC5232j abstractC5232j) {
        if (com.google.android.gms.common.util.n.g() && ((Integer) abstractC5232j.n()).intValue() == 402) {
            return e(context, intent, z10).j(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5225c() { // from class: com.google.firebase.messaging.l
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j2) {
                    return C11343n.d(abstractC5232j2);
                }
            });
        }
        return abstractC5232j;
    }

    @SuppressLint({"InlinedApi"})
    public AbstractC5232j<Integer> h(final Context context, final Intent intent) {
        boolean z10;
        final boolean z11 = false;
        if (com.google.android.gms.common.util.n.g() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return e(context, intent, z11);
        }
        return C5235m.c(this.f88965b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(W.b().g(context, intent));
            }
        }).l(this.f88965b, new InterfaceC5225c() { // from class: com.google.firebase.messaging.k
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                return C11343n.a(context, intent, z11, abstractC5232j);
            }
        });
    }
}

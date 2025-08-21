package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.fullstory.FS;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C11468n {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f89798c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static o0 f89799d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f89800a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f89801b = new androidx.privacysandbox.ads.adservices.measurement.k();

    public static /* synthetic */ Integer c(AbstractC5516j abstractC5516j) {
        return -1;
    }

    private static AbstractC5516j<Integer> e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Binding to service");
        }
        o0 o0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return o0VarF.d(intent).j(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5509c() { // from class: com.google.firebase.messaging.m
                @Override // Vd.InterfaceC5509c
                public final Object then(AbstractC5516j abstractC5516j) {
                    return C11468n.c(abstractC5516j);
                }
            });
        }
        if (Y.b().e(context)) {
            j0.e(context, o0VarF, intent);
        } else {
            o0VarF.d(intent);
        }
        return C5519m.f(-1);
    }

    public static /* synthetic */ Integer d(AbstractC5516j abstractC5516j) {
        return 403;
    }

    private static o0 f(Context context, String str) {
        o0 o0Var;
        synchronized (f89798c) {
            try {
                if (f89799d == null) {
                    f89799d = new o0(context, str);
                }
                o0Var = f89799d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o0Var;
    }

    public AbstractC5516j<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f89800a, intent);
    }

    public C11468n(Context context) {
        this.f89800a = context;
    }

    public static /* synthetic */ AbstractC5516j a(Context context, Intent intent, boolean z10, AbstractC5516j abstractC5516j) {
        if (com.google.android.gms.common.util.n.g() && ((Integer) abstractC5516j.n()).intValue() == 402) {
            return e(context, intent, z10).j(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5509c() { // from class: com.google.firebase.messaging.l
                @Override // Vd.InterfaceC5509c
                public final Object then(AbstractC5516j abstractC5516j2) {
                    return C11468n.d(abstractC5516j2);
                }
            });
        }
        return abstractC5516j;
    }

    @SuppressLint({"InlinedApi"})
    public AbstractC5516j<Integer> h(final Context context, final Intent intent) {
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
        return C5519m.c(this.f89801b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(Y.b().g(context, intent));
            }
        }).l(this.f89801b, new InterfaceC5509c() { // from class: com.google.firebase.messaging.k
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) {
                return C11468n.a(context, intent, z11, abstractC5516j);
            }
        });
    }
}

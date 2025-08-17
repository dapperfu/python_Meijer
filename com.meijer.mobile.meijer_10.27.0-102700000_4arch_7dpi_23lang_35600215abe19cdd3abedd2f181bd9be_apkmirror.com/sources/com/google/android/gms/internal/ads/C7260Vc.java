package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7260Vc {

    /* renamed from: a, reason: collision with root package name */
    private C6854Jc f70891a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f70892b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f70893c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f70894d = new Object();

    C7260Vc(Context context) {
        this.f70893c = context;
    }

    static /* bridge */ /* synthetic */ void e(C7260Vc c7260Vc) {
        synchronized (c7260Vc.f70894d) {
            try {
                C6854Jc c6854Jc = c7260Vc.f70891a;
                if (c6854Jc == null) {
                    return;
                }
                c6854Jc.disconnect();
                c7260Vc.f70891a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final Future c(C6888Kc c6888Kc) {
        C7023Oc c7023Oc = new C7023Oc(this);
        C7193Tc c7193Tc = new C7193Tc(this, c6888Kc, c7023Oc);
        C7227Uc c7227Uc = new C7227Uc(this, c7023Oc);
        synchronized (this.f70894d) {
            C6854Jc c6854Jc = new C6854Jc(this.f70893c, Lc.v.x().b(), c7193Tc, c7227Uc);
            this.f70891a = c6854Jc;
            c6854Jc.checkAvailabilityAndConnect();
        }
        return c7023Oc;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7385Vc {

    /* renamed from: a, reason: collision with root package name */
    private C6979Jc f71731a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f71732b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f71733c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f71734d = new Object();

    C7385Vc(Context context) {
        this.f71733c = context;
    }

    static /* bridge */ /* synthetic */ void e(C7385Vc c7385Vc) {
        synchronized (c7385Vc.f71734d) {
            try {
                C6979Jc c6979Jc = c7385Vc.f71731a;
                if (c6979Jc == null) {
                    return;
                }
                c6979Jc.disconnect();
                c7385Vc.f71731a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final Future c(C7013Kc c7013Kc) {
        C7148Oc c7148Oc = new C7148Oc(this);
        C7318Tc c7318Tc = new C7318Tc(this, c7013Kc, c7148Oc);
        C7352Uc c7352Uc = new C7352Uc(this, c7148Oc);
        synchronized (this.f71734d) {
            C6979Jc c6979Jc = new C6979Jc(this.f71733c, Nc.v.x().b(), c7318Tc, c7352Uc);
            this.f71731a = c6979Jc;
            c6979Jc.checkAvailabilityAndConnect();
        }
        return c7148Oc;
    }
}

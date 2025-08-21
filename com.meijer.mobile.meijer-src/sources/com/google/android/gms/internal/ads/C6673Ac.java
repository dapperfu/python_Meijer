package com.google.android.gms.internal.ads;

import Ic.a;
import Oc.C4393f1;
import Oc.C4447y;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6673Ac {

    /* renamed from: a, reason: collision with root package name */
    private Oc.V f65983a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f65984b;

    /* renamed from: c, reason: collision with root package name */
    private final String f65985c;

    /* renamed from: d, reason: collision with root package name */
    private final C4393f1 f65986d;

    /* renamed from: e, reason: collision with root package name */
    private final int f65987e;

    /* renamed from: f, reason: collision with root package name */
    private final a.AbstractC0230a f65988f;

    /* renamed from: g, reason: collision with root package name */
    private final BinderC10186yl f65989g = new BinderC10186yl();

    /* renamed from: h, reason: collision with root package name */
    private final Oc.c2 f65990h = Oc.c2.f23399a;

    public C6673Ac(Context context, String str, C4393f1 c4393f1, int i10, a.AbstractC0230a abstractC0230a) {
        this.f65984b = context;
        this.f65985c = str;
        this.f65986d = c4393f1;
        this.f65987e = i10;
        this.f65988f = abstractC0230a;
    }

    public final void a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Oc.V vD = C4447y.a().d(this.f65984b, Oc.d2.T(), this.f65985c, this.f65989g);
            this.f65983a = vD;
            if (vD != null) {
                if (this.f65987e != 3) {
                    this.f65983a.G5(new Oc.j2(this.f65987e));
                }
                this.f65986d.o(jCurrentTimeMillis);
                this.f65983a.V4(new BinderC8778lc(this.f65988f, this.f65985c));
                this.f65983a.W7(this.f65990h.a(this.f65984b, this.f65986d));
            }
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }
}

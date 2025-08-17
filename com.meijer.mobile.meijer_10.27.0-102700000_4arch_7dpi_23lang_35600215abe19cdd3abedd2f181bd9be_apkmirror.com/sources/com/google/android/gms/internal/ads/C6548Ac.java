package com.google.android.gms.internal.ads;

import Gc.a;
import Mc.C4115f1;
import Mc.C4169y;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6548Ac {

    /* renamed from: a, reason: collision with root package name */
    private Mc.V f65143a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f65144b;

    /* renamed from: c, reason: collision with root package name */
    private final String f65145c;

    /* renamed from: d, reason: collision with root package name */
    private final C4115f1 f65146d;

    /* renamed from: e, reason: collision with root package name */
    private final int f65147e;

    /* renamed from: f, reason: collision with root package name */
    private final a.AbstractC0161a f65148f;

    /* renamed from: g, reason: collision with root package name */
    private final BinderC10061yl f65149g = new BinderC10061yl();

    /* renamed from: h, reason: collision with root package name */
    private final Mc.c2 f65150h = Mc.c2.f19212a;

    public C6548Ac(Context context, String str, C4115f1 c4115f1, int i10, a.AbstractC0161a abstractC0161a) {
        this.f65144b = context;
        this.f65145c = str;
        this.f65146d = c4115f1;
        this.f65147e = i10;
        this.f65148f = abstractC0161a;
    }

    public final void a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Mc.V vD = C4169y.a().d(this.f65144b, Mc.d2.T(), this.f65145c, this.f65149g);
            this.f65143a = vD;
            if (vD != null) {
                if (this.f65147e != 3) {
                    this.f65143a.R6(new Mc.j2(this.f65147e));
                }
                this.f65146d.o(jCurrentTimeMillis);
                this.f65143a.K4(new BinderC8653lc(this.f65148f, this.f65145c));
                this.f65143a.H4(this.f65150h.a(this.f65144b, this.f65146d));
            }
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }
}

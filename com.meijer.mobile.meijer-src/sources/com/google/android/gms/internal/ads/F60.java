package com.google.android.gms.internal.ads;

import Oc.C4447y;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class F60 {

    /* renamed from: a, reason: collision with root package name */
    private final Z50 f67578a;

    /* renamed from: b, reason: collision with root package name */
    private final C7773c60 f67579b;

    /* renamed from: c, reason: collision with root package name */
    private final R90 f67580c;

    /* renamed from: d, reason: collision with root package name */
    private final H90 f67581d;

    /* renamed from: e, reason: collision with root package name */
    private final W80 f67582e;

    /* renamed from: f, reason: collision with root package name */
    private final C8394hx f67583f;

    public F60(R90 r90, H90 h90, Z50 z50, C7773c60 c7773c60, C8394hx c8394hx, W80 w80) {
        this.f67578a = z50;
        this.f67579b = c7773c60;
        this.f67580c = r90;
        this.f67581d = h90;
        this.f67583f = c8394hx;
        this.f67582e = w80;
    }

    public final void b(String str, int i10) {
        Z50 z50 = this.f67578a;
        if (z50.f72878i0) {
            this.f67581d.a(str, this.f67579b.f73943b, i10);
            return;
        }
        this.f67580c.d(str, z50.f72908x0, this.f67582e);
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), 2);
        }
    }

    public final void c(List list, int i10) {
        com.google.common.util.concurrent.q qVarH;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) Oc.A.c().a(C8784lf.f77016U9)).booleanValue() && C8394hx.j(str)) {
                qVarH = this.f67583f.b(str, C4447y.e());
            } else {
                qVarH = Mj0.h(str);
            }
            Mj0.r(qVarH, new E60(this, i10), C7033Kq.f69014a);
        }
    }
}

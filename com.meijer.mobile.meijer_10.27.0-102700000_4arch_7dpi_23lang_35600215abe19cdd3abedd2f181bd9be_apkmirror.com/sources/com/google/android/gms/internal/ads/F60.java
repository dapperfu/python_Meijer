package com.google.android.gms.internal.ads;

import Mc.C4169y;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class F60 {

    /* renamed from: a, reason: collision with root package name */
    private final Z50 f66738a;

    /* renamed from: b, reason: collision with root package name */
    private final C7648c60 f66739b;

    /* renamed from: c, reason: collision with root package name */
    private final R90 f66740c;

    /* renamed from: d, reason: collision with root package name */
    private final H90 f66741d;

    /* renamed from: e, reason: collision with root package name */
    private final W80 f66742e;

    /* renamed from: f, reason: collision with root package name */
    private final C8269hx f66743f;

    public F60(R90 r90, H90 h90, Z50 z50, C7648c60 c7648c60, C8269hx c8269hx, W80 w80) {
        this.f66738a = z50;
        this.f66739b = c7648c60;
        this.f66740c = r90;
        this.f66741d = h90;
        this.f66743f = c8269hx;
        this.f66742e = w80;
    }

    public final void b(String str, int i10) {
        Z50 z50 = this.f66738a;
        if (z50.f72038i0) {
            this.f66741d.a(str, this.f66739b.f73103b, i10);
            return;
        }
        this.f66740c.d(str, z50.f72068x0, this.f66742e);
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
            if (((Boolean) Mc.A.c().a(C8659lf.f76176U9)).booleanValue() && C8269hx.j(str)) {
                qVarH = this.f66743f.b(str, C4169y.e());
            } else {
                qVarH = Mj0.h(str);
            }
            Mj0.r(qVarH, new E60(this, i10), C6908Kq.f68174a);
        }
    }
}

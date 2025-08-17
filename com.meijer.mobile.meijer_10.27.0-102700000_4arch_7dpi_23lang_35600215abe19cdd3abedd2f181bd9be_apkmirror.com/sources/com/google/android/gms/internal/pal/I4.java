package com.google.android.gms.internal.pal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class I4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final View f82652i;

    public I4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, View view) {
        super(x32, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", ya2, i10, 57);
        this.f82652i = view;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f82652i != null) {
            Boolean bool = (Boolean) C10593a5.c().b(C10854q5.f83322D2);
            Boolean bool2 = (Boolean) C10593a5.c().b(C10854q5.f83318C8);
            C10609b4 c10609b4 = new C10609b4((String) this.f82744f.invoke(null, this.f82652i, this.f82740b.b().getResources().getDisplayMetrics(), bool, bool2));
            C0 c0T = C10589a1.t();
            c0T.n(c10609b4.f83059b.longValue());
            c0T.p(c10609b4.f83060c.longValue());
            c0T.q(c10609b4.f83061d.longValue());
            if (bool2.booleanValue()) {
                c0T.o(c10609b4.f83063f.longValue());
            }
            if (bool.booleanValue()) {
                c0T.m(c10609b4.f83062e.longValue());
            }
            this.f82743e.Q((C10589a1) c0T.j());
        }
    }
}

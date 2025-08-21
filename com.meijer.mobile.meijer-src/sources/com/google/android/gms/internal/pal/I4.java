package com.google.android.gms.internal.pal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class I4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final View f83492i;

    public I4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, View view) {
        super(x32, "xcWDoPM3ZfO4P10VSUmZKRTMvsXPXnglJL31bwAJBgJGdSUy2IQG17s4MILOncV2", "9rXsTdb/WXYONX554dN5CJ2eqpcy9gFPMPi8uAjaHTA=", ya2, i10, 57);
        this.f83492i = view;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f83492i != null) {
            Boolean bool = (Boolean) C10718a5.c().b(C10979q5.f84162D2);
            Boolean bool2 = (Boolean) C10718a5.c().b(C10979q5.f84158C8);
            C10734b4 c10734b4 = new C10734b4((String) this.f83584f.invoke(null, this.f83492i, this.f83580b.b().getResources().getDisplayMetrics(), bool, bool2));
            C0 c0T = C10714a1.t();
            c0T.n(c10734b4.f83899b.longValue());
            c0T.p(c10734b4.f83900c.longValue());
            c0T.q(c10734b4.f83901d.longValue());
            if (bool2.booleanValue()) {
                c0T.o(c10734b4.f83903f.longValue());
            }
            if (bool.booleanValue()) {
                c0T.m(c10734b4.f83902e.longValue());
            }
            this.f83583e.Q((C10714a1) c0T.j());
        }
    }
}

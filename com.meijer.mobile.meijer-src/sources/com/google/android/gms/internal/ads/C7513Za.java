package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Za, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7513Za extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final View f73044h;

    public C7513Za(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, View view) {
        super(c8988na, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", c8736l8, i10, 57);
        this.f73044h = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f73044h != null) {
            Boolean bool = (Boolean) Oc.A.c().a(C8784lf.f77429y3);
            Boolean bool2 = (Boolean) Oc.A.c().a(C8784lf.f76961Qa);
            C9415ra c9415ra = new C9415ra((String) this.f74045e.invoke(null, this.f73044h, this.f74041a.b().getResources().getDisplayMetrics(), bool, bool2));
            F8 f8B0 = G8.b0();
            f8B0.v(c9415ra.f78880b.longValue());
            f8B0.x(c9415ra.f78881c.longValue());
            f8B0.y(c9415ra.f78882d.longValue());
            if (bool2.booleanValue()) {
                f8B0.w(c9415ra.f78884f.longValue());
            }
            if (bool.booleanValue()) {
                f8B0.u(c9415ra.f78883e.longValue());
            }
            this.f74044d.W((G8) f8B0.p());
        }
    }
}

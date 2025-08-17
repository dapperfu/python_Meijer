package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Za, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7388Za extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final View f72204h;

    public C7388Za(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, View view) {
        super(c8863na, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", c8611l8, i10, 57);
        this.f72204h = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f72204h != null) {
            Boolean bool = (Boolean) Mc.A.c().a(C8659lf.f76589y3);
            Boolean bool2 = (Boolean) Mc.A.c().a(C8659lf.f76121Qa);
            C9290ra c9290ra = new C9290ra((String) this.f73205e.invoke(null, this.f72204h, this.f73201a.b().getResources().getDisplayMetrics(), bool, bool2));
            F8 f8B0 = G8.b0();
            f8B0.v(c9290ra.f78040b.longValue());
            f8B0.x(c9290ra.f78041c.longValue());
            f8B0.y(c9290ra.f78042d.longValue());
            if (bool2.booleanValue()) {
                f8B0.w(c9290ra.f78044f.longValue());
            }
            if (bool.booleanValue()) {
                f8B0.u(c9290ra.f78043e.longValue());
            }
            this.f73204d.W((G8) f8B0.p());
        }
    }
}

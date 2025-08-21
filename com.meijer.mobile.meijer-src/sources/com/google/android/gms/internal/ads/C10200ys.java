package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ys, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10200ys extends AbstractC9772us {
    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final void b() {
    }

    public C10200ys(InterfaceC6932Hr interfaceC6932Hr) {
        super(interfaceC6932Hr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final boolean n(String str) {
        String strH = Sc.g.h(str);
        InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) this.f79775c.get();
        if (interfaceC6932Hr != null && strH != null) {
            interfaceC6932Hr.D(strH, this);
        }
        Sc.p.g("VideoStreamNoopCache is doing nothing.");
        d(str, strH, "noop", "Noop cache is a noop.");
        return false;
    }
}

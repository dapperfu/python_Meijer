package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ys, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10075ys extends AbstractC9647us {
    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final void b() {
    }

    public C10075ys(InterfaceC6807Hr interfaceC6807Hr) {
        super(interfaceC6807Hr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final boolean n(String str) {
        String strH = Qc.g.h(str);
        InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) this.f78935c.get();
        if (interfaceC6807Hr != null && strH != null) {
            interfaceC6807Hr.D(strH, this);
        }
        Qc.p.g("VideoStreamNoopCache is doing nothing.");
        d(str, strH, "noop", "Noop cache is a noop.");
        return false;
    }
}

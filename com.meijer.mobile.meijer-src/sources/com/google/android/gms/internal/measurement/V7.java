package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class V7 extends AbstractC10569k {

    /* renamed from: c, reason: collision with root package name */
    private final A7 f82918c;

    @Override // com.google.android.gms.internal.measurement.AbstractC10569k
    public final InterfaceC10623q b(U1 u12, List list) {
        return InterfaceC10623q.f83182i3;
    }

    final /* synthetic */ A7 d() {
        return this.f82918c;
    }

    public V7(A7 a72) {
        super("internal.logger");
        this.f82918c = a72;
        this.f83068b.put("log", new U7(this, false, true));
        this.f83068b.put("silent", new C10701y6(this, "silent"));
        ((AbstractC10569k) this.f83068b.get("silent")).e("log", new U7(this, true, true));
        this.f83068b.put("unmonitored", new Z6(this, "unmonitored"));
        ((AbstractC10569k) this.f83068b.get("unmonitored")).e("log", new U7(this, false, false));
    }
}

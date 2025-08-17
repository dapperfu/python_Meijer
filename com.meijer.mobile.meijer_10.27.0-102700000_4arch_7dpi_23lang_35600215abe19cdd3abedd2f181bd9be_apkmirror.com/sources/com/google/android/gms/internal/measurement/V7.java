package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class V7 extends AbstractC10444k {

    /* renamed from: c, reason: collision with root package name */
    private final A7 f82078c;

    @Override // com.google.android.gms.internal.measurement.AbstractC10444k
    public final InterfaceC10498q b(U1 u12, List list) {
        return InterfaceC10498q.f82342i3;
    }

    final /* synthetic */ A7 d() {
        return this.f82078c;
    }

    public V7(A7 a72) {
        super("internal.logger");
        this.f82078c = a72;
        this.f82228b.put("log", new U7(this, false, true));
        this.f82228b.put("silent", new C10576y6(this, "silent"));
        ((AbstractC10444k) this.f82228b.get("silent")).e("log", new U7(this, true, true));
        this.f82228b.put("unmonitored", new Z6(this, "unmonitored"));
        ((AbstractC10444k) this.f82228b.get("unmonitored")).e("log", new U7(this, false, false));
    }
}

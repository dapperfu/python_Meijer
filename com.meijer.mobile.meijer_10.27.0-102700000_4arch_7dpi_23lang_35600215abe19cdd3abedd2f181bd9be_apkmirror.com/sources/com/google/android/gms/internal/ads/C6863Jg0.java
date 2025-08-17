package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6863Jg0 extends AbstractC9945xg0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f67951a;

    /* renamed from: b, reason: collision with root package name */
    private int f67952b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6964Mg0 f67953c;

    @Override // com.google.android.gms.internal.ads.AbstractC9945xg0, java.util.Map.Entry
    public final Object getKey() {
        return this.f67951a;
    }

    C6863Jg0(C6964Mg0 c6964Mg0, int i10) {
        this.f67953c = c6964Mg0;
        this.f67951a = C6964Mg0.k(c6964Mg0, i10);
        this.f67952b = i10;
    }

    private final void a() {
        int i10 = this.f67952b;
        if (i10 == -1 || i10 >= this.f67953c.size() || !C6555Af0.a(this.f67951a, C6964Mg0.k(this.f67953c, this.f67952b))) {
            this.f67952b = this.f67953c.I(this.f67951a);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9945xg0, java.util.Map.Entry
    public final Object getValue() {
        Map mapV = this.f67953c.v();
        if (mapV != null) {
            return mapV.get(this.f67951a);
        }
        a();
        int i10 = this.f67952b;
        if (i10 == -1) {
            return null;
        }
        return C6964Mg0.r(this.f67953c, i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapV = this.f67953c.v();
        if (mapV != null) {
            return mapV.put(this.f67951a, obj);
        }
        a();
        int i10 = this.f67952b;
        if (i10 == -1) {
            this.f67953c.put(this.f67951a, obj);
            return null;
        }
        C6964Mg0 c6964Mg0 = this.f67953c;
        Object objR = C6964Mg0.r(c6964Mg0, i10);
        C6964Mg0.y(c6964Mg0, this.f67952b, obj);
        return objR;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6988Jg0 extends AbstractC10070xg0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f68791a;

    /* renamed from: b, reason: collision with root package name */
    private int f68792b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7089Mg0 f68793c;

    @Override // com.google.android.gms.internal.ads.AbstractC10070xg0, java.util.Map.Entry
    public final Object getKey() {
        return this.f68791a;
    }

    C6988Jg0(C7089Mg0 c7089Mg0, int i10) {
        this.f68793c = c7089Mg0;
        this.f68791a = C7089Mg0.k(c7089Mg0, i10);
        this.f68792b = i10;
    }

    private final void a() {
        int i10 = this.f68792b;
        if (i10 == -1 || i10 >= this.f68793c.size() || !C6680Af0.a(this.f68791a, C7089Mg0.k(this.f68793c, this.f68792b))) {
            this.f68792b = this.f68793c.I(this.f68791a);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10070xg0, java.util.Map.Entry
    public final Object getValue() {
        Map mapT = this.f68793c.t();
        if (mapT != null) {
            return mapT.get(this.f68791a);
        }
        a();
        int i10 = this.f68792b;
        if (i10 == -1) {
            return null;
        }
        return C7089Mg0.r(this.f68793c, i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapT = this.f68793c.t();
        if (mapT != null) {
            return mapT.put(this.f68791a, obj);
        }
        a();
        int i10 = this.f68792b;
        if (i10 == -1) {
            this.f68793c.put(this.f68791a, obj);
            return null;
        }
        C7089Mg0 c7089Mg0 = this.f68793c;
        Object objR = C7089Mg0.r(c7089Mg0, i10);
        C7089Mg0.x(c7089Mg0, this.f68792b, obj);
        return objR;
    }
}

package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class Cv0 extends St0 {

    /* renamed from: a, reason: collision with root package name */
    final Ev0 f66083a;

    /* renamed from: b, reason: collision with root package name */
    Ut0 f66084b = a();

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Gv0 f66085c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f66084b != null;
    }

    Cv0(Gv0 gv0) {
        this.f66085c = gv0;
        this.f66083a = new Ev0(gv0, null);
    }

    private final Ut0 a() {
        Ev0 ev0 = this.f66083a;
        if (ev0.hasNext()) {
            return ev0.next().iterator();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ut0
    public final byte zza() {
        Ut0 ut0 = this.f66084b;
        if (ut0 == null) {
            throw new NoSuchElementException();
        }
        byte bZza = ut0.zza();
        if (!this.f66084b.hasNext()) {
            this.f66084b = a();
        }
        return bZza;
    }
}

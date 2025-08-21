package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.A7;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class J2 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P2 f85912a;

    @Override // com.google.android.gms.internal.measurement.A7
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        int i11 = i10 - 1;
        C11329o2 c11329o2S = i11 != 0 ? i11 != 1 ? i11 != 3 ? i11 != 4 ? this.f85912a.f85708a.a().s() : z10 ? this.f85912a.f85708a.a().q() : !z11 ? this.f85912a.f85708a.a().r() : this.f85912a.f85708a.a().p() : this.f85912a.f85708a.a().u() : z10 ? this.f85912a.f85708a.a().n() : !z11 ? this.f85912a.f85708a.a().o() : this.f85912a.f85708a.a().m() : this.f85912a.f85708a.a().t();
        int size = list.size();
        if (size == 1) {
            c11329o2S.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c11329o2S.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c11329o2S.a(str);
        } else {
            c11329o2S.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    J2(P2 p22) {
        Objects.requireNonNull(p22);
        this.f85912a = p22;
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.A7;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class J2 implements A7 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ P2 f85072a;

    @Override // com.google.android.gms.internal.measurement.A7
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        int i11 = i10 - 1;
        C11204o2 c11204o2S = i11 != 0 ? i11 != 1 ? i11 != 3 ? i11 != 4 ? this.f85072a.f84868a.a().s() : z10 ? this.f85072a.f84868a.a().q() : !z11 ? this.f85072a.f84868a.a().r() : this.f85072a.f84868a.a().p() : this.f85072a.f84868a.a().u() : z10 ? this.f85072a.f84868a.a().n() : !z11 ? this.f85072a.f84868a.a().o() : this.f85072a.f84868a.a().m() : this.f85072a.f84868a.a().t();
        int size = list.size();
        if (size == 1) {
            c11204o2S.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c11204o2S.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c11204o2S.a(str);
        } else {
            c11204o2S.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    J2(P2 p22) {
        Objects.requireNonNull(p22);
        this.f85072a = p22;
    }
}

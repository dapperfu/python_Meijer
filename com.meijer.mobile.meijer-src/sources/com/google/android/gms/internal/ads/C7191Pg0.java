package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Pg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7191Pg0 extends AbstractC7327Tg0 {
    C7191Pg0() {
        super(null);
    }

    static final AbstractC7327Tg0 j(int i10) {
        return i10 < 0 ? AbstractC7327Tg0.f71273b : i10 > 0 ? AbstractC7327Tg0.f71274c : AbstractC7327Tg0.f71272a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7327Tg0
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7327Tg0
    public final AbstractC7327Tg0 b(int i10, int i11) {
        return j(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7327Tg0
    public final AbstractC7327Tg0 c(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7327Tg0
    public final AbstractC7327Tg0 d(boolean z10, boolean z11) {
        return j(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7327Tg0
    public final AbstractC7327Tg0 e(boolean z10, boolean z11) {
        return j(Boolean.compare(z11, z10));
    }
}

package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8334ic implements Comparator {
    public C8334ic(C8439jc c8439jc) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C7324Xb c7324Xb = (C7324Xb) obj;
        C7324Xb c7324Xb2 = (C7324Xb) obj2;
        if (c7324Xb.d() < c7324Xb2.d()) {
            return -1;
        }
        if (c7324Xb.d() > c7324Xb2.d()) {
            return 1;
        }
        if (c7324Xb.b() < c7324Xb2.b()) {
            return -1;
        }
        if (c7324Xb.b() > c7324Xb2.b()) {
            return 1;
        }
        float fA = (c7324Xb.a() - c7324Xb.d()) * (c7324Xb.c() - c7324Xb.b());
        float fA2 = (c7324Xb2.a() - c7324Xb2.d()) * (c7324Xb2.c() - c7324Xb2.b());
        if (fA > fA2) {
            return -1;
        }
        return fA < fA2 ? 1 : 0;
    }
}

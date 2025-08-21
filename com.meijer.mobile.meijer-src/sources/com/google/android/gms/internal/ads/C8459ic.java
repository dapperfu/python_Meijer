package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8459ic implements Comparator {
    public C8459ic(C8564jc c8564jc) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C7449Xb c7449Xb = (C7449Xb) obj;
        C7449Xb c7449Xb2 = (C7449Xb) obj2;
        if (c7449Xb.d() < c7449Xb2.d()) {
            return -1;
        }
        if (c7449Xb.d() > c7449Xb2.d()) {
            return 1;
        }
        if (c7449Xb.b() < c7449Xb2.b()) {
            return -1;
        }
        if (c7449Xb.b() > c7449Xb2.b()) {
            return 1;
        }
        float fA = (c7449Xb.a() - c7449Xb.d()) * (c7449Xb.c() - c7449Xb.b());
        float fA2 = (c7449Xb2.a() - c7449Xb2.d()) * (c7449Xb2.c() - c7449Xb2.b());
        if (fA > fA2) {
            return -1;
        }
        return fA < fA2 ? 1 : 0;
    }
}

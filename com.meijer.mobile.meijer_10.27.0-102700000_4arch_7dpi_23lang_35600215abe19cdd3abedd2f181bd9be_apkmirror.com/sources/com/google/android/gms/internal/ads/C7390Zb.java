package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7390Zb implements Comparator {
    C7390Zb(C7587bc c7587bc) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C8013fc c8013fc = (C8013fc) obj;
        C8013fc c8013fc2 = (C8013fc) obj2;
        int i10 = c8013fc.f74129c - c8013fc2.f74129c;
        return i10 != 0 ? i10 : Long.compare(c8013fc.f74127a, c8013fc2.f74127a);
    }
}

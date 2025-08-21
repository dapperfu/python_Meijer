package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7515Zb implements Comparator {
    C7515Zb(C7712bc c7712bc) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C8138fc c8138fc = (C8138fc) obj;
        C8138fc c8138fc2 = (C8138fc) obj2;
        int i10 = c8138fc.f74969c - c8138fc2.f74969c;
        return i10 != 0 ? i10 : Long.compare(c8138fc.f74967a, c8138fc2.f74967a);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.Eh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6695Eh0 extends AbstractC6831Ih0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f66498a;

    C6695Eh0(Comparator comparator) {
        this.f66498a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6831Ih0
    final Map a() {
        return new TreeMap(this.f66498a);
    }
}

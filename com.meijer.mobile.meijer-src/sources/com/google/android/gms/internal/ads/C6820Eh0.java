package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.Eh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6820Eh0 extends AbstractC6956Ih0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f67338a;

    C6820Eh0(Comparator comparator) {
        this.f67338a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6956Ih0
    final Map a() {
        return new TreeMap(this.f67338a);
    }
}

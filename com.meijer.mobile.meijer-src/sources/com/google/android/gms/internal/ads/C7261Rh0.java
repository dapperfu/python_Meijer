package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Rh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7261Rh0 extends AbstractC8042eh0 {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7295Sh0 f70762d;

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f70762d.f70980e;
    }

    C7261Rh0(C7295Sh0 c7295Sh0) {
        this.f70762d = c7295Sh0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C6782Df0.a(i10, this.f70762d.f70980e, "index");
        int i11 = i10 + i10;
        Object obj = this.f70762d.f70979d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f70762d.f70979d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}

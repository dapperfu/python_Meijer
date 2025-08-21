package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Sh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7295Sh0 extends AbstractC8575jh0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC8363hh0 f70978c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f70979d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f70980e;

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f70980e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f70978c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0
    final AbstractC8042eh0 o() {
        return new C7261Rh0(this);
    }

    C7295Sh0(AbstractC8363hh0 abstractC8363hh0, Object[] objArr, int i10, int i11) {
        this.f70978c = abstractC8363hh0;
        this.f70979d = objArr;
        this.f70980e = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final int a(Object[] objArr, int i10) {
        return h().a(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, com.google.android.gms.internal.ads.AbstractC7526Zg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, com.google.android.gms.internal.ads.AbstractC7526Zg0
    /* renamed from: k */
    public final AbstractC8684ki0 iterator() {
        return h().listIterator(0);
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.ug0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9749ug0 extends C9535sg0 implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9856vg0 f79730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9749ug0(C9856vg0 c9856vg0) {
        super(c9856vg0);
        this.f79730d = c9856vg0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9749ug0(C9856vg0 c9856vg0, int i10) {
        super(c9856vg0, ((List) c9856vg0.f79452b).listIterator(i10));
        this.f79730d = c9856vg0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f79730d.isEmpty();
        a();
        ((ListIterator) this.f79127a).add(obj);
        this.f79730d.f79950f.f80358e++;
        if (zIsEmpty) {
            this.f79730d.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f79127a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f79127a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f79127a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f79127a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f79127a).set(obj);
    }
}

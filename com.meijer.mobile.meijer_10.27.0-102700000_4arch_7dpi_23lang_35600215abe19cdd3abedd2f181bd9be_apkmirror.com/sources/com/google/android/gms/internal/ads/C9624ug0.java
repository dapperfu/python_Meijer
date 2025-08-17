package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.ug0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9624ug0 extends C9410sg0 implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9731vg0 f78890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9624ug0(C9731vg0 c9731vg0) {
        super(c9731vg0);
        this.f78890d = c9731vg0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9624ug0(C9731vg0 c9731vg0, int i10) {
        super(c9731vg0, ((List) c9731vg0.f78612b).listIterator(i10));
        this.f78890d = c9731vg0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f78890d.isEmpty();
        a();
        ((ListIterator) this.f78287a).add(obj);
        this.f78890d.f79110f.f79518e++;
        if (zIsEmpty) {
            this.f78890d.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f78287a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f78287a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f78287a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f78287a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f78287a).set(obj);
    }
}

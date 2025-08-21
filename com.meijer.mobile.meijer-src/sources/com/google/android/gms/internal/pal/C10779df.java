package com.google.android.gms.internal.pal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.pal.df, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10779df extends C10796ef implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final List f83930a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C10779df) && ((C10779df) obj).f83930a.equals(this.f83930a);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.C10796ef
    public final int a() {
        if (this.f83930a.size() == 1) {
            return ((C10796ef) this.f83930a.get(0)).a();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.pal.C10796ef
    public final String e() {
        if (this.f83930a.size() == 1) {
            return ((C10796ef) this.f83930a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final int h() {
        return this.f83930a.size();
    }

    public final int hashCode() {
        return this.f83930a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f83930a.iterator();
    }

    public final C10796ef k(int i10) {
        return (C10796ef) this.f83930a.get(i10);
    }

    public final void l(C10796ef c10796ef) {
        this.f83930a.add(c10796ef);
    }
}

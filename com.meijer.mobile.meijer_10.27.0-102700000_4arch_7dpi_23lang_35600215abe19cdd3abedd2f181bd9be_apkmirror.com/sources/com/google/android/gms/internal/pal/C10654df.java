package com.google.android.gms.internal.pal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.pal.df, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10654df extends C10671ef implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final List f83090a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C10654df) && ((C10654df) obj).f83090a.equals(this.f83090a);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.C10671ef
    public final int a() {
        if (this.f83090a.size() == 1) {
            return ((C10671ef) this.f83090a.get(0)).a();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.pal.C10671ef
    public final String e() {
        if (this.f83090a.size() == 1) {
            return ((C10671ef) this.f83090a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final int h() {
        return this.f83090a.size();
    }

    public final int hashCode() {
        return this.f83090a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f83090a.iterator();
    }

    public final C10671ef k(int i10) {
        return (C10671ef) this.f83090a.get(i10);
    }

    public final void l(C10671ef c10671ef) {
        this.f83090a.add(c10671ef);
    }
}

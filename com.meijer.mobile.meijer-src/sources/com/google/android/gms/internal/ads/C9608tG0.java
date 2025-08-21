package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* renamed from: com.google.android.gms.internal.ads.tG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9608tG0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f79369a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9608tG0)) {
            return false;
        }
        C9608tG0 c9608tG0 = (C9608tG0) obj;
        if (OV.f69931a >= 24) {
            return this.f79369a.equals(c9608tG0.f79369a);
        }
        if (this.f79369a.size() != c9608tG0.f79369a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f79369a.size(); i10++) {
            if (a(i10) != c9608tG0.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int a(int i10) {
        C8211gC.a(i10, 0, this.f79369a.size());
        return this.f79369a.keyAt(i10);
    }

    public final int b() {
        return this.f79369a.size();
    }

    public final boolean c(int i10) {
        return this.f79369a.get(i10);
    }

    public final int hashCode() {
        if (OV.f69931a >= 24) {
            return this.f79369a.hashCode();
        }
        int size = this.f79369a.size();
        for (int i10 = 0; i10 < this.f79369a.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}

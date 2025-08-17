package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* renamed from: com.google.android.gms.internal.ads.tG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9483tG0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f78529a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9483tG0)) {
            return false;
        }
        C9483tG0 c9483tG0 = (C9483tG0) obj;
        if (OV.f69091a >= 24) {
            return this.f78529a.equals(c9483tG0.f78529a);
        }
        if (this.f78529a.size() != c9483tG0.f78529a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f78529a.size(); i10++) {
            if (a(i10) != c9483tG0.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int a(int i10) {
        C8086gC.a(i10, 0, this.f78529a.size());
        return this.f78529a.keyAt(i10);
    }

    public final int b() {
        return this.f78529a.size();
    }

    public final boolean c(int i10) {
        return this.f78529a.get(i10);
    }

    public final int hashCode() {
        if (OV.f69091a >= 24) {
            return this.f78529a.hashCode();
        }
        int size = this.f78529a.size();
        for (int i10 = 0; i10 < this.f78529a.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}

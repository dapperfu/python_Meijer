package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Np, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7008Np {

    /* renamed from: b, reason: collision with root package name */
    public static final C7008Np f68951b = new C7008Np(AbstractC7917eh0.t());

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7917eh0 f68952a;

    public final AbstractC7917eh0 a() {
        return this.f68952a;
    }

    public final boolean b(int i10) {
        for (int i11 = 0; i11 < this.f68952a.size(); i11++) {
            C8893np c8893np = (C8893np) this.f68952a.get(i11);
            if (c8893np.c() && c8893np.a() == i10) {
                return true;
            }
        }
        return false;
    }

    static {
        Integer.toString(0, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7008Np.class != obj.getClass()) {
            return false;
        }
        return this.f68952a.equals(((C7008Np) obj).f68952a);
    }

    public final int hashCode() {
        return this.f68952a.hashCode();
    }

    public C7008Np(List list) {
        this.f68952a = AbstractC7917eh0.r(list);
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Np, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7133Np {

    /* renamed from: b, reason: collision with root package name */
    public static final C7133Np f69791b = new C7133Np(AbstractC8042eh0.t());

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8042eh0 f69792a;

    public final AbstractC8042eh0 a() {
        return this.f69792a;
    }

    public final boolean b(int i10) {
        for (int i11 = 0; i11 < this.f69792a.size(); i11++) {
            C9018np c9018np = (C9018np) this.f69792a.get(i11);
            if (c9018np.c() && c9018np.a() == i10) {
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
        if (obj == null || C7133Np.class != obj.getClass()) {
            return false;
        }
        return this.f69792a.equals(((C7133Np) obj).f69792a);
    }

    public final int hashCode() {
        return this.f69792a.hashCode();
    }

    public C7133Np(List list) {
        this.f69792a = AbstractC8042eh0.r(list);
    }
}

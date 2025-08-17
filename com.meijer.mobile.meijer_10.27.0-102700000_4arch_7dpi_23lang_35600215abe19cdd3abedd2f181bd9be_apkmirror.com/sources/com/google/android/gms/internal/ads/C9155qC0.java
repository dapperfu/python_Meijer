package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9155qC0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C9155qC0 f77749d = new C8941oC0().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f77750a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77751b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77752c;

    /* synthetic */ C9155qC0(C8941oC0 c8941oC0, C9048pC0 c9048pC0) {
        this.f77750a = c8941oC0.f77337a;
        this.f77751b = c8941oC0.f77338b;
        this.f77752c = c8941oC0.f77339c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9155qC0.class == obj.getClass()) {
            C9155qC0 c9155qC0 = (C9155qC0) obj;
            if (this.f77750a == c9155qC0.f77750a && this.f77751b == c9155qC0.f77751b && this.f77752c == c9155qC0.f77752c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.f77750a;
        boolean z11 = this.f77751b;
        return ((z10 ? 1 : 0) << 2) + (z11 ? 1 : 0) + (z11 ? 1 : 0) + (this.f77752c ? 1 : 0);
    }
}

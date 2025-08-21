package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9280qC0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C9280qC0 f78589d = new C9066oC0().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f78590a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f78591b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78592c;

    /* synthetic */ C9280qC0(C9066oC0 c9066oC0, C9173pC0 c9173pC0) {
        this.f78590a = c9066oC0.f78177a;
        this.f78591b = c9066oC0.f78178b;
        this.f78592c = c9066oC0.f78179c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9280qC0.class == obj.getClass()) {
            C9280qC0 c9280qC0 = (C9280qC0) obj;
            if (this.f78590a == c9280qC0.f78590a && this.f78591b == c9280qC0.f78591b && this.f78592c == c9280qC0.f78592c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.f78590a;
        boolean z11 = this.f78591b;
        return ((z10 ? 1 : 0) << 2) + (z11 ? 1 : 0) + (z11 ? 1 : 0) + (this.f78592c ? 1 : 0);
    }
}

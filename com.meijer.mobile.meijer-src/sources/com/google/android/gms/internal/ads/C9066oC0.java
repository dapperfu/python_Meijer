package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9066oC0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f78177a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f78178b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f78179c;

    public final C9066oC0 a(boolean z10) {
        this.f78177a = true;
        return this;
    }

    public final C9066oC0 b(boolean z10) {
        this.f78178b = z10;
        return this;
    }

    public final C9066oC0 c(boolean z10) {
        this.f78179c = z10;
        return this;
    }

    public final C9280qC0 d() {
        if (this.f78177a || !(this.f78178b || this.f78179c)) {
            return new C9280qC0(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}

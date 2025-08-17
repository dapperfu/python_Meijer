package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8941oC0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f77337a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f77338b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f77339c;

    public final C8941oC0 a(boolean z10) {
        this.f77337a = true;
        return this;
    }

    public final C8941oC0 b(boolean z10) {
        this.f77338b = z10;
        return this;
    }

    public final C8941oC0 c(boolean z10) {
        this.f77339c = z10;
        return this;
    }

    public final C9155qC0 d() {
        if (this.f77337a || !(this.f77338b || this.f77339c)) {
            return new C9155qC0(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}

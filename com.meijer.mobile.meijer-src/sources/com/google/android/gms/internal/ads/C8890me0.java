package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.me0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8890me0 extends AbstractC7221Qe0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f77682a;

    /* renamed from: b, reason: collision with root package name */
    private final String f77683b;

    /* synthetic */ C8890me0(int i10, String str, C8783le0 c8783le0) {
        this.f77682a = i10;
        this.f77683b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7221Qe0
    public final int a() {
        return this.f77682a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7221Qe0
    public final String b() {
        return this.f77683b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7221Qe0) {
            AbstractC7221Qe0 abstractC7221Qe0 = (AbstractC7221Qe0) obj;
            if (this.f77682a == abstractC7221Qe0.a() && ((str = this.f77683b) != null ? str.equals(abstractC7221Qe0.b()) : abstractC7221Qe0.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f77683b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f77682a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f77682a + ", sessionToken=" + this.f77683b + "}";
    }
}

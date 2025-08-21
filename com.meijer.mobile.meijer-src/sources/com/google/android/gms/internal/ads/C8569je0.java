package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* renamed from: com.google.android.gms.internal.ads.je0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8569je0 extends AbstractC7119Ne0 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f76307a;

    /* renamed from: b, reason: collision with root package name */
    private final String f76308b;

    /* renamed from: c, reason: collision with root package name */
    private final int f76309c;

    /* renamed from: d, reason: collision with root package name */
    private final float f76310d;

    /* renamed from: e, reason: collision with root package name */
    private final int f76311e;

    /* renamed from: f, reason: collision with root package name */
    private final String f76312f;

    /* synthetic */ C8569je0(IBinder iBinder, String str, int i10, float f10, int i11, int i12, String str2, int i13, String str3, String str4, String str5, C8464ie0 c8464ie0) {
        this.f76307a = iBinder;
        this.f76308b = str;
        this.f76309c = i10;
        this.f76310d = f10;
        this.f76311e = i13;
        this.f76312f = str4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final float a() {
        return this.f76310d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final int c() {
        return this.f76309c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final int e() {
        return this.f76311e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7119Ne0) {
            AbstractC7119Ne0 abstractC7119Ne0 = (AbstractC7119Ne0) obj;
            if (this.f76307a.equals(abstractC7119Ne0.f()) && ((str = this.f76308b) != null ? str.equals(abstractC7119Ne0.h()) : abstractC7119Ne0.h() == null) && this.f76309c == abstractC7119Ne0.c() && Float.floatToIntBits(this.f76310d) == Float.floatToIntBits(abstractC7119Ne0.a())) {
                abstractC7119Ne0.b();
                abstractC7119Ne0.d();
                abstractC7119Ne0.j();
                if (this.f76311e == abstractC7119Ne0.e()) {
                    abstractC7119Ne0.i();
                    String str2 = this.f76312f;
                    if (str2 != null ? str2.equals(abstractC7119Ne0.g()) : abstractC7119Ne0.g() == null) {
                        abstractC7119Ne0.k();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final IBinder f() {
        return this.f76307a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final String g() {
        return this.f76312f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final String h() {
        return this.f76308b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final String j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7119Ne0
    public final String k() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f76307a.hashCode() ^ 1000003;
        String str = this.f76308b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f76309c) * 1000003) ^ Float.floatToIntBits(this.f76310d);
        int i10 = this.f76311e;
        String str2 = this.f76312f;
        return ((((iHashCode2 * 1525764945) ^ i10) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f76307a.toString() + ", appId=" + this.f76308b + ", layoutGravity=" + this.f76309c + ", layoutVerticalMargin=" + this.f76310d + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.f76311e + ", deeplinkUrl=null, adFieldEnifd=" + this.f76312f + ", thirdPartyAuthCallerId=null}";
    }
}

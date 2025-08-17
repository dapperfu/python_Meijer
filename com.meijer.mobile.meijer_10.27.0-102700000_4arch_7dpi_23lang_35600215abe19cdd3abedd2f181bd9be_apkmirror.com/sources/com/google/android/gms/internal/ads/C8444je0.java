package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* renamed from: com.google.android.gms.internal.ads.je0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8444je0 extends AbstractC6994Ne0 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f75467a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75468b;

    /* renamed from: c, reason: collision with root package name */
    private final int f75469c;

    /* renamed from: d, reason: collision with root package name */
    private final float f75470d;

    /* renamed from: e, reason: collision with root package name */
    private final int f75471e;

    /* renamed from: f, reason: collision with root package name */
    private final String f75472f;

    /* synthetic */ C8444je0(IBinder iBinder, String str, int i10, float f10, int i11, int i12, String str2, int i13, String str3, String str4, String str5, C8339ie0 c8339ie0) {
        this.f75467a = iBinder;
        this.f75468b = str;
        this.f75469c = i10;
        this.f75470d = f10;
        this.f75471e = i13;
        this.f75472f = str4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final float a() {
        return this.f75470d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final int c() {
        return this.f75469c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final int e() {
        return this.f75471e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6994Ne0) {
            AbstractC6994Ne0 abstractC6994Ne0 = (AbstractC6994Ne0) obj;
            if (this.f75467a.equals(abstractC6994Ne0.f()) && ((str = this.f75468b) != null ? str.equals(abstractC6994Ne0.h()) : abstractC6994Ne0.h() == null) && this.f75469c == abstractC6994Ne0.c() && Float.floatToIntBits(this.f75470d) == Float.floatToIntBits(abstractC6994Ne0.a())) {
                abstractC6994Ne0.b();
                abstractC6994Ne0.d();
                abstractC6994Ne0.j();
                if (this.f75471e == abstractC6994Ne0.e()) {
                    abstractC6994Ne0.i();
                    String str2 = this.f75472f;
                    if (str2 != null ? str2.equals(abstractC6994Ne0.g()) : abstractC6994Ne0.g() == null) {
                        abstractC6994Ne0.k();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final IBinder f() {
        return this.f75467a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final String g() {
        return this.f75472f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final String h() {
        return this.f75468b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final String j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6994Ne0
    public final String k() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f75467a.hashCode() ^ 1000003;
        String str = this.f75468b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f75469c) * 1000003) ^ Float.floatToIntBits(this.f75470d);
        int i10 = this.f75471e;
        String str2 = this.f75472f;
        return ((((iHashCode2 * 1525764945) ^ i10) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f75467a.toString() + ", appId=" + this.f75468b + ", layoutGravity=" + this.f75469c + ", layoutVerticalMargin=" + this.f75470d + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.f75471e + ", deeplinkUrl=null, adFieldEnifd=" + this.f75472f + ", thirdPartyAuthCallerId=null}";
    }
}

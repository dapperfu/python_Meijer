package com.google.android.gms.internal.ads;

import com.google.maps.android.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.md0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8763md0 extends AbstractC9618ud0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f76839b;

    /* renamed from: c, reason: collision with root package name */
    private final int f76840c;

    /* renamed from: d, reason: collision with root package name */
    private final int f76841d;

    /* synthetic */ C8763md0(String str, boolean z10, int i10, InterfaceC8337id0 interfaceC8337id0, InterfaceC8442jd0 interfaceC8442jd0, int i11, C8656ld0 c8656ld0) {
        this.f76839b = str;
        this.f76840c = i10;
        this.f76841d = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9618ud0
    public final InterfaceC8337id0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9618ud0
    public final InterfaceC8442jd0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9618ud0
    public final String c() {
        return this.f76839b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9618ud0
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9618ud0
    public final int e() {
        return this.f76840c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9618ud0) {
            AbstractC9618ud0 abstractC9618ud0 = (AbstractC9618ud0) obj;
            if (this.f76839b.equals(abstractC9618ud0.c())) {
                abstractC9618ud0.d();
                int i10 = this.f76840c;
                int iE = abstractC9618ud0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    abstractC9618ud0.a();
                    abstractC9618ud0.b();
                    int i11 = this.f76841d;
                    int iF = abstractC9618ud0.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9618ud0
    public final int f() {
        return this.f76841d;
    }

    public final int hashCode() {
        int iHashCode = this.f76839b.hashCode() ^ 1000003;
        int i10 = this.f76840c;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f76841d != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f76840c;
        String str = BuildConfig.TRAVIS;
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.TRAVIS : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.f76841d == 1) {
            str = "READ_AND_WRITE";
        }
        return "FileComplianceOptions{fileOwner=" + this.f76839b + ", hasDifferentDmaOwner=false, fileChecks=" + str2 + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }
}

package com.google.android.gms.internal.ads;

import com.google.maps.android.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.md0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8888md0 extends AbstractC9743ud0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f77679b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77680c;

    /* renamed from: d, reason: collision with root package name */
    private final int f77681d;

    /* synthetic */ C8888md0(String str, boolean z10, int i10, InterfaceC8462id0 interfaceC8462id0, InterfaceC8567jd0 interfaceC8567jd0, int i11, C8781ld0 c8781ld0) {
        this.f77679b = str;
        this.f77680c = i10;
        this.f77681d = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9743ud0
    public final InterfaceC8462id0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9743ud0
    public final InterfaceC8567jd0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9743ud0
    public final String c() {
        return this.f77679b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9743ud0
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9743ud0
    public final int e() {
        return this.f77680c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9743ud0) {
            AbstractC9743ud0 abstractC9743ud0 = (AbstractC9743ud0) obj;
            if (this.f77679b.equals(abstractC9743ud0.c())) {
                abstractC9743ud0.d();
                int i10 = this.f77680c;
                int iE = abstractC9743ud0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    abstractC9743ud0.a();
                    abstractC9743ud0.b();
                    int i11 = this.f77681d;
                    int iF = abstractC9743ud0.f();
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

    @Override // com.google.android.gms.internal.ads.AbstractC9743ud0
    public final int f() {
        return this.f77681d;
    }

    public final int hashCode() {
        int iHashCode = this.f77679b.hashCode() ^ 1000003;
        int i10 = this.f77680c;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f77681d != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f77680c;
        String str = BuildConfig.TRAVIS;
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.TRAVIS : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.f77681d == 1) {
            str = "READ_AND_WRITE";
        }
        return "FileComplianceOptions{fileOwner=" + this.f77679b + ", hasDifferentDmaOwner=false, fileChecks=" + str2 + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }
}

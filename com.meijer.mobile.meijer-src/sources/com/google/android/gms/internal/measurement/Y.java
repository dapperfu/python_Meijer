package com.google.android.gms.internal.measurement;

import com.google.maps.android.BuildConfig;

/* loaded from: classes6.dex */
final class Y extends AbstractC10525f0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f82939c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82940d;

    /* renamed from: e, reason: collision with root package name */
    private final int f82941e;

    /* synthetic */ Y(String str, boolean z10, int i10, V v10, W w10, int i11, byte[] bArr) {
        this.f82939c = str;
        this.f82940d = i10;
        this.f82941e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10525f0
    public final String a() {
        return this.f82939c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10525f0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10525f0
    public final V c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10525f0
    public final W d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10525f0
    public final int e() {
        return this.f82940d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10525f0) {
            AbstractC10525f0 abstractC10525f0 = (AbstractC10525f0) obj;
            if (this.f82939c.equals(abstractC10525f0.a())) {
                abstractC10525f0.b();
                int i10 = this.f82940d;
                int iE = abstractC10525f0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    abstractC10525f0.c();
                    abstractC10525f0.d();
                    int i11 = this.f82941e;
                    int iF = abstractC10525f0.f();
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

    @Override // com.google.android.gms.internal.measurement.AbstractC10525f0
    public final int f() {
        return this.f82941e;
    }

    public final int hashCode() {
        int iHashCode = this.f82939c.hashCode() ^ 1000003;
        int i10 = this.f82940d;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f82941e != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f82940d;
        String str = BuildConfig.TRAVIS;
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.TRAVIS : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.f82941e == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.f82939c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str2.length() + 91 + str.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str2);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}

package com.google.android.gms.internal.measurement;

import com.google.maps.android.BuildConfig;

/* loaded from: classes6.dex */
final class Y extends AbstractC10400f0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f82099c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82100d;

    /* renamed from: e, reason: collision with root package name */
    private final int f82101e;

    /* synthetic */ Y(String str, boolean z10, int i10, V v10, W w10, int i11, byte[] bArr) {
        this.f82099c = str;
        this.f82100d = i10;
        this.f82101e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10400f0
    public final String a() {
        return this.f82099c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10400f0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10400f0
    public final V c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10400f0
    public final W d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10400f0
    public final int e() {
        return this.f82100d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10400f0) {
            AbstractC10400f0 abstractC10400f0 = (AbstractC10400f0) obj;
            if (this.f82099c.equals(abstractC10400f0.a())) {
                abstractC10400f0.b();
                int i10 = this.f82100d;
                int iE = abstractC10400f0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    abstractC10400f0.c();
                    abstractC10400f0.d();
                    int i11 = this.f82101e;
                    int iF = abstractC10400f0.f();
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

    @Override // com.google.android.gms.internal.measurement.AbstractC10400f0
    public final int f() {
        return this.f82101e;
    }

    public final int hashCode() {
        int iHashCode = this.f82099c.hashCode() ^ 1000003;
        int i10 = this.f82100d;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f82101e != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f82100d;
        String str = BuildConfig.TRAVIS;
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.TRAVIS : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.f82101e == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.f82099c;
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

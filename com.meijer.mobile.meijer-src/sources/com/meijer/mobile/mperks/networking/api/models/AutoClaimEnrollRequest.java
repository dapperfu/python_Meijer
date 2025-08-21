package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/AutoClaimEnrollRequest;", "", "", "enroll", "", "autoClaimAmount", "", "autoClaimType", "<init>", "(ZLjava/lang/Double;Ljava/lang/String;)V", "copy", "(ZLjava/lang/Double;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/api/models/AutoClaimEnrollRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Ljava/lang/String;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoClaimEnrollRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enroll;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double autoClaimAmount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String autoClaimType;

    public AutoClaimEnrollRequest(@g(name = "enroll") boolean z10, @g(name = "autoClaimAmount") Double d10, @g(name = "autoClaimType") String str) {
        this.enroll = z10;
        this.autoClaimAmount = d10;
        this.autoClaimType = str;
    }

    public final AutoClaimEnrollRequest copy(@g(name = "enroll") boolean enroll, @g(name = "autoClaimAmount") Double autoClaimAmount, @g(name = "autoClaimType") String autoClaimType) {
        return new AutoClaimEnrollRequest(enroll, autoClaimAmount, autoClaimType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoClaimEnrollRequest)) {
            return false;
        }
        AutoClaimEnrollRequest autoClaimEnrollRequest = (AutoClaimEnrollRequest) other;
        return this.enroll == autoClaimEnrollRequest.enroll && Intrinsics.e(this.autoClaimAmount, autoClaimEnrollRequest.autoClaimAmount) && Intrinsics.e(this.autoClaimType, autoClaimEnrollRequest.autoClaimType);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enroll) * 31;
        Double d10 = this.autoClaimAmount;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str = this.autoClaimType;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AutoClaimEnrollRequest(enroll=" + this.enroll + ", autoClaimAmount=" + this.autoClaimAmount + ", autoClaimType=" + this.autoClaimType + ')';
    }

    /* renamed from: a, reason: from getter */
    public final Double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    /* renamed from: b, reason: from getter */
    public final String getAutoClaimType() {
        return this.autoClaimType;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getEnroll() {
        return this.enroll;
    }

    public /* synthetic */ AutoClaimEnrollRequest(boolean z10, Double d10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : str);
    }
}

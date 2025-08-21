package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jx\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b&\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b#\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001b\u0010,¨\u0006-"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksAccountInfoResponse;", "", "", "isActive", "", "shopperId", "", "state", "zipCode", "", "preferredStoreId", "conversion40StartTime", "conversion40FinishTime", "autoClaimType", "", "autoClaimAmount", "<init>", "(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "copy", "(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/meijer/mobile/mperks/networking/api/models/MperksAccountInfoResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", "J", "f", "()J", "c", "Ljava/lang/String;", "g", "d", "h", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksAccountInfoResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long shopperId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer preferredStoreId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String conversion40StartTime;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String conversion40FinishTime;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String autoClaimType;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double autoClaimAmount;

    public MperksAccountInfoResponse() {
        this(false, 0L, null, null, null, null, null, null, null, 511, null);
    }

    public final MperksAccountInfoResponse copy(@g(name = "isActive") boolean isActive, @g(name = "shopperId") long shopperId, @g(name = "state") String state, @g(name = "zipCode") String zipCode, @g(name = "preferredStoreId") Integer preferredStoreId, @g(name = "conversion40StartTime") String conversion40StartTime, @g(name = "conversion40FinishTime") String conversion40FinishTime, @g(name = "autoClaimType") String autoClaimType, @g(name = "autoClaimAmount") Double autoClaimAmount) {
        return new MperksAccountInfoResponse(isActive, shopperId, state, zipCode, preferredStoreId, conversion40StartTime, conversion40FinishTime, autoClaimType, autoClaimAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksAccountInfoResponse)) {
            return false;
        }
        MperksAccountInfoResponse mperksAccountInfoResponse = (MperksAccountInfoResponse) other;
        return this.isActive == mperksAccountInfoResponse.isActive && this.shopperId == mperksAccountInfoResponse.shopperId && Intrinsics.e(this.state, mperksAccountInfoResponse.state) && Intrinsics.e(this.zipCode, mperksAccountInfoResponse.zipCode) && Intrinsics.e(this.preferredStoreId, mperksAccountInfoResponse.preferredStoreId) && Intrinsics.e(this.conversion40StartTime, mperksAccountInfoResponse.conversion40StartTime) && Intrinsics.e(this.conversion40FinishTime, mperksAccountInfoResponse.conversion40FinishTime) && Intrinsics.e(this.autoClaimType, mperksAccountInfoResponse.autoClaimType) && Intrinsics.e(this.autoClaimAmount, mperksAccountInfoResponse.autoClaimAmount);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isActive) * 31) + Long.hashCode(this.shopperId)) * 31;
        String str = this.state;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zipCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.preferredStoreId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.conversion40StartTime;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.conversion40FinishTime;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.autoClaimType;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d10 = this.autoClaimAmount;
        return iHashCode7 + (d10 != null ? d10.hashCode() : 0);
    }

    public String toString() {
        return "MperksAccountInfoResponse(isActive=" + this.isActive + ", shopperId=" + this.shopperId + ", state=" + this.state + ", zipCode=" + this.zipCode + ", preferredStoreId=" + this.preferredStoreId + ", conversion40StartTime=" + this.conversion40StartTime + ", conversion40FinishTime=" + this.conversion40FinishTime + ", autoClaimType=" + this.autoClaimType + ", autoClaimAmount=" + this.autoClaimAmount + ')';
    }

    public MperksAccountInfoResponse(@g(name = "isActive") boolean z10, @g(name = "shopperId") long j10, @g(name = "state") String str, @g(name = "zipCode") String str2, @g(name = "preferredStoreId") Integer num, @g(name = "conversion40StartTime") String str3, @g(name = "conversion40FinishTime") String str4, @g(name = "autoClaimType") String str5, @g(name = "autoClaimAmount") Double d10) {
        this.isActive = z10;
        this.shopperId = j10;
        this.state = str;
        this.zipCode = str2;
        this.preferredStoreId = num;
        this.conversion40StartTime = str3;
        this.conversion40FinishTime = str4;
        this.autoClaimType = str5;
        this.autoClaimAmount = d10;
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
    public final String getConversion40FinishTime() {
        return this.conversion40FinishTime;
    }

    /* renamed from: d, reason: from getter */
    public final String getConversion40StartTime() {
        return this.conversion40StartTime;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getPreferredStoreId() {
        return this.preferredStoreId;
    }

    /* renamed from: f, reason: from getter */
    public final long getShopperId() {
        return this.shopperId;
    }

    /* renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: h, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MperksAccountInfoResponse(boolean z10, long j10, String str, String str2, Integer num, String str3, String str4, String str5, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Double d11;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer num2;
        String str10;
        z10 = (i10 & 1) != 0 ? false : z10;
        j10 = (i10 & 2) != 0 ? 0L : j10;
        str = (i10 & 4) != 0 ? null : str;
        str2 = (i10 & 8) != 0 ? null : str2;
        num = (i10 & 16) != 0 ? null : num;
        str3 = (i10 & 32) != 0 ? null : str3;
        str4 = (i10 & 64) != 0 ? null : str4;
        str5 = (i10 & 128) != 0 ? null : str5;
        if ((i10 & 256) != 0) {
            d11 = null;
            str8 = str4;
            str6 = str5;
            num2 = num;
            str7 = str3;
            str10 = str;
            str9 = str2;
        } else {
            d11 = d10;
            str6 = str5;
            str7 = str3;
            str8 = str4;
            str9 = str2;
            num2 = num;
            str10 = str;
        }
        this(z10, j10, str10, str9, num2, str7, str8, str6, d11);
    }
}

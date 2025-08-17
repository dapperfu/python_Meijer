package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u00102\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0002\b4J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010.J\u0082\u0001\u0010?\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\nHÖ\u0001J\t\u0010D\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006E"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksAccountInfoResponse;", "", "isActive", "", "shopperId", "", "state", "", "zipCode", "preferredStoreId", "", "conversion40StartTime", "conversion40FinishTime", "conversion40Group", "autoClaimType", "autoClaimAmount", "", "<init>", "(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "()Z", "setActive", "(Z)V", "getShopperId", "()J", "setShopperId", "(J)V", "getState", "()Ljava/lang/String;", "setState", "(Ljava/lang/String;)V", "getZipCode", "setZipCode", "getPreferredStoreId", "()Ljava/lang/Integer;", "setPreferredStoreId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConversion40StartTime", "setConversion40StartTime", "getConversion40FinishTime", "setConversion40FinishTime", "getConversion40Group", "setConversion40Group", "getAutoClaimType", "setAutoClaimType", "getAutoClaimAmount", "()Ljava/lang/Double;", "setAutoClaimAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "toAutoClaimReward", "Lcom/meijer/mobile/mperks/networking/domain/models/EnrolledAutoClaimReward;", "toAutoClaimReward$networking_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksAccountInfoResponse;", "equals", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksAccountInfoResponse {
    private Double autoClaimAmount;
    private String autoClaimType;
    private String conversion40FinishTime;
    private String conversion40Group;
    private String conversion40StartTime;
    private boolean isActive;
    private Integer preferredStoreId;
    private long shopperId;
    private String state;
    private String zipCode;

    public MperksAccountInfoResponse(@g(name = "isActive") boolean z10, @g(name = "shopperId") long j10, @g(name = "state") String str, @g(name = "zipCode") String str2, @g(name = "preferredStoreId") Integer num, @g(name = "conversion40StartTime") String str3, @g(name = "conversion40FinishTime") String str4, @g(name = "conversion40Group") String str5, @g(name = "autoClaimType") String str6, @g(name = "autoClaimAmount") Double d10) {
        this.isActive = z10;
        this.shopperId = j10;
        this.state = str;
        this.zipCode = str2;
        this.preferredStoreId = num;
        this.conversion40StartTime = str3;
        this.conversion40FinishTime = str4;
        this.conversion40Group = str5;
        this.autoClaimType = str6;
        this.autoClaimAmount = d10;
    }

    public static /* synthetic */ MperksAccountInfoResponse copy$default(MperksAccountInfoResponse mperksAccountInfoResponse, boolean z10, long j10, String str, String str2, Integer num, String str3, String str4, String str5, String str6, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = mperksAccountInfoResponse.isActive;
        }
        if ((i10 & 2) != 0) {
            j10 = mperksAccountInfoResponse.shopperId;
        }
        if ((i10 & 4) != 0) {
            str = mperksAccountInfoResponse.state;
        }
        if ((i10 & 8) != 0) {
            str2 = mperksAccountInfoResponse.zipCode;
        }
        if ((i10 & 16) != 0) {
            num = mperksAccountInfoResponse.preferredStoreId;
        }
        if ((i10 & 32) != 0) {
            str3 = mperksAccountInfoResponse.conversion40StartTime;
        }
        if ((i10 & 64) != 0) {
            str4 = mperksAccountInfoResponse.conversion40FinishTime;
        }
        if ((i10 & 128) != 0) {
            str5 = mperksAccountInfoResponse.conversion40Group;
        }
        if ((i10 & 256) != 0) {
            str6 = mperksAccountInfoResponse.autoClaimType;
        }
        if ((i10 & 512) != 0) {
            d10 = mperksAccountInfoResponse.autoClaimAmount;
        }
        String str7 = str6;
        Double d11 = d10;
        String str8 = str4;
        String str9 = str5;
        return mperksAccountInfoResponse.copy(z10, j10, str, str2, num, str3, str8, str9, str7, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component10, reason: from getter */
    public final Double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final long getShopperId() {
        return this.shopperId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getPreferredStoreId() {
        return this.preferredStoreId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getConversion40StartTime() {
        return this.conversion40StartTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getConversion40FinishTime() {
        return this.conversion40FinishTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getConversion40Group() {
        return this.conversion40Group;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAutoClaimType() {
        return this.autoClaimType;
    }

    public final MperksAccountInfoResponse copy(@g(name = "isActive") boolean isActive, @g(name = "shopperId") long shopperId, @g(name = "state") String state, @g(name = "zipCode") String zipCode, @g(name = "preferredStoreId") Integer preferredStoreId, @g(name = "conversion40StartTime") String conversion40StartTime, @g(name = "conversion40FinishTime") String conversion40FinishTime, @g(name = "conversion40Group") String conversion40Group, @g(name = "autoClaimType") String autoClaimType, @g(name = "autoClaimAmount") Double autoClaimAmount) {
        return new MperksAccountInfoResponse(isActive, shopperId, state, zipCode, preferredStoreId, conversion40StartTime, conversion40FinishTime, conversion40Group, autoClaimType, autoClaimAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksAccountInfoResponse)) {
            return false;
        }
        MperksAccountInfoResponse mperksAccountInfoResponse = (MperksAccountInfoResponse) other;
        return this.isActive == mperksAccountInfoResponse.isActive && this.shopperId == mperksAccountInfoResponse.shopperId && Intrinsics.e(this.state, mperksAccountInfoResponse.state) && Intrinsics.e(this.zipCode, mperksAccountInfoResponse.zipCode) && Intrinsics.e(this.preferredStoreId, mperksAccountInfoResponse.preferredStoreId) && Intrinsics.e(this.conversion40StartTime, mperksAccountInfoResponse.conversion40StartTime) && Intrinsics.e(this.conversion40FinishTime, mperksAccountInfoResponse.conversion40FinishTime) && Intrinsics.e(this.conversion40Group, mperksAccountInfoResponse.conversion40Group) && Intrinsics.e(this.autoClaimType, mperksAccountInfoResponse.autoClaimType) && Intrinsics.e(this.autoClaimAmount, mperksAccountInfoResponse.autoClaimAmount);
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
        String str5 = this.conversion40Group;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.autoClaimType;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d10 = this.autoClaimAmount;
        return iHashCode8 + (d10 != null ? d10.hashCode() : 0);
    }

    public String toString() {
        return "MperksAccountInfoResponse(isActive=" + this.isActive + ", shopperId=" + this.shopperId + ", state=" + this.state + ", zipCode=" + this.zipCode + ", preferredStoreId=" + this.preferredStoreId + ", conversion40StartTime=" + this.conversion40StartTime + ", conversion40FinishTime=" + this.conversion40FinishTime + ", conversion40Group=" + this.conversion40Group + ", autoClaimType=" + this.autoClaimType + ", autoClaimAmount=" + this.autoClaimAmount + ')';
    }

    public final Double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    public final String getAutoClaimType() {
        return this.autoClaimType;
    }

    public final String getConversion40FinishTime() {
        return this.conversion40FinishTime;
    }

    public final String getConversion40Group() {
        return this.conversion40Group;
    }

    public final String getConversion40StartTime() {
        return this.conversion40StartTime;
    }

    public final Integer getPreferredStoreId() {
        return this.preferredStoreId;
    }

    public final long getShopperId() {
        return this.shopperId;
    }

    public final String getState() {
        return this.state;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z10) {
        this.isActive = z10;
    }

    public final void setAutoClaimAmount(Double d10) {
        this.autoClaimAmount = d10;
    }

    public final void setAutoClaimType(String str) {
        this.autoClaimType = str;
    }

    public final void setConversion40FinishTime(String str) {
        this.conversion40FinishTime = str;
    }

    public final void setConversion40Group(String str) {
        this.conversion40Group = str;
    }

    public final void setConversion40StartTime(String str) {
        this.conversion40StartTime = str;
    }

    public final void setPreferredStoreId(Integer num) {
        this.preferredStoreId = num;
    }

    public final void setShopperId(long j10) {
        this.shopperId = j10;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setZipCode(String str) {
        this.zipCode = str;
    }

    public final EnrolledAutoClaimReward toAutoClaimReward$networking_release() {
        Double d10;
        String str = this.autoClaimType;
        if (str == null || StringsKt.r0(str) || (d10 = this.autoClaimAmount) == null) {
            return null;
        }
        return new EnrolledAutoClaimReward(this.autoClaimType, d10);
    }

    public /* synthetic */ MperksAccountInfoResponse(boolean z10, long j10, String str, String str2, Integer num, String str3, String str4, String str5, String str6, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, j10, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : d10);
    }
}

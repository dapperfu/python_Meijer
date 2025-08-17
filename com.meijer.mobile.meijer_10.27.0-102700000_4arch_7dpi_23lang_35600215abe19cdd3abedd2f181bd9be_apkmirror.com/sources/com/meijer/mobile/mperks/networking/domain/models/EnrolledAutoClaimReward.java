package com.meijer.mobile.mperks.networking.domain.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/EnrolledAutoClaimReward;", "", "autoClaimType", "", "autoClaimAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "getAutoClaimType", "()Ljava/lang/String;", "setAutoClaimType", "(Ljava/lang/String;)V", "getAutoClaimAmount", "()Ljava/lang/Double;", "setAutoClaimAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Double;)Lcom/meijer/mobile/mperks/networking/domain/models/EnrolledAutoClaimReward;", "equals", "", "other", "hashCode", "", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EnrolledAutoClaimReward {
    private Double autoClaimAmount;
    private String autoClaimType;

    /* JADX WARN: Multi-variable type inference failed */
    public EnrolledAutoClaimReward() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EnrolledAutoClaimReward copy$default(EnrolledAutoClaimReward enrolledAutoClaimReward, String str, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = enrolledAutoClaimReward.autoClaimType;
        }
        if ((i10 & 2) != 0) {
            d10 = enrolledAutoClaimReward.autoClaimAmount;
        }
        return enrolledAutoClaimReward.copy(str, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoClaimType() {
        return this.autoClaimType;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    public final EnrolledAutoClaimReward copy(String autoClaimType, Double autoClaimAmount) {
        return new EnrolledAutoClaimReward(autoClaimType, autoClaimAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrolledAutoClaimReward)) {
            return false;
        }
        EnrolledAutoClaimReward enrolledAutoClaimReward = (EnrolledAutoClaimReward) other;
        return Intrinsics.e(this.autoClaimType, enrolledAutoClaimReward.autoClaimType) && Intrinsics.e(this.autoClaimAmount, enrolledAutoClaimReward.autoClaimAmount);
    }

    public int hashCode() {
        String str = this.autoClaimType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.autoClaimAmount;
        return iHashCode + (d10 != null ? d10.hashCode() : 0);
    }

    public String toString() {
        return "EnrolledAutoClaimReward(autoClaimType=" + this.autoClaimType + ", autoClaimAmount=" + this.autoClaimAmount + ')';
    }

    public EnrolledAutoClaimReward(String str, Double d10) {
        this.autoClaimType = str;
        this.autoClaimAmount = d10;
    }

    public final Double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    public final String getAutoClaimType() {
        return this.autoClaimType;
    }

    public final void setAutoClaimAmount(Double d10) {
        this.autoClaimAmount = d10;
    }

    public final void setAutoClaimType(String str) {
        this.autoClaimType = str;
    }

    public /* synthetic */ EnrolledAutoClaimReward(String str, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : d10);
    }
}

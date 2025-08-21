package com.meijer.mobile.mperks.networking.domain.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0018\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\bHÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;", "", "label", "", "fixedPoints", "", "variablePoints", "couponList", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getLabel", "()Ljava/lang/String;", "getFixedPoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVariablePoints", "getCouponList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;", "equals", "", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardDetails {
    private final List<Long> couponList;
    private final Integer fixedPoints;
    private final String label;
    private final Integer variablePoints;

    public RewardDetails(String label, Integer num, Integer num2, List<Long> couponList) {
        Intrinsics.j(label, "label");
        Intrinsics.j(couponList, "couponList");
        this.label = label;
        this.fixedPoints = num;
        this.variablePoints = num2;
        this.couponList = couponList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardDetails copy$default(RewardDetails rewardDetails, String str, Integer num, Integer num2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rewardDetails.label;
        }
        if ((i10 & 2) != 0) {
            num = rewardDetails.fixedPoints;
        }
        if ((i10 & 4) != 0) {
            num2 = rewardDetails.variablePoints;
        }
        if ((i10 & 8) != 0) {
            list = rewardDetails.couponList;
        }
        return rewardDetails.copy(str, num, num2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getFixedPoints() {
        return this.fixedPoints;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVariablePoints() {
        return this.variablePoints;
    }

    public final List<Long> component4() {
        return this.couponList;
    }

    public final RewardDetails copy(String label, Integer fixedPoints, Integer variablePoints, List<Long> couponList) {
        Intrinsics.j(label, "label");
        Intrinsics.j(couponList, "couponList");
        return new RewardDetails(label, fixedPoints, variablePoints, couponList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardDetails)) {
            return false;
        }
        RewardDetails rewardDetails = (RewardDetails) other;
        return Intrinsics.e(this.label, rewardDetails.label) && Intrinsics.e(this.fixedPoints, rewardDetails.fixedPoints) && Intrinsics.e(this.variablePoints, rewardDetails.variablePoints) && Intrinsics.e(this.couponList, rewardDetails.couponList);
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        Integer num = this.fixedPoints;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.variablePoints;
        return ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.couponList.hashCode();
    }

    public String toString() {
        return "RewardDetails(label=" + this.label + ", fixedPoints=" + this.fixedPoints + ", variablePoints=" + this.variablePoints + ", couponList=" + this.couponList + ')';
    }

    public final List<Long> getCouponList() {
        return this.couponList;
    }

    public final Integer getFixedPoints() {
        return this.fixedPoints;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getVariablePoints() {
        return this.variablePoints;
    }

    public /* synthetic */ RewardDetails(String str, Integer num, Integer num2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? CollectionsKt.m() : list);
    }
}

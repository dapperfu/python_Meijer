package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JB\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;", "", "fixedPoints", "", "variablePoints", "couponList", "", "label", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getFixedPoints", "()Ljava/lang/Integer;", "setFixedPoints", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getVariablePoints", "setVariablePoints", "getCouponList", "()Ljava/util/List;", "setCouponList", "(Ljava/util/List;)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/domain/models/RewardDetails;", "equals", "", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RewardDetails {
    private List<Integer> couponList;
    private Integer fixedPoints;
    private String label;
    private Integer variablePoints;

    public RewardDetails(@g(name = "fixedPoints") Integer num, @g(name = "variablePoints") Integer num2, @g(name = "couponList") List<Integer> list, @g(name = "label") String label) {
        Intrinsics.j(label, "label");
        this.fixedPoints = num;
        this.variablePoints = num2;
        this.couponList = list;
        this.label = label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardDetails copy$default(RewardDetails rewardDetails, Integer num, Integer num2, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = rewardDetails.fixedPoints;
        }
        if ((i10 & 2) != 0) {
            num2 = rewardDetails.variablePoints;
        }
        if ((i10 & 4) != 0) {
            list = rewardDetails.couponList;
        }
        if ((i10 & 8) != 0) {
            str = rewardDetails.label;
        }
        return rewardDetails.copy(num, num2, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getFixedPoints() {
        return this.fixedPoints;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getVariablePoints() {
        return this.variablePoints;
    }

    public final List<Integer> component3() {
        return this.couponList;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final RewardDetails copy(@g(name = "fixedPoints") Integer fixedPoints, @g(name = "variablePoints") Integer variablePoints, @g(name = "couponList") List<Integer> couponList, @g(name = "label") String label) {
        Intrinsics.j(label, "label");
        return new RewardDetails(fixedPoints, variablePoints, couponList, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardDetails)) {
            return false;
        }
        RewardDetails rewardDetails = (RewardDetails) other;
        return Intrinsics.e(this.fixedPoints, rewardDetails.fixedPoints) && Intrinsics.e(this.variablePoints, rewardDetails.variablePoints) && Intrinsics.e(this.couponList, rewardDetails.couponList) && Intrinsics.e(this.label, rewardDetails.label);
    }

    public int hashCode() {
        Integer num = this.fixedPoints;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.variablePoints;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list = this.couponList;
        return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.label.hashCode();
    }

    public String toString() {
        return "RewardDetails(fixedPoints=" + this.fixedPoints + ", variablePoints=" + this.variablePoints + ", couponList=" + this.couponList + ", label=" + this.label + ')';
    }

    public final List<Integer> getCouponList() {
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

    public final void setCouponList(List<Integer> list) {
        this.couponList = list;
    }

    public final void setFixedPoints(Integer num) {
        this.fixedPoints = num;
    }

    public final void setLabel(String str) {
        Intrinsics.j(str, "<set-?>");
        this.label = str;
    }

    public final void setVariablePoints(Integer num) {
        this.variablePoints = num;
    }

    public /* synthetic */ RewardDetails(Integer num, Integer num2, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : list, str);
    }
}

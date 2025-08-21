package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0003\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0012\b\u0003\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00052\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR!\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001c\u0010\u0010¨\u0006 "}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/RewardDetailsJson;", "", "", "fixedPoints", "variablePoints", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "couponList", "", "label", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/api/models/RewardDetailsJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardDetailsJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer fixedPoints;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer variablePoints;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> couponList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    public RewardDetailsJson() {
        this(null, null, null, null, 15, null);
    }

    public final RewardDetailsJson copy(@g(name = "fixedPoints") Integer fixedPoints, @g(name = "variablePoints") Integer variablePoints, @g(name = "couponList") List<Long> couponList, @g(name = "label") String label) {
        Intrinsics.j(couponList, "couponList");
        Intrinsics.j(label, "label");
        return new RewardDetailsJson(fixedPoints, variablePoints, couponList, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardDetailsJson)) {
            return false;
        }
        RewardDetailsJson rewardDetailsJson = (RewardDetailsJson) other;
        return Intrinsics.e(this.fixedPoints, rewardDetailsJson.fixedPoints) && Intrinsics.e(this.variablePoints, rewardDetailsJson.variablePoints) && Intrinsics.e(this.couponList, rewardDetailsJson.couponList) && Intrinsics.e(this.label, rewardDetailsJson.label);
    }

    public int hashCode() {
        Integer num = this.fixedPoints;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.variablePoints;
        return ((((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.couponList.hashCode()) * 31) + this.label.hashCode();
    }

    public String toString() {
        return "RewardDetailsJson(fixedPoints=" + this.fixedPoints + ", variablePoints=" + this.variablePoints + ", couponList=" + this.couponList + ", label=" + this.label + ')';
    }

    public RewardDetailsJson(@g(name = "fixedPoints") Integer num, @g(name = "variablePoints") Integer num2, @g(name = "couponList") List<Long> couponList, @g(name = "label") String label) {
        Intrinsics.j(couponList, "couponList");
        Intrinsics.j(label, "label");
        this.fixedPoints = num;
        this.variablePoints = num2;
        this.couponList = couponList;
        this.label = label;
    }

    public final List<Long> a() {
        return this.couponList;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getFixedPoints() {
        return this.fixedPoints;
    }

    /* renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getVariablePoints() {
        return this.variablePoints;
    }

    public /* synthetic */ RewardDetailsJson(Integer num, Integer num2, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? "" : str);
    }
}

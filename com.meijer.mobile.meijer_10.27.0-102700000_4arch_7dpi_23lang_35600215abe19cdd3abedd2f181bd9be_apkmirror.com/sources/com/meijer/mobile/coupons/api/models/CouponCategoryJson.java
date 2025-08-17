package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "", "", "segmentID", "segmentName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/coupons/api/models/CouponCategoryJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CouponCategoryJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String segmentID;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String segmentName;

    /* JADX WARN: Multi-variable type inference failed */
    public CouponCategoryJson() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final CouponCategoryJson copy(@g(name = "segmentID") String segmentID, @g(name = "segmentName") String segmentName) {
        return new CouponCategoryJson(segmentID, segmentName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponCategoryJson)) {
            return false;
        }
        CouponCategoryJson couponCategoryJson = (CouponCategoryJson) other;
        return Intrinsics.e(this.segmentID, couponCategoryJson.segmentID) && Intrinsics.e(this.segmentName, couponCategoryJson.segmentName);
    }

    public int hashCode() {
        String str = this.segmentID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.segmentName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CouponCategoryJson(segmentID=" + this.segmentID + ", segmentName=" + this.segmentName + ')';
    }

    public CouponCategoryJson(@g(name = "segmentID") String str, @g(name = "segmentName") String str2) {
        this.segmentID = str;
        this.segmentName = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getSegmentID() {
        return this.segmentID;
    }

    /* renamed from: b, reason: from getter */
    public final String getSegmentName() {
        return this.segmentName;
    }

    public /* synthetic */ CouponCategoryJson(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}

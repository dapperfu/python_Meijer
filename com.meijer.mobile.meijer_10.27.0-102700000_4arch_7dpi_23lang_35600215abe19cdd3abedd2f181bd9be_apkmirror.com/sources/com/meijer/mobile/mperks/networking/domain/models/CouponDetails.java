package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/CouponDetails;", "", "couponId", "", "clipSource", "", "clipLabel", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCouponId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClipSource", "()Ljava/lang/String;", "getClipLabel", "clipSourceTitle", "getClipSourceTitle", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/domain/models/CouponDetails;", "equals", "", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CouponDetails {
    private final String clipLabel;
    private final String clipSource;
    private final Integer couponId;

    public CouponDetails() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CouponDetails copy$default(CouponDetails couponDetails, Integer num, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = couponDetails.couponId;
        }
        if ((i10 & 2) != 0) {
            str = couponDetails.clipSource;
        }
        if ((i10 & 4) != 0) {
            str2 = couponDetails.clipLabel;
        }
        return couponDetails.copy(num, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getCouponId() {
        return this.couponId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClipSource() {
        return this.clipSource;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClipLabel() {
        return this.clipLabel;
    }

    public final CouponDetails copy(@g(name = "couponId") Integer couponId, @g(name = "clipSource") String clipSource, @g(name = "clipLabel") String clipLabel) {
        return new CouponDetails(couponId, clipSource, clipLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponDetails)) {
            return false;
        }
        CouponDetails couponDetails = (CouponDetails) other;
        return Intrinsics.e(this.couponId, couponDetails.couponId) && Intrinsics.e(this.clipSource, couponDetails.clipSource) && Intrinsics.e(this.clipLabel, couponDetails.clipLabel);
    }

    public int hashCode() {
        Integer num = this.couponId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.clipSource;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clipLabel;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CouponDetails(couponId=" + this.couponId + ", clipSource=" + this.clipSource + ", clipLabel=" + this.clipLabel + ')';
    }

    public CouponDetails(@g(name = "couponId") Integer num, @g(name = "clipSource") String str, @g(name = "clipLabel") String str2) {
        this.couponId = num;
        this.clipSource = str;
        this.clipLabel = str2;
    }

    public final String getClipLabel() {
        return this.clipLabel;
    }

    public final String getClipSource() {
        return this.clipSource;
    }

    public final String getClipSourceTitle() {
        String str = this.clipSource;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1050847989) {
                if (iHashCode != 670819326) {
                    if (iHashCode == 1565071791 && str.equals("System-AutoClaim")) {
                        return "Auto Claimed";
                    }
                } else if (str.equals("Customer")) {
                    return "Claimed by You";
                }
            } else if (str.equals("CallCenter-Agent")) {
                return "Claimed by Meijer Team Member";
            }
        }
        return this.clipSource;
    }

    public final Integer getCouponId() {
        return this.couponId;
    }

    public /* synthetic */ CouponDetails(Integer num, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}

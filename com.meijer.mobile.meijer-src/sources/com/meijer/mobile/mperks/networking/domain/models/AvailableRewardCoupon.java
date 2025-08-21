package com.meijer.mobile.mperks.networking.domain.models;

import co.EnumC6532d;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jx\u0010!\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b1\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b2\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u0010 ¨\u00067"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "couponId", "", "imageUrl", "name", "description", "j$/time/ZonedDateTime", "displayStart", "displayEnd", "termsAndConditions", "", "pointCost", "Lco/d;", "claimPill", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;ILco/d;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lj$/time/ZonedDateTime;", "component6", "component7", "component8", "()I", "component9", "()Lco/d;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;ILco/d;)Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCouponId", "Ljava/lang/String;", "getImageUrl", "getName", "getDescription", "Lj$/time/ZonedDateTime;", "getDisplayStart", "getDisplayEnd", "getTermsAndConditions", "I", "getPointCost", "Lco/d;", "getClaimPill", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AvailableRewardCoupon {
    private final EnumC6532d claimPill;
    private final long couponId;
    private final String description;
    private final ZonedDateTime displayEnd;
    private final ZonedDateTime displayStart;
    private final String imageUrl;
    private final String name;
    private final int pointCost;
    private final String termsAndConditions;

    public AvailableRewardCoupon() {
        this(0L, null, null, null, null, null, null, 0, null, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCouponId() {
        return this.couponId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final ZonedDateTime getDisplayStart() {
        return this.displayStart;
    }

    /* renamed from: component6, reason: from getter */
    public final ZonedDateTime getDisplayEnd() {
        return this.displayEnd;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPointCost() {
        return this.pointCost;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableRewardCoupon)) {
            return false;
        }
        AvailableRewardCoupon availableRewardCoupon = (AvailableRewardCoupon) other;
        return this.couponId == availableRewardCoupon.couponId && Intrinsics.e(this.imageUrl, availableRewardCoupon.imageUrl) && Intrinsics.e(this.name, availableRewardCoupon.name) && Intrinsics.e(this.description, availableRewardCoupon.description) && Intrinsics.e(this.displayStart, availableRewardCoupon.displayStart) && Intrinsics.e(this.displayEnd, availableRewardCoupon.displayEnd) && Intrinsics.e(this.termsAndConditions, availableRewardCoupon.termsAndConditions) && this.pointCost == availableRewardCoupon.pointCost && this.claimPill == availableRewardCoupon.claimPill;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.couponId) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.displayStart;
        int iHashCode4 = (iHashCode3 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.displayEnd;
        int iHashCode5 = (iHashCode4 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        String str3 = this.termsAndConditions;
        return ((((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.pointCost)) * 31) + this.claimPill.hashCode();
    }

    public String toString() {
        return "AvailableRewardCoupon(couponId=" + this.couponId + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", description=" + this.description + ", displayStart=" + this.displayStart + ", displayEnd=" + this.displayEnd + ", termsAndConditions=" + this.termsAndConditions + ", pointCost=" + this.pointCost + ", claimPill=" + this.claimPill + ')';
    }

    public AvailableRewardCoupon(long j10, String str, String name, String str2, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str3, int i10, EnumC6532d claimPill) {
        Intrinsics.j(name, "name");
        Intrinsics.j(claimPill, "claimPill");
        this.couponId = j10;
        this.imageUrl = str;
        this.name = name;
        this.description = str2;
        this.displayStart = zonedDateTime;
        this.displayEnd = zonedDateTime2;
        this.termsAndConditions = str3;
        this.pointCost = i10;
        this.claimPill = claimPill;
    }

    public static /* synthetic */ AvailableRewardCoupon copy$default(AvailableRewardCoupon availableRewardCoupon, long j10, String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, int i10, EnumC6532d enumC6532d, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = availableRewardCoupon.couponId;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            str = availableRewardCoupon.imageUrl;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = availableRewardCoupon.name;
        }
        return availableRewardCoupon.copy(j11, str5, str2, (i11 & 8) != 0 ? availableRewardCoupon.description : str3, (i11 & 16) != 0 ? availableRewardCoupon.displayStart : zonedDateTime, (i11 & 32) != 0 ? availableRewardCoupon.displayEnd : zonedDateTime2, (i11 & 64) != 0 ? availableRewardCoupon.termsAndConditions : str4, (i11 & 128) != 0 ? availableRewardCoupon.pointCost : i10, (i11 & 256) != 0 ? availableRewardCoupon.claimPill : enumC6532d);
    }

    /* renamed from: component9, reason: from getter */
    public final EnumC6532d getClaimPill() {
        return this.claimPill;
    }

    public final AvailableRewardCoupon copy(long couponId, String imageUrl, String name, String description, ZonedDateTime displayStart, ZonedDateTime displayEnd, String termsAndConditions, int pointCost, EnumC6532d claimPill) {
        Intrinsics.j(name, "name");
        Intrinsics.j(claimPill, "claimPill");
        return new AvailableRewardCoupon(couponId, imageUrl, name, description, displayStart, displayEnd, termsAndConditions, pointCost, claimPill);
    }

    public final EnumC6532d getClaimPill() {
        return this.claimPill;
    }

    public final long getCouponId() {
        return this.couponId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ZonedDateTime getDisplayEnd() {
        return this.displayEnd;
    }

    public final ZonedDateTime getDisplayStart() {
        return this.displayStart;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPointCost() {
        return this.pointCost;
    }

    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public /* synthetic */ AvailableRewardCoupon(long j10, String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, int i10, EnumC6532d enumC6532d, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1L : j10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : zonedDateTime, (i11 & 32) != 0 ? null : zonedDateTime2, (i11 & 64) == 0 ? str4 : null, (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? EnumC6532d.f62699a : enumC6532d);
    }
}

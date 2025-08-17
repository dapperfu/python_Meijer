package com.meijer.mobile.home.service.models.mperks;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJX\u0010\r\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b%\u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u0010\"\u0004\b&\u0010!R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001e\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010!¨\u0006)"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/ClippedRewardCouponDto;", "", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "", "imageUrl", "name", "description", "expirationDate", "termsAndConditions", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/home/service/models/mperks/ClippedRewardCouponDto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "setCouponId", "(J)V", "b", "Ljava/lang/String;", "d", "setImageUrl", "(Ljava/lang/String;)V", "c", "e", "setName", "setDescription", "setExpirationDate", "f", "setTermsAndConditions", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ClippedRewardCouponDto {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long couponId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String expirationDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String termsAndConditions;

    public ClippedRewardCouponDto(@g(name = "couponId") long j10, @g(name = "imageUrl") String str, @g(name = "name") String name, @g(name = "description") String str2, @g(name = "expirationDate") String str3, @g(name = "termsAndConditions") String str4) {
        Intrinsics.j(name, "name");
        this.couponId = j10;
        this.imageUrl = str;
        this.name = name;
        this.description = str2;
        this.expirationDate = str3;
        this.termsAndConditions = str4;
    }

    public final ClippedRewardCouponDto copy(@g(name = "couponId") long couponId, @g(name = "imageUrl") String imageUrl, @g(name = "name") String name, @g(name = "description") String description, @g(name = "expirationDate") String expirationDate, @g(name = "termsAndConditions") String termsAndConditions) {
        Intrinsics.j(name, "name");
        return new ClippedRewardCouponDto(couponId, imageUrl, name, description, expirationDate, termsAndConditions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClippedRewardCouponDto)) {
            return false;
        }
        ClippedRewardCouponDto clippedRewardCouponDto = (ClippedRewardCouponDto) other;
        return this.couponId == clippedRewardCouponDto.couponId && Intrinsics.e(this.imageUrl, clippedRewardCouponDto.imageUrl) && Intrinsics.e(this.name, clippedRewardCouponDto.name) && Intrinsics.e(this.description, clippedRewardCouponDto.description) && Intrinsics.e(this.expirationDate, clippedRewardCouponDto.expirationDate) && Intrinsics.e(this.termsAndConditions, clippedRewardCouponDto.termsAndConditions);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.couponId) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expirationDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.termsAndConditions;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ClippedRewardCouponDto(couponId=" + this.couponId + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", description=" + this.description + ", expirationDate=" + this.expirationDate + ", termsAndConditions=" + this.termsAndConditions + ')';
    }

    /* renamed from: a, reason: from getter */
    public final long getCouponId() {
        return this.couponId;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: d, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: f, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public /* synthetic */ ClippedRewardCouponDto(long j10, String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
    }
}

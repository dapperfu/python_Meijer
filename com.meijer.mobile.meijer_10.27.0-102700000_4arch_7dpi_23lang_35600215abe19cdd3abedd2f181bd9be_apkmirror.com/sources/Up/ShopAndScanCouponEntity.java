package Up;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"LUp/a;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "", "couponTitle", "description", "redemptionStartDate", "redemptionEndDate", "productImageUrl", "", "isClipped", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "d", "f", "e", "g", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Up.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ShopAndScanCouponEntity {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String couponTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionStartDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionEndDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productImageUrl;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClipped;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanCouponEntity)) {
            return false;
        }
        ShopAndScanCouponEntity shopAndScanCouponEntity = (ShopAndScanCouponEntity) other;
        return this.offerId == shopAndScanCouponEntity.offerId && Intrinsics.e(this.couponTitle, shopAndScanCouponEntity.couponTitle) && Intrinsics.e(this.description, shopAndScanCouponEntity.description) && Intrinsics.e(this.redemptionStartDate, shopAndScanCouponEntity.redemptionStartDate) && Intrinsics.e(this.redemptionEndDate, shopAndScanCouponEntity.redemptionEndDate) && Intrinsics.e(this.productImageUrl, shopAndScanCouponEntity.productImageUrl) && this.isClipped == shopAndScanCouponEntity.isClipped;
    }

    public ShopAndScanCouponEntity(long j10, String couponTitle, String description, String redemptionStartDate, String redemptionEndDate, String str, boolean z10) {
        Intrinsics.j(couponTitle, "couponTitle");
        Intrinsics.j(description, "description");
        Intrinsics.j(redemptionStartDate, "redemptionStartDate");
        Intrinsics.j(redemptionEndDate, "redemptionEndDate");
        this.offerId = j10;
        this.couponTitle = couponTitle;
        this.description = description;
        this.redemptionStartDate = redemptionStartDate;
        this.redemptionEndDate = redemptionEndDate;
        this.productImageUrl = str;
        this.isClipped = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getCouponTitle() {
        return this.couponTitle;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final long getOfferId() {
        return this.offerId;
    }

    /* renamed from: d, reason: from getter */
    public final String getProductImageUrl() {
        return this.productImageUrl;
    }

    /* renamed from: e, reason: from getter */
    public final String getRedemptionEndDate() {
        return this.redemptionEndDate;
    }

    /* renamed from: f, reason: from getter */
    public final String getRedemptionStartDate() {
        return this.redemptionStartDate;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.offerId) * 31) + this.couponTitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.redemptionStartDate.hashCode()) * 31) + this.redemptionEndDate.hashCode()) * 31;
        String str = this.productImageUrl;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isClipped);
    }

    public String toString() {
        return "ShopAndScanCouponEntity(offerId=" + this.offerId + ", couponTitle=" + this.couponTitle + ", description=" + this.description + ", redemptionStartDate=" + this.redemptionStartDate + ", redemptionEndDate=" + this.redemptionEndDate + ", productImageUrl=" + this.productImageUrl + ", isClipped=" + this.isClipped + ')';
    }
}

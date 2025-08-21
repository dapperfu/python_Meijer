package Xp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#¨\u0006$"}, d2 = {"LXp/b;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "", "title", "description", "startDate", "endDate", "imageUrl", "", "isClipped", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "Ljava/lang/String;", "e", "c", "getStartDate", "f", "g", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xp.b, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanCoupon {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClipped;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanCoupon)) {
            return false;
        }
        ShopAndScanCoupon shopAndScanCoupon = (ShopAndScanCoupon) other;
        return this.offerId == shopAndScanCoupon.offerId && Intrinsics.e(this.title, shopAndScanCoupon.title) && Intrinsics.e(this.description, shopAndScanCoupon.description) && Intrinsics.e(this.startDate, shopAndScanCoupon.startDate) && Intrinsics.e(this.endDate, shopAndScanCoupon.endDate) && Intrinsics.e(this.imageUrl, shopAndScanCoupon.imageUrl) && this.isClipped == shopAndScanCoupon.isClipped;
    }

    public ShopAndScanCoupon(long j10, String title, String description, String startDate, String endDate, String str, boolean z10) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(startDate, "startDate");
        Intrinsics.j(endDate, "endDate");
        this.offerId = j10;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imageUrl = str;
        this.isClipped = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: d, reason: from getter */
    public final long getOfferId() {
        return this.offerId;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.offerId) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31;
        String str = this.imageUrl;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isClipped);
    }

    public String toString() {
        return "ShopAndScanCoupon(offerId=" + this.offerId + ", title=" + this.title + ", description=" + this.description + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", imageUrl=" + this.imageUrl + ", isClipped=" + this.isClipped + ')';
    }
}

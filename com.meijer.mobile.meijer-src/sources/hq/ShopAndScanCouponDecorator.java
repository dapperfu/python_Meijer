package hq;

import Xp.ShopAndScanCoupon;
import bk.AbstractC6392a;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0001\u0017BG\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Lhq/e;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "Lbk/a;", "title", "description", "date", "", "imageUrl", "", "isClipped", "<init>", "(JLbk/a;Lbk/a;Lbk/a;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "Lbk/a;", "e", "()Lbk/a;", "c", "Ljava/lang/String;", "f", "Z", "()Z", "g", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hq.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanCouponDecorator {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f136096h = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a date;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClipped;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhq/e$a;", "", "<init>", "()V", "LXp/b;", "Lbk/a;", "b", "(LXp/b;)Lbk/a;", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Lhq/e;", "a", "(LXp/b;)Lhq/e;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hq.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final AbstractC6392a b(ShopAndScanCoupon shopAndScanCoupon) {
            return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117929k, c(shopAndScanCoupon.getEndDate()));
        }

        private final String c(String str) {
            String str2 = ((LocalDate) wk.d.a(str, C17898a.ISO_LOCAL_DATE_TIME, new Dh.a())).format(C17898a.DATE_FORMAT_MM_DD_YYYY);
            Intrinsics.i(str2, "format(...)");
            return str2;
        }

        public final ShopAndScanCouponDecorator a(ShopAndScanCoupon shopAndScanCoupon) {
            Intrinsics.j(shopAndScanCoupon, "<this>");
            long offerId = shopAndScanCoupon.getOfferId();
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return new ShopAndScanCouponDecorator(offerId, companion.c(shopAndScanCoupon.getTitle()), companion.c(shopAndScanCoupon.getDescription()), b(shopAndScanCoupon), shopAndScanCoupon.getImageUrl(), shopAndScanCoupon.getIsClipped());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanCouponDecorator)) {
            return false;
        }
        ShopAndScanCouponDecorator shopAndScanCouponDecorator = (ShopAndScanCouponDecorator) other;
        return this.offerId == shopAndScanCouponDecorator.offerId && Intrinsics.e(this.title, shopAndScanCouponDecorator.title) && Intrinsics.e(this.description, shopAndScanCouponDecorator.description) && Intrinsics.e(this.date, shopAndScanCouponDecorator.date) && Intrinsics.e(this.imageUrl, shopAndScanCouponDecorator.imageUrl) && this.isClipped == shopAndScanCouponDecorator.isClipped;
    }

    public ShopAndScanCouponDecorator(long j10, AbstractC6392a title, AbstractC6392a description, AbstractC6392a date, String str, boolean z10) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(date, "date");
        this.offerId = j10;
        this.title = title;
        this.description = description;
        this.date = date;
        this.imageUrl = str;
        this.isClipped = z10;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getDate() {
        return this.date;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getDescription() {
        return this.description;
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
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.offerId) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.date.hashCode()) * 31;
        String str = this.imageUrl;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isClipped);
    }

    public String toString() {
        return "ShopAndScanCouponDecorator(offerId=" + this.offerId + ", title=" + this.title + ", description=" + this.description + ", date=" + this.date + ", imageUrl=" + this.imageUrl + ", isClipped=" + this.isClipped + ')';
    }
}

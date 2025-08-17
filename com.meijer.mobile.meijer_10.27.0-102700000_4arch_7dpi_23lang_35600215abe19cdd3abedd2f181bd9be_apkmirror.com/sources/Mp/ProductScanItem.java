package Mp;

import Co.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"LMp/h;", "", "Lmk/i;", "productQuantity", "LCo/e;", "thumbnailImage", "", "productName", "<init>", "(Lmk/i;LCo/e;Ljava/lang/String;)V", "a", "(Lmk/i;LCo/e;Ljava/lang/String;)LMp/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmk/i;", "d", "()Lmk/i;", "b", "LCo/e;", "e", "()LCo/e;", "c", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mp.h, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductScanItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.i productQuantity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image thumbnailImage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductScanItem)) {
            return false;
        }
        ProductScanItem productScanItem = (ProductScanItem) other;
        return Intrinsics.e(this.productQuantity, productScanItem.productQuantity) && Intrinsics.e(this.thumbnailImage, productScanItem.thumbnailImage) && Intrinsics.e(this.productName, productScanItem.productName);
    }

    public ProductScanItem(mk.i productQuantity, Image image, String str) {
        Intrinsics.j(productQuantity, "productQuantity");
        this.productQuantity = productQuantity;
        this.thumbnailImage = image;
        this.productName = str;
    }

    public static /* synthetic */ ProductScanItem b(ProductScanItem productScanItem, mk.i iVar, Image image, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = productScanItem.productQuantity;
        }
        if ((i10 & 2) != 0) {
            image = productScanItem.thumbnailImage;
        }
        if ((i10 & 4) != 0) {
            str = productScanItem.productName;
        }
        return productScanItem.a(iVar, image, str);
    }

    public final ProductScanItem a(mk.i productQuantity, Image thumbnailImage, String productName) {
        Intrinsics.j(productQuantity, "productQuantity");
        return new ProductScanItem(productQuantity, thumbnailImage, productName);
    }

    /* renamed from: c, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: d, reason: from getter */
    public final mk.i getProductQuantity() {
        return this.productQuantity;
    }

    /* renamed from: e, reason: from getter */
    public final Image getThumbnailImage() {
        return this.thumbnailImage;
    }

    public int hashCode() {
        int iHashCode = this.productQuantity.hashCode() * 31;
        Image image = this.thumbnailImage;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.productName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ProductScanItem(productQuantity=" + this.productQuantity + ", thumbnailImage=" + this.thumbnailImage + ", productName=" + this.productName + ')';
    }
}

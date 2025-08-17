package dr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJX\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Ldr/f;", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "productImageThumbnail", "productName", "productPrice", "", "productQty", "productUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)Ldr/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "d", "e", "f", "D", "g", "()D", "h", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dr.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductInfoRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productImageThumbnail;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productPrice;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double productQty;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productUnit;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductInfoRequest)) {
            return false;
        }
        ProductInfoRequest productInfoRequest = (ProductInfoRequest) other;
        return Intrinsics.e(this.productCode, productInfoRequest.productCode) && Intrinsics.e(this.productImageThumbnail, productInfoRequest.productImageThumbnail) && Intrinsics.e(this.productName, productInfoRequest.productName) && Intrinsics.e(this.productPrice, productInfoRequest.productPrice) && Double.compare(this.productQty, productInfoRequest.productQty) == 0 && Intrinsics.e(this.productUnit, productInfoRequest.productUnit);
    }

    public ProductInfoRequest(String productCode, String str, String str2, String str3, double d10, String str4) {
        Intrinsics.j(productCode, "productCode");
        this.productCode = productCode;
        this.productImageThumbnail = str;
        this.productName = str2;
        this.productPrice = str3;
        this.productQty = d10;
        this.productUnit = str4;
    }

    public static /* synthetic */ ProductInfoRequest b(ProductInfoRequest productInfoRequest, String str, String str2, String str3, String str4, double d10, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = productInfoRequest.productCode;
        }
        if ((i10 & 2) != 0) {
            str2 = productInfoRequest.productImageThumbnail;
        }
        if ((i10 & 4) != 0) {
            str3 = productInfoRequest.productName;
        }
        if ((i10 & 8) != 0) {
            str4 = productInfoRequest.productPrice;
        }
        if ((i10 & 16) != 0) {
            d10 = productInfoRequest.productQty;
        }
        if ((i10 & 32) != 0) {
            str5 = productInfoRequest.productUnit;
        }
        String str6 = str5;
        double d11 = d10;
        return productInfoRequest.a(str, str2, str3, str4, d11, str6);
    }

    public final ProductInfoRequest a(String productCode, String productImageThumbnail, String productName, String productPrice, double productQty, String productUnit) {
        Intrinsics.j(productCode, "productCode");
        return new ProductInfoRequest(productCode, productImageThumbnail, productName, productPrice, productQty, productUnit);
    }

    /* renamed from: c, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* renamed from: d, reason: from getter */
    public final String getProductImageThumbnail() {
        return this.productImageThumbnail;
    }

    /* renamed from: e, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: f, reason: from getter */
    public final String getProductPrice() {
        return this.productPrice;
    }

    /* renamed from: g, reason: from getter */
    public final double getProductQty() {
        return this.productQty;
    }

    /* renamed from: h, reason: from getter */
    public final String getProductUnit() {
        return this.productUnit;
    }

    public int hashCode() {
        int iHashCode = this.productCode.hashCode() * 31;
        String str = this.productImageThumbnail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productPrice;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.hashCode(this.productQty)) * 31;
        String str4 = this.productUnit;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ProductInfoRequest(productCode=" + this.productCode + ", productImageThumbnail=" + this.productImageThumbnail + ", productName=" + this.productName + ", productPrice=" + this.productPrice + ", productQty=" + this.productQty + ", productUnit=" + this.productUnit + ')';
    }
}

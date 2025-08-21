package com.meijer.mobile.subscription.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJX\u0010\r\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "productImageThumbnail", "productName", "productPrice", "", "productQty", "productUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/meijer/mobile/subscription/service/api/models/ProductInfoResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "I", "f", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductInfoResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productImageThumbnail;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productPrice;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productQty;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productUnit;

    public ProductInfoResponseJson(@g(name = "productCode") String productCode, @g(name = "productImageThumbnail") String str, @g(name = "productName") String str2, @g(name = "productPrice") String str3, @g(name = "productQty") int i10, @g(name = "productUnit") String str4) {
        Intrinsics.j(productCode, "productCode");
        this.productCode = productCode;
        this.productImageThumbnail = str;
        this.productName = str2;
        this.productPrice = str3;
        this.productQty = i10;
        this.productUnit = str4;
    }

    public final ProductInfoResponseJson copy(@g(name = "productCode") String productCode, @g(name = "productImageThumbnail") String productImageThumbnail, @g(name = "productName") String productName, @g(name = "productPrice") String productPrice, @g(name = "productQty") int productQty, @g(name = "productUnit") String productUnit) {
        Intrinsics.j(productCode, "productCode");
        return new ProductInfoResponseJson(productCode, productImageThumbnail, productName, productPrice, productQty, productUnit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductInfoResponseJson)) {
            return false;
        }
        ProductInfoResponseJson productInfoResponseJson = (ProductInfoResponseJson) other;
        return Intrinsics.e(this.productCode, productInfoResponseJson.productCode) && Intrinsics.e(this.productImageThumbnail, productInfoResponseJson.productImageThumbnail) && Intrinsics.e(this.productName, productInfoResponseJson.productName) && Intrinsics.e(this.productPrice, productInfoResponseJson.productPrice) && this.productQty == productInfoResponseJson.productQty && Intrinsics.e(this.productUnit, productInfoResponseJson.productUnit);
    }

    public int hashCode() {
        int iHashCode = this.productCode.hashCode() * 31;
        String str = this.productImageThumbnail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productPrice;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.productQty)) * 31;
        String str4 = this.productUnit;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ProductInfoResponseJson(productCode=" + this.productCode + ", productImageThumbnail=" + this.productImageThumbnail + ", productName=" + this.productName + ", productPrice=" + this.productPrice + ", productQty=" + this.productQty + ", productUnit=" + this.productUnit + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getProductImageThumbnail() {
        return this.productImageThumbnail;
    }

    /* renamed from: c, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: d, reason: from getter */
    public final String getProductPrice() {
        return this.productPrice;
    }

    /* renamed from: e, reason: from getter */
    public final int getProductQty() {
        return this.productQty;
    }

    /* renamed from: f, reason: from getter */
    public final String getProductUnit() {
        return this.productUnit;
    }

    public /* synthetic */ ProductInfoResponseJson(String str, String str2, String str3, String str4, int i10, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, i10, (i11 & 32) != 0 ? null : str5);
    }
}

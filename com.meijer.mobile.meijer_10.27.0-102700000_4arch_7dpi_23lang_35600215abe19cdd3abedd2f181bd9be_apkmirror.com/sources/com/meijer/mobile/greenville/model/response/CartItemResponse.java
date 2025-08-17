package com.meijer.mobile.greenville.model.response;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\b\u0012\b\b\u0001\u0010\u0011\u001a\u00020\b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J¼\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u000e\u001a\u00020\b2\b\b\u0003\u0010\u000f\u001a\u00020\b2\b\b\u0003\u0010\u0010\u001a\u00020\b2\b\b\u0003\u0010\u0011\u001a\u00020\b2\b\b\u0003\u0010\u0012\u001a\u00020\b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0016\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b)\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u001cR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b+\u0010.R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b%\u0010.R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b5\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b4\u00107R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b8\u00107¨\u00069"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/CartItemResponse;", "", "", "remoteId", "", "correlationId", "upc", "scannedUpc", "", "quantityWeight", "itemDesc", "pricingText", "wasPrice", "nowPrice", "netPrice", "netPriceWithDeposit", "postAllocationPrice", "deposit", "savings", "imageURL", "", "prohibitQuantity", "isAutoVoided", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDDDDDDLjava/lang/String;ZZ)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDDDDDDLjava/lang/String;ZZ)Lcom/meijer/mobile/greenville/model/response/CartItemResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "l", "b", "Ljava/lang/String;", "c", "o", "d", "n", "e", "D", "k", "()D", "f", "g", "i", "h", "p", "j", "m", "Z", "()Z", "q", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CartItemResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int remoteId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String correlationId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scannedUpc;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityWeight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemDesc;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pricingText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double wasPrice;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final double nowPrice;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final double netPrice;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final double netPriceWithDeposit;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final double postAllocationPrice;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final double deposit;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final double savings;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean prohibitQuantity;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoVoided;

    public final CartItemResponse copy(@g(name = "lineNumber") int remoteId, @g(name = "correlationId") String correlationId, @g(name = "upc") String upc, @g(name = "scannedUpc") String scannedUpc, @g(name = "quantityWeight") double quantityWeight, @g(name = "itemDesc") String itemDesc, @g(name = "pricingText") String pricingText, @g(name = "wasPrice") double wasPrice, @g(name = "nowPrice") double nowPrice, @g(name = "netPrice") double netPrice, @g(name = "netPriceWithDeposit") double netPriceWithDeposit, @g(name = "postAllocationPrice") double postAllocationPrice, @g(name = "deposit") double deposit, @g(name = "savings") double savings, @g(name = "imageURL") String imageURL, @g(name = "prohibitQuantity") boolean prohibitQuantity, @g(name = "isAutoVoided") boolean isAutoVoided) {
        Intrinsics.j(correlationId, "correlationId");
        Intrinsics.j(upc, "upc");
        Intrinsics.j(scannedUpc, "scannedUpc");
        Intrinsics.j(itemDesc, "itemDesc");
        Intrinsics.j(pricingText, "pricingText");
        return new CartItemResponse(remoteId, correlationId, upc, scannedUpc, quantityWeight, itemDesc, pricingText, wasPrice, nowPrice, netPrice, netPriceWithDeposit, postAllocationPrice, deposit, savings, imageURL, prohibitQuantity, isAutoVoided);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItemResponse)) {
            return false;
        }
        CartItemResponse cartItemResponse = (CartItemResponse) other;
        return this.remoteId == cartItemResponse.remoteId && Intrinsics.e(this.correlationId, cartItemResponse.correlationId) && Intrinsics.e(this.upc, cartItemResponse.upc) && Intrinsics.e(this.scannedUpc, cartItemResponse.scannedUpc) && Double.compare(this.quantityWeight, cartItemResponse.quantityWeight) == 0 && Intrinsics.e(this.itemDesc, cartItemResponse.itemDesc) && Intrinsics.e(this.pricingText, cartItemResponse.pricingText) && Double.compare(this.wasPrice, cartItemResponse.wasPrice) == 0 && Double.compare(this.nowPrice, cartItemResponse.nowPrice) == 0 && Double.compare(this.netPrice, cartItemResponse.netPrice) == 0 && Double.compare(this.netPriceWithDeposit, cartItemResponse.netPriceWithDeposit) == 0 && Double.compare(this.postAllocationPrice, cartItemResponse.postAllocationPrice) == 0 && Double.compare(this.deposit, cartItemResponse.deposit) == 0 && Double.compare(this.savings, cartItemResponse.savings) == 0 && Intrinsics.e(this.imageURL, cartItemResponse.imageURL) && this.prohibitQuantity == cartItemResponse.prohibitQuantity && this.isAutoVoided == cartItemResponse.isAutoVoided;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((Integer.hashCode(this.remoteId) * 31) + this.correlationId.hashCode()) * 31) + this.upc.hashCode()) * 31) + this.scannedUpc.hashCode()) * 31) + Double.hashCode(this.quantityWeight)) * 31) + this.itemDesc.hashCode()) * 31) + this.pricingText.hashCode()) * 31) + Double.hashCode(this.wasPrice)) * 31) + Double.hashCode(this.nowPrice)) * 31) + Double.hashCode(this.netPrice)) * 31) + Double.hashCode(this.netPriceWithDeposit)) * 31) + Double.hashCode(this.postAllocationPrice)) * 31) + Double.hashCode(this.deposit)) * 31) + Double.hashCode(this.savings)) * 31;
        String str = this.imageURL;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.prohibitQuantity)) * 31) + Boolean.hashCode(this.isAutoVoided);
    }

    public String toString() {
        return "CartItemResponse(remoteId=" + this.remoteId + ", correlationId=" + this.correlationId + ", upc=" + this.upc + ", scannedUpc=" + this.scannedUpc + ", quantityWeight=" + this.quantityWeight + ", itemDesc=" + this.itemDesc + ", pricingText=" + this.pricingText + ", wasPrice=" + this.wasPrice + ", nowPrice=" + this.nowPrice + ", netPrice=" + this.netPrice + ", netPriceWithDeposit=" + this.netPriceWithDeposit + ", postAllocationPrice=" + this.postAllocationPrice + ", deposit=" + this.deposit + ", savings=" + this.savings + ", imageURL=" + this.imageURL + ", prohibitQuantity=" + this.prohibitQuantity + ", isAutoVoided=" + this.isAutoVoided + ')';
    }

    public CartItemResponse(@g(name = "lineNumber") int i10, @g(name = "correlationId") String correlationId, @g(name = "upc") String upc, @g(name = "scannedUpc") String scannedUpc, @g(name = "quantityWeight") double d10, @g(name = "itemDesc") String itemDesc, @g(name = "pricingText") String pricingText, @g(name = "wasPrice") double d11, @g(name = "nowPrice") double d12, @g(name = "netPrice") double d13, @g(name = "netPriceWithDeposit") double d14, @g(name = "postAllocationPrice") double d15, @g(name = "deposit") double d16, @g(name = "savings") double d17, @g(name = "imageURL") String str, @g(name = "prohibitQuantity") boolean z10, @g(name = "isAutoVoided") boolean z11) {
        Intrinsics.j(correlationId, "correlationId");
        Intrinsics.j(upc, "upc");
        Intrinsics.j(scannedUpc, "scannedUpc");
        Intrinsics.j(itemDesc, "itemDesc");
        Intrinsics.j(pricingText, "pricingText");
        this.remoteId = i10;
        this.correlationId = correlationId;
        this.upc = upc;
        this.scannedUpc = scannedUpc;
        this.quantityWeight = d10;
        this.itemDesc = itemDesc;
        this.pricingText = pricingText;
        this.wasPrice = d11;
        this.nowPrice = d12;
        this.netPrice = d13;
        this.netPriceWithDeposit = d14;
        this.postAllocationPrice = d15;
        this.deposit = d16;
        this.savings = d17;
        this.imageURL = str;
        this.prohibitQuantity = z10;
        this.isAutoVoided = z11;
    }

    /* renamed from: a, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* renamed from: b, reason: from getter */
    public final double getDeposit() {
        return this.deposit;
    }

    /* renamed from: c, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: d, reason: from getter */
    public final String getItemDesc() {
        return this.itemDesc;
    }

    /* renamed from: e, reason: from getter */
    public final double getNetPrice() {
        return this.netPrice;
    }

    /* renamed from: f, reason: from getter */
    public final double getNetPriceWithDeposit() {
        return this.netPriceWithDeposit;
    }

    /* renamed from: g, reason: from getter */
    public final double getNowPrice() {
        return this.nowPrice;
    }

    /* renamed from: h, reason: from getter */
    public final double getPostAllocationPrice() {
        return this.postAllocationPrice;
    }

    /* renamed from: i, reason: from getter */
    public final String getPricingText() {
        return this.pricingText;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getProhibitQuantity() {
        return this.prohibitQuantity;
    }

    /* renamed from: k, reason: from getter */
    public final double getQuantityWeight() {
        return this.quantityWeight;
    }

    /* renamed from: l, reason: from getter */
    public final int getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: m, reason: from getter */
    public final double getSavings() {
        return this.savings;
    }

    /* renamed from: n, reason: from getter */
    public final String getScannedUpc() {
        return this.scannedUpc;
    }

    /* renamed from: o, reason: from getter */
    public final String getUpc() {
        return this.upc;
    }

    /* renamed from: p, reason: from getter */
    public final double getWasPrice() {
        return this.wasPrice;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsAutoVoided() {
        return this.isAutoVoided;
    }
}

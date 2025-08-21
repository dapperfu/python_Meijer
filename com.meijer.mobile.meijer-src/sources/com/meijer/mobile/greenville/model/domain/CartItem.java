package com.meijer.mobile.greenville.model.domain;

import Pk.Coupon;
import com.meijer.mobile.greenville.model.domain.TransactionException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B¹\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b&\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b,\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b/\u0010 R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010 R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b3\u00102R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b4\u00102R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00102R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b+\u00102R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b:\u00102R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010<\u001a\u0004\b;\u0010>R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u0010*\u001a\u0004\b-\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b)\u0010BR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b8\u0010ER\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/meijer/mobile/greenville/model/domain/a;", "", "", "remoteId", "", "correlationId", "upc", "scannedUpc", "", "quantityWeight", "itemDesc", "pricingText", "wasPrice", "nowPrice", "netPrice", "netPriceWithDeposit", "postAllocationPrice", "deposit", "savings", "", "isQuantityUpdateAllowed", "isAutoVoided", "imageURL", "LPk/a;", "coupon", "Lcom/meijer/mobile/greenville/model/domain/a$a;", "restriction", "Lcom/meijer/mobile/greenville/model/domain/TransactionException$ItemException;", "exception", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDDDDDDZZLjava/lang/String;LPk/a;Lcom/meijer/mobile/greenville/model/domain/a$a;Lcom/meijer/mobile/greenville/model/domain/TransactionException$ItemException;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "k", "b", "Ljava/lang/String;", "c", "getUpc", "d", "getScannedUpc", "e", "D", "j", "()D", "f", "g", "i", "h", "n", "l", "getPostAllocationPrice", "m", "o", "Z", "p", "()Z", "q", "r", "LPk/a;", "()LPk/a;", "s", "Lcom/meijer/mobile/greenville/model/domain/a$a;", "()Lcom/meijer/mobile/greenville/model/domain/a$a;", "t", "Lcom/meijer/mobile/greenville/model/domain/TransactionException$ItemException;", "getException", "()Lcom/meijer/mobile/greenville/model/domain/TransactionException$ItemException;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.greenville.model.domain.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class CartItem {

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
    private final boolean isQuantityUpdateAllowed;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoVoided;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coupon coupon;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Restriction restriction;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransactionException.ItemException exception;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/greenville/model/domain/a$a;", "", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.greenville.model.domain.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Restriction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Restriction)) {
                return false;
            }
            Restriction restriction = (Restriction) other;
            return Intrinsics.e(this.title, restriction.title) && Intrinsics.e(this.message, restriction.message);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Restriction(title=" + this.title + ", message=" + this.message + ')';
        }

        public Restriction(String title, String message) {
            Intrinsics.j(title, "title");
            Intrinsics.j(message, "message");
            this.title = title;
            this.message = message;
        }

        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    public CartItem(int i10, String correlationId, String upc, String scannedUpc, double d10, String itemDesc, String pricingText, double d11, double d12, double d13, double d14, double d15, double d16, double d17, boolean z10, boolean z11, String str, Coupon coupon, Restriction restriction, TransactionException.ItemException itemException) {
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
        this.isQuantityUpdateAllowed = z10;
        this.isAutoVoided = z11;
        this.imageURL = str;
        this.coupon = coupon;
        this.restriction = restriction;
        this.exception = itemException;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartItem)) {
            return false;
        }
        CartItem cartItem = (CartItem) other;
        return this.remoteId == cartItem.remoteId && Intrinsics.e(this.correlationId, cartItem.correlationId) && Intrinsics.e(this.upc, cartItem.upc) && Intrinsics.e(this.scannedUpc, cartItem.scannedUpc) && Double.compare(this.quantityWeight, cartItem.quantityWeight) == 0 && Intrinsics.e(this.itemDesc, cartItem.itemDesc) && Intrinsics.e(this.pricingText, cartItem.pricingText) && Double.compare(this.wasPrice, cartItem.wasPrice) == 0 && Double.compare(this.nowPrice, cartItem.nowPrice) == 0 && Double.compare(this.netPrice, cartItem.netPrice) == 0 && Double.compare(this.netPriceWithDeposit, cartItem.netPriceWithDeposit) == 0 && Double.compare(this.postAllocationPrice, cartItem.postAllocationPrice) == 0 && Double.compare(this.deposit, cartItem.deposit) == 0 && Double.compare(this.savings, cartItem.savings) == 0 && this.isQuantityUpdateAllowed == cartItem.isQuantityUpdateAllowed && this.isAutoVoided == cartItem.isAutoVoided && Intrinsics.e(this.imageURL, cartItem.imageURL) && Intrinsics.e(this.coupon, cartItem.coupon) && Intrinsics.e(this.restriction, cartItem.restriction) && Intrinsics.e(this.exception, cartItem.exception);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((Integer.hashCode(this.remoteId) * 31) + this.correlationId.hashCode()) * 31) + this.upc.hashCode()) * 31) + this.scannedUpc.hashCode()) * 31) + Double.hashCode(this.quantityWeight)) * 31) + this.itemDesc.hashCode()) * 31) + this.pricingText.hashCode()) * 31) + Double.hashCode(this.wasPrice)) * 31) + Double.hashCode(this.nowPrice)) * 31) + Double.hashCode(this.netPrice)) * 31) + Double.hashCode(this.netPriceWithDeposit)) * 31) + Double.hashCode(this.postAllocationPrice)) * 31) + Double.hashCode(this.deposit)) * 31) + Double.hashCode(this.savings)) * 31) + Boolean.hashCode(this.isQuantityUpdateAllowed)) * 31) + Boolean.hashCode(this.isAutoVoided)) * 31;
        String str = this.imageURL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Coupon coupon = this.coupon;
        int iHashCode3 = (iHashCode2 + (coupon == null ? 0 : coupon.hashCode())) * 31;
        Restriction restriction = this.restriction;
        int iHashCode4 = (iHashCode3 + (restriction == null ? 0 : restriction.hashCode())) * 31;
        TransactionException.ItemException itemException = this.exception;
        return iHashCode4 + (itemException != null ? itemException.hashCode() : 0);
    }

    public String toString() {
        return "CartItem(remoteId=" + this.remoteId + ", correlationId=" + this.correlationId + ", upc=" + this.upc + ", scannedUpc=" + this.scannedUpc + ", quantityWeight=" + this.quantityWeight + ", itemDesc=" + this.itemDesc + ", pricingText=" + this.pricingText + ", wasPrice=" + this.wasPrice + ", nowPrice=" + this.nowPrice + ", netPrice=" + this.netPrice + ", netPriceWithDeposit=" + this.netPriceWithDeposit + ", postAllocationPrice=" + this.postAllocationPrice + ", deposit=" + this.deposit + ", savings=" + this.savings + ", isQuantityUpdateAllowed=" + this.isQuantityUpdateAllowed + ", isAutoVoided=" + this.isAutoVoided + ", imageURL=" + this.imageURL + ", coupon=" + this.coupon + ", restriction=" + this.restriction + ", exception=" + this.exception + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* renamed from: b, reason: from getter */
    public final Coupon getCoupon() {
        return this.coupon;
    }

    /* renamed from: c, reason: from getter */
    public final double getDeposit() {
        return this.deposit;
    }

    /* renamed from: d, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: e, reason: from getter */
    public final String getItemDesc() {
        return this.itemDesc;
    }

    /* renamed from: f, reason: from getter */
    public final double getNetPrice() {
        return this.netPrice;
    }

    /* renamed from: g, reason: from getter */
    public final double getNetPriceWithDeposit() {
        return this.netPriceWithDeposit;
    }

    /* renamed from: h, reason: from getter */
    public final double getNowPrice() {
        return this.nowPrice;
    }

    /* renamed from: i, reason: from getter */
    public final String getPricingText() {
        return this.pricingText;
    }

    /* renamed from: j, reason: from getter */
    public final double getQuantityWeight() {
        return this.quantityWeight;
    }

    /* renamed from: k, reason: from getter */
    public final int getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: l, reason: from getter */
    public final Restriction getRestriction() {
        return this.restriction;
    }

    /* renamed from: m, reason: from getter */
    public final double getSavings() {
        return this.savings;
    }

    /* renamed from: n, reason: from getter */
    public final double getWasPrice() {
        return this.wasPrice;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsAutoVoided() {
        return this.isAutoVoided;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsQuantityUpdateAllowed() {
        return this.isQuantityUpdateAllowed;
    }

    public /* synthetic */ CartItem(int i10, String str, String str2, String str3, double d10, String str4, String str5, double d11, double d12, double d13, double d14, double d15, double d16, double d17, boolean z10, boolean z11, String str6, Coupon coupon, Restriction restriction, TransactionException.ItemException itemException, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, d10, str4, str5, d11, d12, d13, d14, d15, d16, d17, z10, z11, (i11 & 65536) != 0 ? null : str6, (i11 & 131072) != 0 ? null : coupon, (i11 & 262144) != 0 ? null : restriction, (i11 & 524288) != 0 ? null : itemException);
    }
}

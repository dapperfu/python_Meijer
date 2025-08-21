package com.meijer.mobile.greenville.model.response;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/TransactionObjectResponse;", "", "", "version", "Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;", "cartTotals", "", "Lcom/meijer/mobile/greenville/model/response/CartItemResponse;", "cartItems", "Lcom/meijer/mobile/greenville/model/response/TaxResponse;", "tax", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;Ljava/util/List;Lcom/meijer/mobile/greenville/model/response/TaxResponse;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;Ljava/util/List;Lcom/meijer/mobile/greenville/model/response/TaxResponse;)Lcom/meijer/mobile/greenville/model/response/TransactionObjectResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;", "()Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/meijer/mobile/greenville/model/response/TaxResponse;", "()Lcom/meijer/mobile/greenville/model/response/TaxResponse;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TransactionObjectResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartTotalsResponse cartTotals;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CartItemResponse> cartItems;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TaxResponse tax;

    public final TransactionObjectResponse copy(@g(name = "version") String version, @g(name = "cartTotals") CartTotalsResponse cartTotals, @g(name = "cartItems") List<CartItemResponse> cartItems, @g(name = "tax") TaxResponse tax) {
        Intrinsics.j(version, "version");
        Intrinsics.j(cartTotals, "cartTotals");
        Intrinsics.j(cartItems, "cartItems");
        return new TransactionObjectResponse(version, cartTotals, cartItems, tax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionObjectResponse)) {
            return false;
        }
        TransactionObjectResponse transactionObjectResponse = (TransactionObjectResponse) other;
        return Intrinsics.e(this.version, transactionObjectResponse.version) && Intrinsics.e(this.cartTotals, transactionObjectResponse.cartTotals) && Intrinsics.e(this.cartItems, transactionObjectResponse.cartItems) && Intrinsics.e(this.tax, transactionObjectResponse.tax);
    }

    public int hashCode() {
        int iHashCode = ((((this.version.hashCode() * 31) + this.cartTotals.hashCode()) * 31) + this.cartItems.hashCode()) * 31;
        TaxResponse taxResponse = this.tax;
        return iHashCode + (taxResponse == null ? 0 : taxResponse.hashCode());
    }

    public String toString() {
        return "TransactionObjectResponse(version=" + this.version + ", cartTotals=" + this.cartTotals + ", cartItems=" + this.cartItems + ", tax=" + this.tax + ')';
    }

    public TransactionObjectResponse(@g(name = "version") String version, @g(name = "cartTotals") CartTotalsResponse cartTotals, @g(name = "cartItems") List<CartItemResponse> cartItems, @g(name = "tax") TaxResponse taxResponse) {
        Intrinsics.j(version, "version");
        Intrinsics.j(cartTotals, "cartTotals");
        Intrinsics.j(cartItems, "cartItems");
        this.version = version;
        this.cartTotals = cartTotals;
        this.cartItems = cartItems;
        this.tax = taxResponse;
    }

    public final List<CartItemResponse> a() {
        return this.cartItems;
    }

    /* renamed from: b, reason: from getter */
    public final CartTotalsResponse getCartTotals() {
        return this.cartTotals;
    }

    /* renamed from: c, reason: from getter */
    public final TaxResponse getTax() {
        return this.tax;
    }

    /* renamed from: d, reason: from getter */
    public final String getVersion() {
        return this.version;
    }
}

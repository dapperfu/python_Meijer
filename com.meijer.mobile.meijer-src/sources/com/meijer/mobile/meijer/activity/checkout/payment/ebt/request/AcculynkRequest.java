package com.meijer.mobile.meijer.activity.checkout.payment.ebt.request;

import Jl.C3881c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\f\b\u0003\u0010\u0011\u001a\u00060\u0002j\u0002`\u0010\u0012\f\b\u0003\u0010\u0012\u001a\u00060\u0002j\u0002`\u0010\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJê\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00022\f\b\u0003\u0010\u0011\u001a\u00060\u0002j\u0002`\u00102\f\b\u0003\u0010\u0012\u001a\u00060\u0002j\u0002`\u00102\b\b\u0003\u0010\u0013\u001a\u00020\u00022\b\b\u0003\u0010\u0014\u001a\u00020\u00022\b\b\u0003\u0010\u0015\u001a\u00020\u00022\b\b\u0003\u0010\u0016\u001a\u00020\u00022\b\b\u0003\u0010\u0017\u001a\u00020\u00022\b\b\u0003\u0010\u0018\u001a\u00020\u00022\b\b\u0003\u0010\u0019\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b0\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b'\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b.\u00109R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b<\u0010\u001fR\u001b\u0010\u0011\u001a\u00060\u0002j\u0002`\u00108\u0006¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b,\u0010\u001fR\u001b\u0010\u0012\u001a\u00060\u0002j\u0002`\u00108\u0006¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b:\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b=\u0010\u001fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b>\u0010\u001fR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b*\u0010\u001fR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b6\u0010\u001f¨\u0006?"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkRequest;", "", "", "usrToken", "divInjectionId", "sapHost", "mjrHost", "transactionType", "transType", "amount", "previousTranId", "previousAmount", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "deliveryAddress", "panToken", "panExpDate", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "orderId", "unitId", "style", "iframePanId", "iframePinPadResponse", "iframeUrl", "apiUrl", "mjrApp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "u", "b", "e", "c", "p", "d", "j", "s", "f", "r", "g", "h", "o", "i", "n", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "k", "m", "l", "t", "q", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AcculynkRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String usrToken;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String divInjectionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sapHost;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mjrHost;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String previousTranId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String previousAmount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AcculynkDeliveryAddress deliveryAddress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String panToken;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String panExpDate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String style;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iframePanId;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iframePinPadResponse;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iframeUrl;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apiUrl;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mjrApp;

    public AcculynkRequest(@g(name = "usrToken") String usrToken, @g(name = "divInjectionId") String divInjectionId, @g(name = "sapHost") String sapHost, @g(name = "mjrHost") String mjrHost, @g(name = "transactionType") String transactionType, @g(name = "transType") String transType, @g(name = "amount") String amount, @g(name = "previousTranId") String previousTranId, @g(name = "previousAmount") String previousAmount, @g(name = "deliveryAddress") AcculynkDeliveryAddress deliveryAddress, @g(name = "panToken") String panToken, @g(name = "panExpDate") String panExpDate, @g(name = "cartId") String cartId, @g(name = "orderId") String orderId, @g(name = "unitId") String unitId, @g(name = "style") String style, @g(name = "iframePanId") String iframePanId, @g(name = "iframePinPadResponse") String iframePinPadResponse, @g(name = "iframeUrl") String iframeUrl, @g(name = "apiUrl") String apiUrl, @g(name = "mjrApp") String mjrApp) {
        Intrinsics.j(usrToken, "usrToken");
        Intrinsics.j(divInjectionId, "divInjectionId");
        Intrinsics.j(sapHost, "sapHost");
        Intrinsics.j(mjrHost, "mjrHost");
        Intrinsics.j(transactionType, "transactionType");
        Intrinsics.j(transType, "transType");
        Intrinsics.j(amount, "amount");
        Intrinsics.j(previousTranId, "previousTranId");
        Intrinsics.j(previousAmount, "previousAmount");
        Intrinsics.j(deliveryAddress, "deliveryAddress");
        Intrinsics.j(panToken, "panToken");
        Intrinsics.j(panExpDate, "panExpDate");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(unitId, "unitId");
        Intrinsics.j(style, "style");
        Intrinsics.j(iframePanId, "iframePanId");
        Intrinsics.j(iframePinPadResponse, "iframePinPadResponse");
        Intrinsics.j(iframeUrl, "iframeUrl");
        Intrinsics.j(apiUrl, "apiUrl");
        Intrinsics.j(mjrApp, "mjrApp");
        this.usrToken = usrToken;
        this.divInjectionId = divInjectionId;
        this.sapHost = sapHost;
        this.mjrHost = mjrHost;
        this.transactionType = transactionType;
        this.transType = transType;
        this.amount = amount;
        this.previousTranId = previousTranId;
        this.previousAmount = previousAmount;
        this.deliveryAddress = deliveryAddress;
        this.panToken = panToken;
        this.panExpDate = panExpDate;
        this.cartId = cartId;
        this.orderId = orderId;
        this.unitId = unitId;
        this.style = style;
        this.iframePanId = iframePanId;
        this.iframePinPadResponse = iframePinPadResponse;
        this.iframeUrl = iframeUrl;
        this.apiUrl = apiUrl;
        this.mjrApp = mjrApp;
    }

    public final AcculynkRequest copy(@g(name = "usrToken") String usrToken, @g(name = "divInjectionId") String divInjectionId, @g(name = "sapHost") String sapHost, @g(name = "mjrHost") String mjrHost, @g(name = "transactionType") String transactionType, @g(name = "transType") String transType, @g(name = "amount") String amount, @g(name = "previousTranId") String previousTranId, @g(name = "previousAmount") String previousAmount, @g(name = "deliveryAddress") AcculynkDeliveryAddress deliveryAddress, @g(name = "panToken") String panToken, @g(name = "panExpDate") String panExpDate, @g(name = "cartId") String cartId, @g(name = "orderId") String orderId, @g(name = "unitId") String unitId, @g(name = "style") String style, @g(name = "iframePanId") String iframePanId, @g(name = "iframePinPadResponse") String iframePinPadResponse, @g(name = "iframeUrl") String iframeUrl, @g(name = "apiUrl") String apiUrl, @g(name = "mjrApp") String mjrApp) {
        Intrinsics.j(usrToken, "usrToken");
        Intrinsics.j(divInjectionId, "divInjectionId");
        Intrinsics.j(sapHost, "sapHost");
        Intrinsics.j(mjrHost, "mjrHost");
        Intrinsics.j(transactionType, "transactionType");
        Intrinsics.j(transType, "transType");
        Intrinsics.j(amount, "amount");
        Intrinsics.j(previousTranId, "previousTranId");
        Intrinsics.j(previousAmount, "previousAmount");
        Intrinsics.j(deliveryAddress, "deliveryAddress");
        Intrinsics.j(panToken, "panToken");
        Intrinsics.j(panExpDate, "panExpDate");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(unitId, "unitId");
        Intrinsics.j(style, "style");
        Intrinsics.j(iframePanId, "iframePanId");
        Intrinsics.j(iframePinPadResponse, "iframePinPadResponse");
        Intrinsics.j(iframeUrl, "iframeUrl");
        Intrinsics.j(apiUrl, "apiUrl");
        Intrinsics.j(mjrApp, "mjrApp");
        return new AcculynkRequest(usrToken, divInjectionId, sapHost, mjrHost, transactionType, transType, amount, previousTranId, previousAmount, deliveryAddress, panToken, panExpDate, cartId, orderId, unitId, style, iframePanId, iframePinPadResponse, iframeUrl, apiUrl, mjrApp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcculynkRequest)) {
            return false;
        }
        AcculynkRequest acculynkRequest = (AcculynkRequest) other;
        return Intrinsics.e(this.usrToken, acculynkRequest.usrToken) && Intrinsics.e(this.divInjectionId, acculynkRequest.divInjectionId) && Intrinsics.e(this.sapHost, acculynkRequest.sapHost) && Intrinsics.e(this.mjrHost, acculynkRequest.mjrHost) && Intrinsics.e(this.transactionType, acculynkRequest.transactionType) && Intrinsics.e(this.transType, acculynkRequest.transType) && Intrinsics.e(this.amount, acculynkRequest.amount) && Intrinsics.e(this.previousTranId, acculynkRequest.previousTranId) && Intrinsics.e(this.previousAmount, acculynkRequest.previousAmount) && Intrinsics.e(this.deliveryAddress, acculynkRequest.deliveryAddress) && Intrinsics.e(this.panToken, acculynkRequest.panToken) && Intrinsics.e(this.panExpDate, acculynkRequest.panExpDate) && Intrinsics.e(this.cartId, acculynkRequest.cartId) && Intrinsics.e(this.orderId, acculynkRequest.orderId) && Intrinsics.e(this.unitId, acculynkRequest.unitId) && Intrinsics.e(this.style, acculynkRequest.style) && Intrinsics.e(this.iframePanId, acculynkRequest.iframePanId) && Intrinsics.e(this.iframePinPadResponse, acculynkRequest.iframePinPadResponse) && Intrinsics.e(this.iframeUrl, acculynkRequest.iframeUrl) && Intrinsics.e(this.apiUrl, acculynkRequest.apiUrl) && Intrinsics.e(this.mjrApp, acculynkRequest.mjrApp);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.usrToken.hashCode() * 31) + this.divInjectionId.hashCode()) * 31) + this.sapHost.hashCode()) * 31) + this.mjrHost.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + this.transType.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.previousTranId.hashCode()) * 31) + this.previousAmount.hashCode()) * 31) + this.deliveryAddress.hashCode()) * 31) + this.panToken.hashCode()) * 31) + this.panExpDate.hashCode()) * 31) + this.cartId.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.unitId.hashCode()) * 31) + this.style.hashCode()) * 31) + this.iframePanId.hashCode()) * 31) + this.iframePinPadResponse.hashCode()) * 31) + this.iframeUrl.hashCode()) * 31) + this.apiUrl.hashCode()) * 31) + this.mjrApp.hashCode();
    }

    public String toString() {
        return "AcculynkRequest(usrToken=" + this.usrToken + ", divInjectionId=" + this.divInjectionId + ", sapHost=" + this.sapHost + ", mjrHost=" + this.mjrHost + ", transactionType=" + this.transactionType + ", transType=" + this.transType + ", amount=" + this.amount + ", previousTranId=" + this.previousTranId + ", previousAmount=" + this.previousAmount + ", deliveryAddress=" + this.deliveryAddress + ", panToken=" + this.panToken + ", panExpDate=" + this.panExpDate + ", cartId=" + this.cartId + ", orderId=" + this.orderId + ", unitId=" + this.unitId + ", style=" + this.style + ", iframePanId=" + this.iframePanId + ", iframePinPadResponse=" + this.iframePinPadResponse + ", iframeUrl=" + this.iframeUrl + ", apiUrl=" + this.apiUrl + ", mjrApp=" + this.mjrApp + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: b, reason: from getter */
    public final String getApiUrl() {
        return this.apiUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* renamed from: d, reason: from getter */
    public final AcculynkDeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* renamed from: e, reason: from getter */
    public final String getDivInjectionId() {
        return this.divInjectionId;
    }

    /* renamed from: f, reason: from getter */
    public final String getIframePanId() {
        return this.iframePanId;
    }

    /* renamed from: g, reason: from getter */
    public final String getIframePinPadResponse() {
        return this.iframePinPadResponse;
    }

    /* renamed from: h, reason: from getter */
    public final String getIframeUrl() {
        return this.iframeUrl;
    }

    /* renamed from: i, reason: from getter */
    public final String getMjrApp() {
        return this.mjrApp;
    }

    /* renamed from: j, reason: from getter */
    public final String getMjrHost() {
        return this.mjrHost;
    }

    /* renamed from: k, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: l, reason: from getter */
    public final String getPanExpDate() {
        return this.panExpDate;
    }

    /* renamed from: m, reason: from getter */
    public final String getPanToken() {
        return this.panToken;
    }

    /* renamed from: n, reason: from getter */
    public final String getPreviousAmount() {
        return this.previousAmount;
    }

    /* renamed from: o, reason: from getter */
    public final String getPreviousTranId() {
        return this.previousTranId;
    }

    /* renamed from: p, reason: from getter */
    public final String getSapHost() {
        return this.sapHost;
    }

    /* renamed from: q, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: r, reason: from getter */
    public final String getTransType() {
        return this.transType;
    }

    /* renamed from: s, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: t, reason: from getter */
    public final String getUnitId() {
        return this.unitId;
    }

    /* renamed from: u, reason: from getter */
    public final String getUsrToken() {
        return this.usrToken;
    }

    public /* synthetic */ AcculynkRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AcculynkDeliveryAddress acculynkDeliveryAddress, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "div-inject-iframe" : str2, (i10 & 4) != 0 ? C3881c.f15937a.h().getUrl() : str3, (i10 & 8) != 0 ? C3881c.f15937a.h().getUrl() : str4, (i10 & 16) != 0 ? "balance" : str5, (i10 & 32) != 0 ? "SNAP" : str6, (i10 & 64) != 0 ? "" : str7, (i10 & 128) != 0 ? "" : str8, (i10 & 256) != 0 ? "" : str9, (i10 & 512) != 0 ? new AcculynkDeliveryAddress(null, null, null, null, null, 31, null) : acculynkDeliveryAddress, (i10 & 1024) != 0 ? "" : str10, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str11, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "-1" : str12, (i10 & 8192) == 0 ? str13 : "-1", (i10 & 16384) == 0 ? str14 : "", (32768 & i10) != 0 ? "height:600px;width:100%;border:none;" : str15, (i10 & 65536) != 0 ? "iframe-ebt-pin-id" : str16, (i10 & 131072) != 0 ? "iframe-ebt-pinpad-response-id" : str17, (i10 & 262144) != 0 ? "/Ebt/InitiatePinpad" : str18, (i10 & 524288) != 0 ? "/Ebt/Pinpad" : str19, (i10 & 1048576) != 0 ? "/DRTrxPan" : str20);
    }
}

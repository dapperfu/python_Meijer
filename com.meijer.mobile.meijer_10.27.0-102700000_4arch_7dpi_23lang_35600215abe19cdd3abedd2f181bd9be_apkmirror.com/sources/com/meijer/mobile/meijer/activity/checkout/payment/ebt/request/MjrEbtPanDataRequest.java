package com.meijer.mobile.meijer.activity.checkout.payment.ebt.request;

import Il.C3755c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0001\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b%\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b+\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010\u0016¨\u0006."}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/MjrEbtPanDataRequest;", "", "", "usrToken", "divInjectionId", "mjrHost", "cartId", "iframePanId", "inputPanId", "inputExpId", "apiUrl", "iframeUrl", "mjrApp", "style", "inputExpMonthId", "inputExpYearId", "sapHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/MjrEbtPanDataRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "o", "b", "d", "c", "l", "e", "f", "j", "g", "h", "i", "k", "n", "m", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MjrEbtPanDataRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String usrToken;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String divInjectionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mjrHost;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iframePanId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inputPanId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inputExpId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apiUrl;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iframeUrl;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mjrApp;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String style;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inputExpMonthId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inputExpYearId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sapHost;

    public MjrEbtPanDataRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final MjrEbtPanDataRequest copy(@g(name = "usrToken") String usrToken, @g(name = "divInjectionId") String divInjectionId, @g(name = "mjrHost") String mjrHost, @g(name = "cartId") String cartId, @g(name = "iframePanId") String iframePanId, @g(name = "inputPanId") String inputPanId, @g(name = "inputExpId") String inputExpId, @g(name = "apiUrl") String apiUrl, @g(name = "iframeUrl") String iframeUrl, @g(name = "mjrApp") String mjrApp, @g(name = "style") String style, @g(name = "inputExpMonthId") String inputExpMonthId, @g(name = "inputExpYearId") String inputExpYearId, @g(name = "sapHost") String sapHost) {
        Intrinsics.j(divInjectionId, "divInjectionId");
        Intrinsics.j(mjrHost, "mjrHost");
        Intrinsics.j(iframePanId, "iframePanId");
        Intrinsics.j(inputPanId, "inputPanId");
        Intrinsics.j(inputExpId, "inputExpId");
        Intrinsics.j(apiUrl, "apiUrl");
        Intrinsics.j(iframeUrl, "iframeUrl");
        Intrinsics.j(mjrApp, "mjrApp");
        Intrinsics.j(style, "style");
        Intrinsics.j(inputExpMonthId, "inputExpMonthId");
        Intrinsics.j(inputExpYearId, "inputExpYearId");
        Intrinsics.j(sapHost, "sapHost");
        return new MjrEbtPanDataRequest(usrToken, divInjectionId, mjrHost, cartId, iframePanId, inputPanId, inputExpId, apiUrl, iframeUrl, mjrApp, style, inputExpMonthId, inputExpYearId, sapHost);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MjrEbtPanDataRequest)) {
            return false;
        }
        MjrEbtPanDataRequest mjrEbtPanDataRequest = (MjrEbtPanDataRequest) other;
        return Intrinsics.e(this.usrToken, mjrEbtPanDataRequest.usrToken) && Intrinsics.e(this.divInjectionId, mjrEbtPanDataRequest.divInjectionId) && Intrinsics.e(this.mjrHost, mjrEbtPanDataRequest.mjrHost) && Intrinsics.e(this.cartId, mjrEbtPanDataRequest.cartId) && Intrinsics.e(this.iframePanId, mjrEbtPanDataRequest.iframePanId) && Intrinsics.e(this.inputPanId, mjrEbtPanDataRequest.inputPanId) && Intrinsics.e(this.inputExpId, mjrEbtPanDataRequest.inputExpId) && Intrinsics.e(this.apiUrl, mjrEbtPanDataRequest.apiUrl) && Intrinsics.e(this.iframeUrl, mjrEbtPanDataRequest.iframeUrl) && Intrinsics.e(this.mjrApp, mjrEbtPanDataRequest.mjrApp) && Intrinsics.e(this.style, mjrEbtPanDataRequest.style) && Intrinsics.e(this.inputExpMonthId, mjrEbtPanDataRequest.inputExpMonthId) && Intrinsics.e(this.inputExpYearId, mjrEbtPanDataRequest.inputExpYearId) && Intrinsics.e(this.sapHost, mjrEbtPanDataRequest.sapHost);
    }

    public int hashCode() {
        String str = this.usrToken;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.divInjectionId.hashCode()) * 31) + this.mjrHost.hashCode()) * 31;
        String str2 = this.cartId;
        return ((((((((((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.iframePanId.hashCode()) * 31) + this.inputPanId.hashCode()) * 31) + this.inputExpId.hashCode()) * 31) + this.apiUrl.hashCode()) * 31) + this.iframeUrl.hashCode()) * 31) + this.mjrApp.hashCode()) * 31) + this.style.hashCode()) * 31) + this.inputExpMonthId.hashCode()) * 31) + this.inputExpYearId.hashCode()) * 31) + this.sapHost.hashCode();
    }

    public String toString() {
        return "MjrEbtPanDataRequest(usrToken=" + this.usrToken + ", divInjectionId=" + this.divInjectionId + ", mjrHost=" + this.mjrHost + ", cartId=" + this.cartId + ", iframePanId=" + this.iframePanId + ", inputPanId=" + this.inputPanId + ", inputExpId=" + this.inputExpId + ", apiUrl=" + this.apiUrl + ", iframeUrl=" + this.iframeUrl + ", mjrApp=" + this.mjrApp + ", style=" + this.style + ", inputExpMonthId=" + this.inputExpMonthId + ", inputExpYearId=" + this.inputExpYearId + ", sapHost=" + this.sapHost + ')';
    }

    public MjrEbtPanDataRequest(@g(name = "usrToken") String str, @g(name = "divInjectionId") String divInjectionId, @g(name = "mjrHost") String mjrHost, @g(name = "cartId") String str2, @g(name = "iframePanId") String iframePanId, @g(name = "inputPanId") String inputPanId, @g(name = "inputExpId") String inputExpId, @g(name = "apiUrl") String apiUrl, @g(name = "iframeUrl") String iframeUrl, @g(name = "mjrApp") String mjrApp, @g(name = "style") String style, @g(name = "inputExpMonthId") String inputExpMonthId, @g(name = "inputExpYearId") String inputExpYearId, @g(name = "sapHost") String sapHost) {
        Intrinsics.j(divInjectionId, "divInjectionId");
        Intrinsics.j(mjrHost, "mjrHost");
        Intrinsics.j(iframePanId, "iframePanId");
        Intrinsics.j(inputPanId, "inputPanId");
        Intrinsics.j(inputExpId, "inputExpId");
        Intrinsics.j(apiUrl, "apiUrl");
        Intrinsics.j(iframeUrl, "iframeUrl");
        Intrinsics.j(mjrApp, "mjrApp");
        Intrinsics.j(style, "style");
        Intrinsics.j(inputExpMonthId, "inputExpMonthId");
        Intrinsics.j(inputExpYearId, "inputExpYearId");
        Intrinsics.j(sapHost, "sapHost");
        this.usrToken = str;
        this.divInjectionId = divInjectionId;
        this.mjrHost = mjrHost;
        this.cartId = str2;
        this.iframePanId = iframePanId;
        this.inputPanId = inputPanId;
        this.inputExpId = inputExpId;
        this.apiUrl = apiUrl;
        this.iframeUrl = iframeUrl;
        this.mjrApp = mjrApp;
        this.style = style;
        this.inputExpMonthId = inputExpMonthId;
        this.inputExpYearId = inputExpYearId;
        this.sapHost = sapHost;
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
    public final String getDivInjectionId() {
        return this.divInjectionId;
    }

    /* renamed from: e, reason: from getter */
    public final String getIframePanId() {
        return this.iframePanId;
    }

    /* renamed from: f, reason: from getter */
    public final String getIframeUrl() {
        return this.iframeUrl;
    }

    /* renamed from: g, reason: from getter */
    public final String getInputExpId() {
        return this.inputExpId;
    }

    /* renamed from: h, reason: from getter */
    public final String getInputExpMonthId() {
        return this.inputExpMonthId;
    }

    /* renamed from: i, reason: from getter */
    public final String getInputExpYearId() {
        return this.inputExpYearId;
    }

    /* renamed from: j, reason: from getter */
    public final String getInputPanId() {
        return this.inputPanId;
    }

    /* renamed from: k, reason: from getter */
    public final String getMjrApp() {
        return this.mjrApp;
    }

    /* renamed from: l, reason: from getter */
    public final String getMjrHost() {
        return this.mjrHost;
    }

    /* renamed from: m, reason: from getter */
    public final String getSapHost() {
        return this.sapHost;
    }

    /* renamed from: n, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: o, reason: from getter */
    public final String getUsrToken() {
        return this.usrToken;
    }

    public /* synthetic */ MjrEbtPanDataRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "div-inject-iframe" : str2, (i10 & 4) != 0 ? C3755c.f14105a.h().getUrl() : str3, (i10 & 8) == 0 ? str4 : null, (i10 & 16) != 0 ? "iframe-ebt-pan-id" : str5, (i10 & 32) != 0 ? "input-ebt-pan-id" : str6, (i10 & 64) != 0 ? "input-ebt-exp-id" : str7, (i10 & 128) != 0 ? "/Ebt/PanPost" : str8, (i10 & 256) != 0 ? "/Ebt/Pan" : str9, (i10 & 512) != 0 ? "/DRTrxPan" : str10, (i10 & 1024) != 0 ? "" : str11, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? "input-ebt-exp-month-id" : str12, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "input-ebt-exp-year-id" : str13, (i10 & 8192) != 0 ? C3755c.f14105a.h().getUrl() : str14);
    }
}

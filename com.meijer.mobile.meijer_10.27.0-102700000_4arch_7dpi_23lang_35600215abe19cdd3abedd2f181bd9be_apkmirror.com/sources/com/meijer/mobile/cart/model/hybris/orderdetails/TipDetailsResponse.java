package com.meijer.mobile.cart.model.hybris.orderdetails;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jl\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b\"\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0014¨\u0006+"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;", "", "", "tipOrderCode", "", "tipped", "preTip", "preTipStatus", "status", "authCode", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "tipAmount", "", "percent", "date", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;DLjava/lang/String;)V", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;DLjava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "Z", "i", "()Z", "c", "d", "e", "f", "g", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "D", "()D", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TipDetailsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipOrderCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipped;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean preTip;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preTipStatus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice tipAmount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double percent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    public TipDetailsResponse() {
        this(null, false, false, null, null, null, null, 0.0d, null, 511, null);
    }

    public final TipDetailsResponse copy(@g(name = "tipOrderCode") String tipOrderCode, @g(name = "tipped") boolean tipped, @g(name = "preTip") boolean preTip, @g(name = "preTipStatus") String preTipStatus, @g(name = "status") String status, @g(name = "authCode") String authCode, @g(name = "amount") HybrisPrice tipAmount, @g(name = "percent") double percent, @g(name = "date") String date) {
        Intrinsics.j(tipOrderCode, "tipOrderCode");
        Intrinsics.j(preTipStatus, "preTipStatus");
        Intrinsics.j(status, "status");
        Intrinsics.j(authCode, "authCode");
        Intrinsics.j(tipAmount, "tipAmount");
        return new TipDetailsResponse(tipOrderCode, tipped, preTip, preTipStatus, status, authCode, tipAmount, percent, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipDetailsResponse)) {
            return false;
        }
        TipDetailsResponse tipDetailsResponse = (TipDetailsResponse) other;
        return Intrinsics.e(this.tipOrderCode, tipDetailsResponse.tipOrderCode) && this.tipped == tipDetailsResponse.tipped && this.preTip == tipDetailsResponse.preTip && Intrinsics.e(this.preTipStatus, tipDetailsResponse.preTipStatus) && Intrinsics.e(this.status, tipDetailsResponse.status) && Intrinsics.e(this.authCode, tipDetailsResponse.authCode) && Intrinsics.e(this.tipAmount, tipDetailsResponse.tipAmount) && Double.compare(this.percent, tipDetailsResponse.percent) == 0 && Intrinsics.e(this.date, tipDetailsResponse.date);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.tipOrderCode.hashCode() * 31) + Boolean.hashCode(this.tipped)) * 31) + Boolean.hashCode(this.preTip)) * 31) + this.preTipStatus.hashCode()) * 31) + this.status.hashCode()) * 31) + this.authCode.hashCode()) * 31) + this.tipAmount.hashCode()) * 31) + Double.hashCode(this.percent)) * 31;
        String str = this.date;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TipDetailsResponse(tipOrderCode=" + this.tipOrderCode + ", tipped=" + this.tipped + ", preTip=" + this.preTip + ", preTipStatus=" + this.preTipStatus + ", status=" + this.status + ", authCode=" + this.authCode + ", tipAmount=" + this.tipAmount + ", percent=" + this.percent + ", date=" + this.date + ')';
    }

    public TipDetailsResponse(@g(name = "tipOrderCode") String tipOrderCode, @g(name = "tipped") boolean z10, @g(name = "preTip") boolean z11, @g(name = "preTipStatus") String preTipStatus, @g(name = "status") String status, @g(name = "authCode") String authCode, @g(name = "amount") HybrisPrice tipAmount, @g(name = "percent") double d10, @g(name = "date") String str) {
        Intrinsics.j(tipOrderCode, "tipOrderCode");
        Intrinsics.j(preTipStatus, "preTipStatus");
        Intrinsics.j(status, "status");
        Intrinsics.j(authCode, "authCode");
        Intrinsics.j(tipAmount, "tipAmount");
        this.tipOrderCode = tipOrderCode;
        this.tipped = z10;
        this.preTip = z11;
        this.preTipStatus = preTipStatus;
        this.status = status;
        this.authCode = authCode;
        this.tipAmount = tipAmount;
        this.percent = d10;
        this.date = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: c, reason: from getter */
    public final double getPercent() {
        return this.percent;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getPreTip() {
        return this.preTip;
    }

    /* renamed from: e, reason: from getter */
    public final String getPreTipStatus() {
        return this.preTipStatus;
    }

    /* renamed from: f, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: g, reason: from getter */
    public final HybrisPrice getTipAmount() {
        return this.tipAmount;
    }

    /* renamed from: h, reason: from getter */
    public final String getTipOrderCode() {
        return this.tipOrderCode;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getTipped() {
        return this.tipped;
    }

    public /* synthetic */ TipDetailsResponse(String str, boolean z10, boolean z11, String str2, String str3, String str4, HybrisPrice hybrisPrice, double d10, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) == 0 ? z11 : false, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? "" : str3, (i10 & 32) == 0 ? str4 : "", (i10 & 64) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice, (i10 & 128) != 0 ? 0.0d : d10, (i10 & 256) != 0 ? null : str5);
    }
}

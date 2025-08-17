package com.meijer.mobile.meijer.activity.checkout.payment.ebt.response;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0001\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b)\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;", "", "", "approvalCode", "tranId", "network", "cvn", "", "remainingBalanceCash", "cashCurrencyCode", "remainingBalanceSNAP", "snapCurrencyCode", "responseCode", "errorCode", "errorMessage", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "l", "c", "f", "d", "e", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "h", "j", "i", "k", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EbtAcculynkResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String approvalCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tranId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String network;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cvn;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer remainingBalanceCash;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cashCurrencyCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer remainingBalanceSNAP;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String snapCurrencyCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String responseCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorCode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    public EbtAcculynkResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, l3.f92483b, null);
    }

    public final EbtAcculynkResponse copy(@g(name = "approvalCode") String approvalCode, @g(name = "tranId") String tranId, @g(name = "network") String network, @g(name = "cvn") String cvn, @g(name = "remainingBalanceCash") Integer remainingBalanceCash, @g(name = "cashCurrencyCode") String cashCurrencyCode, @g(name = "remainingBalanceSNAP") Integer remainingBalanceSNAP, @g(name = "snapCurrencyCode") String snapCurrencyCode, @g(name = "responseCode") String responseCode, @g(name = "errorCode") String errorCode, @g(name = "errorMessage") String errorMessage, @g(name = "token") String token) {
        return new EbtAcculynkResponse(approvalCode, tranId, network, cvn, remainingBalanceCash, cashCurrencyCode, remainingBalanceSNAP, snapCurrencyCode, responseCode, errorCode, errorMessage, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtAcculynkResponse)) {
            return false;
        }
        EbtAcculynkResponse ebtAcculynkResponse = (EbtAcculynkResponse) other;
        return Intrinsics.e(this.approvalCode, ebtAcculynkResponse.approvalCode) && Intrinsics.e(this.tranId, ebtAcculynkResponse.tranId) && Intrinsics.e(this.network, ebtAcculynkResponse.network) && Intrinsics.e(this.cvn, ebtAcculynkResponse.cvn) && Intrinsics.e(this.remainingBalanceCash, ebtAcculynkResponse.remainingBalanceCash) && Intrinsics.e(this.cashCurrencyCode, ebtAcculynkResponse.cashCurrencyCode) && Intrinsics.e(this.remainingBalanceSNAP, ebtAcculynkResponse.remainingBalanceSNAP) && Intrinsics.e(this.snapCurrencyCode, ebtAcculynkResponse.snapCurrencyCode) && Intrinsics.e(this.responseCode, ebtAcculynkResponse.responseCode) && Intrinsics.e(this.errorCode, ebtAcculynkResponse.errorCode) && Intrinsics.e(this.errorMessage, ebtAcculynkResponse.errorMessage) && Intrinsics.e(this.token, ebtAcculynkResponse.token);
    }

    public int hashCode() {
        String str = this.approvalCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tranId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.network;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cvn;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.remainingBalanceCash;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.cashCurrencyCode;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.remainingBalanceSNAP;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.snapCurrencyCode;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.responseCode;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.errorCode;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.errorMessage;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.token;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "EbtAcculynkResponse(approvalCode=" + this.approvalCode + ", tranId=" + this.tranId + ", network=" + this.network + ", cvn=" + this.cvn + ", remainingBalanceCash=" + this.remainingBalanceCash + ", cashCurrencyCode=" + this.cashCurrencyCode + ", remainingBalanceSNAP=" + this.remainingBalanceSNAP + ", snapCurrencyCode=" + this.snapCurrencyCode + ", responseCode=" + this.responseCode + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", token=" + this.token + ')';
    }

    public EbtAcculynkResponse(@g(name = "approvalCode") String str, @g(name = "tranId") String str2, @g(name = "network") String str3, @g(name = "cvn") String str4, @g(name = "remainingBalanceCash") Integer num, @g(name = "cashCurrencyCode") String str5, @g(name = "remainingBalanceSNAP") Integer num2, @g(name = "snapCurrencyCode") String str6, @g(name = "responseCode") String str7, @g(name = "errorCode") String str8, @g(name = "errorMessage") String str9, @g(name = "token") String str10) {
        this.approvalCode = str;
        this.tranId = str2;
        this.network = str3;
        this.cvn = str4;
        this.remainingBalanceCash = num;
        this.cashCurrencyCode = str5;
        this.remainingBalanceSNAP = num2;
        this.snapCurrencyCode = str6;
        this.responseCode = str7;
        this.errorCode = str8;
        this.errorMessage = str9;
        this.token = str10;
    }

    /* renamed from: a, reason: from getter */
    public final String getApprovalCode() {
        return this.approvalCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getCashCurrencyCode() {
        return this.cashCurrencyCode;
    }

    /* renamed from: c, reason: from getter */
    public final String getCvn() {
        return this.cvn;
    }

    /* renamed from: d, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: e, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: f, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getRemainingBalanceCash() {
        return this.remainingBalanceCash;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getRemainingBalanceSNAP() {
        return this.remainingBalanceSNAP;
    }

    /* renamed from: i, reason: from getter */
    public final String getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: j, reason: from getter */
    public final String getSnapCurrencyCode() {
        return this.snapCurrencyCode;
    }

    /* renamed from: k, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: l, reason: from getter */
    public final String getTranId() {
        return this.tranId;
    }

    public /* synthetic */ EbtAcculynkResponse(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : num2, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? null : str8, (i10 & 1024) != 0 ? null : str9, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str10);
    }
}

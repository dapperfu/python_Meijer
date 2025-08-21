package com.meijer.mobile.meijer.activity.checkout.payment.ebt.response;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ^\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "", "", "token", "mask", "source", "cardExpiration", "responseCode", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "d", "c", "f", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EbtPanResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mask;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardExpiration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String responseCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    public EbtPanResponse(@g(name = "token") String str, @g(name = "mask") String str2, @g(name = "source") String str3, @g(name = "cardExpiration") String str4, @g(name = "responseCode") String responseCode, @g(name = "errorCode") String errorCode, @g(name = "errorMessage") String errorMessage) {
        Intrinsics.j(responseCode, "responseCode");
        Intrinsics.j(errorCode, "errorCode");
        Intrinsics.j(errorMessage, "errorMessage");
        this.token = str;
        this.mask = str2;
        this.source = str3;
        this.cardExpiration = str4;
        this.responseCode = responseCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public final EbtPanResponse copy(@g(name = "token") String token, @g(name = "mask") String mask, @g(name = "source") String source, @g(name = "cardExpiration") String cardExpiration, @g(name = "responseCode") String responseCode, @g(name = "errorCode") String errorCode, @g(name = "errorMessage") String errorMessage) {
        Intrinsics.j(responseCode, "responseCode");
        Intrinsics.j(errorCode, "errorCode");
        Intrinsics.j(errorMessage, "errorMessage");
        return new EbtPanResponse(token, mask, source, cardExpiration, responseCode, errorCode, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtPanResponse)) {
            return false;
        }
        EbtPanResponse ebtPanResponse = (EbtPanResponse) other;
        return Intrinsics.e(this.token, ebtPanResponse.token) && Intrinsics.e(this.mask, ebtPanResponse.mask) && Intrinsics.e(this.source, ebtPanResponse.source) && Intrinsics.e(this.cardExpiration, ebtPanResponse.cardExpiration) && Intrinsics.e(this.responseCode, ebtPanResponse.responseCode) && Intrinsics.e(this.errorCode, ebtPanResponse.errorCode) && Intrinsics.e(this.errorMessage, ebtPanResponse.errorMessage);
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mask;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardExpiration;
        return ((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.responseCode.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "EbtPanResponse(token=" + this.token + ", mask=" + this.mask + ", source=" + this.source + ", cardExpiration=" + this.cardExpiration + ", responseCode=" + this.responseCode + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCardExpiration() {
        return this.cardExpiration;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: c, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: d, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    /* renamed from: e, reason: from getter */
    public final String getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: f, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: g, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EbtPanResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        String str10;
        String str11;
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        str3 = (i10 & 4) != 0 ? null : str3;
        if ((i10 & 8) != 0) {
            str8 = str7;
            str9 = str6;
            str10 = str5;
            str11 = null;
        } else {
            str8 = str7;
            str9 = str6;
            str10 = str5;
            str11 = str4;
        }
        this(str, str2, str3, str11, str10, str9, str8);
    }
}

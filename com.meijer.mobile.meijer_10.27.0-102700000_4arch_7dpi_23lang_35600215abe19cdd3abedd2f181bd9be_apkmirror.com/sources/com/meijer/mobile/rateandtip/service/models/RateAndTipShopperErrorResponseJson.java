package com.meijer.mobile.rateandtip.service.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/rateandtip/service/models/RateAndTipShopperErrorResponseJson;", "", "", "success", "", "errorType", "message", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/rateandtip/service/models/RateAndTipShopperErrorResponseJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/String;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RateAndTipShopperErrorResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public RateAndTipShopperErrorResponseJson() {
        this(false, null, null, 7, null);
    }

    public final RateAndTipShopperErrorResponseJson copy(@g(name = "success") boolean success, @g(name = "error_type") String errorType, @g(name = "message") String message) {
        return new RateAndTipShopperErrorResponseJson(success, errorType, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateAndTipShopperErrorResponseJson)) {
            return false;
        }
        RateAndTipShopperErrorResponseJson rateAndTipShopperErrorResponseJson = (RateAndTipShopperErrorResponseJson) other;
        return this.success == rateAndTipShopperErrorResponseJson.success && Intrinsics.e(this.errorType, rateAndTipShopperErrorResponseJson.errorType) && Intrinsics.e(this.message, rateAndTipShopperErrorResponseJson.message);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.errorType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RateAndTipShopperErrorResponseJson(success=" + this.success + ", errorType=" + this.errorType + ", message=" + this.message + ')';
    }

    public RateAndTipShopperErrorResponseJson(@g(name = "success") boolean z10, @g(name = "error_type") String str, @g(name = "message") String str2) {
        this.success = z10;
        this.errorType = str;
        this.message = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ RateAndTipShopperErrorResponseJson(boolean z10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}

package uh;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0004\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"Luh/f;", "", "", "success", "isCardValid", "", "errorMessage", "token", "tokenType", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "Ljava/lang/String;", "getErrorMessage", "d", "getToken", "e", "getTokenType", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class PaymentInfoResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCardValid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tokenType;

    public PaymentInfoResponse() {
        this(false, false, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoResponse)) {
            return false;
        }
        PaymentInfoResponse paymentInfoResponse = (PaymentInfoResponse) other;
        return this.success == paymentInfoResponse.success && this.isCardValid == paymentInfoResponse.isCardValid && Intrinsics.e(this.errorMessage, paymentInfoResponse.errorMessage) && Intrinsics.e(this.token, paymentInfoResponse.token) && Intrinsics.e(this.tokenType, paymentInfoResponse.tokenType);
    }

    public PaymentInfoResponse(boolean z10, boolean z11, String str, String str2, String str3) {
        this.success = z10;
        this.isCardValid = z11;
        this.errorMessage = str;
        this.token = str2;
        this.tokenType = str3;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.isCardValid)) * 31;
        String str = this.errorMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.token;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "PaymentInfoResponse(success=" + this.success + ", isCardValid=" + this.isCardValid + ", errorMessage=" + this.errorMessage + ", token=" + this.token + ", tokenType=" + this.tokenType + ')';
    }

    public /* synthetic */ PaymentInfoResponse(boolean z10, boolean z11, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
    }
}

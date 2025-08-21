package Fh;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, d2 = {"LFh/d;", "", "", "isSuccess", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "setSuccess", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Fh.d, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class EnrollmentOfferResendEmailResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("isSuccess")
    private boolean isSuccess;

    public EnrollmentOfferResendEmailResponse() {
        this(false, 1, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EnrollmentOfferResendEmailResponse) && this.isSuccess == ((EnrollmentOfferResendEmailResponse) other).isSuccess;
    }

    public EnrollmentOfferResendEmailResponse(boolean z10) {
        this.isSuccess = z10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSuccess);
    }

    public String toString() {
        return "EnrollmentOfferResendEmailResponse(isSuccess=" + this.isSuccess + ')';
    }

    public /* synthetic */ EnrollmentOfferResendEmailResponse(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}

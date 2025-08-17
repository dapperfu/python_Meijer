package mr;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uh.AccountCreditCard;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0007\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lmr/q;", "", "", "isCheckoutSubscriptionLoading", "", "Luh/a;", "payments", "isSuccess", "", "errorMessage", "<init>", "(ZLjava/util/List;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/util/List;", "getPayments", "()Ljava/util/List;", "c", "d", "Ljava/lang/String;", "getErrorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mr.q, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class PaymentsViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckoutSubscriptionLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AccountCreditCard> payments;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    public PaymentsViewState() {
        this(false, null, false, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsViewState)) {
            return false;
        }
        PaymentsViewState paymentsViewState = (PaymentsViewState) other;
        return this.isCheckoutSubscriptionLoading == paymentsViewState.isCheckoutSubscriptionLoading && Intrinsics.e(this.payments, paymentsViewState.payments) && this.isSuccess == paymentsViewState.isSuccess && Intrinsics.e(this.errorMessage, paymentsViewState.errorMessage);
    }

    public PaymentsViewState(boolean z10, List<AccountCreditCard> payments, boolean z11, String str) {
        Intrinsics.j(payments, "payments");
        this.isCheckoutSubscriptionLoading = z10;
        this.payments = payments;
        this.isSuccess = z11;
        this.errorMessage = str;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isCheckoutSubscriptionLoading) * 31) + this.payments.hashCode()) * 31) + Boolean.hashCode(this.isSuccess)) * 31;
        String str = this.errorMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PaymentsViewState(isCheckoutSubscriptionLoading=" + this.isCheckoutSubscriptionLoading + ", payments=" + this.payments + ", isSuccess=" + this.isSuccess + ", errorMessage=" + this.errorMessage + ')';
    }

    public /* synthetic */ PaymentsViewState(boolean z10, List list, boolean z11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? true : z11, (i10 & 8) != 0 ? null : str);
    }
}

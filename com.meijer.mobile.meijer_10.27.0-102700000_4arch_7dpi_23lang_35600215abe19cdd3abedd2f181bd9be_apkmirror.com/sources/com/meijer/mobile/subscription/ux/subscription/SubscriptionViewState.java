package com.meijer.mobile.subscription.ux.subscription;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0004\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\""}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/H;", "", "", "isSubscriptionLoading", "isSuccess", "displayHowItWorks", "", "errorMessage", "Lcom/meijer/mobile/subscription/ux/subscription/x;", "subscriptionDecorator", "<init>", "(ZZZLjava/lang/String;Lcom/meijer/mobile/subscription/ux/subscription/x;)V", "a", "(ZZZLjava/lang/String;Lcom/meijer/mobile/subscription/ux/subscription/x;)Lcom/meijer/mobile/subscription/ux/subscription/H;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "c", "d", "Ljava/lang/String;", "getErrorMessage", "e", "Lcom/meijer/mobile/subscription/ux/subscription/x;", "()Lcom/meijer/mobile/subscription/ux/subscription/x;", "isPrimaryActionEnabled", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscription.H, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscriptionLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayHowItWorks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDecorator subscriptionDecorator;

    public SubscriptionViewState() {
        this(false, false, false, null, null, 31, null);
    }

    public static /* synthetic */ SubscriptionViewState b(SubscriptionViewState subscriptionViewState, boolean z10, boolean z11, boolean z12, String str, SubscriptionDecorator subscriptionDecorator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = subscriptionViewState.isSubscriptionLoading;
        }
        if ((i10 & 2) != 0) {
            z11 = subscriptionViewState.isSuccess;
        }
        if ((i10 & 4) != 0) {
            z12 = subscriptionViewState.displayHowItWorks;
        }
        if ((i10 & 8) != 0) {
            str = subscriptionViewState.errorMessage;
        }
        if ((i10 & 16) != 0) {
            subscriptionDecorator = subscriptionViewState.subscriptionDecorator;
        }
        SubscriptionDecorator subscriptionDecorator2 = subscriptionDecorator;
        boolean z13 = z12;
        return subscriptionViewState.a(z10, z11, z13, str, subscriptionDecorator2);
    }

    public final SubscriptionViewState a(boolean isSubscriptionLoading, boolean isSuccess, boolean displayHowItWorks, String errorMessage, SubscriptionDecorator subscriptionDecorator) {
        Intrinsics.j(subscriptionDecorator, "subscriptionDecorator");
        return new SubscriptionViewState(isSubscriptionLoading, isSuccess, displayHowItWorks, errorMessage, subscriptionDecorator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionViewState)) {
            return false;
        }
        SubscriptionViewState subscriptionViewState = (SubscriptionViewState) other;
        return this.isSubscriptionLoading == subscriptionViewState.isSubscriptionLoading && this.isSuccess == subscriptionViewState.isSuccess && this.displayHowItWorks == subscriptionViewState.displayHowItWorks && Intrinsics.e(this.errorMessage, subscriptionViewState.errorMessage) && Intrinsics.e(this.subscriptionDecorator, subscriptionViewState.subscriptionDecorator);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isSubscriptionLoading) * 31) + Boolean.hashCode(this.isSuccess)) * 31) + Boolean.hashCode(this.displayHowItWorks)) * 31;
        String str = this.errorMessage;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.subscriptionDecorator.hashCode();
    }

    public String toString() {
        return "SubscriptionViewState(isSubscriptionLoading=" + this.isSubscriptionLoading + ", isSuccess=" + this.isSuccess + ", displayHowItWorks=" + this.displayHowItWorks + ", errorMessage=" + this.errorMessage + ", subscriptionDecorator=" + this.subscriptionDecorator + ')';
    }

    public SubscriptionViewState(boolean z10, boolean z11, boolean z12, String str, SubscriptionDecorator subscriptionDecorator) {
        Intrinsics.j(subscriptionDecorator, "subscriptionDecorator");
        this.isSubscriptionLoading = z10;
        this.isSuccess = z11;
        this.displayHowItWorks = z12;
        this.errorMessage = str;
        this.subscriptionDecorator = subscriptionDecorator;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDisplayHowItWorks() {
        return this.displayHowItWorks;
    }

    /* renamed from: d, reason: from getter */
    public final SubscriptionDecorator getSubscriptionDecorator() {
        return this.subscriptionDecorator;
    }

    public final boolean e() {
        return this.subscriptionDecorator.r();
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsSubscriptionLoading() {
        return this.isSubscriptionLoading;
    }

    public /* synthetic */ SubscriptionViewState(boolean z10, boolean z11, boolean z12, String str, SubscriptionDecorator subscriptionDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) == 0 ? z12 : false, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? new SubscriptionDecorator(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 16383, null) : subscriptionDecorator);
    }
}

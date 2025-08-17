package com.meijer.mobile.subscription.ux.subscription;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mr.DeliveryAddressesViewState;
import mr.TimeSlotsViewState;
import pr.SubscriptionSummaryDecorator;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b \u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b\u001d\u0010'¨\u0006("}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/z;", "", "Lcom/meijer/mobile/subscription/ux/subscription/H;", "subscriptionViewState", "Lmr/n;", "deliveryAddressesViewState", "Lmr/P;", "timeSlotsViewState", "Lpr/c;", "subscriptionSummary", "Lkotlin/Function0;", "", "onExit", "<init>", "(Lcom/meijer/mobile/subscription/ux/subscription/H;Lmr/n;Lmr/P;Lpr/c;Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/subscription/ux/subscription/H;", "d", "()Lcom/meijer/mobile/subscription/ux/subscription/H;", "b", "Lmr/n;", "()Lmr/n;", "c", "Lmr/P;", "e", "()Lmr/P;", "Lpr/c;", "()Lpr/c;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscription.z, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionNavConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionViewState subscriptionViewState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryAddressesViewState deliveryAddressesViewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TimeSlotsViewState timeSlotsViewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionSummaryDecorator subscriptionSummary;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> onExit;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionNavConfig)) {
            return false;
        }
        SubscriptionNavConfig subscriptionNavConfig = (SubscriptionNavConfig) other;
        return Intrinsics.e(this.subscriptionViewState, subscriptionNavConfig.subscriptionViewState) && Intrinsics.e(this.deliveryAddressesViewState, subscriptionNavConfig.deliveryAddressesViewState) && Intrinsics.e(this.timeSlotsViewState, subscriptionNavConfig.timeSlotsViewState) && Intrinsics.e(this.subscriptionSummary, subscriptionNavConfig.subscriptionSummary) && Intrinsics.e(this.onExit, subscriptionNavConfig.onExit);
    }

    public int hashCode() {
        int iHashCode = ((((this.subscriptionViewState.hashCode() * 31) + this.deliveryAddressesViewState.hashCode()) * 31) + this.timeSlotsViewState.hashCode()) * 31;
        SubscriptionSummaryDecorator subscriptionSummaryDecorator = this.subscriptionSummary;
        return ((iHashCode + (subscriptionSummaryDecorator == null ? 0 : subscriptionSummaryDecorator.hashCode())) * 31) + this.onExit.hashCode();
    }

    public String toString() {
        return "SubscriptionNavConfig(subscriptionViewState=" + this.subscriptionViewState + ", deliveryAddressesViewState=" + this.deliveryAddressesViewState + ", timeSlotsViewState=" + this.timeSlotsViewState + ", subscriptionSummary=" + this.subscriptionSummary + ", onExit=" + this.onExit + ')';
    }

    public SubscriptionNavConfig(SubscriptionViewState subscriptionViewState, DeliveryAddressesViewState deliveryAddressesViewState, TimeSlotsViewState timeSlotsViewState, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<Unit> onExit) {
        Intrinsics.j(subscriptionViewState, "subscriptionViewState");
        Intrinsics.j(deliveryAddressesViewState, "deliveryAddressesViewState");
        Intrinsics.j(timeSlotsViewState, "timeSlotsViewState");
        Intrinsics.j(onExit, "onExit");
        this.subscriptionViewState = subscriptionViewState;
        this.deliveryAddressesViewState = deliveryAddressesViewState;
        this.timeSlotsViewState = timeSlotsViewState;
        this.subscriptionSummary = subscriptionSummaryDecorator;
        this.onExit = onExit;
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryAddressesViewState getDeliveryAddressesViewState() {
        return this.deliveryAddressesViewState;
    }

    public final Function0<Unit> b() {
        return this.onExit;
    }

    /* renamed from: c, reason: from getter */
    public final SubscriptionSummaryDecorator getSubscriptionSummary() {
        return this.subscriptionSummary;
    }

    /* renamed from: d, reason: from getter */
    public final SubscriptionViewState getSubscriptionViewState() {
        return this.subscriptionViewState;
    }

    /* renamed from: e, reason: from getter */
    public final TimeSlotsViewState getTimeSlotsViewState() {
        return this.timeSlotsViewState;
    }
}

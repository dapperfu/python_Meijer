package com.meijer.mobile.subscription.ux.subscription;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pr.SubscriptionSummaryDecorator;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/A;", "", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "subscriptionViewState", "Lpr/c;", "subscriptionSummary", "Lkotlin/Function0;", "", "onExit", "<init>", "(Lcom/meijer/mobile/subscription/ux/subscription/I;Lpr/c;Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "c", "()Lcom/meijer/mobile/subscription/ux/subscription/I;", "b", "Lpr/c;", "()Lpr/c;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscription.A, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class SubscriptionNavConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionViewState subscriptionViewState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionSummaryDecorator subscriptionSummary;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> onExit;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionNavConfig)) {
            return false;
        }
        SubscriptionNavConfig subscriptionNavConfig = (SubscriptionNavConfig) other;
        return Intrinsics.e(this.subscriptionViewState, subscriptionNavConfig.subscriptionViewState) && Intrinsics.e(this.subscriptionSummary, subscriptionNavConfig.subscriptionSummary) && Intrinsics.e(this.onExit, subscriptionNavConfig.onExit);
    }

    public int hashCode() {
        int iHashCode = this.subscriptionViewState.hashCode() * 31;
        SubscriptionSummaryDecorator subscriptionSummaryDecorator = this.subscriptionSummary;
        return ((iHashCode + (subscriptionSummaryDecorator == null ? 0 : subscriptionSummaryDecorator.hashCode())) * 31) + this.onExit.hashCode();
    }

    public String toString() {
        return "SubscriptionNavConfig(subscriptionViewState=" + this.subscriptionViewState + ", subscriptionSummary=" + this.subscriptionSummary + ", onExit=" + this.onExit + ')';
    }

    public SubscriptionNavConfig(SubscriptionViewState subscriptionViewState, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<Unit> onExit) {
        Intrinsics.j(subscriptionViewState, "subscriptionViewState");
        Intrinsics.j(onExit, "onExit");
        this.subscriptionViewState = subscriptionViewState;
        this.subscriptionSummary = subscriptionSummaryDecorator;
        this.onExit = onExit;
    }

    public final Function0<Unit> a() {
        return this.onExit;
    }

    /* renamed from: b, reason: from getter */
    public final SubscriptionSummaryDecorator getSubscriptionSummary() {
        return this.subscriptionSummary;
    }

    /* renamed from: c, reason: from getter */
    public final SubscriptionViewState getSubscriptionViewState() {
        return this.subscriptionViewState;
    }
}

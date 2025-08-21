package ci;

import Vh.SubscriptionCardDecorator;
import Zh.SubscriptionEmptyOrErrorStateDecorator;
import cr.SubscriptionDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Lci/a;", "", "", "isSubscriptionLoading", "LVh/g;", "subscriptionCardDecorator", "", "Lcr/j;", "subscriptionItemList", "LZh/a;", "emptyOrErrorStateDecorator", "<init>", "(ZLVh/g;Ljava/util/List;LZh/a;)V", "a", "(ZLVh/g;Ljava/util/List;LZh/a;)Lci/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "LVh/g;", "d", "()LVh/g;", "c", "Ljava/util/List;", "getSubscriptionItemList", "()Ljava/util/List;", "LZh/a;", "()LZh/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ci.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class SubscriptionCardViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscriptionLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionCardDecorator subscriptionCardDecorator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SubscriptionDetails> subscriptionItemList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionEmptyOrErrorStateDecorator emptyOrErrorStateDecorator;

    public SubscriptionCardViewState() {
        this(false, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionCardViewState)) {
            return false;
        }
        SubscriptionCardViewState subscriptionCardViewState = (SubscriptionCardViewState) other;
        return this.isSubscriptionLoading == subscriptionCardViewState.isSubscriptionLoading && Intrinsics.e(this.subscriptionCardDecorator, subscriptionCardViewState.subscriptionCardDecorator) && Intrinsics.e(this.subscriptionItemList, subscriptionCardViewState.subscriptionItemList) && Intrinsics.e(this.emptyOrErrorStateDecorator, subscriptionCardViewState.emptyOrErrorStateDecorator);
    }

    public SubscriptionCardViewState(boolean z10, SubscriptionCardDecorator subscriptionCardDecorator, List<SubscriptionDetails> list, SubscriptionEmptyOrErrorStateDecorator subscriptionEmptyOrErrorStateDecorator) {
        this.isSubscriptionLoading = z10;
        this.subscriptionCardDecorator = subscriptionCardDecorator;
        this.subscriptionItemList = list;
        this.emptyOrErrorStateDecorator = subscriptionEmptyOrErrorStateDecorator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionCardViewState b(SubscriptionCardViewState subscriptionCardViewState, boolean z10, SubscriptionCardDecorator subscriptionCardDecorator, List list, SubscriptionEmptyOrErrorStateDecorator subscriptionEmptyOrErrorStateDecorator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = subscriptionCardViewState.isSubscriptionLoading;
        }
        if ((i10 & 2) != 0) {
            subscriptionCardDecorator = subscriptionCardViewState.subscriptionCardDecorator;
        }
        if ((i10 & 4) != 0) {
            list = subscriptionCardViewState.subscriptionItemList;
        }
        if ((i10 & 8) != 0) {
            subscriptionEmptyOrErrorStateDecorator = subscriptionCardViewState.emptyOrErrorStateDecorator;
        }
        return subscriptionCardViewState.a(z10, subscriptionCardDecorator, list, subscriptionEmptyOrErrorStateDecorator);
    }

    public final SubscriptionCardViewState a(boolean isSubscriptionLoading, SubscriptionCardDecorator subscriptionCardDecorator, List<SubscriptionDetails> subscriptionItemList, SubscriptionEmptyOrErrorStateDecorator emptyOrErrorStateDecorator) {
        return new SubscriptionCardViewState(isSubscriptionLoading, subscriptionCardDecorator, subscriptionItemList, emptyOrErrorStateDecorator);
    }

    /* renamed from: c, reason: from getter */
    public final SubscriptionEmptyOrErrorStateDecorator getEmptyOrErrorStateDecorator() {
        return this.emptyOrErrorStateDecorator;
    }

    /* renamed from: d, reason: from getter */
    public final SubscriptionCardDecorator getSubscriptionCardDecorator() {
        return this.subscriptionCardDecorator;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSubscriptionLoading() {
        return this.isSubscriptionLoading;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSubscriptionLoading) * 31;
        SubscriptionCardDecorator subscriptionCardDecorator = this.subscriptionCardDecorator;
        int iHashCode2 = (iHashCode + (subscriptionCardDecorator == null ? 0 : subscriptionCardDecorator.hashCode())) * 31;
        List<SubscriptionDetails> list = this.subscriptionItemList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SubscriptionEmptyOrErrorStateDecorator subscriptionEmptyOrErrorStateDecorator = this.emptyOrErrorStateDecorator;
        return iHashCode3 + (subscriptionEmptyOrErrorStateDecorator != null ? subscriptionEmptyOrErrorStateDecorator.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionCardViewState(isSubscriptionLoading=" + this.isSubscriptionLoading + ", subscriptionCardDecorator=" + this.subscriptionCardDecorator + ", subscriptionItemList=" + this.subscriptionItemList + ", emptyOrErrorStateDecorator=" + this.emptyOrErrorStateDecorator + ')';
    }

    public /* synthetic */ SubscriptionCardViewState(boolean z10, SubscriptionCardDecorator subscriptionCardDecorator, List list, SubscriptionEmptyOrErrorStateDecorator subscriptionEmptyOrErrorStateDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : subscriptionCardDecorator, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : subscriptionEmptyOrErrorStateDecorator);
    }
}

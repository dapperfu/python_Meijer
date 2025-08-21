package com.meijer.mobile.subscription.ux.subscription;

import di.CustomerAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.TimeSlotDayDecorator;
import vh.AccountCreditCard;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n¢\u0006\u0004\b\u0015\u0010\u0016J\u008e\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u0004\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b$\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b,\u0010\u001cR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b0\u0010.R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b&\u0010.R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0006¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b2\u0010.R\u0011\u00103\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010\"¨\u00064"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/I;", "", "", "isSubscriptionLoading", "isSuccess", "displayHowItWorks", "", "errorMessage", "Lcom/meijer/mobile/subscription/ux/subscription/y;", "subscriptionDecorator", "", "Ldi/c;", "addressesList", "", "numberOfSavedAddresses", "Lcom/meijer/mobile/subscription/ux/subscription/J;", "timesList", "Lmr/l;", "daysList", "Lvh/a;", "payments", "<init>", "(ZZZLjava/lang/String;Lcom/meijer/mobile/subscription/ux/subscription/y;Ljava/util/List;ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "(ZZZLjava/lang/String;Lcom/meijer/mobile/subscription/ux/subscription/y;Ljava/util/List;ILjava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/subscription/ux/subscription/I;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "j", "()Z", "b", "c", "e", "d", "Ljava/lang/String;", "getErrorMessage", "Lcom/meijer/mobile/subscription/ux/subscription/y;", "g", "()Lcom/meijer/mobile/subscription/ux/subscription/y;", "f", "Ljava/util/List;", "()Ljava/util/List;", "I", "h", "i", "getPayments", "isPrimaryActionEnabled", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscription.I, reason: from toString */
/* loaded from: classes12.dex */
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

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CustomerAddress> addressesList;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfSavedAddresses;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<J> timesList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TimeSlotDayDecorator> daysList;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AccountCreditCard> payments;

    public SubscriptionViewState() {
        this(false, false, false, null, null, null, 0, null, null, null, 1023, null);
    }

    public static /* synthetic */ SubscriptionViewState b(SubscriptionViewState subscriptionViewState, boolean z10, boolean z11, boolean z12, String str, SubscriptionDecorator subscriptionDecorator, List list, int i10, List list2, List list3, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = subscriptionViewState.isSubscriptionLoading;
        }
        if ((i11 & 2) != 0) {
            z11 = subscriptionViewState.isSuccess;
        }
        if ((i11 & 4) != 0) {
            z12 = subscriptionViewState.displayHowItWorks;
        }
        if ((i11 & 8) != 0) {
            str = subscriptionViewState.errorMessage;
        }
        if ((i11 & 16) != 0) {
            subscriptionDecorator = subscriptionViewState.subscriptionDecorator;
        }
        if ((i11 & 32) != 0) {
            list = subscriptionViewState.addressesList;
        }
        if ((i11 & 64) != 0) {
            i10 = subscriptionViewState.numberOfSavedAddresses;
        }
        if ((i11 & 128) != 0) {
            list2 = subscriptionViewState.timesList;
        }
        if ((i11 & 256) != 0) {
            list3 = subscriptionViewState.daysList;
        }
        if ((i11 & 512) != 0) {
            list4 = subscriptionViewState.payments;
        }
        List list5 = list3;
        List list6 = list4;
        int i12 = i10;
        List list7 = list2;
        SubscriptionDecorator subscriptionDecorator2 = subscriptionDecorator;
        List list8 = list;
        return subscriptionViewState.a(z10, z11, z12, str, subscriptionDecorator2, list8, i12, list7, list5, list6);
    }

    public final SubscriptionViewState a(boolean isSubscriptionLoading, boolean isSuccess, boolean displayHowItWorks, String errorMessage, SubscriptionDecorator subscriptionDecorator, List<CustomerAddress> addressesList, int numberOfSavedAddresses, List<? extends J> timesList, List<TimeSlotDayDecorator> daysList, List<AccountCreditCard> payments) {
        Intrinsics.j(subscriptionDecorator, "subscriptionDecorator");
        Intrinsics.j(addressesList, "addressesList");
        Intrinsics.j(timesList, "timesList");
        Intrinsics.j(daysList, "daysList");
        Intrinsics.j(payments, "payments");
        return new SubscriptionViewState(isSubscriptionLoading, isSuccess, displayHowItWorks, errorMessage, subscriptionDecorator, addressesList, numberOfSavedAddresses, timesList, daysList, payments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionViewState)) {
            return false;
        }
        SubscriptionViewState subscriptionViewState = (SubscriptionViewState) other;
        return this.isSubscriptionLoading == subscriptionViewState.isSubscriptionLoading && this.isSuccess == subscriptionViewState.isSuccess && this.displayHowItWorks == subscriptionViewState.displayHowItWorks && Intrinsics.e(this.errorMessage, subscriptionViewState.errorMessage) && Intrinsics.e(this.subscriptionDecorator, subscriptionViewState.subscriptionDecorator) && Intrinsics.e(this.addressesList, subscriptionViewState.addressesList) && this.numberOfSavedAddresses == subscriptionViewState.numberOfSavedAddresses && Intrinsics.e(this.timesList, subscriptionViewState.timesList) && Intrinsics.e(this.daysList, subscriptionViewState.daysList) && Intrinsics.e(this.payments, subscriptionViewState.payments);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isSubscriptionLoading) * 31) + Boolean.hashCode(this.isSuccess)) * 31) + Boolean.hashCode(this.displayHowItWorks)) * 31;
        String str = this.errorMessage;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.subscriptionDecorator.hashCode()) * 31) + this.addressesList.hashCode()) * 31) + Integer.hashCode(this.numberOfSavedAddresses)) * 31) + this.timesList.hashCode()) * 31) + this.daysList.hashCode()) * 31) + this.payments.hashCode();
    }

    public String toString() {
        return "SubscriptionViewState(isSubscriptionLoading=" + this.isSubscriptionLoading + ", isSuccess=" + this.isSuccess + ", displayHowItWorks=" + this.displayHowItWorks + ", errorMessage=" + this.errorMessage + ", subscriptionDecorator=" + this.subscriptionDecorator + ", addressesList=" + this.addressesList + ", numberOfSavedAddresses=" + this.numberOfSavedAddresses + ", timesList=" + this.timesList + ", daysList=" + this.daysList + ", payments=" + this.payments + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionViewState(boolean z10, boolean z11, boolean z12, String str, SubscriptionDecorator subscriptionDecorator, List<CustomerAddress> addressesList, int i10, List<? extends J> timesList, List<TimeSlotDayDecorator> daysList, List<AccountCreditCard> payments) {
        Intrinsics.j(subscriptionDecorator, "subscriptionDecorator");
        Intrinsics.j(addressesList, "addressesList");
        Intrinsics.j(timesList, "timesList");
        Intrinsics.j(daysList, "daysList");
        Intrinsics.j(payments, "payments");
        this.isSubscriptionLoading = z10;
        this.isSuccess = z11;
        this.displayHowItWorks = z12;
        this.errorMessage = str;
        this.subscriptionDecorator = subscriptionDecorator;
        this.addressesList = addressesList;
        this.numberOfSavedAddresses = i10;
        this.timesList = timesList;
        this.daysList = daysList;
        this.payments = payments;
    }

    public final List<CustomerAddress> c() {
        return this.addressesList;
    }

    public final List<TimeSlotDayDecorator> d() {
        return this.daysList;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getDisplayHowItWorks() {
        return this.displayHowItWorks;
    }

    /* renamed from: f, reason: from getter */
    public final int getNumberOfSavedAddresses() {
        return this.numberOfSavedAddresses;
    }

    /* renamed from: g, reason: from getter */
    public final SubscriptionDecorator getSubscriptionDecorator() {
        return this.subscriptionDecorator;
    }

    public final List<J> h() {
        return this.timesList;
    }

    public final boolean i() {
        return this.subscriptionDecorator.r();
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsSubscriptionLoading() {
        return this.isSubscriptionLoading;
    }

    public /* synthetic */ SubscriptionViewState(boolean z10, boolean z11, boolean z12, String str, SubscriptionDecorator subscriptionDecorator, List list, int i10, List list2, List list3, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? new SubscriptionDecorator(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 16383, null) : subscriptionDecorator, (i11 & 32) != 0 ? CollectionsKt.m() : list, (i11 & 64) == 0 ? i10 : 0, (i11 & 128) != 0 ? CollectionsKt.m() : list2, (i11 & 256) != 0 ? CollectionsKt.m() : list3, (i11 & 512) != 0 ? CollectionsKt.m() : list4);
    }
}

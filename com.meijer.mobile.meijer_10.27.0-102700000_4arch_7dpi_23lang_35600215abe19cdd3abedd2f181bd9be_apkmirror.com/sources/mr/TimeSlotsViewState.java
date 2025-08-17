package mr;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\t\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lmr/P;", "", "", "isCheckoutSubscriptionLoading", "", "Lmr/s;", "timesList", "Lmr/r;", "daysList", "isSuccess", "", "errorMessage", "<init>", "(ZLjava/util/List;Ljava/util/List;ZLjava/lang/String;)V", "a", "(ZLjava/util/List;Ljava/util/List;ZLjava/lang/String;)Lmr/P;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Ljava/lang/String;", "getErrorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mr.P, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class TimeSlotsViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckoutSubscriptionLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<s> timesList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TimeSlotDayDecorator> daysList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    public TimeSlotsViewState() {
        this(false, null, null, false, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSlotsViewState)) {
            return false;
        }
        TimeSlotsViewState timeSlotsViewState = (TimeSlotsViewState) other;
        return this.isCheckoutSubscriptionLoading == timeSlotsViewState.isCheckoutSubscriptionLoading && Intrinsics.e(this.timesList, timeSlotsViewState.timesList) && Intrinsics.e(this.daysList, timeSlotsViewState.daysList) && this.isSuccess == timeSlotsViewState.isSuccess && Intrinsics.e(this.errorMessage, timeSlotsViewState.errorMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimeSlotsViewState(boolean z10, List<? extends s> timesList, List<TimeSlotDayDecorator> daysList, boolean z11, String str) {
        Intrinsics.j(timesList, "timesList");
        Intrinsics.j(daysList, "daysList");
        this.isCheckoutSubscriptionLoading = z10;
        this.timesList = timesList;
        this.daysList = daysList;
        this.isSuccess = z11;
        this.errorMessage = str;
    }

    public static /* synthetic */ TimeSlotsViewState b(TimeSlotsViewState timeSlotsViewState, boolean z10, List list, List list2, boolean z11, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = timeSlotsViewState.isCheckoutSubscriptionLoading;
        }
        if ((i10 & 2) != 0) {
            list = timeSlotsViewState.timesList;
        }
        if ((i10 & 4) != 0) {
            list2 = timeSlotsViewState.daysList;
        }
        if ((i10 & 8) != 0) {
            z11 = timeSlotsViewState.isSuccess;
        }
        if ((i10 & 16) != 0) {
            str = timeSlotsViewState.errorMessage;
        }
        String str2 = str;
        List list3 = list2;
        return timeSlotsViewState.a(z10, list, list3, z11, str2);
    }

    public final TimeSlotsViewState a(boolean isCheckoutSubscriptionLoading, List<? extends s> timesList, List<TimeSlotDayDecorator> daysList, boolean isSuccess, String errorMessage) {
        Intrinsics.j(timesList, "timesList");
        Intrinsics.j(daysList, "daysList");
        return new TimeSlotsViewState(isCheckoutSubscriptionLoading, timesList, daysList, isSuccess, errorMessage);
    }

    public final List<TimeSlotDayDecorator> c() {
        return this.daysList;
    }

    public final List<s> d() {
        return this.timesList;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsCheckoutSubscriptionLoading() {
        return this.isCheckoutSubscriptionLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isCheckoutSubscriptionLoading) * 31) + this.timesList.hashCode()) * 31) + this.daysList.hashCode()) * 31) + Boolean.hashCode(this.isSuccess)) * 31;
        String str = this.errorMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TimeSlotsViewState(isCheckoutSubscriptionLoading=" + this.isCheckoutSubscriptionLoading + ", timesList=" + this.timesList + ", daysList=" + this.daysList + ", isSuccess=" + this.isSuccess + ", errorMessage=" + this.errorMessage + ')';
    }

    public /* synthetic */ TimeSlotsViewState(boolean z10, List list, List list2, boolean z11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? true : z11, (i10 & 16) != 0 ? null : str);
    }
}

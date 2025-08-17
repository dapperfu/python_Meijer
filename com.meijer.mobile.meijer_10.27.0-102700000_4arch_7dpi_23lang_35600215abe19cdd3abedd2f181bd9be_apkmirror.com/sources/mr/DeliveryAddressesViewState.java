package mr;

import ci.CustomerAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\t\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lmr/n;", "", "", "isCheckoutSubscriptionLoading", "", "Lci/c;", "addressesList", "", "numberOfSavedAddresses", "isSuccess", "", "errorMessage", "<init>", "(ZLjava/util/List;IZLjava/lang/String;)V", "a", "(ZLjava/util/List;IZLjava/lang/String;)Lmr/n;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "I", "d", "Ljava/lang/String;", "getErrorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mr.n, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class DeliveryAddressesViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckoutSubscriptionLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CustomerAddress> addressesList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfSavedAddresses;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    public DeliveryAddressesViewState() {
        this(false, null, 0, false, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryAddressesViewState)) {
            return false;
        }
        DeliveryAddressesViewState deliveryAddressesViewState = (DeliveryAddressesViewState) other;
        return this.isCheckoutSubscriptionLoading == deliveryAddressesViewState.isCheckoutSubscriptionLoading && Intrinsics.e(this.addressesList, deliveryAddressesViewState.addressesList) && this.numberOfSavedAddresses == deliveryAddressesViewState.numberOfSavedAddresses && this.isSuccess == deliveryAddressesViewState.isSuccess && Intrinsics.e(this.errorMessage, deliveryAddressesViewState.errorMessage);
    }

    public DeliveryAddressesViewState(boolean z10, List<CustomerAddress> addressesList, int i10, boolean z11, String str) {
        Intrinsics.j(addressesList, "addressesList");
        this.isCheckoutSubscriptionLoading = z10;
        this.addressesList = addressesList;
        this.numberOfSavedAddresses = i10;
        this.isSuccess = z11;
        this.errorMessage = str;
    }

    public static /* synthetic */ DeliveryAddressesViewState b(DeliveryAddressesViewState deliveryAddressesViewState, boolean z10, List list, int i10, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = deliveryAddressesViewState.isCheckoutSubscriptionLoading;
        }
        if ((i11 & 2) != 0) {
            list = deliveryAddressesViewState.addressesList;
        }
        if ((i11 & 4) != 0) {
            i10 = deliveryAddressesViewState.numberOfSavedAddresses;
        }
        if ((i11 & 8) != 0) {
            z11 = deliveryAddressesViewState.isSuccess;
        }
        if ((i11 & 16) != 0) {
            str = deliveryAddressesViewState.errorMessage;
        }
        String str2 = str;
        int i12 = i10;
        return deliveryAddressesViewState.a(z10, list, i12, z11, str2);
    }

    public final DeliveryAddressesViewState a(boolean isCheckoutSubscriptionLoading, List<CustomerAddress> addressesList, int numberOfSavedAddresses, boolean isSuccess, String errorMessage) {
        Intrinsics.j(addressesList, "addressesList");
        return new DeliveryAddressesViewState(isCheckoutSubscriptionLoading, addressesList, numberOfSavedAddresses, isSuccess, errorMessage);
    }

    public final List<CustomerAddress> c() {
        return this.addressesList;
    }

    /* renamed from: d, reason: from getter */
    public final int getNumberOfSavedAddresses() {
        return this.numberOfSavedAddresses;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsCheckoutSubscriptionLoading() {
        return this.isCheckoutSubscriptionLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isCheckoutSubscriptionLoading) * 31) + this.addressesList.hashCode()) * 31) + Integer.hashCode(this.numberOfSavedAddresses)) * 31) + Boolean.hashCode(this.isSuccess)) * 31;
        String str = this.errorMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeliveryAddressesViewState(isCheckoutSubscriptionLoading=" + this.isCheckoutSubscriptionLoading + ", addressesList=" + this.addressesList + ", numberOfSavedAddresses=" + this.numberOfSavedAddresses + ", isSuccess=" + this.isSuccess + ", errorMessage=" + this.errorMessage + ')';
    }

    public /* synthetic */ DeliveryAddressesViewState(boolean z10, List list, int i10, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? CollectionsKt.m() : list, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : str);
    }
}

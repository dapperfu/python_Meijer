package Wh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJP\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\b\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\t\u0010 ¨\u0006\""}, d2 = {"LWh/b;", "", "", "fullName", "streetAddress", "apartment", "addressLine", "", "isPrimary", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)LWh/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFullName", "b", "getStreetAddress", "c", "getApartment", "d", "getAddressLine", "e", "Z", "()Z", "f", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Wh.b, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class PaymentsAddressDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apartment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsAddressDecorator)) {
            return false;
        }
        PaymentsAddressDecorator paymentsAddressDecorator = (PaymentsAddressDecorator) other;
        return Intrinsics.e(this.fullName, paymentsAddressDecorator.fullName) && Intrinsics.e(this.streetAddress, paymentsAddressDecorator.streetAddress) && Intrinsics.e(this.apartment, paymentsAddressDecorator.apartment) && Intrinsics.e(this.addressLine, paymentsAddressDecorator.addressLine) && this.isPrimary == paymentsAddressDecorator.isPrimary && this.isSelected == paymentsAddressDecorator.isSelected;
    }

    public PaymentsAddressDecorator(String fullName, String str, String str2, String addressLine, boolean z10, boolean z11) {
        Intrinsics.j(fullName, "fullName");
        Intrinsics.j(addressLine, "addressLine");
        this.fullName = fullName;
        this.streetAddress = str;
        this.apartment = str2;
        this.addressLine = addressLine;
        this.isPrimary = z10;
        this.isSelected = z11;
    }

    public static /* synthetic */ PaymentsAddressDecorator b(PaymentsAddressDecorator paymentsAddressDecorator, String str, String str2, String str3, String str4, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentsAddressDecorator.fullName;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentsAddressDecorator.streetAddress;
        }
        if ((i10 & 4) != 0) {
            str3 = paymentsAddressDecorator.apartment;
        }
        if ((i10 & 8) != 0) {
            str4 = paymentsAddressDecorator.addressLine;
        }
        if ((i10 & 16) != 0) {
            z10 = paymentsAddressDecorator.isPrimary;
        }
        if ((i10 & 32) != 0) {
            z11 = paymentsAddressDecorator.isSelected;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        return paymentsAddressDecorator.a(str, str2, str3, str4, z12, z13);
    }

    public final PaymentsAddressDecorator a(String fullName, String streetAddress, String apartment, String addressLine, boolean isPrimary, boolean isSelected) {
        Intrinsics.j(fullName, "fullName");
        Intrinsics.j(addressLine, "addressLine");
        return new PaymentsAddressDecorator(fullName, streetAddress, apartment, addressLine, isPrimary, isSelected);
    }

    public int hashCode() {
        int iHashCode = this.fullName.hashCode() * 31;
        String str = this.streetAddress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.apartment;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.addressLine.hashCode()) * 31) + Boolean.hashCode(this.isPrimary)) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "PaymentsAddressDecorator(fullName=" + this.fullName + ", streetAddress=" + this.streetAddress + ", apartment=" + this.apartment + ", addressLine=" + this.addressLine + ", isPrimary=" + this.isPrimary + ", isSelected=" + this.isSelected + ')';
    }
}

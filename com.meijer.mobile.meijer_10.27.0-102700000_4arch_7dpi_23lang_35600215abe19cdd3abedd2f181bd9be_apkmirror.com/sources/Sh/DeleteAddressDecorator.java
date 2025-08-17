package Sh;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\f¨\u0006\u001c"}, d2 = {"LSh/e;", "", "", PreferencesHelper.PREF_ID, "", "fullName", "addressLine1", "apartment", "addressLine2", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Ljava/lang/String;", "d", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Sh.e, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class DeleteAddressDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apartment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAddressDecorator)) {
            return false;
        }
        DeleteAddressDecorator deleteAddressDecorator = (DeleteAddressDecorator) other;
        return this.id == deleteAddressDecorator.id && Intrinsics.e(this.fullName, deleteAddressDecorator.fullName) && Intrinsics.e(this.addressLine1, deleteAddressDecorator.addressLine1) && Intrinsics.e(this.apartment, deleteAddressDecorator.apartment) && Intrinsics.e(this.addressLine2, deleteAddressDecorator.addressLine2);
    }

    public DeleteAddressDecorator(long j10, String fullName, String addressLine1, String str, String addressLine2) {
        Intrinsics.j(fullName, "fullName");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(addressLine2, "addressLine2");
        this.id = j10;
        this.fullName = fullName;
        this.addressLine1 = addressLine1;
        this.apartment = str;
        this.addressLine2 = addressLine2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: b, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: c, reason: from getter */
    public final String getApartment() {
        return this.apartment;
    }

    /* renamed from: d, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.id) * 31) + this.fullName.hashCode()) * 31) + this.addressLine1.hashCode()) * 31;
        String str = this.apartment;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.addressLine2.hashCode();
    }

    public String toString() {
        return "DeleteAddressDecorator(id=" + this.id + ", fullName=" + this.fullName + ", addressLine1=" + this.addressLine1 + ", apartment=" + this.apartment + ", addressLine2=" + this.addressLine2 + ')';
    }
}

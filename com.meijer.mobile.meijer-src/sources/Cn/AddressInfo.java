package Cn;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"LCn/a;", "", "", "streetNumber", "streetName", "city", "stateShortName", "zipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LCn/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "e", "c", "d", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Cn.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class AddressInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stateShortName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressInfo)) {
            return false;
        }
        AddressInfo addressInfo = (AddressInfo) other;
        return Intrinsics.e(this.streetNumber, addressInfo.streetNumber) && Intrinsics.e(this.streetName, addressInfo.streetName) && Intrinsics.e(this.city, addressInfo.city) && Intrinsics.e(this.stateShortName, addressInfo.stateShortName) && Intrinsics.e(this.zipCode, addressInfo.zipCode);
    }

    public AddressInfo(String streetNumber, String streetName, String city, String stateShortName, String zipCode) {
        Intrinsics.j(streetNumber, "streetNumber");
        Intrinsics.j(streetName, "streetName");
        Intrinsics.j(city, "city");
        Intrinsics.j(stateShortName, "stateShortName");
        Intrinsics.j(zipCode, "zipCode");
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.stateShortName = stateShortName;
        this.zipCode = zipCode;
    }

    public static /* synthetic */ AddressInfo b(AddressInfo addressInfo, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = addressInfo.streetNumber;
        }
        if ((i10 & 2) != 0) {
            str2 = addressInfo.streetName;
        }
        if ((i10 & 4) != 0) {
            str3 = addressInfo.city;
        }
        if ((i10 & 8) != 0) {
            str4 = addressInfo.stateShortName;
        }
        if ((i10 & 16) != 0) {
            str5 = addressInfo.zipCode;
        }
        String str6 = str5;
        String str7 = str3;
        return addressInfo.a(str, str2, str7, str4, str6);
    }

    public final AddressInfo a(String streetNumber, String streetName, String city, String stateShortName, String zipCode) {
        Intrinsics.j(streetNumber, "streetNumber");
        Intrinsics.j(streetName, "streetName");
        Intrinsics.j(city, "city");
        Intrinsics.j(stateShortName, "stateShortName");
        Intrinsics.j(zipCode, "zipCode");
        return new AddressInfo(streetNumber, streetName, city, stateShortName, zipCode);
    }

    /* renamed from: c, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: d, reason: from getter */
    public final String getStateShortName() {
        return this.stateShortName;
    }

    /* renamed from: e, reason: from getter */
    public final String getStreetName() {
        return this.streetName;
    }

    /* renamed from: f, reason: from getter */
    public final String getStreetNumber() {
        return this.streetNumber;
    }

    /* renamed from: g, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        return (((((((this.streetNumber.hashCode() * 31) + this.streetName.hashCode()) * 31) + this.city.hashCode()) * 31) + this.stateShortName.hashCode()) * 31) + this.zipCode.hashCode();
    }

    public String toString() {
        return "AddressInfo(streetNumber=" + this.streetNumber + ", streetName=" + this.streetName + ", city=" + this.city + ", stateShortName=" + this.stateShortName + ", zipCode=" + this.zipCode + ')';
    }
}

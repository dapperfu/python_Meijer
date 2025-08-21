package cr;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0015¨\u0006)"}, d2 = {"Lcr/b;", "Landroid/os/Parcelable;", "", "addressLine1", "addressType", "city", "deliveryAddressId", "state", "zip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAddressLine1", "b", "getAddressType", "c", "getCity", "d", "getDeliveryAddressId", "e", "getState", "f", "getZip", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class CustomerDeliveryAddress implements Parcelable {
    public static final Parcelable.Creator<CustomerDeliveryAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryAddressId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cr.b$a */
    public static final class a implements Parcelable.Creator<CustomerDeliveryAddress> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerDeliveryAddress createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new CustomerDeliveryAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CustomerDeliveryAddress[] newArray(int i10) {
            return new CustomerDeliveryAddress[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerDeliveryAddress)) {
            return false;
        }
        CustomerDeliveryAddress customerDeliveryAddress = (CustomerDeliveryAddress) other;
        return Intrinsics.e(this.addressLine1, customerDeliveryAddress.addressLine1) && Intrinsics.e(this.addressType, customerDeliveryAddress.addressType) && Intrinsics.e(this.city, customerDeliveryAddress.city) && Intrinsics.e(this.deliveryAddressId, customerDeliveryAddress.deliveryAddressId) && Intrinsics.e(this.state, customerDeliveryAddress.state) && Intrinsics.e(this.zip, customerDeliveryAddress.zip);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.addressLine1);
        dest.writeString(this.addressType);
        dest.writeString(this.city);
        dest.writeString(this.deliveryAddressId);
        dest.writeString(this.state);
        dest.writeString(this.zip);
    }

    public CustomerDeliveryAddress(String str, String str2, String str3, String deliveryAddressId, String str4, String str5) {
        Intrinsics.j(deliveryAddressId, "deliveryAddressId");
        this.addressLine1 = str;
        this.addressType = str2;
        this.city = str3;
        this.deliveryAddressId = deliveryAddressId;
        this.state = str4;
        this.zip = str5;
    }

    public int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.deliveryAddressId.hashCode()) * 31;
        String str4 = this.state;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zip;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "CustomerDeliveryAddress(addressLine1=" + this.addressLine1 + ", addressType=" + this.addressType + ", city=" + this.city + ", deliveryAddressId=" + this.deliveryAddressId + ", state=" + this.state + ", zip=" + this.zip + ')';
    }
}

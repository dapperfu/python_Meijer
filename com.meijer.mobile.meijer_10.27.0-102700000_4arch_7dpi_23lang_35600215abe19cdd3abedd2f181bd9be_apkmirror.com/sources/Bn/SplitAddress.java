package Bn;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u001e¨\u0006'"}, d2 = {"LBn/e;", "Landroid/os/Parcelable;", "", "addressLine1", "addressLine2", "city", "state", "zip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setAddressLine1", "(Ljava/lang/String;)V", "b", "setAddressLine2", "c", "setCity", "d", "setState", "e", "setZip", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Bn.e, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class SplitAddress implements Parcelable {
    public static final Parcelable.Creator<SplitAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("addressLine1")
    private String addressLine1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("addressLine2")
    private String addressLine2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("city")
    private String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("state")
    private String state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC15617c("zip")
    private String zip;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bn.e$a */
    public static final class a implements Parcelable.Creator<SplitAddress> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SplitAddress createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new SplitAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SplitAddress[] newArray(int i10) {
            return new SplitAddress[i10];
        }
    }

    @JvmOverloads
    public SplitAddress() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitAddress)) {
            return false;
        }
        SplitAddress splitAddress = (SplitAddress) other;
        return Intrinsics.e(this.addressLine1, splitAddress.addressLine1) && Intrinsics.e(this.addressLine2, splitAddress.addressLine2) && Intrinsics.e(this.city, splitAddress.city) && Intrinsics.e(this.state, splitAddress.state) && Intrinsics.e(this.zip, splitAddress.zip);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.addressLine1);
        dest.writeString(this.addressLine2);
        dest.writeString(this.city);
        dest.writeString(this.state);
        dest.writeString(this.zip);
    }

    @JvmOverloads
    public SplitAddress(String str, String str2, String str3, String str4, String str5) {
        this.addressLine1 = str;
        this.addressLine2 = str2;
        this.city = str3;
        this.state = str4;
        this.zip = str5;
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
    public final String getCity() {
        return this.city;
    }

    /* renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: e, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        String str = this.addressLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zip;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "SplitAddress(addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ')';
    }

    public /* synthetic */ SplitAddress(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5);
    }
}

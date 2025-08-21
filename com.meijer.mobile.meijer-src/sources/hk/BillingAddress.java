package hk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001\u001fBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b'\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b)\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010\u0018¨\u0006+"}, d2 = {"Lhk/b;", "Landroid/os/Parcelable;", "Lhk/c;", "name", "", "email", "street1", "street2", "city", "state", "postalCode", PlaceTypes.COUNTRY, "<init>", "(Lhk/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhk/c;", "d", "()Lhk/c;", "b", "Ljava/lang/String;", "c", "g", "h", "e", "f", "i", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hk.b, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class BillingAddress implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardHolderName name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street1;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String street2;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;
    public static final Parcelable.Creator<BillingAddress> CREATOR = new C2140b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hk.b$b, reason: collision with other inner class name */
    public static final class C2140b implements Parcelable.Creator<BillingAddress> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BillingAddress createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new BillingAddress(parcel.readInt() == 0 ? null : CardHolderName.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BillingAddress[] newArray(int i10) {
            return new BillingAddress[i10];
        }
    }

    public BillingAddress() {
        this(null, null, null, null, null, null, null, null, l3.f93323c, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) other;
        return Intrinsics.e(this.name, billingAddress.name) && Intrinsics.e(this.email, billingAddress.email) && Intrinsics.e(this.street1, billingAddress.street1) && Intrinsics.e(this.street2, billingAddress.street2) && Intrinsics.e(this.city, billingAddress.city) && Intrinsics.e(this.state, billingAddress.state) && Intrinsics.e(this.postalCode, billingAddress.postalCode) && Intrinsics.e(this.country, billingAddress.country);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        CardHolderName cardHolderName = this.name;
        if (cardHolderName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardHolderName.writeToParcel(dest, flags);
        }
        dest.writeString(this.email);
        dest.writeString(this.street1);
        dest.writeString(this.street2);
        dest.writeString(this.city);
        dest.writeString(this.state);
        dest.writeString(this.postalCode);
        dest.writeString(this.country);
    }

    public BillingAddress(CardHolderName cardHolderName, String str, String str2, String str3, String str4, String str5, String str6, String country) {
        Intrinsics.j(country, "country");
        this.name = cardHolderName;
        this.email = str;
        this.street1 = str2;
        this.street2 = str3;
        this.city = str4;
        this.state = str5;
        this.postalCode = str6;
        this.country = country;
    }

    /* renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: d, reason: from getter */
    public final CardHolderName getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: g, reason: from getter */
    public final String getStreet1() {
        return this.street1;
    }

    /* renamed from: h, reason: from getter */
    public final String getStreet2() {
        return this.street2;
    }

    public int hashCode() {
        CardHolderName cardHolderName = this.name;
        int iHashCode = (cardHolderName == null ? 0 : cardHolderName.hashCode()) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.street1;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.street2;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postalCode;
        return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.country.hashCode();
    }

    public String toString() {
        return "BillingAddress(name=" + this.name + ", email=" + this.email + ", street1=" + this.street1 + ", street2=" + this.street2 + ", city=" + this.city + ", state=" + this.state + ", postalCode=" + this.postalCode + ", country=" + this.country + ')';
    }

    public /* synthetic */ BillingAddress(CardHolderName cardHolderName, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : cardHolderName, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? "US" : str7);
    }
}

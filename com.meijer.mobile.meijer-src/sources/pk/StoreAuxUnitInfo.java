package pk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010$J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b-\u0010&\"\u0004\b5\u00106R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u0010&R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b3\u0010&\"\u0004\b>\u00106R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00104\u001a\u0004\b1\u0010&\"\u0004\b@\u00106R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00104\u001a\u0004\b7\u0010&\"\u0004\bB\u00106R$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00104\u001a\u0004\bD\u0010&\"\u0004\bE\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bF\u00104\u001a\u0004\bG\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bJ\u00104\u001a\u0004\bK\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010OR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bR\u00104\u001a\u0004\bS\u0010&R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bT\u0010.\u001a\u0004\bU\u00100R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bV\u00104\u001a\u0004\bW\u0010&R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bX\u00104\u001a\u0004\bY\u0010&R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bZ\u00104\u001a\u0004\b[\u0010&R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010.\u001a\u0004\b]\u00100R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b^\u00104\u001a\u0004\b_\u0010&¨\u0006`"}, d2 = {"Lpk/g;", "Landroid/os/Parcelable;", "", "auxUnitId", "unitId", "", PlaceTypes.ADDRESS, "addressLine2", "longName", "shortName", "phoneNumber", "city", "state", "zipCode", "openDate", "closeDate", "updatedTimestamp", "", "latitude", "longitude", "imageURL", "imageSize", "imageFormat", "timeZone", "daylightSavings", "auxUnitTypeId", "auxUnitType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getAuxUnitId", "()Ljava/lang/Integer;", "b", "getUnitId", "c", "Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "d", "getAddressLine2", "e", "getLongName", "f", "getShortName", "g", "setPhoneNumber", "h", "setCity", "i", "setState", "j", "R", "setZipCode", "k", "getOpenDate", "l", "getCloseDate", "m", "getUpdatedTimestamp", "n", "Ljava/lang/Double;", "getLatitude", "()Ljava/lang/Double;", "o", "getLongitude", "p", "getImageURL", "q", "getImageSize", "r", "getImageFormat", "s", "getTimeZone", "t", "getDaylightSavings", "u", "getAuxUnitTypeId", "v", "getAuxUnitType", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pk.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class StoreAuxUnitInfo implements Parcelable {
    public static final Parcelable.Creator<StoreAuxUnitInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer auxUnitId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer unitId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String address;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String longName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String phoneNumber;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String city;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String state;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String zipCode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String openDate;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String closeDate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedTimestamp;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double latitude;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double longitude;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer imageSize;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageFormat;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeZone;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String daylightSavings;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer auxUnitTypeId;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String auxUnitType;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.g$a */
    public static final class a implements Parcelable.Creator<StoreAuxUnitInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StoreAuxUnitInfo createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new StoreAuxUnitInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StoreAuxUnitInfo[] newArray(int i10) {
            return new StoreAuxUnitInfo[i10];
        }
    }

    public StoreAuxUnitInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreAuxUnitInfo)) {
            return false;
        }
        StoreAuxUnitInfo storeAuxUnitInfo = (StoreAuxUnitInfo) other;
        return Intrinsics.e(this.auxUnitId, storeAuxUnitInfo.auxUnitId) && Intrinsics.e(this.unitId, storeAuxUnitInfo.unitId) && Intrinsics.e(this.address, storeAuxUnitInfo.address) && Intrinsics.e(this.addressLine2, storeAuxUnitInfo.addressLine2) && Intrinsics.e(this.longName, storeAuxUnitInfo.longName) && Intrinsics.e(this.shortName, storeAuxUnitInfo.shortName) && Intrinsics.e(this.phoneNumber, storeAuxUnitInfo.phoneNumber) && Intrinsics.e(this.city, storeAuxUnitInfo.city) && Intrinsics.e(this.state, storeAuxUnitInfo.state) && Intrinsics.e(this.zipCode, storeAuxUnitInfo.zipCode) && Intrinsics.e(this.openDate, storeAuxUnitInfo.openDate) && Intrinsics.e(this.closeDate, storeAuxUnitInfo.closeDate) && Intrinsics.e(this.updatedTimestamp, storeAuxUnitInfo.updatedTimestamp) && Intrinsics.e(this.latitude, storeAuxUnitInfo.latitude) && Intrinsics.e(this.longitude, storeAuxUnitInfo.longitude) && Intrinsics.e(this.imageURL, storeAuxUnitInfo.imageURL) && Intrinsics.e(this.imageSize, storeAuxUnitInfo.imageSize) && Intrinsics.e(this.imageFormat, storeAuxUnitInfo.imageFormat) && Intrinsics.e(this.timeZone, storeAuxUnitInfo.timeZone) && Intrinsics.e(this.daylightSavings, storeAuxUnitInfo.daylightSavings) && Intrinsics.e(this.auxUnitTypeId, storeAuxUnitInfo.auxUnitTypeId) && Intrinsics.e(this.auxUnitType, storeAuxUnitInfo.auxUnitType);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Integer num = this.auxUnitId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.unitId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.address);
        dest.writeString(this.addressLine2);
        dest.writeString(this.longName);
        dest.writeString(this.shortName);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.city);
        dest.writeString(this.state);
        dest.writeString(this.zipCode);
        dest.writeString(this.openDate);
        dest.writeString(this.closeDate);
        dest.writeString(this.updatedTimestamp);
        Double d10 = this.latitude;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        Double d11 = this.longitude;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        dest.writeString(this.imageURL);
        Integer num3 = this.imageSize;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.imageFormat);
        dest.writeString(this.timeZone);
        dest.writeString(this.daylightSavings);
        Integer num4 = this.auxUnitTypeId;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        dest.writeString(this.auxUnitType);
    }

    public StoreAuxUnitInfo(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Double d10, Double d11, String str12, Integer num3, String str13, String str14, String str15, Integer num4, String str16) {
        this.auxUnitId = num;
        this.unitId = num2;
        this.address = str;
        this.addressLine2 = str2;
        this.longName = str3;
        this.shortName = str4;
        this.phoneNumber = str5;
        this.city = str6;
        this.state = str7;
        this.zipCode = str8;
        this.openDate = str9;
        this.closeDate = str10;
        this.updatedTimestamp = str11;
        this.latitude = d10;
        this.longitude = d11;
        this.imageURL = str12;
        this.imageSize = num3;
        this.imageFormat = str13;
        this.timeZone = str14;
        this.daylightSavings = str15;
        this.auxUnitTypeId = num4;
        this.auxUnitType = str16;
    }

    /* renamed from: R, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: c, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        Integer num = this.auxUnitId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.unitId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.address;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine2;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.longName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shortName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneNumber;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.zipCode;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.openDate;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.closeDate;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.updatedTimestamp;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Double d10 = this.latitude;
        int iHashCode14 = (iHashCode13 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.longitude;
        int iHashCode15 = (iHashCode14 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str12 = this.imageURL;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num3 = this.imageSize;
        int iHashCode17 = (iHashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str13 = this.imageFormat;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.timeZone;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.daylightSavings;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num4 = this.auxUnitTypeId;
        int iHashCode21 = (iHashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str16 = this.auxUnitType;
        return iHashCode21 + (str16 != null ? str16.hashCode() : 0);
    }

    public String toString() {
        return "StoreAuxUnitInfo(auxUnitId=" + this.auxUnitId + ", unitId=" + this.unitId + ", address=" + this.address + ", addressLine2=" + this.addressLine2 + ", longName=" + this.longName + ", shortName=" + this.shortName + ", phoneNumber=" + this.phoneNumber + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", openDate=" + this.openDate + ", closeDate=" + this.closeDate + ", updatedTimestamp=" + this.updatedTimestamp + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", imageURL=" + this.imageURL + ", imageSize=" + this.imageSize + ", imageFormat=" + this.imageFormat + ", timeZone=" + this.timeZone + ", daylightSavings=" + this.daylightSavings + ", auxUnitTypeId=" + this.auxUnitTypeId + ", auxUnitType=" + this.auxUnitType + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StoreAuxUnitInfo(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Double d10, Double d11, String str12, Integer num3, String str13, String str14, String str15, Integer num4, String str16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i10 & 1) != 0 ? num : num, (i10 & 2) != 0 ? num : num2, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? "" : str3, (i10 & 32) != 0 ? "" : str4, (i10 & 64) != 0 ? "" : str5, (i10 & 128) != 0 ? "" : str6, (i10 & 256) != 0 ? "" : str7, (i10 & 512) != 0 ? "" : str8, (i10 & 1024) != 0 ? "" : str9, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str10, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "" : str11, (i10 & 8192) != 0 ? dValueOf : d10, (i10 & 16384) != 0 ? dValueOf : d11, (i10 & 32768) != 0 ? "" : str12, (i10 & 65536) != 0 ? num : num3, (i10 & 131072) != 0 ? "" : str13, (i10 & 262144) != 0 ? "" : str14, (i10 & 524288) != 0 ? "" : str15, (i10 & 1048576) == 0 ? num4 : 0, (i10 & 2097152) != 0 ? "" : str16);
    }
}

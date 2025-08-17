package com.meijer.mobile.storeinfo.api.model;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ok.StoreAuxUnitInfo;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0001'B\u008f\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0098\u0002\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010-\u001a\u0004\b'\u0010 \"\u0004\b.\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b+\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010 \"\u0004\b7\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010-\u001a\u0004\b3\u0010 \"\u0004\b9\u0010/R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010-\u001a\u0004\b;\u0010 \"\u0004\b<\u0010/R$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010-\u001a\u0004\b>\u0010 \"\u0004\b?\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\b5\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\bC\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bB\u0010FR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bA\u0010E\u001a\u0004\bD\u0010FR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b@\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b=\u0010*R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b:\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\bG\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b8\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010(\u001a\u0004\b1\u0010*R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b0\u0010 ¨\u0006I"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;", "", "", "auxUnitId", "unitId", "", PlaceTypes.ADDRESS, "addressLine2", "longName", "shortName", "phoneNumber", "city", "state", "zipCode", "openDate", "closeDate", "updatedTimestamp", "", "latitude", "longitude", "imageURL", "imageSize", "imageFormat", "timeZone", "daylightSavings", "auxUnitTypeId", "auxUnitType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "t", "Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "d", "e", "m", "f", "q", "g", "p", "setPhoneNumber", "h", "setCity", "i", "r", "setState", "j", "v", "setZipCode", "k", "o", "l", "u", "n", "Ljava/lang/Double;", "()Ljava/lang/Double;", "s", "w", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuxUnitInfo {

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo$a;", "", "<init>", "()V", "Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;", "Lok/g;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;)Lok/g;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.storeinfo.api.model.AuxUnitInfo$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StoreAuxUnitInfo a(AuxUnitInfo auxUnitInfo) {
            Intrinsics.j(auxUnitInfo, "<this>");
            return new StoreAuxUnitInfo(auxUnitInfo.getAuxUnitId(), auxUnitInfo.getUnitId(), auxUnitInfo.getAddress(), auxUnitInfo.getAddressLine2(), auxUnitInfo.getLongName(), auxUnitInfo.getShortName(), auxUnitInfo.getPhoneNumber(), auxUnitInfo.getCity(), auxUnitInfo.getState(), auxUnitInfo.getZipCode(), auxUnitInfo.getOpenDate(), auxUnitInfo.getCloseDate(), auxUnitInfo.getUpdatedTimestamp(), auxUnitInfo.getLatitude(), auxUnitInfo.getLongitude(), auxUnitInfo.getImageURL(), auxUnitInfo.getImageSize(), auxUnitInfo.getImageFormat(), auxUnitInfo.getTimeZone(), auxUnitInfo.getDaylightSavings(), auxUnitInfo.getAuxUnitTypeId(), auxUnitInfo.getAuxUnitType());
        }
    }

    public AuxUnitInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public final AuxUnitInfo copy(@g(name = "AuxUnitId") Integer auxUnitId, @g(name = "UnitId") Integer unitId, @g(name = "Address") String address, @g(name = "AddressLine2") String addressLine2, @g(name = "LongName") String longName, @g(name = "ShortName") String shortName, @g(name = "PhoneNumber") String phoneNumber, @g(name = "City") String city, @g(name = "State") String state, @g(name = "ZipCode") String zipCode, @g(name = "OpenDate") String openDate, @g(name = "CloseDate") String closeDate, @g(name = "UpdatedTimestamp") String updatedTimestamp, @g(name = "Latitude") Double latitude, @g(name = "Longitude") Double longitude, @g(name = "ImageURL") String imageURL, @g(name = "ImageSize") Integer imageSize, @g(name = "ImageFormat") String imageFormat, @g(name = "TimeZone") String timeZone, @g(name = "DaylightSavings") String daylightSavings, @g(name = "AuxUnitTypeId") Integer auxUnitTypeId, @g(name = "AuxUnitType") String auxUnitType) {
        return new AuxUnitInfo(auxUnitId, unitId, address, addressLine2, longName, shortName, phoneNumber, city, state, zipCode, openDate, closeDate, updatedTimestamp, latitude, longitude, imageURL, imageSize, imageFormat, timeZone, daylightSavings, auxUnitTypeId, auxUnitType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuxUnitInfo)) {
            return false;
        }
        AuxUnitInfo auxUnitInfo = (AuxUnitInfo) other;
        return Intrinsics.e(this.auxUnitId, auxUnitInfo.auxUnitId) && Intrinsics.e(this.unitId, auxUnitInfo.unitId) && Intrinsics.e(this.address, auxUnitInfo.address) && Intrinsics.e(this.addressLine2, auxUnitInfo.addressLine2) && Intrinsics.e(this.longName, auxUnitInfo.longName) && Intrinsics.e(this.shortName, auxUnitInfo.shortName) && Intrinsics.e(this.phoneNumber, auxUnitInfo.phoneNumber) && Intrinsics.e(this.city, auxUnitInfo.city) && Intrinsics.e(this.state, auxUnitInfo.state) && Intrinsics.e(this.zipCode, auxUnitInfo.zipCode) && Intrinsics.e(this.openDate, auxUnitInfo.openDate) && Intrinsics.e(this.closeDate, auxUnitInfo.closeDate) && Intrinsics.e(this.updatedTimestamp, auxUnitInfo.updatedTimestamp) && Intrinsics.e(this.latitude, auxUnitInfo.latitude) && Intrinsics.e(this.longitude, auxUnitInfo.longitude) && Intrinsics.e(this.imageURL, auxUnitInfo.imageURL) && Intrinsics.e(this.imageSize, auxUnitInfo.imageSize) && Intrinsics.e(this.imageFormat, auxUnitInfo.imageFormat) && Intrinsics.e(this.timeZone, auxUnitInfo.timeZone) && Intrinsics.e(this.daylightSavings, auxUnitInfo.daylightSavings) && Intrinsics.e(this.auxUnitTypeId, auxUnitInfo.auxUnitTypeId) && Intrinsics.e(this.auxUnitType, auxUnitInfo.auxUnitType);
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
        return "AuxUnitInfo(auxUnitId=" + this.auxUnitId + ", unitId=" + this.unitId + ", address=" + this.address + ", addressLine2=" + this.addressLine2 + ", longName=" + this.longName + ", shortName=" + this.shortName + ", phoneNumber=" + this.phoneNumber + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", openDate=" + this.openDate + ", closeDate=" + this.closeDate + ", updatedTimestamp=" + this.updatedTimestamp + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", imageURL=" + this.imageURL + ", imageSize=" + this.imageSize + ", imageFormat=" + this.imageFormat + ", timeZone=" + this.timeZone + ", daylightSavings=" + this.daylightSavings + ", auxUnitTypeId=" + this.auxUnitTypeId + ", auxUnitType=" + this.auxUnitType + ')';
    }

    public AuxUnitInfo(@g(name = "AuxUnitId") Integer num, @g(name = "UnitId") Integer num2, @g(name = "Address") String str, @g(name = "AddressLine2") String str2, @g(name = "LongName") String str3, @g(name = "ShortName") String str4, @g(name = "PhoneNumber") String str5, @g(name = "City") String str6, @g(name = "State") String str7, @g(name = "ZipCode") String str8, @g(name = "OpenDate") String str9, @g(name = "CloseDate") String str10, @g(name = "UpdatedTimestamp") String str11, @g(name = "Latitude") Double d10, @g(name = "Longitude") Double d11, @g(name = "ImageURL") String str12, @g(name = "ImageSize") Integer num3, @g(name = "ImageFormat") String str13, @g(name = "TimeZone") String str14, @g(name = "DaylightSavings") String str15, @g(name = "AuxUnitTypeId") Integer num4, @g(name = "AuxUnitType") String str16) {
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

    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getAuxUnitId() {
        return this.auxUnitId;
    }

    /* renamed from: d, reason: from getter */
    public final String getAuxUnitType() {
        return this.auxUnitType;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getAuxUnitTypeId() {
        return this.auxUnitTypeId;
    }

    /* renamed from: f, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: g, reason: from getter */
    public final String getCloseDate() {
        return this.closeDate;
    }

    /* renamed from: h, reason: from getter */
    public final String getDaylightSavings() {
        return this.daylightSavings;
    }

    /* renamed from: i, reason: from getter */
    public final String getImageFormat() {
        return this.imageFormat;
    }

    /* renamed from: j, reason: from getter */
    public final Integer getImageSize() {
        return this.imageSize;
    }

    /* renamed from: k, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: l, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: m, reason: from getter */
    public final String getLongName() {
        return this.longName;
    }

    /* renamed from: n, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: o, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    /* renamed from: p, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: q, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* renamed from: r, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: s, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: t, reason: from getter */
    public final Integer getUnitId() {
        return this.unitId;
    }

    /* renamed from: u, reason: from getter */
    public final String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /* renamed from: v, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AuxUnitInfo(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Double d10, Double d11, String str12, Integer num3, String str13, String str14, String str15, Integer num4, String str16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i10 & 1) != 0 ? num : num, (i10 & 2) != 0 ? num : num2, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? "" : str3, (i10 & 32) != 0 ? "" : str4, (i10 & 64) != 0 ? "" : str5, (i10 & 128) != 0 ? "" : str6, (i10 & 256) != 0 ? "" : str7, (i10 & 512) != 0 ? "" : str8, (i10 & 1024) != 0 ? "" : str9, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str10, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "" : str11, (i10 & 8192) != 0 ? dValueOf : d10, (i10 & 16384) != 0 ? dValueOf : d11, (i10 & 32768) != 0 ? "" : str12, (i10 & 65536) != 0 ? num : num3, (i10 & 131072) != 0 ? "" : str13, (i10 & 262144) != 0 ? "" : str14, (i10 & 524288) == 0 ? str15 : "", (i10 & 1048576) == 0 ? num4 : 0, (i10 & 2097152) != 0 ? null : str16);
    }
}

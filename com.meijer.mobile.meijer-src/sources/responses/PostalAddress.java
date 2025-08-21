package responses;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJd\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001f"}, d2 = {"Lresponses/PostalAddress;", "", "", "streetAddress1", "streetAddress2", "city", "mainDivision", "subDivision", "postalCode", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lresponses/PostalAddress;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "f", "c", "d", "g", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PostalAddress {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddress1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String streetAddress2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mainDivision;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subDivision;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    public PostalAddress() {
        this(null, null, null, null, null, null, null, l3.f93324d, null);
    }

    public final PostalAddress copy(@g(name = "StreetAddress1") String streetAddress1, @g(name = "StreetAddress2") String streetAddress2, @g(name = "City") String city, @g(name = "MainDivision") String mainDivision, @g(name = "SubDivision") String subDivision, @g(name = "PostalCode") String postalCode, @g(name = "Country") String country) {
        return new PostalAddress(streetAddress1, streetAddress2, city, mainDivision, subDivision, postalCode, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostalAddress)) {
            return false;
        }
        PostalAddress postalAddress = (PostalAddress) other;
        return Intrinsics.e(this.streetAddress1, postalAddress.streetAddress1) && Intrinsics.e(this.streetAddress2, postalAddress.streetAddress2) && Intrinsics.e(this.city, postalAddress.city) && Intrinsics.e(this.mainDivision, postalAddress.mainDivision) && Intrinsics.e(this.subDivision, postalAddress.subDivision) && Intrinsics.e(this.postalCode, postalAddress.postalCode) && Intrinsics.e(this.country, postalAddress.country);
    }

    public int hashCode() {
        String str = this.streetAddress1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streetAddress2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mainDivision;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subDivision;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postalCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.country;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "PostalAddress(streetAddress1=" + this.streetAddress1 + ", streetAddress2=" + this.streetAddress2 + ", city=" + this.city + ", mainDivision=" + this.mainDivision + ", subDivision=" + this.subDivision + ", postalCode=" + this.postalCode + ", country=" + this.country + ')';
    }

    public PostalAddress(@g(name = "StreetAddress1") String str, @g(name = "StreetAddress2") String str2, @g(name = "City") String str3, @g(name = "MainDivision") String str4, @g(name = "SubDivision") String str5, @g(name = "PostalCode") String str6, @g(name = "Country") String str7) {
        this.streetAddress1 = str;
        this.streetAddress2 = str2;
        this.city = str3;
        this.mainDivision = str4;
        this.subDivision = str5;
        this.postalCode = str6;
        this.country = str7;
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
    public final String getMainDivision() {
        return this.mainDivision;
    }

    /* renamed from: d, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: e, reason: from getter */
    public final String getStreetAddress1() {
        return this.streetAddress1;
    }

    /* renamed from: f, reason: from getter */
    public final String getStreetAddress2() {
        return this.streetAddress2;
    }

    /* renamed from: g, reason: from getter */
    public final String getSubDivision() {
        return this.subDivision;
    }

    public /* synthetic */ PostalAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7);
    }
}

package com.meijer.mobile.shoppinglist.teacherlists.service.response.school;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J¬\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b\u001e\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b!\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b*\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b+\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b(\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b-\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b$\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b%\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b'\u0010/¨\u00060"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;", "", "", PreferencesHelper.PREF_ID, "", "schoolName", PlaceTypes.ADDRESS, "secondaryAddress", "city", "state", "zip", "lowestGrade", "highestGrade", "schoolYearStart", "districtId", "ncesId", "hasDressCode", "hasUniformPolicy", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "Ljava/lang/String;", "j", "c", "d", "l", "e", "f", "m", "n", "h", "i", "k", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SchoolResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secondaryAddress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lowestGrade;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String highestGrade;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolYearStart;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer districtId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ncesId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer hasDressCode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer hasUniformPolicy;

    public SchoolResponse(@g(name = PreferencesHelper.PREF_ID) int i10, @g(name = "school_name") String schoolName, @g(name = PlaceTypes.ADDRESS) String address, @g(name = "address2") String str, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "lowest_grade") String str2, @g(name = "highest_grade") String str3, @g(name = "school_year_start") String str4, @g(name = "district_id") Integer num, @g(name = "nces_id") String str5, @g(name = "has_dress_code") Integer num2, @g(name = "has_uniform_policy") Integer num3) {
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(address, "address");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        this.id = i10;
        this.schoolName = schoolName;
        this.address = address;
        this.secondaryAddress = str;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.lowestGrade = str2;
        this.highestGrade = str3;
        this.schoolYearStart = str4;
        this.districtId = num;
        this.ncesId = str5;
        this.hasDressCode = num2;
        this.hasUniformPolicy = num3;
    }

    public final SchoolResponse copy(@g(name = PreferencesHelper.PREF_ID) int id2, @g(name = "school_name") String schoolName, @g(name = PlaceTypes.ADDRESS) String address, @g(name = "address2") String secondaryAddress, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "lowest_grade") String lowestGrade, @g(name = "highest_grade") String highestGrade, @g(name = "school_year_start") String schoolYearStart, @g(name = "district_id") Integer districtId, @g(name = "nces_id") String ncesId, @g(name = "has_dress_code") Integer hasDressCode, @g(name = "has_uniform_policy") Integer hasUniformPolicy) {
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(address, "address");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        return new SchoolResponse(id2, schoolName, address, secondaryAddress, city, state, zip, lowestGrade, highestGrade, schoolYearStart, districtId, ncesId, hasDressCode, hasUniformPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchoolResponse)) {
            return false;
        }
        SchoolResponse schoolResponse = (SchoolResponse) other;
        return this.id == schoolResponse.id && Intrinsics.e(this.schoolName, schoolResponse.schoolName) && Intrinsics.e(this.address, schoolResponse.address) && Intrinsics.e(this.secondaryAddress, schoolResponse.secondaryAddress) && Intrinsics.e(this.city, schoolResponse.city) && Intrinsics.e(this.state, schoolResponse.state) && Intrinsics.e(this.zip, schoolResponse.zip) && Intrinsics.e(this.lowestGrade, schoolResponse.lowestGrade) && Intrinsics.e(this.highestGrade, schoolResponse.highestGrade) && Intrinsics.e(this.schoolYearStart, schoolResponse.schoolYearStart) && Intrinsics.e(this.districtId, schoolResponse.districtId) && Intrinsics.e(this.ncesId, schoolResponse.ncesId) && Intrinsics.e(this.hasDressCode, schoolResponse.hasDressCode) && Intrinsics.e(this.hasUniformPolicy, schoolResponse.hasUniformPolicy);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.schoolName.hashCode()) * 31) + this.address.hashCode()) * 31;
        String str = this.secondaryAddress;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31;
        String str2 = this.lowestGrade;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.highestGrade;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schoolYearStart;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.districtId;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.ncesId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.hasDressCode;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hasUniformPolicy;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "SchoolResponse(id=" + this.id + ", schoolName=" + this.schoolName + ", address=" + this.address + ", secondaryAddress=" + this.secondaryAddress + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", lowestGrade=" + this.lowestGrade + ", highestGrade=" + this.highestGrade + ", schoolYearStart=" + this.schoolYearStart + ", districtId=" + this.districtId + ", ncesId=" + this.ncesId + ", hasDressCode=" + this.hasDressCode + ", hasUniformPolicy=" + this.hasUniformPolicy + ')';
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
    public final Integer getDistrictId() {
        return this.districtId;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getHasDressCode() {
        return this.hasDressCode;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getHasUniformPolicy() {
        return this.hasUniformPolicy;
    }

    /* renamed from: f, reason: from getter */
    public final String getHighestGrade() {
        return this.highestGrade;
    }

    /* renamed from: g, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: h, reason: from getter */
    public final String getLowestGrade() {
        return this.lowestGrade;
    }

    /* renamed from: i, reason: from getter */
    public final String getNcesId() {
        return this.ncesId;
    }

    /* renamed from: j, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    /* renamed from: k, reason: from getter */
    public final String getSchoolYearStart() {
        return this.schoolYearStart;
    }

    /* renamed from: l, reason: from getter */
    public final String getSecondaryAddress() {
        return this.secondaryAddress;
    }

    /* renamed from: m, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: n, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public /* synthetic */ SchoolResponse(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, str4, str5, str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, str9, num, str10, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num2, (i11 & 8192) != 0 ? null : num3);
    }
}

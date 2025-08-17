package com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J²\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u00022\u000e\b\u0003\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b!\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b$\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b/\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b-\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b(\u00103R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b+\u0010\u001cR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\b'\u00105¨\u00066"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;", "", "", PreferencesHelper.PREF_ID, "", "schoolName", PlaceTypes.ADDRESS, "secondaryAddress", "city", "state", "zip", "lowestGrade", "highestGrade", "schoolYearStart", "districtId", "ncesId", "hasDressCode", "hasUniformPolicy", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomResponse;", "classroomsList", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IILjava/util/List;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IILjava/util/List;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "h", "b", "Ljava/lang/String;", "k", "c", "d", "m", "e", "f", "n", "g", "o", "i", "j", "l", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/util/List;", "()Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ClassroomListResponse {

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
    private final int hasDressCode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hasUniformPolicy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ClassroomResponse> classroomsList;

    public ClassroomListResponse(@g(name = PreferencesHelper.PREF_ID) int i10, @g(name = "school_name") String schoolName, @g(name = PlaceTypes.ADDRESS) String address, @g(name = "address2") String str, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "lowest_grade") String lowestGrade, @g(name = "highest_grade") String highestGrade, @g(name = "school_year_start") String str2, @g(name = "district_id") Integer num, @g(name = "nces_id") String ncesId, @g(name = "has_dress_code") int i11, @g(name = "has_uniform_policy") int i12, @g(name = "lists") List<ClassroomResponse> classroomsList) {
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(address, "address");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(lowestGrade, "lowestGrade");
        Intrinsics.j(highestGrade, "highestGrade");
        Intrinsics.j(ncesId, "ncesId");
        Intrinsics.j(classroomsList, "classroomsList");
        this.id = i10;
        this.schoolName = schoolName;
        this.address = address;
        this.secondaryAddress = str;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.lowestGrade = lowestGrade;
        this.highestGrade = highestGrade;
        this.schoolYearStart = str2;
        this.districtId = num;
        this.ncesId = ncesId;
        this.hasDressCode = i11;
        this.hasUniformPolicy = i12;
        this.classroomsList = classroomsList;
    }

    public final ClassroomListResponse copy(@g(name = PreferencesHelper.PREF_ID) int id2, @g(name = "school_name") String schoolName, @g(name = PlaceTypes.ADDRESS) String address, @g(name = "address2") String secondaryAddress, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zip, @g(name = "lowest_grade") String lowestGrade, @g(name = "highest_grade") String highestGrade, @g(name = "school_year_start") String schoolYearStart, @g(name = "district_id") Integer districtId, @g(name = "nces_id") String ncesId, @g(name = "has_dress_code") int hasDressCode, @g(name = "has_uniform_policy") int hasUniformPolicy, @g(name = "lists") List<ClassroomResponse> classroomsList) {
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(address, "address");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(lowestGrade, "lowestGrade");
        Intrinsics.j(highestGrade, "highestGrade");
        Intrinsics.j(ncesId, "ncesId");
        Intrinsics.j(classroomsList, "classroomsList");
        return new ClassroomListResponse(id2, schoolName, address, secondaryAddress, city, state, zip, lowestGrade, highestGrade, schoolYearStart, districtId, ncesId, hasDressCode, hasUniformPolicy, classroomsList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassroomListResponse)) {
            return false;
        }
        ClassroomListResponse classroomListResponse = (ClassroomListResponse) other;
        return this.id == classroomListResponse.id && Intrinsics.e(this.schoolName, classroomListResponse.schoolName) && Intrinsics.e(this.address, classroomListResponse.address) && Intrinsics.e(this.secondaryAddress, classroomListResponse.secondaryAddress) && Intrinsics.e(this.city, classroomListResponse.city) && Intrinsics.e(this.state, classroomListResponse.state) && Intrinsics.e(this.zip, classroomListResponse.zip) && Intrinsics.e(this.lowestGrade, classroomListResponse.lowestGrade) && Intrinsics.e(this.highestGrade, classroomListResponse.highestGrade) && Intrinsics.e(this.schoolYearStart, classroomListResponse.schoolYearStart) && Intrinsics.e(this.districtId, classroomListResponse.districtId) && Intrinsics.e(this.ncesId, classroomListResponse.ncesId) && this.hasDressCode == classroomListResponse.hasDressCode && this.hasUniformPolicy == classroomListResponse.hasUniformPolicy && Intrinsics.e(this.classroomsList, classroomListResponse.classroomsList);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.schoolName.hashCode()) * 31) + this.address.hashCode()) * 31;
        String str = this.secondaryAddress;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + this.lowestGrade.hashCode()) * 31) + this.highestGrade.hashCode()) * 31;
        String str2 = this.schoolYearStart;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.districtId;
        return ((((((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.ncesId.hashCode()) * 31) + Integer.hashCode(this.hasDressCode)) * 31) + Integer.hashCode(this.hasUniformPolicy)) * 31) + this.classroomsList.hashCode();
    }

    public String toString() {
        return "ClassroomListResponse(id=" + this.id + ", schoolName=" + this.schoolName + ", address=" + this.address + ", secondaryAddress=" + this.secondaryAddress + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", lowestGrade=" + this.lowestGrade + ", highestGrade=" + this.highestGrade + ", schoolYearStart=" + this.schoolYearStart + ", districtId=" + this.districtId + ", ncesId=" + this.ncesId + ", hasDressCode=" + this.hasDressCode + ", hasUniformPolicy=" + this.hasUniformPolicy + ", classroomsList=" + this.classroomsList + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final List<ClassroomResponse> c() {
        return this.classroomsList;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getDistrictId() {
        return this.districtId;
    }

    /* renamed from: e, reason: from getter */
    public final int getHasDressCode() {
        return this.hasDressCode;
    }

    /* renamed from: f, reason: from getter */
    public final int getHasUniformPolicy() {
        return this.hasUniformPolicy;
    }

    /* renamed from: g, reason: from getter */
    public final String getHighestGrade() {
        return this.highestGrade;
    }

    /* renamed from: h, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: i, reason: from getter */
    public final String getLowestGrade() {
        return this.lowestGrade;
    }

    /* renamed from: j, reason: from getter */
    public final String getNcesId() {
        return this.ncesId;
    }

    /* renamed from: k, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    /* renamed from: l, reason: from getter */
    public final String getSchoolYearStart() {
        return this.schoolYearStart;
    }

    /* renamed from: m, reason: from getter */
    public final String getSecondaryAddress() {
        return this.secondaryAddress;
    }

    /* renamed from: n, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: o, reason: from getter */
    public final String getZip() {
        return this.zip;
    }
}

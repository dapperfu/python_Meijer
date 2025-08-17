package Kq;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.school.SchoolResponse;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u0000 62\u00020\u0001:\u0001\u001cB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b#\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b$\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\u0015R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u0017¨\u00067"}, d2 = {"LKq/b;", "", "", PreferencesHelper.PREF_ID, "", "schoolName", PlaceTypes.ADDRESS, "secondaryAddress", "city", "state", "zip", "lowestGrade", "highestGrade", "schoolYearStart", "districtId", "ncesId", "hasDressCode", "hasUniformPolicy", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "d", "getSecondaryAddress", "e", "f", "g", "h", "getLowestGrade", "i", "getHighestGrade", "j", "getSchoolYearStart", "k", "Ljava/lang/Integer;", "getDistrictId", "()Ljava/lang/Integer;", "l", "getNcesId", "m", "getHasDressCode", "n", "getHasUniformPolicy", "o", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kq.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class School {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKq/b$a;", "", "<init>", "()V", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;", "response", "LKq/b;", "a", "(Ljava/util/List;)Ljava/util/List;", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Kq.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<School> a(List<SchoolResponse> response) {
            Intrinsics.j(response, "response");
            List<SchoolResponse> list = response;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (SchoolResponse schoolResponse : list) {
                int id2 = schoolResponse.getId();
                String schoolName = schoolResponse.getSchoolName();
                String address = schoolResponse.getAddress();
                String secondaryAddress = schoolResponse.getSecondaryAddress();
                String city = schoolResponse.getCity();
                String state = schoolResponse.getState();
                String zip = schoolResponse.getZip();
                String lowestGrade = schoolResponse.getLowestGrade();
                if (lowestGrade == null) {
                    lowestGrade = "";
                }
                String highestGrade = schoolResponse.getHighestGrade();
                String str = highestGrade != null ? highestGrade : "";
                String schoolYearStart = schoolResponse.getSchoolYearStart();
                Integer districtId = schoolResponse.getDistrictId();
                String ncesId = schoolResponse.getNcesId();
                Integer hasDressCode = schoolResponse.getHasDressCode();
                int iIntValue = 0;
                int iIntValue2 = hasDressCode != null ? hasDressCode.intValue() : 0;
                Integer hasUniformPolicy = schoolResponse.getHasUniformPolicy();
                if (hasUniformPolicy != null) {
                    iIntValue = hasUniformPolicy.intValue();
                }
                arrayList.add(new School(id2, schoolName, address, secondaryAddress, city, state, zip, lowestGrade, str, schoolYearStart, districtId, ncesId, iIntValue2, iIntValue));
            }
            return arrayList;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof School)) {
            return false;
        }
        School school = (School) other;
        return this.id == school.id && Intrinsics.e(this.schoolName, school.schoolName) && Intrinsics.e(this.address, school.address) && Intrinsics.e(this.secondaryAddress, school.secondaryAddress) && Intrinsics.e(this.city, school.city) && Intrinsics.e(this.state, school.state) && Intrinsics.e(this.zip, school.zip) && Intrinsics.e(this.lowestGrade, school.lowestGrade) && Intrinsics.e(this.highestGrade, school.highestGrade) && Intrinsics.e(this.schoolYearStart, school.schoolYearStart) && Intrinsics.e(this.districtId, school.districtId) && Intrinsics.e(this.ncesId, school.ncesId) && this.hasDressCode == school.hasDressCode && this.hasUniformPolicy == school.hasUniformPolicy;
    }

    public School(int i10, String schoolName, String address, String str, String city, String state, String zip, String lowestGrade, String highestGrade, String str2, Integer num, String str3, int i11, int i12) {
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(address, "address");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        Intrinsics.j(lowestGrade, "lowestGrade");
        Intrinsics.j(highestGrade, "highestGrade");
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
        this.ncesId = str3;
        this.hasDressCode = i11;
        this.hasUniformPolicy = i12;
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
    public final int getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    /* renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: f, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.schoolName.hashCode()) * 31) + this.address.hashCode()) * 31;
        String str = this.secondaryAddress;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + this.lowestGrade.hashCode()) * 31) + this.highestGrade.hashCode()) * 31;
        String str2 = this.schoolYearStart;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.districtId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.ncesId;
        return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.hasDressCode)) * 31) + Integer.hashCode(this.hasUniformPolicy);
    }

    public String toString() {
        return "School(id=" + this.id + ", schoolName=" + this.schoolName + ", address=" + this.address + ", secondaryAddress=" + this.secondaryAddress + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", lowestGrade=" + this.lowestGrade + ", highestGrade=" + this.highestGrade + ", schoolYearStart=" + this.schoolYearStart + ", districtId=" + this.districtId + ", ncesId=" + this.ncesId + ", hasDressCode=" + this.hasDressCode + ", hasUniformPolicy=" + this.hasUniformPolicy + ')';
    }
}

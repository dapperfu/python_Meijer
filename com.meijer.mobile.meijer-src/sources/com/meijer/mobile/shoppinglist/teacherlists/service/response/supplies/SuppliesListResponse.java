package com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJb\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;", "", "", "classroomName", "schoolYear", "updatedTimestamp", "schoolName", "gradeLevel", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/AvailableItemsResponse;", "availableItems", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/UnavailableItemsResponse;", "unavailableItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "g", "d", "f", "Ljava/util/List;", "()Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SuppliesListResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String classroomName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolYear;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedTimestamp;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gradeLevel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableItemsResponse> availableItems;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<UnavailableItemsResponse> unavailableItems;

    public final SuppliesListResponse copy(@g(name = "class_name") String classroomName, @g(name = "school_year") String schoolYear, @g(name = "updated_at") String updatedTimestamp, @g(name = "school_name") String schoolName, @g(name = "grade") String gradeLevel, @g(name = "available_items") List<AvailableItemsResponse> availableItems, @g(name = "unavailable_items") List<UnavailableItemsResponse> unavailableItems) {
        Intrinsics.j(classroomName, "classroomName");
        Intrinsics.j(schoolYear, "schoolYear");
        Intrinsics.j(updatedTimestamp, "updatedTimestamp");
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(gradeLevel, "gradeLevel");
        Intrinsics.j(availableItems, "availableItems");
        Intrinsics.j(unavailableItems, "unavailableItems");
        return new SuppliesListResponse(classroomName, schoolYear, updatedTimestamp, schoolName, gradeLevel, availableItems, unavailableItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuppliesListResponse)) {
            return false;
        }
        SuppliesListResponse suppliesListResponse = (SuppliesListResponse) other;
        return Intrinsics.e(this.classroomName, suppliesListResponse.classroomName) && Intrinsics.e(this.schoolYear, suppliesListResponse.schoolYear) && Intrinsics.e(this.updatedTimestamp, suppliesListResponse.updatedTimestamp) && Intrinsics.e(this.schoolName, suppliesListResponse.schoolName) && Intrinsics.e(this.gradeLevel, suppliesListResponse.gradeLevel) && Intrinsics.e(this.availableItems, suppliesListResponse.availableItems) && Intrinsics.e(this.unavailableItems, suppliesListResponse.unavailableItems);
    }

    public int hashCode() {
        return (((((((((((this.classroomName.hashCode() * 31) + this.schoolYear.hashCode()) * 31) + this.updatedTimestamp.hashCode()) * 31) + this.schoolName.hashCode()) * 31) + this.gradeLevel.hashCode()) * 31) + this.availableItems.hashCode()) * 31) + this.unavailableItems.hashCode();
    }

    public String toString() {
        return "SuppliesListResponse(classroomName=" + this.classroomName + ", schoolYear=" + this.schoolYear + ", updatedTimestamp=" + this.updatedTimestamp + ", schoolName=" + this.schoolName + ", gradeLevel=" + this.gradeLevel + ", availableItems=" + this.availableItems + ", unavailableItems=" + this.unavailableItems + ')';
    }

    public SuppliesListResponse(@g(name = "class_name") String classroomName, @g(name = "school_year") String schoolYear, @g(name = "updated_at") String updatedTimestamp, @g(name = "school_name") String schoolName, @g(name = "grade") String gradeLevel, @g(name = "available_items") List<AvailableItemsResponse> availableItems, @g(name = "unavailable_items") List<UnavailableItemsResponse> unavailableItems) {
        Intrinsics.j(classroomName, "classroomName");
        Intrinsics.j(schoolYear, "schoolYear");
        Intrinsics.j(updatedTimestamp, "updatedTimestamp");
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(gradeLevel, "gradeLevel");
        Intrinsics.j(availableItems, "availableItems");
        Intrinsics.j(unavailableItems, "unavailableItems");
        this.classroomName = classroomName;
        this.schoolYear = schoolYear;
        this.updatedTimestamp = updatedTimestamp;
        this.schoolName = schoolName;
        this.gradeLevel = gradeLevel;
        this.availableItems = availableItems;
        this.unavailableItems = unavailableItems;
    }

    public final List<AvailableItemsResponse> a() {
        return this.availableItems;
    }

    /* renamed from: b, reason: from getter */
    public final String getClassroomName() {
        return this.classroomName;
    }

    /* renamed from: c, reason: from getter */
    public final String getGradeLevel() {
        return this.gradeLevel;
    }

    /* renamed from: d, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    /* renamed from: e, reason: from getter */
    public final String getSchoolYear() {
        return this.schoolYear;
    }

    public final List<UnavailableItemsResponse> f() {
        return this.unavailableItems;
    }

    /* renamed from: g, reason: from getter */
    public final String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }
}

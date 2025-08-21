package com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomResponse;", "", "", PreferencesHelper.PREF_ID, "", "classroomName", "classroomDescription", "publishDate", "gradeLevels", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClassroomResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String classroomName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String classroomDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publishDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gradeLevels;

    public final ClassroomResponse copy(@g(name = PreferencesHelper.PREF_ID) int id2, @g(name = "list_name") String classroomName, @g(name = "description") String classroomDescription, @g(name = "publish_date") String publishDate, @g(name = "grade_levels") String gradeLevels) {
        Intrinsics.j(classroomName, "classroomName");
        Intrinsics.j(classroomDescription, "classroomDescription");
        Intrinsics.j(gradeLevels, "gradeLevels");
        return new ClassroomResponse(id2, classroomName, classroomDescription, publishDate, gradeLevels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassroomResponse)) {
            return false;
        }
        ClassroomResponse classroomResponse = (ClassroomResponse) other;
        return this.id == classroomResponse.id && Intrinsics.e(this.classroomName, classroomResponse.classroomName) && Intrinsics.e(this.classroomDescription, classroomResponse.classroomDescription) && Intrinsics.e(this.publishDate, classroomResponse.publishDate) && Intrinsics.e(this.gradeLevels, classroomResponse.gradeLevels);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.classroomName.hashCode()) * 31) + this.classroomDescription.hashCode()) * 31;
        String str = this.publishDate;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.gradeLevels.hashCode();
    }

    public String toString() {
        return "ClassroomResponse(id=" + this.id + ", classroomName=" + this.classroomName + ", classroomDescription=" + this.classroomDescription + ", publishDate=" + this.publishDate + ", gradeLevels=" + this.gradeLevels + ')';
    }

    public ClassroomResponse(@g(name = PreferencesHelper.PREF_ID) int i10, @g(name = "list_name") String classroomName, @g(name = "description") String classroomDescription, @g(name = "publish_date") String str, @g(name = "grade_levels") String gradeLevels) {
        Intrinsics.j(classroomName, "classroomName");
        Intrinsics.j(classroomDescription, "classroomDescription");
        Intrinsics.j(gradeLevels, "gradeLevels");
        this.id = i10;
        this.classroomName = classroomName;
        this.classroomDescription = classroomDescription;
        this.publishDate = str;
        this.gradeLevels = gradeLevels;
    }

    /* renamed from: a, reason: from getter */
    public final String getClassroomDescription() {
        return this.classroomDescription;
    }

    /* renamed from: b, reason: from getter */
    public final String getClassroomName() {
        return this.classroomName;
    }

    /* renamed from: c, reason: from getter */
    public final String getGradeLevels() {
        return this.gradeLevels;
    }

    /* renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final String getPublishDate() {
        return this.publishDate;
    }
}

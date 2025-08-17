package Kq;

import com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom.ClassroomListResponse;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom.ClassroomResponse;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\r¨\u0006 "}, d2 = {"LKq/a;", "", "", PreferencesHelper.PREF_ID, "", "classroomName", "classroomDescription", "publishDate", "gradeLevels", "schoolName", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "getClassroomDescription", "d", "getPublishDate", "e", "f", "getSchoolName", "g", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kq.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class Classroom {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

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

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolName;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKq/a$a;", "", "<init>", "()V", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;", "response", "", "LKq/a;", "a", "(Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;)Ljava/util/List;", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Kq.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Classroom> a(ClassroomListResponse response) {
            Intrinsics.j(response, "response");
            List<ClassroomResponse> listC = response.c();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            for (ClassroomResponse classroomResponse : listC) {
                int id2 = classroomResponse.getId();
                String classroomName = classroomResponse.getClassroomName();
                String classroomDescription = classroomResponse.getClassroomDescription();
                String publishDate = classroomResponse.getPublishDate();
                if (publishDate == null) {
                    publishDate = "";
                }
                arrayList.add(new Classroom(id2, classroomName, classroomDescription, publishDate, classroomResponse.getGradeLevels(), response.getSchoolName()));
            }
            return arrayList;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Classroom)) {
            return false;
        }
        Classroom classroom = (Classroom) other;
        return this.id == classroom.id && Intrinsics.e(this.classroomName, classroom.classroomName) && Intrinsics.e(this.classroomDescription, classroom.classroomDescription) && Intrinsics.e(this.publishDate, classroom.publishDate) && Intrinsics.e(this.gradeLevels, classroom.gradeLevels) && Intrinsics.e(this.schoolName, classroom.schoolName);
    }

    public Classroom(int i10, String classroomName, String classroomDescription, String publishDate, String gradeLevels, String schoolName) {
        Intrinsics.j(classroomName, "classroomName");
        Intrinsics.j(classroomDescription, "classroomDescription");
        Intrinsics.j(publishDate, "publishDate");
        Intrinsics.j(gradeLevels, "gradeLevels");
        Intrinsics.j(schoolName, "schoolName");
        this.id = i10;
        this.classroomName = classroomName;
        this.classroomDescription = classroomDescription;
        this.publishDate = publishDate;
        this.gradeLevels = gradeLevels;
        this.schoolName = schoolName;
    }

    /* renamed from: a, reason: from getter */
    public final String getClassroomName() {
        return this.classroomName;
    }

    /* renamed from: b, reason: from getter */
    public final String getGradeLevels() {
        return this.gradeLevels;
    }

    /* renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.classroomName.hashCode()) * 31) + this.classroomDescription.hashCode()) * 31) + this.publishDate.hashCode()) * 31) + this.gradeLevels.hashCode()) * 31) + this.schoolName.hashCode();
    }

    public String toString() {
        return "Classroom(id=" + this.id + ", classroomName=" + this.classroomName + ", classroomDescription=" + this.classroomDescription + ", publishDate=" + this.publishDate + ", gradeLevels=" + this.gradeLevels + ", schoolName=" + this.schoolName + ')';
    }
}

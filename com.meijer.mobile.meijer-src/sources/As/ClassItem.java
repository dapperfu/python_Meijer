package As;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0014\u0010\n¨\u0006\u0016"}, d2 = {"LAs/a;", "", "", PreferencesHelper.PREF_ID, "", "classroomName", "gradeLevel", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "supplylists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: As.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ClassItem {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2010d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String classroomName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gradeLevel;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassItem)) {
            return false;
        }
        ClassItem classItem = (ClassItem) other;
        return this.id == classItem.id && Intrinsics.e(this.classroomName, classItem.classroomName) && Intrinsics.e(this.gradeLevel, classItem.gradeLevel);
    }

    public ClassItem(int i10, String classroomName, String gradeLevel) {
        Intrinsics.j(classroomName, "classroomName");
        Intrinsics.j(gradeLevel, "gradeLevel");
        this.id = i10;
        this.classroomName = classroomName;
        this.gradeLevel = gradeLevel;
    }

    /* renamed from: a, reason: from getter */
    public final String getClassroomName() {
        return this.classroomName;
    }

    /* renamed from: b, reason: from getter */
    public final String getGradeLevel() {
        return this.gradeLevel;
    }

    /* renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.classroomName.hashCode()) * 31) + this.gradeLevel.hashCode();
    }

    public String toString() {
        return "ClassItem(id=" + this.id + ", classroomName=" + this.classroomName + ", gradeLevel=" + this.gradeLevel + ')';
    }
}

package As;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\r¨\u0006\u001c"}, d2 = {"LAs/d;", "", "", "className", "schoolName", "schoolYear", "grade", "dateUpdated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LAs/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "f", "g", "d", "e", "supplylists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: As.d, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SchoolCard {

    /* renamed from: f, reason: collision with root package name */
    public static final int f1522f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String className;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schoolYear;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String grade;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateUpdated;

    public SchoolCard() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchoolCard)) {
            return false;
        }
        SchoolCard schoolCard = (SchoolCard) other;
        return Intrinsics.e(this.className, schoolCard.className) && Intrinsics.e(this.schoolName, schoolCard.schoolName) && Intrinsics.e(this.schoolYear, schoolCard.schoolYear) && Intrinsics.e(this.grade, schoolCard.grade) && Intrinsics.e(this.dateUpdated, schoolCard.dateUpdated);
    }

    public SchoolCard(String className, String schoolName, String schoolYear, String grade, String dateUpdated) {
        Intrinsics.j(className, "className");
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(schoolYear, "schoolYear");
        Intrinsics.j(grade, "grade");
        Intrinsics.j(dateUpdated, "dateUpdated");
        this.className = className;
        this.schoolName = schoolName;
        this.schoolYear = schoolYear;
        this.grade = grade;
        this.dateUpdated = dateUpdated;
    }

    public static /* synthetic */ SchoolCard b(SchoolCard schoolCard, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = schoolCard.className;
        }
        if ((i10 & 2) != 0) {
            str2 = schoolCard.schoolName;
        }
        if ((i10 & 4) != 0) {
            str3 = schoolCard.schoolYear;
        }
        if ((i10 & 8) != 0) {
            str4 = schoolCard.grade;
        }
        if ((i10 & 16) != 0) {
            str5 = schoolCard.dateUpdated;
        }
        String str6 = str5;
        String str7 = str3;
        return schoolCard.a(str, str2, str7, str4, str6);
    }

    public final SchoolCard a(String className, String schoolName, String schoolYear, String grade, String dateUpdated) {
        Intrinsics.j(className, "className");
        Intrinsics.j(schoolName, "schoolName");
        Intrinsics.j(schoolYear, "schoolYear");
        Intrinsics.j(grade, "grade");
        Intrinsics.j(dateUpdated, "dateUpdated");
        return new SchoolCard(className, schoolName, schoolYear, grade, dateUpdated);
    }

    /* renamed from: c, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* renamed from: d, reason: from getter */
    public final String getDateUpdated() {
        return this.dateUpdated;
    }

    /* renamed from: e, reason: from getter */
    public final String getGrade() {
        return this.grade;
    }

    /* renamed from: f, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    /* renamed from: g, reason: from getter */
    public final String getSchoolYear() {
        return this.schoolYear;
    }

    public int hashCode() {
        return (((((((this.className.hashCode() * 31) + this.schoolName.hashCode()) * 31) + this.schoolYear.hashCode()) * 31) + this.grade.hashCode()) * 31) + this.dateUpdated.hashCode();
    }

    public String toString() {
        return "SchoolCard(className=" + this.className + ", schoolName=" + this.schoolName + ", schoolYear=" + this.schoolYear + ", grade=" + this.grade + ", dateUpdated=" + this.dateUpdated + ')';
    }

    public /* synthetic */ SchoolCard(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5);
    }
}

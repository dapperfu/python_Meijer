package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class JavaNullabilityAnnotationsStatus {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f145106d = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final JavaNullabilityAnnotationsStatus f145107e = new JavaNullabilityAnnotationsStatus(ReportLevel.f145185e, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    private final ReportLevel f145108a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinVersion f145109b;

    /* renamed from: c, reason: collision with root package name */
    private final ReportLevel f145110c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JavaNullabilityAnnotationsStatus a() {
            return JavaNullabilityAnnotationsStatus.f145107e;
        }
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevelBefore, KotlinVersion kotlinVersion, ReportLevel reportLevelAfter) {
        Intrinsics.j(reportLevelBefore, "reportLevelBefore");
        Intrinsics.j(reportLevelAfter, "reportLevelAfter");
        this.f145108a = reportLevelBefore;
        this.f145109b = kotlinVersion;
        this.f145110c = reportLevelAfter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f145108a == javaNullabilityAnnotationsStatus.f145108a && Intrinsics.e(this.f145109b, javaNullabilityAnnotationsStatus.f145109b) && this.f145110c == javaNullabilityAnnotationsStatus.f145110c;
    }

    public int hashCode() {
        int iHashCode = this.f145108a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f145109b;
        return ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31) + this.f145110c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f145108a + ", sinceVersion=" + this.f145109b + ", reportLevelAfter=" + this.f145110c + ')';
    }

    public final ReportLevel b() {
        return this.f145110c;
    }

    public final ReportLevel c() {
        return this.f145108a;
    }

    public final KotlinVersion d() {
        return this.f145109b;
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i10 & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i10 & 4) != 0 ? reportLevel : reportLevel2);
    }
}

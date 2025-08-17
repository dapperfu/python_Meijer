package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class JavaNullabilityAnnotationsStatus {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f144199d = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final JavaNullabilityAnnotationsStatus f144200e = new JavaNullabilityAnnotationsStatus(ReportLevel.f144278e, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    private final ReportLevel f144201a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinVersion f144202b;

    /* renamed from: c, reason: collision with root package name */
    private final ReportLevel f144203c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JavaNullabilityAnnotationsStatus a() {
            return JavaNullabilityAnnotationsStatus.f144200e;
        }
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevelBefore, KotlinVersion kotlinVersion, ReportLevel reportLevelAfter) {
        Intrinsics.j(reportLevelBefore, "reportLevelBefore");
        Intrinsics.j(reportLevelAfter, "reportLevelAfter");
        this.f144201a = reportLevelBefore;
        this.f144202b = kotlinVersion;
        this.f144203c = reportLevelAfter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f144201a == javaNullabilityAnnotationsStatus.f144201a && Intrinsics.e(this.f144202b, javaNullabilityAnnotationsStatus.f144202b) && this.f144203c == javaNullabilityAnnotationsStatus.f144203c;
    }

    public int hashCode() {
        int iHashCode = this.f144201a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f144202b;
        return ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getVersion())) * 31) + this.f144203c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f144201a + ", sinceVersion=" + this.f144202b + ", reportLevelAfter=" + this.f144203c + ')';
    }

    public final ReportLevel b() {
        return this.f144203c;
    }

    public final ReportLevel c() {
        return this.f144201a;
    }

    public final KotlinVersion d() {
        return this.f144202b;
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i10 & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i10 & 4) != 0 ? reportLevel : reportLevel2);
    }
}

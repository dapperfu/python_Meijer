package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JavaNullabilityAnnotationSettingsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final FqName f145098a;

    /* renamed from: b, reason: collision with root package name */
    private static final FqName f145099b;

    /* renamed from: c, reason: collision with root package name */
    private static final FqName f145100c;

    /* renamed from: d, reason: collision with root package name */
    private static final FqName f145101d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f145102e;

    /* renamed from: f, reason: collision with root package name */
    private static final FqName[] f145103f;

    /* renamed from: g, reason: collision with root package name */
    private static final NullabilityAnnotationStates<JavaNullabilityAnnotationsStatus> f145104g;

    /* renamed from: h, reason: collision with root package name */
    private static final JavaNullabilityAnnotationsStatus f145105h;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        f145098a = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f145099b = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        f145100c = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        f145101d = fqName4;
        String strA = fqName3.a();
        f145102e = strA;
        f145103f = new FqName[]{new FqName(strA + ".Nullable"), new FqName(strA + ".NonNull")};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.f145106d;
        Pair pairA = TuplesKt.a(fqName5, companion.a());
        Pair pairA2 = TuplesKt.a(new FqName("androidx.annotation"), companion.a());
        Pair pairA3 = TuplesKt.a(new FqName("android.support.annotation"), companion.a());
        Pair pairA4 = TuplesKt.a(new FqName("android.annotation"), companion.a());
        Pair pairA5 = TuplesKt.a(new FqName("com.android.annotations"), companion.a());
        Pair pairA6 = TuplesKt.a(new FqName("org.eclipse.jdt.annotation"), companion.a());
        Pair pairA7 = TuplesKt.a(new FqName("org.checkerframework.checker.nullness.qual"), companion.a());
        Pair pairA8 = TuplesKt.a(fqName4, companion.a());
        Pair pairA9 = TuplesKt.a(new FqName("javax.annotation"), companion.a());
        Pair pairA10 = TuplesKt.a(new FqName("edu.umd.cs.findbugs.annotations"), companion.a());
        Pair pairA11 = TuplesKt.a(new FqName("io.reactivex.annotations"), companion.a());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.f145184d;
        Pair pairA12 = TuplesKt.a(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairA13 = TuplesKt.a(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairA14 = TuplesKt.a(new FqName("lombok"), companion.a());
        KotlinVersion kotlinVersion = new KotlinVersion(2, 1);
        ReportLevel reportLevel2 = ReportLevel.f145185e;
        f145104g = new NullabilityAnnotationStatesImpl(MapsKt.o(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, TuplesKt.a(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), TuplesKt.a(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 1), reportLevel2)), TuplesKt.a(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8), reportLevel2))));
        f145105h = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    public static final Jsr305Settings a(KotlinVersion configuredKotlinVersion) {
        Intrinsics.j(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f145105h;
        ReportLevel reportLevelC = (javaNullabilityAnnotationsStatus.d() == null || javaNullabilityAnnotationsStatus.d().compareTo(configuredKotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.c() : javaNullabilityAnnotationsStatus.b();
        return new Jsr305Settings(reportLevelC, c(reportLevelC), null, 4, null);
    }

    public static /* synthetic */ Jsr305Settings b(KotlinVersion kotlinVersion, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kotlinVersion = KotlinVersion.f143281f;
        }
        return a(kotlinVersion);
    }

    public static final ReportLevel c(ReportLevel globalReportLevel) {
        Intrinsics.j(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.f145184d) {
            return null;
        }
        return globalReportLevel;
    }

    public static final ReportLevel d(FqName annotationFqName) {
        Intrinsics.j(annotationFqName, "annotationFqName");
        return h(annotationFqName, NullabilityAnnotationStates.f145176a.a(), null, 4, null);
    }

    public static final FqName e() {
        return f145099b;
    }

    public static final FqName[] f() {
        return f145103f;
    }

    public static final ReportLevel g(FqName annotation, NullabilityAnnotationStates<? extends ReportLevel> configuredReportLevels, KotlinVersion configuredKotlinVersion) {
        Intrinsics.j(annotation, "annotation");
        Intrinsics.j(configuredReportLevels, "configuredReportLevels");
        Intrinsics.j(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevelA = configuredReportLevels.a(annotation);
        if (reportLevelA != null) {
            return reportLevelA;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatusA = f145104g.a(annotation);
        return javaNullabilityAnnotationsStatusA == null ? ReportLevel.f145183c : (javaNullabilityAnnotationsStatusA.d() == null || javaNullabilityAnnotationsStatusA.d().compareTo(configuredKotlinVersion) > 0) ? javaNullabilityAnnotationsStatusA.c() : javaNullabilityAnnotationsStatusA.b();
    }

    public static /* synthetic */ ReportLevel h(FqName fqName, NullabilityAnnotationStates nullabilityAnnotationStates, KotlinVersion kotlinVersion, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            kotlinVersion = new KotlinVersion(1, 7, 20);
        }
        return g(fqName, nullabilityAnnotationStates, kotlinVersion);
    }
}

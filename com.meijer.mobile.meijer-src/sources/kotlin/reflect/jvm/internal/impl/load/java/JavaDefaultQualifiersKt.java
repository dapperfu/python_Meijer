package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public final class JavaDefaultQualifiersKt {

    /* renamed from: a, reason: collision with root package name */
    private static final List<AnnotationQualifierApplicabilityType> f145088a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<AnnotationQualifierApplicabilityType> f145089b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f145090c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f145091d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f145092e;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.f145061d;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.f145059b;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.f145060c;
        List<AnnotationQualifierApplicabilityType> listP = CollectionsKt.p(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.f145063f, AnnotationQualifierApplicabilityType.f145062e);
        f145088a = listP;
        List<AnnotationQualifierApplicabilityType> listE = CollectionsKt.e(annotationQualifierApplicabilityType3);
        f145089b = listE;
        FqName fqNameK = JvmAnnotationNamesKt.k();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.f145560c;
        Map<FqName, JavaDefaultQualifiers> mapO = MapsKt.o(TuplesKt.a(fqNameK, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listP, false)), TuplesKt.a(JvmAnnotationNamesKt.i(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listP, false)), TuplesKt.a(JvmAnnotationNamesKt.j(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.f145558a, false, 2, null), listP, false, 4, null)));
        f145090c = mapO;
        Map<FqName, JavaDefaultQualifiers> mapO2 = MapsKt.o(TuplesKt.a(JvmAnnotationNamesKt.d(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listE, false, 4, null)), TuplesKt.a(JvmAnnotationNamesKt.e(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.f145559b, false, 2, null), listE, false, 4, null)));
        f145091d = mapO2;
        f145092e = MapsKt.u(mapO, mapO2);
    }

    public static final Map<FqName, JavaDefaultQualifiers> a() {
        return f145092e;
    }

    public static final Map<FqName, JavaDefaultQualifiers> b() {
        return f145090c;
    }
}

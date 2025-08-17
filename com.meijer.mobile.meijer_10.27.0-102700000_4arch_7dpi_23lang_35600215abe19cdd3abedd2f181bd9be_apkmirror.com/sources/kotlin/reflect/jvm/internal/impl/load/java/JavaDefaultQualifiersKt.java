package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public final class JavaDefaultQualifiersKt {

    /* renamed from: a, reason: collision with root package name */
    private static final List<AnnotationQualifierApplicabilityType> f144181a;

    /* renamed from: b, reason: collision with root package name */
    private static final List<AnnotationQualifierApplicabilityType> f144182b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f144183c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f144184d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f144185e;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.f144154d;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.f144152b;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.f144153c;
        List<AnnotationQualifierApplicabilityType> listP = CollectionsKt.p(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.f144156f, AnnotationQualifierApplicabilityType.f144155e);
        f144181a = listP;
        List<AnnotationQualifierApplicabilityType> listE = CollectionsKt.e(annotationQualifierApplicabilityType3);
        f144182b = listE;
        FqName fqNameK = JvmAnnotationNamesKt.k();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.f144653c;
        Map<FqName, JavaDefaultQualifiers> mapO = MapsKt.o(TuplesKt.a(fqNameK, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listP, false)), TuplesKt.a(JvmAnnotationNamesKt.i(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listP, false)), TuplesKt.a(JvmAnnotationNamesKt.j(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.f144651a, false, 2, null), listP, false, 4, null)));
        f144183c = mapO;
        Map<FqName, JavaDefaultQualifiers> mapO2 = MapsKt.o(TuplesKt.a(JvmAnnotationNamesKt.d(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listE, false, 4, null)), TuplesKt.a(JvmAnnotationNamesKt.e(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.f144652b, false, 2, null), listE, false, 4, null)));
        f144184d = mapO2;
        f144185e = MapsKt.u(mapO, mapO2);
    }

    public static final Map<FqName, JavaDefaultQualifiers> a() {
        return f144185e;
    }

    public static final Map<FqName, JavaDefaultQualifiers> b() {
        return f144183c;
    }
}

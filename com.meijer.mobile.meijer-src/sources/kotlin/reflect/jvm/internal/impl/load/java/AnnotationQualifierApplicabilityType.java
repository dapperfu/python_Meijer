package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class AnnotationQualifierApplicabilityType {

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f145059b = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f145060c = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f145061d = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f145062e = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f145063f = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f145064g = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] f145065h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f145066i;

    /* renamed from: a, reason: collision with root package name */
    private final String f145067a;

    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] a() {
        return new AnnotationQualifierApplicabilityType[]{f145059b, f145060c, f145061d, f145062e, f145063f, f145064g};
    }

    static {
        AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArrA = a();
        f145065h = annotationQualifierApplicabilityTypeArrA;
        f145066i = EnumEntriesKt.a(annotationQualifierApplicabilityTypeArrA);
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) f145065h.clone();
    }

    public final String b() {
        return this.f145067a;
    }

    private AnnotationQualifierApplicabilityType(String str, int i10, String str2) {
        this.f145067a = str2;
    }
}

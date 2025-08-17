package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class AnnotationQualifierApplicabilityType {

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f144152b = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f144153c = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f144154d = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f144155e = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f144156f = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationQualifierApplicabilityType f144157g = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] f144158h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144159i;

    /* renamed from: a, reason: collision with root package name */
    private final String f144160a;

    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] a() {
        return new AnnotationQualifierApplicabilityType[]{f144152b, f144153c, f144154d, f144155e, f144156f, f144157g};
    }

    static {
        AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArrA = a();
        f144158h = annotationQualifierApplicabilityTypeArrA;
        f144159i = EnumEntriesKt.a(annotationQualifierApplicabilityTypeArrA);
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) f144158h.clone();
    }

    public final String b() {
        return this.f144160a;
    }

    private AnnotationQualifierApplicabilityType(String str, int i10, String str2) {
        this.f144160a = str2;
    }
}

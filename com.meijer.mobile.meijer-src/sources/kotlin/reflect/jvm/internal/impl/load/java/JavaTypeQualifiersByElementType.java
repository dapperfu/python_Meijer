package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class JavaTypeQualifiersByElementType {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> f145117a;

    public JavaTypeQualifiersByElementType(EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers) {
        Intrinsics.j(defaultQualifiers, "defaultQualifiers");
        this.f145117a = defaultQualifiers;
    }

    public final JavaDefaultQualifiers a(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f145117a.get(annotationQualifierApplicabilityType);
    }

    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> b() {
        return this.f145117a;
    }
}

package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class JavaTypeQualifiersByElementType {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> f144210a;

    public JavaTypeQualifiersByElementType(EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers) {
        Intrinsics.j(defaultQualifiers, "defaultQualifiers");
        this.f144210a = defaultQualifiers;
    }

    public final JavaDefaultQualifiers a(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f144210a.get(annotationQualifierApplicabilityType);
    }

    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> b() {
        return this.f144210a;
    }
}

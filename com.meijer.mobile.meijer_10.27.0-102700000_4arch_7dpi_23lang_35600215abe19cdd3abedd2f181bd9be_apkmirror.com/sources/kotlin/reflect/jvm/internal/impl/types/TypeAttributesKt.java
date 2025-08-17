package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeAttributesKt {
    public static final TypeAttributes a(TypeAttributes typeAttributes, Annotations newAnnotations) {
        TypeAttributes typeAttributesT;
        Intrinsics.j(typeAttributes, "<this>");
        Intrinsics.j(newAnnotations, "newAnnotations");
        if (AnnotationsTypeAttributeKt.a(typeAttributes) == newAnnotations) {
            return typeAttributes;
        }
        AnnotationsTypeAttribute annotationsTypeAttributeB = AnnotationsTypeAttributeKt.b(typeAttributes);
        if (annotationsTypeAttributeB != null && (typeAttributesT = typeAttributes.t(annotationsTypeAttributeB)) != null) {
            typeAttributes = typeAttributesT;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? typeAttributes.s(new AnnotationsTypeAttribute(newAnnotations)) : typeAttributes;
    }

    public static final TypeAttributes b(Annotations annotations) {
        Intrinsics.j(annotations, "<this>");
        return TypeAttributeTranslator.DefaultImpls.a(DefaultTypeAttributeTranslator.f146686a, annotations, null, null, 6, null);
    }
}

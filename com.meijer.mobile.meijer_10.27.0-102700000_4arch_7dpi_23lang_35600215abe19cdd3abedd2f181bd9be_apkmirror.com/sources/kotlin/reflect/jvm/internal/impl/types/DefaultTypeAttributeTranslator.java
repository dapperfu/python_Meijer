package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes13.dex */
public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultTypeAttributeTranslator f146686a = new DefaultTypeAttributeTranslator();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    public TypeAttributes a(Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(annotations, "annotations");
        return annotations.isEmpty() ? TypeAttributes.f146740b.k() : TypeAttributes.f146740b.j(CollectionsKt.e(new AnnotationsTypeAttribute(annotations)));
    }

    private DefaultTypeAttributeTranslator() {
    }
}

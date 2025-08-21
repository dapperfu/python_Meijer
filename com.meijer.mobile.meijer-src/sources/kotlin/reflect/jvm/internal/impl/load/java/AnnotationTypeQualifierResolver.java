package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class AnnotationTypeQualifierResolver extends AbstractAnnotationTypeQualifierResolver<AnnotationDescriptor> {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public boolean o() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        Intrinsics.j(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    private final List<String> B(ConstantValue<?> constantValue) {
        if (!(constantValue instanceof ArrayValue)) {
            return constantValue instanceof EnumValue ? CollectionsKt.e(((EnumValue) constantValue).c().l()) : CollectionsKt.m();
        }
        List<? extends ConstantValue<?>> listB = ((ArrayValue) constantValue).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, B((ConstantValue) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterable<AnnotationDescriptor> m(AnnotationDescriptor annotationDescriptor) {
        Annotations annotations;
        Intrinsics.j(annotationDescriptor, "<this>");
        ClassDescriptor classDescriptorL = DescriptorUtilsKt.l(annotationDescriptor);
        return (classDescriptorL == null || (annotations = classDescriptorL.getAnnotations()) == null) ? CollectionsKt.m() : annotations;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<String> c(AnnotationDescriptor annotationDescriptor, boolean z10) {
        Intrinsics.j(annotationDescriptor, "<this>");
        Map<Name, ConstantValue<?>> mapA = annotationDescriptor.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Name, ConstantValue<?>> entry : mapA.entrySet()) {
            CollectionsKt.C(arrayList, (!z10 || Intrinsics.e(entry.getKey(), JvmAnnotationNames.f145130c)) ? B(entry.getValue()) : CollectionsKt.m());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public FqName k(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.j(annotationDescriptor, "<this>");
        return annotationDescriptor.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object l(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.j(annotationDescriptor, "<this>");
        ClassDescriptor classDescriptorL = DescriptorUtilsKt.l(annotationDescriptor);
        Intrinsics.g(classDescriptorL);
        return classDescriptorL;
    }
}

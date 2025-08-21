package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SignatureEnhancement {

    /* renamed from: a, reason: collision with root package name */
    private final JavaTypeEnhancement f145577a;

    public SignatureEnhancement(JavaTypeEnhancement typeEnhancement) {
        Intrinsics.j(typeEnhancement, "typeEnhancement");
        this.f145577a = typeEnhancement;
    }

    private final boolean f(KotlinType kotlinType) {
        return TypeUtils.c(kotlinType, c0.f145609a);
    }

    private final KotlinType h(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z10, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z11, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        d0 d0Var = new d0(annotated, z10, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinTypeInvoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> collectionD = callableMemberDescriptor.d();
        Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = collectionD;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            Intrinsics.g(callableMemberDescriptor2);
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return i(d0Var, kotlinTypeInvoke, arrayList, typeEnhancementInfo, z11);
    }

    private final KotlinType i(d0 d0Var, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z10) {
        return this.f145577a.a(kotlinType, d0Var.d(kotlinType, list, typeEnhancementInfo, z10), d0Var.z());
    }

    static /* synthetic */ KotlinType j(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z10, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z11, Function1 function1, int i10, Object obj) {
        return signatureEnhancement.h(callableMemberDescriptor, annotated, z10, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i10 & 32) != 0 ? false : z11, function1);
    }

    static /* synthetic */ KotlinType k(SignatureEnhancement signatureEnhancement, d0 d0Var, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return signatureEnhancement.i(d0Var, kotlinType, list, typeEnhancementInfo2, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0223, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D l(D r18, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r19) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.l(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType m(CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        KotlinType returnType = it.getReturnType();
        Intrinsics.g(returnType);
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType n(CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        ReceiverParameterDescriptor receiverParameterDescriptorN = it.N();
        Intrinsics.g(receiverParameterDescriptorN);
        KotlinType type = receiverParameterDescriptorN.getType();
        Intrinsics.i(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType o(ValueParameterDescriptor valueParameterDescriptor, CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        KotlinType type = it.h().get(valueParameterDescriptor.getIndex()).getType();
        Intrinsics.i(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(UnwrappedType it) {
        Intrinsics.j(it, "it");
        return it instanceof RawType;
    }

    private final KotlinType t(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z10, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContextK;
        return h(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextK = ContextKt.k(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : lazyJavaResolverContextK, AnnotationQualifierApplicabilityType.f145060c, typeEnhancementInfo, z10, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> Collection<D> p(LazyJavaResolverContext c10, Collection<? extends D> platformSignatures) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(l((CallableMemberDescriptor) it.next(), c10));
        }
        return arrayList;
    }

    public final KotlinType q(KotlinType type, LazyJavaResolverContext context) {
        Intrinsics.j(type, "type");
        Intrinsics.j(context, "context");
        KotlinType kotlinTypeK = k(this, new d0(null, false, context, AnnotationQualifierApplicabilityType.f145062e, true), type, CollectionsKt.m(), null, false, 12, null);
        return kotlinTypeK == null ? type : kotlinTypeK;
    }

    public final List<KotlinType> r(TypeParameterDescriptor typeParameter, List<? extends KotlinType> bounds, LazyJavaResolverContext context) {
        KotlinType kotlinType;
        KotlinType kotlinTypeK;
        Intrinsics.j(typeParameter, "typeParameter");
        Intrinsics.j(bounds, "bounds");
        Intrinsics.j(context, "context");
        List<? extends KotlinType> list = bounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (KotlinType kotlinType2 : list) {
            if (TypeUtilsKt.e(kotlinType2, b0.f145606a)) {
                kotlinType = kotlinType2;
            } else {
                kotlinType = kotlinType2;
                kotlinTypeK = k(this, new d0(typeParameter, false, context, AnnotationQualifierApplicabilityType.f145063f, false, 16, null), kotlinType, CollectionsKt.m(), null, false, 12, null);
                if (kotlinTypeK == null) {
                }
                arrayList.add(kotlinTypeK);
            }
            kotlinTypeK = kotlinType;
            arrayList.add(kotlinTypeK);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean g(UnwrappedType unwrappedType) {
        boolean z10;
        ClassifierDescriptor classifierDescriptorD = unwrappedType.K0().d();
        if (classifierDescriptorD == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorD.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.f144399a;
        if (Intrinsics.e(name, javaToKotlinClassMap.h().f()) && Intrinsics.e(DescriptorUtilsKt.k(classifierDescriptorD), javaToKotlinClassMap.h())) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private final <D extends CallableMemberDescriptor> Annotations u(D d10, LazyJavaResolverContext lazyJavaResolverContext) {
        LazyJavaClassDescriptor lazyJavaClassDescriptor;
        ClassifierDescriptor classifierDescriptorA = DescriptorUtilKt.a(d10);
        if (classifierDescriptorA == null) {
            return d10.getAnnotations();
        }
        List<JavaAnnotation> listQ0 = null;
        if (classifierDescriptorA instanceof LazyJavaClassDescriptor) {
            lazyJavaClassDescriptor = (LazyJavaClassDescriptor) classifierDescriptorA;
        } else {
            lazyJavaClassDescriptor = null;
        }
        if (lazyJavaClassDescriptor != null) {
            listQ0 = lazyJavaClassDescriptor.Q0();
        }
        List<JavaAnnotation> list = listQ0;
        if (list != null && !list.isEmpty()) {
            List<JavaAnnotation> list2 = listQ0;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
            }
            return Annotations.f144596s3.a(CollectionsKt.N0(d10.getAnnotations(), arrayList));
        }
        return d10.getAnnotations();
    }
}

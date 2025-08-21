package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;

/* loaded from: classes14.dex */
public final class ContextKt {
    public static final LazyJavaResolverContext d(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver) {
        Intrinsics.j(lazyJavaResolverContext, "<this>");
        Intrinsics.j(typeParameterResolver, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext.a(), typeParameterResolver, lazyJavaResolverContext.c());
    }

    public static final LazyJavaResolverContext e(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor containingDeclaration, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10) {
        Intrinsics.j(lazyJavaResolverContext, "<this>");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        return c(lazyJavaResolverContext, containingDeclaration, javaTypeParameterListOwner, i10, LazyKt.a(LazyThreadSafetyMode.f143288c, new a(lazyJavaResolverContext, containingDeclaration)));
    }

    public static /* synthetic */ LazyJavaResolverContext f(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i10);
    }

    public static final LazyJavaResolverContext h(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i10) {
        Intrinsics.j(lazyJavaResolverContext, "<this>");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(typeParameterOwner, "typeParameterOwner");
        return c(lazyJavaResolverContext, containingDeclaration, typeParameterOwner, i10, lazyJavaResolverContext.c());
    }

    public static /* synthetic */ LazyJavaResolverContext i(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return h(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i10);
    }

    public static final JavaTypeQualifiersByElementType j(LazyJavaResolverContext lazyJavaResolverContext, Annotations additionalAnnotations) {
        Intrinsics.j(lazyJavaResolverContext, "<this>");
        Intrinsics.j(additionalAnnotations, "additionalAnnotations");
        return lazyJavaResolverContext.a().a().d(lazyJavaResolverContext.b(), additionalAnnotations);
    }

    public static final LazyJavaResolverContext k(LazyJavaResolverContext lazyJavaResolverContext, Annotations additionalAnnotations) {
        Intrinsics.j(lazyJavaResolverContext, "<this>");
        Intrinsics.j(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.a(), lazyJavaResolverContext.f(), LazyKt.a(LazyThreadSafetyMode.f143288c, new b(lazyJavaResolverContext, additionalAnnotations)));
    }

    public static final LazyJavaResolverContext m(LazyJavaResolverContext lazyJavaResolverContext, JavaResolverComponents components) {
        Intrinsics.j(lazyJavaResolverContext, "<this>");
        Intrinsics.j(components, "components");
        return new LazyJavaResolverContext(components, lazyJavaResolverContext.f(), lazyJavaResolverContext.c());
    }

    private static final LazyJavaResolverContext c(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i10, Lazy<JavaTypeQualifiersByElementType> lazy) {
        TypeParameterResolver typeParameterResolverF;
        JavaResolverComponents javaResolverComponentsA = lazyJavaResolverContext.a();
        if (javaTypeParameterListOwner != null) {
            typeParameterResolverF = new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i10);
        } else {
            typeParameterResolverF = lazyJavaResolverContext.f();
        }
        return new LazyJavaResolverContext(javaResolverComponentsA, typeParameterResolverF, lazy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiersByElementType g(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        return j(lazyJavaResolverContext, classOrPackageFragmentDescriptor.getAnnotations());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiersByElementType l(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        return j(lazyJavaResolverContext, annotations);
    }
}

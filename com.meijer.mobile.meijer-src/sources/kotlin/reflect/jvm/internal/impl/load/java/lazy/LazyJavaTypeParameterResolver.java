package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes14.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145327a;

    /* renamed from: b, reason: collision with root package name */
    private final DeclarationDescriptor f145328b;

    /* renamed from: c, reason: collision with root package name */
    private final int f145329c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<JavaTypeParameter, Integer> f145330d;

    /* renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> f145331e;

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext c10, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i10) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(typeParameterOwner, "typeParameterOwner");
        this.f145327a = c10;
        this.f145328b = containingDeclaration;
        this.f145329c = i10;
        this.f145330d = CollectionsKt.d(typeParameterOwner.getTypeParameters());
        this.f145331e = c10.e().g(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaTypeParameterDescriptor c(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver, JavaTypeParameter typeParameter) {
        Intrinsics.j(typeParameter, "typeParameter");
        Integer num = lazyJavaTypeParameterResolver.f145330d.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new LazyJavaTypeParameterDescriptor(ContextKt.k(ContextKt.d(lazyJavaTypeParameterResolver.f145327a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f145328b.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.f145329c + num.intValue(), lazyJavaTypeParameterResolver.f145328b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public TypeParameterDescriptor a(JavaTypeParameter javaTypeParameter) {
        Intrinsics.j(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptorInvoke = this.f145331e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptorInvoke != null ? lazyJavaTypeParameterDescriptorInvoke : this.f145327a.f().a(javaTypeParameter);
    }
}

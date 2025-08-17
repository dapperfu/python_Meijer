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

/* loaded from: classes13.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f144420a;

    /* renamed from: b, reason: collision with root package name */
    private final DeclarationDescriptor f144421b;

    /* renamed from: c, reason: collision with root package name */
    private final int f144422c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<JavaTypeParameter, Integer> f144423d;

    /* renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> f144424e;

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext c10, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i10) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(typeParameterOwner, "typeParameterOwner");
        this.f144420a = c10;
        this.f144421b = containingDeclaration;
        this.f144422c = i10;
        this.f144423d = CollectionsKt.d(typeParameterOwner.getTypeParameters());
        this.f144424e = c10.e().g(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaTypeParameterDescriptor c(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver, JavaTypeParameter typeParameter) {
        Intrinsics.j(typeParameter, "typeParameter");
        Integer num = lazyJavaTypeParameterResolver.f144423d.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new LazyJavaTypeParameterDescriptor(ContextKt.k(ContextKt.d(lazyJavaTypeParameterResolver.f144420a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f144421b.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.f144422c + num.intValue(), lazyJavaTypeParameterResolver.f144421b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public TypeParameterDescriptor a(JavaTypeParameter javaTypeParameter) {
        Intrinsics.j(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptorInvoke = this.f144424e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptorInvoke != null ? lazyJavaTypeParameterDescriptorInvoke : this.f144420a.f().a(javaTypeParameter);
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public final class LazyJavaResolverContext {

    /* renamed from: a, reason: collision with root package name */
    private final JavaResolverComponents f145323a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeParameterResolver f145324b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy<JavaTypeQualifiersByElementType> f145325c;

    /* renamed from: d, reason: collision with root package name */
    private final JavaTypeResolver f145326d;

    public LazyJavaResolverContext(JavaResolverComponents components, TypeParameterResolver typeParameterResolver, Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        Intrinsics.j(components, "components");
        Intrinsics.j(typeParameterResolver, "typeParameterResolver");
        Intrinsics.j(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f145323a = components;
        this.f145324b = typeParameterResolver;
        this.f145325c = delegateForDefaultTypeQualifiers;
        this.f145326d = new JavaTypeResolver(this, typeParameterResolver);
    }

    public final JavaResolverComponents a() {
        return this.f145323a;
    }

    public final JavaTypeQualifiersByElementType b() {
        return this.f145325c.getValue();
    }

    public final Lazy<JavaTypeQualifiersByElementType> c() {
        return this.f145325c;
    }

    public final ModuleDescriptor d() {
        return this.f145323a.m();
    }

    public final StorageManager e() {
        return this.f145323a.u();
    }

    public final TypeParameterResolver f() {
        return this.f145324b;
    }

    public final JavaTypeResolver g() {
        return this.f145326d;
    }
}

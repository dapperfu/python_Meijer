package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
public final class LazyJavaResolverContext {

    /* renamed from: a, reason: collision with root package name */
    private final JavaResolverComponents f144416a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeParameterResolver f144417b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy<JavaTypeQualifiersByElementType> f144418c;

    /* renamed from: d, reason: collision with root package name */
    private final JavaTypeResolver f144419d;

    public LazyJavaResolverContext(JavaResolverComponents components, TypeParameterResolver typeParameterResolver, Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        Intrinsics.j(components, "components");
        Intrinsics.j(typeParameterResolver, "typeParameterResolver");
        Intrinsics.j(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f144416a = components;
        this.f144417b = typeParameterResolver;
        this.f144418c = delegateForDefaultTypeQualifiers;
        this.f144419d = new JavaTypeResolver(this, typeParameterResolver);
    }

    public final JavaResolverComponents a() {
        return this.f144416a;
    }

    public final JavaTypeQualifiersByElementType b() {
        return this.f144418c.getValue();
    }

    public final Lazy<JavaTypeQualifiersByElementType> c() {
        return this.f144418c;
    }

    public final ModuleDescriptor d() {
        return this.f144416a.m();
    }

    public final StorageManager e() {
        return this.f144416a.u();
    }

    public final TypeParameterResolver f() {
        return this.f144417b;
    }

    public final JavaTypeResolver g() {
        return this.f144419d;
    }
}

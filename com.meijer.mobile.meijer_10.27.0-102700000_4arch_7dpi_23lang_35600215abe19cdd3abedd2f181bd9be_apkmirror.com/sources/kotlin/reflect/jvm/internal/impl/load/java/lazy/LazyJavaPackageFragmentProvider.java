package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;

/* loaded from: classes13.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f144414a;

    /* renamed from: b, reason: collision with root package name */
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> f144415b;

    public LazyJavaPackageFragmentProvider(JavaResolverComponents components) {
        Intrinsics.j(components, "components");
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(components, TypeParameterResolver.EMPTY.f144426a, LazyKt.c(null));
        this.f144414a = lazyJavaResolverContext;
        this.f144415b = lazyJavaResolverContext.e().a();
    }

    private final LazyJavaPackageFragment e(FqName fqName) {
        JavaPackage javaPackageA = JavaClassFinder$$Util.a(this.f144414a.a().d(), fqName, false, 2, null);
        if (javaPackageA == null) {
            return null;
        }
        return this.f144415b.a(fqName, new d(this, javaPackageA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaPackageFragment f(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        return new LazyJavaPackageFragment(lazyJavaPackageFragmentProvider.f144414a, javaPackage);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    public List<LazyJavaPackageFragment> a(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return CollectionsKt.q(e(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void b(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(packageFragments, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(packageFragments, e(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean c(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return JavaClassFinder$$Util.a(this.f144414a.a().d(), fqName, false, 2, null) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<FqName> m(FqName fqName, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(nameFilter, "nameFilter");
        LazyJavaPackageFragment lazyJavaPackageFragmentE = e(fqName);
        List<FqName> listN0 = lazyJavaPackageFragmentE != null ? lazyJavaPackageFragmentE.N0() : null;
        return listN0 == null ? CollectionsKt.m() : listN0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f144414a.a().m();
    }
}

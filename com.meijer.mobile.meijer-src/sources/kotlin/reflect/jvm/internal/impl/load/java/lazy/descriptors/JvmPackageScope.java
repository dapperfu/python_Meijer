package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JvmPackageScope implements MemberScope {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f145360f = {Reflection.j(new PropertyReference1Impl(JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f145361b;

    /* renamed from: c, reason: collision with root package name */
    private final LazyJavaPackageFragment f145362c;

    /* renamed from: d, reason: collision with root package name */
    private final LazyJavaPackageScope f145363d;

    /* renamed from: e, reason: collision with root package name */
    private final NotNullLazyValue f145364e;

    public JvmPackageScope(LazyJavaResolverContext c10, JavaPackage jPackage, LazyJavaPackageFragment packageFragment) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(jPackage, "jPackage");
        Intrinsics.j(packageFragment, "packageFragment");
        this.f145361b = c10;
        this.f145362c = packageFragment;
        this.f145363d = new LazyJavaPackageScope(c10, jPackage, packageFragment);
        this.f145364e = c10.e().c(new C15340b(this));
    }

    private final MemberScope[] j() {
        return (MemberScope[]) StorageKt.a(this.f145364e, this, f145360f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope[] k(JvmPackageScope jvmPackageScope) {
        Collection<KotlinJvmBinaryClass> collectionValues = jvmPackageScope.f145362c.L0().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            MemberScope memberScopeC = jvmPackageScope.f145361b.a().b().c(jvmPackageScope.f145362c, (KotlinJvmBinaryClass) it.next());
            if (memberScopeC != null) {
                arrayList.add(memberScopeC);
            }
        }
        return (MemberScope[]) ScopeUtilsKt.b(arrayList).toArray(new MemberScope[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        l(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f145363d;
        MemberScope[] memberScopeArrJ = j();
        Collection<? extends SimpleFunctionDescriptor> collectionB = lazyJavaPackageScope.b(name, location);
        int length = memberScopeArrJ.length;
        int i10 = 0;
        Collection collection = collectionB;
        while (i10 < length) {
            Collection collectionA = ScopeUtilsKt.a(collection, memberScopeArrJ[i10].b(name, location));
            i10++;
            collection = collectionA;
        }
        return collection == null ? SetsKt.e() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        l(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f145363d;
        MemberScope[] memberScopeArrJ = j();
        Collection<? extends PropertyDescriptor> collectionC = lazyJavaPackageScope.c(name, location);
        int length = memberScopeArrJ.length;
        int i10 = 0;
        Collection collection = collectionC;
        while (i10 < length) {
            Collection collectionA = ScopeUtilsKt.a(collection, memberScopeArrJ[i10].c(name, location));
            i10++;
            collection = collectionA;
        }
        return collection == null ? SetsKt.e() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        l(name, location);
        ClassDescriptor classDescriptorL0 = this.f145363d.f(name, location);
        if (classDescriptorL0 != null) {
            return classDescriptorL0;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : j()) {
            ClassifierDescriptor classifierDescriptorF = memberScope.f(name, location);
            if (classifierDescriptorF != null) {
                if (!(classifierDescriptorF instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorF).h0()) {
                    return classifierDescriptorF;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorF;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        LazyJavaPackageScope lazyJavaPackageScope = this.f145363d;
        MemberScope[] memberScopeArrJ = j();
        Collection<DeclarationDescriptor> collectionG = lazyJavaPackageScope.g(kindFilter, nameFilter);
        for (MemberScope memberScope : memberScopeArrJ) {
            collectionG = ScopeUtilsKt.a(collectionG, memberScope.g(kindFilter, nameFilter));
        }
        return collectionG == null ? SetsKt.e() : collectionG;
    }

    public final LazyJavaPackageScope i() {
        return this.f145363d;
    }

    public void l(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        UtilsKt.b(this.f145361b.a().l(), location, this.f145362c, name);
    }

    public String toString() {
        return "scope for " + this.f145362c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> a() {
        MemberScope[] memberScopeArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrJ) {
            CollectionsKt.C(linkedHashSet, memberScope.a());
        }
        linkedHashSet.addAll(this.f145363d.a());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> d() {
        MemberScope[] memberScopeArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrJ) {
            CollectionsKt.C(linkedHashSet, memberScope.d());
        }
        linkedHashSet.addAll(this.f145363d.d());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> e() {
        Set<Name> setA = MemberScopeKt.a(ArraysKt.R(j()));
        if (setA != null) {
            setA.addAll(this.f145363d.e());
            return setA;
        }
        return null;
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    private final List<PackageFragmentProvider> f144734a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144735b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositePackageFragmentProvider(List<? extends PackageFragmentProvider> providers, String debugName) {
        Intrinsics.j(providers, "providers");
        Intrinsics.j(debugName, "debugName");
        this.f144734a = providers;
        this.f144735b = debugName;
        providers.size();
        CollectionsKt.o1(providers).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    public List<PackageFragmentDescriptor> a(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<PackageFragmentProvider> it = this.f144734a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.a(it.next(), fqName, arrayList);
        }
        return CollectionsKt.j1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void b(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(packageFragments, "packageFragments");
        Iterator<PackageFragmentProvider> it = this.f144734a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.a(it.next(), fqName, packageFragments);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean c(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        List<PackageFragmentProvider> list = this.f144734a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!PackageFragmentProviderKt.b((PackageFragmentProvider) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> m(FqName fqName, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<PackageFragmentProvider> it = this.f144734a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().m(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f144735b;
    }
}

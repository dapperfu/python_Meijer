package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;

/* loaded from: classes13.dex */
public class SubpackagesScope extends MemberScopeImpl {

    /* renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f143995b;

    /* renamed from: c, reason: collision with root package name */
    private final FqName f143996c;

    public SubpackagesScope(ModuleDescriptor moduleDescriptor, FqName fqName) {
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        Intrinsics.j(fqName, "fqName");
        this.f143995b = moduleDescriptor;
        this.f143996c = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        if (!kindFilter.a(DescriptorKindFilter.f146255c.f())) {
            return CollectionsKt.m();
        }
        if (this.f143996c.c() && kindFilter.l().contains(DescriptorKindExclude.TopLevelPackages.f146254a)) {
            return CollectionsKt.m();
        }
        Collection<FqName> collectionM = this.f143995b.m(this.f143996c, nameFilter);
        ArrayList arrayList = new ArrayList(collectionM.size());
        Iterator<FqName> it = collectionM.iterator();
        while (it.hasNext()) {
            Name nameF = it.next().f();
            if (nameFilter.invoke(nameF).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, h(nameF));
            }
        }
        return arrayList;
    }

    protected final PackageViewDescriptor h(Name name) {
        Intrinsics.j(name, "name");
        if (name.p()) {
            return null;
        }
        PackageViewDescriptor packageViewDescriptorI0 = this.f143995b.i0(this.f143996c.b(name));
        if (packageViewDescriptorI0.isEmpty()) {
            return null;
        }
        return packageViewDescriptorI0;
    }

    public String toString() {
        return "subpackages of " + this.f143996c + " from " + this.f143995b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> e() {
        return SetsKt.e();
    }
}

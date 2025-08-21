package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    /* renamed from: c, reason: collision with root package name */
    private final StorageManager f144830c;

    /* renamed from: d, reason: collision with root package name */
    private final KotlinBuiltIns f144831d;

    /* renamed from: e, reason: collision with root package name */
    private final TargetPlatform f144832e;

    /* renamed from: f, reason: collision with root package name */
    private final Name f144833f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<ModuleCapability<?>, Object> f144834g;

    /* renamed from: h, reason: collision with root package name */
    private final PackageViewDescriptorFactory f144835h;

    /* renamed from: i, reason: collision with root package name */
    private ModuleDependencies f144836i;

    /* renamed from: j, reason: collision with root package name */
    private PackageFragmentProvider f144837j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f144838k;

    /* renamed from: l, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> f144839l;

    /* renamed from: m, reason: collision with root package name */
    private final Lazy f144840m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModuleDescriptorImpl(Name moduleName, StorageManager storageManager, KotlinBuiltIns builtIns, TargetPlatform targetPlatform) {
        this(moduleName, storageManager, builtIns, targetPlatform, null, null, 48, null);
        Intrinsics.j(moduleName, "moduleName");
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(builtIns, "builtIns");
    }

    public /* synthetic */ ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, (i10 & 8) != 0 ? null : targetPlatform, (i10 & 16) != 0 ? MapsKt.k() : map, (i10 & 32) != 0 ? null : name2);
    }

    private final CompositePackageFragmentProvider K0() {
        return (CompositePackageFragmentProvider) this.f144840m.getValue();
    }

    private final boolean M0() {
        return this.f144837j != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompositePackageFragmentProvider O0(ModuleDescriptorImpl moduleDescriptorImpl) {
        ModuleDependencies moduleDependencies = moduleDescriptorImpl.f144836i;
        if (moduleDependencies == null) {
            throw new AssertionError("Dependencies of module " + moduleDescriptorImpl.I0() + " were not set before querying module content");
        }
        List<ModuleDescriptorImpl> listA = moduleDependencies.a();
        moduleDescriptorImpl.H0();
        listA.contains(moduleDescriptorImpl);
        List<ModuleDescriptorImpl> list = listA;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ModuleDescriptorImpl) it.next()).M0();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).f144837j;
            Intrinsics.g(packageFragmentProvider);
            arrayList.add(packageFragmentProvider);
        }
        return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageViewDescriptor P0(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return moduleDescriptorImpl.f144835h.a(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f144830c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public <T> T E0(ModuleCapability<T> capability) {
        Intrinsics.j(capability, "capability");
        T t10 = (T) this.f144834g.get(capability);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean I(ModuleDescriptor targetModule) {
        Intrinsics.j(targetModule, "targetModule");
        if (Intrinsics.e(this, targetModule)) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.f144836i;
        Intrinsics.g(moduleDependencies);
        return CollectionsKt.h0(moduleDependencies.c(), targetModule) || w0().contains(targetModule) || targetModule.w0().contains(this);
    }

    public final void L0(PackageFragmentProvider providerForModuleContent) {
        Intrinsics.j(providerForModuleContent, "providerForModuleContent");
        M0();
        this.f144837j = providerForModuleContent;
    }

    public boolean N0() {
        return this.f144838k;
    }

    public final void Q0(List<ModuleDescriptorImpl> descriptors) {
        Intrinsics.j(descriptors, "descriptors");
        R0(descriptors, SetsKt.e());
    }

    public final void R0(List<ModuleDescriptorImpl> descriptors, Set<ModuleDescriptorImpl> friends) {
        Intrinsics.j(descriptors, "descriptors");
        Intrinsics.j(friends, "friends");
        S0(new ModuleDependenciesImpl(descriptors, friends, CollectionsKt.m(), SetsKt.e()));
    }

    public final void S0(ModuleDependencies dependencies) {
        Intrinsics.j(dependencies, "dependencies");
        this.f144836i = dependencies;
    }

    public final void T0(ModuleDescriptorImpl... descriptors) {
        Intrinsics.j(descriptors, "descriptors");
        Q0(ArraysKt.h1(descriptors));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public PackageViewDescriptor i0(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        H0();
        return this.f144839l.invoke(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public KotlinBuiltIns l() {
        return this.f144831d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public Collection<FqName> m(FqName fqName, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(nameFilter, "nameFilter");
        H0();
        return J0().m(fqName, nameFilter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!N0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.f144837j;
        sb2.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public List<ModuleDescriptor> w0() {
        ModuleDependencies moduleDependencies = this.f144836i;
        if (moduleDependencies != null) {
            return moduleDependencies.b();
        }
        throw new AssertionError("Dependencies of module " + I0() + " were not set");
    }

    private final String I0() {
        String string = getName().toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public void H0() {
        if (!N0()) {
            InvalidModuleExceptionKt.a(this);
        }
    }

    public final PackageFragmentProvider J0() {
        H0();
        return K0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor b() {
        return ModuleDescriptor.DefaultImpls.b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return (R) ModuleDescriptor.DefaultImpls.a(this, declarationDescriptorVisitor, d10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModuleDescriptorImpl(Name moduleName, StorageManager storageManager, KotlinBuiltIns builtIns, TargetPlatform targetPlatform, Map<ModuleCapability<?>, ? extends Object> capabilities, Name name) {
        super(Annotations.f144596s3.b(), moduleName);
        Intrinsics.j(moduleName, "moduleName");
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(builtIns, "builtIns");
        Intrinsics.j(capabilities, "capabilities");
        this.f144830c = storageManager;
        this.f144831d = builtIns;
        this.f144832e = targetPlatform;
        this.f144833f = name;
        if (moduleName.p()) {
            this.f144834g = capabilities;
            PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) E0(PackageViewDescriptorFactory.f144851a.a());
            this.f144835h = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.f144854b : packageViewDescriptorFactory;
            this.f144838k = true;
            this.f144839l = storageManager.i(new g(this));
            this.f144840m = LazyKt.b(new h(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}

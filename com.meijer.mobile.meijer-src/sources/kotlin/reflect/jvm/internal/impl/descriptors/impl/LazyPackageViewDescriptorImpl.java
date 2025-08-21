package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension
/* loaded from: classes14.dex */
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144811h = {Reflection.j(new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "fragments", "getFragments()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(LazyPackageViewDescriptorImpl.class, "empty", "getEmpty()Z", 0))};

    /* renamed from: c, reason: collision with root package name */
    private final ModuleDescriptorImpl f144812c;

    /* renamed from: d, reason: collision with root package name */
    private final FqName f144813d;

    /* renamed from: e, reason: collision with root package name */
    private final NotNullLazyValue f144814e;

    /* renamed from: f, reason: collision with root package name */
    private final NotNullLazyValue f144815f;

    /* renamed from: g, reason: collision with root package name */
    private final MemberScope f144816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl module, FqName fqName, StorageManager storageManager) {
        super(Annotations.f144596s3.b(), fqName.g());
        Intrinsics.j(module, "module");
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(storageManager, "storageManager");
        this.f144812c = module;
        this.f144813d = fqName;
        this.f144814e = storageManager.c(new d(this));
        this.f144815f = storageManager.c(new e(this));
        this.f144816g = new LazyScopeAdapter(storageManager, new f(this));
    }

    protected final boolean L0() {
        return ((Boolean) StorageKt.a(this.f144815f, this, f144811h[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public ModuleDescriptorImpl y0() {
        return this.f144812c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public FqName e() {
        return this.f144813d;
    }

    public boolean equals(Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && Intrinsics.e(e(), packageViewDescriptor.e()) && Intrinsics.e(y0(), packageViewDescriptor.y0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public List<PackageFragmentDescriptor> f0() {
        return (List) StorageKt.a(this.f144814e, this, f144811h[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public MemberScope n() {
        return this.f144816g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        Intrinsics.j(visitor, "visitor");
        return visitor.b(this, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        return PackageFragmentProviderKt.b(lazyPackageViewDescriptorImpl.y0().J0(), lazyPackageViewDescriptorImpl.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List J0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        return PackageFragmentProviderKt.c(lazyPackageViewDescriptorImpl.y0().J0(), lazyPackageViewDescriptorImpl.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope N0(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        if (lazyPackageViewDescriptorImpl.isEmpty()) {
            return MemberScope.Empty.f147200b;
        }
        List<PackageFragmentDescriptor> listF0 = lazyPackageViewDescriptorImpl.f0();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listF0, 10));
        Iterator<T> it = listF0.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageFragmentDescriptor) it.next()).n());
        }
        List listQ0 = CollectionsKt.Q0(arrayList, new SubpackagesScope(lazyPackageViewDescriptorImpl.y0(), lazyPackageViewDescriptorImpl.e()));
        return ChainedMemberScope.f147156d.a("package view scope for " + lazyPackageViewDescriptorImpl.e() + " in " + lazyPackageViewDescriptorImpl.y0().getName(), listQ0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public PackageViewDescriptor b() {
        if (e().c()) {
            return null;
        }
        return y0().i0(e().d());
    }

    public int hashCode() {
        return (y0().hashCode() * 31) + e().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return L0();
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    private final StorageManager f146345a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinMetadataFinder f146346b;

    /* renamed from: c, reason: collision with root package name */
    private final ModuleDescriptor f146347c;

    /* renamed from: d, reason: collision with root package name */
    protected DeserializationComponents f146348d;

    /* renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> f146349e;

    protected abstract DeserializedPackageFragment e(FqName fqName);

    public AbstractDeserializedPackageFragmentProvider(StorageManager storageManager, KotlinMetadataFinder finder, ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(finder, "finder");
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        this.f146345a = storageManager;
        this.f146346b = finder;
        this.f146347c = moduleDescriptor;
        this.f146349e = storageManager.g(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageFragmentDescriptor f(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider, FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        DeserializedPackageFragment deserializedPackageFragmentE = abstractDeserializedPackageFragmentProvider.e(fqName);
        if (deserializedPackageFragmentE == null) {
            return null;
        }
        deserializedPackageFragmentE.I0(abstractDeserializedPackageFragmentProvider.g());
        return deserializedPackageFragmentE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated
    public List<PackageFragmentDescriptor> a(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return CollectionsKt.q(this.f146349e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void b(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(packageFragments, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(packageFragments, this.f146349e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean c(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return (this.f146349e.j(fqName) ? this.f146349e.invoke(fqName) : e(fqName)) == null;
    }

    protected final DeserializationComponents g() {
        DeserializationComponents deserializationComponents = this.f146348d;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.y("components");
        return null;
    }

    protected final KotlinMetadataFinder h() {
        return this.f146346b;
    }

    protected final ModuleDescriptor i() {
        return this.f146347c;
    }

    protected final StorageManager j() {
        return this.f146345a;
    }

    protected final void k(DeserializationComponents deserializationComponents) {
        Intrinsics.j(deserializationComponents, "<set-?>");
        this.f146348d = deserializationComponents;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> m(FqName fqName, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(nameFilter, "nameFilter");
        return SetsKt.e();
    }
}

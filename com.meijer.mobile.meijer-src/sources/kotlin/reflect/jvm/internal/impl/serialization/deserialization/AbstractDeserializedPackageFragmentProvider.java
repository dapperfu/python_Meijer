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

/* loaded from: classes14.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: a, reason: collision with root package name */
    private final StorageManager f147252a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinMetadataFinder f147253b;

    /* renamed from: c, reason: collision with root package name */
    private final ModuleDescriptor f147254c;

    /* renamed from: d, reason: collision with root package name */
    protected DeserializationComponents f147255d;

    /* renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> f147256e;

    protected abstract DeserializedPackageFragment e(FqName fqName);

    public AbstractDeserializedPackageFragmentProvider(StorageManager storageManager, KotlinMetadataFinder finder, ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(finder, "finder");
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        this.f147252a = storageManager;
        this.f147253b = finder;
        this.f147254c = moduleDescriptor;
        this.f147256e = storageManager.g(new a(this));
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
        return CollectionsKt.q(this.f147256e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void b(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(packageFragments, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(packageFragments, this.f147256e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean c(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return (this.f147256e.j(fqName) ? this.f147256e.invoke(fqName) : e(fqName)) == null;
    }

    protected final DeserializationComponents g() {
        DeserializationComponents deserializationComponents = this.f147255d;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.x("components");
        return null;
    }

    protected final KotlinMetadataFinder h() {
        return this.f147253b;
    }

    protected final ModuleDescriptor i() {
        return this.f147254c;
    }

    protected final StorageManager j() {
        return this.f147252a;
    }

    protected final void k(DeserializationComponents deserializationComponents) {
        Intrinsics.j(deserializationComponents, "<set-?>");
        this.f147255d = deserializationComponents;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> m(FqName fqName, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(nameFilter, "nameFilter");
        return SetsKt.e();
    }
}

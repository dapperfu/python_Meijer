package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {

    /* renamed from: g, reason: collision with root package name */
    private final StorageManager f146403g;

    public abstract ClassDataFinder D0();

    public abstract void I0(DeserializationComponents deserializationComponents);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragment(FqName fqName, StorageManager storageManager, ModuleDescriptor module) {
        super(module, fqName);
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(module, "module");
        this.f146403g = storageManager;
    }

    public boolean H0(Name name) {
        Intrinsics.j(name, "name");
        MemberScope memberScopeN = n();
        return (memberScopeN instanceof DeserializedMemberScope) && ((DeserializedMemberScope) memberScopeN).t().contains(name);
    }
}

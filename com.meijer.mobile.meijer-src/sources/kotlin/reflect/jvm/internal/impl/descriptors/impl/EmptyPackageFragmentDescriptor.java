package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes14.dex */
public final class EmptyPackageFragmentDescriptor extends PackageFragmentDescriptorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyPackageFragmentDescriptor(ModuleDescriptor module, FqName fqName) {
        super(module, fqName);
        Intrinsics.j(module, "module");
        Intrinsics.j(fqName, "fqName");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public MemberScope.Empty n() {
        return MemberScope.Empty.f147200b;
    }
}

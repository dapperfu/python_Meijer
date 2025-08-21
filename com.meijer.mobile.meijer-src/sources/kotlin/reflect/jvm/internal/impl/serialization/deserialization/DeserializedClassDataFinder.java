package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DeserializedClassDataFinder implements ClassDataFinder {

    /* renamed from: a, reason: collision with root package name */
    private final PackageFragmentProvider f147309a;

    public DeserializedClassDataFinder(PackageFragmentProvider packageFragmentProvider) {
        Intrinsics.j(packageFragmentProvider, "packageFragmentProvider");
        this.f147309a = packageFragmentProvider;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData a(ClassId classId) {
        ClassData classDataA;
        Intrinsics.j(classId, "classId");
        for (PackageFragmentDescriptor packageFragmentDescriptor : PackageFragmentProviderKt.c(this.f147309a, classId.f())) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (classDataA = ((DeserializedPackageFragment) packageFragmentDescriptor).D0().a(classId)) != null) {
                return classDataA;
            }
        }
        return null;
    }
}

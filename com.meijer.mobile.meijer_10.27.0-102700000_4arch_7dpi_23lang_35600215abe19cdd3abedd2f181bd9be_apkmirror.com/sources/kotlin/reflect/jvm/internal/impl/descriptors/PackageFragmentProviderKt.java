package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public final class PackageFragmentProviderKt {
    public static final void a(PackageFragmentProvider packageFragmentProvider, FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.j(packageFragmentProvider, "<this>");
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(packageFragments, "packageFragments");
        if (packageFragmentProvider instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized) packageFragmentProvider).b(fqName, packageFragments);
        } else {
            packageFragments.addAll(packageFragmentProvider.a(fqName));
        }
    }

    public static final boolean b(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        Intrinsics.j(packageFragmentProvider, "<this>");
        Intrinsics.j(fqName, "fqName");
        return packageFragmentProvider instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized) packageFragmentProvider).c(fqName) : c(packageFragmentProvider, fqName).isEmpty();
    }

    public static final List<PackageFragmentDescriptor> c(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        Intrinsics.j(packageFragmentProvider, "<this>");
        Intrinsics.j(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }
}

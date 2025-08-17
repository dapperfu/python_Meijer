package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public interface PackageFragmentProviderOptimized extends PackageFragmentProvider {
    void b(FqName fqName, Collection<PackageFragmentDescriptor> collection);

    boolean c(FqName fqName);
}

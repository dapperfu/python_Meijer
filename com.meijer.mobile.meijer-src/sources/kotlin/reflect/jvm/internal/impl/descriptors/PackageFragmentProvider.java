package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public interface PackageFragmentProvider {
    @Deprecated
    List<PackageFragmentDescriptor> a(FqName fqName);

    Collection<FqName> m(FqName fqName, Function1<? super Name, Boolean> function1);
}

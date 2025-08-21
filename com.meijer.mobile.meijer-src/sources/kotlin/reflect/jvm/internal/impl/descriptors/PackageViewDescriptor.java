package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes14.dex */
public interface PackageViewDescriptor extends DeclarationDescriptor {
    FqName e();

    List<PackageFragmentDescriptor> f0();

    boolean isEmpty();

    MemberScope n();

    ModuleDescriptor y0();
}

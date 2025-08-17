package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {

    public static final class DefaultImpls {
        public static DeclarationDescriptor b(ModuleDescriptor moduleDescriptor) {
            return null;
        }

        public static <R, D> R a(ModuleDescriptor moduleDescriptor, DeclarationDescriptorVisitor<R, D> visitor, D d10) {
            Intrinsics.j(visitor, "visitor");
            return visitor.k(moduleDescriptor, d10);
        }
    }

    <T> T E0(ModuleCapability<T> moduleCapability);

    boolean I(ModuleDescriptor moduleDescriptor);

    PackageViewDescriptor i0(FqName fqName);

    KotlinBuiltIns l();

    Collection<FqName> m(FqName fqName, Function1<? super Name, Boolean> function1);

    List<ModuleDescriptor> w0();
}

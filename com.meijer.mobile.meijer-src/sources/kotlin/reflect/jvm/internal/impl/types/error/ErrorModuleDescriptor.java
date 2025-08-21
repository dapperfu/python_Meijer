package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public final class ErrorModuleDescriptor implements ModuleDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public static final ErrorModuleDescriptor f147778a = new ErrorModuleDescriptor();

    /* renamed from: b, reason: collision with root package name */
    private static final Name f147779b;

    /* renamed from: c, reason: collision with root package name */
    private static final List<ModuleDescriptor> f147780c;

    /* renamed from: d, reason: collision with root package name */
    private static final List<ModuleDescriptor> f147781d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<ModuleDescriptor> f147782e;

    /* renamed from: f, reason: collision with root package name */
    private static final Lazy f147783f;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public <T> T E0(ModuleCapability<T> capability) {
        Intrinsics.j(capability, "capability");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean I(ModuleDescriptor targetModule) {
        Intrinsics.j(targetModule, "targetModule");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        Intrinsics.j(visitor, "visitor");
        return null;
    }

    static {
        Name nameU = Name.u(ErrorEntity.f147770e.b());
        Intrinsics.i(nameU, "special(...)");
        f147779b = nameU;
        f147780c = CollectionsKt.m();
        f147781d = CollectionsKt.m();
        f147782e = SetsKt.e();
        f147783f = LazyKt.b(a.f147904a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultBuiltIns g0() {
        return DefaultBuiltIns.f144145h.a();
    }

    public Name B0() {
        return f147779b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.f144596s3.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public PackageViewDescriptor i0(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public KotlinBuiltIns l() {
        return (KotlinBuiltIns) f147783f.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public Collection<FqName> m(FqName fqName, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(nameFilter, "nameFilter");
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public List<ModuleDescriptor> w0() {
        return f147781d;
    }

    private ErrorModuleDescriptor() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        return B0();
    }
}

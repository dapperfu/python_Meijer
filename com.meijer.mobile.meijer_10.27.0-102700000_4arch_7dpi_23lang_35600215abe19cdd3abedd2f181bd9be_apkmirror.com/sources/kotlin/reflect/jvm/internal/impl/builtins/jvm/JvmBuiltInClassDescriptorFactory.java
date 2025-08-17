package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    /* renamed from: g, reason: collision with root package name */
    private static final Name f143516g;

    /* renamed from: h, reason: collision with root package name */
    private static final ClassId f143517h;

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f143518a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<ModuleDescriptor, DeclarationDescriptor> f143519b;

    /* renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f143520c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f143514e = {Reflection.j(new PropertyReference1Impl(JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f143513d = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final FqName f143515f = StandardNames.f143284A;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ClassId a() {
            return JvmBuiltInClassDescriptorFactory.f143517h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> computeContainingDeclaration) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        Intrinsics.j(computeContainingDeclaration, "computeContainingDeclaration");
        this.f143518a = moduleDescriptor;
        this.f143519b = computeContainingDeclaration;
        this.f143520c = storageManager.c(new a(this, storageManager));
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.f143374d;
        f143516g = fqNameUnsafe.j();
        f143517h = ClassId.f145674d.c(fqNameUnsafe.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuiltInsPackageFragment d(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        List<PackageFragmentDescriptor> listF0 = module.i0(f143515f).f0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        return (BuiltInsPackageFragment) CollectionsKt.s0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptorImpl h(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(jvmBuiltInClassDescriptorFactory.f143519b.invoke(jvmBuiltInClassDescriptorFactory.f143518a), f143516g, Modality.f143622e, ClassKind.f143586c, CollectionsKt.e(jvmBuiltInClassDescriptorFactory.f143518a.l().i()), SourceElement.f143647a, false, storageManager);
        classDescriptorImpl.H0(new CloneableClassScope(storageManager, classDescriptorImpl), SetsKt.e(), null);
        return classDescriptorImpl;
    }

    private final ClassDescriptorImpl i() {
        return (ClassDescriptorImpl) StorageKt.a(this.f143520c, this, f143514e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> a(FqName packageFqName) {
        Intrinsics.j(packageFqName, "packageFqName");
        return Intrinsics.e(packageFqName, f143515f) ? SetsKt.d(i()) : SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean b(FqName packageFqName, Name name) {
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(name, "name");
        return Intrinsics.e(name, f143516g) && Intrinsics.e(packageFqName, f143515f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor c(ClassId classId) {
        Intrinsics.j(classId, "classId");
        if (Intrinsics.e(classId, f143517h)) {
            return i();
        }
        return null;
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i10 & 4) != 0 ? b.f143563a : function1);
    }
}

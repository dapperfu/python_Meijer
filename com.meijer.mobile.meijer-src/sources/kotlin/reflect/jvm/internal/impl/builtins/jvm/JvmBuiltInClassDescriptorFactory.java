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
/* loaded from: classes14.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    /* renamed from: g, reason: collision with root package name */
    private static final Name f144423g;

    /* renamed from: h, reason: collision with root package name */
    private static final ClassId f144424h;

    /* renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f144425a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<ModuleDescriptor, DeclarationDescriptor> f144426b;

    /* renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f144427c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144421e = {Reflection.j(new PropertyReference1Impl(JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f144420d = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final FqName f144422f = StandardNames.f144191A;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ClassId a() {
            return JvmBuiltInClassDescriptorFactory.f144424h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> computeContainingDeclaration) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        Intrinsics.j(computeContainingDeclaration, "computeContainingDeclaration");
        this.f144425a = moduleDescriptor;
        this.f144426b = computeContainingDeclaration;
        this.f144427c = storageManager.c(new a(this, storageManager));
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.f144281d;
        f144423g = fqNameUnsafe.j();
        f144424h = ClassId.f146581d.c(fqNameUnsafe.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuiltInsPackageFragment d(ModuleDescriptor module) {
        Intrinsics.j(module, "module");
        List<PackageFragmentDescriptor> listF0 = module.i0(f144422f).f0();
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
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(jvmBuiltInClassDescriptorFactory.f144426b.invoke(jvmBuiltInClassDescriptorFactory.f144425a), f144423g, Modality.f144529e, ClassKind.f144493c, CollectionsKt.e(jvmBuiltInClassDescriptorFactory.f144425a.l().i()), SourceElement.f144554a, false, storageManager);
        classDescriptorImpl.H0(new CloneableClassScope(storageManager, classDescriptorImpl), SetsKt.e(), null);
        return classDescriptorImpl;
    }

    private final ClassDescriptorImpl i() {
        return (ClassDescriptorImpl) StorageKt.a(this.f144427c, this, f144421e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> a(FqName packageFqName) {
        Intrinsics.j(packageFqName, "packageFqName");
        return Intrinsics.e(packageFqName, f144422f) ? SetsKt.d(i()) : SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean b(FqName packageFqName, Name name) {
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(name, "name");
        return Intrinsics.e(name, f144423g) && Intrinsics.e(packageFqName, f144422f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor c(ClassId classId) {
        Intrinsics.j(classId, "classId");
        if (Intrinsics.e(classId, f144424h)) {
            return i();
        }
        return null;
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i10 & 4) != 0 ? b.f144470a : function1);
    }
}

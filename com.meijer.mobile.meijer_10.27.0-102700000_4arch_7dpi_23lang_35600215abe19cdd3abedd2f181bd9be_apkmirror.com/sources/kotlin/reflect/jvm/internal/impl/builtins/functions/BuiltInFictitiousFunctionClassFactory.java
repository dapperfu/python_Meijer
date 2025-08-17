package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    /* renamed from: a, reason: collision with root package name */
    private final StorageManager f143450a;

    /* renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f143451b;

    public BuiltInFictitiousFunctionClassFactory(StorageManager storageManager, ModuleDescriptor module) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(module, "module");
        this.f143450a = storageManager;
        this.f143451b = module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> a(FqName packageFqName) {
        Intrinsics.j(packageFqName, "packageFqName");
        return SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean b(FqName packageFqName, Name name) {
        Intrinsics.j(packageFqName, "packageFqName");
        Intrinsics.j(name, "name");
        String strB = name.b();
        Intrinsics.i(strB, "asString(...)");
        return (StringsKt.W(strB, "Function", false, 2, null) || StringsKt.W(strB, "KFunction", false, 2, null) || StringsKt.W(strB, "SuspendFunction", false, 2, null) || StringsKt.W(strB, "KSuspendFunction", false, 2, null)) && FunctionTypeKindExtractor.f143482c.a().c(packageFqName, strB) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor c(ClassId classId) {
        FqName fqNameF;
        FunctionTypeKindExtractor.KindWithArity kindWithArityC;
        Intrinsics.j(classId, "classId");
        if (classId.i() || classId.j()) {
            return null;
        }
        String strA = classId.g().a();
        if (!StringsKt.c0(strA, "Function", false, 2, null) || (kindWithArityC = FunctionTypeKindExtractor.f143482c.a().c((fqNameF = classId.f()), strA)) == null) {
            return null;
        }
        FunctionTypeKind functionTypeKindA = kindWithArityC.a();
        int iB = kindWithArityC.b();
        List<PackageFragmentDescriptor> listF0 = this.f143451b.i0(fqNameF).f0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(obj2);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) CollectionsKt.u0(arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) CollectionsKt.s0(arrayList);
        }
        return new FunctionClassDescriptor(this.f143450a, packageFragmentDescriptor, functionTypeKindA, iB);
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class FindClassInModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(ClassId it) {
        Intrinsics.j(it, "it");
        return 0;
    }

    public static final ClassDescriptor b(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.j(moduleDescriptor, "<this>");
        Intrinsics.j(classId, "classId");
        ClassifierDescriptor classifierDescriptorC = c(moduleDescriptor, classId);
        if (classifierDescriptorC instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorC;
        }
        return null;
    }

    public static final ClassifierDescriptor c(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.j(moduleDescriptor, "<this>");
        Intrinsics.j(classId, "classId");
        ModuleDescriptor moduleDescriptorA = ResolutionAnchorProviderKt.a(moduleDescriptor);
        if (moduleDescriptorA == null) {
            PackageViewDescriptor packageViewDescriptorI0 = moduleDescriptor.i0(classId.f());
            List<Name> listE = classId.g().e();
            ClassifierDescriptor classifierDescriptorF = packageViewDescriptorI0.n().f((Name) CollectionsKt.s0(listE), NoLookupLocation.f144132r);
            if (classifierDescriptorF == null) {
                return null;
            }
            for (Name name : listE.subList(1, listE.size())) {
                if (!(classifierDescriptorF instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorF2 = ((ClassDescriptor) classifierDescriptorF).R().f(name, NoLookupLocation.f144132r);
                classifierDescriptorF = classifierDescriptorF2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF2 : null;
                if (classifierDescriptorF == null) {
                    return null;
                }
            }
            return classifierDescriptorF;
        }
        PackageViewDescriptor packageViewDescriptorI02 = moduleDescriptorA.i0(classId.f());
        List<Name> listE2 = classId.g().e();
        ClassifierDescriptor classifierDescriptorF3 = packageViewDescriptorI02.n().f((Name) CollectionsKt.s0(listE2), NoLookupLocation.f144132r);
        if (classifierDescriptorF3 == null) {
            classifierDescriptorF3 = null;
            break;
        }
        for (Name name2 : listE2.subList(1, listE2.size())) {
            if (classifierDescriptorF3 instanceof ClassDescriptor) {
                ClassifierDescriptor classifierDescriptorF4 = ((ClassDescriptor) classifierDescriptorF3).R().f(name2, NoLookupLocation.f144132r);
                classifierDescriptorF3 = classifierDescriptorF4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF4 : null;
                if (classifierDescriptorF3 != null) {
                }
            }
            classifierDescriptorF3 = null;
        }
        if (classifierDescriptorF3 != null) {
            return classifierDescriptorF3;
        }
        PackageViewDescriptor packageViewDescriptorI03 = moduleDescriptor.i0(classId.f());
        List<Name> listE3 = classId.g().e();
        ClassifierDescriptor classifierDescriptorF5 = packageViewDescriptorI03.n().f((Name) CollectionsKt.s0(listE3), NoLookupLocation.f144132r);
        if (classifierDescriptorF5 == null) {
            return null;
        }
        for (Name name3 : listE3.subList(1, listE3.size())) {
            if (!(classifierDescriptorF5 instanceof ClassDescriptor)) {
                return null;
            }
            ClassifierDescriptor classifierDescriptorF6 = ((ClassDescriptor) classifierDescriptorF5).R().f(name3, NoLookupLocation.f144132r);
            classifierDescriptorF5 = classifierDescriptorF6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF6 : null;
            if (classifierDescriptorF5 == null) {
                return null;
            }
        }
        return classifierDescriptorF5;
    }

    public static final ClassDescriptor d(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        Intrinsics.j(moduleDescriptor, "<this>");
        Intrinsics.j(classId, "classId");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorB = b(moduleDescriptor, classId);
        return classDescriptorB != null ? classDescriptorB : notFoundClasses.d(classId, SequencesKt.W(SequencesKt.M(SequencesKt.q(classId, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.a
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).e();
            }
        }), b.f143775a)));
    }

    public static final TypeAliasDescriptor f(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.j(moduleDescriptor, "<this>");
        Intrinsics.j(classId, "classId");
        ClassifierDescriptor classifierDescriptorC = c(moduleDescriptor, classId);
        if (classifierDescriptorC instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorC;
        }
        return null;
    }
}

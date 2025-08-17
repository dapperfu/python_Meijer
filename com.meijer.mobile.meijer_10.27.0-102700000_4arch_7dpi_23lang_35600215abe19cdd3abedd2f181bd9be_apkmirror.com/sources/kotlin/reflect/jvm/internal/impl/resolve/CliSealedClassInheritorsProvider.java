package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final CliSealedClassInheritorsProvider f146115a = new CliSealedClassInheritorsProvider();

    private static final void b(ClassDescriptor classDescriptor, LinkedHashSet<ClassDescriptor> linkedHashSet, MemberScope memberScope, boolean z10) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.a(memberScope, DescriptorKindFilter.f146272t, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptorS = (ClassDescriptor) declarationDescriptor;
                if (classDescriptorS.h0()) {
                    Name name = classDescriptorS.getName();
                    Intrinsics.i(name, "getName(...)");
                    ClassifierDescriptor classifierDescriptorF = memberScope.f(name, NoLookupLocation.f144127m);
                    classDescriptorS = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : classifierDescriptorF instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorF).s() : null;
                }
                if (classDescriptorS != null) {
                    if (DescriptorUtils.z(classDescriptorS, classDescriptor)) {
                        linkedHashSet.add(classDescriptorS);
                    }
                    if (z10) {
                        MemberScope memberScopeR = classDescriptorS.R();
                        Intrinsics.i(memberScopeR, "getUnsubstitutedInnerClassesScope(...)");
                        b(classDescriptor, linkedHashSet, memberScopeR, z10);
                    }
                }
            }
        }
    }

    public Collection<ClassDescriptor> a(ClassDescriptor sealedClass, boolean z10) {
        DeclarationDescriptor next;
        DeclarationDescriptor declarationDescriptorB;
        Intrinsics.j(sealedClass, "sealedClass");
        if (sealedClass.q() != Modality.f143620c) {
            return CollectionsKt.m();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.u(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof PackageFragmentDescriptor) {
                    break;
                }
            }
            declarationDescriptorB = next;
        } else {
            declarationDescriptorB = sealedClass.b();
        }
        if (declarationDescriptorB instanceof PackageFragmentDescriptor) {
            b(sealedClass, linkedHashSet, ((PackageFragmentDescriptor) declarationDescriptorB).n(), z10);
        }
        MemberScope memberScopeR = sealedClass.R();
        Intrinsics.i(memberScopeR, "getUnsubstitutedInnerClassesScope(...)");
        b(sealedClass, linkedHashSet, memberScopeR, true);
        return CollectionsKt.Z0(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(DescriptorUtilsKt.o((ClassDescriptor) t10).a(), DescriptorUtilsKt.o((ClassDescriptor) t11).a());
            }
        });
    }

    private CliSealedClassInheritorsProvider() {
    }
}

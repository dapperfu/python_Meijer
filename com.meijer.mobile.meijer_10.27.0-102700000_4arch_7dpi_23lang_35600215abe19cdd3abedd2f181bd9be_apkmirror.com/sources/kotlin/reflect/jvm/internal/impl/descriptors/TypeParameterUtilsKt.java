package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeParameterUtilsKt {
    private static final PossiblyInnerType e(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i10) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.m(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.p().size() + i10;
        if (classifierDescriptorWithTypeParameters.y()) {
            List<TypeProjection> listSubList = kotlinType.I0().subList(i10, size);
            DeclarationDescriptor declarationDescriptorB = classifierDescriptorWithTypeParameters.b();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, e(kotlinType, declarationDescriptorB instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) declarationDescriptorB : null, size));
        }
        if (size != kotlinType.I0().size()) {
            DescriptorUtils.E(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.I0().subList(i10, kotlinType.I0().size()), null);
    }

    public static final PossiblyInnerType d(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        return e(kotlinType, classifierDescriptorD instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorD : null, 0);
    }

    private static final a f(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i10) {
        return new a(typeParameterDescriptor, declarationDescriptor, i10);
    }

    public static final List<TypeParameterDescriptor> g(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> listM;
        DeclarationDescriptor next;
        TypeConstructor typeConstructorI;
        Intrinsics.j(classifierDescriptorWithTypeParameters, "<this>");
        List<TypeParameterDescriptor> listP = classifierDescriptorWithTypeParameters.p();
        Intrinsics.i(listP, "getDeclaredTypeParameters(...)");
        if (!classifierDescriptorWithTypeParameters.y() && !(classifierDescriptorWithTypeParameters.b() instanceof CallableDescriptor)) {
            return listP;
        }
        List listW = SequencesKt.W(SequencesKt.G(SequencesKt.B(SequencesKt.U(DescriptorUtilsKt.u(classifierDescriptorWithTypeParameters), i.f143787a), j.f144029a), k.f144034a));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.u(classifierDescriptorWithTypeParameters).iterator();
        while (true) {
            listM = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof ClassDescriptor) {
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructorI = classDescriptor.i()) != null) {
            listM = typeConstructorI.getParameters();
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        if (listW.isEmpty() && listM.isEmpty()) {
            List<TypeParameterDescriptor> listP2 = classifierDescriptorWithTypeParameters.p();
            Intrinsics.i(listP2, "getDeclaredTypeParameters(...)");
            return listP2;
        }
        List<TypeParameterDescriptor> listP0 = CollectionsKt.P0(listW, listM);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP0, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : listP0) {
            Intrinsics.g(typeParameterDescriptor);
            arrayList.add(f(typeParameterDescriptor, classifierDescriptorWithTypeParameters, listP.size()));
        }
        return CollectionsKt.P0(listP, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(DeclarationDescriptor it) {
        Intrinsics.j(it, "it");
        return it instanceof CallableDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(DeclarationDescriptor it) {
        Intrinsics.j(it, "it");
        return !(it instanceof ConstructorDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence j(DeclarationDescriptor it) {
        Intrinsics.j(it, "it");
        List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it).getTypeParameters();
        Intrinsics.i(typeParameters, "getTypeParameters(...)");
        return CollectionsKt.f0(typeParameters);
    }
}

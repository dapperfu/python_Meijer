package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes14.dex */
public class DescriptorSubstitutor {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static TypeSubstitutor b(List<TypeParameterDescriptor> list, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, List<TypeParameterDescriptor> list2) {
        if (list == null) {
            a(0);
        }
        if (typeSubstitution == null) {
            a(1);
        }
        if (declarationDescriptor == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        TypeSubstitutor typeSubstitutorC = c(list, typeSubstitution, declarationDescriptor, list2, null);
        if (typeSubstitutorC != null) {
            return typeSubstitutorC;
        }
        throw new AssertionError("Substitution failed");
    }

    public static TypeSubstitutor c(List<TypeParameterDescriptor> list, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, List<TypeParameterDescriptor> list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (typeSubstitution == null) {
            a(6);
        }
        if (declarationDescriptor == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i10 = 0;
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            TypeParameterDescriptorImpl typeParameterDescriptorImplN0 = TypeParameterDescriptorImpl.N0(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.v(), typeParameterDescriptor.k(), typeParameterDescriptor.getName(), i10, SourceElement.f144554a, typeParameterDescriptor.K());
            map.put(typeParameterDescriptor.i(), new TypeProjectionImpl(typeParameterDescriptorImplN0.o()));
            map2.put(typeParameterDescriptor, typeParameterDescriptorImplN0);
            list2.add(typeParameterDescriptorImplN0);
            i10++;
        }
        TypeConstructorSubstitution typeConstructorSubstitutionJ = TypeConstructorSubstitution.j(map);
        TypeSubstitutor typeSubstitutorH = TypeSubstitutor.h(typeSubstitution, typeConstructorSubstitutionJ);
        TypeSubstitutor typeSubstitutorH2 = TypeSubstitutor.h(typeSubstitution.h(), typeConstructorSubstitutionJ);
        for (TypeParameterDescriptor typeParameterDescriptor2 : list) {
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) map2.get(typeParameterDescriptor2);
            for (KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
                KotlinType kotlinTypeP = (((classifierDescriptorD instanceof TypeParameterDescriptor) && TypeUtilsKt.p((TypeParameterDescriptor) classifierDescriptorD)) ? typeSubstitutorH : typeSubstitutorH2).p(kotlinType, Variance.f147705g);
                if (kotlinTypeP == null) {
                    return null;
                }
                if (kotlinTypeP != kotlinType && zArr != null) {
                    zArr[0] = true;
                }
                typeParameterDescriptorImpl.J0(kotlinTypeP);
            }
            typeParameterDescriptorImpl.S0();
        }
        return typeSubstitutorH;
    }
}

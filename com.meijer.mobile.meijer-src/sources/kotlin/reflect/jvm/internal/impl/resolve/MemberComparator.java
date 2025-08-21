package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public class MemberComparator implements Comparator<DeclarationDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public static final MemberComparator f147035a = new MemberComparator();

    /* renamed from: b, reason: collision with root package name */
    private static final DescriptorRenderer f147036b = DescriptorRenderer.f146892a.b(new a());

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public static final NameAndTypeMemberComparator f147037a = new NameAndTypeMemberComparator();

        private NameAndTypeMemberComparator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Integer c(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int iD = d(declarationDescriptor2) - d(declarationDescriptor);
            if (iD != 0) {
                return Integer.valueOf(iD);
            }
            if (DescriptorUtils.B(declarationDescriptor) && DescriptorUtils.B(declarationDescriptor2)) {
                return 0;
            }
            int iCompareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }

        private static int d(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.B(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                if (((PropertyDescriptor) declarationDescriptor).N() == null) {
                    return 6;
                }
                return 5;
            }
            if (declarationDescriptor instanceof FunctionDescriptor) {
                if (((FunctionDescriptor) declarationDescriptor).N() == null) {
                    return 4;
                }
                return 3;
            }
            if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            }
            if (declarationDescriptor instanceof TypeAliasDescriptor) {
                return 1;
            }
            return 0;
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer numC = c(declarationDescriptor, declarationDescriptor2);
            if (numC != null) {
                return numC.intValue();
            }
            return 0;
        }
    }

    static class a implements Function1<DescriptorRendererOptions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.c(false);
            descriptorRendererOptions.n(true);
            descriptorRendererOptions.h(AnnotationArgumentsRenderingPolicy.f146883d);
            descriptorRendererOptions.m(DescriptorRendererModifier.f146910d);
            return Unit.f143329a;
        }

        a() {
        }
    }

    private MemberComparator() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        Integer numC = NameAndTypeMemberComparator.c(declarationDescriptor, declarationDescriptor2);
        if (numC != null) {
            return numC.intValue();
        }
        if ((declarationDescriptor instanceof TypeAliasDescriptor) && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            DescriptorRenderer descriptorRenderer = f147036b;
            int iCompareTo = descriptorRenderer.T(((TypeAliasDescriptor) declarationDescriptor).q0()).compareTo(descriptorRenderer.T(((TypeAliasDescriptor) declarationDescriptor2).q0()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor receiverParameterDescriptorN = callableDescriptor.N();
            ReceiverParameterDescriptor receiverParameterDescriptorN2 = callableDescriptor2.N();
            if (receiverParameterDescriptorN != null) {
                DescriptorRenderer descriptorRenderer2 = f147036b;
                int iCompareTo2 = descriptorRenderer2.T(receiverParameterDescriptorN.getType()).compareTo(descriptorRenderer2.T(receiverParameterDescriptorN2.getType()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            List<ValueParameterDescriptor> listH = callableDescriptor.h();
            List<ValueParameterDescriptor> listH2 = callableDescriptor2.h();
            for (int i10 = 0; i10 < Math.min(listH.size(), listH2.size()); i10++) {
                DescriptorRenderer descriptorRenderer3 = f147036b;
                int iCompareTo3 = descriptorRenderer3.T(listH.get(i10).getType()).compareTo(descriptorRenderer3.T(listH2.get(i10).getType()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = listH.size() - listH2.size();
            if (size != 0) {
                return size;
            }
            List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
            List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i11 = 0; i11 < Math.min(typeParameters.size(), typeParameters2.size()); i11++) {
                List<KotlinType> upperBounds = typeParameters.get(i11).getUpperBounds();
                List<KotlinType> upperBounds2 = typeParameters2.get(i11).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i12 = 0; i12 < upperBounds.size(); i12++) {
                    DescriptorRenderer descriptorRenderer4 = f147036b;
                    int iCompareTo4 = descriptorRenderer4.T(upperBounds.get(i12)).compareTo(descriptorRenderer4.T(upperBounds2.get(i12)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor)) {
                int iOrdinal = ((CallableMemberDescriptor) callableDescriptor).f().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).f().ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal;
                }
            }
        } else if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor2;
            if (classDescriptor.f().ordinal() != classDescriptor2.f().ordinal()) {
                return classDescriptor.f().ordinal() - classDescriptor2.f().ordinal();
            }
            if (classDescriptor.Z() != classDescriptor2.Z()) {
                if (classDescriptor.Z()) {
                    return 1;
                }
                return -1;
            }
        } else {
            throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()));
        }
        DescriptorRenderer descriptorRenderer5 = f147036b;
        int iCompareTo5 = descriptorRenderer5.N(declarationDescriptor).compareTo(descriptorRenderer5.N(declarationDescriptor2));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        return DescriptorUtils.g(declarationDescriptor).getName().compareTo(DescriptorUtils.g(declarationDescriptor2).getName());
    }
}

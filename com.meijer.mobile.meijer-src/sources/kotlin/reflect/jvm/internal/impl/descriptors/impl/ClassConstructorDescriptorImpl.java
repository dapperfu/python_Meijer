package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes14.dex */
public class ClassConstructorDescriptorImpl extends FunctionDescriptorImpl implements ClassConstructorDescriptor {

    /* renamed from: E, reason: collision with root package name */
    protected final boolean f144724E;

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void e0(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl.e0(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void A0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            e0(22);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected ClassConstructorDescriptorImpl(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z10, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(classDescriptor, constructorDescriptor, annotations, SpecialNames.f146610j, kind, sourceElement);
        if (classDescriptor == null) {
            e0(0);
        }
        if (annotations == null) {
            e0(1);
        }
        if (kind == null) {
            e0(2);
        }
        if (sourceElement == null) {
            e0(3);
        }
        this.f144724E = z10;
    }

    public static ClassConstructorDescriptorImpl k1(ClassDescriptor classDescriptor, Annotations annotations, boolean z10, SourceElement sourceElement) {
        if (classDescriptor == null) {
            e0(4);
        }
        if (annotations == null) {
            e0(5);
        }
        if (sourceElement == null) {
            e0(6);
        }
        return new ClassConstructorDescriptorImpl(classDescriptor, null, annotations, z10, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends FunctionDescriptor> d() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            e0(21);
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public ClassConstructorDescriptorImpl I0(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            e0(23);
        }
        if (kind == null) {
            e0(24);
        }
        if (annotations == null) {
            e0(25);
        }
        if (sourceElement == null) {
            e0(26);
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            return new ClassConstructorDescriptorImpl((ClassDescriptor) declarationDescriptor, this, annotations, this.f144724E, kind2, sourceElement);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    public ClassConstructorDescriptorImpl n1(List<ValueParameterDescriptor> list, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            e0(13);
        }
        if (descriptorVisibility == null) {
            e0(14);
        }
        o1(list, descriptorVisibility, b().p());
        return this;
    }

    public ClassConstructorDescriptorImpl o1(List<ValueParameterDescriptor> list, DescriptorVisibility descriptorVisibility, List<TypeParameterDescriptor> list2) {
        if (list == null) {
            e0(10);
        }
        if (descriptorVisibility == null) {
            e0(11);
        }
        if (list2 == null) {
            e0(12);
        }
        super.O0(null, i1(), h1(), list2, list, null, Modality.f144526b, descriptorVisibility);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean z() {
        return this.f144724E;
    }

    private List<ReceiverParameterDescriptor> h1() {
        ClassDescriptor classDescriptorB = b();
        if (!classDescriptorB.W().isEmpty()) {
            List<ReceiverParameterDescriptor> listW = classDescriptorB.W();
            if (listW == null) {
                e0(15);
            }
            return listW;
        }
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            e0(16);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public ClassDescriptor a0() {
        ClassDescriptor classDescriptorB = b();
        if (classDescriptorB == null) {
            e0(18);
        }
        return classDescriptorB;
    }

    public ReceiverParameterDescriptor i1() {
        ClassDescriptor classDescriptorB = b();
        if (classDescriptorB.y()) {
            DeclarationDescriptor declarationDescriptorB = classDescriptorB.b();
            if (declarationDescriptorB instanceof ClassDescriptor) {
                return ((ClassDescriptor) declarationDescriptorB).G0();
            }
            return null;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public ClassConstructorDescriptor M(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.M(declarationDescriptor, modality, descriptorVisibility, kind, z10);
        if (classConstructorDescriptor == null) {
            e0(27);
        }
        return classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor b() {
        ClassDescriptor classDescriptor = (ClassDescriptor) super.b();
        if (classDescriptor == null) {
            e0(17);
        }
        return classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.j(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ClassConstructorDescriptor c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            e0(20);
        }
        return (ClassConstructorDescriptor) super.c(typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ClassConstructorDescriptor a() {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.a();
        if (classConstructorDescriptor == null) {
            e0(19);
        }
        return classConstructorDescriptor;
    }
}

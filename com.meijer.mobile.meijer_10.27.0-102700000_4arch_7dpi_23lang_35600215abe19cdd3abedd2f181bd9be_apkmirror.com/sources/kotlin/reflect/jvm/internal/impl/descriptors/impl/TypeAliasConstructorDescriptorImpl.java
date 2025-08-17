package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {

    /* renamed from: E, reason: collision with root package name */
    private final StorageManager f143999E;

    /* renamed from: F, reason: collision with root package name */
    private final TypeAliasDescriptor f144000F;

    /* renamed from: G, reason: collision with root package name */
    private final NullableLazyValue f144001G;

    /* renamed from: H, reason: collision with root package name */
    private ClassConstructorDescriptor f144002H;

    /* renamed from: J, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f143998J = {Reflection.j(new PropertyReference1Impl(TypeAliasConstructorDescriptorImpl.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};

    /* renamed from: I, reason: collision with root package name */
    public static final Companion f143997I = new Companion(null);

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TypeAliasConstructorDescriptor b(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor constructor) {
            ClassConstructorDescriptor classConstructorDescriptorC;
            List<ReceiverParameterDescriptor> listM;
            Intrinsics.j(storageManager, "storageManager");
            Intrinsics.j(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.j(constructor, "constructor");
            TypeSubstitutor typeSubstitutorC = c(typeAliasDescriptor);
            if (typeSubstitutorC == null || (classConstructorDescriptorC = constructor.c(typeSubstitutorC)) == null) {
                return null;
            }
            Annotations annotations = constructor.getAnnotations();
            CallableMemberDescriptor.Kind kindF = constructor.f();
            Intrinsics.i(kindF, "getKind(...)");
            SourceElement sourceElementG = typeAliasDescriptor.g();
            Intrinsics.i(sourceElementG, "getSource(...)");
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, classConstructorDescriptorC, null, annotations, kindF, sourceElementG, null);
            List<ValueParameterDescriptor> listL0 = FunctionDescriptorImpl.L0(typeAliasConstructorDescriptorImpl, constructor.h(), typeSubstitutorC);
            if (listL0 == null) {
                return null;
            }
            SimpleType simpleTypeC = FlexibleTypesKt.c(classConstructorDescriptorC.getReturnType().N0());
            SimpleType simpleTypeO = typeAliasDescriptor.o();
            Intrinsics.i(simpleTypeO, "getDefaultType(...)");
            SimpleType simpleTypeJ = SpecialTypesKt.j(simpleTypeC, simpleTypeO);
            ReceiverParameterDescriptor receiverParameterDescriptorJ = constructor.J();
            ReceiverParameterDescriptor receiverParameterDescriptorI = receiverParameterDescriptorJ != null ? DescriptorFactory.i(typeAliasConstructorDescriptorImpl, typeSubstitutorC.n(receiverParameterDescriptorJ.getType(), Variance.f146796e), Annotations.f143689s3.b()) : null;
            ClassDescriptor classDescriptorS = typeAliasDescriptor.s();
            if (classDescriptorS != null) {
                List<ReceiverParameterDescriptor> listU0 = constructor.u0();
                Intrinsics.i(listU0, "getContextReceiverParameters(...)");
                List<ReceiverParameterDescriptor> list = listU0;
                listM = new ArrayList<>(CollectionsKt.x(list, 10));
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.w();
                    }
                    ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) obj;
                    KotlinType kotlinTypeN = typeSubstitutorC.n(receiverParameterDescriptor.getType(), Variance.f146796e);
                    ReceiverValue value = receiverParameterDescriptor.getValue();
                    Intrinsics.h(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listM.add(DescriptorFactory.c(classDescriptorS, kotlinTypeN, ((ImplicitContextReceiver) value).a(), Annotations.f143689s3.b(), i10));
                    i10 = i11;
                }
            } else {
                listM = CollectionsKt.m();
            }
            typeAliasConstructorDescriptorImpl.O0(receiverParameterDescriptorI, null, listM, typeAliasDescriptor.p(), listL0, simpleTypeJ, Modality.f143619b, typeAliasDescriptor.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TypeSubstitutor c(TypeAliasDescriptor typeAliasDescriptor) {
            if (typeAliasDescriptor.s() == null) {
                return null;
            }
            return TypeSubstitutor.f(typeAliasDescriptor.F());
        }
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptor, annotations, kind, sourceElement);
    }

    private TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, annotations, SpecialNames.f145703j, kind, sourceElement);
        this.f143999E = storageManager;
        this.f144000F = typeAliasDescriptor;
        S0(m1().V());
        this.f144001G = storageManager.e(new i(this, classConstructorDescriptor));
        this.f144002H = classConstructorDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeAliasConstructorDescriptorImpl o1(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        StorageManager storageManager = typeAliasConstructorDescriptorImpl.f143999E;
        TypeAliasDescriptor typeAliasDescriptorM1 = typeAliasConstructorDescriptorImpl.m1();
        Annotations annotations = classConstructorDescriptor.getAnnotations();
        CallableMemberDescriptor.Kind kindF = classConstructorDescriptor.f();
        Intrinsics.i(kindF, "getKind(...)");
        SourceElement sourceElementG = typeAliasConstructorDescriptorImpl.m1().g();
        Intrinsics.i(sourceElementG, "getSource(...)");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptorM1, classConstructorDescriptor, typeAliasConstructorDescriptorImpl, annotations, kindF, sourceElementG);
        TypeSubstitutor typeSubstitutorC = f143997I.c(typeAliasConstructorDescriptorImpl.m1());
        if (typeSubstitutorC == null) {
            return null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptorJ = classConstructorDescriptor.J();
        ReceiverParameterDescriptor receiverParameterDescriptorC = receiverParameterDescriptorJ != null ? receiverParameterDescriptorJ.c(typeSubstitutorC) : null;
        List<ReceiverParameterDescriptor> listU0 = classConstructorDescriptor.u0();
        Intrinsics.i(listU0, "getContextReceiverParameters(...)");
        List<ReceiverParameterDescriptor> list = listU0;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReceiverParameterDescriptor) it.next()).c(typeSubstitutorC));
        }
        typeAliasConstructorDescriptorImpl2.O0(null, receiverParameterDescriptorC, arrayList, typeAliasConstructorDescriptorImpl.m1().p(), typeAliasConstructorDescriptorImpl.h(), typeAliasConstructorDescriptorImpl.getReturnType(), Modality.f143619b, typeAliasConstructorDescriptorImpl.m1().getVisibility());
        return typeAliasConstructorDescriptorImpl2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    public ClassConstructorDescriptor Q() {
        return this.f144002H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: i1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor M(DeclarationDescriptor newOwner, Modality modality, DescriptorVisibility visibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(modality, "modality");
        Intrinsics.j(visibility, "visibility");
        Intrinsics.j(kind, "kind");
        FunctionDescriptor functionDescriptorBuild = t().q(newOwner).k(modality).h(visibility).r(kind).o(z10).build();
        Intrinsics.h(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor) functionDescriptorBuild;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptorImpl I0(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(source, "source");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.f143999E, m1(), Q(), this, annotations, kind2, source);
    }

    public TypeAliasDescriptor m1() {
        return this.f144000F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor c(TypeSubstitutor substitutor) {
        Intrinsics.j(substitutor, "substitutor");
        FunctionDescriptor functionDescriptorC = super.c(substitutor);
        Intrinsics.h(functionDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) functionDescriptorC;
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(typeAliasConstructorDescriptorImpl.getReturnType());
        Intrinsics.i(typeSubstitutorF, "create(...)");
        ClassConstructorDescriptor classConstructorDescriptorC = Q().a().c(typeSubstitutorF);
        if (classConstructorDescriptorC == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.f144002H = classConstructorDescriptorC;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public ClassDescriptor a0() {
        ClassDescriptor classDescriptorA0 = Q().a0();
        Intrinsics.i(classDescriptorA0, "getConstructedClass(...)");
        return classDescriptorA0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        KotlinType returnType = super.getReturnType();
        Intrinsics.g(returnType);
        return returnType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor b() {
        return m1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptor a() {
        FunctionDescriptor functionDescriptorA = super.a();
        Intrinsics.h(functionDescriptorA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor) functionDescriptorA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean z() {
        return Q().z();
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MemberDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializationContext f147328a;

    /* renamed from: b, reason: collision with root package name */
    private final AnnotationDeserializer f147329b;

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    public MemberDeserializer(DeserializationContext c10) {
        Intrinsics.j(c10, "c");
        this.f147328a = c10;
        this.f147329b = new AnnotationDeserializer(c10.c().q(), c10.c().r());
    }

    private final List<ValueParameterDescriptor> B(List<ProtoBuf.ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        DeclarationDescriptor declarationDescriptorE = this.f147328a.e();
        Intrinsics.h(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptorE;
        DeclarationDescriptor declarationDescriptorB = callableDescriptor.b();
        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
        ProtoContainer protoContainerI = i(declarationDescriptorB);
        List<ProtoBuf.ValueParameter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int iL = valueParameter.R() ? valueParameter.L() : 0;
            Annotations annotationsB = (protoContainerI == null || !Flags.f146422c.d(iL).booleanValue()) ? Annotations.f144596s3.b() : new NonEmptyDeserializedAnnotations(this.f147328a.h(), new j(this, protoContainerI, messageLite, annotatedCallableKind, i10, valueParameter));
            Name nameB = NameResolverUtilKt.b(this.f147328a.g(), valueParameter.M());
            KotlinType kotlinTypeU = this.f147328a.i().u(ProtoTypeTableUtilKt.q(valueParameter, this.f147328a.j()));
            Boolean boolD = Flags.f146411H.d(iL);
            Intrinsics.i(boolD, "get(...)");
            boolean zBooleanValue = boolD.booleanValue();
            Boolean boolD2 = Flags.f146412I.d(iL);
            Intrinsics.i(boolD2, "get(...)");
            boolean zBooleanValue2 = boolD2.booleanValue();
            Boolean boolD3 = Flags.f146413J.d(iL);
            Intrinsics.i(boolD3, "get(...)");
            boolean zBooleanValue3 = boolD3.booleanValue();
            ProtoBuf.Type typeT = ProtoTypeTableUtilKt.t(valueParameter, this.f147328a.j());
            KotlinType kotlinTypeU2 = typeT != null ? this.f147328a.i().u(typeT) : null;
            SourceElement NO_SOURCE = SourceElement.f144554a;
            Intrinsics.i(NO_SOURCE, "NO_SOURCE");
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i10, annotationsB, nameB, kotlinTypeU, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeU2, NO_SOURCE));
            callableDescriptor = callableDescriptor2;
            i10 = i11;
        }
        return CollectionsKt.j1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List C(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf.ValueParameter valueParameter) {
        return CollectionsKt.j1(memberDeserializer.f147328a.c().d().a(protoContainer, messageLite, annotatedCallableKind, i10, valueParameter));
    }

    private final ProtoContainer i(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).e(), this.f147328a.g(), this.f147328a.j(), this.f147328a.d());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).f1();
        }
        return null;
    }

    private final Annotations j(MessageLite messageLite, int i10, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.f146422c.d(i10).booleanValue() ? Annotations.f144596s3.b() : new NonEmptyDeserializedAnnotations(this.f147328a.h(), new g(this, messageLite, annotatedCallableKind));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f147328a.e());
        List listJ1 = protoContainerI != null ? CollectionsKt.j1(memberDeserializer.f147328a.c().d().e(protoContainerI, messageLite, annotatedCallableKind)) : null;
        return listJ1 == null ? CollectionsKt.m() : listJ1;
    }

    private final ReceiverParameterDescriptor l() {
        DeclarationDescriptor declarationDescriptorE = this.f147328a.e();
        ClassDescriptor classDescriptor = declarationDescriptorE instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE : null;
        if (classDescriptor != null) {
            return classDescriptor.G0();
        }
        return null;
    }

    private final Annotations m(ProtoBuf.Property property, boolean z10) {
        return !Flags.f146422c.d(property.f0()).booleanValue() ? Annotations.f144596s3.b() : new NonEmptyDeserializedAnnotations(this.f147328a.h(), new h(this, z10, property));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(MemberDeserializer memberDeserializer, boolean z10, ProtoBuf.Property property) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f147328a.e());
        List listJ1 = protoContainerI != null ? z10 ? CollectionsKt.j1(memberDeserializer.f147328a.c().d().l(protoContainerI, property)) : CollectionsKt.j1(memberDeserializer.f147328a.c().d().j(protoContainerI, property)) : null;
        return listJ1 == null ? CollectionsKt.m() : listJ1;
    }

    private final Annotations o(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f147328a.h(), new i(this, messageLite, annotatedCallableKind));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f147328a.e());
        List<AnnotationDescriptor> listK = protoContainerI != null ? memberDeserializer.f147328a.c().d().k(protoContainerI, messageLite, annotatedCallableKind) : null;
        return listK == null ? CollectionsKt.m() : listK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue v(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f147328a.h().e(new k(memberDeserializer, property, deserializedPropertyDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue w(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f147328a.e());
        Intrinsics.g(protoContainerI);
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoaderD = memberDeserializer.f147328a.c().d();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        Intrinsics.i(returnType, "getReturnType(...)");
        return annotationAndConstantLoaderD.h(protoContainerI, property, returnType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue x(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f147328a.h().e(new l(memberDeserializer, property, deserializedPropertyDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue y(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f147328a.e());
        Intrinsics.g(protoContainerI);
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoaderD = memberDeserializer.f147328a.c().d();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        Intrinsics.i(returnType, "getReturnType(...)");
        return annotationAndConstantLoaderD.f(protoContainerI, property, returnType);
    }

    public final ClassConstructorDescriptor r(ProtoBuf.Constructor proto, boolean z10) {
        Intrinsics.j(proto, "proto");
        DeclarationDescriptor declarationDescriptorE = this.f147328a.e();
        Intrinsics.h(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorE;
        int iO = proto.O();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, j(proto, iO, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f147328a.g(), this.f147328a.j(), this.f147328a.k(), this.f147328a.d(), null, 1024, null);
        MemberDeserializer memberDeserializerF = DeserializationContext.b(this.f147328a, deserializedClassConstructorDescriptor, CollectionsKt.m(), null, null, null, null, 60, null).f();
        List<ProtoBuf.ValueParameter> listR = proto.R();
        Intrinsics.i(listR, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.n1(memberDeserializerF.B(listR, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.a(ProtoEnumFlags.f147344a, Flags.f146423d.d(proto.O())));
        deserializedClassConstructorDescriptor.d1(classDescriptor.o());
        deserializedClassConstructorDescriptor.T0(classDescriptor.h0());
        deserializedClassConstructorDescriptor.V0(!Flags.f146434o.d(proto.O()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    public final SimpleFunctionDescriptor s(ProtoBuf.Function proto) {
        KotlinType kotlinTypeU;
        Intrinsics.j(proto, "proto");
        int iH0 = proto.y0() ? proto.h0() : t(proto.j0());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotationsJ = j(proto, iH0, annotatedCallableKind);
        Annotations annotationsO = ProtoTypeTableUtilKt.g(proto) ? o(proto, annotatedCallableKind) : Annotations.f144596s3.b();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f147328a.e(), null, annotationsJ, NameResolverUtilKt.b(this.f147328a.g(), proto.i0()), ProtoEnumFlagsUtilsKt.b(ProtoEnumFlags.f147344a, Flags.f146435p.d(iH0)), proto, this.f147328a.g(), this.f147328a.j(), Intrinsics.e(DescriptorUtilsKt.o(this.f147328a.e()).b(NameResolverUtilKt.b(this.f147328a.g(), proto.i0())), SuspendFunctionTypeUtilKt.f147345a) ? VersionRequirementTable.f146457b.b() : this.f147328a.k(), this.f147328a.d(), null, 1024, null);
        DeserializationContext deserializationContext = this.f147328a;
        List<ProtoBuf.TypeParameter> listQ0 = proto.q0();
        Intrinsics.i(listQ0, "getTypeParameterList(...)");
        DeserializationContext deserializationContextB = DeserializationContext.b(deserializationContext, deserializedSimpleFunctionDescriptor, listQ0, null, null, null, null, 60, null);
        ProtoBuf.Type typeK = ProtoTypeTableUtilKt.k(proto, this.f147328a.j());
        ReceiverParameterDescriptor receiverParameterDescriptorI = (typeK == null || (kotlinTypeU = deserializationContextB.i().u(typeK)) == null) ? null : DescriptorFactory.i(deserializedSimpleFunctionDescriptor, kotlinTypeU, annotationsO);
        ReceiverParameterDescriptor receiverParameterDescriptorL = l();
        List<ProtoBuf.Type> listC = ProtoTypeTableUtilKt.c(proto, this.f147328a.j());
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            ReceiverParameterDescriptor receiverParameterDescriptorA = A((ProtoBuf.Type) obj, deserializationContextB, deserializedSimpleFunctionDescriptor, i10);
            if (receiverParameterDescriptorA != null) {
                arrayList.add(receiverParameterDescriptorA);
            }
            i10 = i11;
        }
        List<TypeParameterDescriptor> listM = deserializationContextB.i().m();
        MemberDeserializer memberDeserializerF = deserializationContextB.f();
        List<ProtoBuf.ValueParameter> listV0 = proto.v0();
        Intrinsics.i(listV0, "getValueParameterList(...)");
        List<ValueParameterDescriptor> listB = memberDeserializerF.B(listV0, proto, AnnotatedCallableKind.FUNCTION);
        KotlinType kotlinTypeU2 = deserializationContextB.i().u(ProtoTypeTableUtilKt.m(proto, this.f147328a.j()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f147344a;
        q(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorI, receiverParameterDescriptorL, arrayList, listM, listB, kotlinTypeU2, protoEnumFlags.b(Flags.f146424e.d(iH0)), ProtoEnumFlagsUtilsKt.a(protoEnumFlags, Flags.f146423d.d(iH0)), MapsKt.k());
        Boolean boolD = Flags.f146436q.d(iH0);
        Intrinsics.i(boolD, "get(...)");
        deserializedSimpleFunctionDescriptor.c1(boolD.booleanValue());
        Boolean boolD2 = Flags.f146437r.d(iH0);
        Intrinsics.i(boolD2, "get(...)");
        deserializedSimpleFunctionDescriptor.Z0(boolD2.booleanValue());
        Boolean boolD3 = Flags.f146440u.d(iH0);
        Intrinsics.i(boolD3, "get(...)");
        deserializedSimpleFunctionDescriptor.U0(boolD3.booleanValue());
        Boolean boolD4 = Flags.f146438s.d(iH0);
        Intrinsics.i(boolD4, "get(...)");
        deserializedSimpleFunctionDescriptor.b1(boolD4.booleanValue());
        Boolean boolD5 = Flags.f146439t.d(iH0);
        Intrinsics.i(boolD5, "get(...)");
        deserializedSimpleFunctionDescriptor.f1(boolD5.booleanValue());
        Boolean boolD6 = Flags.f146441v.d(iH0);
        Intrinsics.i(boolD6, "get(...)");
        deserializedSimpleFunctionDescriptor.e1(boolD6.booleanValue());
        Boolean boolD7 = Flags.f146442w.d(iH0);
        Intrinsics.i(boolD7, "get(...)");
        deserializedSimpleFunctionDescriptor.T0(boolD7.booleanValue());
        deserializedSimpleFunctionDescriptor.V0(!Flags.f146443x.d(iH0).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairA = this.f147328a.c().h().a(proto, deserializedSimpleFunctionDescriptor, this.f147328a.j(), deserializationContextB.i());
        if (pairA != null) {
            deserializedSimpleFunctionDescriptor.R0(pairA.c(), pairA.d());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    public final PropertyDescriptor u(ProtoBuf.Property proto) {
        DeserializationContext deserializationContext;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplD;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        boolean z10;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType kotlinTypeU;
        Intrinsics.j(proto, "proto");
        int iF0 = proto.u0() ? proto.f0() : t(proto.i0());
        DeclarationDescriptor declarationDescriptorE = this.f147328a.e();
        Annotations annotationsJ = j(proto, iF0, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f147344a;
        Modality modalityB = protoEnumFlags.b(Flags.f146424e.d(iF0));
        DescriptorVisibility descriptorVisibilityA = ProtoEnumFlagsUtilsKt.a(protoEnumFlags, Flags.f146423d.d(iF0));
        Boolean boolD = Flags.f146444y.d(iF0);
        Intrinsics.i(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        Name nameB = NameResolverUtilKt.b(this.f147328a.g(), proto.h0());
        CallableMemberDescriptor.Kind kindB = ProtoEnumFlagsUtilsKt.b(protoEnumFlags, Flags.f146435p.d(iF0));
        Boolean boolD2 = Flags.f146406C.d(iF0);
        Intrinsics.i(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = Flags.f146405B.d(iF0);
        Intrinsics.i(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = Flags.f146408E.d(iF0);
        Intrinsics.i(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = Flags.f146409F.d(iF0);
        Intrinsics.i(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = Flags.f146410G.d(iF0);
        Intrinsics.i(boolD6, "get(...)");
        int i10 = iF0;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(declarationDescriptorE, null, annotationsJ, modalityB, descriptorVisibilityA, zBooleanValue, nameB, kindB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), proto, this.f147328a.g(), this.f147328a.j(), this.f147328a.k(), this.f147328a.d());
        DeserializationContext deserializationContext2 = this.f147328a;
        List<ProtoBuf.TypeParameter> listS0 = proto.s0();
        Intrinsics.i(listS0, "getTypeParameterList(...)");
        DeserializationContext deserializationContextB = DeserializationContext.b(deserializationContext2, deserializedPropertyDescriptor, listS0, null, null, null, null, 60, null);
        Boolean boolD7 = Flags.f146445z.d(i10);
        Intrinsics.i(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        Annotations annotationsO = (zBooleanValue6 && ProtoTypeTableUtilKt.h(proto)) ? o(proto, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.f144596s3.b();
        KotlinType kotlinTypeU2 = deserializationContextB.i().u(ProtoTypeTableUtilKt.n(proto, this.f147328a.j()));
        List<TypeParameterDescriptor> listM = deserializationContextB.i().m();
        ReceiverParameterDescriptor receiverParameterDescriptorL = l();
        ProtoBuf.Type typeL = ProtoTypeTableUtilKt.l(proto, this.f147328a.j());
        ReceiverParameterDescriptor receiverParameterDescriptorI = (typeL == null || (kotlinTypeU = deserializationContextB.i().u(typeL)) == null) ? null : DescriptorFactory.i(deserializedPropertyDescriptor, kotlinTypeU, annotationsO);
        List<ProtoBuf.Type> listD = ProtoTypeTableUtilKt.d(proto, this.f147328a.j());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
        int i11 = 0;
        for (Object obj : listD) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.w();
            }
            arrayList.add(A((ProtoBuf.Type) obj, deserializationContextB, deserializedPropertyDescriptor, i11));
            i11 = i12;
        }
        deserializedPropertyDescriptor.Z0(kotlinTypeU2, listM, receiverParameterDescriptorL, receiverParameterDescriptorI, arrayList);
        Boolean boolD8 = Flags.f146422c.d(i10);
        Intrinsics.i(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.f146423d;
        ProtoBuf.Visibility visibilityD = flagField3.d(i10);
        Flags.FlagField<ProtoBuf.Modality> flagField4 = Flags.f146424e;
        int iB = Flags.b(zBooleanValue7, visibilityD, flagField4.d(i10), false, false, false);
        if (zBooleanValue6) {
            int iG0 = proto.v0() ? proto.g0() : iB;
            Boolean boolD9 = Flags.f146414K.d(iG0);
            Intrinsics.i(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = Flags.f146415L.d(iG0);
            Intrinsics.i(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = Flags.f146416M.d(iG0);
            Intrinsics.i(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            Annotations annotationsJ2 = j(proto, iG0, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue8) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.f147344a;
                flagField = flagField3;
                deserializationContext = deserializationContextB;
                flagField2 = flagField4;
                propertyGetterDescriptorImplD = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsJ2, protoEnumFlags2.b(flagField4.d(iG0)), ProtoEnumFlagsUtilsKt.a(protoEnumFlags2, flagField3.d(iG0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, deserializedPropertyDescriptor.f(), null, SourceElement.f144554a);
            } else {
                deserializationContext = deserializationContextB;
                flagField = flagField3;
                flagField2 = flagField4;
                propertyGetterDescriptorImplD = DescriptorFactory.d(deserializedPropertyDescriptor, annotationsJ2);
                Intrinsics.g(propertyGetterDescriptorImplD);
            }
            propertyGetterDescriptorImplD.N0(deserializedPropertyDescriptor.getReturnType());
        } else {
            deserializationContext = deserializationContextB;
            flagField = flagField3;
            flagField2 = flagField4;
            propertyGetterDescriptorImplD = null;
        }
        if (Flags.f146404A.d(i10).booleanValue()) {
            if (proto.C0()) {
                iB = proto.n0();
            }
            int i13 = iB;
            Boolean boolD12 = Flags.f146414K.d(i13);
            Intrinsics.i(boolD12, "get(...)");
            boolean zBooleanValue11 = boolD12.booleanValue();
            Boolean boolD13 = Flags.f146415L.d(i13);
            Intrinsics.i(boolD13, "get(...)");
            boolean zBooleanValue12 = boolD13.booleanValue();
            Boolean boolD14 = Flags.f146416M.d(i13);
            Intrinsics.i(boolD14, "get(...)");
            boolean zBooleanValue13 = boolD14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotationsJ3 = j(proto, i13, annotatedCallableKind);
            if (zBooleanValue11) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.f147344a;
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplD;
                z10 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotationsJ3, protoEnumFlags3.b(flagField2.d(i13)), ProtoEnumFlagsUtilsKt.a(protoEnumFlags3, flagField.d(i13)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, deserializedPropertyDescriptor.f(), null, SourceElement.f144554a);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.O0((ValueParameterDescriptor) CollectionsKt.U0(DeserializationContext.b(deserializationContext, propertySetterDescriptorImpl2, CollectionsKt.m(), null, null, null, null, 60, null).f().B(CollectionsKt.e(proto.o0()), proto, annotatedCallableKind)));
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplD;
                z10 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImplE = DescriptorFactory.e(deserializedPropertyDescriptor, annotationsJ3, Annotations.f144596s3.b());
                Intrinsics.g(propertySetterDescriptorImplE);
                propertySetterDescriptorImpl = propertySetterDescriptorImplE;
            }
        } else {
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplD;
            z10 = true;
            propertySetterDescriptorImpl = null;
        }
        if (Flags.f146407D.d(i10).booleanValue()) {
            deserializedPropertyDescriptor.J0(new e(this, proto, deserializedPropertyDescriptor));
        }
        DeclarationDescriptor declarationDescriptorE2 = this.f147328a.e();
        ClassDescriptor classDescriptor = declarationDescriptorE2 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE2 : null;
        if ((classDescriptor != null ? classDescriptor.f() : null) == ClassKind.f144496f) {
            deserializedPropertyDescriptor.J0(new f(this, proto, deserializedPropertyDescriptor));
        }
        deserializedPropertyDescriptor.T0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, new FieldDescriptorImpl(m(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(m(proto, z10), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    public final TypeAliasDescriptor z(ProtoBuf.TypeAlias proto) {
        Intrinsics.j(proto, "proto");
        Annotations.Companion companion = Annotations.f144596s3;
        List<ProtoBuf.Annotation> listT = proto.T();
        Intrinsics.i(listT, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = listT;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            AnnotationDeserializer annotationDeserializer = this.f147329b;
            Intrinsics.g(annotation);
            arrayList.add(annotationDeserializer.a(annotation, this.f147328a.g()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f147328a.h(), this.f147328a.e(), companion.a(arrayList), NameResolverUtilKt.b(this.f147328a.g(), proto.b0()), ProtoEnumFlagsUtilsKt.a(ProtoEnumFlags.f147344a, Flags.f146423d.d(proto.a0())), proto, this.f147328a.g(), this.f147328a.j(), this.f147328a.k(), this.f147328a.d());
        DeserializationContext deserializationContext = this.f147328a;
        List<ProtoBuf.TypeParameter> listE0 = proto.e0();
        Intrinsics.i(listE0, "getTypeParameterList(...)");
        DeserializationContext deserializationContextB = DeserializationContext.b(deserializationContext, deserializedTypeAliasDescriptor, listE0, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.T0(deserializationContextB.i().m(), deserializationContextB.i().o(ProtoTypeTableUtilKt.r(proto, this.f147328a.j()), false), deserializationContextB.i().o(ProtoTypeTableUtilKt.e(proto, this.f147328a.j()), false));
        return deserializedTypeAliasDescriptor;
    }

    private final ReceiverParameterDescriptor A(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i10) {
        return DescriptorFactory.b(callableDescriptor, deserializationContext.i().u(type), null, Annotations.f144596s3.b(), i10);
    }

    private final void q(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.l1(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }
}

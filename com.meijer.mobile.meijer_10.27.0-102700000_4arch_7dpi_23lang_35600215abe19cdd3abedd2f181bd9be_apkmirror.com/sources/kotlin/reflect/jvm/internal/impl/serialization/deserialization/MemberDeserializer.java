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
/* loaded from: classes13.dex */
public final class MemberDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializationContext f146421a;

    /* renamed from: b, reason: collision with root package name */
    private final AnnotationDeserializer f146422b;

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    public MemberDeserializer(DeserializationContext c10) {
        Intrinsics.j(c10, "c");
        this.f146421a = c10;
        this.f146422b = new AnnotationDeserializer(c10.c().q(), c10.c().r());
    }

    private final List<ValueParameterDescriptor> B(List<ProtoBuf.ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        DeclarationDescriptor declarationDescriptorE = this.f146421a.e();
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
            Annotations annotationsB = (protoContainerI == null || !Flags.f145515c.d(iL).booleanValue()) ? Annotations.f143689s3.b() : new NonEmptyDeserializedAnnotations(this.f146421a.h(), new j(this, protoContainerI, messageLite, annotatedCallableKind, i10, valueParameter));
            Name nameB = NameResolverUtilKt.b(this.f146421a.g(), valueParameter.M());
            KotlinType kotlinTypeU = this.f146421a.i().u(ProtoTypeTableUtilKt.q(valueParameter, this.f146421a.j()));
            Boolean boolD = Flags.f145504H.d(iL);
            Intrinsics.i(boolD, "get(...)");
            boolean zBooleanValue = boolD.booleanValue();
            Boolean boolD2 = Flags.f145505I.d(iL);
            Intrinsics.i(boolD2, "get(...)");
            boolean zBooleanValue2 = boolD2.booleanValue();
            Boolean boolD3 = Flags.f145506J.d(iL);
            Intrinsics.i(boolD3, "get(...)");
            boolean zBooleanValue3 = boolD3.booleanValue();
            ProtoBuf.Type typeT = ProtoTypeTableUtilKt.t(valueParameter, this.f146421a.j());
            KotlinType kotlinTypeU2 = typeT != null ? this.f146421a.i().u(typeT) : null;
            SourceElement NO_SOURCE = SourceElement.f143647a;
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
        return CollectionsKt.j1(memberDeserializer.f146421a.c().d().a(protoContainer, messageLite, annotatedCallableKind, i10, valueParameter));
    }

    private final ProtoContainer i(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).e(), this.f146421a.g(), this.f146421a.j(), this.f146421a.d());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).f1();
        }
        return null;
    }

    private final Annotations j(MessageLite messageLite, int i10, AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.f145515c.d(i10).booleanValue() ? Annotations.f143689s3.b() : new NonEmptyDeserializedAnnotations(this.f146421a.h(), new g(this, messageLite, annotatedCallableKind));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f146421a.e());
        List listJ1 = protoContainerI != null ? CollectionsKt.j1(memberDeserializer.f146421a.c().d().e(protoContainerI, messageLite, annotatedCallableKind)) : null;
        return listJ1 == null ? CollectionsKt.m() : listJ1;
    }

    private final ReceiverParameterDescriptor l() {
        DeclarationDescriptor declarationDescriptorE = this.f146421a.e();
        ClassDescriptor classDescriptor = declarationDescriptorE instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE : null;
        if (classDescriptor != null) {
            return classDescriptor.G0();
        }
        return null;
    }

    private final Annotations m(ProtoBuf.Property property, boolean z10) {
        return !Flags.f145515c.d(property.f0()).booleanValue() ? Annotations.f143689s3.b() : new NonEmptyDeserializedAnnotations(this.f146421a.h(), new h(this, z10, property));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(MemberDeserializer memberDeserializer, boolean z10, ProtoBuf.Property property) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f146421a.e());
        List listJ1 = protoContainerI != null ? z10 ? CollectionsKt.j1(memberDeserializer.f146421a.c().d().l(protoContainerI, property)) : CollectionsKt.j1(memberDeserializer.f146421a.c().d().j(protoContainerI, property)) : null;
        return listJ1 == null ? CollectionsKt.m() : listJ1;
    }

    private final Annotations o(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f146421a.h(), new i(this, messageLite, annotatedCallableKind));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f146421a.e());
        List<AnnotationDescriptor> listK = protoContainerI != null ? memberDeserializer.f146421a.c().d().k(protoContainerI, messageLite, annotatedCallableKind) : null;
        return listK == null ? CollectionsKt.m() : listK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue v(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f146421a.h().e(new k(memberDeserializer, property, deserializedPropertyDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue w(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f146421a.e());
        Intrinsics.g(protoContainerI);
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoaderD = memberDeserializer.f146421a.c().d();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        Intrinsics.i(returnType, "getReturnType(...)");
        return annotationAndConstantLoaderD.h(protoContainerI, property, returnType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue x(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f146421a.h().e(new l(memberDeserializer, property, deserializedPropertyDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue y(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerI = memberDeserializer.i(memberDeserializer.f146421a.e());
        Intrinsics.g(protoContainerI);
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoaderD = memberDeserializer.f146421a.c().d();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        Intrinsics.i(returnType, "getReturnType(...)");
        return annotationAndConstantLoaderD.f(protoContainerI, property, returnType);
    }

    public final ClassConstructorDescriptor r(ProtoBuf.Constructor proto, boolean z10) {
        Intrinsics.j(proto, "proto");
        DeclarationDescriptor declarationDescriptorE = this.f146421a.e();
        Intrinsics.h(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorE;
        int iO = proto.O();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, j(proto, iO, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f146421a.g(), this.f146421a.j(), this.f146421a.k(), this.f146421a.d(), null, 1024, null);
        MemberDeserializer memberDeserializerF = DeserializationContext.b(this.f146421a, deserializedClassConstructorDescriptor, CollectionsKt.m(), null, null, null, null, 60, null).f();
        List<ProtoBuf.ValueParameter> listR = proto.R();
        Intrinsics.i(listR, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.n1(memberDeserializerF.B(listR, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.a(ProtoEnumFlags.f146437a, Flags.f145516d.d(proto.O())));
        deserializedClassConstructorDescriptor.d1(classDescriptor.o());
        deserializedClassConstructorDescriptor.T0(classDescriptor.h0());
        deserializedClassConstructorDescriptor.V0(!Flags.f145527o.d(proto.O()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    public final SimpleFunctionDescriptor s(ProtoBuf.Function proto) {
        KotlinType kotlinTypeU;
        Intrinsics.j(proto, "proto");
        int iH0 = proto.y0() ? proto.h0() : t(proto.j0());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotationsJ = j(proto, iH0, annotatedCallableKind);
        Annotations annotationsO = ProtoTypeTableUtilKt.g(proto) ? o(proto, annotatedCallableKind) : Annotations.f143689s3.b();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f146421a.e(), null, annotationsJ, NameResolverUtilKt.b(this.f146421a.g(), proto.i0()), ProtoEnumFlagsUtilsKt.b(ProtoEnumFlags.f146437a, Flags.f145528p.d(iH0)), proto, this.f146421a.g(), this.f146421a.j(), Intrinsics.e(DescriptorUtilsKt.o(this.f146421a.e()).b(NameResolverUtilKt.b(this.f146421a.g(), proto.i0())), SuspendFunctionTypeUtilKt.f146438a) ? VersionRequirementTable.f145550b.b() : this.f146421a.k(), this.f146421a.d(), null, 1024, null);
        DeserializationContext deserializationContext = this.f146421a;
        List<ProtoBuf.TypeParameter> listR0 = proto.r0();
        Intrinsics.i(listR0, "getTypeParameterList(...)");
        DeserializationContext deserializationContextB = DeserializationContext.b(deserializationContext, deserializedSimpleFunctionDescriptor, listR0, null, null, null, null, 60, null);
        ProtoBuf.Type typeK = ProtoTypeTableUtilKt.k(proto, this.f146421a.j());
        ReceiverParameterDescriptor receiverParameterDescriptorI = (typeK == null || (kotlinTypeU = deserializationContextB.i().u(typeK)) == null) ? null : DescriptorFactory.i(deserializedSimpleFunctionDescriptor, kotlinTypeU, annotationsO);
        ReceiverParameterDescriptor receiverParameterDescriptorL = l();
        List<ProtoBuf.Type> listC = ProtoTypeTableUtilKt.c(proto, this.f146421a.j());
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
        KotlinType kotlinTypeU2 = deserializationContextB.i().u(ProtoTypeTableUtilKt.m(proto, this.f146421a.j()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f146437a;
        q(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorI, receiverParameterDescriptorL, arrayList, listM, listB, kotlinTypeU2, protoEnumFlags.b(Flags.f145517e.d(iH0)), ProtoEnumFlagsUtilsKt.a(protoEnumFlags, Flags.f145516d.d(iH0)), MapsKt.k());
        Boolean boolD = Flags.f145529q.d(iH0);
        Intrinsics.i(boolD, "get(...)");
        deserializedSimpleFunctionDescriptor.c1(boolD.booleanValue());
        Boolean boolD2 = Flags.f145530r.d(iH0);
        Intrinsics.i(boolD2, "get(...)");
        deserializedSimpleFunctionDescriptor.Z0(boolD2.booleanValue());
        Boolean boolD3 = Flags.f145533u.d(iH0);
        Intrinsics.i(boolD3, "get(...)");
        deserializedSimpleFunctionDescriptor.U0(boolD3.booleanValue());
        Boolean boolD4 = Flags.f145531s.d(iH0);
        Intrinsics.i(boolD4, "get(...)");
        deserializedSimpleFunctionDescriptor.b1(boolD4.booleanValue());
        Boolean boolD5 = Flags.f145532t.d(iH0);
        Intrinsics.i(boolD5, "get(...)");
        deserializedSimpleFunctionDescriptor.f1(boolD5.booleanValue());
        Boolean boolD6 = Flags.f145534v.d(iH0);
        Intrinsics.i(boolD6, "get(...)");
        deserializedSimpleFunctionDescriptor.e1(boolD6.booleanValue());
        Boolean boolD7 = Flags.f145535w.d(iH0);
        Intrinsics.i(boolD7, "get(...)");
        deserializedSimpleFunctionDescriptor.T0(boolD7.booleanValue());
        deserializedSimpleFunctionDescriptor.V0(!Flags.f145536x.d(iH0).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairA = this.f146421a.c().h().a(proto, deserializedSimpleFunctionDescriptor, this.f146421a.j(), deserializationContextB.i());
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
        DeclarationDescriptor declarationDescriptorE = this.f146421a.e();
        Annotations annotationsJ = j(proto, iF0, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f146437a;
        Modality modalityB = protoEnumFlags.b(Flags.f145517e.d(iF0));
        DescriptorVisibility descriptorVisibilityA = ProtoEnumFlagsUtilsKt.a(protoEnumFlags, Flags.f145516d.d(iF0));
        Boolean boolD = Flags.f145537y.d(iF0);
        Intrinsics.i(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        Name nameB = NameResolverUtilKt.b(this.f146421a.g(), proto.h0());
        CallableMemberDescriptor.Kind kindB = ProtoEnumFlagsUtilsKt.b(protoEnumFlags, Flags.f145528p.d(iF0));
        Boolean boolD2 = Flags.f145499C.d(iF0);
        Intrinsics.i(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = Flags.f145498B.d(iF0);
        Intrinsics.i(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = Flags.f145501E.d(iF0);
        Intrinsics.i(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = Flags.f145502F.d(iF0);
        Intrinsics.i(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = Flags.f145503G.d(iF0);
        Intrinsics.i(boolD6, "get(...)");
        int i10 = iF0;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(declarationDescriptorE, null, annotationsJ, modalityB, descriptorVisibilityA, zBooleanValue, nameB, kindB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), proto, this.f146421a.g(), this.f146421a.j(), this.f146421a.k(), this.f146421a.d());
        DeserializationContext deserializationContext2 = this.f146421a;
        List<ProtoBuf.TypeParameter> listS0 = proto.s0();
        Intrinsics.i(listS0, "getTypeParameterList(...)");
        DeserializationContext deserializationContextB = DeserializationContext.b(deserializationContext2, deserializedPropertyDescriptor, listS0, null, null, null, null, 60, null);
        Boolean boolD7 = Flags.f145538z.d(i10);
        Intrinsics.i(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        Annotations annotationsO = (zBooleanValue6 && ProtoTypeTableUtilKt.h(proto)) ? o(proto, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.f143689s3.b();
        KotlinType kotlinTypeU2 = deserializationContextB.i().u(ProtoTypeTableUtilKt.n(proto, this.f146421a.j()));
        List<TypeParameterDescriptor> listM = deserializationContextB.i().m();
        ReceiverParameterDescriptor receiverParameterDescriptorL = l();
        ProtoBuf.Type typeL = ProtoTypeTableUtilKt.l(proto, this.f146421a.j());
        ReceiverParameterDescriptor receiverParameterDescriptorI = (typeL == null || (kotlinTypeU = deserializationContextB.i().u(typeL)) == null) ? null : DescriptorFactory.i(deserializedPropertyDescriptor, kotlinTypeU, annotationsO);
        List<ProtoBuf.Type> listD = ProtoTypeTableUtilKt.d(proto, this.f146421a.j());
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
        Boolean boolD8 = Flags.f145515c.d(i10);
        Intrinsics.i(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.f145516d;
        ProtoBuf.Visibility visibilityD = flagField3.d(i10);
        Flags.FlagField<ProtoBuf.Modality> flagField4 = Flags.f145517e;
        int iB = Flags.b(zBooleanValue7, visibilityD, flagField4.d(i10), false, false, false);
        if (zBooleanValue6) {
            int iG0 = proto.v0() ? proto.g0() : iB;
            Boolean boolD9 = Flags.f145507K.d(iG0);
            Intrinsics.i(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = Flags.f145508L.d(iG0);
            Intrinsics.i(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = Flags.f145509M.d(iG0);
            Intrinsics.i(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            Annotations annotationsJ2 = j(proto, iG0, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue8) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.f146437a;
                flagField = flagField3;
                deserializationContext = deserializationContextB;
                flagField2 = flagField4;
                propertyGetterDescriptorImplD = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsJ2, protoEnumFlags2.b(flagField4.d(iG0)), ProtoEnumFlagsUtilsKt.a(protoEnumFlags2, flagField3.d(iG0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, deserializedPropertyDescriptor.f(), null, SourceElement.f143647a);
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
        if (Flags.f145497A.d(i10).booleanValue()) {
            if (proto.C0()) {
                iB = proto.n0();
            }
            int i13 = iB;
            Boolean boolD12 = Flags.f145507K.d(i13);
            Intrinsics.i(boolD12, "get(...)");
            boolean zBooleanValue11 = boolD12.booleanValue();
            Boolean boolD13 = Flags.f145508L.d(i13);
            Intrinsics.i(boolD13, "get(...)");
            boolean zBooleanValue12 = boolD13.booleanValue();
            Boolean boolD14 = Flags.f145509M.d(i13);
            Intrinsics.i(boolD14, "get(...)");
            boolean zBooleanValue13 = boolD14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotationsJ3 = j(proto, i13, annotatedCallableKind);
            if (zBooleanValue11) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.f146437a;
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplD;
                z10 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotationsJ3, protoEnumFlags3.b(flagField2.d(i13)), ProtoEnumFlagsUtilsKt.a(protoEnumFlags3, flagField.d(i13)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, deserializedPropertyDescriptor.f(), null, SourceElement.f143647a);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.O0((ValueParameterDescriptor) CollectionsKt.U0(DeserializationContext.b(deserializationContext, propertySetterDescriptorImpl2, CollectionsKt.m(), null, null, null, null, 60, null).f().B(CollectionsKt.e(proto.o0()), proto, annotatedCallableKind)));
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplD;
                z10 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImplE = DescriptorFactory.e(deserializedPropertyDescriptor, annotationsJ3, Annotations.f143689s3.b());
                Intrinsics.g(propertySetterDescriptorImplE);
                propertySetterDescriptorImpl = propertySetterDescriptorImplE;
            }
        } else {
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplD;
            z10 = true;
            propertySetterDescriptorImpl = null;
        }
        if (Flags.f145500D.d(i10).booleanValue()) {
            deserializedPropertyDescriptor.J0(new e(this, proto, deserializedPropertyDescriptor));
        }
        DeclarationDescriptor declarationDescriptorE2 = this.f146421a.e();
        ClassDescriptor classDescriptor = declarationDescriptorE2 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE2 : null;
        if ((classDescriptor != null ? classDescriptor.f() : null) == ClassKind.f143589f) {
            deserializedPropertyDescriptor.J0(new f(this, proto, deserializedPropertyDescriptor));
        }
        deserializedPropertyDescriptor.T0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, new FieldDescriptorImpl(m(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(m(proto, z10), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    public final TypeAliasDescriptor z(ProtoBuf.TypeAlias proto) {
        Intrinsics.j(proto, "proto");
        Annotations.Companion companion = Annotations.f143689s3;
        List<ProtoBuf.Annotation> listT = proto.T();
        Intrinsics.i(listT, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = listT;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            AnnotationDeserializer annotationDeserializer = this.f146422b;
            Intrinsics.g(annotation);
            arrayList.add(annotationDeserializer.a(annotation, this.f146421a.g()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f146421a.h(), this.f146421a.e(), companion.a(arrayList), NameResolverUtilKt.b(this.f146421a.g(), proto.b0()), ProtoEnumFlagsUtilsKt.a(ProtoEnumFlags.f146437a, Flags.f145516d.d(proto.a0())), proto, this.f146421a.g(), this.f146421a.j(), this.f146421a.k(), this.f146421a.d());
        DeserializationContext deserializationContext = this.f146421a;
        List<ProtoBuf.TypeParameter> listE0 = proto.e0();
        Intrinsics.i(listE0, "getTypeParameterList(...)");
        DeserializationContext deserializationContextB = DeserializationContext.b(deserializationContext, deserializedTypeAliasDescriptor, listE0, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.T0(deserializationContextB.i().m(), deserializationContextB.i().o(ProtoTypeTableUtilKt.r(proto, this.f146421a.j()), false), deserializationContextB.i().o(ProtoTypeTableUtilKt.e(proto, this.f146421a.j()), false));
        return deserializedTypeAliasDescriptor;
    }

    private final ReceiverParameterDescriptor A(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i10) {
        return DescriptorFactory.b(callableDescriptor, deserializationContext.i().u(type), null, Annotations.f143689s3.b(), i10);
    }

    private final void q(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.l1(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }
}

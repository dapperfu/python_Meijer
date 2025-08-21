package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TypeDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializationContext f147347a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeDeserializer f147348b;

    /* renamed from: c, reason: collision with root package name */
    private final String f147349c;

    /* renamed from: d, reason: collision with root package name */
    private final String f147350d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1<Integer, ClassifierDescriptor> f147351e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1<Integer, ClassifierDescriptor> f147352f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, TypeParameterDescriptor> f147353g;

    public TypeDeserializer(DeserializationContext c10, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> typeParameterProtos, String debugName, String containerPresentableName) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        Intrinsics.j(c10, "c");
        Intrinsics.j(typeParameterProtos, "typeParameterProtos");
        Intrinsics.j(debugName, "debugName");
        Intrinsics.j(containerPresentableName, "containerPresentableName");
        this.f147347a = c10;
        this.f147348b = typeDeserializer;
        this.f147349c = debugName;
        this.f147350d = containerPresentableName;
        this.f147351e = c10.h().g(new m(this));
        this.f147352f = c10.h().g(new n(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = MapsKt.k();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i10 = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.N()), new DeserializedTypeParameterDescriptor(this.f147347a, typeParameter, i10));
                i10++;
            }
        }
        this.f147353g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(ProtoBuf.Type it) {
        Intrinsics.j(it, "it");
        return it.V();
    }

    private final ClassifierDescriptor g(int i10) {
        ClassId classIdA = NameResolverUtilKt.a(this.f147347a.g(), i10);
        return classIdA.i() ? this.f147347a.c().b(classIdA) : FindClassInModuleKt.c(this.f147347a.c().q(), classIdA);
    }

    private final SimpleType h(int i10) {
        if (NameResolverUtilKt.a(this.f147347a.g(), i10).i()) {
            return this.f147347a.c().o().a();
        }
        return null;
    }

    private final ClassifierDescriptor i(int i10) {
        ClassId classIdA = NameResolverUtilKt.a(this.f147347a.g(), i10);
        if (classIdA.i()) {
            return null;
        }
        return FindClassInModuleKt.f(this.f147347a.c().q(), classIdA);
    }

    private final SimpleType l(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z10) {
        SimpleType simpleTypeK = KotlinTypeFactory.k(typeAttributes, typeConstructor, list, z10, null, 16, null);
        if (FunctionTypesKt.q(simpleTypeK)) {
            return t(simpleTypeK);
        }
        return null;
    }

    private final TypeParameterDescriptor n(int i10) {
        TypeParameterDescriptor typeParameterDescriptor = this.f147353g.get(Integer.valueOf(i10));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.f147348b;
        if (typeDeserializer != null) {
            return typeDeserializer.n(i10);
        }
        return null;
    }

    public static /* synthetic */ SimpleType q(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return typeDeserializer.o(type, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        return typeDeserializer.f147347a.c().d().c(type, typeDeserializer.f147347a.g());
    }

    private final TypeAttributes s(List<? extends TypeAttributeTranslator> list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List<? extends TypeAttributeTranslator> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).a(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.f147647b.j(CollectionsKt.z(arrayList));
    }

    private static final ClassDescriptor y(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i10) {
        ClassId classIdA = NameResolverUtilKt.a(typeDeserializer.f147347a.g(), i10);
        List<Integer> listY = SequencesKt.Y(SequencesKt.M(SequencesKt.q(type, new p(typeDeserializer)), q.f147534a));
        int iZ = SequencesKt.z(SequencesKt.q(classIdA, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.a
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).e();
            }
        }));
        while (listY.size() < iZ) {
            listY.add(0);
        }
        return typeDeserializer.f147347a.c().r().d(classIdA, listY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoBuf.Type z(TypeDeserializer typeDeserializer, ProtoBuf.Type it) {
        Intrinsics.j(it, "it");
        return ProtoTypeTableUtilKt.j(it, typeDeserializer.f147347a.j());
    }

    public final List<TypeParameterDescriptor> m() {
        return CollectionsKt.j1(this.f147353g.values());
    }

    public final SimpleType o(ProtoBuf.Type proto, boolean z10) {
        SimpleType simpleTypeC;
        SimpleType simpleTypeJ;
        Intrinsics.j(proto, "proto");
        SimpleType simpleTypeH = proto.m0() ? h(proto.X()) : proto.v0() ? h(proto.h0()) : null;
        if (simpleTypeH != null) {
            return simpleTypeH;
        }
        TypeConstructor typeConstructorX = x(proto);
        if (ErrorUtils.m(typeConstructorX.d())) {
            return ErrorUtils.f147897a.c(ErrorTypeKind.f147882t0, typeConstructorX, typeConstructorX.toString());
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f147347a.h(), new o(this, proto));
        TypeAttributes typeAttributesS = s(this.f147347a.c().v(), deserializedAnnotations, typeConstructorX, this.f147347a.e());
        List<ProtoBuf.Type.Argument> listP = p(proto, this);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP, 10));
        int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            List<TypeParameterDescriptor> parameters = typeConstructorX.getParameters();
            Intrinsics.i(parameters, "getParameters(...)");
            arrayList.add(w((TypeParameterDescriptor) CollectionsKt.v0(parameters, i10), (ProtoBuf.Type.Argument) obj));
            i10 = i11;
        }
        List<? extends TypeProjection> listJ1 = CollectionsKt.j1(arrayList);
        ClassifierDescriptor classifierDescriptorD = typeConstructorX.d();
        if (z10 && (classifierDescriptorD instanceof TypeAliasDescriptor)) {
            SimpleType simpleTypeC2 = KotlinTypeFactory.c((TypeAliasDescriptor) classifierDescriptorD, listJ1);
            simpleTypeC = simpleTypeC2.R0(KotlinTypeKt.b(simpleTypeC2) || proto.e0()).Q0(s(this.f147347a.c().v(), Annotations.f144596s3.a(CollectionsKt.N0(deserializedAnnotations, simpleTypeC2.getAnnotations())), typeConstructorX, this.f147347a.e()));
        } else if (Flags.f146420a.d(proto.a0()).booleanValue()) {
            simpleTypeC = k(typeAttributesS, typeConstructorX, listJ1, proto.e0());
        } else {
            SimpleType simpleTypeK = KotlinTypeFactory.k(typeAttributesS, typeConstructorX, listJ1, proto.e0(), null, 16, null);
            if (Flags.f146421b.d(proto.a0()).booleanValue()) {
                simpleTypeC = DefinitelyNotNullType.Companion.c(DefinitelyNotNullType.f147594d, simpleTypeK, true, false, 4, null);
                if (simpleTypeC == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeK + '\'').toString());
                }
            } else {
                simpleTypeC = simpleTypeK;
            }
        }
        ProtoBuf.Type typeA = ProtoTypeTableUtilKt.a(proto, this.f147347a.j());
        return (typeA == null || (simpleTypeJ = SpecialTypesKt.j(simpleTypeC, o(typeA, false))) == null) ? simpleTypeC : simpleTypeJ;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f147349c);
        if (this.f147348b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f147348b.f147349c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final KotlinType u(ProtoBuf.Type proto) {
        Intrinsics.j(proto, "proto");
        if (!proto.o0()) {
            return o(proto, true);
        }
        String string = this.f147347a.g().getString(proto.b0());
        SimpleType simpleTypeQ = q(this, proto, false, 2, null);
        ProtoBuf.Type typeF = ProtoTypeTableUtilKt.f(proto, this.f147347a.j());
        Intrinsics.g(typeF);
        return this.f147347a.c().m().a(proto, string, simpleTypeQ, q(this, typeF, false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassifierDescriptor f(TypeDeserializer typeDeserializer, int i10) {
        return typeDeserializer.g(i10);
    }

    private final SimpleType j(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns kotlinBuiltInsN = TypeUtilsKt.n(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType kotlinTypeK = FunctionTypesKt.k(kotlinType);
        List<KotlinType> listE = FunctionTypesKt.e(kotlinType);
        List listK0 = CollectionsKt.k0(FunctionTypesKt.m(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.b(kotlinBuiltInsN, annotations, kotlinTypeK, listE, arrayList, null, kotlinType2, true).R0(kotlinType.L0());
    }

    private final SimpleType k(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z10) {
        List<? extends TypeProjection> list2;
        SimpleType simpleTypeL;
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        if (size2 != 0) {
            simpleTypeL = null;
            if (size2 != 1 || (size = list.size() - 1) < 0) {
                list2 = list;
            } else {
                TypeConstructor typeConstructorI = typeConstructor.l().Y(size).i();
                Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
                list2 = list;
                simpleTypeL = KotlinTypeFactory.k(typeAttributes, typeConstructorI, list2, z10, null, 16, null);
            }
        } else {
            list2 = list;
            simpleTypeL = l(typeAttributes, typeConstructor, list2, z10);
        }
        if (simpleTypeL == null) {
            return ErrorUtils.f147897a.f(ErrorTypeKind.f147833O, list2, typeConstructor, new String[0]);
        }
        return simpleTypeL;
    }

    private static final List<ProtoBuf.Type.Argument> p(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> listM;
        List<ProtoBuf.Type.Argument> listW = type.W();
        Intrinsics.i(listW, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = listW;
        ProtoBuf.Type typeJ = ProtoTypeTableUtilKt.j(type, typeDeserializer.f147347a.j());
        if (typeJ != null) {
            listM = p(typeJ, typeDeserializer);
        } else {
            listM = null;
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return CollectionsKt.P0(list, listM);
    }

    private final SimpleType t(KotlinType kotlinType) {
        KotlinType type;
        FqName fqNameO;
        CallableDescriptor callableDescriptor;
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.F0(FunctionTypesKt.m(kotlinType));
        FqName fqNameK = null;
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorD = type.K0().d();
        if (classifierDescriptorD != null) {
            fqNameO = DescriptorUtilsKt.o(classifierDescriptorD);
        } else {
            fqNameO = null;
        }
        if (type.I0().size() == 1 && (Intrinsics.e(fqNameO, StandardNames.f144222v) || Intrinsics.e(fqNameO, TypeDeserializerKt.f147355a))) {
            KotlinType type2 = ((TypeProjection) CollectionsKt.U0(type.I0())).getType();
            Intrinsics.i(type2, "getType(...)");
            DeclarationDescriptor declarationDescriptorE = this.f147347a.e();
            if (declarationDescriptorE instanceof CallableDescriptor) {
                callableDescriptor = (CallableDescriptor) declarationDescriptorE;
            } else {
                callableDescriptor = null;
            }
            if (callableDescriptor != null) {
                fqNameK = DescriptorUtilsKt.k(callableDescriptor);
            }
            if (Intrinsics.e(fqNameK, SuspendFunctionTypeUtilKt.f147345a)) {
                return j(kotlinType, type2);
            }
            return j(kotlinType, type2);
        }
        return (SimpleType) kotlinType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassifierDescriptor v(TypeDeserializer typeDeserializer, int i10) {
        return typeDeserializer.i(i10);
    }

    private final TypeProjection w(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.y() == ProtoBuf.Type.Argument.Projection.STAR) {
            if (typeParameterDescriptor == null) {
                return new StarProjectionForAbsentTypeParameter(this.f147347a.c().q().l());
            }
            return new StarProjectionImpl(typeParameterDescriptor);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f147344a;
        ProtoBuf.Type.Argument.Projection projectionY = argument.y();
        Intrinsics.i(projectionY, "getProjection(...)");
        Variance varianceC = protoEnumFlags.c(projectionY);
        ProtoBuf.Type typeP = ProtoTypeTableUtilKt.p(argument, this.f147347a.j());
        if (typeP == null) {
            return new TypeProjectionImpl(ErrorUtils.d(ErrorTypeKind.f147892y0, argument.toString()));
        }
        return new TypeProjectionImpl(varianceC, u(typeP));
    }

    private final TypeConstructor x(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptorInvoke;
        Object next;
        if (type.m0()) {
            classifierDescriptorInvoke = this.f147351e.invoke(Integer.valueOf(type.X()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = y(this, type, type.X());
            }
        } else if (type.w0()) {
            classifierDescriptorInvoke = n(type.i0());
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.f147897a.e(ErrorTypeKind.f147831M, String.valueOf(type.i0()), this.f147350d);
            }
        } else if (type.x0()) {
            String string = this.f147347a.g().getString(type.j0());
            Iterator<T> it = m().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.e(((TypeParameterDescriptor) next).getName().b(), string)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            classifierDescriptorInvoke = (TypeParameterDescriptor) next;
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.f147897a.e(ErrorTypeKind.f147832N, string, this.f147347a.e().toString());
            }
        } else if (type.v0()) {
            classifierDescriptorInvoke = this.f147352f.invoke(Integer.valueOf(type.h0()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = y(this, type, type.h0());
            }
        } else {
            return ErrorUtils.f147897a.e(ErrorTypeKind.f147835Q, new String[0]);
        }
        TypeConstructor typeConstructorI = classifierDescriptorInvoke.i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        return typeConstructorI;
    }
}

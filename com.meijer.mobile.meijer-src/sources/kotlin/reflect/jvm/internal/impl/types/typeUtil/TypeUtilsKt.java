package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TypeUtilsKt {
    @JvmOverloads
    public static final boolean p(TypeParameterDescriptor typeParameter) {
        Intrinsics.j(typeParameter, "typeParameter");
        return r(typeParameter, null, null, 6, null);
    }

    public static final KotlinType A(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        KotlinType kotlinTypeN = TypeUtils.n(kotlinType);
        Intrinsics.i(kotlinTypeN, "makeNotNullable(...)");
        return kotlinTypeN;
    }

    public static final KotlinType B(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        KotlinType kotlinTypeO = TypeUtils.o(kotlinType);
        Intrinsics.i(kotlinTypeO, "makeNullable(...)");
        return kotlinTypeO;
    }

    public static final KotlinType C(KotlinType kotlinType, Annotations newAnnotations) {
        Intrinsics.j(kotlinType, "<this>");
        Intrinsics.j(newAnnotations, "newAnnotations");
        return (kotlinType.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? kotlinType : kotlinType.N0().Q0(TypeAttributesKt.a(kotlinType.J0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    public static final KotlinType D(KotlinType kotlinType) {
        SimpleType simpleTypeF;
        Intrinsics.j(kotlinType, "<this>");
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (unwrappedTypeN0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeN0;
            SimpleType simpleTypeS0 = flexibleType.S0();
            if (!simpleTypeS0.K0().getParameters().isEmpty() && simpleTypeS0.K0().d() != null) {
                List<TypeParameterDescriptor> parameters = simpleTypeS0.K0().getParameters();
                Intrinsics.i(parameters, "getParameters(...)");
                List<TypeParameterDescriptor> list = parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                simpleTypeS0 = TypeSubstitutionKt.f(simpleTypeS0, arrayList, null, 2, null);
            }
            SimpleType simpleTypeT0 = flexibleType.T0();
            if (!simpleTypeT0.K0().getParameters().isEmpty() && simpleTypeT0.K0().d() != null) {
                List<TypeParameterDescriptor> parameters2 = simpleTypeT0.K0().getParameters();
                Intrinsics.i(parameters2, "getParameters(...)");
                List<TypeParameterDescriptor> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                simpleTypeT0 = TypeSubstitutionKt.f(simpleTypeT0, arrayList2, null, 2, null);
            }
            simpleTypeF = KotlinTypeFactory.e(simpleTypeS0, simpleTypeT0);
        } else {
            if (!(unwrappedTypeN0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeN0;
            boolean zIsEmpty = simpleType.K0().getParameters().isEmpty();
            simpleTypeF = simpleType;
            if (!zIsEmpty) {
                ClassifierDescriptor classifierDescriptorD = simpleType.K0().d();
                simpleTypeF = simpleType;
                if (classifierDescriptorD != null) {
                    List<TypeParameterDescriptor> parameters3 = simpleType.K0().getParameters();
                    Intrinsics.i(parameters3, "getParameters(...)");
                    List<TypeParameterDescriptor> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                    }
                    simpleTypeF = TypeSubstitutionKt.f(simpleType, arrayList3, null, 2, null);
                }
            }
        }
        return TypeWithEnhancementKt.b(simpleTypeF, unwrappedTypeN0);
    }

    public static final boolean E(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return e(kotlinType, c.f147945a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(UnwrappedType it) {
        Intrinsics.j(it, "it");
        ClassifierDescriptor classifierDescriptorD = it.K0().d();
        if (classifierDescriptorD != null) {
            return (classifierDescriptorD instanceof TypeAliasDescriptor) || (classifierDescriptorD instanceof TypeParameterDescriptor);
        }
        return false;
    }

    public static final TypeProjection d(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return new TypeProjectionImpl(kotlinType);
    }

    public static final boolean e(KotlinType kotlinType, Function1<? super UnwrappedType, Boolean> predicate) {
        Intrinsics.j(kotlinType, "<this>");
        Intrinsics.j(predicate, "predicate");
        return TypeUtils.c(kotlinType, predicate);
    }

    public static final boolean g(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return e(kotlinType, b.f147944a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(UnwrappedType it) {
        Intrinsics.j(it, "it");
        ClassifierDescriptor classifierDescriptorD = it.K0().d();
        if (classifierDescriptorD != null) {
            return x(classifierDescriptorD);
        }
        return false;
    }

    public static final boolean i(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return TypeUtils.c(kotlinType, a.f147943a);
    }

    public static final TypeProjection k(KotlinType type, Variance projectionKind, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.j(type, "type");
        Intrinsics.j(projectionKind, "projectionKind");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.k() : null) == projectionKind) {
            projectionKind = Variance.f147703e;
        }
        return new TypeProjectionImpl(projectionKind, type);
    }

    public static final Set<TypeParameterDescriptor> l(KotlinType kotlinType, Set<? extends TypeParameterDescriptor> set) {
        Intrinsics.j(kotlinType, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(kotlinType, kotlinType, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final KotlinBuiltIns n(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        KotlinBuiltIns kotlinBuiltInsL = kotlinType.K0().l();
        Intrinsics.i(kotlinBuiltInsL, "getBuiltIns(...)");
        return kotlinBuiltInsL;
    }

    public static final KotlinType o(TypeParameterDescriptor typeParameterDescriptor) {
        Object obj;
        Intrinsics.j(typeParameterDescriptor, "<this>");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.i(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.i(upperBounds2, "getUpperBounds(...)");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassifierDescriptor classifierDescriptorD = ((KotlinType) next).K0().d();
            ClassDescriptor classDescriptor = classifierDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorD : null;
            if (classDescriptor != null && classDescriptor.f() != ClassKind.f144493c && classDescriptor.f() != ClassKind.f144496f) {
                obj = next;
                break;
            }
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        List<KotlinType> upperBounds3 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.i(upperBounds3, "getUpperBounds(...)");
        Object objS0 = CollectionsKt.s0(upperBounds3);
        Intrinsics.i(objS0, "first(...)");
        return (KotlinType) objS0;
    }

    @JvmOverloads
    public static final boolean q(TypeParameterDescriptor typeParameter, TypeConstructor typeConstructor, Set<? extends TypeParameterDescriptor> set) {
        Intrinsics.j(typeParameter, "typeParameter");
        List<KotlinType> upperBounds = typeParameter.getUpperBounds();
        Intrinsics.i(upperBounds, "getUpperBounds(...)");
        List<KotlinType> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (KotlinType kotlinType : list) {
            Intrinsics.g(kotlinType);
            if (f(kotlinType, typeParameter.o().K0(), set) && (typeConstructor == null || Intrinsics.e(kotlinType.K0(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(TypeParameterDescriptor typeParameterDescriptor, TypeConstructor typeConstructor, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeConstructor = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(typeParameterDescriptor, typeConstructor, set);
    }

    public static final boolean s(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return KotlinBuiltIns.g0(kotlinType);
    }

    public static final boolean t(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return KotlinBuiltIns.o0(kotlinType);
    }

    public static final boolean u(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        if (kotlinType instanceof AbstractStubType) {
            return true;
        }
        return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).W0() instanceof AbstractStubType);
    }

    public static final boolean v(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        if (kotlinType instanceof StubTypeForBuilderInference) {
            return true;
        }
        return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).W0() instanceof StubTypeForBuilderInference);
    }

    public static final boolean w(KotlinType kotlinType, KotlinType superType) {
        Intrinsics.j(kotlinType, "<this>");
        Intrinsics.j(superType, "superType");
        return KotlinTypeChecker.f147723a.d(kotlinType, superType);
    }

    public static final boolean x(ClassifierDescriptor classifierDescriptor) {
        Intrinsics.j(classifierDescriptor, "<this>");
        return (classifierDescriptor instanceof TypeParameterDescriptor) && (((TypeParameterDescriptor) classifierDescriptor).b() instanceof TypeAliasDescriptor);
    }

    public static final boolean y(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return TypeUtils.m(kotlinType);
    }

    public static final boolean z(KotlinType type) {
        Intrinsics.j(type, "type");
        return (type instanceof ErrorType) && ((ErrorType) type).U0().e();
    }

    private static final boolean f(KotlinType kotlinType, TypeConstructor typeConstructor, Set<? extends TypeParameterDescriptor> set) {
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters;
        List<TypeParameterDescriptor> listP;
        TypeParameterDescriptor typeParameterDescriptor;
        boolean zF;
        if (Intrinsics.e(kotlinType.K0(), typeConstructor)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD instanceof ClassifierDescriptorWithTypeParameters) {
            classifierDescriptorWithTypeParameters = (ClassifierDescriptorWithTypeParameters) classifierDescriptorD;
        } else {
            classifierDescriptorWithTypeParameters = null;
        }
        if (classifierDescriptorWithTypeParameters != null) {
            listP = classifierDescriptorWithTypeParameters.p();
        } else {
            listP = null;
        }
        Iterable<IndexedValue> iterableS1 = CollectionsKt.s1(kotlinType.I0());
        if ((iterableS1 instanceof Collection) && ((Collection) iterableS1).isEmpty()) {
            return false;
        }
        for (IndexedValue indexedValue : iterableS1) {
            int index = indexedValue.getIndex();
            TypeProjection typeProjection = (TypeProjection) indexedValue.b();
            if (listP != null) {
                typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.v0(listP, index);
            } else {
                typeParameterDescriptor = null;
            }
            if ((typeParameterDescriptor != null && set != null && set.contains(typeParameterDescriptor)) || typeProjection.a()) {
                zF = false;
            } else {
                KotlinType type = typeProjection.getType();
                Intrinsics.i(type, "getType(...)");
                zF = f(type, typeConstructor, set);
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean j(UnwrappedType unwrappedType) {
        return Boolean.valueOf(TypeUtils.m(unwrappedType));
    }

    private static final void m(KotlinType kotlinType, KotlinType kotlinType2, Set<TypeParameterDescriptor> set, Set<? extends TypeParameterDescriptor> set2) {
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters;
        List<TypeParameterDescriptor> listP;
        TypeParameterDescriptor typeParameterDescriptor;
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD instanceof TypeParameterDescriptor) {
            if (!Intrinsics.e(kotlinType.K0(), kotlinType2.K0())) {
                set.add(classifierDescriptorD);
                return;
            }
            for (KotlinType kotlinType3 : ((TypeParameterDescriptor) classifierDescriptorD).getUpperBounds()) {
                Intrinsics.g(kotlinType3);
                m(kotlinType3, kotlinType2, set, set2);
            }
            return;
        }
        ClassifierDescriptor classifierDescriptorD2 = kotlinType.K0().d();
        if (classifierDescriptorD2 instanceof ClassifierDescriptorWithTypeParameters) {
            classifierDescriptorWithTypeParameters = (ClassifierDescriptorWithTypeParameters) classifierDescriptorD2;
        } else {
            classifierDescriptorWithTypeParameters = null;
        }
        if (classifierDescriptorWithTypeParameters != null) {
            listP = classifierDescriptorWithTypeParameters.p();
        } else {
            listP = null;
        }
        int i10 = 0;
        for (TypeProjection typeProjection : kotlinType.I0()) {
            int i11 = i10 + 1;
            if (listP != null) {
                typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.v0(listP, i10);
            } else {
                typeParameterDescriptor = null;
            }
            if ((typeParameterDescriptor == null || set2 == null || !set2.contains(typeParameterDescriptor)) && !typeProjection.a() && !CollectionsKt.h0(set, typeProjection.getType().K0().d()) && !Intrinsics.e(typeProjection.getType().K0(), kotlinType2.K0())) {
                KotlinType type = typeProjection.getType();
                Intrinsics.i(type, "getType(...)");
                m(type, kotlinType2, set, set2);
            }
            i10 = i11;
        }
    }
}

package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeIntersector {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeIntersector f146841a = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f146842a = new c("START", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f146843b = new C2270a("ACCEPT_NULL", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f146844c = new d("UNKNOWN", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f146845d = new b("NOT_NULL", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f146846e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f146847f;

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$a$a, reason: collision with other inner class name */
        static final class C2270a extends a {
            C2270a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            public a b(UnwrappedType nextType) {
                Intrinsics.j(nextType, "nextType");
                return e(nextType);
            }
        }

        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public b b(UnwrappedType nextType) {
                Intrinsics.j(nextType, "nextType");
                return this;
            }
        }

        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            public a b(UnwrappedType nextType) {
                Intrinsics.j(nextType, "nextType");
                return e(nextType);
            }
        }

        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            public a b(UnwrappedType nextType) {
                Intrinsics.j(nextType, "nextType");
                a aVarE = e(nextType);
                return aVarE == a.f146843b ? this : aVarE;
            }
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f146842a, f146843b, f146844c, f146845d};
        }

        public abstract a b(UnwrappedType unwrappedType);

        static {
            a[] aVarArrA = a();
            f146846e = aVarArrA;
            f146847f = EnumEntriesKt.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f146846e.clone();
        }

        protected final a e(UnwrappedType unwrappedType) {
            Intrinsics.j(unwrappedType, "<this>");
            return unwrappedType.L0() ? f146843b : ((unwrappedType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) unwrappedType).W0() instanceof StubTypeForBuilderInference)) ? f146845d : unwrappedType instanceof StubTypeForBuilderInference ? f146844c : NullabilityChecker.f146837a.a(unwrappedType) ? f146845d : f146844c;
        }
    }

    /* synthetic */ class b extends FunctionReferenceImpl implements Function2<KotlinType, KotlinType, Boolean> {
        b(Object obj) {
            super(2, obj, TypeIntersector.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(KotlinType p02, KotlinType p12) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            return Boolean.valueOf(((TypeIntersector) this.receiver).g(p02, p12));
        }
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements Function2<KotlinType, KotlinType, Boolean> {
        c(Object obj) {
            super(2, obj, NewKotlinTypeCheckerImpl.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(KotlinType p02, KotlinType p12) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).b(p02, p12));
        }
    }

    private final Collection<SimpleType> c(Collection<? extends SimpleType> collection, Function2<? super SimpleType, ? super SimpleType, Boolean> function2) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        Intrinsics.i(it, "iterator(...)");
        while (it.hasNext()) {
            SimpleType simpleType = (SimpleType) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SimpleType simpleType2 = (SimpleType) it2.next();
                    if (simpleType2 != simpleType) {
                        Intrinsics.g(simpleType2);
                        Intrinsics.g(simpleType);
                        if (function2.invoke(simpleType2, simpleType).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + CollectionsKt.B0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(KotlinType kotlinType, KotlinType kotlinType2) {
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImplA = NewKotlinTypeChecker.f146831b.a();
        return newKotlinTypeCheckerImplA.d(kotlinType, kotlinType2) && !newKotlinTypeCheckerImplA.d(kotlinType2, kotlinType);
    }

    public final SimpleType d(List<? extends SimpleType> types) {
        Intrinsics.j(types, "types");
        types.size();
        ArrayList<SimpleType> arrayList = new ArrayList();
        for (SimpleType simpleType : types) {
            if (simpleType.K0() instanceof IntersectionTypeConstructor) {
                Collection<KotlinType> collectionA = simpleType.K0().a();
                Intrinsics.i(collectionA, "getSupertypes(...)");
                Collection<KotlinType> collection = collectionA;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(collection, 10));
                for (KotlinType kotlinType : collection) {
                    Intrinsics.g(kotlinType);
                    SimpleType simpleTypeD = FlexibleTypesKt.d(kotlinType);
                    if (simpleType.L0()) {
                        simpleTypeD = simpleTypeD.R0(true);
                    }
                    arrayList2.add(simpleTypeD);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        a aVarB = a.f146842a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVarB = aVarB.b((UnwrappedType) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SimpleType simpleTypeI : arrayList) {
            if (aVarB == a.f146845d) {
                if (simpleTypeI instanceof NewCapturedType) {
                    simpleTypeI = SpecialTypesKt.k((NewCapturedType) simpleTypeI);
                }
                simpleTypeI = SpecialTypesKt.i(simpleTypeI, false, 1, null);
            }
            linkedHashSet.add(simpleTypeI);
        }
        List<? extends SimpleType> list = types;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((SimpleType) it2.next()).J0());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((TypeAttributes) next).r((TypeAttributes) it3.next());
        }
        return e(linkedHashSet).Q0((TypeAttributes) next);
    }

    private TypeIntersector() {
    }

    private final SimpleType e(Set<? extends SimpleType> set) {
        if (set.size() == 1) {
            return (SimpleType) CollectionsKt.T0(set);
        }
        new g(set);
        Set<? extends SimpleType> set2 = set;
        Collection<SimpleType> collectionC = c(set2, new b(this));
        collectionC.isEmpty();
        SimpleType simpleTypeB = IntegerLiteralTypeConstructor.f146180f.b(collectionC);
        if (simpleTypeB != null) {
            return simpleTypeB;
        }
        Collection<SimpleType> collectionC2 = c(collectionC, new c(NewKotlinTypeChecker.f146831b.a()));
        collectionC2.isEmpty();
        if (collectionC2.size() < 2) {
            return (SimpleType) CollectionsKt.T0(collectionC2);
        }
        return new IntersectionTypeConstructor(set2).j();
    }
}

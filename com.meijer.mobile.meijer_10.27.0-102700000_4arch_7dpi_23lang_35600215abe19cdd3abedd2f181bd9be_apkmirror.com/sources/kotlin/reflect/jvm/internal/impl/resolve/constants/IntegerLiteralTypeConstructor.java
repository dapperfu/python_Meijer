package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f146180f = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f146181a;

    /* renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f146182b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<KotlinType> f146183c;

    /* renamed from: d, reason: collision with root package name */
    private final SimpleType f146184d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f146185e;

    @SourceDebugExtension
    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.f146186a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.f146187b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f146186a = new a("COMMON_SUPER_TYPE", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f146187b = new a("INTERSECTION_TYPE", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ a[] f146188c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f146189d;

            private static final /* synthetic */ a[] a() {
                return new a[]{f146186a, f146187b};
            }

            static {
                a[] aVarArrA = a();
                f146188c = aVarArrA;
                f146189d = EnumEntriesKt.a(aVarArrA);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f146188c.clone();
            }

            private a(String str, int i10) {
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SimpleType e(SimpleType simpleType, SimpleType simpleType2, a aVar) {
            if (simpleType != null && simpleType2 != null) {
                TypeConstructor typeConstructorK0 = simpleType.K0();
                TypeConstructor typeConstructorK02 = simpleType2.K0();
                boolean z10 = typeConstructorK0 instanceof IntegerLiteralTypeConstructor;
                if (z10 && (typeConstructorK02 instanceof IntegerLiteralTypeConstructor)) {
                    return c((IntegerLiteralTypeConstructor) typeConstructorK0, (IntegerLiteralTypeConstructor) typeConstructorK02, aVar);
                }
                if (z10) {
                    return d((IntegerLiteralTypeConstructor) typeConstructorK0, simpleType2);
                }
                if (typeConstructorK02 instanceof IntegerLiteralTypeConstructor) {
                    return d((IntegerLiteralTypeConstructor) typeConstructorK02, simpleType);
                }
            }
            return null;
        }

        private Companion() {
        }

        private final SimpleType c(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, a aVar) {
            Set setX0;
            int i10 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i10 == 1) {
                setX0 = CollectionsKt.x0(integerLiteralTypeConstructor.j(), integerLiteralTypeConstructor2.j());
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setX0 = CollectionsKt.p1(integerLiteralTypeConstructor.j(), integerLiteralTypeConstructor2.j());
            }
            return KotlinTypeFactory.f(TypeAttributes.f146740b.k(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f146181a, integerLiteralTypeConstructor.f146182b, setX0, null), false);
        }

        public final SimpleType b(Collection<? extends SimpleType> types) {
            Intrinsics.j(types, "types");
            return a(types, a.f146187b);
        }

        private final SimpleType a(Collection<? extends SimpleType> collection, a aVar) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    SimpleType simpleType = (SimpleType) it.next();
                    next = IntegerLiteralTypeConstructor.f146180f.e((SimpleType) next, simpleType, aVar);
                }
                return (SimpleType) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final SimpleType d(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.j().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j10, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, moduleDescriptor, set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public ClassifierDescriptor d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private IntegerLiteralTypeConstructor(long j10, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        this.f146184d = KotlinTypeFactory.f(TypeAttributes.f146740b.k(), this, false);
        this.f146185e = LazyKt.b(new b(this));
        this.f146181a = j10;
        this.f146182b = moduleDescriptor;
        this.f146183c = set;
    }

    private final List<KotlinType> k() {
        return (List) this.f146185e.getValue();
    }

    private final boolean m() {
        Collection<KotlinType> collectionA = PrimitiveTypeUtilKt.a(this.f146182b);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f146183c.contains((KotlinType) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final String o() {
        return '[' + CollectionsKt.B0(this.f146183c, ",", null, null, 0, null, c.f146199a, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence p(KotlinType it) {
        Intrinsics.j(it, "it");
        return it.toString();
    }

    public final Set<KotlinType> j() {
        return this.f146183c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns l() {
        return this.f146182b.l();
    }

    public String toString() {
        return "IntegerLiteralType" + o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        SimpleType simpleTypeO = integerLiteralTypeConstructor.l().y().o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        List listS = CollectionsKt.s(TypeSubstitutionKt.f(simpleTypeO, CollectionsKt.e(new TypeProjectionImpl(Variance.f146797f, integerLiteralTypeConstructor.f146184d)), null, 2, null));
        if (!integerLiteralTypeConstructor.m()) {
            listS.add(integerLiteralTypeConstructor.l().M());
        }
        return listS;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> a() {
        return k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.m();
    }
}

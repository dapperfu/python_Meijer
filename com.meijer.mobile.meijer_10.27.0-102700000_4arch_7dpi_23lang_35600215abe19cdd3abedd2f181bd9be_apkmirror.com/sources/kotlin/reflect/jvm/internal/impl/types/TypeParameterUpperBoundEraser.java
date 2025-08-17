package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeParameterUpperBoundEraser {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f146767f = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final ErasureProjectionComputer f146768a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeParameterErasureOptions f146769b;

    /* renamed from: c, reason: collision with root package name */
    private final LockBasedStorageManager f146770c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f146771d;

    /* renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<a, KotlinType> f146772e;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.types.KotlinType a(kotlin.reflect.jvm.internal.impl.types.KotlinType r17, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r18, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.Companion.a(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor, java.util.Set, boolean):kotlin.reflect.jvm.internal.impl.types.KotlinType");
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TypeParameterDescriptor f146773a;

        /* renamed from: b, reason: collision with root package name */
        private final ErasureTypeAttributes f146774b;

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f146773a + ", typeAttr=" + this.f146774b + ')';
        }

        public a(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
            Intrinsics.j(typeParameter, "typeParameter");
            Intrinsics.j(typeAttr, "typeAttr");
            this.f146773a = typeParameter;
            this.f146774b = typeAttr;
        }

        public final ErasureTypeAttributes a() {
            return this.f146774b;
        }

        public final TypeParameterDescriptor b() {
            return this.f146773a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.e(aVar.f146773a, this.f146773a) && Intrinsics.e(aVar.f146774b, this.f146774b);
        }

        public int hashCode() {
            int iHashCode = this.f146773a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f146774b.hashCode();
        }
    }

    public TypeParameterUpperBoundEraser(ErasureProjectionComputer projectionComputer, TypeParameterErasureOptions options) {
        Intrinsics.j(projectionComputer, "projectionComputer");
        Intrinsics.j(options, "options");
        this.f146768a = projectionComputer;
        this.f146769b = options;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f146770c = lockBasedStorageManager;
        this.f146771d = LazyKt.b(new v(this));
        MemoizedFunctionToNotNull<a, KotlinType> memoizedFunctionToNotNullI = lockBasedStorageManager.i(new w(this));
        Intrinsics.i(memoizedFunctionToNotNullI, "createMemoizedFunction(...)");
        this.f146772e = memoizedFunctionToNotNullI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ErrorType c(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        return ErrorUtils.d(ErrorTypeKind.f146979v0, typeParameterUpperBoundEraser.toString());
    }

    private final ErrorType h() {
        return (ErrorType) this.f146771d.getValue();
    }

    public final KotlinType e(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        Intrinsics.j(typeParameter, "typeParameter");
        Intrinsics.j(typeAttr, "typeAttr");
        KotlinType kotlinTypeInvoke = this.f146772e.invoke(new a(typeParameter, typeAttr));
        Intrinsics.i(kotlinTypeInvoke, "invoke(...)");
        return kotlinTypeInvoke;
    }

    private final KotlinType d(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType kotlinTypeD;
        SimpleType simpleTypeA = erasureTypeAttributes.a();
        if (simpleTypeA != null && (kotlinTypeD = TypeUtilsKt.D(simpleTypeA)) != null) {
            return kotlinTypeD;
        }
        return h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType f(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, a aVar) {
        return typeParameterUpperBoundEraser.g(aVar.b(), aVar.a());
    }

    private final KotlinType g(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        TypeProjection typeProjectionA;
        Set<TypeParameterDescriptor> setC = erasureTypeAttributes.c();
        if (setC != null && setC.contains(typeParameterDescriptor.a())) {
            return d(erasureTypeAttributes);
        }
        SimpleType simpleTypeO = typeParameterDescriptor.o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        Set<TypeParameterDescriptor> setL = TypeUtilsKt.l(simpleTypeO, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(setL, 10)), 16));
        for (TypeParameterDescriptor typeParameterDescriptor2 : setL) {
            if (setC != null && setC.contains(typeParameterDescriptor2)) {
                typeProjectionA = TypeUtils.t(typeParameterDescriptor2, erasureTypeAttributes);
                Intrinsics.i(typeProjectionA, "makeStarProjection(...)");
            } else {
                typeProjectionA = this.f146768a.a(typeParameterDescriptor2, erasureTypeAttributes, this, e(typeParameterDescriptor2, erasureTypeAttributes.d(typeParameterDescriptor)));
            }
            Pair pairA = TuplesKt.a(typeParameterDescriptor2.i(), typeProjectionA);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        TypeSubstitutor typeSubstitutorG = TypeSubstitutor.g(TypeConstructorSubstitution.Companion.e(TypeConstructorSubstitution.f146762c, linkedHashMap, false, 2, null));
        Intrinsics.i(typeSubstitutorG, "create(...)");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.i(upperBounds, "getUpperBounds(...)");
        Set<KotlinType> setI = i(typeSubstitutorG, upperBounds, erasureTypeAttributes);
        if (!setI.isEmpty()) {
            if (!this.f146769b.a()) {
                if (setI.size() == 1) {
                    return (KotlinType) CollectionsKt.T0(setI);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            }
            List listJ1 = CollectionsKt.j1(setI);
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listJ1, 10));
            Iterator it = listJ1.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).N0());
            }
            return IntersectionTypeKt.a(arrayList);
        }
        return d(erasureTypeAttributes);
    }

    private final Set<KotlinType> i(TypeSubstitutor typeSubstitutor, List<? extends KotlinType> list, ErasureTypeAttributes erasureTypeAttributes) {
        Set setB = SetsKt.b();
        for (KotlinType kotlinType : list) {
            ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
            if (classifierDescriptorD instanceof ClassDescriptor) {
                setB.add(f146767f.a(kotlinType, typeSubstitutor, erasureTypeAttributes.c(), this.f146769b.b()));
            } else if (classifierDescriptorD instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> setC = erasureTypeAttributes.c();
                if (setC != null && setC.contains(classifierDescriptorD)) {
                    setB.add(d(erasureTypeAttributes));
                } else {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) classifierDescriptorD).getUpperBounds();
                    Intrinsics.i(upperBounds, "getUpperBounds(...)");
                    setB.addAll(i(typeSubstitutor, upperBounds, erasureTypeAttributes));
                }
            }
            if (!this.f146769b.a()) {
                break;
            }
        }
        return SetsKt.a(setB);
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i10 & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}

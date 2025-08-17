package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class KotlinTypePreparator extends AbstractTypePreparator {

    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<KotlinTypeMarker, UnwrappedType> {
        a(Object obj) {
            super(1, obj, KotlinTypePreparator.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnwrappedType invoke(KotlinTypeMarker p02) {
            Intrinsics.j(p02, "p0");
            return ((KotlinTypePreparator) this.receiver).a(p02);
        }
    }

    public static final class Default extends KotlinTypePreparator {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f146817a = new Default();

        private Default() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public UnwrappedType a(KotlinTypeMarker type) {
        UnwrappedType unwrappedTypeE;
        Intrinsics.j(type, "type");
        if (!(type instanceof KotlinType)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        UnwrappedType unwrappedTypeN0 = ((KotlinType) type).N0();
        if (unwrappedTypeN0 instanceof SimpleType) {
            unwrappedTypeE = c((SimpleType) unwrappedTypeN0);
        } else {
            if (!(unwrappedTypeN0 instanceof FlexibleType)) {
                throw new NoWhenBranchMatchedException();
            }
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeN0;
            SimpleType simpleTypeC = c(flexibleType.S0());
            SimpleType simpleTypeC2 = c(flexibleType.T0());
            unwrappedTypeE = (simpleTypeC == flexibleType.S0() && simpleTypeC2 == flexibleType.T0()) ? unwrappedTypeN0 : KotlinTypeFactory.e(simpleTypeC, simpleTypeC2);
        }
        return TypeWithEnhancementKt.c(unwrappedTypeE, unwrappedTypeN0, new a(this));
    }

    private final SimpleType c(SimpleType simpleType) {
        KotlinType type;
        TypeConstructor typeConstructorK0 = simpleType.K0();
        IntersectionTypeConstructor intersectionTypeConstructorS = null;
        unwrappedTypeN0 = null;
        UnwrappedType unwrappedTypeN0 = null;
        KotlinType kotlinTypeB = null;
        if (typeConstructorK0 instanceof CapturedTypeConstructorImpl) {
            CapturedTypeConstructorImpl capturedTypeConstructorImpl = (CapturedTypeConstructorImpl) typeConstructorK0;
            TypeProjection typeProjectionF0 = capturedTypeConstructorImpl.f0();
            if (typeProjectionF0.c() != Variance.f146797f) {
                typeProjectionF0 = null;
            }
            if (typeProjectionF0 != null && (type = typeProjectionF0.getType()) != null) {
                unwrappedTypeN0 = type.N0();
            }
            UnwrappedType unwrappedType = unwrappedTypeN0;
            if (capturedTypeConstructorImpl.g() == null) {
                TypeProjection typeProjectionF02 = capturedTypeConstructorImpl.f0();
                Collection<KotlinType> collectionA = capturedTypeConstructorImpl.a();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionA, 10));
                Iterator<T> it = collectionA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).N0());
                }
                capturedTypeConstructorImpl.i(new NewCapturedTypeConstructor(typeProjectionF02, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.f147008a;
            NewCapturedTypeConstructor newCapturedTypeConstructorG = capturedTypeConstructorImpl.g();
            Intrinsics.g(newCapturedTypeConstructorG);
            return new NewCapturedType(captureStatus, newCapturedTypeConstructorG, unwrappedType, simpleType.J0(), simpleType.L0(), false, 32, null);
        }
        boolean z10 = false;
        if (typeConstructorK0 instanceof IntegerValueTypeConstructor) {
            Collection<KotlinType> collectionA2 = ((IntegerValueTypeConstructor) typeConstructorK0).a();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(collectionA2, 10));
            Iterator<T> it2 = collectionA2.iterator();
            while (it2.hasNext()) {
                KotlinType kotlinTypeP = TypeUtils.p((KotlinType) it2.next(), simpleType.L0());
                Intrinsics.i(kotlinTypeP, "makeNullableAsSpecified(...)");
                arrayList2.add(kotlinTypeP);
            }
            return KotlinTypeFactory.m(simpleType.J0(), new IntersectionTypeConstructor(arrayList2), CollectionsKt.m(), false, simpleType.n());
        }
        if ((typeConstructorK0 instanceof IntersectionTypeConstructor) && simpleType.L0()) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorK0;
            Collection<KotlinType> collectionA3 = intersectionTypeConstructor.a();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.x(collectionA3, 10));
            Iterator<T> it3 = collectionA3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(TypeUtilsKt.B((KotlinType) it3.next()));
                z10 = true;
            }
            if (z10) {
                KotlinType kotlinTypeM = intersectionTypeConstructor.m();
                if (kotlinTypeM != null) {
                    kotlinTypeB = TypeUtilsKt.B(kotlinTypeM);
                }
                intersectionTypeConstructorS = new IntersectionTypeConstructor(arrayList3).s(kotlinTypeB);
            }
            if (intersectionTypeConstructorS != null) {
                intersectionTypeConstructor = intersectionTypeConstructorS;
            }
            return intersectionTypeConstructor.j();
        }
        return simpleType;
    }
}

package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class NewCapturedTypeKt {
    public static final SimpleType b(SimpleType type, CaptureStatus status) {
        Intrinsics.j(type, "type");
        Intrinsics.j(status, "status");
        List<TypeProjection> listA = a(type, status);
        if (listA != null) {
            return c(type, listA);
        }
        return null;
    }

    private static final List<TypeProjection> a(UnwrappedType unwrappedType, CaptureStatus captureStatus) {
        UnwrappedType unwrappedTypeN0;
        if (unwrappedType.I0().size() != unwrappedType.K0().getParameters().size()) {
            return null;
        }
        List<TypeProjection> listI0 = unwrappedType.I0();
        List<TypeProjection> list = listI0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((TypeProjection) it.next()).c() != Variance.f146796e) {
                    List<TypeParameterDescriptor> parameters = unwrappedType.K0().getParameters();
                    Intrinsics.i(parameters, "getParameters(...)");
                    List<Pair> listU1 = CollectionsKt.u1(list, parameters);
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(listU1, 10));
                    for (Pair pair : listU1) {
                        TypeProjection typeProjectionD = (TypeProjection) pair.a();
                        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.b();
                        if (typeProjectionD.c() != Variance.f146796e) {
                            if (!typeProjectionD.a() && typeProjectionD.c() == Variance.f146797f) {
                                unwrappedTypeN0 = typeProjectionD.getType().N0();
                            } else {
                                unwrappedTypeN0 = null;
                            }
                            Intrinsics.g(typeParameterDescriptor);
                            typeProjectionD = TypeUtilsKt.d(new NewCapturedType(captureStatus, unwrappedTypeN0, typeProjectionD, typeParameterDescriptor));
                        }
                        arrayList.add(typeProjectionD);
                    }
                    TypeSubstitutor typeSubstitutorC = TypeConstructorSubstitution.f146762c.b(unwrappedType.K0(), arrayList).c();
                    int size = listI0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TypeProjection typeProjection = listI0.get(i10);
                        TypeProjection typeProjection2 = (TypeProjection) arrayList.get(i10);
                        if (typeProjection.c() != Variance.f146796e) {
                            List<KotlinType> upperBounds = unwrappedType.K0().getParameters().get(i10).getUpperBounds();
                            Intrinsics.i(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(KotlinTypePreparator.Default.f146817a.a(typeSubstitutorC.n((KotlinType) it2.next(), Variance.f146796e).N0()));
                            }
                            if (!typeProjection.a() && typeProjection.c() == Variance.f146798g) {
                                arrayList2.add(KotlinTypePreparator.Default.f146817a.a(typeProjection.getType().N0()));
                            }
                            KotlinType type = typeProjection2.getType();
                            Intrinsics.h(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((NewCapturedType) type).K0().o(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    private static final SimpleType c(UnwrappedType unwrappedType, List<? extends TypeProjection> list) {
        return KotlinTypeFactory.k(unwrappedType.J0(), unwrappedType.K0(), list, unwrappedType.L0(), null, 16, null);
    }
}

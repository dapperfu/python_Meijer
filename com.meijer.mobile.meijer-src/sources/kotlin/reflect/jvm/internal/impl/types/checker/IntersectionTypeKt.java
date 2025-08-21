package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class IntersectionTypeKt {
    public static final UnwrappedType a(Collection<? extends UnwrappedType> types) {
        SimpleType simpleTypeS0;
        Intrinsics.j(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (UnwrappedType) CollectionsKt.T0(types);
        }
        Collection<? extends UnwrappedType> collection = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collection, 10));
        boolean z10 = false;
        boolean z11 = false;
        for (UnwrappedType unwrappedType : collection) {
            z10 = z10 || KotlinTypeKt.a(unwrappedType);
            if (unwrappedType instanceof SimpleType) {
                simpleTypeS0 = (SimpleType) unwrappedType;
            } else {
                if (!(unwrappedType instanceof FlexibleType)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (DynamicTypesKt.a(unwrappedType)) {
                    return unwrappedType;
                }
                simpleTypeS0 = ((FlexibleType) unwrappedType).S0();
                z11 = true;
            }
            arrayList.add(simpleTypeS0);
        }
        if (z10) {
            return ErrorUtils.d(ErrorTypeKind.f147884u0, types.toString());
        }
        if (!z11) {
            return TypeIntersector.f147748a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(FlexibleTypesKt.d((UnwrappedType) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.f147748a;
        return KotlinTypeFactory.e(typeIntersector.d(arrayList), typeIntersector.d(arrayList2));
    }
}

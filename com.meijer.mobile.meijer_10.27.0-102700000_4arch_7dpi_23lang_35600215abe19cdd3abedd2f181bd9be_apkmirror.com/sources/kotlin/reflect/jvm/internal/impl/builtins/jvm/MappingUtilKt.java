package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class MappingUtilKt {
    public static final TypeConstructorSubstitution a(ClassDescriptor from, ClassDescriptor to2) {
        Intrinsics.j(from, "from");
        Intrinsics.j(to2, "to");
        from.p().size();
        to2.p().size();
        TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.f146762c;
        List<TypeParameterDescriptor> listP = from.p();
        Intrinsics.i(listP, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> list = listP;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeParameterDescriptor) it.next()).i());
        }
        List<TypeParameterDescriptor> listP2 = to2.p();
        Intrinsics.i(listP2, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> list2 = listP2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            SimpleType simpleTypeO = ((TypeParameterDescriptor) it2.next()).o();
            Intrinsics.i(simpleTypeO, "getDefaultType(...)");
            arrayList2.add(TypeUtilsKt.d(simpleTypeO));
        }
        return TypeConstructorSubstitution.Companion.e(companion, MapsKt.y(CollectionsKt.u1(arrayList, arrayList2)), false, 2, null);
    }
}

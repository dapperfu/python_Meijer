package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ValueClassUtilKt {
    public static final Pair<List<Name>, List<ProtoBuf.Type>> a(ProtoBuf.Class r52, NameResolver nameResolver, TypeTable typeTable) {
        List<ProtoBuf.Type> listX0;
        Intrinsics.j(r52, "<this>");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        List<Integer> listS0 = r52.S0();
        Intrinsics.i(listS0, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = listS0;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (Integer num : list) {
            Intrinsics.g(num);
            arrayList.add(NameResolverUtilKt.b(nameResolver, num.intValue()));
        }
        Pair pairA = TuplesKt.a(Integer.valueOf(r52.V0()), Integer.valueOf(r52.U0()));
        if (Intrinsics.e(pairA, TuplesKt.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listW0 = r52.W0();
            Intrinsics.i(listW0, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = listW0;
            listX0 = new ArrayList<>(CollectionsKt.x(list2, 10));
            for (Integer num2 : list2) {
                Intrinsics.g(num2);
                listX0.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!Intrinsics.e(pairA, TuplesKt.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.b(nameResolver, r52.K0()) + " has illegal multi-field value class representation").toString());
            }
            listX0 = r52.X0();
        }
        return TuplesKt.a(arrayList, listX0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends RigidTypeMarker> ValueClassRepresentation<T> b(ProtoBuf.Class r12, NameResolver nameResolver, TypeTable typeTable, Function1<? super ProtoBuf.Type, ? extends T> typeDeserializer, Function1<? super Name, ? extends T> typeOfPublicProperty) {
        T tInvoke;
        Intrinsics.j(r12, "<this>");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(typeDeserializer, "typeDeserializer");
        Intrinsics.j(typeOfPublicProperty, "typeOfPublicProperty");
        if (r12.R0() > 0) {
            Pair<List<Name>, List<ProtoBuf.Type>> pairA = a(r12, nameResolver, typeTable);
            List<Name> listA = pairA.a();
            List<ProtoBuf.Type> listB = pairA.b();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(typeDeserializer.invoke(it.next()));
            }
            return new MultiFieldValueClassRepresentation(CollectionsKt.u1(listA, arrayList));
        }
        if (!r12.t1()) {
            return null;
        }
        Name nameB = NameResolverUtilKt.b(nameResolver, r12.O0());
        ProtoBuf.Type typeI = ProtoTypeTableUtilKt.i(r12, typeTable);
        if ((typeI != null && (tInvoke = typeDeserializer.invoke(typeI)) != null) || (tInvoke = typeOfPublicProperty.invoke(nameB)) != null) {
            return new InlineClassRepresentation(nameB, tInvoke);
        }
        throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.b(nameResolver, r12.K0()) + " with property " + nameB).toString());
    }
}

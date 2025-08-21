package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ProtoTypeTableUtilKt {
    public static final ProtoBuf.Type a(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.j(type, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (type.k0()) {
            return type.S();
        }
        if (type.l0()) {
            return typeTable.a(type.T());
        }
        return null;
    }

    public static final List<ProtoBuf.Type> b(ProtoBuf.Class r22, TypeTable typeTable) {
        Intrinsics.j(r22, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        List<ProtoBuf.Type> listD0 = r22.D0();
        if (listD0.isEmpty()) {
            listD0 = null;
        }
        if (listD0 == null) {
            List<Integer> listC0 = r22.C0();
            Intrinsics.i(listC0, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listC0;
            listD0 = new ArrayList<>(CollectionsKt.x(list, 10));
            for (Integer num : list) {
                Intrinsics.g(num);
                listD0.add(typeTable.a(num.intValue()));
            }
        }
        return listD0;
    }

    public static final List<ProtoBuf.Type> c(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.j(function, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        List<ProtoBuf.Type> listD0 = function.d0();
        if (listD0.isEmpty()) {
            listD0 = null;
        }
        if (listD0 == null) {
            List<Integer> listC0 = function.c0();
            Intrinsics.i(listC0, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listC0;
            listD0 = new ArrayList<>(CollectionsKt.x(list, 10));
            for (Integer num : list) {
                Intrinsics.g(num);
                listD0.add(typeTable.a(num.intValue()));
            }
        }
        return listD0;
    }

    public static final List<ProtoBuf.Type> d(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.j(property, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        List<ProtoBuf.Type> listC0 = property.c0();
        if (listC0.isEmpty()) {
            listC0 = null;
        }
        if (listC0 == null) {
            List<Integer> listB0 = property.b0();
            Intrinsics.i(listB0, "getContextReceiverTypeIdList(...)");
            List<Integer> list = listB0;
            listC0 = new ArrayList<>(CollectionsKt.x(list, 10));
            for (Integer num : list) {
                Intrinsics.g(num);
                listC0.add(typeTable.a(num.intValue()));
            }
        }
        return listC0;
    }

    public static final ProtoBuf.Type e(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        Intrinsics.j(typeAlias, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (typeAlias.i0()) {
            ProtoBuf.Type typeY = typeAlias.Y();
            Intrinsics.i(typeY, "getExpandedType(...)");
            return typeY;
        }
        if (typeAlias.j0()) {
            return typeTable.a(typeAlias.Z());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final ProtoBuf.Type f(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.j(type, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (type.p0()) {
            return type.c0();
        }
        if (type.q0()) {
            return typeTable.a(type.d0());
        }
        return null;
    }

    public static final boolean g(ProtoBuf.Function function) {
        Intrinsics.j(function, "<this>");
        return function.B0() || function.C0();
    }

    public static final boolean h(ProtoBuf.Property property) {
        Intrinsics.j(property, "<this>");
        return property.y0() || property.z0();
    }

    public static final ProtoBuf.Type i(ProtoBuf.Class r12, TypeTable typeTable) {
        Intrinsics.j(r12, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (r12.u1()) {
            return r12.P0();
        }
        if (r12.v1()) {
            return typeTable.a(r12.Q0());
        }
        return null;
    }

    public static final ProtoBuf.Type j(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.j(type, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (type.t0()) {
            return type.f0();
        }
        if (type.u0()) {
            return typeTable.a(type.g0());
        }
        return null;
    }

    public static final ProtoBuf.Type k(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.j(function, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (function.B0()) {
            return function.k0();
        }
        if (function.C0()) {
            return typeTable.a(function.l0());
        }
        return null;
    }

    public static final ProtoBuf.Type l(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.j(property, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (property.y0()) {
            return property.j0();
        }
        if (property.z0()) {
            return typeTable.a(property.k0());
        }
        return null;
    }

    public static final ProtoBuf.Type m(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.j(function, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (function.D0()) {
            ProtoBuf.Type typeM0 = function.m0();
            Intrinsics.i(typeM0, "getReturnType(...)");
            return typeM0;
        }
        if (function.E0()) {
            return typeTable.a(function.n0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final ProtoBuf.Type n(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.j(property, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (property.A0()) {
            ProtoBuf.Type typeL0 = property.l0();
            Intrinsics.i(typeL0, "getReturnType(...)");
            return typeL0;
        }
        if (property.B0()) {
            return typeTable.a(property.m0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List<ProtoBuf.Type> o(ProtoBuf.Class r22, TypeTable typeTable) {
        Intrinsics.j(r22, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        List<ProtoBuf.Type> listG1 = r22.g1();
        if (listG1.isEmpty()) {
            listG1 = null;
        }
        if (listG1 == null) {
            List<Integer> listF1 = r22.f1();
            Intrinsics.i(listF1, "getSupertypeIdList(...)");
            List<Integer> list = listF1;
            listG1 = new ArrayList<>(CollectionsKt.x(list, 10));
            for (Integer num : list) {
                Intrinsics.g(num);
                listG1.add(typeTable.a(num.intValue()));
            }
        }
        return listG1;
    }

    public static final ProtoBuf.Type p(ProtoBuf.Type.Argument argument, TypeTable typeTable) {
        Intrinsics.j(argument, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (argument.C()) {
            return argument.z();
        }
        if (argument.D()) {
            return typeTable.a(argument.A());
        }
        return null;
    }

    public static final ProtoBuf.Type q(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.j(valueParameter, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (valueParameter.T()) {
            ProtoBuf.Type typeN = valueParameter.N();
            Intrinsics.i(typeN, "getType(...)");
            return typeN;
        }
        if (valueParameter.U()) {
            return typeTable.a(valueParameter.O());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final ProtoBuf.Type r(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        Intrinsics.j(typeAlias, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (typeAlias.m0()) {
            ProtoBuf.Type typeF0 = typeAlias.f0();
            Intrinsics.i(typeF0, "getUnderlyingType(...)");
            return typeF0;
        }
        if (typeAlias.n0()) {
            return typeTable.a(typeAlias.g0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List<ProtoBuf.Type> s(ProtoBuf.TypeParameter typeParameter, TypeTable typeTable) {
        Intrinsics.j(typeParameter, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        List<ProtoBuf.Type> listT = typeParameter.T();
        if (listT.isEmpty()) {
            listT = null;
        }
        if (listT == null) {
            List<Integer> listS = typeParameter.S();
            Intrinsics.i(listS, "getUpperBoundIdList(...)");
            List<Integer> list = listS;
            listT = new ArrayList<>(CollectionsKt.x(list, 10));
            for (Integer num : list) {
                Intrinsics.g(num);
                listT.add(typeTable.a(num.intValue()));
            }
        }
        return listT;
    }

    public static final ProtoBuf.Type t(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.j(valueParameter, "<this>");
        Intrinsics.j(typeTable, "typeTable");
        if (valueParameter.V()) {
            return valueParameter.P();
        }
        if (valueParameter.W()) {
            return typeTable.a(valueParameter.Q());
        }
        return null;
    }
}

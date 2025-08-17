package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class JvmProtoBufUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final JvmProtoBufUtil f145664a = new JvmProtoBufUtil();

    /* renamed from: b, reason: collision with root package name */
    private static final ExtensionRegistryLite f145665b;

    static {
        ExtensionRegistryLite extensionRegistryLiteD = ExtensionRegistryLite.d();
        JvmProtoBuf.a(extensionRegistryLiteD);
        Intrinsics.i(extensionRegistryLiteD, "apply(...)");
        f145665b = extensionRegistryLiteD;
    }

    public static /* synthetic */ JvmMemberSignature.Field d(JvmProtoBufUtil jvmProtoBufUtil, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return jvmProtoBufUtil.c(property, nameResolver, typeTable, z10);
    }

    @JvmStatic
    public static final boolean f(ProtoBuf.Property proto) {
        Intrinsics.j(proto, "proto");
        Flags.BooleanFlagField booleanFlagFieldA = JvmFlags.f145648a.a();
        Object objU = proto.u(JvmProtoBuf.f145557e);
        Intrinsics.i(objU, "getExtension(...)");
        Boolean boolD = booleanFlagFieldA.d(((Number) objU).intValue());
        Intrinsics.i(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Class> h(byte[] bytes, String[] strings) {
        Intrinsics.j(bytes, "bytes");
        Intrinsics.j(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f145664a.k(byteArrayInputStream, strings), ProtoBuf.Class.C1(byteArrayInputStream, f145665b));
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Class> i(String[] data, String[] strings) {
        Intrinsics.j(data, "data");
        Intrinsics.j(strings, "strings");
        byte[] bArrE = BitEncoding.e(data);
        Intrinsics.i(bArrE, "decodeBytes(...)");
        return h(bArrE, strings);
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Function> j(String[] data, String[] strings) {
        Intrinsics.j(data, "data");
        Intrinsics.j(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.e(data));
        return new Pair<>(f145664a.k(byteArrayInputStream, strings), ProtoBuf.Function.K0(byteArrayInputStream, f145665b));
    }

    private final JvmNameResolver k(InputStream inputStream, String[] strArr) throws IOException {
        JvmProtoBuf.StringTableTypes stringTableTypesE = JvmProtoBuf.StringTableTypes.E(inputStream, f145665b);
        Intrinsics.i(stringTableTypesE, "parseDelimitedFrom(...)");
        return new JvmNameResolver(stringTableTypesE, strArr);
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Package> l(byte[] bytes, String[] strings) {
        Intrinsics.j(bytes, "bytes");
        Intrinsics.j(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        return new Pair<>(f145664a.k(byteArrayInputStream, strings), ProtoBuf.Package.e0(byteArrayInputStream, f145665b));
    }

    @JvmStatic
    public static final Pair<JvmNameResolver, ProtoBuf.Package> m(String[] data, String[] strings) {
        Intrinsics.j(data, "data");
        Intrinsics.j(strings, "strings");
        byte[] bArrE = BitEncoding.e(data);
        Intrinsics.i(bArrE, "decodeBytes(...)");
        return l(bArrE, strings);
    }

    public final ExtensionRegistryLite a() {
        return f145665b;
    }

    public final JvmMemberSignature.Method b(ProtoBuf.Constructor proto, NameResolver nameResolver, TypeTable typeTable) {
        String strB0;
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> constructorSignature = JvmProtoBuf.f145553a;
        Intrinsics.i(constructorSignature, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.a(proto, constructorSignature);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.A()) ? "<init>" : nameResolver.getString(jvmMethodSignature.y());
        if (jvmMethodSignature == null || !jvmMethodSignature.z()) {
            List<ProtoBuf.ValueParameter> listR = proto.R();
            Intrinsics.i(listR, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = listR;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                JvmProtoBufUtil jvmProtoBufUtil = f145664a;
                Intrinsics.g(valueParameter);
                String strG = jvmProtoBufUtil.g(ProtoTypeTableUtilKt.q(valueParameter, typeTable), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strB0 = CollectionsKt.B0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strB0 = nameResolver.getString(jvmMethodSignature.x());
        }
        return new JvmMemberSignature.Method(string, strB0);
    }

    public final JvmMemberSignature.Field c(ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, boolean z10) {
        String strG;
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f145556d;
        Intrinsics.i(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature jvmFieldSignatureB = jvmPropertySignature.G() ? jvmPropertySignature.B() : null;
        if (jvmFieldSignatureB == null && z10) {
            return null;
        }
        int iH0 = (jvmFieldSignatureB == null || !jvmFieldSignatureB.A()) ? proto.h0() : jvmFieldSignatureB.y();
        if (jvmFieldSignatureB == null || !jvmFieldSignatureB.z()) {
            strG = g(ProtoTypeTableUtilKt.n(proto, typeTable), nameResolver);
            if (strG == null) {
                return null;
            }
        } else {
            strG = nameResolver.getString(jvmFieldSignatureB.x());
        }
        return new JvmMemberSignature.Field(nameResolver.getString(iH0), strG);
    }

    public final JvmMemberSignature.Method e(ProtoBuf.Function proto, NameResolver nameResolver, TypeTable typeTable) {
        String string;
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> methodSignature = JvmProtoBuf.f145554b;
        Intrinsics.i(methodSignature, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.a(proto, methodSignature);
        int iI0 = (jvmMethodSignature == null || !jvmMethodSignature.A()) ? proto.i0() : jvmMethodSignature.y();
        if (jvmMethodSignature == null || !jvmMethodSignature.z()) {
            List listQ = CollectionsKt.q(ProtoTypeTableUtilKt.k(proto, typeTable));
            List<ProtoBuf.ValueParameter> listV0 = proto.v0();
            Intrinsics.i(listV0, "getValueParameterList(...)");
            List<ProtoBuf.ValueParameter> list = listV0;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                Intrinsics.g(valueParameter);
                arrayList.add(ProtoTypeTableUtilKt.q(valueParameter, typeTable));
            }
            List listP0 = CollectionsKt.P0(listQ, arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listP0, 10));
            Iterator it = listP0.iterator();
            while (it.hasNext()) {
                String strG = f145664a.g((ProtoBuf.Type) it.next(), nameResolver);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(ProtoTypeTableUtilKt.m(proto, typeTable), nameResolver);
            if (strG2 == null) {
                return null;
            }
            string = CollectionsKt.B0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = nameResolver.getString(jvmMethodSignature.x());
        }
        return new JvmMemberSignature.Method(nameResolver.getString(iI0), string);
    }

    private JvmProtoBufUtil() {
    }

    private final String g(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.m0()) {
            return ClassMapperLite.b(nameResolver.b(type.X()));
        }
        return null;
    }
}

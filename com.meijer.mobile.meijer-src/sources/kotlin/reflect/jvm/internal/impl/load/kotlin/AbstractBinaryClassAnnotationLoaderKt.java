package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes14.dex */
public final class AbstractBinaryClassAnnotationLoaderKt {
    public static final MemberSignature a(ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, boolean z10, boolean z11, boolean z12) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f146463d;
        Intrinsics.i(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a(proto, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z10) {
            JvmMemberSignature.Field fieldC = JvmProtoBufUtil.f146571a.c(proto, nameResolver, typeTable, z12);
            if (fieldC == null) {
                return null;
            }
            return MemberSignature.f145733b.b(fieldC);
        }
        if (!z11 || !jvmPropertySignature.J()) {
            return null;
        }
        MemberSignature.Companion companion = MemberSignature.f145733b;
        JvmProtoBuf.JvmMethodSignature jvmMethodSignatureE = jvmPropertySignature.E();
        Intrinsics.i(jvmMethodSignatureE, "getSyntheticMethod(...)");
        return companion.c(nameResolver, jvmMethodSignatureE);
    }

    public static /* synthetic */ MemberSignature b(ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(property, nameResolver, typeTable, z10, z11, z12);
    }
}

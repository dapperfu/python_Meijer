package Hv;

import java.util.Map;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lkotlin/reflect/KClass;", "LDv/b;", "a", "()Ljava/util/Map;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class X {
    public static final Map<KClass<?>, Dv.b<?>> a() {
        Map mapD = MapsKt.d();
        mapD.put(Reflection.b(String.class), Ev.a.D(StringCompanionObject.f142841a));
        mapD.put(Reflection.b(Character.TYPE), Ev.a.x(CharCompanionObject.f142811a));
        mapD.put(Reflection.b(char[].class), Ev.a.c());
        mapD.put(Reflection.b(Double.TYPE), Ev.a.y(DoubleCompanionObject.f142820a));
        mapD.put(Reflection.b(double[].class), Ev.a.d());
        mapD.put(Reflection.b(Float.TYPE), Ev.a.z(FloatCompanionObject.f142822a));
        mapD.put(Reflection.b(float[].class), Ev.a.e());
        mapD.put(Reflection.b(Long.TYPE), Ev.a.B(LongCompanionObject.f142825a));
        mapD.put(Reflection.b(long[].class), Ev.a.h());
        mapD.put(Reflection.b(ULong.class), Ev.a.s(ULong.INSTANCE));
        mapD.put(Reflection.b(Integer.TYPE), Ev.a.A(IntCompanionObject.f142824a));
        mapD.put(Reflection.b(int[].class), Ev.a.f());
        mapD.put(Reflection.b(UInt.class), Ev.a.r(UInt.INSTANCE));
        mapD.put(Reflection.b(Short.TYPE), Ev.a.C(ShortCompanionObject.f142839a));
        mapD.put(Reflection.b(short[].class), Ev.a.k());
        mapD.put(Reflection.b(UShort.class), Ev.a.t(UShort.INSTANCE));
        mapD.put(Reflection.b(Byte.TYPE), Ev.a.w(ByteCompanionObject.f142809a));
        mapD.put(Reflection.b(byte[].class), Ev.a.b());
        mapD.put(Reflection.b(UByte.class), Ev.a.q(UByte.INSTANCE));
        mapD.put(Reflection.b(Boolean.TYPE), Ev.a.v(BooleanCompanionObject.f142808a));
        mapD.put(Reflection.b(boolean[].class), Ev.a.a());
        mapD.put(Reflection.b(Unit.class), Ev.a.u(Unit.f142422a));
        mapD.put(Reflection.b(Void.class), Ev.a.j());
        try {
            mapD.put(Reflection.b(Duration.class), Ev.a.E(Duration.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapD.put(Reflection.b(ULongArray.class), Ev.a.n());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapD.put(Reflection.b(UIntArray.class), Ev.a.m());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapD.put(Reflection.b(UShortArray.class), Ev.a.o());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapD.put(Reflection.b(UByteArray.class), Ev.a.l());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapD.put(Reflection.b(Uuid.class), Ev.a.F(Uuid.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.c(mapD);
    }
}

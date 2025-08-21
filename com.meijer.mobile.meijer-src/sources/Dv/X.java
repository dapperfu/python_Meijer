package Dv;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lkotlin/reflect/KClass;", "Lzv/b;", "a", "()Ljava/util/Map;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class X {
    public static final Map<KClass<?>, zv.b<?>> a() {
        Map mapD = MapsKt.d();
        mapD.put(Reflection.b(String.class), Av.a.D(StringCompanionObject.f143748a));
        mapD.put(Reflection.b(Character.TYPE), Av.a.x(CharCompanionObject.f143718a));
        mapD.put(Reflection.b(char[].class), Av.a.c());
        mapD.put(Reflection.b(Double.TYPE), Av.a.y(DoubleCompanionObject.f143727a));
        mapD.put(Reflection.b(double[].class), Av.a.d());
        mapD.put(Reflection.b(Float.TYPE), Av.a.z(FloatCompanionObject.f143729a));
        mapD.put(Reflection.b(float[].class), Av.a.e());
        mapD.put(Reflection.b(Long.TYPE), Av.a.B(LongCompanionObject.f143732a));
        mapD.put(Reflection.b(long[].class), Av.a.h());
        mapD.put(Reflection.b(ULong.class), Av.a.s(ULong.INSTANCE));
        mapD.put(Reflection.b(Integer.TYPE), Av.a.A(IntCompanionObject.f143731a));
        mapD.put(Reflection.b(int[].class), Av.a.f());
        mapD.put(Reflection.b(UInt.class), Av.a.r(UInt.INSTANCE));
        mapD.put(Reflection.b(Short.TYPE), Av.a.C(ShortCompanionObject.f143746a));
        mapD.put(Reflection.b(short[].class), Av.a.k());
        mapD.put(Reflection.b(UShort.class), Av.a.t(UShort.INSTANCE));
        mapD.put(Reflection.b(Byte.TYPE), Av.a.w(ByteCompanionObject.f143716a));
        mapD.put(Reflection.b(byte[].class), Av.a.b());
        mapD.put(Reflection.b(UByte.class), Av.a.q(UByte.INSTANCE));
        mapD.put(Reflection.b(Boolean.TYPE), Av.a.v(BooleanCompanionObject.f143715a));
        mapD.put(Reflection.b(boolean[].class), Av.a.a());
        mapD.put(Reflection.b(Unit.class), Av.a.u(Unit.f143329a));
        mapD.put(Reflection.b(Void.class), Av.a.j());
        try {
            mapD.put(Reflection.b(Duration.class), Av.a.E(Duration.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapD.put(Reflection.b(ULongArray.class), Av.a.n());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapD.put(Reflection.b(UIntArray.class), Av.a.m());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapD.put(Reflection.b(UShortArray.class), Av.a.o());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapD.put(Reflection.b(UByteArray.class), Av.a.l());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapD.put(Reflection.b(Uuid.class), Av.a.F(Uuid.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.c(mapD);
    }
}

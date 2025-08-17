package Ev;

import Dv.b;
import Hv.A0;
import Hv.C0;
import Hv.C3693e;
import Hv.C3697g;
import Hv.C3699h;
import Hv.C3703j;
import Hv.C3704k;
import Hv.C3707n;
import Hv.C3708o;
import Hv.C3711s;
import Hv.C3712t;
import Hv.C3713u;
import Hv.C3716x;
import Hv.C3717y;
import Hv.D;
import Hv.D0;
import Hv.E;
import Hv.F0;
import Hv.G0;
import Hv.H;
import Hv.H0;
import Hv.I0;
import Hv.K;
import Hv.L;
import Hv.S;
import Hv.T;
import Hv.p0;
import Hv.q0;
import Hv.r0;
import Hv.w0;
import Hv.x0;
import Hv.z0;
import java.util.List;
import java.util.Map;
import kotlin.ExperimentalUnsignedTypes;
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
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.Duration;
import kotlin.uuid.ExperimentalUuidApi;
import kotlin.uuid.Uuid;

@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\r\u0010\u0007\u001a\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0007\u001a\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001¢\u0006\u0004\b\u001d\u0010\u0007\u001a\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0001H\u0007¢\u0006\u0004\b\u001f\u0010\u0007\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0001*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001¢\u0006\u0004\b%\u0010\u0007\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0001H\u0007¢\u0006\u0004\b'\u0010\u0007\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0001¢\u0006\u0004\b-\u0010\u0007\u001a\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0001*\u00020.¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0001¢\u0006\u0004\b3\u0010\u0007\u001a\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0001*\u000204¢\u0006\u0004\b6\u00107\u001a\u0013\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0001¢\u0006\u0004\b9\u0010\u0007\u001a\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0001*\u00020:¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0001*\u00020=¢\u0006\u0004\b?\u0010@\u001a-\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000C0\u0001\"\u0004\b\u0000\u0010A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bD\u0010E\u001aG\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J0\u0001\"\u0004\b\u0000\u0010F\"\u0004\b\u0001\u0010G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0004\bK\u0010L\u001a\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u0001*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u0001*\u00020Q¢\u0006\u0004\bS\u0010T\u001a\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u0001*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u0001*\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u0001*\u00020]¢\u0006\u0004\b_\u0010`\u001a\u0019\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u0001*\u00020aH\u0007¢\u0006\u0004\bc\u0010d\u001a\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u0001H\u0007¢\u0006\u0004\bf\u0010\u0007\"3\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010A*\u00020g*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\f\u0012\u0004\bi\u0010j\u001a\u0004\bh\u0010E¨\u0006l"}, d2 = {"Lkotlin/Char$Companion;", "LDv/b;", "", "x", "(Lkotlin/jvm/internal/CharCompanionObject;)LDv/b;", "", "c", "()LDv/b;", "Lkotlin/Byte$Companion;", "", "w", "(Lkotlin/jvm/internal/ByteCompanionObject;)LDv/b;", "", "b", "Lkotlin/UByteArray;", "l", "Lkotlin/Short$Companion;", "", "C", "(Lkotlin/jvm/internal/ShortCompanionObject;)LDv/b;", "", "k", "Lkotlin/UShortArray;", "o", "Lkotlin/Int$Companion;", "", "A", "(Lkotlin/jvm/internal/IntCompanionObject;)LDv/b;", "", "f", "Lkotlin/UIntArray;", "m", "Lkotlin/Long$Companion;", "", "B", "(Lkotlin/jvm/internal/LongCompanionObject;)LDv/b;", "", "h", "Lkotlin/ULongArray;", "n", "Lkotlin/Float$Companion;", "", "z", "(Lkotlin/jvm/internal/FloatCompanionObject;)LDv/b;", "", "e", "Lkotlin/Double$Companion;", "", "y", "(Lkotlin/jvm/internal/DoubleCompanionObject;)LDv/b;", "", "d", "Lkotlin/Boolean$Companion;", "", "v", "(Lkotlin/jvm/internal/BooleanCompanionObject;)LDv/b;", "", "a", "", "u", "(Lkotlin/Unit;)LDv/b;", "Lkotlin/String$Companion;", "", "D", "(Lkotlin/jvm/internal/StringCompanionObject;)LDv/b;", "T", "elementSerializer", "", "g", "(LDv/b;)LDv/b;", "K", "V", "keySerializer", "valueSerializer", "", "i", "(LDv/b;LDv/b;)LDv/b;", "Lkotlin/UInt$Companion;", "Lkotlin/UInt;", "r", "(Lkotlin/UInt$Companion;)LDv/b;", "Lkotlin/ULong$Companion;", "Lkotlin/ULong;", "s", "(Lkotlin/ULong$Companion;)LDv/b;", "Lkotlin/UByte$Companion;", "Lkotlin/UByte;", "q", "(Lkotlin/UByte$Companion;)LDv/b;", "Lkotlin/UShort$Companion;", "Lkotlin/UShort;", "t", "(Lkotlin/UShort$Companion;)LDv/b;", "Lkotlin/time/Duration$Companion;", "Lkotlin/time/Duration;", "E", "(Lkotlin/time/Duration$Companion;)LDv/b;", "Lkotlin/uuid/Uuid$Companion;", "Lkotlin/uuid/Uuid;", "F", "(Lkotlin/uuid/Uuid$Companion;)LDv/b;", "", "j", "", "p", "getNullable$annotations", "(LDv/b;)V", "nullable", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {
    public static final b<Integer> A(IntCompanionObject intCompanionObject) {
        Intrinsics.j(intCompanionObject, "<this>");
        return E.f13269a;
    }

    public static final b<Long> B(LongCompanionObject longCompanionObject) {
        Intrinsics.j(longCompanionObject, "<this>");
        return L.f13286a;
    }

    public static final b<Short> C(ShortCompanionObject shortCompanionObject) {
        Intrinsics.j(shortCompanionObject, "<this>");
        return q0.f13355a;
    }

    public static final b<String> D(StringCompanionObject stringCompanionObject) {
        Intrinsics.j(stringCompanionObject, "<this>");
        return r0.f13359a;
    }

    public static final b<Duration> E(Duration.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return C3713u.f13370a;
    }

    @ExperimentalUuidApi
    public static final b<Uuid> F(Uuid.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return I0.f13281a;
    }

    public static final b<boolean[]> a() {
        return C3697g.f13329c;
    }

    public static final b<byte[]> b() {
        return C3703j.f13336c;
    }

    public static final b<char[]> c() {
        return C3707n.f13348c;
    }

    public static final b<double[]> d() {
        return C3711s.f13361c;
    }

    public static final b<float[]> e() {
        return C3716x.f13385c;
    }

    public static final b<int[]> f() {
        return D.f13266c;
    }

    public static final <T> b<List<T>> g(b<T> elementSerializer) {
        Intrinsics.j(elementSerializer, "elementSerializer");
        return new C3693e(elementSerializer);
    }

    public static final b<long[]> h() {
        return K.f13285c;
    }

    public static final <K, V> b<Map<K, V>> i(b<K> keySerializer, b<V> valueSerializer) {
        Intrinsics.j(keySerializer, "keySerializer");
        Intrinsics.j(valueSerializer, "valueSerializer");
        return new H(keySerializer, valueSerializer);
    }

    public static final b j() {
        return S.f13299a;
    }

    public static final b<short[]> k() {
        return p0.f13354c;
    }

    @ExperimentalUnsignedTypes
    public static final b<UByteArray> l() {
        return w0.f13384c;
    }

    @ExperimentalUnsignedTypes
    public static final b<UIntArray> m() {
        return z0.f13392c;
    }

    @ExperimentalUnsignedTypes
    public static final b<ULongArray> n() {
        return C0.f13265c;
    }

    @ExperimentalUnsignedTypes
    public static final b<UShortArray> o() {
        return F0.f13273c;
    }

    public static final <T> b<T> p(b<T> bVar) {
        Intrinsics.j(bVar, "<this>");
        return bVar.getDescriptor().g() ? bVar : new T(bVar);
    }

    public static final b<UByte> q(UByte.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return x0.f13386a;
    }

    public static final b<UInt> r(UInt.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return A0.f13258a;
    }

    public static final b<ULong> s(ULong.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return D0.f13267a;
    }

    public static final b<UShort> t(UShort.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return G0.f13274a;
    }

    public static final b<Unit> u(Unit unit) {
        Intrinsics.j(unit, "<this>");
        return H0.f13277b;
    }

    public static final b<Boolean> v(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.j(booleanCompanionObject, "<this>");
        return C3699h.f13331a;
    }

    public static final b<Byte> w(ByteCompanionObject byteCompanionObject) {
        Intrinsics.j(byteCompanionObject, "<this>");
        return C3704k.f13338a;
    }

    public static final b<Character> x(CharCompanionObject charCompanionObject) {
        Intrinsics.j(charCompanionObject, "<this>");
        return C3708o.f13349a;
    }

    public static final b<Double> y(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.j(doubleCompanionObject, "<this>");
        return C3712t.f13365a;
    }

    public static final b<Float> z(FloatCompanionObject floatCompanionObject) {
        Intrinsics.j(floatCompanionObject, "<this>");
        return C3717y.f13388a;
    }
}

package Av;

import Dv.A0;
import Dv.C0;
import Dv.C3135e;
import Dv.C3139g;
import Dv.C3141h;
import Dv.C3145j;
import Dv.C3146k;
import Dv.C3149n;
import Dv.C3150o;
import Dv.C3153s;
import Dv.C3154t;
import Dv.C3155u;
import Dv.C3158x;
import Dv.C3159y;
import Dv.D;
import Dv.D0;
import Dv.E;
import Dv.F0;
import Dv.G0;
import Dv.H;
import Dv.H0;
import Dv.I0;
import Dv.K;
import Dv.L;
import Dv.S;
import Dv.T;
import Dv.p0;
import Dv.q0;
import Dv.r0;
import Dv.w0;
import Dv.x0;
import Dv.z0;
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
import zv.b;

@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\r\u0010\u0007\u001a\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0007\u001a\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001¢\u0006\u0004\b\u001d\u0010\u0007\u001a\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0001H\u0007¢\u0006\u0004\b\u001f\u0010\u0007\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0001*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001¢\u0006\u0004\b%\u0010\u0007\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0001H\u0007¢\u0006\u0004\b'\u0010\u0007\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0001¢\u0006\u0004\b-\u0010\u0007\u001a\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0001*\u00020.¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0001¢\u0006\u0004\b3\u0010\u0007\u001a\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0001*\u000204¢\u0006\u0004\b6\u00107\u001a\u0013\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0001¢\u0006\u0004\b9\u0010\u0007\u001a\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0001*\u00020:¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0001*\u00020=¢\u0006\u0004\b?\u0010@\u001a-\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000C0\u0001\"\u0004\b\u0000\u0010A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bD\u0010E\u001aG\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J0\u0001\"\u0004\b\u0000\u0010F\"\u0004\b\u0001\u0010G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0004\bK\u0010L\u001a\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u0001*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u0001*\u00020Q¢\u0006\u0004\bS\u0010T\u001a\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u0001*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u0001*\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u0001*\u00020]¢\u0006\u0004\b_\u0010`\u001a\u0019\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u0001*\u00020aH\u0007¢\u0006\u0004\bc\u0010d\u001a\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u0001H\u0007¢\u0006\u0004\bf\u0010\u0007\"3\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010A*\u00020g*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\f\u0012\u0004\bi\u0010j\u001a\u0004\bh\u0010E¨\u0006l"}, d2 = {"Lkotlin/Char$Companion;", "Lzv/b;", "", "x", "(Lkotlin/jvm/internal/CharCompanionObject;)Lzv/b;", "", "c", "()Lzv/b;", "Lkotlin/Byte$Companion;", "", "w", "(Lkotlin/jvm/internal/ByteCompanionObject;)Lzv/b;", "", "b", "Lkotlin/UByteArray;", "l", "Lkotlin/Short$Companion;", "", "C", "(Lkotlin/jvm/internal/ShortCompanionObject;)Lzv/b;", "", "k", "Lkotlin/UShortArray;", "o", "Lkotlin/Int$Companion;", "", "A", "(Lkotlin/jvm/internal/IntCompanionObject;)Lzv/b;", "", "f", "Lkotlin/UIntArray;", "m", "Lkotlin/Long$Companion;", "", "B", "(Lkotlin/jvm/internal/LongCompanionObject;)Lzv/b;", "", "h", "Lkotlin/ULongArray;", "n", "Lkotlin/Float$Companion;", "", "z", "(Lkotlin/jvm/internal/FloatCompanionObject;)Lzv/b;", "", "e", "Lkotlin/Double$Companion;", "", "y", "(Lkotlin/jvm/internal/DoubleCompanionObject;)Lzv/b;", "", "d", "Lkotlin/Boolean$Companion;", "", "v", "(Lkotlin/jvm/internal/BooleanCompanionObject;)Lzv/b;", "", "a", "", "u", "(Lkotlin/Unit;)Lzv/b;", "Lkotlin/String$Companion;", "", "D", "(Lkotlin/jvm/internal/StringCompanionObject;)Lzv/b;", "T", "elementSerializer", "", "g", "(Lzv/b;)Lzv/b;", "K", "V", "keySerializer", "valueSerializer", "", "i", "(Lzv/b;Lzv/b;)Lzv/b;", "Lkotlin/UInt$Companion;", "Lkotlin/UInt;", "r", "(Lkotlin/UInt$Companion;)Lzv/b;", "Lkotlin/ULong$Companion;", "Lkotlin/ULong;", "s", "(Lkotlin/ULong$Companion;)Lzv/b;", "Lkotlin/UByte$Companion;", "Lkotlin/UByte;", "q", "(Lkotlin/UByte$Companion;)Lzv/b;", "Lkotlin/UShort$Companion;", "Lkotlin/UShort;", "t", "(Lkotlin/UShort$Companion;)Lzv/b;", "Lkotlin/time/Duration$Companion;", "Lkotlin/time/Duration;", "E", "(Lkotlin/time/Duration$Companion;)Lzv/b;", "Lkotlin/uuid/Uuid$Companion;", "Lkotlin/uuid/Uuid;", "F", "(Lkotlin/uuid/Uuid$Companion;)Lzv/b;", "", "j", "", "p", "getNullable$annotations", "(Lzv/b;)V", "nullable", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    public static final b<Integer> A(IntCompanionObject intCompanionObject) {
        Intrinsics.j(intCompanionObject, "<this>");
        return E.f6691a;
    }

    public static final b<Long> B(LongCompanionObject longCompanionObject) {
        Intrinsics.j(longCompanionObject, "<this>");
        return L.f6708a;
    }

    public static final b<Short> C(ShortCompanionObject shortCompanionObject) {
        Intrinsics.j(shortCompanionObject, "<this>");
        return q0.f6777a;
    }

    public static final b<String> D(StringCompanionObject stringCompanionObject) {
        Intrinsics.j(stringCompanionObject, "<this>");
        return r0.f6781a;
    }

    public static final b<Duration> E(Duration.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return C3155u.f6792a;
    }

    @ExperimentalUuidApi
    public static final b<Uuid> F(Uuid.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return I0.f6703a;
    }

    public static final b<boolean[]> a() {
        return C3139g.f6751c;
    }

    public static final b<byte[]> b() {
        return C3145j.f6758c;
    }

    public static final b<char[]> c() {
        return C3149n.f6770c;
    }

    public static final b<double[]> d() {
        return C3153s.f6783c;
    }

    public static final b<float[]> e() {
        return C3158x.f6807c;
    }

    public static final b<int[]> f() {
        return D.f6688c;
    }

    public static final <T> b<List<T>> g(b<T> elementSerializer) {
        Intrinsics.j(elementSerializer, "elementSerializer");
        return new C3135e(elementSerializer);
    }

    public static final b<long[]> h() {
        return K.f6707c;
    }

    public static final <K, V> b<Map<K, V>> i(b<K> keySerializer, b<V> valueSerializer) {
        Intrinsics.j(keySerializer, "keySerializer");
        Intrinsics.j(valueSerializer, "valueSerializer");
        return new H(keySerializer, valueSerializer);
    }

    public static final b j() {
        return S.f6721a;
    }

    public static final b<short[]> k() {
        return p0.f6776c;
    }

    @ExperimentalUnsignedTypes
    public static final b<UByteArray> l() {
        return w0.f6806c;
    }

    @ExperimentalUnsignedTypes
    public static final b<UIntArray> m() {
        return z0.f6814c;
    }

    @ExperimentalUnsignedTypes
    public static final b<ULongArray> n() {
        return C0.f6687c;
    }

    @ExperimentalUnsignedTypes
    public static final b<UShortArray> o() {
        return F0.f6695c;
    }

    public static final <T> b<T> p(b<T> bVar) {
        Intrinsics.j(bVar, "<this>");
        return bVar.getDescriptor().g() ? bVar : new T(bVar);
    }

    public static final b<UByte> q(UByte.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return x0.f6808a;
    }

    public static final b<UInt> r(UInt.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return A0.f6680a;
    }

    public static final b<ULong> s(ULong.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return D0.f6689a;
    }

    public static final b<UShort> t(UShort.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return G0.f6696a;
    }

    public static final b<Unit> u(Unit unit) {
        Intrinsics.j(unit, "<this>");
        return H0.f6699b;
    }

    public static final b<Boolean> v(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.j(booleanCompanionObject, "<this>");
        return C3141h.f6753a;
    }

    public static final b<Byte> w(ByteCompanionObject byteCompanionObject) {
        Intrinsics.j(byteCompanionObject, "<this>");
        return C3146k.f6760a;
    }

    public static final b<Character> x(CharCompanionObject charCompanionObject) {
        Intrinsics.j(charCompanionObject, "<this>");
        return C3150o.f6771a;
    }

    public static final b<Double> y(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.j(doubleCompanionObject, "<this>");
        return C3154t.f6787a;
    }

    public static final b<Float> z(FloatCompanionObject floatCompanionObject) {
        Intrinsics.j(floatCompanionObject, "<this>");
        return C3159y.f6810a;
    }
}

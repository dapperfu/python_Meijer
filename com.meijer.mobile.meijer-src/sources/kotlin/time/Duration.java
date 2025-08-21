package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@SinceKotlin
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b(\b\u0087@\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001VB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u000fJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000fJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J?\u00100\u001a\u00020/*\u00060)j\u0002`*2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010 \u001a\u00020&2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020&¢\u0006\u0004\b2\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u0014\u00109\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010;\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010@\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\b>\u0010?\u001a\u0004\b<\u0010=R\u001a\u0010B\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bA\u0010?\u001a\u0004\b4\u0010=R\u001a\u0010E\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bD\u0010?\u001a\u0004\bC\u0010=R\u001a\u0010H\u001a\u00020\u00068@X\u0081\u0004¢\u0006\f\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010=R\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010\u0005R\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010\u0005R\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\u0005R\u0011\u0010P\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bO\u0010\u0005R\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0005R\u0011\u0010T\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bS\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006W"}, d2 = {"Lkotlin/time/Duration;", "", "", "rawValue", "u", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "R", "(J)Z", "Q", "b0", "W", "(JJ)J", "thisMillis", "otherNanos", "l", "(JJJ)J", "V", "T", "U", "S", "P", "t", "(JJ)I", "Lkotlin/time/DurationUnit;", "unit", "", "X", "(JLkotlin/time/DurationUnit;)D", "Z", "(JLkotlin/time/DurationUnit;)J", "", "a0", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "m", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Y", "a", "J", "N", "value", "M", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "B", "absoluteValue", "C", "(J)I", "getHoursComponent$annotations", "()V", "hoursComponent", "getMinutesComponent$annotations", "minutesComponent", "L", "getSecondsComponent$annotations", "secondsComponent", "K", "getNanosecondsComponent$annotations", "nanosecondsComponent", "D", "inWholeDays", "E", "inWholeHours", "G", "inWholeMinutes", "I", "inWholeSeconds", "F", "inWholeMilliseconds", "H", "inWholeNanoseconds", "b", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
@WasExperimental
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class Duration implements Comparable<Duration> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f148408c = u(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f148409d = DurationKt.j(4611686018427387903L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f148410e = DurationKt.j(-4611686018427387903L);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "", "value", "Lkotlin/time/Duration;", "d", "(Ljava/lang/String;)J", "ZERO", "J", "c", "()J", "INFINITE", "a", "NEG_INFINITE", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long d(String value) {
            Intrinsics.j(value, "value");
            try {
                return DurationKt.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        public final long a() {
            return Duration.f148409d;
        }

        public final long b() {
            return Duration.f148410e;
        }

        public final long c() {
            return Duration.f148408c;
        }
    }

    private static final long N(long j10) {
        return j10 >> 1;
    }

    public static int O(long j10) {
        return Long.hashCode(j10);
    }

    private static final boolean Q(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean R(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean T(long j10) {
        return j10 < 0;
    }

    public static final boolean U(long j10) {
        return j10 > 0;
    }

    public static final /* synthetic */ Duration o(long j10) {
        return new Duration(j10);
    }

    public static boolean w(long j10, Object obj) {
        return (obj instanceof Duration) && j10 == ((Duration) obj).getRawValue();
    }

    public static final boolean z(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: c0, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    public boolean equals(Object other) {
        return w(this.rawValue, other);
    }

    public int hashCode() {
        return O(this.rawValue);
    }

    public static final long D(long j10) {
        return Z(j10, DurationUnit.f148420h);
    }

    public static final long E(long j10) {
        return Z(j10, DurationUnit.f148419g);
    }

    public static final long G(long j10) {
        return Z(j10, DurationUnit.f148418f);
    }

    public static final long I(long j10) {
        return Z(j10, DurationUnit.f148417e);
    }

    public static final boolean S(long j10) {
        return j10 == f148409d || j10 == f148410e;
    }

    public static final double X(long j10, DurationUnit unit) {
        Intrinsics.j(unit, "unit");
        if (j10 == f148409d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f148410e) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.a(N(j10), M(j10), unit);
    }

    public static final String Y(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (T(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jB = B(j10);
        long jE = E(jB);
        int iJ = J(jB);
        int iL = L(jB);
        int iK = K(jB);
        long j11 = S(j10) ? 9999999999999L : jE;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iL == 0 && iK == 0) ? false : true;
        if (iJ != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iJ);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            m(j10, sb2, iL, iK, 9, "S", true);
        }
        return sb2.toString();
    }

    public static final long Z(long j10, DurationUnit unit) {
        Intrinsics.j(unit, "unit");
        if (j10 == f148409d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f148410e) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.b(N(j10), M(j10), unit);
    }

    public static String a0(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f148409d) {
            return "Infinity";
        }
        if (j10 == f148410e) {
            return "-Infinity";
        }
        boolean zT = T(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zT) {
            sb2.append('-');
        }
        long jB = B(j10);
        long jD = D(jB);
        int iC = C(jB);
        int iJ = J(jB);
        int iL = L(jB);
        int iK = K(jB);
        int i10 = 0;
        boolean z10 = jD != 0;
        boolean z11 = iC != 0;
        boolean z12 = iJ != 0;
        boolean z13 = (iL == 0 && iK == 0) ? false : true;
        if (z10) {
            sb2.append(jD);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iC);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iJ);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iL != 0 || z10 || z11 || z12) {
                m(j10, sb2, iL, iK, 9, "s", false);
            } else if (iK >= 1000000) {
                m(j10, sb2, iK / 1000000, iK % 1000000, 6, "ms", false);
            } else if (iK >= 1000) {
                m(j10, sb2, iK / 1000, iK % 1000, 3, "us", false);
            } else {
                sb2.append(iK);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zT && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static int t(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.l(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return T(j10) ? -i10 : i10;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return p(duration.getRawValue());
    }

    public int p(long j10) {
        return t(this.rawValue, j10);
    }

    public String toString() {
        return a0(this.rawValue);
    }

    private /* synthetic */ Duration(long j10) {
        this.rawValue = j10;
    }

    public static final long B(long j10) {
        if (T(j10)) {
            return b0(j10);
        }
        return j10;
    }

    public static final int C(long j10) {
        if (S(j10)) {
            return 0;
        }
        return (int) (E(j10) % 24);
    }

    public static final long F(long j10) {
        if (Q(j10) && P(j10)) {
            return N(j10);
        }
        return Z(j10, DurationUnit.f148416d);
    }

    public static final long H(long j10) {
        long jN = N(j10);
        if (R(j10)) {
            return jN;
        }
        if (jN > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jN >= -9223372036854L) {
            return DurationKt.n(jN);
        }
        return Long.MIN_VALUE;
    }

    public static final int J(long j10) {
        if (S(j10)) {
            return 0;
        }
        return (int) (G(j10) % 60);
    }

    public static final int K(long j10) {
        long jN;
        if (S(j10)) {
            return 0;
        }
        if (Q(j10)) {
            jN = DurationKt.n(N(j10) % 1000);
        } else {
            jN = N(j10) % 1000000000;
        }
        return (int) jN;
    }

    public static final int L(long j10) {
        if (S(j10)) {
            return 0;
        }
        return (int) (I(j10) % 60);
    }

    private static final DurationUnit M(long j10) {
        if (R(j10)) {
            return DurationUnit.f148414b;
        }
        return DurationUnit.f148416d;
    }

    public static final boolean P(long j10) {
        return !S(j10);
    }

    public static final long V(long j10, long j11) {
        return W(j10, b0(j11));
    }

    public static final long W(long j10, long j11) {
        if (S(j10)) {
            if (!P(j11) && (j11 ^ j10) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j10;
        }
        if (S(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) == (((int) j11) & 1)) {
            long jN = N(j10) + N(j11);
            return R(j10) ? DurationKt.m(jN) : DurationKt.k(jN);
        }
        if (Q(j10)) {
            return l(j10, N(j10), N(j11));
        }
        return l(j10, N(j11), N(j10));
    }

    public static final long b0(long j10) {
        return DurationKt.i(-N(j10), ((int) j10) & 1);
    }

    private static final long l(long j10, long j11, long j12) {
        long jO = DurationKt.o(j12);
        long j13 = j11 + jO;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return DurationKt.j(RangesKt.p(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.l(DurationKt.n(j13) + (j12 - DurationKt.n(jO)));
    }

    private static final void m(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strC0 = StringsKt.C0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strC0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strC0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (!z10 && i15 < 3) {
                sb2.append((CharSequence) strC0, 0, i15);
                Intrinsics.i(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strC0, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.i(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static long u(long j10) {
        if (DurationJvmKt.a()) {
            if (R(j10)) {
                long jN = N(j10);
                if (-4611686018426999999L <= jN && jN < 4611686018427000000L) {
                    return j10;
                }
                throw new AssertionError(N(j10) + " ns is out of nanoseconds range");
            }
            long jN2 = N(j10);
            if (-4611686018427387903L <= jN2 && jN2 < 4611686018427387904L) {
                long jN3 = N(j10);
                if (-4611686018426L > jN3 || jN3 >= 4611686018427L) {
                    return j10;
                }
                throw new AssertionError(N(j10) + " ms is denormalized");
            }
            throw new AssertionError(N(j10) + " ms is out of milliseconds range");
        }
        return j10;
    }
}

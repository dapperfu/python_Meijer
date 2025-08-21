package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;

@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0016\u001a\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0016\u001a\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0016\u001a\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/Duration;", "s", "(ILkotlin/time/DurationUnit;)J", "", "t", "(JLkotlin/time/DurationUnit;)J", "", "r", "(DLkotlin/time/DurationUnit;)J", "", "value", "", "strictIso", "p", "(Ljava/lang/String;Z)J", "q", "(Ljava/lang/String;)J", "nanos", "o", "(J)J", "millis", "n", "normalNanos", "l", "normalMillis", "j", "normalValue", "unitDiscriminator", "i", "(JI)J", "m", "k", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DurationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return Duration.u((j10 << 1) + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        return Duration.u((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return Duration.u(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        boolean z11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Duration.Companion companion = Duration.INSTANCE;
        long jC = companion.c();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && StringsKt.h1(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            DurationUnit durationUnit = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i13);
                        if (c11 > cCharAt4 || cCharAt4 >= c10) {
                            i11 = length;
                            if (!StringsKt.c0("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i13++;
                        length = i11;
                        c11 = '0';
                        c10 = ':';
                    }
                    Intrinsics.h(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    Intrinsics.i(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i12 = length3 + 1;
                    DurationUnit durationUnitD = DurationUnitKt__DurationUnitKt.d(cCharAt5, z14);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iP0 = StringsKt.p0(strSubstring, '.', 0, false, 6, null);
                    if (durationUnitD != DurationUnit.f148417e || iP0 <= 0) {
                        z11 = z14;
                        jC = Duration.W(jC, t(q(strSubstring), durationUnitD));
                    } else {
                        Intrinsics.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iP0);
                        Intrinsics.i(strSubstring2, "substring(...)");
                        z11 = z14;
                        long jW = Duration.W(jC, t(q(strSubstring2), durationUnitD));
                        Intrinsics.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iP0);
                        Intrinsics.i(strSubstring3, "substring(...)");
                        jC = Duration.W(jW, r(Double.parseDouble(strSubstring3), durationUnitD));
                    }
                    z14 = z11;
                    durationUnit = durationUnitD;
                    length = i11;
                    c11 = '0';
                    c10 = ':';
                } else {
                    if (z14 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            char c12 = '0';
            if (StringsKt.K(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jC = companion.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && StringsKt.L1(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z15 = true;
                } else {
                    i10 = length;
                }
                boolean z16 = false;
                DurationUnit durationUnit2 = null;
                while (length2 < i10) {
                    if (z16 && z15) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i15++;
                    }
                    Intrinsics.h(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    Intrinsics.i(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    Intrinsics.h(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    Intrinsics.i(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitE = DurationUnitKt__DurationUnitKt.e(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iP02 = StringsKt.p0(strSubstring4, '.', 0, false, 6, null);
                    if (iP02 > 0) {
                        Intrinsics.h(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iP02);
                        Intrinsics.i(strSubstring6, "substring(...)");
                        long jW2 = Duration.W(jC, t(Long.parseLong(strSubstring6), durationUnitE));
                        Intrinsics.h(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iP02);
                        Intrinsics.i(strSubstring7, "substring(...)");
                        jC = Duration.W(jW2, r(Double.parseDouble(strSubstring7), durationUnitE));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jC = Duration.W(jC, t(Long.parseLong(strSubstring4), durationUnitE));
                    }
                    durationUnit2 = durationUnitE;
                    z16 = true;
                    c12 = '0';
                }
            }
        }
        return z13 ? Duration.b0(jC) : jC;
    }

    @SinceKotlin
    @WasExperimental
    public static final long r(double d10, DurationUnit unit) {
        Intrinsics.j(unit, "unit");
        double dA = DurationUnitKt__DurationUnitJvmKt.a(d10, unit, DurationUnit.f148414b);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jE = MathKt.e(dA);
        return (-4611686018426999999L > jE || jE >= 4611686018427000000L) ? k(MathKt.e(DurationUnitKt__DurationUnitJvmKt.a(d10, unit, DurationUnit.f148416d))) : l(jE);
    }

    @SinceKotlin
    @WasExperimental
    public static final long s(int i10, DurationUnit unit) {
        Intrinsics.j(unit, "unit");
        return unit.compareTo(DurationUnit.f148417e) <= 0 ? l(DurationUnitKt__DurationUnitJvmKt.c(i10, unit, DurationUnit.f148414b)) : t(i10, unit);
    }

    @SinceKotlin
    @WasExperimental
    public static final long t(long j10, DurationUnit unit) {
        Intrinsics.j(unit, "unit");
        DurationUnit durationUnit = DurationUnit.f148414b;
        long jC = DurationUnitKt__DurationUnitJvmKt.c(4611686018426999999L, durationUnit, unit);
        return ((-jC) > j10 || j10 > jC) ? j(RangesKt.p(DurationUnitKt__DurationUnitJvmKt.b(j10, unit, DurationUnit.f148416d), -4611686018427387903L, 4611686018427387903L)) : l(DurationUnitKt__DurationUnitJvmKt.c(j10, unit, durationUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j10) {
        return j10 / 1000000;
    }

    private static final long q(String str) {
        int i10;
        char cCharAt;
        int length = str.length();
        if (length > 0 && StringsKt.c0("+-", str.charAt(0), false, 2, null)) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
            }
        }
        if (StringsKt.W(str, "+", false, 2, null) && length > 1 && '0' <= (cCharAt = str.charAt(1)) && cCharAt < ':') {
            return Long.parseLong(StringsKt.I1(str, 1));
        }
        return Long.parseLong(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        if (-4611686018426L <= j10 && j10 < 4611686018427L) {
            return l(n(j10));
        }
        return j(RangesKt.p(j10, -4611686018427387903L, 4611686018427387903L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        if (-4611686018426999999L <= j10 && j10 < 4611686018427000000L) {
            return l(j10);
        }
        return j(o(j10));
    }
}

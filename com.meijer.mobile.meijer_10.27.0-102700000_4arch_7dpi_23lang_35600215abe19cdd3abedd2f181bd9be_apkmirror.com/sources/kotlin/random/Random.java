package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\b'\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "<init>", "()V", "", "bitCount", "b", "(I)I", "f", "()I", "until", "g", "from", "h", "(II)I", "", "c", "()D", "d", "(D)D", "e", "(DD)D", "a", "Default", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class Random {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Random f142880b = PlatformImplementationsKt.f142682a.b();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "bitCount", "b", "(I)I", "f", "()I", "until", "g", "from", "h", "(II)I", "", "c", "()D", "d", "(D)D", "e", "(DD)D", "defaultRandom", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlin.random.Random$Default, reason: from kotlin metadata */
    public static final class Companion extends Random implements Serializable {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // kotlin.random.Random
        public int b(int bitCount) {
            return Random.f142880b.b(bitCount);
        }

        @Override // kotlin.random.Random
        public double c() {
            return Random.f142880b.c();
        }

        @Override // kotlin.random.Random
        public double d(double until) {
            return Random.f142880b.d(until);
        }

        @Override // kotlin.random.Random
        public double e(double from, double until) {
            return Random.f142880b.e(from, until);
        }

        @Override // kotlin.random.Random
        public int f() {
            return Random.f142880b.f();
        }

        @Override // kotlin.random.Random
        public int g(int until) {
            return Random.f142880b.g(until);
        }

        @Override // kotlin.random.Random
        public int h(int from, int until) {
            return Random.f142880b.h(from, until);
        }
    }

    public abstract int b(int bitCount);

    public int g(int until) {
        return h(0, until);
    }

    public double c() {
        return PlatformRandomKt.a(b(26), b(27));
    }

    public double d(double until) {
        return e(0.0d, until);
    }

    public int f() {
        return b(32);
    }

    public double e(double from, double until) {
        double dC;
        RandomKt.b(from, until);
        double d10 = until - from;
        if (Double.isInfinite(d10) && Math.abs(from) <= Double.MAX_VALUE && Math.abs(until) <= Double.MAX_VALUE) {
            double d11 = 2;
            double dC2 = c() * ((until / d11) - (from / d11));
            dC = from + dC2 + dC2;
        } else {
            dC = from + (c() * d10);
        }
        if (dC >= until) {
            return Math.nextAfter(until, Double.NEGATIVE_INFINITY);
        }
        return dC;
    }

    public int h(int from, int until) {
        int iF;
        int i10;
        int iB;
        RandomKt.c(from, until);
        int i11 = until - from;
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            if (((-i11) & i11) == i11) {
                iB = b(RandomKt.d(i11));
            } else {
                do {
                    iF = f() >>> 1;
                    i10 = iF % i11;
                } while ((iF - i10) + (i11 - 1) < 0);
                iB = i10;
            }
            return from + iB;
        }
        while (true) {
            int iF2 = f();
            if (from <= iF2 && iF2 < until) {
                return iF2;
            }
        }
    }
}

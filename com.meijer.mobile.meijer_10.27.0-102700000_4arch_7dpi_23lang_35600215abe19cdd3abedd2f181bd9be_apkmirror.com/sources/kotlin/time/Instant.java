package kotlin.time;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SinceKotlin
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001d"}, d2 = {"Lkotlin/time/Instant;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "epochSeconds", "", "nanosecondsOfSecond", "<init>", "(JI)V", "other", "a", "(Lkotlin/time/Instant;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "b", "()J", "I", "e", "c", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
@ExperimentalTime
/* loaded from: classes13.dex */
public final class Instant implements Comparable<Instant>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final Instant f147517d = new Instant(-31557014167219200L, 0);

    /* renamed from: e, reason: collision with root package name */
    private static final Instant f147518e = new Instant(31556889864403199L, 999999999);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long epochSeconds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int nanosecondsOfSecond;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Instant other) {
        Intrinsics.j(other, "other");
        int iL = Intrinsics.l(this.epochSeconds, other.epochSeconds);
        return iL != 0 ? iL : Intrinsics.k(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    /* renamed from: b, reason: from getter */
    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    /* renamed from: e, reason: from getter */
    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) other;
        return this.epochSeconds == instant.epochSeconds && this.nanosecondsOfSecond == instant.nanosecondsOfSecond;
    }

    public int hashCode() {
        return Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    public Instant(long j10, int i10) {
        this.epochSeconds = j10;
        this.nanosecondsOfSecond = i10;
        if (-31557014167219200L <= j10 && j10 < 31556889864403200L) {
        } else {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    public String toString() {
        return InstantKt.b(this);
    }
}

package kotlin.time;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.AbstractLongTimeSource;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

@SinceKotlin
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H$¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "b", "()J", "f", "Lkotlin/time/ComparableTimeMark;", "e", "()Lkotlin/time/ComparableTimeMark;", "a", "Lkotlin/time/DurationUnit;", "c", "()Lkotlin/time/DurationUnit;", "Lkotlin/Lazy;", "d", "zero", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
/* loaded from: classes13.dex */
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DurationUnit unit;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy zero;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$a;", "Lkotlin/time/ComparableTimeMark;", "", "startedAt", "Lkotlin/time/AbstractLongTimeSource;", "timeSource", "Lkotlin/time/Duration;", "offset", "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "d", "(Lkotlin/time/ComparableTimeMark;)J", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "Lkotlin/time/AbstractLongTimeSource;", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kotlin.time.AbstractLongTimeSource$a, reason: from toString */
    private static final class LongTimeMark implements ComparableTimeMark {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long startedAt;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractLongTimeSource timeSource;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long offset;

        public /* synthetic */ LongTimeMark(long j10, AbstractLongTimeSource abstractLongTimeSource, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, abstractLongTimeSource, j11);
        }

        private LongTimeMark(long j10, AbstractLongTimeSource timeSource, long j11) {
            Intrinsics.j(timeSource, "timeSource");
            this.startedAt = j10;
            this.timeSource = timeSource;
            this.offset = j11;
        }

        @Override // kotlin.time.ComparableTimeMark
        public long d(ComparableTimeMark other) {
            Intrinsics.j(other, "other");
            if (other instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) other;
                if (Intrinsics.e(this.timeSource, longTimeMark.timeSource)) {
                    return Duration.W(LongSaturatedMathKt.c(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), Duration.V(this.offset, longTimeMark.offset));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public boolean equals(Object other) {
            return (other instanceof LongTimeMark) && Intrinsics.e(this.timeSource, ((LongTimeMark) other).timeSource) && Duration.z(d((ComparableTimeMark) other), Duration.INSTANCE.c());
        }

        public int hashCode() {
            return (Duration.O(this.offset) * 37) + Long.hashCode(this.startedAt);
        }

        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.f(this.timeSource.getUnit()) + " + " + ((Object) Duration.a0(this.offset)) + ", " + this.timeSource + ')';
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.a(this, comparableTimeMark);
        }
    }

    protected abstract long f();

    public AbstractLongTimeSource(DurationUnit unit) {
        Intrinsics.j(unit, "unit");
        this.unit = unit;
        this.zero = LazyKt.b(new Function0() { // from class: pv.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(AbstractLongTimeSource.g(this.f156642a));
            }
        });
    }

    private final long d() {
        return ((Number) this.zero.getValue()).longValue();
    }

    /* renamed from: c, reason: from getter */
    protected final DurationUnit getUnit() {
        return this.unit;
    }

    public ComparableTimeMark e() {
        return new LongTimeMark(b(), this, Duration.INSTANCE.c(), null);
    }

    private final long b() {
        return f() - d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(AbstractLongTimeSource abstractLongTimeSource) {
        return abstractLongTimeSource.f();
    }
}

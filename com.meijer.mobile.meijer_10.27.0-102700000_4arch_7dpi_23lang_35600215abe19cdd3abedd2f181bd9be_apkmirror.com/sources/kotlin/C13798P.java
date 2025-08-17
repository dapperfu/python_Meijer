package kotlin;

import g1.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00020\b*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\b*\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Lf0/P;", "", "Lf0/z;", "orientation", "LU0/f;", "initialPositionChange", "<init>", "(Lf0/z;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "touchSlop", "b", "(F)J", "d", "(J)F", "c", "Lg1/B;", "dragEvent", "a", "(Lg1/B;F)J", "", "e", "()V", "Lf0/z;", "getOrientation", "()Lf0/z;", "J", "totalPositionChange", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13798P {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EnumC13827z orientation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long totalPositionChange;

    public /* synthetic */ C13798P(EnumC13827z enumC13827z, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC13827z, j10);
    }

    private C13798P(EnumC13827z enumC13827z, long j10) {
        this.orientation = enumC13827z;
        this.totalPositionChange = j10;
    }

    private final long b(float touchSlop) {
        if (this.orientation == null) {
            long j10 = this.totalPositionChange;
            return U0.f.p(this.totalPositionChange, U0.f.r(U0.f.h(j10, U0.f.k(j10)), touchSlop));
        }
        float fD = d(this.totalPositionChange) - (Math.signum(d(this.totalPositionChange)) * touchSlop);
        float fC = c(this.totalPositionChange);
        if (this.orientation == EnumC13827z.f130586b) {
            return U0.f.e((Float.floatToRawIntBits(fD) << 32) | (Float.floatToRawIntBits(fC) & 4294967295L));
        }
        return U0.f.e((Float.floatToRawIntBits(fC) << 32) | (Float.floatToRawIntBits(fD) & 4294967295L));
    }

    public final float c(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == EnumC13827z.f130586b ? j10 & 4294967295L : j10 >> 32));
    }

    public final float d(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == EnumC13827z.f130586b ? j10 >> 32 : j10 & 4294967295L));
    }

    public final void e() {
        this.totalPositionChange = U0.f.INSTANCE.c();
    }

    public final long a(PointerInputChange dragEvent, float touchSlop) {
        float fAbs;
        long jQ = U0.f.q(this.totalPositionChange, U0.f.p(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = jQ;
        if (this.orientation == null) {
            fAbs = U0.f.k(jQ);
        } else {
            fAbs = Math.abs(d(jQ));
        }
        if (fAbs >= touchSlop) {
            return b(touchSlop);
        }
        return U0.f.INSTANCE.b();
    }

    public /* synthetic */ C13798P(EnumC13827z enumC13827z, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : enumC13827z, (i10 & 2) != 0 ? U0.f.INSTANCE.c() : j10, null);
    }
}

package kotlin;

import i0.C14589e;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln0/i;", "", "<init>", "()V", "", "start", "end", "Ln0/i$a;", "a", "(II)Ln0/i$a;", "interval", "", "e", "(Ln0/i$a;)V", "", "d", "()Z", "LD0/c;", "LD0/c;", "beyondBoundsItems", "c", "()I", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15749i {

    /* renamed from: b, reason: collision with root package name */
    public static final int f150900b = D0.c.f4990d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0.c<Interval> beyondBoundsItems = new D0.c<>(new Interval[16], 0);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Ln0/i$a;", "", "", "start", "end", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: n0.i$a, reason: from toString */
    public static final /* data */ class Interval {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) other;
            return this.start == interval.start && this.end == interval.end;
        }

        /* renamed from: a, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }

        public Interval(int i10, int i11) {
            boolean z10;
            this.start = i10;
            this.end = i11;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C14589e.a("negative start index");
            }
            if (!(i11 >= i10)) {
                C14589e.a("end index greater than start");
            }
        }
    }

    public final Interval a(int start, int end) {
        Interval interval = new Interval(start, end);
        this.beyondBoundsItems.c(interval);
        return interval;
    }

    public final int b() {
        int end = this.beyondBoundsItems.n().getEnd();
        D0.c<Interval> cVar = this.beyondBoundsItems;
        Interval[] intervalArr = cVar.content;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Interval interval = intervalArr[i10];
            if (interval.getEnd() > end) {
                end = interval.getEnd();
            }
        }
        return end;
    }

    public final int c() {
        int start = this.beyondBoundsItems.n().getStart();
        D0.c<Interval> cVar = this.beyondBoundsItems;
        Interval[] intervalArr = cVar.content;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Interval interval = intervalArr[i10];
            if (interval.getStart() < start) {
                start = interval.getStart();
            }
        }
        if (!(start >= 0)) {
            C14589e.a("negative minIndex");
        }
        return start;
    }

    public final boolean d() {
        return this.beyondBoundsItems.getSize() != 0;
    }

    public final void e(Interval interval) {
        this.beyondBoundsItems.s(interval);
    }
}

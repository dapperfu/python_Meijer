package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "", "step", "<init>", "(CCI)V", "Lkotlin/collections/CharIterator;", "k", "()Lkotlin/collections/CharIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "C", "f", "()C", "first", "b", "h", "last", "c", "I", "getStep", "d", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CharProgression implements Iterable<Character>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final char first;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char last;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int step;

    public boolean equals(Object other) {
        if (!(other instanceof CharProgression)) {
            return false;
        }
        if (isEmpty() && ((CharProgression) other).isEmpty()) {
            return true;
        }
        CharProgression charProgression = (CharProgression) other;
        return this.first == charProgression.first && this.last == charProgression.last && this.step == charProgression.step;
    }

    /* renamed from: f, reason: from getter */
    public final char getFirst() {
        return this.first;
    }

    /* renamed from: h, reason: from getter */
    public final char getLast() {
        return this.last;
    }

    public boolean isEmpty() {
        return this.step > 0 ? Intrinsics.k(this.first, this.last) > 0 : Intrinsics.k(this.first, this.last) < 0;
    }

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public CharIterator iterator() {
        return new CharProgressionIterator(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.step > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.first);
            sb2.append("..");
            sb2.append(this.last);
            sb2.append(" step ");
            i10 = this.step;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.first);
            sb2.append(" downTo ");
            sb2.append(this.last);
            sb2.append(" step ");
            i10 = -this.step;
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public CharProgression(char c10, char c11, int i10) {
        if (i10 != 0) {
            if (i10 != Integer.MIN_VALUE) {
                this.first = c10;
                this.last = (char) ProgressionUtilKt.c(c10, c11, i10);
                this.step = i10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }
}

package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u0014¨\u0006#"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "", "step", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "f", "first", "b", "h", "last", "c", "getStep", "d", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
/* loaded from: classes14.dex */
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int first;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int last;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int step;

    public /* synthetic */ UIntProgression(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12);
    }

    private UIntProgression(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i10;
        this.last = UProgressionUtilKt.d(i10, i11, i12);
        this.step = i12;
    }

    public boolean equals(Object other) {
        if (!(other instanceof UIntProgression)) {
            return false;
        }
        if (isEmpty() && ((UIntProgression) other).isEmpty()) {
            return true;
        }
        UIntProgression uIntProgression = (UIntProgression) other;
        return this.first == uIntProgression.first && this.last == uIntProgression.last && this.step == uIntProgression.step;
    }

    /* renamed from: f, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    /* renamed from: h, reason: from getter */
    public final int getLast() {
        return this.last;
    }

    public boolean isEmpty() {
        return this.step > 0 ? Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE) > 0 : Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE) < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<UInt> iterator() {
        return new e(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.step > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) UInt.m(this.first));
            sb2.append("..");
            sb2.append((Object) UInt.m(this.last));
            sb2.append(" step ");
            i10 = this.step;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) UInt.m(this.first));
            sb2.append(" downTo ");
            sb2.append((Object) UInt.m(this.last));
            sb2.append(" step ");
            i10 = -this.step;
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }
}

package I0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0014\u0010\u0005¨\u0006\u0015"}, d2 = {"LI0/b;", "", "", "count", "<init>", "(I)V", "that", "", "b", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: I0.b, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class DeltaCounter {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private int count;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeltaCounter) && this.count == ((DeltaCounter) other).count;
    }

    public DeltaCounter(int i10) {
        this.count = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final void b(int that) {
        this.count += that;
    }

    public final void c(int i10) {
        this.count = i10;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public /* synthetic */ DeltaCounter(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}

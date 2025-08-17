package Q6;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"LQ6/p;", "", "", "itemsTrimmed", "dataTrimmed", "<init>", "(II)V", "a", "()I", "b", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "d", "c", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: Q6.p, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class TrimMetrics {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemsTrimmed;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int dataTrimmed;

    /* renamed from: a, reason: from getter */
    public final int getItemsTrimmed() {
        return this.itemsTrimmed;
    }

    /* renamed from: b, reason: from getter */
    public final int getDataTrimmed() {
        return this.dataTrimmed;
    }

    public final int c() {
        return this.dataTrimmed;
    }

    public final int d() {
        return this.itemsTrimmed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrimMetrics)) {
            return false;
        }
        TrimMetrics trimMetrics = (TrimMetrics) other;
        return this.itemsTrimmed == trimMetrics.itemsTrimmed && this.dataTrimmed == trimMetrics.dataTrimmed;
    }

    public int hashCode() {
        return (this.itemsTrimmed * 31) + this.dataTrimmed;
    }

    public String toString() {
        return "TrimMetrics(itemsTrimmed=" + this.itemsTrimmed + ", dataTrimmed=" + this.dataTrimmed + ")";
    }

    public TrimMetrics(int i10, int i11) {
        this.itemsTrimmed = i10;
        this.dataTrimmed = i11;
    }
}

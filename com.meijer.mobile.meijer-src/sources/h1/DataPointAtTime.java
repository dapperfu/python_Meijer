package h1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lh1/a;", "", "", "time", "", "dataPoint", "<init>", "(JF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "d", "(J)V", "F", "()F", "c", "(F)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: h1.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class DataPointAtTime {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long time;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private float dataPoint;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) other;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    /* renamed from: a, reason: from getter */
    public final float getDataPoint() {
        return this.dataPoint;
    }

    /* renamed from: b, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final void c(float f10) {
        this.dataPoint = f10;
    }

    public final void d(long j10) {
        this.time = j10;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Float.hashCode(this.dataPoint);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.time + ", dataPoint=" + this.dataPoint + ')';
    }

    public DataPointAtTime(long j10, float f10) {
        this.time = j10;
        this.dataPoint = f10;
    }
}

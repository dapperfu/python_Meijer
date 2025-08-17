package g1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R*\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lg1/d;", "", "", "uptimeMillis", "LU0/f;", "position", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "originalEventPosition", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "a", "J", "c", "()J", "b", "<set-?>", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g1.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class HistoricalChange {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long originalEventPosition;

    public /* synthetic */ HistoricalChange(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public /* synthetic */ HistoricalChange(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    /* renamed from: a, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: b, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: c, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) U0.f.s(this.position)) + ')';
    }

    private HistoricalChange(long j10, long j11) {
        this.uptimeMillis = j10;
        this.position = j11;
        this.originalEventPosition = U0.f.INSTANCE.c();
    }

    private HistoricalChange(long j10, long j11, long j12) {
        this(j10, j11, (DefaultConstructorMarker) null);
        this.originalEventPosition = j12;
    }
}

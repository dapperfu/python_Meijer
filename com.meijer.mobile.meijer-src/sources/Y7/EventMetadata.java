package Y7;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0006\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001d"}, d2 = {"LY7/f;", "", "", PreferencesHelper.PREF_ID, "timestamp", "", "isPriorityData", "", "eventSizeBytes", "<init>", "(JJZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "getTimestamp", "c", "Z", "()Z", "d", "I", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Y7.f, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class EventMetadata {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPriorityData;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int eventSizeBytes;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return this.id == eventMetadata.id && this.timestamp == eventMetadata.timestamp && this.isPriorityData == eventMetadata.isPriorityData && this.eventSizeBytes == eventMetadata.eventSizeBytes;
    }

    /* renamed from: a, reason: from getter */
    public final int getEventSizeBytes() {
        return this.eventSizeBytes;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isPriorityData)) * 31) + Integer.hashCode(this.eventSizeBytes);
    }

    public String toString() {
        return "EventMetadata(id=" + this.id + ", timestamp=" + this.timestamp + ", isPriorityData=" + this.isPriorityData + ", eventSizeBytes=" + this.eventSizeBytes + ')';
    }

    public EventMetadata(long j10, long j11, boolean z10, int i10) {
        this.id = j10;
        this.timestamp = j11;
        this.isPriorityData = z10;
        this.eventSizeBytes = i10;
    }
}

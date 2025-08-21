package sf;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsf/c;", "", "", "sessionId", "", "timestamp", "", "additionalCustomKeys", "<init>", "(Ljava/lang/String;JLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "c", "()J", "Ljava/util/Map;", "()Ljava/util/Map;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: sf.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class EventMetadata {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> additionalCustomKeys;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EventMetadata(String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        Intrinsics.j(sessionId, "sessionId");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return Intrinsics.e(this.sessionId, eventMetadata.sessionId) && this.timestamp == eventMetadata.timestamp && Intrinsics.e(this.additionalCustomKeys, eventMetadata.additionalCustomKeys);
    }

    @JvmOverloads
    public EventMetadata(String sessionId, long j10, Map<String, String> additionalCustomKeys) {
        Intrinsics.j(sessionId, "sessionId");
        Intrinsics.j(additionalCustomKeys, "additionalCustomKeys");
        this.sessionId = sessionId;
        this.timestamp = j10;
        this.additionalCustomKeys = additionalCustomKeys;
    }

    public final Map<String, String> a() {
        return this.additionalCustomKeys;
    }

    /* renamed from: b, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.additionalCustomKeys.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", additionalCustomKeys=" + this.additionalCustomKeys + ')';
    }

    public /* synthetic */ EventMetadata(String str, long j10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? MapsKt.k() : map);
    }
}

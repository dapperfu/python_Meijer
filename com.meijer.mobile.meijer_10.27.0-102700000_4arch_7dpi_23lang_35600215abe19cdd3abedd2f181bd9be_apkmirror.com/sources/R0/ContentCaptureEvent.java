package R0;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"LR0/m;", "", "", PreferencesHelper.PREF_ID, "", "timestamp", "LR0/n;", "type", "Ln1/f;", "structureCompat", "<init>", "(IJLR0/n;Ln1/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "J", "getTimestamp", "()J", "c", "LR0/n;", "()LR0/n;", "d", "Ln1/f;", "()Ln1/f;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: R0.m, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class ContentCaptureEvent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final n type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final n1.f structureCompat;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) other;
        return this.id == contentCaptureEvent.id && this.timestamp == contentCaptureEvent.timestamp && this.type == contentCaptureEvent.type && Intrinsics.e(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    /* renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final n1.f getStructureCompat() {
        return this.structureCompat;
    }

    /* renamed from: c, reason: from getter */
    public final n getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.timestamp)) * 31) + this.type.hashCode()) * 31;
        n1.f fVar = this.structureCompat;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }

    public ContentCaptureEvent(int i10, long j10, n nVar, n1.f fVar) {
        this.id = i10;
        this.timestamp = j10;
        this.type = nVar;
        this.structureCompat = fVar;
    }
}

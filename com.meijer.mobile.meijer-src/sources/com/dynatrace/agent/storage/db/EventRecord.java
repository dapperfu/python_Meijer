package com.dynatrace.agent.storage.db;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/dynatrace/agent/storage/db/EventRecord;", "", "", PreferencesHelper.PREF_ID, "", "event", "timestamp", "", "isPriorityData", "", "eventSizeBytes", "<init>", "(JLjava/lang/String;JZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "d", "Z", "e", "()Z", "I", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EventRecord {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String event;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPriorityData;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int eventSizeBytes;

    public EventRecord(long j10, String event, long j11, boolean z10, int i10) {
        Intrinsics.j(event, "event");
        this.id = j10;
        this.event = event;
        this.timestamp = j11;
        this.isPriorityData = z10;
        this.eventSizeBytes = i10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventRecord)) {
            return false;
        }
        EventRecord eventRecord = (EventRecord) other;
        return this.id == eventRecord.id && Intrinsics.e(this.event, eventRecord.event) && this.timestamp == eventRecord.timestamp && this.isPriorityData == eventRecord.isPriorityData && this.eventSizeBytes == eventRecord.eventSizeBytes;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.event.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.isPriorityData)) * 31) + Integer.hashCode(this.eventSizeBytes);
    }

    public String toString() {
        return "EventRecord(id=" + this.id + ", event=" + this.event + ", timestamp=" + this.timestamp + ", isPriorityData=" + this.isPriorityData + ", eventSizeBytes=" + this.eventSizeBytes + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    /* renamed from: b, reason: from getter */
    public final int getEventSizeBytes() {
        return this.eventSizeBytes;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsPriorityData() {
        return this.isPriorityData;
    }

    public /* synthetic */ EventRecord(long j10, String str, long j11, boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, str, j11, z10, i10);
    }
}

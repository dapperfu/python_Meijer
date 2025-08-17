package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyEventData;", "", "appInstanceId", "", "events", "", "Lcom/radiusnetworks/flybuy/api/model/NotifyEvent;", "(Ljava/lang/String;Ljava/util/List;)V", "getAppInstanceId", "()Ljava/lang/String;", "getEvents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotifyEventData {

    @InterfaceC15617c("app_instance_id")
    private final String appInstanceId;
    private final List<NotifyEvent> events;

    public NotifyEventData(String appInstanceId, List<NotifyEvent> events) {
        Intrinsics.j(appInstanceId, "appInstanceId");
        Intrinsics.j(events, "events");
        this.appInstanceId = appInstanceId;
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotifyEventData copy$default(NotifyEventData notifyEventData, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notifyEventData.appInstanceId;
        }
        if ((i10 & 2) != 0) {
            list = notifyEventData.events;
        }
        return notifyEventData.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppInstanceId() {
        return this.appInstanceId;
    }

    public final List<NotifyEvent> component2() {
        return this.events;
    }

    public final NotifyEventData copy(String appInstanceId, List<NotifyEvent> events) {
        Intrinsics.j(appInstanceId, "appInstanceId");
        Intrinsics.j(events, "events");
        return new NotifyEventData(appInstanceId, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyEventData)) {
            return false;
        }
        NotifyEventData notifyEventData = (NotifyEventData) other;
        return Intrinsics.e(this.appInstanceId, notifyEventData.appInstanceId) && Intrinsics.e(this.events, notifyEventData.events);
    }

    public final String getAppInstanceId() {
        return this.appInstanceId;
    }

    public final List<NotifyEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode() + (this.appInstanceId.hashCode() * 31);
    }

    public String toString() {
        return "NotifyEventData(appInstanceId=" + this.appInstanceId + ", events=" + this.events + ')';
    }
}

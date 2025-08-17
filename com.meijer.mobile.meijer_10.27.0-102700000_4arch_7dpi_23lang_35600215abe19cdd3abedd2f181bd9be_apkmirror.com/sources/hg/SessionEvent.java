package hg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lhg/I;", "", "Lhg/j;", "eventType", "Lhg/P;", "sessionData", "Lhg/b;", "applicationInfo", "<init>", "(Lhg/j;Lhg/P;Lhg/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhg/j;", "b", "()Lhg/j;", "Lhg/P;", "c", "()Lhg/P;", "Lhg/b;", "()Lhg/b;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.I, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SessionEvent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC14438j eventType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SessionInfo sessionData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApplicationInfo applicationInfo;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) other;
        return this.eventType == sessionEvent.eventType && Intrinsics.e(this.sessionData, sessionEvent.sessionData) && Intrinsics.e(this.applicationInfo, sessionEvent.applicationInfo);
    }

    public SessionEvent(EnumC14438j eventType, SessionInfo sessionData, ApplicationInfo applicationInfo) {
        Intrinsics.j(eventType, "eventType");
        Intrinsics.j(sessionData, "sessionData");
        Intrinsics.j(applicationInfo, "applicationInfo");
        this.eventType = eventType;
        this.sessionData = sessionData;
        this.applicationInfo = applicationInfo;
    }

    /* renamed from: a, reason: from getter */
    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    /* renamed from: b, reason: from getter */
    public final EnumC14438j getEventType() {
        return this.eventType;
    }

    /* renamed from: c, reason: from getter */
    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return (((this.eventType.hashCode() * 31) + this.sessionData.hashCode()) * 31) + this.applicationInfo.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.eventType + ", sessionData=" + this.sessionData + ", applicationInfo=" + this.applicationInfo + ')';
    }
}

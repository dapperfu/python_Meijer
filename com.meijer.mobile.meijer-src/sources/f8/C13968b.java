package f8;

import K7.j;
import X7.SessionInformationMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import u7.h;
import y7.InterfaceC18294a;
import z8.f;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf8/b;", "", "Lu7/h;", "rumEventDispatcher", "LK7/j;", "sessionInformationProvider", "Ly7/a;", "timeProvider", "<init>", "(Lu7/h;LK7/j;Ly7/a;)V", "Lorg/json/JSONObject;", "userInteractionJson", "", "a", "(Lorg/json/JSONObject;)V", "Lu7/h;", "b", "LK7/j;", "c", "Ly7/a;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13968b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h rumEventDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    public C13968b(h rumEventDispatcher, j sessionInformationProvider, InterfaceC18294a timeProvider) {
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.j(timeProvider, "timeProvider");
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.timeProvider = timeProvider;
    }

    public final void a(JSONObject userInteractionJson) {
        Intrinsics.j(userInteractionJson, "userInteractionJson");
        SessionInformationMetrics sessionInformationMetricsA = this.sessionInformationProvider.a();
        if (!sessionInformationMetricsA.getIsGrailEventsCanBeCaptured()) {
            f.a("dtxUserAction", "User Interaction cannot be tracked, isGrailEventsCanBeCaptured == false");
        } else if (sessionInformationMetricsA.getSessionActive()) {
            this.rumEventDispatcher.a(userInteractionJson, this.timeProvider.a(), 0L, sessionInformationMetricsA, false, null);
        } else {
            f.a("dtxUserAction", "User Interaction cannot be tracked, session is disabled");
        }
    }
}

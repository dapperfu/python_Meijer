package R7;

import I7.j;
import V7.SessionInformationMetrics;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import s7.h;
import w7.InterfaceC17801a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010!\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LR7/e;", "LR7/d;", "Lw7/a;", "timeProvider", "Ls7/h;", "rumEventDispatcher", "LI7/j;", "sessionInformationProvider", "<init>", "(Lw7/a;Ls7/h;LI7/j;)V", "LT7/d;", "visibility", "", "e", "(LT7/d;)V", "", "activityId", "a", "(I)V", "b", "", "isChangingConfig", "c", "(IZ)V", "d", "()LT7/d;", "Lw7/a;", "Ls7/h;", "LI7/j;", "", "Ljava/util/Set;", "appActivitiesIds", "Z", "changingConfiguration", "f", "LT7/d;", "visibilityStatus", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h rumEventDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> appActivitiesIds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean changingConfiguration;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private T7.d visibilityStatus;

    public e(InterfaceC17801a timeProvider, h rumEventDispatcher, j sessionInformationProvider) {
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        this.timeProvider = timeProvider;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.appActivitiesIds = new LinkedHashSet();
        this.visibilityStatus = T7.d.f34884c;
    }

    private final void e(T7.d visibility) throws JSONException {
        SessionInformationMetrics sessionInformationMetricsA = this.sessionInformationProvider.a();
        if (!sessionInformationMetricsA.getIsGrailEventsCanBeCaptured()) {
            x8.f.a("dtxLifecycle", "visibility event cannot be tracked, isGrailEventsCanBeCaptured == false");
            return;
        }
        if (!sessionInformationMetricsA.getSessionActive()) {
            x8.f.a("dtxLifecycle", "visibility event cannot be tracked, session is disabled");
            return;
        }
        h hVar = this.rumEventDispatcher;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("characteristics.has_visibility_change", true);
        jSONObject.put("visibility.state", visibility.getKeyValue());
        hVar.b(jSONObject, this.timeProvider.a(), 0L, sessionInformationMetricsA, false, null);
    }

    @Override // R7.d
    public void a(int activityId) throws JSONException {
        this.appActivitiesIds.add(Integer.valueOf(activityId));
        if (this.appActivitiesIds.size() != 1 || this.changingConfiguration) {
            return;
        }
        T7.d dVar = T7.d.f34883b;
        this.visibilityStatus = dVar;
        e(dVar);
    }

    @Override // R7.d
    public void b(int activityId) {
        this.appActivitiesIds.add(Integer.valueOf(activityId));
    }

    @Override // R7.d
    public void c(int activityId, boolean isChangingConfig) throws JSONException {
        this.changingConfiguration = isChangingConfig;
        this.appActivitiesIds.remove(Integer.valueOf(activityId));
        if (!this.appActivitiesIds.isEmpty() || this.changingConfiguration) {
            return;
        }
        T7.d dVar = T7.d.f34884c;
        this.visibilityStatus = dVar;
        e(dVar);
    }

    /* renamed from: d, reason: from getter */
    public T7.d getVisibilityStatus() {
        return this.visibilityStatus;
    }
}

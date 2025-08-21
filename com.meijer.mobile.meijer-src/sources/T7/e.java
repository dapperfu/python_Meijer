package T7;

import K7.j;
import X7.SessionInformationMetrics;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import u7.h;
import y7.InterfaceC18294a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010!\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LT7/e;", "LT7/d;", "Ly7/a;", "timeProvider", "Lu7/h;", "rumEventDispatcher", "LK7/j;", "sessionInformationProvider", "<init>", "(Ly7/a;Lu7/h;LK7/j;)V", "LV7/d;", "visibility", "", "e", "(LV7/d;)V", "", "activityId", "a", "(I)V", "b", "", "isChangingConfig", "c", "(IZ)V", "d", "()LV7/d;", "Ly7/a;", "Lu7/h;", "LK7/j;", "", "Ljava/util/Set;", "appActivitiesIds", "Z", "changingConfiguration", "f", "LV7/d;", "visibilityStatus", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h rumEventDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> appActivitiesIds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean changingConfiguration;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private V7.d visibilityStatus;

    public e(InterfaceC18294a timeProvider, h rumEventDispatcher, j sessionInformationProvider) {
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        this.timeProvider = timeProvider;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.appActivitiesIds = new LinkedHashSet();
        this.visibilityStatus = V7.d.f39817c;
    }

    private final void e(V7.d visibility) throws JSONException {
        SessionInformationMetrics sessionInformationMetricsA = this.sessionInformationProvider.a();
        if (!sessionInformationMetricsA.getIsGrailEventsCanBeCaptured()) {
            z8.f.a("dtxLifecycle", "visibility event cannot be tracked, isGrailEventsCanBeCaptured == false");
            return;
        }
        if (!sessionInformationMetricsA.getSessionActive()) {
            z8.f.a("dtxLifecycle", "visibility event cannot be tracked, session is disabled");
            return;
        }
        h hVar = this.rumEventDispatcher;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("characteristics.has_visibility_change", true);
        jSONObject.put("visibility.state", visibility.getKeyValue());
        hVar.a(jSONObject, this.timeProvider.a(), 0L, sessionInformationMetricsA, false, null);
    }

    @Override // T7.d
    public void a(int activityId) throws JSONException {
        this.appActivitiesIds.add(Integer.valueOf(activityId));
        if (this.appActivitiesIds.size() != 1 || this.changingConfiguration) {
            return;
        }
        V7.d dVar = V7.d.f39816b;
        this.visibilityStatus = dVar;
        e(dVar);
    }

    @Override // T7.d
    public void b(int activityId) {
        this.appActivitiesIds.add(Integer.valueOf(activityId));
    }

    @Override // T7.d
    public void c(int activityId, boolean isChangingConfig) throws JSONException {
        this.changingConfiguration = isChangingConfig;
        this.appActivitiesIds.remove(Integer.valueOf(activityId));
        if (!this.appActivitiesIds.isEmpty() || this.changingConfiguration) {
            return;
        }
        V7.d dVar = V7.d.f39817c;
        this.visibilityStatus = dVar;
        e(dVar);
    }

    /* renamed from: d, reason: from getter */
    public V7.d getVisibilityStatus() {
        return this.visibilityStatus;
    }
}

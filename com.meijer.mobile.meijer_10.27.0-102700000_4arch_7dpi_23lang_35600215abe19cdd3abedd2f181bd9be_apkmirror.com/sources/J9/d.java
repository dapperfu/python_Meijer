package J9;

import i9.C14710b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"LJ9/d;", "LJ9/e;", "LJ9/c;", "inAppLoadingTime", "LJ9/i;", "onScreenTime", "", "campaignId", "requestId", "<init>", "(LJ9/c;LJ9/i;Ljava/lang/String;Ljava/lang/String;)V", "", "", "a", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "data", "()Ljava/lang/String;", "topic", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> data;

    public d(InAppLoadingTime inAppLoadingTime, OnScreenTime onScreenTime, String campaignId, String str) {
        Intrinsics.j(inAppLoadingTime, "inAppLoadingTime");
        Intrinsics.j(onScreenTime, "onScreenTime");
        Intrinsics.j(campaignId, "campaignId");
        this.data = MapsKt.r(TuplesKt.a("loadingTimeStart", Long.valueOf(inAppLoadingTime.getStartTime())), TuplesKt.a("loadingTimeEnd", Long.valueOf(inAppLoadingTime.getEndTime())), TuplesKt.a("loadingTimeDuration", Long.valueOf(inAppLoadingTime.getEndTime() - inAppLoadingTime.getStartTime())), TuplesKt.a("onScreenTimeStart", Long.valueOf(onScreenTime.getStartTime())), TuplesKt.a("onScreenTimeEnd", Long.valueOf(onScreenTime.getEndTime())), TuplesKt.a("onScreenTimeDuration", Long.valueOf(onScreenTime.getDuration())), TuplesKt.a("campaignId", campaignId));
        if (str == null) {
            getData().put("requestId", C14710b.a().E().a());
            getData().put("source", "push");
        } else {
            getData().put("requestId", str);
            getData().put("source", "customEvent");
        }
    }

    @Override // J9.e
    public String a() {
        return "log_inapp_metrics";
    }

    @Override // J9.e
    public Map<String, Object> getData() {
        return this.data;
    }
}

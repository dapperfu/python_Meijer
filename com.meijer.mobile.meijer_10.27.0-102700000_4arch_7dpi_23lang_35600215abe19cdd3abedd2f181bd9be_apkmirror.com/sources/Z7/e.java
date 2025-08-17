package Z7;

import V7.SessionInformationMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LV7/b;", "cache", "LV7/g;", "sessionMetrics", "LZ7/d;", "a", "(LV7/b;LV7/g;)LZ7/d;", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    public static final MetricsDataModel a(V7.b cache, SessionInformationMetrics sessionMetrics) {
        Intrinsics.j(cache, "cache");
        Intrinsics.j(sessionMetrics, "sessionMetrics");
        return new MetricsDataModel(cache.getDeviceScreenWidth(), cache.getDeviceScreenHeight(), cache.getDeviceOrientation(), cache.getDeviceBatteryLevel(), cache.getLocationLatitude(), cache.getLocationLongitude(), cache.getDeviceManufacturer(), cache.getDeviceModelIdentifier(), cache.getDeviceIsRooted(), cache.getOsName(), cache.getOsVersion(), cache.getBundle(), cache.getAppVersion(), sessionMetrics.getInstanceId(), sessionMetrics.getSessionId(), cache.getNetworkType(), sessionMetrics.getCrashReporting(), sessionMetrics.getSessionActive());
    }
}

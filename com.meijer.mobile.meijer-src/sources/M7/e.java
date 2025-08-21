package M7;

import X7.AppVersion;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import x7.C18131d;
import x7.EnumC18132e;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\r\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LM7/e;", "LM7/d;", "LX7/b;", "metricsCache", "<init>", "(LX7/b;)V", "", "LM7/g;", "", "f", "(Ljava/util/List;)V", "i", "e", "g", "h", "", "a", "()Ljava/util/List;", "LX7/b;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final X7.b metricsCache;

    public e(X7.b metricsCache) {
        Intrinsics.j(metricsCache, "metricsCache");
        this.metricsCache = metricsCache;
    }

    private final void e(List<EnrichmentAttribute> list) {
        AppVersion appVersion = this.metricsCache.getAppVersion();
        if (appVersion != null) {
            c.a(list, "app.version", String.valueOf(appVersion.getVersionCode()));
            c.a(list, "app.short_version", appVersion.getVersionName());
        }
        c.a(list, "app.bundle", this.metricsCache.getBundle());
    }

    private final void f(List<EnrichmentAttribute> list) {
        Integer numD = d(this.metricsCache.getDeviceScreenWidth());
        Integer numD2 = d(this.metricsCache.getDeviceScreenHeight());
        if (numD2 != null && numD != null) {
            c.a(list, "device.screen.width", numD);
            c.a(list, "device.screen.height", numD2);
        }
        String deviceManufacturer = this.metricsCache.getDeviceManufacturer();
        String str = zzbz.UNKNOWN_CONTENT_TYPE;
        if (deviceManufacturer == null) {
            deviceManufacturer = zzbz.UNKNOWN_CONTENT_TYPE;
        }
        c.a(list, "device.manufacturer", deviceManufacturer);
        String deviceModelIdentifier = this.metricsCache.getDeviceModelIdentifier();
        if (deviceModelIdentifier != null) {
            str = deviceModelIdentifier;
        }
        c.a(list, "device.model.identifier", str);
        c.a(list, "device.is_rooted", Boolean.valueOf(this.metricsCache.getDeviceIsRooted()));
        c.b(list, "device.orientation", b(this.metricsCache.getDeviceOrientation()));
        c.b(list, "device.battery.level", c(Integer.valueOf(this.metricsCache.getDeviceBatteryLevel())));
    }

    private final void g(List<EnrichmentAttribute> list) {
        Double locationLatitude = this.metricsCache.getLocationLatitude();
        Double locationLongitude = this.metricsCache.getLocationLongitude();
        if (locationLatitude == null || locationLongitude == null) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(locationLatitude.doubleValue());
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        c.a(list, "geo.location.latitude", Double.valueOf(bigDecimal.setScale(2, roundingMode).doubleValue()));
        c.a(list, "geo.location.longitude", Double.valueOf(new BigDecimal(locationLongitude.doubleValue()).setScale(2, roundingMode).doubleValue()));
    }

    private final void h(List<EnrichmentAttribute> list) {
        EnumC18132e enumC18132eA = C18131d.a(this.metricsCache.getNetworkType());
        c.b(list, "network.connection.type", enumC18132eA != null ? k.a(enumC18132eA) : null);
    }

    private final void i(List<EnrichmentAttribute> list) {
        c.a(list, "os.name", this.metricsCache.getOsName());
        String osVersion = this.metricsCache.getOsVersion();
        if (osVersion == null) {
            osVersion = zzbz.UNKNOWN_CONTENT_TYPE;
        }
        c.a(list, "os.version", osVersion);
    }

    @Override // M7.b
    public List<EnrichmentAttribute> a() {
        List<EnrichmentAttribute> listC = CollectionsKt.c();
        f(listC);
        i(listC);
        e(listC);
        g(listC);
        h(listC);
        return CollectionsKt.a(listC);
    }
}

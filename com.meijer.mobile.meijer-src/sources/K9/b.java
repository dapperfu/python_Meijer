package K9;

import A9.c;
import j9.DeviceInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u9.C17361a;
import v9.C17649a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B3\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"LK9/b;", "LS8/c;", "", "LF9/a;", "LA9/c;", "Lu9/a;", "timestampProvider", "Lv9/a;", "uuidProvider", "Lj9/c;", "deviceInfo", "", "applicationCode", "merchantId", "<init>", "(Lu9/a;Lv9/a;Lj9/c;Ljava/lang/String;Ljava/lang/String;)V", "shards", "", "", "c", "(Ljava/util/List;)Ljava/util/Map;", "b", "()Ljava/util/Map;", "value", "d", "(Ljava/util/List;)LA9/c;", "a", "Lu9/a;", "Lv9/a;", "Lj9/c;", "Ljava/lang/String;", "e", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b implements S8.c<List<? extends F9.a>, A9.c> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DeviceInfo deviceInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String applicationCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String merchantId;

    public b(C17361a timestampProvider, C17649a uuidProvider, DeviceInfo deviceInfo, String str, String str2) {
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(uuidProvider, "uuidProvider");
        Intrinsics.j(deviceInfo, "deviceInfo");
        this.timestampProvider = timestampProvider;
        this.uuidProvider = uuidProvider;
        this.deviceInfo = deviceInfo;
        this.applicationCode = str;
        this.merchantId = str2;
    }

    private final Map<String, String> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("platform", this.deviceInfo.j());
        linkedHashMap.put("appVersion", this.deviceInfo.a());
        linkedHashMap.put("sdkVersion", this.deviceInfo.getSdkVersion());
        linkedHashMap.put("osVersion", this.deviceInfo.getOsVersion());
        linkedHashMap.put("model", this.deviceInfo.getModel());
        linkedHashMap.put("hwId", this.deviceInfo.getClientId());
        linkedHashMap.put("isDebugMode", String.valueOf(this.deviceInfo.getIsDebugMode()));
        linkedHashMap.put("applicationCode", this.applicationCode);
        linkedHashMap.put("merchantId", this.merchantId);
        return linkedHashMap;
    }

    private final Map<String, Object> c(List<? extends F9.a> shards) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapB = b();
        for (F9.a aVar : shards) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("type", aVar.e());
            linkedHashMap2.put("deviceInfo", mapB);
            Map<String, Object> mapA = aVar.a();
            Intrinsics.i(mapA, "getData(...)");
            linkedHashMap2.putAll(mapA);
            arrayList.add(linkedHashMap2);
        }
        linkedHashMap.put("logs", arrayList);
        return linkedHashMap;
    }

    @Override // S8.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public A9.c a(List<? extends F9.a> value) {
        Intrinsics.j(value, "value");
        if (value.isEmpty()) {
            throw new IllegalArgumentException("Shards must not be empty!");
        }
        return new c.a(this.timestampProvider, this.uuidProvider).p("https://log-dealer.eservice.emarsys.net/v1/log").k(A9.b.POST).l(c(value)).a();
    }
}

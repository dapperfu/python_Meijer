package R8;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0088\u0001\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b!\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b#\u0010*¨\u0006+"}, d2 = {"LR8/a;", "", "", "eventServiceUrl", "clientServiceUrl", "predictServiceUrl", "mobileEngageV2ServiceUrl", "deepLinkServiceUrl", "inboxServiceUrl", "messageInboxServiceUrl", "LK9/a;", "logLevel", "", "LP8/a;", "", "features", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LK9/a;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LK9/a;Ljava/util/Map;)LR8/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "c", "i", "d", "getMobileEngageV2ServiceUrl", "f", "getInboxServiceUrl", "g", "h", "LK9/a;", "()LK9/a;", "Ljava/util/Map;", "()Ljava/util/Map;", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: R8.a, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class RemoteConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventServiceUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientServiceUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String predictServiceUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mobileEngageV2ServiceUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deepLinkServiceUrl;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inboxServiceUrl;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageInboxServiceUrl;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final K9.a logLevel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<P8.a, Boolean> features;

    public RemoteConfig() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfig)) {
            return false;
        }
        RemoteConfig remoteConfig = (RemoteConfig) other;
        return Intrinsics.e(this.eventServiceUrl, remoteConfig.eventServiceUrl) && Intrinsics.e(this.clientServiceUrl, remoteConfig.clientServiceUrl) && Intrinsics.e(this.predictServiceUrl, remoteConfig.predictServiceUrl) && Intrinsics.e(this.mobileEngageV2ServiceUrl, remoteConfig.mobileEngageV2ServiceUrl) && Intrinsics.e(this.deepLinkServiceUrl, remoteConfig.deepLinkServiceUrl) && Intrinsics.e(this.inboxServiceUrl, remoteConfig.inboxServiceUrl) && Intrinsics.e(this.messageInboxServiceUrl, remoteConfig.messageInboxServiceUrl) && this.logLevel == remoteConfig.logLevel && Intrinsics.e(this.features, remoteConfig.features);
    }

    public RemoteConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, K9.a aVar, Map<P8.a, Boolean> map) {
        this.eventServiceUrl = str;
        this.clientServiceUrl = str2;
        this.predictServiceUrl = str3;
        this.mobileEngageV2ServiceUrl = str4;
        this.deepLinkServiceUrl = str5;
        this.inboxServiceUrl = str6;
        this.messageInboxServiceUrl = str7;
        this.logLevel = aVar;
        this.features = map;
    }

    public static /* synthetic */ RemoteConfig b(RemoteConfig remoteConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, K9.a aVar, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = remoteConfig.eventServiceUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = remoteConfig.clientServiceUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = remoteConfig.predictServiceUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = remoteConfig.mobileEngageV2ServiceUrl;
        }
        if ((i10 & 16) != 0) {
            str5 = remoteConfig.deepLinkServiceUrl;
        }
        if ((i10 & 32) != 0) {
            str6 = remoteConfig.inboxServiceUrl;
        }
        if ((i10 & 64) != 0) {
            str7 = remoteConfig.messageInboxServiceUrl;
        }
        if ((i10 & 128) != 0) {
            aVar = remoteConfig.logLevel;
        }
        if ((i10 & 256) != 0) {
            map = remoteConfig.features;
        }
        K9.a aVar2 = aVar;
        Map map2 = map;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return remoteConfig.a(str, str2, str11, str4, str10, str8, str9, aVar2, map2);
    }

    public final RemoteConfig a(String eventServiceUrl, String clientServiceUrl, String predictServiceUrl, String mobileEngageV2ServiceUrl, String deepLinkServiceUrl, String inboxServiceUrl, String messageInboxServiceUrl, K9.a logLevel, Map<P8.a, Boolean> features) {
        return new RemoteConfig(eventServiceUrl, clientServiceUrl, predictServiceUrl, mobileEngageV2ServiceUrl, deepLinkServiceUrl, inboxServiceUrl, messageInboxServiceUrl, logLevel, features);
    }

    /* renamed from: c, reason: from getter */
    public final String getClientServiceUrl() {
        return this.clientServiceUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeepLinkServiceUrl() {
        return this.deepLinkServiceUrl;
    }

    /* renamed from: e, reason: from getter */
    public final String getEventServiceUrl() {
        return this.eventServiceUrl;
    }

    public final Map<P8.a, Boolean> f() {
        return this.features;
    }

    /* renamed from: g, reason: from getter */
    public final K9.a getLogLevel() {
        return this.logLevel;
    }

    /* renamed from: h, reason: from getter */
    public final String getMessageInboxServiceUrl() {
        return this.messageInboxServiceUrl;
    }

    public int hashCode() {
        String str = this.eventServiceUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientServiceUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.predictServiceUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mobileEngageV2ServiceUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deepLinkServiceUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.inboxServiceUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.messageInboxServiceUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        K9.a aVar = this.logLevel;
        int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Map<P8.a, Boolean> map = this.features;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getPredictServiceUrl() {
        return this.predictServiceUrl;
    }

    public String toString() {
        return "RemoteConfig(eventServiceUrl=" + this.eventServiceUrl + ", clientServiceUrl=" + this.clientServiceUrl + ", predictServiceUrl=" + this.predictServiceUrl + ", mobileEngageV2ServiceUrl=" + this.mobileEngageV2ServiceUrl + ", deepLinkServiceUrl=" + this.deepLinkServiceUrl + ", inboxServiceUrl=" + this.inboxServiceUrl + ", messageInboxServiceUrl=" + this.messageInboxServiceUrl + ", logLevel=" + this.logLevel + ", features=" + this.features + ")";
    }

    public /* synthetic */ RemoteConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, K9.a aVar, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : aVar, (i10 & 256) != 0 ? null : map);
    }
}

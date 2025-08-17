package Du;

import io.constructor.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\u0006\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R)\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b%\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b\u001d\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b)\u0010\u0014R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'¨\u0006+"}, d2 = {"LDu/w;", "", "", "apiKey", "serviceUrl", "quizzesServiceUrl", "", "segments", "Lkotlin/Pair;", "testCells", "", "", "autocompleteResultCount", "defaultItemSection", "servicePort", "serviceScheme", "defaultAnalyticsTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "i", "c", "e", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "j", "Ljava/util/Map;", "()Ljava/util/Map;", "g", "h", "I", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: Du.w, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ConstructorIoConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apiKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serviceUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String quizzesServiceUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> segments;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Pair<String, String>> testCells;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Integer> autocompleteResultCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String defaultItemSection;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int servicePort;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serviceScheme;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> defaultAnalyticsTags;

    public ConstructorIoConfig(String apiKey, String serviceUrl, String quizzesServiceUrl, List<String> segments, List<Pair<String, String>> testCells, Map<String, Integer> autocompleteResultCount, String defaultItemSection, int i10, String serviceScheme, Map<String, String> defaultAnalyticsTags) {
        Intrinsics.j(apiKey, "apiKey");
        Intrinsics.j(serviceUrl, "serviceUrl");
        Intrinsics.j(quizzesServiceUrl, "quizzesServiceUrl");
        Intrinsics.j(segments, "segments");
        Intrinsics.j(testCells, "testCells");
        Intrinsics.j(autocompleteResultCount, "autocompleteResultCount");
        Intrinsics.j(defaultItemSection, "defaultItemSection");
        Intrinsics.j(serviceScheme, "serviceScheme");
        Intrinsics.j(defaultAnalyticsTags, "defaultAnalyticsTags");
        this.apiKey = apiKey;
        this.serviceUrl = serviceUrl;
        this.quizzesServiceUrl = quizzesServiceUrl;
        this.segments = segments;
        this.testCells = testCells;
        this.autocompleteResultCount = autocompleteResultCount;
        this.defaultItemSection = defaultItemSection;
        this.servicePort = i10;
        this.serviceScheme = serviceScheme;
        this.defaultAnalyticsTags = defaultAnalyticsTags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConstructorIoConfig)) {
            return false;
        }
        ConstructorIoConfig constructorIoConfig = (ConstructorIoConfig) other;
        return Intrinsics.e(this.apiKey, constructorIoConfig.apiKey) && Intrinsics.e(this.serviceUrl, constructorIoConfig.serviceUrl) && Intrinsics.e(this.quizzesServiceUrl, constructorIoConfig.quizzesServiceUrl) && Intrinsics.e(this.segments, constructorIoConfig.segments) && Intrinsics.e(this.testCells, constructorIoConfig.testCells) && Intrinsics.e(this.autocompleteResultCount, constructorIoConfig.autocompleteResultCount) && Intrinsics.e(this.defaultItemSection, constructorIoConfig.defaultItemSection) && this.servicePort == constructorIoConfig.servicePort && Intrinsics.e(this.serviceScheme, constructorIoConfig.serviceScheme) && Intrinsics.e(this.defaultAnalyticsTags, constructorIoConfig.defaultAnalyticsTags);
    }

    /* renamed from: a, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    public final Map<String, Integer> b() {
        return this.autocompleteResultCount;
    }

    public final Map<String, String> c() {
        return this.defaultAnalyticsTags;
    }

    /* renamed from: d, reason: from getter */
    public final String getDefaultItemSection() {
        return this.defaultItemSection;
    }

    /* renamed from: e, reason: from getter */
    public final String getQuizzesServiceUrl() {
        return this.quizzesServiceUrl;
    }

    public final List<String> f() {
        return this.segments;
    }

    /* renamed from: g, reason: from getter */
    public final int getServicePort() {
        return this.servicePort;
    }

    /* renamed from: h, reason: from getter */
    public final String getServiceScheme() {
        return this.serviceScheme;
    }

    public int hashCode() {
        return (((((((((((((((((this.apiKey.hashCode() * 31) + this.serviceUrl.hashCode()) * 31) + this.quizzesServiceUrl.hashCode()) * 31) + this.segments.hashCode()) * 31) + this.testCells.hashCode()) * 31) + this.autocompleteResultCount.hashCode()) * 31) + this.defaultItemSection.hashCode()) * 31) + Integer.hashCode(this.servicePort)) * 31) + this.serviceScheme.hashCode()) * 31) + this.defaultAnalyticsTags.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final String getServiceUrl() {
        return this.serviceUrl;
    }

    public final List<Pair<String, String>> j() {
        return this.testCells;
    }

    public String toString() {
        return "ConstructorIoConfig(apiKey=" + this.apiKey + ", serviceUrl=" + this.serviceUrl + ", quizzesServiceUrl=" + this.quizzesServiceUrl + ", segments=" + this.segments + ", testCells=" + this.testCells + ", autocompleteResultCount=" + this.autocompleteResultCount + ", defaultItemSection=" + this.defaultItemSection + ", servicePort=" + this.servicePort + ", serviceScheme=" + this.serviceScheme + ", defaultAnalyticsTags=" + this.defaultAnalyticsTags + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConstructorIoConfig(String str, String str2, String str3, List list, List list2, Map map, String str4, int i10, String str5, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        int iIntValue;
        String str6 = (i11 & 2) != 0 ? BuildConfig.SERVICE_URL : str2;
        String str7 = (i11 & 4) != 0 ? BuildConfig.QUIZZES_SERVICE_URL : str3;
        List listM = (i11 & 8) != 0 ? CollectionsKt.m() : list;
        List listM2 = (i11 & 16) != 0 ? CollectionsKt.m() : list2;
        int i12 = i11 & 32;
        String str8 = BuildConfig.DEFAULT_ITEM_SECTION;
        Map mapO = i12 != 0 ? MapsKt.o(TuplesKt.a("Search Suggestions", 10), TuplesKt.a(BuildConfig.DEFAULT_ITEM_SECTION, 0)) : map;
        str8 = (i11 & 64) == 0 ? str4 : str8;
        if ((i11 & 128) != 0) {
            Integer SERVICE_PORT = BuildConfig.SERVICE_PORT;
            Intrinsics.i(SERVICE_PORT, "SERVICE_PORT");
            iIntValue = SERVICE_PORT.intValue();
        } else {
            iIntValue = i10;
        }
        this(str, str6, str7, listM, listM2, mapO, str8, iIntValue, (i11 & 256) != 0 ? BuildConfig.SERVICE_SCHEME : str5, (i11 & 512) != 0 ? MapsKt.k() : map2);
    }
}

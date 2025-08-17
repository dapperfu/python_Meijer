package H5;

import Q5.K;
import Q5.t;
import Q5.v;
import f6.C13851g;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\u0017\u0010\fJ'\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ'\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t2\u0006\u0010\u001e\u001a\u00020\nH\u0001¢\u0006\u0004\b \u0010\u000fJ;\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\"\u0010\"\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0004\u0012\u00020\u00100!H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0000¢\u0006\u0004\b%\u0010\u0012J'\u0010'\u001a\u00020\u00102\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH\u0001¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020\u00102\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b)\u0010(J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b*\u0010\u001dJ3\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0001¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010/R\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\"\u00103\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00101R.\u00107\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b4\u00101\u0012\u0004\b6\u0010\u0012\u001a\u0004\b5\u0010\fR@\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b4\u0010\fR \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020:008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101¨\u0006<"}, d2 = {"LH5/i;", "", "LH5/a;", "appIdManager", "<init>", "(LH5/a;)V", "LH5/c;", "configDownloader", "(LH5/a;LH5/c;)V", "", "", "g", "()Ljava/util/Map;", "appId", "j", "(Ljava/lang/String;)Ljava/util/Map;", "", "c", "()V", "baseKey", "environment", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "k", "bundledConfigFileName", "i", "fileAssetName", "", "o", "(Ljava/lang/String;)Z", "filePath", "p", "d", "Lkotlin/Function1;", "completion", "n", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "b", "config", "m", "(Ljava/util/Map;)V", "q", "h", "l", "(Ljava/util/Map;)Ljava/util/Map;", "a", "LH5/a;", "LH5/c;", "", "Ljava/util/Map;", "unmergedConfiguration", "programmaticConfiguration", "e", "getCurrentConfiguration$core_phoneRelease", "getCurrentConfiguration$core_phoneRelease$annotations", "currentConfiguration", "<set-?>", "environmentAwareConfiguration", "Ljava/util/Date;", "configDownloadMap", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a appIdManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c configDownloader;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> unmergedConfiguration;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> programmaticConfiguration;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> currentConfiguration;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Map<String, ? extends Object> environmentAwareConfiguration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Date> configDownloadMap;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "config", "", "a", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function1<Map<String, ? extends Object>, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f12294g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Map<String, ? extends Object>, Unit> f12295h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, Function1<? super Map<String, ? extends Object>, Unit> function1) {
            super(1);
            this.f12294g = str;
            this.f12295h = function1;
        }

        public final void a(Map<String, ? extends Object> map) {
            if (map == null) {
                this.f12295h.invoke(null);
                return;
            }
            i.this.m(map);
            i.this.configDownloadMap.put(this.f12294g, new Date());
            this.f12295h.invoke(i.this.e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
            a(map);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(a appIdManager) {
        this(appIdManager, new c());
        Intrinsics.j(appIdManager, "appIdManager");
    }

    private final Map<String, Object> j(String appId) throws IOException {
        t.e("Configuration", "ConfigurationStateManager", "Attempting to load cached config.", new Object[0]);
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str = String.format("https://assets.adobedtm.com/%s.json", Arrays.copyOf(new Object[]{appId}, 1));
        Intrinsics.i(str, "format(format, *args)");
        R5.c cVarB = K.f().b().b("config", str);
        String strA = C13851g.a(cVarB != null ? cVarB.getData() : null);
        if (strA == null || strA.length() == 0) {
            t.e("Configuration", "ConfigurationStateManager", "Cached config is null/empty.", new Object[0]);
            return null;
        }
        try {
            return L5.h.c(new JSONObject(new JSONTokener(strA)));
        } catch (JSONException e10) {
            t.a("Configuration", "ConfigurationStateManager", "Failed to load cached config " + e10, new Object[0]);
            return null;
        }
    }

    private final void c() {
        Object obj = this.currentConfiguration.get("build.environment");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = this.currentConfiguration.entrySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) ((Map.Entry) it.next()).getKey();
            if (!StringsKt.W(str2, "__", false, 2, null)) {
                String strF = f(str2, str);
                if (this.currentConfiguration.get(strF) == null) {
                    strF = str2;
                }
                Object obj2 = this.currentConfiguration.get(strF);
                if (obj2 != null) {
                    linkedHashMap.put(str2, obj2);
                }
            }
        }
        this.environmentAwareConfiguration = linkedHashMap;
    }

    private final Map<String, Object> g() {
        v vVarA = K.f().d().a("AdobeMobile_ConfigState");
        Intrinsics.i(vVarA, "getInstance().dataStoreS…Collection(DATASTORE_KEY)");
        String string = vVarA.getString("config.overridden.map", null);
        if (string != null && string.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(new JSONTokener(string));
                t.e("Configuration", "ConfigurationStateManager", "Loaded persisted programmatic Configuration", new Object[0]);
                return L5.h.c(jSONObject);
            } catch (JSONException e10) {
                t.a("Configuration", "ConfigurationStateManager", "Unable to parse the Configuration from JSON Object. Exception: (" + e10 + ')', new Object[0]);
            }
        }
        return null;
    }

    public final Map<String, Object> d(String filePath) {
        Map<String, Object> mapC;
        Intrinsics.j(filePath, "filePath");
        String strG = L5.g.g(new File(filePath));
        if (strG == null || strG.length() == 0) {
            t.a("Configuration", "ConfigurationStateManager", "Empty configuration from file path while configuring with file path.", new Object[0]);
            return null;
        }
        try {
            mapC = L5.h.c(new JSONObject(new JSONTokener(strG)));
        } catch (JSONException unused) {
            t.f("Configuration", "ConfigurationStateManager", "Failed to parse JSON config from file while configuring with file path.", new Object[0]);
            mapC = null;
        }
        if (mapC != null && !mapC.isEmpty()) {
            return mapC;
        }
        t.a("Configuration", "ConfigurationStateManager", "Empty configuration found when processing JSON string.", new Object[0]);
        return null;
    }

    public final Map<String, Object> e() {
        return this.environmentAwareConfiguration;
    }

    public final boolean h(String appId) {
        Intrinsics.j(appId, "appId");
        Date date = this.configDownloadMap.get(appId);
        return date == null || new Date(date.getTime() + 15000).compareTo(new Date()) < 0;
    }

    public final Map<String, Object> i(String bundledConfigFileName) throws IOException {
        Intrinsics.j(bundledConfigFileName, "bundledConfigFileName");
        t.e("Configuration", "ConfigurationStateManager", "Attempting to load bundled config.", new Object[0]);
        String strA = C13851g.a(K.f().e().s(bundledConfigFileName));
        if (strA == null || strA.length() == 0) {
            t.a("Configuration", "ConfigurationStateManager", "Bundled config asset is not present/is empty. Cannot load bundled config.", new Object[0]);
            return null;
        }
        try {
            return L5.h.c(new JSONObject(new JSONTokener(strA)));
        } catch (JSONException e10) {
            t.a("Configuration", "ConfigurationStateManager", "Failed to load bundled config " + e10, new Object[0]);
            return null;
        }
    }

    public final Map<String, Object> k() throws IOException {
        Map<String, Object> mapI;
        this.currentConfiguration.clear();
        String strC = this.appIdManager.c();
        if (strC == null || strC.length() == 0) {
            t.e("Configuration", "ConfigurationStateManager", "AppID from persistence and manifest is null.", new Object[0]);
            mapI = i("ADBMobileConfig.json");
        } else {
            mapI = j(strC);
            if (mapI == null) {
                mapI = i("ADBMobileConfig.json");
            }
        }
        m(mapI);
        return this.environmentAwareConfiguration;
    }

    public final Map<String, Object> l(Map<String, ? extends Object> config) {
        Intrinsics.j(config, "config");
        Object obj = this.currentConfiguration.get("build.environment");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return config;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = config.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            String strF = f(str2, str);
            if (this.currentConfiguration.get(strF) != null) {
                str2 = strF;
            }
            linkedHashMap.put(str2, entry.getValue());
        }
        return linkedHashMap;
    }

    public final void m(Map<String, ? extends Object> config) {
        this.unmergedConfiguration.clear();
        if (config != null) {
            this.unmergedConfiguration.putAll(config);
        }
        this.currentConfiguration.clear();
        this.currentConfiguration.putAll(this.unmergedConfiguration);
        this.currentConfiguration.putAll(this.programmaticConfiguration);
        c();
        t.e("Configuration", "ConfigurationStateManager", "Replaced configuration.", new Object[0]);
    }

    public final void n(String appId, Function1<? super Map<String, ? extends Object>, Unit> completion) throws NumberFormatException {
        Intrinsics.j(appId, "appId");
        Intrinsics.j(completion, "completion");
        if (StringsKt.r0(appId)) {
            t.e("Configuration", "ConfigurationStateManager", "Attempting to set empty App Id into persistence.", new Object[0]);
            return;
        }
        this.appIdManager.e(appId);
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str = String.format("https://assets.adobedtm.com/%s.json", Arrays.copyOf(new Object[]{appId}, 1));
        Intrinsics.i(str, "format(format, *args)");
        this.configDownloader.b(str, new b(appId, completion));
    }

    public final boolean o(String fileAssetName) throws IOException {
        Intrinsics.j(fileAssetName, "fileAssetName");
        Map<String, Object> mapI = i(fileAssetName);
        if (mapI == null || mapI.isEmpty()) {
            t.a("Configuration", "ConfigurationStateManager", "Empty configuration found when processing JSON string.", new Object[0]);
            return false;
        }
        m(mapI);
        return true;
    }

    public final boolean p(String filePath) {
        Intrinsics.j(filePath, "filePath");
        Map<String, Object> mapD = d(filePath);
        if (mapD == null) {
            t.a("Configuration", "ConfigurationStateManager", "Unable to read config from provided file (content is invalid)", new Object[0]);
            return false;
        }
        m(mapD);
        return true;
    }

    public final void q(Map<String, ? extends Object> config) {
        Intrinsics.j(config, "config");
        this.programmaticConfiguration.putAll(l(config));
        v vVarA = K.f().d().a("AdobeMobile_ConfigState");
        Intrinsics.i(vVarA, "getInstance().dataStoreS…Collection(DATASTORE_KEY)");
        String string = new JSONObject(this.programmaticConfiguration).toString();
        Intrinsics.i(string, "JSONObject(programmaticConfiguration).toString()");
        vVarA.d("config.overridden.map", string);
        this.currentConfiguration.putAll(this.programmaticConfiguration);
        c();
        t.a("Configuration", "ConfigurationStateManager", "Updated programmatic configuration.", new Object[0]);
    }

    public i(a appIdManager, c configDownloader) {
        Intrinsics.j(appIdManager, "appIdManager");
        Intrinsics.j(configDownloader, "configDownloader");
        this.unmergedConfiguration = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.programmaticConfiguration = linkedHashMap;
        this.currentConfiguration = new LinkedHashMap();
        this.environmentAwareConfiguration = MapsKt.k();
        this.configDownloadMap = new LinkedHashMap();
        this.appIdManager = appIdManager;
        this.configDownloader = configDownloader;
        Map<String, Object> mapG = g();
        if (mapG != null) {
            linkedHashMap.putAll(mapG);
        }
    }

    private final String f(String baseKey, String environment) {
        if (environment.length() == 0) {
            return baseKey;
        }
        return "__" + environment + "__" + baseKey;
    }

    public final void b() {
        v vVarA = K.f().d().a("AdobeMobile_ConfigState");
        Intrinsics.i(vVarA, "getInstance().dataStoreS…Collection(DATASTORE_KEY)");
        vVarA.remove("config.overridden.map");
        this.programmaticConfiguration.clear();
        this.currentConfiguration.clear();
        this.currentConfiguration.putAll(this.unmergedConfiguration);
        c();
        t.e("Configuration", "ConfigurationStateManager", "Cleared programmatic configuration.", new Object[0]);
    }
}

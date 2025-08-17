package M4;

import M4.a;
import M4.n;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f18953a = new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f18955b = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: c, reason: collision with root package name */
    public static final a.e f18957c = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d, reason: collision with root package name */
    public static final a.c f18959d = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e, reason: collision with root package name */
    public static final a.f f18961e = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final a.f f18963f = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final a.f f18965g = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h, reason: collision with root package name */
    public static final a.f f18967h = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i, reason: collision with root package name */
    public static final a.f f18969i = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j, reason: collision with root package name */
    public static final a.f f18971j = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k, reason: collision with root package name */
    public static final a.c f18973k = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l, reason: collision with root package name */
    public static final a.c f18975l = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m, reason: collision with root package name */
    public static final a.c f18977m = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n, reason: collision with root package name */
    public static final a.c f18979n = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o, reason: collision with root package name */
    public static final a.c f18981o = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p, reason: collision with root package name */
    public static final a.c f18983p = new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q, reason: collision with root package name */
    public static final a.b f18985q = new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r, reason: collision with root package name */
    public static final a.b f18987r = new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s, reason: collision with root package name */
    public static final a.c f18989s = new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t, reason: collision with root package name */
    public static final a.f f18991t = new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u, reason: collision with root package name */
    public static final a.c f18993u = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v, reason: collision with root package name */
    public static final a.b f18995v = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w, reason: collision with root package name */
    public static final a.b f18996w = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x, reason: collision with root package name */
    public static final a.f f18997x = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y, reason: collision with root package name */
    public static final a.f f18998y = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z, reason: collision with root package name */
    public static final a.f f18999z = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* renamed from: A, reason: collision with root package name */
    public static final a.b f18927A = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B, reason: collision with root package name */
    public static final a.b f18928B = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C, reason: collision with root package name */
    public static final a.d f18929C = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* renamed from: D, reason: collision with root package name */
    public static final a.b f18930D = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: E, reason: collision with root package name */
    public static final a.b f18931E = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: F, reason: collision with root package name */
    public static final a.b f18932F = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: G, reason: collision with root package name */
    public static final a.b f18933G = new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: H, reason: collision with root package name */
    public static final a.e f18934H = new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: I, reason: collision with root package name */
    public static final a.e f18935I = new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: J, reason: collision with root package name */
    public static final a.h f18936J = new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: K, reason: collision with root package name */
    public static final a.h f18937K = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: L, reason: collision with root package name */
    public static final a.g f18938L = new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: M, reason: collision with root package name */
    public static final n.b f18939M = new n.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: N, reason: collision with root package name */
    public static final n.a f18940N = new n.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* renamed from: O, reason: collision with root package name */
    public static final n.a f18941O = new n.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");

    /* renamed from: P, reason: collision with root package name */
    public static final a.h f18942P = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: Q, reason: collision with root package name */
    public static final a.i f18943Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: R, reason: collision with root package name */
    public static final a.d f18944R = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: S, reason: collision with root package name */
    public static final a.d f18945S = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: T, reason: collision with root package name */
    public static final a.h f18946T = new a.h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: U, reason: collision with root package name */
    public static final a.d f18947U = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: V, reason: collision with root package name */
    public static final a.d f18948V = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: W, reason: collision with root package name */
    public static final a.d f18949W = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: X, reason: collision with root package name */
    public static final a.d f18950X = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: Y, reason: collision with root package name */
    public static final a.d f18951Y = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: Z, reason: collision with root package name */
    public static final a.d f18952Z = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: a0, reason: collision with root package name */
    public static final a.d f18954a0 = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: b0, reason: collision with root package name */
    public static final a.d f18956b0 = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: c0, reason: collision with root package name */
    public static final a.d f18958c0 = new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* renamed from: d0, reason: collision with root package name */
    public static final a.d f18960d0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* renamed from: e0, reason: collision with root package name */
    public static final a.d f18962e0 = new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* renamed from: f0, reason: collision with root package name */
    public static final a.d f18964f0 = new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* renamed from: g0, reason: collision with root package name */
    public static final a.d f18966g0 = new a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* renamed from: h0, reason: collision with root package name */
    public static final a.d f18968h0 = new a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* renamed from: i0, reason: collision with root package name */
    public static final a.d f18970i0 = new a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* renamed from: j0, reason: collision with root package name */
    public static final a.d f18972j0 = new a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* renamed from: k0, reason: collision with root package name */
    public static final a.d f18974k0 = new a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");

    /* renamed from: l0, reason: collision with root package name */
    public static final a.d f18976l0 = new c("PREFETCH_URL_V4", "PREFETCH_URL_V4");

    /* renamed from: m0, reason: collision with root package name */
    public static final a.d f18978m0 = new a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");

    /* renamed from: n0, reason: collision with root package name */
    public static final a.d f18980n0 = new a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");

    /* renamed from: o0, reason: collision with root package name */
    public static final a.d f18982o0 = new a.d("PRERENDER_URL_V2", "PRERENDER_URL_V2");

    /* renamed from: p0, reason: collision with root package name */
    public static final a.d f18984p0 = new a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");

    /* renamed from: q0, reason: collision with root package name */
    public static final a.d f18986q0 = new a.d("SAVE_STATE", "SAVE_STATE");

    /* renamed from: r0, reason: collision with root package name */
    public static final a.d f18988r0 = new a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");

    /* renamed from: s0, reason: collision with root package name */
    public static final a.d f18990s0 = new a.d("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW");

    /* renamed from: t0, reason: collision with root package name */
    public static final a.d f18992t0 = new a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");

    /* renamed from: u0, reason: collision with root package name */
    public static final a.d f18994u0 = new a.d("WEBVIEW_BUILDER", "WEBVIEW_BUILDER");

    class c extends a.d {
        @Override // M4.a
        public boolean d() {
            if (L4.f.a("MULTI_PROFILE")) {
                return super.d();
            }
            return false;
        }

        c(String str, String str2) {
            super(str, str2);
        }
    }

    class a extends a.i {

        /* renamed from: d, reason: collision with root package name */
        private final Pattern f19000d;

        a(String str, String str2) {
            super(str, str2);
            this.f19000d = Pattern.compile("\\A\\d+");
        }

        @Override // M4.a
        public boolean d() {
            boolean zD = super.d();
            if (zD && Build.VERSION.SDK_INT < 29) {
                PackageInfo packageInfoD = L4.e.d();
                if (packageInfoD == null) {
                    return false;
                }
                Matcher matcher = this.f19000d.matcher(packageInfoD.versionName);
                if (!matcher.find() || Integer.parseInt(packageInfoD.versionName.substring(matcher.start(), matcher.end())) < 105) {
                    return false;
                }
                return true;
            }
            return zD;
        }
    }

    class b extends a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // M4.a
        public boolean d() {
            if (!super.d() || !L4.f.a("MULTI_PROCESS")) {
                return false;
            }
            return L4.e.i();
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static <T extends j> boolean c(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t10 : collection) {
            if (t10.b().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((j) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str) {
        return c(str, M4.a.e());
    }
}

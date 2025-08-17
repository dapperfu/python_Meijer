package H5;

import M5.LaunchRule;
import M5.k;
import N5.a;
import Q5.K;
import Q5.t;
import Q5.v;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.InterfaceC6418a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, d2 = {"LH5/h;", "", "LM5/k;", "launchRulesEngine", "<init>", "(LM5/k;)V", "LN5/c;", "rulesLoader", "(LM5/k;LN5/c;)V", "", "rulesJson", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "", "f", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/m;)Z", "c", "(Lcom/adobe/marketing/mobile/m;)Z", "url", "d", "api", "b", "a", "LM5/k;", "LN5/c;", "LQ5/v;", "LQ5/v;", "configDataStore", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k launchRulesEngine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final N5.c rulesLoader;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v configDataStore;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(k launchRulesEngine) {
        this(launchRulesEngine, new N5.c("config.rules"));
        Intrinsics.j(launchRulesEngine, "launchRulesEngine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String url, h this$0, AbstractC6454m extensionApi, N5.a aVar) throws JSONException {
        Intrinsics.j(url, "$url");
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(extensionApi, "$extensionApi");
        a.EnumC0338a enumC0338aB = aVar.b();
        Intrinsics.i(enumC0338aB, "rulesDownloadResult.reason");
        t.e("Configuration", "ConfigurationRulesManager", "Rule Download result: " + enumC0338aB, new Object[0]);
        if (enumC0338aB != a.EnumC0338a.NOT_MODIFIED) {
            t.e("Configuration", "ConfigurationRulesManager", "Attempting to replace rules with downloaded rules.", new Object[0]);
            this$0.f(aVar.a(), extensionApi);
            return;
        }
        t.a("Configuration", "ConfigurationRulesManager", "Rules from " + url + " have not been modified. Will not apply rules.", new Object[0]);
    }

    private final boolean f(String rulesJson, AbstractC6454m extensionApi) throws JSONException {
        if (rulesJson == null) {
            t.a("Configuration", "ConfigurationRulesManager", "Rules file content is null. Cannot apply new rules.", new Object[0]);
            return false;
        }
        List<LaunchRule> listA = O5.j.a(rulesJson, extensionApi);
        if (listA == null) {
            t.a("Configuration", "ConfigurationRulesManager", "Parsed rules are null. Cannot apply new rules.", new Object[0]);
            return false;
        }
        t.e("Configuration", "ConfigurationRulesManager", "Replacing rules.", new Object[0]);
        this.launchRulesEngine.c(listA);
        return true;
    }

    public final boolean b(AbstractC6454m api) {
        Intrinsics.j(api, "api");
        N5.a aVarF = this.rulesLoader.f("ADBMobileConfig-rules.zip");
        Intrinsics.i(aVarF, "rulesLoader.loadFromAsset(BUNDLED_RULES_FILE_NAME)");
        if (aVarF.b() == a.EnumC0338a.SUCCESS) {
            t.e("Configuration", "ConfigurationRulesManager", "Attempting to replace rules with bundled rules", new Object[0]);
            return f(aVarF.a(), api);
        }
        t.a("Configuration", "ConfigurationRulesManager", "Cannot apply bundled rules - " + aVarF.b(), new Object[0]);
        return false;
    }

    public final boolean c(AbstractC6454m extensionApi) {
        Intrinsics.j(extensionApi, "extensionApi");
        v vVar = this.configDataStore;
        if (vVar == null) {
            t.a("Configuration", "ConfigurationRulesManager", "Cannot load rules from AdobeMobile_ConfigState. Cannot apply cached rules", new Object[0]);
            return false;
        }
        String string = vVar.getString("config.last.rules.url", null);
        if (string == null || StringsKt.r0(string)) {
            t.a("Configuration", "ConfigurationRulesManager", "Persisted rules url is null or empty. Cannot apply cached rules", new Object[0]);
            return false;
        }
        N5.a aVarG = this.rulesLoader.g(string);
        Intrinsics.i(aVarG, "rulesLoader.loadFromCache(persistedRulesUrl)");
        if (aVarG.b() == a.EnumC0338a.SUCCESS) {
            t.e("Configuration", "ConfigurationRulesManager", "Attempting to replace rules with cached rules", new Object[0]);
            return f(aVarG.a(), extensionApi);
        }
        t.a("Configuration", "ConfigurationRulesManager", "Cannot apply cached rules - " + aVarG.b(), new Object[0]);
        return false;
    }

    public final boolean d(final String url, final AbstractC6454m extensionApi) {
        Intrinsics.j(url, "url");
        Intrinsics.j(extensionApi, "extensionApi");
        v vVar = this.configDataStore;
        if (vVar == null) {
            t.a("Configuration", "ConfigurationRulesManager", "Cannot load rules from AdobeMobile_ConfigState. Cannot apply downloaded rules", new Object[0]);
            return false;
        }
        vVar.d("config.last.rules.url", url);
        this.rulesLoader.h(url, new InterfaceC6418a() { // from class: H5.g
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) throws JSONException {
                h.e(url, this, extensionApi, (N5.a) obj);
            }
        });
        return true;
    }

    public h(k launchRulesEngine, N5.c rulesLoader) {
        Intrinsics.j(launchRulesEngine, "launchRulesEngine");
        Intrinsics.j(rulesLoader, "rulesLoader");
        this.launchRulesEngine = launchRulesEngine;
        this.rulesLoader = rulesLoader;
        this.configDataStore = K.f().d().a("AdobeMobile_ConfigState");
    }
}

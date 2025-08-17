package com.adobe.marketing.mobile.internal.configuration;

import H5.h;
import H5.i;
import H5.j;
import I5.q;
import I5.y;
import M5.k;
import Q5.t;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.G;
import com.adobe.marketing.mobile.InterfaceC6456o;
import com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension;
import f6.C13845a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 N2\u00020\u0001:\u0002>CB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB9\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010\u0014J!\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b*\u0010+J1\u00100\u001a\u00020\u00122\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010-0,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b0\u00101J%\u00102\u001a\u00020\u00122\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010-0,H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u0002042\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u000204H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0012H\u0014¢\u0006\u0004\b;\u0010\u0014J\u000f\u0010<\u001a\u00020\"H\u0014¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\"H\u0014¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\"H\u0014¢\u0006\u0004\b?\u0010=J\u0017\u0010@\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b@\u0010!J\u0017\u0010A\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\bA\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010%R\u001c\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationExtension;", "Lcom/adobe/marketing/mobile/l;", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/m;)V", "LH5/a;", "appIdManager", "LM5/k;", "launchRulesEngine", "Ljava/util/concurrent/ScheduledExecutorService;", "retryWorker", "(Lcom/adobe/marketing/mobile/m;LH5/a;LM5/k;Ljava/util/concurrent/ScheduledExecutorService;)V", "LH5/i;", "configurationStateManager", "LH5/h;", "configurationRulesManager", "(Lcom/adobe/marketing/mobile/m;LH5/a;LM5/k;Ljava/util/concurrent/ScheduledExecutorService;LH5/i;LH5/h;)V", "", "C", "()V", "Lcom/adobe/marketing/mobile/h;", "event", "Lcom/adobe/marketing/mobile/G;", "sharedStateResolver", "u", "(Lcom/adobe/marketing/mobile/h;Lcom/adobe/marketing/mobile/G;)V", "w", "v", "K", "t", "(Lcom/adobe/marketing/mobile/G;)V", "G", "(Lcom/adobe/marketing/mobile/h;)V", "", "appId", "Ljava/util/concurrent/Future;", "I", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "s", "Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationExtension$c;", "rulesSource", "r", "(Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationExtension$c;Lcom/adobe/marketing/mobile/G;)V", "", "", "eventData", "triggerEvent", "y", "(Ljava/util/Map;Lcom/adobe/marketing/mobile/h;)V", "x", "(Ljava/util/Map;)V", "", "F", "(Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationExtension$c;)Z", "newAppId", "isInternalEvent", "B", "(Ljava/lang/String;Z)Z", "g", "e", "()Ljava/lang/String;", "b", "f", "A", "H", "LH5/a;", "c", "LM5/k;", "d", "LH5/i;", "LH5/h;", "Ljava/util/concurrent/ScheduledExecutorService;", "", "retryConfigurationCounter", "h", "Ljava/util/concurrent/Future;", "retryConfigTaskHandle", "i", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfigurationExtension extends AbstractC6453l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final H5.a appIdManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k launchRulesEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i configurationStateManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h configurationRulesManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService retryWorker;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int retryConfigurationCounter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Future<?> retryConfigTaskHandle;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/h;", "e", "<anonymous>", "(Lcom/adobe/marketing/mobile/h;)Lcom/adobe/marketing/mobile/h;"}, k = 3, mv = {1, 5, 1})
    static final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f62536a;

        a(k kVar) {
            this.f62536a = kVar;
        }

        @Override // I5.y
        public final C6449h a(C6449h e10) {
            Intrinsics.j(e10, "e");
            C6449h c6449hB = this.f62536a.b(e10);
            Intrinsics.i(c6449hB, "launchRulesEngine.processEvent(e)");
            return c6449hB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/internal/configuration/ConfigurationExtension$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private enum c {
        CACHE,
        BUNDLED,
        REMOTE
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.BUNDLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.REMOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "config", "", "a", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 5, 1})
    static final class e extends Lambda implements Function1<Map<String, ? extends Object>, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ G f62542g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f62543h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(G g10, String str) {
            super(1);
            this.f62542g = g10;
            this.f62543h = str;
        }

        public final void a(Map<String, ? extends Object> map) {
            if (map != null) {
                ConfigurationExtension.this.s();
                ConfigurationExtension.this.r(c.REMOTE, this.f62542g);
            } else {
                t.e("Configuration", "Configuration", "Failed to download configuration. Applying Will retry download.", new Object[0]);
                G g10 = this.f62542g;
                if (g10 != null) {
                    g10.a(ConfigurationExtension.this.configurationStateManager.e());
                }
                ConfigurationExtension configurationExtension = ConfigurationExtension.this;
                configurationExtension.retryConfigTaskHandle = configurationExtension.I(this.f62543h);
            }
            ConfigurationExtension.this.a().i();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
            a(map);
            return Unit.f142422a;
        }
    }

    public ConfigurationExtension(AbstractC6454m extensionApi) {
        Intrinsics.j(extensionApi, "extensionApi");
        H5.a aVar = new H5.a();
        k kVar = new k("Configuration", extensionApi);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.i(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this(extensionApi, aVar, kVar, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }

    private final boolean B(String newAppId, boolean isInternalEvent) {
        String strB;
        return (!isInternalEvent || (strB = this.appIdManager.b()) == null || StringsKt.r0(strB) || Intrinsics.e(newAppId, strB)) ? false : true;
    }

    private final void C() {
        String strC = this.appIdManager.c();
        if (strC != null && !StringsKt.r0(strC)) {
            x(MapsKt.r(TuplesKt.a("config.appId", strC), TuplesKt.a("config.isinternalevent", Boolean.TRUE)));
        }
        if (this.configurationStateManager.k().isEmpty()) {
            t.e("Configuration", "Configuration", "Initial configuration loaded is empty.", new Object[0]);
        } else {
            r(c.CACHE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(ConfigurationExtension this$0, C6449h it) throws NumberFormatException {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        this$0.A(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(ConfigurationExtension this$0, C6449h it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        this$0.H(it);
    }

    private final boolean F(c rulesSource) {
        int i10 = d.$EnumSwitchMapping$0[rulesSource.ordinal()];
        if (i10 == 1) {
            h hVar = this.configurationRulesManager;
            AbstractC6454m api = a();
            Intrinsics.i(api, "api");
            return hVar.c(api);
        }
        if (i10 == 2) {
            h hVar2 = this.configurationRulesManager;
            AbstractC6454m api2 = a();
            Intrinsics.i(api2, "api");
            return hVar2.b(api2);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj = this.configurationStateManager.e().get("rules.url");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || StringsKt.r0(str)) {
            t.a("Configuration", "Configuration", "Rules URL is empty or null", new Object[0]);
            return false;
        }
        h hVar3 = this.configurationRulesManager;
        AbstractC6454m api3 = a();
        Intrinsics.i(api3, "api");
        return hVar3.d(str, api3);
    }

    private final void G(C6449h event) {
        y(this.configurationStateManager.e(), event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future<?> I(final String appId) {
        int i10 = this.retryConfigurationCounter + 1;
        this.retryConfigurationCounter = i10;
        ScheduledFuture<?> scheduledFutureSchedule = this.retryWorker.schedule(new Runnable() { // from class: H5.f
            @Override // java.lang.Runnable
            public final void run() {
                ConfigurationExtension.J(this.f12276a, appId);
            }
        }, i10 * 5000, TimeUnit.MILLISECONDS);
        Intrinsics.i(scheduledFutureSchedule, "retryWorker.schedule(\n  …it.MILLISECONDS\n        )");
        return scheduledFutureSchedule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(ConfigurationExtension this$0, String appId) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(appId, "$appId");
        this$0.x(MapsKt.r(TuplesKt.a("config.appId", appId), TuplesKt.a("config.isinternalevent", Boolean.TRUE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(c rulesSource, G sharedStateResolver) {
        Map<String, Object> mapE = this.configurationStateManager.e();
        if (sharedStateResolver != null) {
            sharedStateResolver.a(mapE);
        }
        z(this, mapE, null, 2, null);
        boolean zF = F(rulesSource);
        if (rulesSource != c.CACHE || zF) {
            return;
        }
        h hVar = this.configurationRulesManager;
        AbstractC6454m api = a();
        Intrinsics.i(api, "api");
        hVar.b(api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        Future<?> future = this.retryConfigTaskHandle;
        if (future != null) {
            future.cancel(false);
        }
        this.retryConfigTaskHandle = null;
        this.retryConfigurationCounter = 0;
    }

    private final void t(G sharedStateResolver) {
        this.configurationStateManager.b();
        r(c.REMOTE, sharedStateResolver);
    }

    private final void x(Map<String, ? extends Object> eventData) {
        a().c(new C6449h.b("Configuration Request", "com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent").d(eventData).a());
    }

    private final void y(Map<String, ? extends Object> eventData, C6449h triggerEvent) {
        C6449h c6449hA;
        C6449h.b bVarD = new C6449h.b("Configuration Response", "com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent").d(eventData);
        if (triggerEvent == null) {
            c6449hA = bVarD.a();
            Intrinsics.i(c6449hA, "{\n            builder.build()\n        }");
        } else {
            c6449hA = bVarD.c(triggerEvent).a();
            Intrinsics.i(c6449hA, "{\n            builder.in…rEvent).build()\n        }");
        }
        a().c(c6449hA);
    }

    static /* synthetic */ void z(ConfigurationExtension configurationExtension, Map map, C6449h c6449h, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c6449h = null;
        }
        configurationExtension.y(map, c6449h);
    }

    public final void A(C6449h event) throws NumberFormatException {
        Intrinsics.j(event, "event");
        if (event.o() == null) {
            return;
        }
        if (event.o().containsKey("config.appId")) {
            u(event, a().a(event));
            return;
        }
        if (event.o().containsKey("config.assetFile")) {
            v(event, a().a(event));
            return;
        }
        if (event.o().containsKey("config.filePath")) {
            w(event, a().a(event));
            return;
        }
        if (event.o().containsKey("config.update")) {
            K(event, a().a(event));
        } else if (event.o().containsKey("config.clearUpdates")) {
            t(a().a(event));
        } else if (event.o().containsKey("config.getData")) {
            G(event);
        }
    }

    public final void H(C6449h event) {
        Intrinsics.j(event, "event");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j jVar = j.f12296a;
        AbstractC6454m api = a();
        Intrinsics.i(api, "api");
        linkedHashMap.put("config.allIdentifiers", jVar.a(event, api));
        a().c(new C6449h.b("Configuration Response Identity", "com.adobe.eventType.configuration", "com.adobe.eventSource.responseIdentity").d(linkedHashMap).c(event).a());
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String b() {
        return "Configuration";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String e() {
        return "com.adobe.module.configuration";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String f() {
        return "3.5.0";
    }

    private final void K(C6449h event, G sharedStateResolver) {
        Map<String, ? extends Object> mapT = C13845a.t(Object.class, event.o(), "config.update", null);
        if (mapT == null) {
            t.a("Configuration", "Configuration", "Invalid configuration. Provided configuration is null or contains non string keys.", new Object[0]);
            if (sharedStateResolver != null) {
                sharedStateResolver.a(this.configurationStateManager.e());
                return;
            }
            return;
        }
        this.configurationStateManager.q(mapT);
        r(c.REMOTE, sharedStateResolver);
    }

    private final void u(C6449h event, G sharedStateResolver) throws NumberFormatException {
        Object obj;
        Map<String, Object> mapO = event.o();
        String str = null;
        if (mapO != null) {
            obj = mapO.get("config.appId");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        if (str != null && !StringsKt.r0(str)) {
            if (!this.configurationStateManager.h(str)) {
                if (sharedStateResolver != null) {
                    sharedStateResolver.a(this.configurationStateManager.e());
                    return;
                }
                return;
            } else {
                if (B(str, C13845a.l(event.o(), "config.isinternalevent", false))) {
                    t.e("Configuration", "Configuration", "An explicit configure with AppId request has preceded this internal event.", new Object[0]);
                    if (sharedStateResolver != null) {
                        sharedStateResolver.a(this.configurationStateManager.e());
                        return;
                    }
                    return;
                }
                a().j();
                this.configurationStateManager.n(str, new e(sharedStateResolver, str));
                return;
            }
        }
        t.e("Configuration", "Configuration", "AppId in configureWithAppID event is null.", new Object[0]);
        this.appIdManager.d();
        if (sharedStateResolver != null) {
            sharedStateResolver.a(this.configurationStateManager.e());
        }
    }

    private final void v(C6449h event, G sharedStateResolver) {
        Object obj;
        Map<String, Object> mapO = event.o();
        if (mapO != null) {
            obj = mapO.get("config.assetFile");
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (str != null && !StringsKt.r0(str)) {
            if (this.configurationStateManager.o(str)) {
                r(c.REMOTE, sharedStateResolver);
                return;
            }
            t.a("Configuration", "Configuration", "Could not update configuration from file asset: " + str, new Object[0]);
            if (sharedStateResolver != null) {
                sharedStateResolver.a(this.configurationStateManager.e());
                return;
            }
            return;
        }
        t.a("Configuration", "Configuration", "Asset file name for configuration is null or empty.", new Object[0]);
        if (sharedStateResolver != null) {
            sharedStateResolver.a(this.configurationStateManager.e());
        }
    }

    private final void w(C6449h event, G sharedStateResolver) {
        Object obj;
        Map<String, Object> mapO = event.o();
        if (mapO != null) {
            obj = mapO.get("config.filePath");
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (str != null && !StringsKt.r0(str)) {
            if (this.configurationStateManager.p(str)) {
                r(c.REMOTE, sharedStateResolver);
                return;
            }
            t.a("Configuration", "Configuration", "Could not update configuration from file path: " + str, new Object[0]);
            if (sharedStateResolver != null) {
                sharedStateResolver.a(this.configurationStateManager.e());
                return;
            }
            return;
        }
        t.f("Configuration", "Configuration", "Unable to read config from provided file (filePath: " + str + " is invalid)", new Object[0]);
        if (sharedStateResolver != null) {
            sharedStateResolver.a(this.configurationStateManager.e());
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void g() {
        super.g();
        Map<String, Object> mapE = this.configurationStateManager.e();
        if (!mapE.isEmpty()) {
            a().b(mapE, null);
        }
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent", new InterfaceC6456o() { // from class: H5.d
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) throws NumberFormatException {
                ConfigurationExtension.D(this.f12274a, c6449h);
            }
        });
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.requestIdentity", new InterfaceC6456o() { // from class: H5.e
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                ConfigurationExtension.E(this.f12275a, c6449h);
            }
        });
    }

    private ConfigurationExtension(AbstractC6454m abstractC6454m, H5.a aVar, k kVar, ScheduledExecutorService scheduledExecutorService) {
        this(abstractC6454m, aVar, kVar, scheduledExecutorService, new i(aVar), new h(kVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurationExtension(AbstractC6454m extensionApi, H5.a appIdManager, k launchRulesEngine, ScheduledExecutorService retryWorker, i configurationStateManager, h configurationRulesManager) {
        super(extensionApi);
        Intrinsics.j(extensionApi, "extensionApi");
        Intrinsics.j(appIdManager, "appIdManager");
        Intrinsics.j(launchRulesEngine, "launchRulesEngine");
        Intrinsics.j(retryWorker, "retryWorker");
        Intrinsics.j(configurationStateManager, "configurationStateManager");
        Intrinsics.j(configurationRulesManager, "configurationRulesManager");
        this.appIdManager = appIdManager;
        this.launchRulesEngine = launchRulesEngine;
        this.retryWorker = retryWorker;
        this.configurationStateManager = configurationStateManager;
        this.configurationRulesManager = configurationRulesManager;
        C();
        q.INSTANCE.a().X(new a(launchRulesEngine));
    }
}

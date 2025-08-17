package com.adobe.marketing.mobile.assurance.internal;

import Q5.InterfaceC5076h;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import f6.C13845a;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\t2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0001¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0001¢\u0006\u0004\b$\u0010#J\u0019\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0001¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020'H\u0001¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u001fH\u0001¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00105R\u0018\u00107\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00106¨\u00068"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/E;", "", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/m;)V", "Lcom/adobe/marketing/mobile/assurance/internal/D;", "assuranceSharedStateManager", "(Lcom/adobe/marketing/mobile/m;Lcom/adobe/marketing/mobile/assurance/internal/D;)V", "", "stateOwner", "eventName", "", "Lcom/adobe/marketing/mobile/assurance/internal/l;", "g", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "owner", "", "stateContent", "stateType", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/adobe/marketing/mobile/assurance/internal/l;", "extensionsMap", "extensionName", "d", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "content", "l", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/adobe/marketing/mobile/H;", "result", "", "h", "(Lcom/adobe/marketing/mobile/H;)Z", "f", "()Ljava/lang/String;", "c", "Lcom/adobe/marketing/mobile/h;", "event", "", "i", "(Lcom/adobe/marketing/mobile/h;)V", "sessionID", "k", "(Ljava/lang/String;)V", "a", "()V", "urlEncoded", "e", "(Z)Ljava/lang/String;", "b", "()Ljava/util/List;", "Lcom/adobe/marketing/mobile/m;", "Lcom/adobe/marketing/mobile/assurance/internal/D;", "Lcom/adobe/marketing/mobile/h;", "lastSDKEvent", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6454m extensionApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D assuranceSharedStateManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C6449h lastSDKEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    public E(AbstractC6454m extensionApi) {
        Intrinsics.j(extensionApi, "extensionApi");
        InterfaceC5076h interfaceC5076hD = Q5.K.f().d();
        Intrinsics.i(interfaceC5076hD, "getInstance().dataStoreService");
        this(extensionApi, new D(interfaceC5076hD));
    }

    public E(AbstractC6454m extensionApi, D assuranceSharedStateManager) {
        Intrinsics.j(extensionApi, "extensionApi");
        Intrinsics.j(assuranceSharedStateManager, "assuranceSharedStateManager");
        this.extensionApi = extensionApi;
        this.assuranceSharedStateManager = assuranceSharedStateManager;
    }

    private final List<C6430l> g(String stateOwner, String eventName) {
        ArrayList arrayList = new ArrayList();
        AbstractC6454m abstractC6454m = this.extensionApi;
        C6449h c6449h = this.lastSDKEvent;
        com.adobe.marketing.mobile.F f10 = com.adobe.marketing.mobile.F.ANY;
        com.adobe.marketing.mobile.H hE = abstractC6454m.e(stateOwner, c6449h, false, f10);
        if (h(hE)) {
            Map<String, Object> mapB = hE != null ? hE.b() : null;
            if (mapB != null && !mapB.isEmpty()) {
                arrayList.add(j(stateOwner, eventName, hE != null ? hE.b() : null, "state.data"));
            }
        }
        com.adobe.marketing.mobile.H hF = this.extensionApi.f(stateOwner, this.lastSDKEvent, false, f10);
        if (h(hF)) {
            Map<String, Object> mapB2 = hF != null ? hF.b() : null;
            if (mapB2 != null && !mapB2.isEmpty()) {
                arrayList.add(j(stateOwner, eventName, hF != null ? hF.b() : null, "xdm.state.data"));
            }
        }
        return arrayList;
    }

    private final boolean h(com.adobe.marketing.mobile.H result) {
        return result != null && result.a() == com.adobe.marketing.mobile.I.SET;
    }

    private final C6430l j(String owner, String eventName, Map<String, ? extends Object> stateContent, String stateType) {
        HashMap map = new HashMap();
        map.put("ACPExtensionEventName", eventName);
        map.put("ACPExtensionEventType", "com.adobe.eventType.hub");
        map.put("ACPExtensionEventSource", "com.adobe.eventSource.sharedState");
        map.put("ACPExtensionEventData", MapsKt.g(TuplesKt.a("stateowner", owner)));
        HashMap map2 = new HashMap();
        map2.put(stateType, stateContent);
        map.put("metadata", map2);
        return new C6430l("generic", map);
    }

    private final String l(String content) {
        try {
            String strEncode = URLEncoder.encode(content, "UTF-8");
            Intrinsics.i(strEncode, "{\n            URLEncoder…ntent, \"UTF-8\")\n        }");
            return strEncode;
        } catch (UnsupportedEncodingException e10) {
            Q5.t.a("Assurance", "AssuranceStateManager", "Error while encoding the content. Error %s", e10.getLocalizedMessage());
            return "";
        }
    }

    @JvmName
    public final void a() {
        this.assuranceSharedStateManager.e(null);
        this.extensionApi.b(MapsKt.k(), null);
        Q5.t.a("Assurance", "AssuranceStateManager", "Assurance shared state cleared", new Object[0]);
    }

    @JvmName
    public final List<C6430l> b() {
        ArrayList arrayList = new ArrayList();
        com.adobe.marketing.mobile.H hE = this.extensionApi.e("com.adobe.module.eventhub", this.lastSDKEvent, false, com.adobe.marketing.mobile.F.ANY);
        if (h(hE)) {
            Map<String, Object> mapB = hE != null ? hE.b() : null;
            if (mapB != null && !mapB.isEmpty()) {
                arrayList.addAll(g("com.adobe.module.eventhub", "EventHub State"));
                Map<String, ? extends Object> mapT = C13845a.t(Object.class, mapB, "extensions", null);
                if (mapT != null) {
                    for (String extensionName : mapT.keySet()) {
                        Intrinsics.i(extensionName, "extensionName");
                        arrayList.addAll(g(extensionName, d(mapT, extensionName) + " State"));
                    }
                }
            }
        }
        return arrayList;
    }

    @JvmName
    public final String c() {
        return this.assuranceSharedStateManager.getAssuranceSharedState().getClientId();
    }

    @JvmName
    public final String e(boolean urlEncoded) {
        com.adobe.marketing.mobile.H hE = this.extensionApi.e("com.adobe.module.configuration", this.lastSDKEvent, false, com.adobe.marketing.mobile.F.ANY);
        if (!h(hE)) {
            Q5.t.b("Assurance", "AssuranceStateManager", "SDK configuration is not available to read OrgId", new Object[0]);
            return "";
        }
        Map<String, Object> mapB = hE != null ? hE.b() : null;
        if (mapB == null || mapB.isEmpty()) {
            Q5.t.b("Assurance", "AssuranceStateManager", "SDK configuration is not available to read OrgId", new Object[0]);
            return "";
        }
        String orgId = C13845a.o(mapB, "experienceCloud.org", "");
        if (orgId == null || orgId.length() == 0) {
            Q5.t.a("Assurance", "AssuranceStateManager", "Org id is null or empty", new Object[0]);
            return "";
        }
        if (urlEncoded) {
            Intrinsics.i(orgId, "orgId");
            return l(orgId);
        }
        Intrinsics.i(orgId, "{\n            orgId\n        }");
        return orgId;
    }

    @JvmName
    public final String f() {
        return this.assuranceSharedStateManager.getAssuranceSharedState().getSessionId();
    }

    @JvmName
    public final void i(C6449h event) {
        this.lastSDKEvent = event;
    }

    @JvmName
    public final void k(String sessionID) {
        this.assuranceSharedStateManager.e(sessionID);
        Map<String, Object> mapA = this.assuranceSharedStateManager.getAssuranceSharedState().a();
        Q5.t.a("Assurance", "AssuranceStateManager", "Assurance shared state updated: \n " + mapA, new Object[0]);
        this.extensionApi.b(mapA, this.lastSDKEvent);
    }

    private final String d(Map<String, ? extends Object> extensionsMap, String extensionName) {
        try {
            Object obj = extensionsMap.get(extensionName);
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Object obj2 = ((Map) obj).get("friendlyName");
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.String");
            return (String) obj2;
        } catch (Exception unused) {
            return extensionName;
        }
    }
}

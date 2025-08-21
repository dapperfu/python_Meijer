package com.adobe.marketing.mobile.identity;

import M5.r;
import R5.A;
import R5.F;
import R5.K;
import R5.t;
import R5.v;
import R5.w;
import R5.x;
import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6581o;
import com.adobe.marketing.mobile.N;
import g6.C14328a;
import g6.C14331d;
import g6.C14332e;
import g6.k;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class IdentityExtension extends AbstractC6578l {

    /* renamed from: p, reason: collision with root package name */
    private static final Object f63326p = new Object();

    /* renamed from: b, reason: collision with root package name */
    private R5.n f63327b;

    /* renamed from: c, reason: collision with root package name */
    a f63328c;

    /* renamed from: d, reason: collision with root package name */
    private final v f63329d;

    /* renamed from: e, reason: collision with root package name */
    private String f63330e;

    /* renamed from: f, reason: collision with root package name */
    private String f63331f;

    /* renamed from: g, reason: collision with root package name */
    private String f63332g;

    /* renamed from: h, reason: collision with root package name */
    private String f63333h;

    /* renamed from: i, reason: collision with root package name */
    private String f63334i;

    /* renamed from: j, reason: collision with root package name */
    private long f63335j;

    /* renamed from: k, reason: collision with root package name */
    private long f63336k;

    /* renamed from: l, reason: collision with root package name */
    private List<N> f63337l;

    /* renamed from: m, reason: collision with root package name */
    private D f63338m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f63339n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f63340o;

    IdentityExtension(AbstractC6579m abstractC6579m) {
        this(abstractC6579m, K.f().d().a("visitorIDServiceDataStore"), null);
    }

    private static boolean g0(N n10, N n11) {
        if (n10 != null && n11 != null) {
            if (n10.d() != null) {
                return n10.d().equals(n11.d());
            }
            if (n11.d() == null) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void j(R5.o oVar) {
        if (oVar == null) {
            t.e("Identity", "IdentityExtension", "sendOptOutHit - Failed to send the opt-out hit because the connection  is null(device is offline).", new Object[0]);
            return;
        }
        if (oVar.d() == 200) {
            t.e("Identity", "IdentityExtension", "sendOptOutHit - Successfully sent the opt-out hit.", new Object[0]);
        } else {
            t.e("Identity", "IdentityExtension", "sendOptOutHit - Failed to send the opt-out hit with connection status (%s).", Integer.valueOf(oVar.d()));
        }
        oVar.close();
    }

    private String n(a aVar) {
        if (aVar == null || aVar.c() == null || this.f63330e == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("d_orgid", aVar.c());
        map.put("d_mid", this.f63330e);
        g6.k kVar = new g6.k();
        kVar.a("demoptout.jpg").g(aVar.b()).d(map);
        return kVar.e();
    }

    private void r() {
        this.f63330e = null;
        this.f63331f = null;
        this.f63333h = null;
        this.f63334i = null;
        this.f63337l = null;
        this.f63332g = null;
        v vVar = this.f63329d;
        if (vVar != null) {
            vVar.remove("ADOBEMOBILE_AID_SYNCED");
            this.f63329d.remove("ADOBEMOBILE_ANALYTICS_PUSH_SYNC");
            synchronized (f63326p) {
                this.f63329d.remove("ADOBEMOBILE_PUSH_ENABLED");
            }
        }
    }

    private Map<String, String> w(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        if (map.containsKey("pushidentifier")) {
            try {
                String strO = C14328a.o(map, "pushidentifier", null);
                p0(strO);
                map2.put("20919", strO);
            } catch (Exception e10) {
                t.b("Identity", "IdentityExtension", "extractDPID : Unable to update the push identifier due to: (%s).", e10);
            }
        }
        if (map2.size() == 0) {
            return null;
        }
        return map2;
    }

    String C(List<N> list) {
        if (list == null || list.isEmpty()) {
            t.a("Identity", "IdentityExtension", "generateURLEncodedValuesCustomerIdString : No Visitor ID exists in the provided list to generate for URL.", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (N n10 : list) {
            sb2.append("&");
            sb2.append("d_cid_ic");
            sb2.append("=");
            sb2.append(g6.l.b(n10.d()));
            sb2.append("%01");
            String strB = g6.l.b(n10.b());
            if (strB != null) {
                sb2.append(strB);
            }
            sb2.append("%01");
            sb2.append(n10.a().e());
        }
        if (sb2.charAt(0) == '&') {
            sb2.deleteCharAt(0);
        }
        return sb2.toString();
    }

    private void K(String str, Map<String, Object> map, C6574h c6574h) {
        C6574h c6574hA = c6574h == null ? new C6574h.b(str, "com.adobe.eventType.identity", "com.adobe.eventSource.responseIdentity").d(map).a() : new C6574h.b(str, "com.adobe.eventType.identity", "com.adobe.eventSource.responseIdentity").d(map).c(c6574h).a();
        a().c(c6574hA);
        t.e("Identity", "IdentityExtension", "dispatchResponse : Identity Response event has been added to event hub : %s", c6574hA.toString());
    }

    private void Q() {
        if (this.f63327b == null) {
            this.f63327b = new F(K.f().c().a("com.adobe.module.identity"), new m(this));
        }
    }

    private boolean T() {
        synchronized (f63326p) {
            try {
                v vVar = this.f63329d;
                if (vVar == null) {
                    t.e("Identity", "IdentityExtension", "isPushEnabled : Unable to update push flag because the LocalStorageService was not available.", new Object[0]);
                    return false;
                }
                return vVar.getBoolean("ADOBEMOBILE_PUSH_ENABLED", false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void V(Map<String, Object> map) {
        this.f63338m = D.b(C14328a.o(map, "global.privacy", b.f63344a.e()));
    }

    private static N a0(String str) {
        int iIndexOf = str.indexOf(61);
        if (iIndexOf == -1) {
            t.a("Identity", "IdentityExtension", "parseCustomerIDStringToVisitorIDObject : Unable to load Visitor ID from Shared Preferences: (%s).", str);
            return null;
        }
        try {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            List listAsList = Arrays.asList(strSubstring2.split("%01"));
            if (listAsList.size() != 3) {
                t.a("Identity", "IdentityExtension", "parseCustomerIDStringToVisitorIDObject : Unable to load Visitor ID from Shared Preferences because the value was malformed: (%s).", strSubstring2);
                return null;
            }
            if (g6.i.a((String) listAsList.get(1))) {
                t.a("Identity", "IdentityExtension", "parseCustomerIDStringToVisitorIDObject : Unable to load Visitor ID from Shared Preferences because the ECID had null or empty id: (%s).", strSubstring2);
                return null;
            }
            try {
                return new N(strSubstring, (String) listAsList.get(0), (String) listAsList.get(1), N.a.b(Integer.parseInt((String) listAsList.get(2))));
            } catch (IllegalStateException | NumberFormatException e10) {
                t.a("Identity", "IdentityExtension", "parseCustomerIDStringToVisitorIDObject : Unable to parse the ECID: (%s) due to an exception: (%s).", str, e10.getLocalizedMessage());
                return null;
            }
        } catch (IndexOutOfBoundsException e11) {
            t.a("Identity", "IdentityExtension", "parseCustomerIDStringToVisitorIDObject : Unable to load Visitor ID: (%s) from Shared Preference because the name or value was malformed as in the exception: (%s).", str, e11);
            return null;
        }
    }

    private void j0(boolean z10) {
        synchronized (f63326p) {
            try {
                v vVar = this.f63329d;
                if (vVar != null) {
                    vVar.f("ADOBEMOBILE_PUSH_ENABLED", z10);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("setPushStatus : Push notifications status is now: ");
                    sb2.append(z10 ? "Enabled" : "Disabled");
                    t.e("Identity", "IdentityExtension", sb2.toString(), new Object[0]);
                } else {
                    t.e("Identity", "IdentityExtension", "setPushStatus : Unable to update push flag because the LocalStorageService was not available.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String m0(List<N> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (N n10 : list) {
            sb2.append("&");
            sb2.append("d_cid_ic");
            sb2.append("=");
            sb2.append(n10.d());
            sb2.append("%01");
            if (n10.b() != null) {
                sb2.append(n10.b());
            }
            sb2.append("%01");
            sb2.append(n10.a().e());
        }
        return sb2.toString();
    }

    private void n0(String str) {
        this.f63331f = str;
        h0();
    }

    private String o(List<N> list, Map<String, String> map, a aVar, boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("d_ver", "2");
        linkedHashMap.put("d_rtbd", "json");
        if (z10) {
            if (g6.i.a(this.f63331f)) {
                linkedHashMap.put("device_consent", "0");
                linkedHashMap.put("d_consent_ic", "DSID_20914");
            } else {
                linkedHashMap.put("device_consent", "1");
            }
        }
        linkedHashMap.put("d_orgid", aVar.c());
        String str = this.f63330e;
        if (str != null) {
            linkedHashMap.put("d_mid", str);
        }
        String str2 = this.f63333h;
        if (str2 != null) {
            linkedHashMap.put("d_blob", str2);
        }
        String str3 = this.f63334i;
        if (str3 != null) {
            linkedHashMap.put("dcs_region", str3);
        }
        g6.k kVar = new g6.k();
        kVar.a(PreferencesHelper.PREF_ID).g(aVar.b()).d(linkedHashMap);
        String strC = C(list);
        if (!g6.i.a(strC)) {
            kVar.b(strC, k.a.NONE);
        }
        String strA = A(map);
        if (!g6.i.a(strA)) {
            kVar.b(strA, k.a.NONE);
        }
        return kVar.e();
    }

    private List<Map<String, Object>> s(List<N> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<N> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(r.b(it.next()));
        }
        return arrayList;
    }

    private void u() {
        C14332e.a("ADBMobileIdentity.sqlite");
    }

    StringBuilder D(a aVar, Map<String, Object> map) {
        String strO;
        StringBuilder sb2 = new StringBuilder();
        String strK = k(k(null, "TS", String.valueOf(g6.j.h())), "MCMID", this.f63330e);
        if (map != null) {
            String strO2 = C14328a.o(map, "aid", null);
            if (!g6.i.a(strO2)) {
                strK = k(strK, "MCAID", strO2);
            }
            strO = C14328a.o(map, "vid", null);
        } else {
            strO = null;
        }
        String strC = aVar != null ? aVar.c() : null;
        if (!g6.i.a(strC)) {
            strK = k(strK, "MCORGID", strC);
        }
        sb2.append("adobe_mc");
        sb2.append("=");
        sb2.append(g6.l.b(strK));
        if (!g6.i.a(strO)) {
            sb2.append("&");
            sb2.append("adobe_aa_vid");
            sb2.append("=");
            sb2.append(g6.l.b(strO));
        }
        return sb2;
    }

    void E(C6574h c6574h) {
        Map<String, Object> mapO;
        v vVar;
        if (c6574h == null || (mapO = c6574h.o()) == null) {
            return;
        }
        String strO = C14328a.o(mapO, "aid", null);
        if (g6.i.a(strO) || (vVar = this.f63329d) == null || vVar.contains("ADOBEMOBILE_AID_SYNCED")) {
            return;
        }
        this.f63329d.f("ADOBEMOBILE_AID_SYNCED", true);
        HashMap map = new HashMap();
        map.put("AVID", strO);
        HashMap map2 = new HashMap();
        map2.put("visitoridentifiers", map);
        map2.put("authenticationstate", Integer.valueOf(N.a.UNKNOWN.e()));
        map2.put("forcesync", Boolean.FALSE);
        map2.put("issyncevent", Boolean.TRUE);
        a().c(new C6574h.b("AVID Sync", "com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity").d(map2).a());
    }

    void G(C6574h c6574h) {
        Map<String, Object> mapO;
        if (c6574h == null || (mapO = c6574h.o()) == null) {
            return;
        }
        o0(mapO);
        D dB = D.b(C14328a.o(mapO, "global.privacy", b.f63344a.e()));
        this.f63327b.d(dB);
        if (dB.equals(D.OPT_OUT)) {
            N(mapO);
        }
        e0(c6574h, mapO);
    }

    void I(Map<String, Object> map) {
        C6574h c6574hA = new C6574h.b("Configuration Update From IdentityExtension", "com.adobe.eventType.configuration", "com.adobe.eventSource.requestContent").d(map).a();
        a().c(c6574hA);
        t.e("Identity", "IdentityExtension", "dispatchConfigUpdateRequest : Configuration Update event has been added to event hub : %s", c6574hA.toString());
    }

    void J(C6574h c6574h) {
        if (this.f63338m == D.OPT_OUT) {
            t.a("Identity", "IdentityExtension", "handleIdentityRequestReset: Privacy is opt-out, ignoring event.", new Object[0]);
            return;
        }
        r();
        h0();
        if (O(c6574h, false)) {
            a().b(Z(), c6574h);
        }
    }

    void L(C6574h c6574h) {
        Map<String, Object> mapO;
        if (c6574h == null || (mapO = c6574h.o()) == null || !C14328a.l(mapO, "updatesharedstate", false)) {
            return;
        }
        a().b(Z(), c6574h);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean M(com.adobe.marketing.mobile.identity.n r9) {
        /*
            r8 = this;
            java.lang.String r0 = "IdentityExtension"
            java.lang.String r1 = "Identity"
            r2 = 0
            if (r9 != 0) goto Lf
            java.lang.String r9 = "handleNetworkResponseMap : Received an empty JSON in response from ECID Service, so there is nothing to handle."
            java.lang.Object[] r3 = new java.lang.Object[r2]
            R5.t.a(r1, r0, r9, r3)
            return r2
        Lf:
            java.util.List<java.lang.String> r3 = r9.f63365f
            if (r3 == 0) goto L3d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L3d
            java.lang.String r3 = "handleNetworkResponseMap : Received opt-out response from ECID Service, so updating the privacy status in the configuration to opt-out."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            R5.t.a(r1, r0, r3, r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.adobe.marketing.mobile.D r4 = com.adobe.marketing.mobile.D.OPT_OUT
            java.lang.String r4 = r4.e()
            java.lang.String r5 = "global.privacy"
            r3.put(r5, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "config.update"
            r4.put(r5, r3)
            r8.I(r4)
        L3d:
            java.lang.String r3 = r9.f63363d
            boolean r3 = g6.i.a(r3)
            r4 = 1
            if (r3 != 0) goto L63
            java.lang.String r9 = r9.f63363d
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r3 = "handleNetworkResponseMap : ECID Service returned an error: (%s)."
            R5.t.f(r1, r0, r3, r9)
            java.lang.String r9 = r8.f63330e
            if (r9 != 0) goto Ld7
            java.lang.String r9 = "handleNetworkResponseMap : ECID is null when network response error received. Generate new ECID value."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            R5.t.e(r1, r0, r9, r2)
            java.lang.String r9 = r8.B()
            r8.f63330e = r9
            return r4
        L63:
            java.lang.String r3 = r9.f63361b
            boolean r3 = g6.i.a(r3)
            if (r3 != 0) goto Ld7
            java.lang.String r3 = r9.f63361b
            java.lang.String r5 = r8.f63330e
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto Ld7
            java.lang.String r3 = r9.f63360a     // Catch: java.lang.Exception -> L82
            if (r3 == 0) goto L84
            java.lang.String r5 = r8.f63333h     // Catch: java.lang.Exception -> L82
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> L82
            if (r3 == 0) goto L94
            goto L84
        L82:
            r9 = move-exception
            goto Lce
        L84:
            java.lang.String r3 = r9.f63360a     // Catch: java.lang.Exception -> L82
            boolean r3 = g6.i.a(r3)     // Catch: java.lang.Exception -> L82
            if (r3 == 0) goto L95
            java.lang.String r3 = r8.f63333h     // Catch: java.lang.Exception -> L82
            boolean r3 = g6.i.a(r3)     // Catch: java.lang.Exception -> L82
            if (r3 != 0) goto L95
        L94:
            r2 = r4
        L95:
            java.lang.String r3 = r9.f63362c     // Catch: java.lang.Exception -> L82
            if (r3 == 0) goto La1
            java.lang.String r5 = r8.f63334i     // Catch: java.lang.Exception -> L82
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> L82
            if (r3 == 0) goto Lb1
        La1:
            java.lang.String r3 = r9.f63362c     // Catch: java.lang.Exception -> L82
            boolean r3 = g6.i.a(r3)     // Catch: java.lang.Exception -> L82
            if (r3 == 0) goto Lb2
            java.lang.String r3 = r8.f63334i     // Catch: java.lang.Exception -> L82
            boolean r3 = g6.i.a(r3)     // Catch: java.lang.Exception -> L82
            if (r3 != 0) goto Lb2
        Lb1:
            r2 = r4
        Lb2:
            java.lang.String r3 = r9.f63360a     // Catch: java.lang.Exception -> L82
            r8.f63333h = r3     // Catch: java.lang.Exception -> L82
            java.lang.String r4 = r9.f63362c     // Catch: java.lang.Exception -> L82
            r8.f63334i = r4     // Catch: java.lang.Exception -> L82
            long r5 = r9.f63364e     // Catch: java.lang.Exception -> L82
            r8.f63336k = r5     // Catch: java.lang.Exception -> L82
            java.lang.String r9 = "handleNetworkResponseMap : ECID Service returned (mid: %s, blob: %s, hint: %s, ttl: %d)."
            java.lang.String r7 = r8.f63330e     // Catch: java.lang.Exception -> L82
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L82
            java.lang.Object[] r3 = new java.lang.Object[]{r7, r3, r4, r5}     // Catch: java.lang.Exception -> L82
            R5.t.a(r1, r0, r9, r3)     // Catch: java.lang.Exception -> L82
            return r2
        Lce:
            java.lang.String r3 = "handleNetworkResponseMap : Error parsing the response from ECID Service : (%s)."
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            R5.t.f(r1, r0, r3, r9)
        Ld7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.identity.IdentityExtension.M(com.adobe.marketing.mobile.identity.n):boolean");
    }

    void N(Map<String, Object> map) {
        if (map.containsKey("audience.server")) {
            return;
        }
        a aVar = new a(map);
        if (aVar.d().equals(D.OPT_OUT)) {
            i0(aVar);
        }
    }

    boolean O(C6574h c6574h, boolean z10) {
        a aVar = this.f63328c;
        if (aVar == null) {
            t.a("Identity", "IdentityExtension", "handleSyncIdentifiers : Unable to process sync identifiers request as the configuration did not contain a valid Experience Cloud organization ID.", new Object[0]);
            return false;
        }
        if (aVar.d() == D.OPT_OUT) {
            t.a("Identity", "IdentityExtension", "handleSyncIdentifiers : Ignored the Sync Identifiers call because the privacy status was opt-out.", new Object[0]);
            return false;
        }
        if (c6574h == null) {
            t.a("Identity", "IdentityExtension", "handleSyncIdentifiers : Ignoring the Sync Identifiers call because the event sent was null.", new Object[0]);
            return false;
        }
        Map<String, Object> mapO = c6574h.o();
        Map<String, String> mapW = w(mapO);
        Map<String, String> mapX = x(mapO);
        N.a aVarB = N.a.b(C14328a.m(mapO, "authenticationstate", 0));
        boolean z11 = z10 || C14328a.l(mapO, "forcesync", false);
        List<N> listZ = z(mapX, aVarB);
        j<N, Boolean> jVarV = v(mapO);
        boolean zBooleanValue = jVarV.b().booleanValue();
        N nA = jVarV.a();
        if (nA != null) {
            listZ.add(nA);
        }
        List<N> listX = X(listZ);
        this.f63337l = listX;
        this.f63337l = q(listX);
        List<N> listQ = q(listZ);
        if (k0(listQ, mapW, z11 || zBooleanValue, this.f63328c)) {
            String strO = o(listQ, mapW, this.f63328c, zBooleanValue);
            if (strO != null) {
                this.f63327b.e(new k(strO, c6574h).d());
            } else {
                t.f("Identity", "IdentityExtension", "handleSyncIdentifiers : Ignoring ID sync because the URL is invalid.", new Object[0]);
            }
        } else {
            t.a("Identity", "IdentityExtension", "handleSyncIdentifiers : Ignoring ID sync because nothing new to sync after the last sync.", new Object[0]);
        }
        h0();
        return true;
    }

    void W() {
        v vVar = this.f63329d;
        int size = 0;
        if (vVar == null) {
            t.a("Identity", "IdentityExtension", "loadVariablesFromPersistentData : Unable to load the Identity data from persistence because the LocalStorageService was null.", new Object[0]);
            return;
        }
        this.f63330e = vVar.getString("ADOBEMOBILE_PERSISTED_MID", null);
        List<N> listT = t(this.f63329d.getString("ADOBEMOBILE_VISITORID_IDS", null));
        this.f63337l = (listT == null || listT.isEmpty()) ? null : listT;
        if (listT != null && !listT.isEmpty()) {
            size = this.f63337l.size();
        }
        this.f63334i = this.f63329d.getString("ADOBEMOBILE_PERSISTED_MID_HINT", null);
        this.f63333h = this.f63329d.getString("ADOBEMOBILE_PERSISTED_MID_BLOB", null);
        this.f63336k = this.f63329d.getLong("ADOBEMOBILE_VISITORID_TTL", 600L);
        this.f63335j = this.f63329d.getLong("ADOBEMOBILE_VISITORID_SYNC", 0L);
        this.f63331f = this.f63329d.getString("ADOBEMOBILE_ADVERTISING_IDENTIFIER", null);
        this.f63332g = this.f63329d.getString("ADOBEMOBILE_PUSH_IDENTIFIER", null);
        t.e("Identity", "IdentityExtension", "loadVariablesFromPersistentData : Successfully loaded the Identity data from persistence. Loaded %d VisitorIds. ECID is set to %s. ", Integer.valueOf(size), this.f63330e);
    }

    List<N> X(List<N> list) {
        N next;
        N n10;
        if (list == null || list.isEmpty()) {
            return this.f63337l;
        }
        ArrayList arrayList = this.f63337l != null ? new ArrayList(this.f63337l) : new ArrayList();
        for (N n11 : list) {
            Iterator<N> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    n10 = null;
                    break;
                }
                next = it.next();
                if (g0(next, n11)) {
                    n10 = new N(next.c(), next.d(), n11.b(), n11.a());
                    break;
                }
            }
            if (n10 != null) {
                arrayList.remove(next);
                arrayList.add(n10);
            } else {
                arrayList.add(n11);
            }
        }
        return arrayList;
    }

    Map<String, Object> Z() {
        HashMap map = new HashMap();
        if (!g6.i.a(this.f63330e)) {
            map.put("mid", this.f63330e);
        }
        if (!g6.i.a(this.f63331f)) {
            map.put("advertisingidentifier", this.f63331f);
        }
        if (!g6.i.a(this.f63332g)) {
            map.put("pushidentifier", this.f63332g);
        }
        if (!g6.i.a(this.f63333h)) {
            map.put("blob", this.f63333h);
        }
        if (!g6.i.a(this.f63334i)) {
            map.put("locationhint", this.f63334i);
        }
        List<N> list = this.f63337l;
        if (list != null && !list.isEmpty()) {
            map.put("visitoridslist", s(this.f63337l));
        }
        map.put("lastsync", Long.valueOf(this.f63335j));
        return map;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String b() {
        return "Identity";
    }

    void b0(C6574h c6574h) {
        Map<String, Object> mapO;
        if (c6574h == null || (mapO = c6574h.o()) == null || !mapO.containsKey("optedouthitsent") || C14328a.l(mapO, "optedouthitsent", false)) {
            return;
        }
        H hE = a().e("com.adobe.module.configuration", c6574h, false, com.adobe.marketing.mobile.F.ANY);
        if (hE == null || hE.a() != I.SET) {
            t.e("Identity", "IdentityExtension", "processAudienceResponse : Unable to process the Identity events in the event queue because the configuration shared state is pending.", new Object[0]);
            return;
        }
        a aVar = new a(hE.b());
        if (aVar.d().equals(D.OPT_OUT)) {
            i0(aVar);
        }
    }

    boolean d0(String str) {
        v vVar = this.f63329d;
        if (vVar == null) {
            t.e("Identity", "IdentityExtension", "processNewPushToken : Unable to update push settings because the LocalStorageService was not available.", new Object[0]);
            return false;
        }
        String string = vVar.getString("ADOBEMOBILE_PUSH_IDENTIFIER", null);
        boolean z10 = this.f63329d.getBoolean("ADOBEMOBILE_ANALYTICS_PUSH_SYNC", false);
        boolean z11 = (g6.i.a(str) && string == null) || (string != null && string.equals(str));
        if ((z11 && !g6.i.a(str)) || (z11 && z10)) {
            return false;
        }
        if (!z10) {
            this.f63329d.f("ADOBEMOBILE_ANALYTICS_PUSH_SYNC", true);
        }
        if (g6.i.a(str)) {
            this.f63329d.remove("ADOBEMOBILE_PUSH_IDENTIFIER");
        } else {
            this.f63329d.d("ADOBEMOBILE_PUSH_IDENTIFIER", str);
        }
        return true;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String e() {
        return "com.adobe.module.identity";
    }

    void e0(C6574h c6574h, Map<String, Object> map) {
        D dB;
        if (map == null || this.f63338m == (dB = D.b(C14328a.o(map, "global.privacy", b.f63344a.e())))) {
            return;
        }
        this.f63338m = dB;
        t.e("Identity", "IdentityExtension", "processPrivacyChange : Processed privacy change request. New privacy status is: (%s).", dB.e());
        if (this.f63338m == D.OPT_OUT) {
            r();
            h0();
            a().b(Z(), c6574h);
        } else if (g6.i.a(this.f63330e) && O(c6574h, false)) {
            a().b(Z(), c6574h);
        }
        Q();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected void h() {
        this.f63327b.c();
    }

    void h0() {
        v vVar = this.f63329d;
        if (vVar == null) {
            t.e("Identity", "IdentityExtension", "savePersistently : Unable to save the IdentityExtension fields into persistence because the data store was null.", new Object[0]);
            return;
        }
        l0(vVar, "ADOBEMOBILE_VISITORID_IDS", m0(this.f63337l));
        l0(this.f63329d, "ADOBEMOBILE_PERSISTED_MID", this.f63330e);
        l0(this.f63329d, "ADOBEMOBILE_PUSH_IDENTIFIER", this.f63332g);
        l0(this.f63329d, "ADOBEMOBILE_ADVERTISING_IDENTIFIER", this.f63331f);
        l0(this.f63329d, "ADOBEMOBILE_PERSISTED_MID_HINT", this.f63334i);
        l0(this.f63329d, "ADOBEMOBILE_PERSISTED_MID_BLOB", this.f63333h);
        this.f63329d.b("ADOBEMOBILE_VISITORID_TTL", this.f63336k);
        this.f63329d.b("ADOBEMOBILE_VISITORID_SYNC", this.f63335j);
        t.e("Identity", "IdentityExtension", "savePersistently : Successfully saved the Identity data into persistence.", new Object[0]);
    }

    void o0(Map<String, Object> map) {
        if (g6.i.a(C14328a.o(map, "experienceCloud.org", null))) {
            return;
        }
        this.f63328c = new a(map);
    }

    void p0(String str) {
        this.f63332g = str;
        if (!d0(str)) {
            t.a("Identity", "IdentityExtension", "updatePushIdentifier : Ignored a push token (%s) as it matches with an existing token, and the push notification status will not be re-sent to Analytics.", str);
            return;
        }
        boolean zT = T();
        if (str == null && !zT) {
            p(false);
            t.a("Identity", "IdentityExtension", "updatePushIdentifier : First time sending a.push.optin false", new Object[0]);
        } else if (str == null) {
            p(false);
        } else {
            if (zT) {
                return;
            }
            p(true);
        }
    }

    List<N> q(List<N> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (g6.i.a(((N) it.next()).b())) {
                    it.remove();
                    t.e("Identity", "IdentityExtension", "cleanupVisitorIdentifiers : VisitorID was discarded due to an empty/null identifier value.", new Object[0]);
                }
            }
        } catch (ClassCastException e10) {
            t.b("Identity", "IdentityExtension", "cleanupVisitorIdentifiers : Caught ClassCastException while iterating through visitor identifiers: %s", e10.getLocalizedMessage());
        } catch (NullPointerException e11) {
            t.b("Identity", "IdentityExtension", "cleanupVisitorIdentifiers : Caught NullPointerException while iterating through visitor identifiers: %s", e11.getLocalizedMessage());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:8:0x0016, B:12:0x0022, B:14:0x0028, B:23:0x0041, B:25:0x0047, B:27:0x004f, B:30:0x0058, B:19:0x0033, B:21:0x0039), top: B:42:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.adobe.marketing.mobile.identity.j<com.adobe.marketing.mobile.N, java.lang.Boolean> v(java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "IdentityExtension"
            java.lang.String r1 = "Identity"
            java.lang.String r2 = "00000000-0000-0000-0000-000000000000"
            java.lang.String r3 = ""
            r4 = 0
            if (r9 == 0) goto L87
            java.lang.String r5 = "advertisingidentifier"
            boolean r6 = r9.containsKey(r5)
            if (r6 != 0) goto L15
            goto L87
        L15:
            r6 = 0
            java.lang.String r9 = g6.C14328a.o(r9, r5, r3)     // Catch: java.lang.Exception -> L31
            boolean r5 = r2.equals(r9)     // Catch: java.lang.Exception -> L31
            if (r5 == 0) goto L21
            goto L22
        L21:
            r3 = r9
        L22:
            boolean r9 = r3.isEmpty()     // Catch: java.lang.Exception -> L31
            if (r9 != 0) goto L33
            java.lang.String r9 = r8.f63331f     // Catch: java.lang.Exception -> L31
            boolean r9 = r3.equals(r9)     // Catch: java.lang.Exception -> L31
            if (r9 == 0) goto L41
            goto L33
        L31:
            r9 = move-exception
            goto L74
        L33:
            boolean r9 = r3.isEmpty()     // Catch: java.lang.Exception -> L31
            if (r9 == 0) goto L7d
            java.lang.String r9 = r8.f63331f     // Catch: java.lang.Exception -> L31
            boolean r9 = g6.i.a(r9)     // Catch: java.lang.Exception -> L31
            if (r9 != 0) goto L7d
        L41:
            boolean r9 = r3.isEmpty()     // Catch: java.lang.Exception -> L31
            if (r9 != 0) goto L57
            java.lang.String r9 = r8.f63331f     // Catch: java.lang.Exception -> L31
            boolean r9 = g6.i.a(r9)     // Catch: java.lang.Exception -> L31
            if (r9 != 0) goto L57
            java.lang.String r9 = r8.f63331f     // Catch: java.lang.Exception -> L31
            boolean r9 = r2.equals(r9)     // Catch: java.lang.Exception -> L31
            if (r9 == 0) goto L58
        L57:
            r6 = 1
        L58:
            com.adobe.marketing.mobile.N r9 = new com.adobe.marketing.mobile.N     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "d_cid_ic"
            java.lang.String r5 = "DSID_20914"
            com.adobe.marketing.mobile.N$a r7 = com.adobe.marketing.mobile.N.a.AUTHENTICATED     // Catch: java.lang.Exception -> L31
            r9.<init>(r2, r5, r3, r7)     // Catch: java.lang.Exception -> L31
            r8.n0(r3)     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = "extractAndUpdateAdid : The advertising identifier was set to: (%s)."
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L71
            R5.t.e(r1, r0, r2, r3)     // Catch: java.lang.Exception -> L71
            r4 = r9
            goto L7d
        L71:
            r2 = move-exception
            r4 = r9
            r9 = r2
        L74:
            java.lang.String r2 = "extractAndUpdateAdid : Unable to update the advertising identifier due to: (%s)"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            R5.t.b(r1, r0, r2, r9)
        L7d:
            com.adobe.marketing.mobile.identity.j r9 = new com.adobe.marketing.mobile.identity.j
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r9.<init>(r4, r0)
            return r9
        L87:
            com.adobe.marketing.mobile.identity.j r9 = new com.adobe.marketing.mobile.identity.j
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.<init>(r4, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.identity.IdentityExtension.v(java.util.Map):com.adobe.marketing.mobile.identity.j");
    }

    Map<String, String> x(Map<String, Object> map) {
        Map<String, String> mapT;
        return (map == null || !map.containsKey("visitoridentifiers") || (mapT = C14328a.t(String.class, map, "visitoridentifiers", null)) == null) ? new HashMap() : mapT;
    }

    boolean y(C6574h c6574h) {
        if (this.f63339n) {
            return true;
        }
        H hE = a().e("com.adobe.module.configuration", null, false, com.adobe.marketing.mobile.F.LAST_SET);
        if (hE == null || hE.a() != I.SET) {
            t.e("Identity", "IdentityExtension", "Waiting for Configuration shared state before processing event [name: %s, id: %s]", c6574h.q(), c6574h.x());
            return false;
        }
        if (!f0(hE.b())) {
            return false;
        }
        V(hE.b());
        this.f63327b.d(this.f63338m);
        boolean z10 = O(c6574h, true) || D.OPT_OUT.equals(this.f63338m);
        this.f63339n = z10;
        if (z10 && !this.f63340o) {
            a().b(Z(), c6574h);
            this.f63340o = true;
        }
        return this.f63339n;
    }

    List<N> z(Map<String, String> map, N.a aVar) {
        if (map == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                arrayList.add(new N("d_cid_ic", entry.getKey(), entry.getValue(), aVar));
            } catch (IllegalStateException e10) {
                t.a("Identity", "IdentityExtension", "generateCustomerIds : Unable to create Visitor IDs after encoding the provided list due to: (%s).", e10);
            }
        }
        return arrayList;
    }

    private boolean P(String str, C6574h c6574h) {
        H hE = a().e(str, c6574h, false, com.adobe.marketing.mobile.F.LAST_SET);
        if (hE == null || hE.a() != I.SET) {
            return false;
        }
        return !C14331d.a(hE.b());
    }

    private boolean k0(List<N> list, Map<String, String> map, boolean z10, a aVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!aVar.a()) {
            t.a("Identity", "IdentityExtension", "shouldSync : Ignoring ID Sync due to privacy status opt-out or missing experienceCloud.org.", new Object[0]);
            z11 = false;
        } else {
            z11 = true;
        }
        if (g6.j.h() - this.f63335j <= this.f63336k && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (list != null && !list.isEmpty()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (map != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (g6.i.a(this.f63330e) || z13 || z14 || z12) {
            if (g6.i.a(this.f63330e)) {
                t.e("Identity", "IdentityExtension", "shouldSync : ECID is null when sync identifiers event received. Generate new ECID value.", new Object[0]);
                this.f63330e = B();
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private static void l0(v vVar, String str, String str2) {
        if (g6.i.a(str2)) {
            vVar.remove(str);
        } else {
            vVar.d(str, str2);
        }
    }

    private void m() {
        W();
        u();
        Q();
        if (!g6.i.a(this.f63330e)) {
            a().b(Z(), null);
            this.f63340o = true;
        }
    }

    private void p(boolean z10) {
        j0(z10);
        HashMap map = new HashMap();
        map.put("a.push.optin", String.valueOf(z10));
        HashMap map2 = new HashMap();
        map2.put("action", "Push");
        map2.put("contextdata", map);
        map2.put("trackinternal", Boolean.TRUE);
        C6574h c6574hA = new C6574h.b("AnalyticsForIdentityRequest", "com.adobe.eventType.analytics", "com.adobe.eventSource.requestContent").d(map2).a();
        a().c(c6574hA);
        t.e("Identity", "IdentityExtension", "dispatchAnalyticsHit : Analytics event has been added to event hub : (%s)", c6574hA);
    }

    static List<N> t(String str) {
        N n10;
        if (g6.i.a(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("&")) {
            if (!g6.i.a(str2)) {
                N nA0 = a0(str2);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        n10 = (N) it.next();
                        if (g0(n10, nA0)) {
                            break;
                        }
                    } else {
                        n10 = null;
                        break;
                    }
                }
                if (n10 != null) {
                    arrayList.remove(n10);
                }
                if (nA0 != null) {
                    arrayList.add(nA0);
                }
            }
        }
        return arrayList;
    }

    String A(Map<String, String> map) {
        if (C14331d.a(map)) {
            return "";
        }
        HashMap map2 = new HashMap(map);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map2.entrySet()) {
            sb2.append("&d_cid=");
            sb2.append(g6.l.b((String) entry.getKey()));
            sb2.append("%01");
            sb2.append(g6.l.b((String) entry.getValue()));
        }
        if (sb2.charAt(0) == '&') {
            sb2.deleteCharAt(0);
        }
        return sb2.toString();
    }

    String B() {
        UUID uuidRandomUUID = UUID.randomUUID();
        long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
        long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
        Locale locale = Locale.US;
        if (mostSignificantBits < 0) {
            mostSignificantBits = -mostSignificantBits;
        }
        Long lValueOf = Long.valueOf(mostSignificantBits);
        if (leastSignificantBits < 0) {
            leastSignificantBits = -leastSignificantBits;
        }
        String str = String.format(locale, "%019d%019d", lValueOf, Long.valueOf(leastSignificantBits));
        t.e("Identity", "IdentityExtension", "generateMID : Generating new ECID %s", str);
        return str;
    }

    void F(C6574h c6574h, a aVar, Map<String, Object> map) {
        l(C14328a.o(c6574h.o(), "baseurl", null), c6574h, aVar, map, null);
    }

    void H(C6574h c6574h, a aVar, Map<String, Object> map) {
        StringBuilder sbD = D(aVar, map);
        HashMap map2 = new HashMap();
        map2.put("urlvariables", sbD.toString());
        K("IDENTITY_URL_VARIABLES", map2, c6574h);
    }

    boolean R(C6574h c6574h) {
        if (c6574h.o() != null && c6574h.o().containsKey("baseurl")) {
            return true;
        }
        return false;
    }

    boolean S(C6574h c6574h) {
        return C14328a.l(c6574h.o(), "urlvariables", false);
    }

    boolean U(C6574h c6574h) {
        if (!C14328a.l(c6574h.o(), "issyncevent", false) && !c6574h.w().equals("com.adobe.eventType.generic.identity")) {
            return false;
        }
        return true;
    }

    void Y(n nVar, C6574h c6574h) {
        boolean zM;
        this.f63335j = g6.j.h();
        if (this.f63338m != D.OPT_OUT) {
            zM = M(nVar);
            h0();
        } else {
            zM = false;
        }
        Map<String, Object> mapZ = Z();
        if (zM) {
            mapZ.put("updatesharedstate", Boolean.TRUE);
        }
        K("UPDATED_IDENTITY_RESPONSE", mapZ, null);
        if (c6574h != null) {
            K("UPDATED_IDENTITY_RESPONSE", mapZ, c6574h);
        }
    }

    void c0(C6574h c6574h) {
        if (c6574h.w().equals("com.adobe.eventType.identity") && c6574h.t().equals("com.adobe.eventSource.requestIdentity") && (c6574h.o() == null || c6574h.o().isEmpty())) {
            K("IDENTITY_RESPONSE_CONTENT_ONE_TIME", Z(), c6574h);
            return;
        }
        AbstractC6579m abstractC6579mA = a();
        com.adobe.marketing.mobile.F f10 = com.adobe.marketing.mobile.F.LAST_SET;
        H hE = abstractC6579mA.e("com.adobe.module.configuration", c6574h, false, f10);
        if (hE != null) {
            a aVar = new a(hE.b());
            t.e("Identity", "IdentityExtension", "processEvent : Processing the Identity event: %s", c6574h);
            if (!U(c6574h) && !"com.adobe.eventType.generic.identity".equals(c6574h.w())) {
                Map<String, Object> mapB = null;
                if (R(c6574h)) {
                    H hE2 = a().e("com.adobe.module.analytics", c6574h, false, f10);
                    if (hE2 != null) {
                        mapB = hE2.b();
                    }
                    F(c6574h, aVar, mapB);
                    return;
                }
                if (S(c6574h)) {
                    H hE3 = a().e("com.adobe.module.analytics", c6574h, false, f10);
                    if (hE3 != null) {
                        mapB = hE3.b();
                    }
                    H(c6574h, aVar, mapB);
                    return;
                }
                return;
            }
            if (O(c6574h, false)) {
                a().b(Z(), c6574h);
            }
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String f() {
        return com.adobe.marketing.mobile.r.c();
    }

    boolean f0(Map<String, Object> map) {
        o0(map);
        a aVar = this.f63328c;
        if (aVar != null && !g6.i.a(aVar.c())) {
            return true;
        }
        t.a("Identity", "IdentityExtension", "Cannot sync identifiers, waiting for configuration with valid 'experienceCloud.org' value.", new Object[0]);
        return false;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected void g() {
        a().h("com.adobe.eventType.identity", "com.adobe.eventSource.requestIdentity", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.identity.c
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63345a.c0(c6574h);
            }
        });
        a().h("com.adobe.eventType.generic.identity", "com.adobe.eventSource.requestContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.identity.c
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63345a.c0(c6574h);
            }
        });
        a().h("com.adobe.eventType.generic.identity", "com.adobe.eventSource.requestReset", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.identity.d
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63346a.J(c6574h);
            }
        });
        a().h("com.adobe.eventType.identity", "com.adobe.eventSource.responseIdentity", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.identity.e
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63347a.L(c6574h);
            }
        });
        a().h("com.adobe.eventType.analytics", "com.adobe.eventSource.responseIdentity", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.identity.f
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63348a.E(c6574h);
            }
        });
        a().h("com.adobe.eventType.audienceManager", "com.adobe.eventSource.responseContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.identity.g
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63349a.b0(c6574h);
            }
        });
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.identity.h
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63350a.G(c6574h);
            }
        });
        m();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    public boolean i(C6574h c6574h) {
        H hE;
        if (!y(c6574h)) {
            return false;
        }
        if (c6574h.w().equals("com.adobe.eventType.identity") && c6574h.t().equals("com.adobe.eventSource.requestIdentity") && (c6574h.o() == null || c6574h.o().isEmpty())) {
            return true;
        }
        if (!U(c6574h) && !"com.adobe.eventType.generic.identity".equals(c6574h.w())) {
            if ((R(c6574h) || S(c6574h)) && (hE = a().e("com.adobe.module.analytics", c6574h, false, com.adobe.marketing.mobile.F.LAST_SET)) != null && hE.a() != I.SET) {
                t.e("Identity", "IdentityExtension", "Waiting for the Analytics shared state to be set before processing [event: %s].", c6574h.q());
                return false;
            }
            if (P("com.adobe.module.configuration", c6574h)) {
                return true;
            }
            t.e("Identity", "IdentityExtension", "Waiting for the Configuration shared state to get required configuration fields before processing [event: %s].", c6574h.q());
            return false;
        }
        H hE2 = a().e("com.adobe.module.configuration", c6574h, false, com.adobe.marketing.mobile.F.LAST_SET);
        if (hE2 != null && hE2.a() == I.SET) {
            return f0(hE2.b());
        }
        t.e("Identity", "IdentityExtension", "Waiting for the Configuration shared state to be set before processing [event: %s].", c6574h.q());
        return false;
    }

    void i0(a aVar) {
        String strN = n(aVar);
        if (g6.i.a(strN)) {
            t.a("Identity", "IdentityExtension", "sendOptOutHit : Unable to send network hit because the opt-out URL was null.", new Object[0]);
            return;
        }
        A aH = K.f().h();
        if (aH == null) {
            t.a("Identity", "IdentityExtension", "sendOptOutHit : Unable to send network request to the opt-out URL (%s) because NetworkService is unavailable.", strN);
        } else {
            t.a("Identity", "IdentityExtension", "sendOptOutHit : Sending network request to the opt-out URL: (%s).", strN);
            aH.a(new x(strN, R5.r.GET, null, null, 2, 2), new w() { // from class: com.adobe.marketing.mobile.identity.i
                @Override // R5.w
                public final void a(R5.o oVar) {
                    IdentityExtension.j(oVar);
                }
            });
        }
    }

    String k(String str, String str2, String str3) {
        if (!g6.i.a(str2) && !g6.i.a(str3)) {
            String str4 = String.format("%s=%s", str2, str3);
            if (g6.i.a(str)) {
                return str4;
            }
            return String.format("%s|%s", str, str4);
        }
        return str;
    }

    void l(String str, C6574h c6574h, a aVar, Map<String, Object> map, StringBuilder sb2) {
        int length;
        boolean z10;
        if (g6.i.a(str)) {
            HashMap map2 = new HashMap();
            map2.put("updatedurl", str);
            K("IDENTITY_APPENDED_URL", map2, c6574h);
            return;
        }
        StringBuilder sb3 = new StringBuilder(str);
        if (sb2 == null) {
            sb2 = D(aVar, map);
        }
        if (!g6.i.a(sb2.toString())) {
            int iIndexOf = sb3.indexOf("?");
            int iIndexOf2 = sb3.indexOf("#");
            if (iIndexOf2 > 0) {
                length = iIndexOf2;
            } else {
                length = sb3.length();
            }
            if (iIndexOf2 > 0 && iIndexOf2 < iIndexOf) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (iIndexOf > 0 && iIndexOf != sb3.length() - 1 && !z10) {
                sb2.insert(0, "&");
            } else if (iIndexOf < 0 || z10) {
                sb2.insert(0, "?");
            }
            sb3.insert(length, sb2.toString());
        }
        HashMap map3 = new HashMap();
        map3.put("updatedurl", sb3.toString());
        K("IDENTITY_APPENDED_URL", map3, c6574h);
    }

    IdentityExtension(AbstractC6579m abstractC6579m, v vVar, R5.n nVar) {
        super(abstractC6579m);
        this.f63338m = b.f63344a;
        this.f63339n = false;
        this.f63340o = false;
        this.f63329d = vVar;
        this.f63327b = nVar;
    }
}

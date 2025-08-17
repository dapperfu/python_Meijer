package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.u1;
import com.medallia.digital.mobilesdk.v8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class t8 implements Observer, m8 {

    /* renamed from: c, reason: collision with root package name */
    private static t8 f93061c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f93062a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f93063b;

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f93064a;

        a(Object obj) {
            this.f93064a = obj;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (t8.this.f93062a) {
                return;
            }
            Object obj = this.f93064a;
            if (!(obj instanceof c0)) {
                if ((obj instanceof k) && s4.f().n()) {
                    k kVar = (k) this.f93064a;
                    if (kVar.c() == Lifetime.Forever) {
                        f1.a().c(kVar);
                        return;
                    } else {
                        if (kVar.c() == Lifetime.Application || kVar.c() == Lifetime.Session) {
                            f1.a().b(kVar);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            c0 c0Var = (c0) obj;
            if (!n0.CustomParameters.getName().equals(c0Var.getName())) {
                if (c0Var.f() == Lifetime.Forever) {
                    f1.a().c(c0Var);
                    return;
                } else {
                    if (c0Var.f() == Lifetime.Application || c0Var.f() == Lifetime.Session) {
                        f1.a().b(c0Var);
                        return;
                    }
                    return;
                }
            }
            CustomParameter customParameterB = t8.this.b(t8.this.a(c0Var));
            CollectorsInfrastructure.getInstance().customParametersCollector.a(t8.this.c(c0Var));
            if (customParameterB != null) {
                f1.a().c(new n8(c0Var, customParameterB.b(), String.valueOf(customParameterB.c())));
            } else {
                f1.a().b(c0Var);
            }
            k7.b().a(u1.b.customParameters);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93066a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f93067b;

        static {
            int[] iArr = new int[ValueType.values().length];
            f93067b = iArr;
            try {
                iArr[ValueType.TypeString.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93067b[ValueType.TypeInteger.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93067b[ValueType.TypeDouble.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93067b[ValueType.TypeLong.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93067b[ValueType.TypeBoolean.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.values().length];
            f93066a = iArr2;
            try {
                iArr2[c.OsName.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93066a[c.DeviceId.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f93066a[c.SessionId.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f93066a[c.PropertyId.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private enum c {
        PropertyId,
        OsName,
        SessionId,
        DeviceId;

        static c a(String str) {
            if (str == null) {
                return null;
            }
            c cVar = PropertyId;
            if (str.equals(cVar.toString())) {
                return cVar;
            }
            c cVar2 = OsName;
            if (str.equals(cVar2.toString())) {
                return cVar2;
            }
            c cVar3 = SessionId;
            if (str.equals(cVar3.toString())) {
                return cVar3;
            }
            c cVar4 = DeviceId;
            if (str.equals(cVar4.toString())) {
                return cVar4;
            }
            return null;
        }
    }

    public t8() {
        a4.e("UserJourney was initiated");
        this.f93062a = d7.b().a(d7.a.SDK_STOPPED, false);
        CollectorsInfrastructure.getInstance().addObserverToCollectors(this);
        AnalyticsBridge.getInstance().addObserverToAnalyticsItems(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CustomParameter b(String str) {
        if (CollectorsInfrastructure.getInstance() == null || !CollectorsInfrastructure.getInstance().getCustomParametersMap().containsKey(str)) {
            return null;
        }
        return CollectorsInfrastructure.getInstance().getCustomParametersMap().get(str);
    }

    protected static t8 g() {
        if (f93061c == null) {
            f93061c = new t8();
        }
        return f93061c;
    }

    protected CustomParameter c(c0 c0Var) {
        CustomParameter customParameter = new CustomParameter();
        try {
            String strA = a(c0Var);
            String strReplaceAll = c0Var.i().toString().replaceAll("Name:\\s(.*)\\sValue:\\s", "");
            int i10 = b.f93067b[c0Var.j().ordinal()];
            Comparable comparableValueOf = strReplaceAll;
            if (i10 != 1) {
                comparableValueOf = i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : Boolean.valueOf(strReplaceAll) : Long.valueOf(strReplaceAll) : Double.valueOf(strReplaceAll) : Integer.valueOf(strReplaceAll);
            }
            boolean zA = customParameter.a(strA);
            boolean zA2 = customParameter.a(comparableValueOf);
            if (!zA) {
                a4.c("Set CustomParameter name to " + strA + " failed");
            }
            if (!zA2) {
                a4.c("Set CustomParameter value to " + comparableValueOf + " failed");
            }
            return customParameter;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return customParameter;
        }
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a(getClass().getSimpleName());
        f93061c = null;
    }

    protected HashMap<String, Object> d() {
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.UserJourneyData, v8.d.ALL);
        HashMap<String, Object> map = new HashMap<>();
        Iterator<? extends b0> it = arrayListC.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var.e() == GroupType.collector && c0Var.getName() != null) {
                map.put(c0Var.getName().toLowerCase(), c0Var.i());
            }
        }
        a4.b("Base events was exported");
        return map;
    }

    protected ArrayList<c0> e() {
        return f1.a().c(b0.a.UserJourneyData, v8.d.CUSTOM_PARAMS_DESC);
    }

    protected ArrayList<c0> f() {
        return f1.a().c(b0.a.UserJourneyData, v8.d.DISTINCT_LATEST_NO_CP);
    }

    protected long h() {
        return f1.a().c(b0.a.UserJourneyData);
    }

    protected JSONArray i() {
        String name;
        JSONArray jSONArray = new JSONArray();
        a4.b("getUserJourneyArray was called");
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.UserJourneyData, v8.d.ALL);
        if (this.f93063b) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            Iterator<? extends b0> it = arrayListC.iterator();
            while (it.hasNext()) {
                c0 c0Var = (c0) it.next();
                if (c0Var.e() != GroupType.collector) {
                    map2.put(c0Var.getName(), c0Var.d());
                } else {
                    if (c0Var.getName().equals("CustomParameters")) {
                        name = c0Var.getName() + UUID.randomUUID().toString();
                    } else {
                        name = c0Var.getName();
                    }
                    map.put(name, c0Var.d());
                }
            }
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                jSONArray.put(((Map.Entry) it2.next()).getValue());
            }
            Iterator it3 = map2.entrySet().iterator();
            while (it3.hasNext()) {
                jSONArray.put(((Map.Entry) it3.next()).getValue());
            }
        } else {
            Iterator<? extends b0> it4 = arrayListC.iterator();
            while (it4.hasNext()) {
                jSONArray.put(((c0) it4.next()).d());
            }
        }
        return jSONArray;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        w7.b().a().execute(new a(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(c0 c0Var) {
        return (c0Var.i() == null || !Pattern.compile("Name:\\s(.*)\\sValue:\\s(.*)").matcher(c0Var.i().toString()).matches()) ? "" : c0Var.i().toString().replaceAll("Name:\\s", "").replaceAll("\\sValue:\\s(.*)", "");
    }

    protected String b() {
        try {
            return i().toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected String[] c() {
        String strA = d7.b().a(d7.a.SESSION_ID, (String) null);
        a4.b("getAllRecordsForSession was called");
        ArrayList<c0> arrayListA = a(strA);
        String[] strArr = {"", ""};
        if (arrayListA == null || arrayListA.isEmpty()) {
            a4.f("User Journey failed to export : no data");
            return strArr;
        }
        Iterator<c0> it = arrayListA.iterator();
        while (it.hasNext()) {
            c0 next = it.next();
            if (next.e() == GroupType.collector) {
                strArr[0] = strArr[0] + next.b();
            } else {
                strArr[1] = strArr[1] + next.b();
            }
        }
        a4.e("User Journey was exported");
        return strArr;
    }

    protected JSONObject b(ArrayList<k> arrayList) throws JSONException {
        a4.b("exportAnalyticsToJsonObject was called");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("events", a(arrayList));
            a4.b("Analytics Records was exported");
            return jSONObject;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return jSONObject;
        }
    }

    protected ArrayList<k> a(long j10, Long l10, int i10) {
        a4.e("getAllAnalyticsRecordsForSession was called");
        return f1.a().c(b0.a.AnalyticsData, Long.valueOf(j10), l10, Integer.valueOf(i10));
    }

    protected void b(c0 c0Var) {
        f1.a().c(c0Var);
    }

    protected ArrayList<c0> a(String str) {
        a4.e("getAllRecordsForSession was called");
        return f1.a().c(b0.a.UserJourneyData, v8.d.SESSION, str);
    }

    protected void b(boolean z10) {
        this.f93062a = z10;
    }

    protected JSONArray a(ArrayList<k> arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null) {
                Iterator<k> it = arrayList.iterator();
                while (it.hasNext()) {
                    k next = it.next();
                    if (next.d() != null) {
                        jSONArray.put(next.d());
                    }
                }
            }
            return jSONArray;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return new JSONArray();
        }
    }

    protected void b(boolean z10, Long l10, long j10) {
        if (z10) {
            if (a(l10, j10)) {
                a4.b(String.format(Locale.US, "Analytics: events from %d to %d was cleared", l10, Long.valueOf(j10)));
                return;
            } else {
                a4.f(String.format(Locale.US, "Analytics: failed to clear events from %d to %d was cleared", l10, Long.valueOf(j10)));
                return;
            }
        }
        if (a(Lifetime.Session)) {
            a4.b("User Journey: lifetime type session was cleared");
        } else {
            a4.f("User Journey: failed to clear lifetime type session");
        }
    }

    private JSONArray a(ArrayList<c> arrayList, JSONArray jSONArray, String str) {
        JSONObject jSONObjectD;
        String strA;
        if (str != null) {
            if (arrayList == null || arrayList.isEmpty()) {
                long jA = d7.b().a(d7.a.PROPERTY_ID, 0L);
                if (jA != 0) {
                    jSONArray.put(new c0(Long.valueOf(jA), GroupType.collector, Lifetime.Application, ValueType.TypeLong, "PropertyId", System.currentTimeMillis(), str).d());
                }
                String strA2 = d7.b().a(d7.a.DEVICE_ID, (String) null);
                if (strA2 != null) {
                    jSONArray.put(new c0(strA2, GroupType.collector, Lifetime.Session, ValueType.TypeString, "DeviceId", System.currentTimeMillis(), str).d());
                }
                GroupType groupType = GroupType.collector;
                Lifetime lifetime = Lifetime.Session;
                ValueType valueType = ValueType.TypeString;
                jSONArray.put(new c0("Android", groupType, lifetime, valueType, "OsName", System.currentTimeMillis(), str).d());
                jSONObjectD = new c0(str, groupType, Lifetime.Application, valueType, "SessionId", System.currentTimeMillis(), str).d();
            } else {
                Iterator<c> it = arrayList.iterator();
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (it.hasNext()) {
                    int i10 = b.f93066a[it.next().ordinal()];
                    if (i10 == 1) {
                        z13 = true;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            z12 = true;
                        } else if (i10 != 4) {
                        }
                        z10 = true;
                    } else {
                        z11 = true;
                    }
                }
                if (!z10) {
                    long jA2 = d7.b().a(d7.a.PROPERTY_ID, 0L);
                    if (jA2 != 0) {
                        jSONArray.put(new c0(Long.valueOf(jA2), GroupType.collector, Lifetime.Application, ValueType.TypeLong, "PropertyId").d());
                    }
                }
                if (!z11 && (strA = d7.b().a(d7.a.DEVICE_ID, (String) null)) != null) {
                    jSONArray.put(new c0(strA, GroupType.collector, Lifetime.Session, ValueType.TypeString, "DeviceId").d());
                }
                if (!z13) {
                    jSONArray.put(new c0("Android", GroupType.collector, Lifetime.Session, ValueType.TypeString, "OsName").d());
                }
                if (!z12) {
                    jSONObjectD = new c0(str, GroupType.collector, Lifetime.Application, ValueType.TypeString, "SessionId").d();
                }
            }
            jSONArray.put(jSONObjectD);
        }
        return jSONArray;
    }

    protected JSONArray a(boolean z10) {
        try {
            String strA = d7.b().a(d7.a.SESSION_ID, (String) null);
            ArrayList<c0> arrayListA = a(strA);
            HashMap map = new HashMap();
            ArrayList<c> arrayList = new ArrayList<>();
            JSONArray jSONArray = new JSONArray();
            Iterator<c0> it = arrayListA.iterator();
            while (it.hasNext()) {
                c0 next = it.next();
                if (next.d() != null) {
                    if (!z10 || next.e() == null || next.e() != GroupType.collector || (next.getName() != null && next.getName().equals(n0.CustomParameters.getName()))) {
                        jSONArray.put(next.d());
                    } else {
                        map.put(next.getName(), next);
                    }
                }
                c cVarA = c.a(next.getName());
                if (cVarA != null) {
                    arrayList.add(cVarA);
                }
            }
            if (z10) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    c0 c0Var = (c0) ((Map.Entry) it2.next()).getValue();
                    if (c0Var != null) {
                        jSONArray.put(c0Var.d());
                    }
                }
            }
            return a(arrayList, jSONArray, strA);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return new JSONArray();
        }
    }

    protected void a(ConfigurationContract configurationContract) {
        if (configurationContract == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null) {
            return;
        }
        this.f93063b = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isDistinct();
    }

    protected void a(boolean z10, Long l10, long j10) {
        if (z10) {
            if (a(l10, j10)) {
                a4.b(String.format(Locale.US, "Analytics: events from %d to %d was cleared", l10, Long.valueOf(j10)));
                return;
            } else {
                a4.f(String.format(Locale.US, "Analytics: failed to clear events from %d to %d was cleared", l10, Long.valueOf(j10)));
                return;
            }
        }
        if (a(Lifetime.Application)) {
            a4.b("User Journey: lifetime type application was cleared");
        } else {
            a4.f("User Journey: failed to clear lifetime type application");
        }
    }

    protected boolean a() {
        return f1.a().a(b0.a.UserJourneyData, Lifetime.Session, GroupType.collector);
    }

    protected boolean a(Lifetime lifetime) {
        return f1.a().a(b0.a.UserJourneyData, lifetime);
    }

    protected boolean a(Long l10, long j10) {
        return f1.a().a(b0.a.AnalyticsData, Long.valueOf(j10), l10);
    }
}

package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.d7;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class l {

    /* renamed from: g, reason: collision with root package name */
    private static final String f93291g = "events";

    /* renamed from: h, reason: collision with root package name */
    private static final String f93292h = "md_android_";

    /* renamed from: i, reason: collision with root package name */
    private static final String f93293i = "md_android_name";

    /* renamed from: j, reason: collision with root package name */
    private static final String f93294j = "eventName";

    /* renamed from: k, reason: collision with root package name */
    private static final String f93295k = "value";

    /* renamed from: a, reason: collision with root package name */
    private n6<m> f93296a;

    /* renamed from: b, reason: collision with root package name */
    private final n6<m> f93297b;

    /* renamed from: c, reason: collision with root package name */
    private final long f93298c;

    /* renamed from: d, reason: collision with root package name */
    private int f93299d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f93300e = 3;

    /* renamed from: f, reason: collision with root package name */
    private int f93301f = 512;

    class a implements n6<m> {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            l.this.f93297b.a(h4Var);
            a4.c("Failed to submit analytics");
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(m mVar) throws JSONException {
            l.c(l.this);
            mVar.b(l.this.f93299d);
            a4.b("Submitting analytics records - part #" + l.this.f93299d + ". max submissions:" + l.this.f93300e);
            if (l.this.f93299d >= l.this.f93300e || mVar.b() != l.this.f93301f) {
                mVar.a(true);
                l.this.f93297b.a((n6) mVar);
                a4.b("Analytics submission is done successfully");
            } else {
                l.this.f93297b.a((n6) mVar);
                l lVar = l.this;
                lVar.a(lVar.f93298c, Long.valueOf(mVar.a()), (n6<m>) l.this.f93296a);
            }
        }
    }

    l(long j10, n6<m> n6Var) {
        this.f93297b = n6Var;
        this.f93298c = j10;
        a();
    }

    static /* synthetic */ int c(l lVar) {
        int i10 = lVar.f93299d;
        lVar.f93299d = i10 + 1;
        return i10;
    }

    class b implements n6<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f93303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f93304b;

        b(n6 n6Var, m mVar) {
            this.f93303a = n6Var;
            this.f93304b = mVar;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f93303a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r22) {
            a4.e("Digital Analytics was submitted successfully");
            this.f93303a.a((n6) this.f93304b);
        }
    }

    private String a(Object obj) {
        try {
            return ((JSONObject) obj).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private void b() {
        this.f93296a = new a();
    }

    void c() {
        a(this.f93298c, (Long) null, this.f93296a);
    }

    protected JSONObject a(JSONObject jSONObject) throws JSONException {
        String strSubstring;
        Object objA;
        a4.b("Converting analytics payload to digital analytics format");
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(f93291g);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                JSONObject jSONObject4 = new JSONObject();
                Iterator<String> itKeys = jSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.equals(f93293i)) {
                        strSubstring = f93294j;
                    } else if (next.startsWith(f93292h)) {
                        strSubstring = next.substring(11);
                        if (strSubstring.equals(f93295k)) {
                            objA = a(jSONObject3.get(next));
                            jSONObject4.put(strSubstring, objA);
                        }
                    } else {
                        jSONObject4.put(next, jSONObject3.get(next));
                    }
                    objA = jSONObject3.get(next);
                    jSONObject4.put(strSubstring, objA);
                }
                jSONArray2.put(jSONObject4);
            }
            jSONObject2.put(f93291g, jSONArray2);
            a4.e("Analytics payload converted to digital analytics format");
            return jSONObject2;
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    protected void b(long j10, Long l10, n6<m> n6Var) throws JSONException {
        a4.b("Starting analytics submission");
        if (!s4.f().n()) {
            a4.e("Analytics disabled. Skipping submission");
        } else {
            a4.e("Submitting Analytics");
            a(n6Var, j10, l10, this.f93301f);
        }
    }

    private void a() {
        r1 r1VarE = s4.f().e();
        if (r1VarE != null) {
            if (r1VarE.b() != null) {
                this.f93300e = r1VarE.b().intValue();
            }
            if (r1VarE.a() != null) {
                this.f93301f = r1VarE.a().intValue();
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, Long l10, n6<m> n6Var) throws JSONException {
        b(j10, l10, n6Var);
    }

    protected void a(n6<m> n6Var, long j10, Long l10, int i10) throws JSONException {
        a4.b("Exporting analytics records from DB");
        ArrayList<k> arrayListA = t8.g().a(j10, l10, i10);
        if (arrayListA != null && !arrayListA.isEmpty()) {
            a4.b("Exported successfully " + arrayListA.size() + " analytics records from DB");
        }
        JSONObject jSONObjectB = t8.g().b(arrayListA);
        String strA = d7.b().a(d7.a.MISSING_EVENTS_V2, (String) null);
        if (strA != null) {
            try {
                JSONArray jSONArray = jSONObjectB.getJSONArray(f93291g);
                JSONArray jSONArray2 = new JSONArray(strA);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    jSONArray2.put(jSONArray.get(i11));
                }
                jSONObjectB.put(f93291g, jSONArray2);
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        if (jSONObjectB != null) {
            try {
                if (!jSONObjectB.has(f93291g) || !(jSONObjectB.get(f93291g) instanceof JSONArray) || jSONObjectB.getJSONArray(f93291g).length() != 0) {
                    m mVar = new m();
                    if (arrayListA != null) {
                        mVar.a(arrayListA.get(arrayListA.size() - 1).f());
                        mVar.b(arrayListA.get(0).f());
                        mVar.a(arrayListA.size());
                    }
                    a(jSONObjectB, mVar, n6Var);
                    return;
                }
            } catch (JSONException e11) {
                a4.c(e11.getMessage());
                return;
            }
        }
        a4.e("Can't submit analytics - Json is null or empty");
    }

    protected void a(JSONObject jSONObject, m mVar, n6<m> n6Var) throws JSONException {
        JSONObject jSONObjectA = a(jSONObject);
        if (jSONObjectA != null) {
            s4.f().a(new b(n6Var, mVar), jSONObjectA);
        }
    }
}

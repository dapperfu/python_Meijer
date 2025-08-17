package com.adobe.marketing.mobile.identity;

import Q5.C5072d;
import Q5.InterfaceC5080l;
import Q5.K;
import Q5.r;
import Q5.t;
import Q5.w;
import Q5.x;
import f6.C13851g;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class m implements InterfaceC5080l {

    /* renamed from: a, reason: collision with root package name */
    private final IdentityExtension f62519a;

    /* renamed from: b, reason: collision with root package name */
    private final int f62520b = 30;

    @Override // Q5.InterfaceC5080l
    public void b(C5072d c5072d, Q5.m mVar) {
        e(c5072d, 2, mVar);
    }

    n d(JSONObject jSONObject) {
        if (jSONObject == null) {
            t.a("Identity", "IdentityHitsProcessing", "createIdentityObjectFromResponseJsonObject: Unable to parse identity network response because the JSON object created was null.", new Object[0]);
            return null;
        }
        n nVar = new n();
        nVar.f62521a = jSONObject.optString("d_blob", null);
        nVar.f62524d = jSONObject.optString("error_msg", null);
        nVar.f62522b = jSONObject.optString("d_mid", null);
        int iOptInt = jSONObject.optInt("dcs_region", -1);
        nVar.f62523c = iOptInt != -1 ? Integer.toString(iOptInt) : null;
        nVar.f62525e = jSONObject.optLong("id_sync_ttl", 600L);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("d_optout");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                } catch (JSONException e10) {
                    t.a("Identity", "IdentityHitsProcessing", "createIdentityObjectFromResponseJsonObject : Unable to read opt-out JSON array due to an exception: (%s).", e10);
                }
            }
            nVar.f62526f = arrayList;
        }
        return nVar;
    }

    @Override // Q5.InterfaceC5080l
    public int a(C5072d c5072d) {
        return 30;
    }

    m(IdentityExtension identityExtension) {
        this.f62519a = identityExtension;
    }

    public static /* synthetic */ void c(m mVar, Q5.m mVar2, k kVar, Q5.o oVar) {
        mVar.getClass();
        if (oVar == null) {
            t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : network connection is null. Will retry later.", new Object[0]);
            mVar2.a(false);
            return;
        }
        if (oVar.d() == 200) {
            try {
                n nVarD = mVar.d(new JSONObject(C13851g.a(oVar.c())));
                t.e("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : ECID Service response data was parsed successfully.", new Object[0]);
                mVar.f62519a.Y(nVarD, kVar.b());
                mVar2.a(true);
            } catch (JSONException e10) {
                t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : An unknown exception occurred while trying to process the response from the ECID Service: (%s).", e10);
                mVar2.a(false);
            }
        } else if (!o.f62527a.contains(Integer.valueOf(oVar.d()))) {
            t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : Discarding ECID Service request because of an un-recoverable network error with response code %d occurred while processing it.", Integer.valueOf(oVar.d()));
            mVar.f62519a.Y(null, kVar.b());
            mVar2.a(true);
        } else {
            t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : A recoverable network error occurred with response code %d while processing ECID Service requests.  Will retry in 30 seconds.", Integer.valueOf(oVar.d()));
            mVar2.a(false);
        }
        oVar.close();
    }

    public void e(C5072d c5072d, int i10, final Q5.m mVar) {
        final k kVarA = k.a(c5072d);
        if (kVarA == null) {
            mVar.a(true);
            return;
        }
        if (kVarA.c() != null && kVarA.b() != null) {
            t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : Sending request: (%s).", kVarA.c());
            K.f().h().a(new x(kVarA.c(), r.GET, null, o.a(true), i10, i10), new w() { // from class: com.adobe.marketing.mobile.identity.l
                @Override // Q5.w
                public final void a(Q5.o oVar) {
                    m.c(this.f62516a, mVar, kVarA, oVar);
                }
            });
            return;
        }
        t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : Unable to process IdentityExtension hit because it does not contain a url or the trigger event.", new Object[0]);
        mVar.a(true);
    }
}

package com.adobe.marketing.mobile.identity;

import R5.C5117d;
import R5.InterfaceC5125l;
import R5.K;
import R5.r;
import R5.t;
import R5.w;
import R5.x;
import g6.C14334g;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class m implements InterfaceC5125l {

    /* renamed from: a, reason: collision with root package name */
    private final IdentityExtension f63358a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63359b = 30;

    @Override // R5.InterfaceC5125l
    public void a(C5117d c5117d, R5.m mVar) {
        e(c5117d, 2, mVar);
    }

    n d(JSONObject jSONObject) {
        if (jSONObject == null) {
            t.a("Identity", "IdentityHitsProcessing", "createIdentityObjectFromResponseJsonObject: Unable to parse identity network response because the JSON object created was null.", new Object[0]);
            return null;
        }
        n nVar = new n();
        nVar.f63360a = jSONObject.optString("d_blob", null);
        nVar.f63363d = jSONObject.optString("error_msg", null);
        nVar.f63361b = jSONObject.optString("d_mid", null);
        int iOptInt = jSONObject.optInt("dcs_region", -1);
        nVar.f63362c = iOptInt != -1 ? Integer.toString(iOptInt) : null;
        nVar.f63364e = jSONObject.optLong("id_sync_ttl", 600L);
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
            nVar.f63365f = arrayList;
        }
        return nVar;
    }

    @Override // R5.InterfaceC5125l
    public int b(C5117d c5117d) {
        return 30;
    }

    m(IdentityExtension identityExtension) {
        this.f63358a = identityExtension;
    }

    public static /* synthetic */ void c(m mVar, R5.m mVar2, k kVar, R5.o oVar) {
        mVar.getClass();
        if (oVar == null) {
            t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : network connection is null. Will retry later.", new Object[0]);
            mVar2.a(false);
            return;
        }
        if (oVar.d() == 200) {
            try {
                n nVarD = mVar.d(new JSONObject(C14334g.a(oVar.c())));
                t.e("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : ECID Service response data was parsed successfully.", new Object[0]);
                mVar.f63358a.Y(nVarD, kVar.b());
                mVar2.a(true);
            } catch (JSONException e10) {
                t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : An unknown exception occurred while trying to process the response from the ECID Service: (%s).", e10);
                mVar2.a(false);
            }
        } else if (!o.f63366a.contains(Integer.valueOf(oVar.d()))) {
            t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : Discarding ECID Service request because of an un-recoverable network error with response code %d occurred while processing it.", Integer.valueOf(oVar.d()));
            mVar.f63358a.Y(null, kVar.b());
            mVar2.a(true);
        } else {
            t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : A recoverable network error occurred with response code %d while processing ECID Service requests.  Will retry in 30 seconds.", Integer.valueOf(oVar.d()));
            mVar2.a(false);
        }
        oVar.close();
    }

    public void e(C5117d c5117d, int i10, final R5.m mVar) {
        final k kVarA = k.a(c5117d);
        if (kVarA == null) {
            mVar.a(true);
            return;
        }
        if (kVarA.c() != null && kVarA.b() != null) {
            t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : Sending request: (%s).", kVarA.c());
            K.f().h().a(new x(kVarA.c(), r.GET, null, o.a(true), i10, i10), new w() { // from class: com.adobe.marketing.mobile.identity.l
                @Override // R5.w
                public final void a(R5.o oVar) {
                    m.c(this.f63355a, mVar, kVarA, oVar);
                }
            });
            return;
        }
        t.a("Identity", "IdentityHitsProcessing", "IdentityHitsDatabase.process : Unable to process IdentityExtension hit because it does not contain a url or the trigger event.", new Object[0]);
        mVar.a(true);
    }
}

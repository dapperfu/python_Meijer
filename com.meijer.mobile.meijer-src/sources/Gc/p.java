package Gc;

import Oc.C4447y;
import Oc.U0;
import Oc.h2;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final U0 f11362a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11363b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private f f11364c;

    public static p d(U0 u02) {
        if (u02 != null) {
            return new p(u02);
        }
        return null;
    }

    public static p e(U0 u02) {
        return new p(u02);
    }

    public String a() {
        try {
            U0 u02 = this.f11362a;
            if (u02 != null) {
                return u02.zzg();
            }
            return null;
        } catch (RemoteException e10) {
            Sc.p.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e10);
            return null;
        }
    }

    public Bundle b() {
        try {
            U0 u02 = this.f11362a;
            if (u02 != null) {
                return u02.zze();
            }
        } catch (RemoteException e10) {
            Sc.p.e("Could not forward getResponseExtras to ResponseInfo.", e10);
        }
        return new Bundle();
    }

    public String c() {
        try {
            U0 u02 = this.f11362a;
            if (u02 != null) {
                return u02.zzi();
            }
            return null;
        } catch (RemoteException e10) {
            Sc.p.e("Could not forward getResponseId to ResponseInfo.", e10);
            return null;
        }
    }

    public final U0 f() {
        return this.f11362a;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strC = c();
        if (strC == null) {
            jSONObject.put("Response ID", BuildConfig.TRAVIS);
        } else {
            jSONObject.put("Response ID", strC);
        }
        String strA = a();
        if (strA == null) {
            jSONObject.put("Mediation Adapter Class Name", BuildConfig.TRAVIS);
        } else {
            jSONObject.put("Mediation Adapter Class Name", strA);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f11363b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((f) it.next()).f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        f fVar = this.f11364c;
        if (fVar != null) {
            jSONObject.put("Loaded Adapter Response", fVar.f());
        }
        Bundle bundleB = b();
        if (bundleB != null) {
            jSONObject.put("Response Extras", C4447y.b().k(bundleB));
        }
        return jSONObject;
    }

    private p(U0 u02) {
        this.f11362a = u02;
        if (u02 != null) {
            try {
                List listZzj = u02.zzj();
                if (listZzj != null) {
                    Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        f fVarE = f.e((h2) it.next());
                        if (fVarE != null) {
                            this.f11363b.add(fVarE);
                        }
                    }
                }
            } catch (RemoteException e10) {
                Sc.p.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
        U0 u03 = this.f11362a;
        if (u03 != null) {
            try {
                h2 h2VarZzf = u03.zzf();
                if (h2VarZzf != null) {
                    this.f11364c = f.e(h2VarZzf);
                }
            } catch (RemoteException e11) {
                Sc.p.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e11);
            }
        }
    }

    public String toString() {
        try {
            return g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}

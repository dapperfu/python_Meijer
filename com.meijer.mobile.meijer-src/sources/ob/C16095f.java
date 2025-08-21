package ob;

import Cb.a;
import android.os.Bundle;
import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mt.C15766a;
import mt.C15767b;
import nb.C15926a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ob.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16095f {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f153805a = C13785b.a(C16095f.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static final Nb.m<Xa.e> f153806b = new Nb.m<>(Xa.e.class);

    private static List<Fb.a> a(C15766a c15766a) {
        new ArrayList();
        throw null;
    }

    public static List<C15926a> b(C15767b[] c15767bArr, C15926a.EnumC2352a enumC2352a, Cb.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C15767b c15767b : c15767bArr) {
            C15926a c15926a = new C15926a();
            c15926a.B(enumC2352a);
            c15926a.y(c15767b.h());
            c15926a.s(c15767b.d());
            c15926a.t(c15767b.e().longValue());
            c15926a.v(c15767b.i());
            c15926a.p(c15767b.b());
            Boolean boolG = c15767b.g();
            c15926a.x(boolG == null ? false : boolG.booleanValue());
            c15926a.A(aVar.g().l());
            c15926a.z(aVar.d());
            c15926a.C(aVar.g().m());
            if (c15767b.f() != null) {
                c15926a.u(c15767b.f().longValue());
            }
            if (c15767b.c() != null) {
                c15926a.q(c15767b.c().longValue());
            }
            c15767b.a();
            c15926a.o(a(null));
            arrayList.add(c15926a);
        }
        return arrayList;
    }

    public static C15926a.EnumC2352a c(a.b bVar) {
        if (bVar == a.b.ARRIVE_EVENT) {
            return C15926a.EnumC2352a.PLACE_ENTRY;
        }
        if (bVar == a.b.DEPART_EVENT) {
            return C15926a.EnumC2352a.PLACE_EXIT;
        }
        return null;
    }

    private static void e(Bundle bundle, C15926a c15926a) {
        Object objOpt;
        String string = bundle.getString("COMM");
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ATTRS");
                if (jSONObjectOptJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next != null && (objOpt = jSONObjectOptJSONObject.opt(next)) != null && (objOpt instanceof String)) {
                            Fb.a aVar = new Fb.a();
                            aVar.c(next);
                            aVar.d((String) objOpt);
                            arrayList.add(aVar);
                        }
                    }
                    c15926a.o(arrayList);
                }
                c15926a.t(jSONObject.optLong("ED", c15926a.f()));
                c15926a.y(jSONObject.optString("TL", c15926a.i()));
                c15926a.s(jSONObject.optString("DESC", c15926a.e()));
                c15926a.p(jSONObject.optString("URL", c15926a.b()));
                c15926a.x("T".equals(jSONObject.optString("RW")));
            } catch (JSONException unused) {
            }
        }
    }

    public static C15926a d(Bundle bundle) {
        C15926a.EnumC2352a enumC2352a;
        C15926a c15926a;
        Objects.toString(bundle);
        try {
            String string = bundle.getString("NT");
            if (string == null) {
                c15926a = null;
            } else {
                if ("IC".equals(string)) {
                    enumC2352a = C15926a.EnumC2352a.INSTANT_PUSH;
                } else {
                    if ("TC".equals(string)) {
                        enumC2352a = C15926a.EnumC2352a.TIME_TRIGGERED;
                    }
                    c15926a = null;
                }
                c15926a = new C15926a();
                c15926a.B(enumC2352a);
            }
            if (c15926a != null) {
                c15926a.y(bundle.getString("TL"));
                c15926a.s(bundle.getString("DESC"));
                c15926a.v(bundle.getString("CID"));
                c15926a.w(bundle.getString("XD"));
                e(bundle, c15926a);
            }
            return c15926a;
        } catch (Exception unused) {
            return null;
        }
    }
}

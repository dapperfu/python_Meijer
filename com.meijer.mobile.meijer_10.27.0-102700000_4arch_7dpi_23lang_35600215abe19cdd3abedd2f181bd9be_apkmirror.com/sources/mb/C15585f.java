package mb;

import Ab.a;
import android.os.Bundle;
import cb.C6380a;
import cb.C6381b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import lb.C15392a;
import mt.C15707a;
import mt.C15708b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mb.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15585f {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f150018a = C6381b.a(C15585f.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static final Lb.m<Va.e> f150019b = new Lb.m<>(Va.e.class);

    private static List<Db.a> a(C15707a c15707a) {
        new ArrayList();
        throw null;
    }

    public static List<C15392a> b(C15708b[] c15708bArr, C15392a.EnumC2285a enumC2285a, Ab.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C15708b c15708b : c15708bArr) {
            C15392a c15392a = new C15392a();
            c15392a.B(enumC2285a);
            c15392a.y(c15708b.h());
            c15392a.s(c15708b.d());
            c15392a.t(c15708b.e().longValue());
            c15392a.v(c15708b.i());
            c15392a.p(c15708b.b());
            Boolean boolG = c15708b.g();
            c15392a.x(boolG == null ? false : boolG.booleanValue());
            c15392a.A(aVar.g().l());
            c15392a.z(aVar.d());
            c15392a.C(aVar.g().m());
            if (c15708b.f() != null) {
                c15392a.u(c15708b.f().longValue());
            }
            if (c15708b.c() != null) {
                c15392a.q(c15708b.c().longValue());
            }
            c15708b.a();
            c15392a.o(a(null));
            arrayList.add(c15392a);
        }
        return arrayList;
    }

    public static C15392a.EnumC2285a c(a.b bVar) {
        if (bVar == a.b.ARRIVE_EVENT) {
            return C15392a.EnumC2285a.PLACE_ENTRY;
        }
        if (bVar == a.b.DEPART_EVENT) {
            return C15392a.EnumC2285a.PLACE_EXIT;
        }
        return null;
    }

    private static void e(Bundle bundle, C15392a c15392a) {
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
                            Db.a aVar = new Db.a();
                            aVar.c(next);
                            aVar.d((String) objOpt);
                            arrayList.add(aVar);
                        }
                    }
                    c15392a.o(arrayList);
                }
                c15392a.t(jSONObject.optLong("ED", c15392a.f()));
                c15392a.y(jSONObject.optString("TL", c15392a.i()));
                c15392a.s(jSONObject.optString("DESC", c15392a.e()));
                c15392a.p(jSONObject.optString("URL", c15392a.b()));
                c15392a.x("T".equals(jSONObject.optString("RW")));
            } catch (JSONException unused) {
            }
        }
    }

    public static C15392a d(Bundle bundle) {
        C15392a.EnumC2285a enumC2285a;
        C15392a c15392a;
        Objects.toString(bundle);
        try {
            String string = bundle.getString("NT");
            if (string == null) {
                c15392a = null;
            } else {
                if ("IC".equals(string)) {
                    enumC2285a = C15392a.EnumC2285a.INSTANT_PUSH;
                } else {
                    if ("TC".equals(string)) {
                        enumC2285a = C15392a.EnumC2285a.TIME_TRIGGERED;
                    }
                    c15392a = null;
                }
                c15392a = new C15392a();
                c15392a.B(enumC2285a);
            }
            if (c15392a != null) {
                c15392a.y(bundle.getString("TL"));
                c15392a.s(bundle.getString("DESC"));
                c15392a.v(bundle.getString("CID"));
                c15392a.w(bundle.getString("XD"));
                e(bundle, c15392a);
            }
            return c15392a;
        } catch (Exception unused) {
            return null;
        }
    }
}

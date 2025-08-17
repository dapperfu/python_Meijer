package N5;

import N5.a;
import Q5.K;
import Q5.o;
import Q5.r;
import Q5.t;
import Q5.w;
import Q5.x;
import com.adobe.marketing.mobile.InterfaceC6418a;
import f6.C13851g;
import f6.i;
import f6.j;
import f6.l;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21464a;

    /* renamed from: b, reason: collision with root package name */
    private final d f21465b;

    public c(String str) {
        this(str, new d());
    }

    private a d(String str, InputStream inputStream, Map<String, String> map) throws NoSuchAlgorithmException, IOException, SecurityException {
        if (inputStream == null) {
            t.a("RulesLoader", this.f21464a, "Zip content stream is null", new Object[0]);
            return new a(null, a.EnumC0338a.NO_DATA);
        }
        if (!this.f21465b.b(str)) {
            t.a("RulesLoader", this.f21464a, "Cannot access application cache directory to create temp dir.", new Object[0]);
            return new a(null, a.EnumC0338a.CANNOT_CREATE_TEMP_DIR);
        }
        if (!this.f21465b.f(str, inputStream)) {
            t.a("RulesLoader", this.f21464a, "Cannot read response content into temp dir.", new Object[0]);
            return new a(null, a.EnumC0338a.CANNOT_STORE_IN_TEMP_DIR);
        }
        String strG = this.f21465b.g(str);
        if (strG == null) {
            t.a("RulesLoader", this.f21464a, "Failed to extract rules response zip into temp dir.", new Object[0]);
            return new a(null, a.EnumC0338a.ZIP_EXTRACTION_FAILED);
        }
        if (!K.f().b().a(this.f21464a, str, new R5.a(new ByteArrayInputStream(strG.getBytes(StandardCharsets.UTF_8)), R5.b.d(), map))) {
            t.a("RulesLoader", this.f21464a, "Could not cache rules from source %s", str);
        }
        this.f21465b.c(str);
        return new a(strG, a.EnumC0338a.SUCCESS);
    }

    c(String str, d dVar) {
        if (i.a(str)) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.f21464a = str;
        this.f21465b = dVar;
    }

    private Map<String, String> b(R5.c cVar) throws NumberFormatException {
        HashMap map = new HashMap();
        if (cVar == null) {
            return map;
        }
        Map<String, String> mapK = cVar.k();
        String str = mapK == null ? "" : mapK.get("ETag");
        map.put("If-None-Match", str != null ? str : "");
        String str2 = mapK == null ? null : mapK.get("Last-Modified");
        long j10 = 0;
        if (str2 != null) {
            try {
                j10 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
            }
        }
        map.put("If-Modified-Since", j.g(j10, DesugarTimeZone.getTimeZone("GMT"), Locale.US));
        return map;
    }

    private HashMap<String, String> c(o oVar) throws ParseException {
        HashMap<String, String> map = new HashMap<>();
        Date dateI = j.i(oVar.b("Last-Modified"), DesugarTimeZone.getTimeZone("GMT"), Locale.US);
        map.put("Last-Modified", dateI == null ? String.valueOf(new Date(0L).getTime()) : String.valueOf(dateI.getTime()));
        String strB = oVar.b("ETag");
        if (strB == null) {
            strB = "";
        }
        map.put("ETag", strB);
        return map;
    }

    private a e(String str, o oVar) {
        if (oVar == null) {
            t.e("RulesLoader", this.f21464a, "Received null response.", new Object[0]);
            return new a(null, a.EnumC0338a.NO_DATA);
        }
        int iD = oVar.d();
        if (iD == 200) {
            return d(str, oVar.c(), c(oVar));
        }
        if (iD == 304) {
            return new a(null, a.EnumC0338a.NOT_MODIFIED);
        }
        t.e("RulesLoader", this.f21464a, "Received download response: %s", Integer.valueOf(oVar.d()));
        return new a(null, a.EnumC0338a.NO_DATA);
    }

    public static /* synthetic */ void a(c cVar, String str, InterfaceC6418a interfaceC6418a, o oVar) {
        a aVarE = cVar.e(str, oVar);
        if (oVar != null) {
            oVar.close();
        }
        interfaceC6418a.a(aVarE);
    }

    public a f(String str) {
        if (i.a(str)) {
            new a(null, a.EnumC0338a.INVALID_SOURCE);
        }
        InputStream inputStreamS = K.f().e().s(str);
        if (inputStreamS == null) {
            t.e("RulesLoader", this.f21464a, "Provided asset: %s is invalid.", str);
            return new a(null, a.EnumC0338a.INVALID_SOURCE);
        }
        return d(str, inputStreamS, new HashMap());
    }

    public a g(String str) {
        if (i.a(str)) {
            return new a(null, a.EnumC0338a.INVALID_SOURCE);
        }
        R5.c cVarB = K.f().b().b(this.f21464a, str);
        if (cVarB == null) {
            return new a(null, a.EnumC0338a.NO_DATA);
        }
        return new a(C13851g.a(cVarB.getData()), a.EnumC0338a.SUCCESS);
    }

    public void h(final String str, final InterfaceC6418a<a> interfaceC6418a) {
        if (!l.a(str)) {
            t.e("RulesLoader", this.f21464a, "Provided download url: %s is null or empty. ", str);
            interfaceC6418a.a(new a(null, a.EnumC0338a.INVALID_SOURCE));
        } else {
            K.f().h().a(new x(str, r.GET, null, b(K.f().b().b(this.f21464a, str)), 10, 10), new w() { // from class: N5.b
                @Override // Q5.w
                public final void a(o oVar) {
                    c.a(this.f21461a, str, interfaceC6418a, oVar);
                }
            });
        }
    }
}

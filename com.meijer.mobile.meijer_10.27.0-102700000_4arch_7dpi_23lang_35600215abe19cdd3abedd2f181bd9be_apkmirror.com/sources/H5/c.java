package H5;

import Q5.K;
import Q5.o;
import Q5.r;
import Q5.t;
import Q5.w;
import Q5.x;
import f6.C13851g;
import f6.l;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJI\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\u0011\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LH5/c;", "", "<init>", "()V", "", "url", "LQ5/o;", "response", "", "d", "(Ljava/lang/String;LQ5/o;)Ljava/util/Map;", "Ljava/io/InputStream;", "metadata", "e", "(Ljava/lang/String;Ljava/io/InputStream;Ljava/util/Map;)Ljava/util/Map;", "Lkotlin/Function1;", "", "completionCallback", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "a", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c {
    private final Map<String, Object> d(String url, o response) throws ParseException {
        if (response == null) {
            t.e("Configuration", "ConfigurationDownloader", "Received a null response.", new Object[0]);
            return null;
        }
        int iD = response.d();
        if (iD != 200) {
            if (iD != 304) {
                t.a("Configuration", "ConfigurationDownloader", "Download result :" + response.d(), new Object[0]);
                return null;
            }
            t.a("Configuration", "ConfigurationDownloader", "Configuration from " + url + " has not been modified. Fetching from cache.", new Object[0]);
            R5.c cVarB = K.f().b().b("config", url);
            return e(url, cVarB != null ? cVarB.getData() : null, cVarB != null ? cVarB.k() : null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strB = response.b("Last-Modified");
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        Intrinsics.i(timeZone, "getTimeZone(\"GMT\")");
        Locale US = Locale.US;
        Intrinsics.i(US, "US");
        Date dateI = f6.j.i(strB, timeZone, US);
        if (dateI == null) {
            dateI = new Date(0L);
        }
        linkedHashMap.put("Last-Modified", String.valueOf(dateI.getTime()));
        String strB2 = response.b("ETag");
        if (strB2 == null) {
            strB2 = "";
        }
        linkedHashMap.put("ETag", strB2);
        return e(url, response.c(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c this$0, String url, Function1 completionCallback, o oVar) throws ParseException {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(url, "$url");
        Intrinsics.j(completionCallback, "$completionCallback");
        Map<String, Object> mapD = this$0.d(url, oVar);
        if (oVar != null) {
            oVar.close();
        }
        completionCallback.invoke(mapD);
    }

    public final void b(final String url, final Function1<? super Map<String, ? extends Object>, Unit> completionCallback) throws NumberFormatException {
        String str;
        Intrinsics.j(url, "url");
        Intrinsics.j(completionCallback, "completionCallback");
        if (!l.a(url)) {
            completionCallback.invoke(null);
            return;
        }
        R5.c cVarB = K.f().b().b("config", url);
        HashMap map = new HashMap();
        if (cVarB != null) {
            Map<String, String> mapK = cVarB.k();
            if (mapK == null || (str = mapK.get("ETag")) == null) {
                str = "";
            }
            map.put("If-None-Match", str);
            Map<String, String> mapK2 = cVarB.k();
            String str2 = mapK2 != null ? mapK2.get("Last-Modified") : null;
            long j10 = 0;
            if (str2 != null) {
                try {
                    j10 = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                }
            }
            TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
            Intrinsics.i(timeZone, "getTimeZone(\"GMT\")");
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            map.put("If-Modified-Since", f6.j.g(j10, timeZone, US));
        }
        K.f().h().a(new x(url, r.GET, null, map, 10, 10), new w() { // from class: H5.b
            @Override // Q5.w
            public final void a(o oVar) throws ParseException {
                c.c(this.f12270a, url, completionCallback, oVar);
            }
        });
    }

    private final Map<String, Object> e(String url, InputStream response, Map<String, String> metadata) throws IOException {
        String strA = C13851g.a(response);
        if (strA == null) {
            return null;
        }
        if (strA.length() == 0) {
            t.a("Configuration", "ConfigurationDownloader", "Downloaded configuration is empty.", new Object[0]);
            return MapsKt.k();
        }
        try {
            Map<String, Object> mapC = L5.h.c(new JSONObject(new JSONTokener(strA)));
            byte[] bytes = strA.getBytes(Charsets.UTF_8);
            Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
            K.f().b().a("config", url, new R5.a(new ByteArrayInputStream(bytes), R5.b.d(), metadata));
            return mapC;
        } catch (JSONException e10) {
            t.a("Configuration", "ConfigurationDownloader", "Exception processing downloaded configuration " + e10, new Object[0]);
            return null;
        }
    }
}

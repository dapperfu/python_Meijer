package Ib;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import kt.C15314c;
import sb.C16919b;
import sb.C16920c;
import vb.C17538d;

/* loaded from: classes4.dex */
public class d implements h {

    /* renamed from: e, reason: collision with root package name */
    private static final C6382c f13774e = C6383d.a(d.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f13775f = C6381b.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final b f13776a;

    /* renamed from: b, reason: collision with root package name */
    private final C16920c f13777b;

    /* renamed from: c, reason: collision with root package name */
    private C17538d f13778c;

    /* renamed from: d, reason: collision with root package name */
    private Bb.e f13779d;

    @Override // Ib.h
    public final void a(String str, Object obj) throws Throwable {
        HashMap map = new HashMap();
        h(map);
        C17538d.e(obj, 4);
        f(str, null, map, "PUT", obj);
    }

    private <T> T e(Class<T> cls, C16919b c16919b, String str) {
        if (c16919b != null) {
            try {
                if (c16919b.f160375c) {
                    T t10 = cls != null ? (T) this.f13778c.d(cls, c16919b.f160376d) : null;
                    if (f13775f.b()) {
                        if (c16919b.f160375c) {
                            j(C17538d.e(t10, 4));
                            return t10;
                        }
                        j(C17538d.e(t10, 4));
                    }
                    return t10;
                }
            } catch (Exception unused) {
                throw new com.gimbal.internal.rest.context.e(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, "Unable to parse the response.");
            }
        }
        f13774e.g(c16919b.f160374b, new Object[0]);
        throw new com.gimbal.internal.rest.context.e(c16919b.f160373a, c16919b.f160374b);
    }

    private void g() {
        a aVarG = this.f13779d.G();
        if (aVarG != null) {
            this.f13777b.g(aVarG.a(), aVarG.b());
        }
    }

    private void h(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(C16920c.f160382h, C16920c.f160384j);
        map.put("X-Client-Timezone", TimeZone.getDefault().getID());
        map.put("X-Client-Platform", "android");
        C16920c c16920c = this.f13777b;
        c16920c.f160387a.put(C16920c.f160380f, this.f13776a.f());
    }

    private C15314c i(String str) {
        try {
            return (C15314c) this.f13778c.c(C15314c.class, str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String j(String str) {
        return (str == null || str.length() < 2000) ? str : str.substring(0, 2000);
    }

    @Override // Ib.h
    public final <T> T b(String str, Class<T> cls) {
        return (T) d(str, cls, new HashMap());
    }

    @Override // Ib.h
    public final <T> T c(String str, Object obj, Class<T> cls) {
        HashMap map = new HashMap();
        h(map);
        C17538d.e(obj, 4);
        return (T) f(str, cls, map, "POST", obj);
    }

    public d(C16920c c16920c, b bVar, C17538d c17538d, Bb.e eVar) {
        this.f13777b = c16920c;
        this.f13776a = bVar;
        this.f13778c = c17538d;
        this.f13779d = eVar;
    }

    private <T> T f(String str, Class<T> cls, Map<String, String> map, String str2, Object obj) throws Throwable {
        C16919b c16919bC;
        g();
        try {
            String strH = this.f13778c.h(obj);
            if ("POST".equals(str2)) {
                c16919bC = this.f13777b.e(str, strH, map);
            } else if ("PUT".equals(str2)) {
                c16919bC = this.f13777b.k(str, strH, map);
            } else if ("DELETE".equals(str2)) {
                c16919bC = this.f13777b.c(str);
            } else {
                c16919bC = null;
            }
            return (T) e(cls, c16919bC, str);
        } catch (com.gimbal.internal.i.c e10) {
            if (i(e10.f64368a) == null) {
                throw new com.gimbal.internal.rest.context.e(e10.f64369b, e10.f64368a);
            }
            throw new com.gimbal.internal.rest.context.e(e10.f64369b, e10.f64368a);
        } catch (Exception e11) {
            throw new com.gimbal.internal.rest.context.e(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, e11.getMessage());
        }
    }

    @Override // Ib.h
    public final <T> T d(String str, Class<T> cls, Map<String, String> map) {
        g();
        h(map);
        return (T) e(cls, this.f13777b.f(str, map), str);
    }

    @Override // Ib.h
    public final void a(String str) throws Throwable {
        HashMap map = new HashMap();
        h(map);
        f(str, null, map, "DELETE", null);
    }
}

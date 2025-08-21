package Kb;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import kt.C15417c;
import ub.C17366b;
import ub.C17367c;
import xb.C18150d;

/* loaded from: classes4.dex */
public class d implements h {

    /* renamed from: e, reason: collision with root package name */
    private static final C13786c f16520e = C13787d.a(d.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f16521f = C13785b.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final b f16522a;

    /* renamed from: b, reason: collision with root package name */
    private final C17367c f16523b;

    /* renamed from: c, reason: collision with root package name */
    private C18150d f16524c;

    /* renamed from: d, reason: collision with root package name */
    private Db.e f16525d;

    @Override // Kb.h
    public final void a(String str, Object obj) throws Throwable {
        HashMap map = new HashMap();
        h(map);
        C18150d.e(obj, 4);
        f(str, null, map, "PUT", obj);
    }

    private <T> T e(Class<T> cls, C17366b c17366b, String str) {
        if (c17366b != null) {
            try {
                if (c17366b.f163861c) {
                    T t10 = cls != null ? (T) this.f16524c.d(cls, c17366b.f163862d) : null;
                    if (f16521f.b()) {
                        if (c17366b.f163861c) {
                            j(C18150d.e(t10, 4));
                            return t10;
                        }
                        j(C18150d.e(t10, 4));
                    }
                    return t10;
                }
            } catch (Exception unused) {
                throw new com.gimbal.internal.rest.context.e(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, "Unable to parse the response.");
            }
        }
        f16520e.g(c17366b.f163860b, new Object[0]);
        throw new com.gimbal.internal.rest.context.e(c17366b.f163859a, c17366b.f163860b);
    }

    private void g() {
        a aVarG = this.f16525d.G();
        if (aVarG != null) {
            this.f16523b.g(aVarG.a(), aVarG.b());
        }
    }

    private void h(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(C17367c.f163868h, C17367c.f163870j);
        map.put("X-Client-Timezone", TimeZone.getDefault().getID());
        map.put("X-Client-Platform", "android");
        C17367c c17367c = this.f16523b;
        c17367c.f163873a.put(C17367c.f163866f, this.f16522a.f());
    }

    private C15417c i(String str) {
        try {
            return (C15417c) this.f16524c.c(C15417c.class, str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String j(String str) {
        return (str == null || str.length() < 2000) ? str : str.substring(0, 2000);
    }

    @Override // Kb.h
    public final <T> T b(String str, Class<T> cls) {
        return (T) d(str, cls, new HashMap());
    }

    @Override // Kb.h
    public final <T> T c(String str, Object obj, Class<T> cls) {
        HashMap map = new HashMap();
        h(map);
        C18150d.e(obj, 4);
        return (T) f(str, cls, map, "POST", obj);
    }

    public d(C17367c c17367c, b bVar, C18150d c18150d, Db.e eVar) {
        this.f16523b = c17367c;
        this.f16522a = bVar;
        this.f16524c = c18150d;
        this.f16525d = eVar;
    }

    private <T> T f(String str, Class<T> cls, Map<String, String> map, String str2, Object obj) throws Throwable {
        C17366b c17366bC;
        g();
        try {
            String strH = this.f16524c.h(obj);
            if ("POST".equals(str2)) {
                c17366bC = this.f16523b.e(str, strH, map);
            } else if ("PUT".equals(str2)) {
                c17366bC = this.f16523b.k(str, strH, map);
            } else if ("DELETE".equals(str2)) {
                c17366bC = this.f16523b.c(str);
            } else {
                c17366bC = null;
            }
            return (T) e(cls, c17366bC, str);
        } catch (com.gimbal.internal.i.c e10) {
            if (i(e10.f65208a) == null) {
                throw new com.gimbal.internal.rest.context.e(e10.f65209b, e10.f65208a);
            }
            throw new com.gimbal.internal.rest.context.e(e10.f65209b, e10.f65208a);
        } catch (Exception e11) {
            throw new com.gimbal.internal.rest.context.e(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, e11.getMessage());
        }
    }

    @Override // Kb.h
    public final <T> T d(String str, Class<T> cls, Map<String, String> map) {
        g();
        h(map);
        return (T) e(cls, this.f16523b.f(str, map), str);
    }

    @Override // Kb.h
    public final void a(String str) throws Throwable {
        HashMap map = new HashMap();
        h(map);
        f(str, null, map, "DELETE", null);
    }
}

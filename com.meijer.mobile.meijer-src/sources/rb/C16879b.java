package rb;

import Nb.i;
import eb.C13786c;
import eb.C13787d;
import hb.C14495b;
import java.util.HashMap;
import java.util.Map;
import nt.C16020b;

/* renamed from: rb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16879b {

    /* renamed from: b, reason: collision with root package name */
    public static final C13786c f159447b = C13787d.a(C16879b.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static C16879b f159448c;

    /* renamed from: a, reason: collision with root package name */
    public C16878a f159449a;

    public final Map<String, String> b() {
        try {
            C16878a c16878a = this.f159449a;
            String strH = c16878a.f159443a.h("deviceAttributes", null);
            if (strH == null) {
                return null;
            }
            return (Map) c16878a.f159444b.c(HashMap.class, new String(c16878a.f159445c.d(i.b(strH)), "UTF8"));
        } catch (Exception e10) {
            f159447b.g("Unable to retrieve device attributes", e10);
            return null;
        }
    }

    public static synchronized C16879b a() {
        if (f159448c == null) {
            try {
                f159448c = new C16879b();
            } catch (Exception e10) {
                f159447b.g("Unable to create DeviceAttributesManager", e10);
            }
        }
        return f159448c;
    }

    private C16879b() throws Exception {
        C16020b.a();
        this.f159449a = new C16878a(C14495b.a().f135217N);
    }
}

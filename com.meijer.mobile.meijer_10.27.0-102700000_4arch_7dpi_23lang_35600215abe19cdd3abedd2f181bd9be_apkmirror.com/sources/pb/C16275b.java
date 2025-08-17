package pb;

import Lb.i;
import cb.C6382c;
import cb.C6383d;
import fb.C13865b;
import java.util.HashMap;
import java.util.Map;
import nt.C15944b;

/* renamed from: pb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16275b {

    /* renamed from: b, reason: collision with root package name */
    public static final C6382c f155690b = C6383d.a(C16275b.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static C16275b f155691c;

    /* renamed from: a, reason: collision with root package name */
    public C16274a f155692a;

    public final Map<String, String> b() {
        try {
            C16274a c16274a = this.f155692a;
            String strI = c16274a.f155686a.i("deviceAttributes", null);
            if (strI == null) {
                return null;
            }
            return (Map) c16274a.f155687b.c(HashMap.class, new String(c16274a.f155688c.d(i.b(strI)), "UTF8"));
        } catch (Exception e10) {
            f155690b.g("Unable to retrieve device attributes", e10);
            return null;
        }
    }

    public static synchronized C16275b a() {
        if (f155691c == null) {
            try {
                f155691c = new C16275b();
            } catch (Exception e10) {
                f155690b.g("Unable to create DeviceAttributesManager", e10);
            }
        }
        return f155691c;
    }

    private C16275b() throws Exception {
        C15944b.a();
        this.f155692a = new C16274a(C13865b.a().f130871N);
    }
}

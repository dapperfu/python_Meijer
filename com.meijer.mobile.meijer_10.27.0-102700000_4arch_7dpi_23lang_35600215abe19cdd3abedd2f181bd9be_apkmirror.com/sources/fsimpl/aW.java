package fsimpl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class aW {

    /* renamed from: a, reason: collision with root package name */
    protected gf f131553a;

    /* renamed from: b, reason: collision with root package name */
    private Map f131554b;

    /* renamed from: c, reason: collision with root package name */
    private aU f131555c;

    public aW() {
        this(new aU());
    }

    public aW(aU aUVar) {
        this.f131553a = new gf();
        this.f131554b = new HashMap();
        this.f131555c = aUVar;
    }

    public int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        int iB = this.f131553a.b(obj);
        if (iB != 0) {
            return iB;
        }
        int iA = this.f131555c.a();
        this.f131553a.a(obj, iA);
        this.f131554b.put(Integer.valueOf(iA), obj);
        return iA;
    }

    public Map a() {
        if (this.f131554b.isEmpty()) {
            return null;
        }
        Map map = this.f131554b;
        this.f131554b = new HashMap();
        return map;
    }
}

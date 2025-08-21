package fsimpl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class aW {

    /* renamed from: a, reason: collision with root package name */
    protected gf f132803a;

    /* renamed from: b, reason: collision with root package name */
    private Map f132804b;

    /* renamed from: c, reason: collision with root package name */
    private aU f132805c;

    public aW() {
        this(new aU());
    }

    public aW(aU aUVar) {
        this.f132803a = new gf();
        this.f132804b = new HashMap();
        this.f132805c = aUVar;
    }

    public int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        int iB = this.f132803a.b(obj);
        if (iB != 0) {
            return iB;
        }
        int iA = this.f132805c.a();
        this.f132803a.a(obj, iA);
        this.f132804b.put(Integer.valueOf(iA), obj);
        return iA;
    }

    public Map a() {
        if (this.f132804b.isEmpty()) {
            return null;
        }
        Map map = this.f132804b;
        this.f132804b = new HashMap();
        return map;
    }
}

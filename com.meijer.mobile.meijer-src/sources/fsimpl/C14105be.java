package fsimpl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fsimpl.be, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14105be {

    /* renamed from: b, reason: collision with root package name */
    private int f133068b;

    /* renamed from: c, reason: collision with root package name */
    private int f133069c;

    /* renamed from: a, reason: collision with root package name */
    protected fI f133067a = new fI(10000, 0.75f);

    /* renamed from: d, reason: collision with root package name */
    private List f133070d = new ArrayList(50);

    /* renamed from: e, reason: collision with root package name */
    private aU f133071e = new aU();

    public int a(String str) {
        if (str == null) {
            return 0;
        }
        int iA = this.f133067a.a(str.hashCode());
        if (iA != 0) {
            return iA;
        }
        this.f133068b = this.f133071e.a();
        this.f133067a.b(str.hashCode(), this.f133068b);
        this.f133070d.add(str);
        return this.f133068b;
    }

    public List a() {
        this.f133069c = this.f133068b;
        if (this.f133070d.isEmpty()) {
            return null;
        }
        List list = this.f133070d;
        this.f133070d = new ArrayList(50);
        return list;
    }

    public int b() {
        return this.f133069c;
    }
}

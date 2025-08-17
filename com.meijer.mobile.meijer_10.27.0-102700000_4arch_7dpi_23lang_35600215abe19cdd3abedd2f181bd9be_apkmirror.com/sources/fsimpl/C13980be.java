package fsimpl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fsimpl.be, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13980be {

    /* renamed from: b, reason: collision with root package name */
    private int f131818b;

    /* renamed from: c, reason: collision with root package name */
    private int f131819c;

    /* renamed from: a, reason: collision with root package name */
    protected fI f131817a = new fI(10000, 0.75f);

    /* renamed from: d, reason: collision with root package name */
    private List f131820d = new ArrayList(50);

    /* renamed from: e, reason: collision with root package name */
    private aU f131821e = new aU();

    public int a(String str) {
        if (str == null) {
            return 0;
        }
        int iA = this.f131817a.a(str.hashCode());
        if (iA != 0) {
            return iA;
        }
        this.f131818b = this.f131821e.a();
        this.f131817a.b(str.hashCode(), this.f131818b);
        this.f131820d.add(str);
        return this.f131818b;
    }

    public List a() {
        this.f131819c = this.f131818b;
        if (this.f131820d.isEmpty()) {
            return null;
        }
        List list = this.f131820d;
        this.f131820d = new ArrayList(50);
        return list;
    }

    public int b() {
        return this.f131819c;
    }
}

package l8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import k8.EnumC15115a;

/* renamed from: l8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15386a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f148703a;

    /* renamed from: b, reason: collision with root package name */
    private C15387b f148704b = new C15387b();

    /* renamed from: c, reason: collision with root package name */
    private C15388c f148705c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC15115a f148706d;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f148707e;

    /* renamed from: f, reason: collision with root package name */
    private Set<String> f148708f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f148709g;

    public synchronized void b(n8.b bVar, String str) {
        try {
            HashMap map = new HashMap();
            this.f148709g = map;
            if (this.f148706d == EnumC15115a.SAAS) {
                map.put("dtAdkSettings", "dtAdkSettings=" + this.f148704b.b(bVar));
            }
            if (bVar.f().b()) {
                this.f148709g.put("dtAdk", "dtAdk=" + this.f148704b.a(bVar, str));
                if (this.f148706d == EnumC15115a.APP_MON) {
                    this.f148709g.put("dtCookie", "dtCookie=" + this.f148704b.c(bVar.f151062b, bVar.f151063c));
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add("dtAdk");
                if (this.f148706d == EnumC15115a.APP_MON) {
                    arrayList.add("dtCookie");
                }
                this.f148705c.b(this.f148707e, arrayList);
                this.f148705c.b(this.f148708f, arrayList);
            }
            if (!this.f148709g.isEmpty()) {
                this.f148705c.c(this.f148707e, this.f148709g.values(), false);
                this.f148705c.c(this.f148708f, this.f148709g.values(), true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c(n8.b bVar) {
        if (this.f148706d == EnumC15115a.SAAS) {
            String str = "dtAdkSettings=" + this.f148704b.b(bVar);
            this.f148709g.put("dtAdkSettings", str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.f148705c.c(this.f148707e, arrayList, false);
            this.f148705c.c(this.f148708f, arrayList, true);
        }
    }

    public void a() {
        this.f148705c = new C15388c(this.f148703a);
    }

    public C15386a(Set<String> set, Set<String> set2, boolean z10, EnumC15115a enumC15115a) {
        this.f148707e = set;
        this.f148708f = set2;
        this.f148706d = enumC15115a;
        this.f148703a = z10;
    }
}

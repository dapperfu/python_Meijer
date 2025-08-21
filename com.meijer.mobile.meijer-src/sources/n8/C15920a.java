package n8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import m8.EnumC15686a;

/* renamed from: n8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15920a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f152100a;

    /* renamed from: b, reason: collision with root package name */
    private C15921b f152101b = new C15921b();

    /* renamed from: c, reason: collision with root package name */
    private C15922c f152102c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC15686a f152103d;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f152104e;

    /* renamed from: f, reason: collision with root package name */
    private Set<String> f152105f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f152106g;

    public synchronized void b(p8.b bVar, String str) {
        try {
            HashMap map = new HashMap();
            this.f152106g = map;
            if (this.f152103d == EnumC15686a.SAAS) {
                map.put("dtAdkSettings", "dtAdkSettings=" + this.f152101b.b(bVar));
            }
            if (bVar.f().b()) {
                this.f152106g.put("dtAdk", "dtAdk=" + this.f152101b.a(bVar, str));
                if (this.f152103d == EnumC15686a.APP_MON) {
                    this.f152106g.put("dtCookie", "dtCookie=" + this.f152101b.c(bVar.f156193b, bVar.f156194c));
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add("dtAdk");
                if (this.f152103d == EnumC15686a.APP_MON) {
                    arrayList.add("dtCookie");
                }
                this.f152102c.b(this.f152104e, arrayList);
                this.f152102c.b(this.f152105f, arrayList);
            }
            if (!this.f152106g.isEmpty()) {
                this.f152102c.c(this.f152104e, this.f152106g.values(), false);
                this.f152102c.c(this.f152105f, this.f152106g.values(), true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c(p8.b bVar) {
        if (this.f152103d == EnumC15686a.SAAS) {
            String str = "dtAdkSettings=" + this.f152101b.b(bVar);
            this.f152106g.put("dtAdkSettings", str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.f152102c.c(this.f152104e, arrayList, false);
            this.f152102c.c(this.f152105f, arrayList, true);
        }
    }

    public void a() {
        this.f152102c = new C15922c(this.f152100a);
    }

    public C15920a(Set<String> set, Set<String> set2, boolean z10, EnumC15686a enumC15686a) {
        this.f152104e = set;
        this.f152105f = set2;
        this.f152103d = enumC15686a;
        this.f152100a = z10;
    }
}

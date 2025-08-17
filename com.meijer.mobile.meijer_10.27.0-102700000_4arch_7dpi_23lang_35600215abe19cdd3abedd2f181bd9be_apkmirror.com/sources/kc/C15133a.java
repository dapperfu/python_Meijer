package kc;

import cb.C6382c;
import cb.C6383d;
import cc.C6384a;
import db.C13501a;
import fb.C13865b;
import ic.C14713a;
import ic.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: kc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15133a implements d {

    /* renamed from: e, reason: collision with root package name */
    private static final C6382c f141816e = C6383d.a(C15133a.class.getSimpleName());

    /* renamed from: a, reason: collision with root package name */
    private List<d> f141817a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private cc.e f141818b;

    /* renamed from: c, reason: collision with root package name */
    private C6384a f141819c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f141820d;

    @Override // kc.d
    public final boolean a(C14713a c14713a, String str) {
        List<d> list = this.f141817a;
        if (list != null && !list.isEmpty()) {
            Iterator<d> it = this.f141817a.iterator();
            while (it.hasNext()) {
                if (it.next().a(c14713a, str)) {
                    return true;
                }
            }
        }
        f141816e.g("No resolver strategy resolved sighting [{}] with uuid [{}]", c14713a, str);
        return false;
    }

    public C15133a(l lVar, C6384a c6384a, cc.e eVar, Map<String, String> map) {
        this.f141818b = eVar;
        this.f141819c = c6384a;
        this.f141820d = map;
        cc.d dVarA = cc.d.a();
        this.f141817a.add(new f(this.f141818b));
        this.f141817a.add(new C15135c(lVar));
        this.f141817a.add(new C15134b(lVar, this.f141819c, this.f141820d, dVarA));
        this.f141817a.add(new e(lVar, this.f141819c, this.f141818b, C13501a.c().f127308b, C13865b.a().f130887p, C13501a.c().f127322p, dVarA));
    }
}

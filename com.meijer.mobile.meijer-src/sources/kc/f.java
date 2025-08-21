package kc;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private Db.b f141797a;

    /* renamed from: b, reason: collision with root package name */
    private bb.e f141798b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, C15118c> f141799c = new HashMap();

    @Override // kc.e
    public final Integer a(int i10, String str) {
        C15118c c15118c = this.f141799c.get(str);
        if (c15118c == null) {
            c15118c = new C15118c(this.f141798b, this.f141797a);
            this.f141799c.put(str, c15118c);
        }
        return c15118c.a(i10);
    }

    public f(bb.e eVar, Db.b bVar) {
        this.f141798b = eVar;
        this.f141797a = bVar;
    }
}

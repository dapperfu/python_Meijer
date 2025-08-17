package ic;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private Bb.b f137708a;

    /* renamed from: b, reason: collision with root package name */
    private Za.e f137709b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, C14715c> f137710c = new HashMap();

    @Override // ic.e
    public final Integer a(int i10, String str) {
        C14715c c14715c = this.f137710c.get(str);
        if (c14715c == null) {
            c14715c = new C14715c(this.f137709b, this.f137708a);
            this.f137710c.put(str, c14715c);
        }
        return c14715c.a(i10);
    }

    public f(Za.e eVar, Bb.b bVar) {
        this.f137709b = eVar;
        this.f137708a = bVar;
    }
}

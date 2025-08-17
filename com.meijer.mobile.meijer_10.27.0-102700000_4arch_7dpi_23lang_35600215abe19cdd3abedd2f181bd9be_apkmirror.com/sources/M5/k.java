package M5;

import P5.C4504b;
import P5.p;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import f6.C13845a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f19025a;

    /* renamed from: b, reason: collision with root package name */
    private final p<LaunchRule> f19026b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6454m f19027c;

    /* renamed from: d, reason: collision with root package name */
    private final i f19028d;

    /* renamed from: e, reason: collision with root package name */
    private final List<C6449h> f19029e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19030f;

    public k(String str, AbstractC6454m abstractC6454m) {
        this(str, abstractC6454m, new p(new C4504b(C4504b.a.CASE_INSENSITIVE), h.f19014a.m()), new i(abstractC6454m));
    }

    private void a(C6449h c6449h) {
        if ("com.adobe.eventType.rulesEngine".equals(c6449h.w()) && "com.adobe.eventSource.requestReset".equals(c6449h.t()) && this.f19025a.equals(C13845a.o(c6449h.o(), "name", ""))) {
            d();
        } else {
            this.f19029e.add(c6449h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        for (C6449h c6449h : this.f19029e) {
            this.f19028d.e(c6449h, this.f19026b.a(new l(c6449h, this.f19027c)));
        }
        this.f19029e.clear();
        this.f19030f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6449h b(C6449h c6449h) {
        if (c6449h == null) {
            throw new IllegalArgumentException("Cannot evaluate null event.");
        }
        List<T> listA = this.f19026b.a(new l(c6449h, this.f19027c));
        if (!this.f19030f) {
            a(c6449h);
        }
        return this.f19028d.e(c6449h, listA);
    }

    public void c(List<LaunchRule> list) {
        if (list == null) {
            return;
        }
        this.f19026b.b(list);
        this.f19027c.c(new C6449h.b(this.f19025a, "com.adobe.eventType.rulesEngine", "com.adobe.eventSource.requestReset").d(Collections.singletonMap("name", this.f19025a)).a());
    }

    k(String str, AbstractC6454m abstractC6454m, p<LaunchRule> pVar, i iVar) {
        this.f19029e = new ArrayList();
        this.f19030f = false;
        if (!f6.i.a(str)) {
            this.f19025a = str;
            this.f19028d = iVar;
            this.f19027c = abstractC6454m;
            this.f19026b = pVar;
            return;
        }
        throw new IllegalArgumentException("LaunchRulesEngine cannot have a null/empty name");
    }
}

package N5;

import Q5.C4668b;
import Q5.p;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import g6.C14328a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f20688a;

    /* renamed from: b, reason: collision with root package name */
    private final p<LaunchRule> f20689b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6579m f20690c;

    /* renamed from: d, reason: collision with root package name */
    private final i f20691d;

    /* renamed from: e, reason: collision with root package name */
    private final List<C6574h> f20692e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20693f;

    public k(String str, AbstractC6579m abstractC6579m) {
        this(str, abstractC6579m, new p(new C4668b(C4668b.a.CASE_INSENSITIVE), h.f20677a.m()), new i(abstractC6579m));
    }

    private void a(C6574h c6574h) {
        if ("com.adobe.eventType.rulesEngine".equals(c6574h.w()) && "com.adobe.eventSource.requestReset".equals(c6574h.t()) && this.f20688a.equals(C14328a.o(c6574h.o(), "name", ""))) {
            d();
        } else {
            this.f20692e.add(c6574h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        for (C6574h c6574h : this.f20692e) {
            this.f20691d.e(c6574h, this.f20689b.a(new l(c6574h, this.f20690c)));
        }
        this.f20692e.clear();
        this.f20693f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6574h b(C6574h c6574h) {
        if (c6574h == null) {
            throw new IllegalArgumentException("Cannot evaluate null event.");
        }
        List<T> listA = this.f20689b.a(new l(c6574h, this.f20690c));
        if (!this.f20693f) {
            a(c6574h);
        }
        return this.f20691d.e(c6574h, listA);
    }

    public void c(List<LaunchRule> list) {
        if (list == null) {
            return;
        }
        this.f20689b.b(list);
        this.f20690c.c(new C6574h.b(this.f20688a, "com.adobe.eventType.rulesEngine", "com.adobe.eventSource.requestReset").d(Collections.singletonMap("name", this.f20688a)).a());
    }

    k(String str, AbstractC6579m abstractC6579m, p<LaunchRule> pVar, i iVar) {
        this.f20692e = new ArrayList();
        this.f20693f = false;
        if (!g6.i.a(str)) {
            this.f20688a = str;
            this.f20691d = iVar;
            this.f20690c = abstractC6579m;
            this.f20689b = pVar;
            return;
        }
        throw new IllegalArgumentException("LaunchRulesEngine cannot have a null/empty name");
    }
}

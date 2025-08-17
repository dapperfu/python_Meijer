package Cb;

import cb.C6380a;
import cb.C6381b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class c extends Ya.b {

    /* renamed from: p, reason: collision with root package name */
    private static final C6380a f3756p = C6381b.a(c.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private d f3757n;

    /* renamed from: o, reason: collision with root package name */
    private e f3758o;

    public c(Za.c cVar, Za.e eVar, d dVar, e eVar2) {
        super(cVar, eVar, "DELAYED_PLACE_EVENT_JOB", 5000L);
        this.f3757n = dVar;
        this.f3758o = eVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.b, Ya.c
    public final long o() {
        return 0L;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<a> itB = this.f3757n.b();
        while (itB.hasNext()) {
            a next = itB.next();
            if (next.c() <= y()) {
                arrayList.add(next);
                this.f3757n.k(next.a());
            }
        }
        if (arrayList.size() > 0) {
            e eVar = this.f3758o;
            List<a> listA = e.a(arrayList);
            if (listA.isEmpty()) {
                return;
            }
            eVar.f3764d.g(listA);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.g, Ya.c
    public final long p() {
        long jMin = 4611686018427387903L;
        try {
            Iterator<a> itB = this.f3757n.b();
            while (itB.hasNext()) {
                jMin = Math.min(jMin, itB.next().c());
            }
        } catch (IOException unused) {
        }
        return jMin;
    }
}

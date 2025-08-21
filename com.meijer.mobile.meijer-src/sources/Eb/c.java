package Eb;

import ab.AbstractC5677b;
import bb.C6346c;
import eb.C13784a;
import eb.C13785b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class c extends AbstractC5677b {

    /* renamed from: p, reason: collision with root package name */
    private static final C13784a f7068p = C13785b.a(c.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private d f7069n;

    /* renamed from: o, reason: collision with root package name */
    private e f7070o;

    public c(C6346c c6346c, bb.e eVar, d dVar, e eVar2) {
        super(c6346c, eVar, "DELAYED_PLACE_EVENT_JOB", 5000L);
        this.f7069n = dVar;
        this.f7070o = eVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5677b, ab.AbstractC5678c
    public final long o() {
        return 0L;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<a> itB = this.f7069n.b();
        while (itB.hasNext()) {
            a next = itB.next();
            if (next.c() <= y()) {
                arrayList.add(next);
                this.f7069n.k(next.a());
            }
        }
        if (arrayList.size() > 0) {
            e eVar = this.f7070o;
            List<a> listA = e.a(arrayList);
            if (listA.isEmpty()) {
                return;
            }
            eVar.f7076d.g(listA);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.g, ab.AbstractC5678c
    public final long p() {
        long jMin = 4611686018427387903L;
        try {
            Iterator<a> itB = this.f7069n.b();
            while (itB.hasNext()) {
                jMin = Math.min(jMin, itB.next().c());
            }
        } catch (IOException unused) {
        }
        return jMin;
    }
}

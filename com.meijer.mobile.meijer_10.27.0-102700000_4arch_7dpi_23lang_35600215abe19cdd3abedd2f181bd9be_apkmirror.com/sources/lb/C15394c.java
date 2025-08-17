package lb;

import Za.e;
import cb.C6380a;
import cb.C6381b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import mb.C15581b;
import mb.C15587h;
import mb.C15590k;

/* renamed from: lb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15394c extends Ya.b {

    /* renamed from: p, reason: collision with root package name */
    private static final C6380a f148801p = C6381b.a(C15394c.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private C15590k f148802n;

    /* renamed from: o, reason: collision with root package name */
    private C15587h f148803o;

    public C15394c(Za.c cVar, e eVar, C15590k c15590k, C15587h c15587h) {
        super(cVar, eVar, "DELAYED_COMMUNICATION_JOB", 5000L);
        this.f148802n = c15590k;
        this.f148803o = c15587h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.b, Ya.c
    public final long o() {
        return 0L;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<C15581b> itB = this.f148802n.b();
        while (itB.hasNext()) {
            C15581b next = itB.next();
            if (next.d() <= y()) {
                arrayList.add(next);
                this.f148802n.k(next.b());
            }
        }
        if (arrayList.size() > 0) {
            this.f148803o.f(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.g, Ya.c
    public final long p() {
        long jMin = 4611686018427387903L;
        try {
            Iterator<C15581b> itB = this.f148802n.b();
            while (itB.hasNext()) {
                jMin = Math.min(jMin, itB.next().d());
            }
        } catch (IOException unused) {
        }
        return jMin;
    }
}

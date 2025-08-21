package nb;

import ab.AbstractC5677b;
import bb.C6346c;
import bb.e;
import eb.C13784a;
import eb.C13785b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import ob.C16091b;
import ob.C16097h;
import ob.C16100k;

/* renamed from: nb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15928c extends AbstractC5677b {

    /* renamed from: p, reason: collision with root package name */
    private static final C13784a f152198p = C13785b.a(C15928c.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private C16100k f152199n;

    /* renamed from: o, reason: collision with root package name */
    private C16097h f152200o;

    public C15928c(C6346c c6346c, e eVar, C16100k c16100k, C16097h c16097h) {
        super(c6346c, eVar, "DELAYED_COMMUNICATION_JOB", 5000L);
        this.f152199n = c16100k;
        this.f152200o = c16097h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5677b, ab.AbstractC5678c
    public final long o() {
        return 0L;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<C16091b> itB = this.f152199n.b();
        while (itB.hasNext()) {
            C16091b next = itB.next();
            if (next.d() <= y()) {
                arrayList.add(next);
                this.f152199n.k(next.b());
            }
        }
        if (arrayList.size() > 0) {
            this.f152200o.f(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.g, ab.AbstractC5678c
    public final long p() {
        long jMin = 4611686018427387903L;
        try {
            Iterator<C16091b> itB = this.f152199n.b();
            while (itB.hasNext()) {
                jMin = Math.min(jMin, itB.next().d());
            }
        } catch (IOException unused) {
        }
        return jMin;
    }
}

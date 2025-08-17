package Mb;

import cb.C6380a;
import cb.C6381b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    private static final C6380a f19104g = C6381b.a(o.class.getName());

    /* renamed from: a, reason: collision with root package name */
    n f19105a;

    /* renamed from: b, reason: collision with root package name */
    int f19106b;

    /* renamed from: c, reason: collision with root package name */
    Bb.m<String, h> f19107c;

    /* renamed from: d, reason: collision with root package name */
    d f19108d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, j> f19109e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    long f19110f = 0;

    final class a implements Comparator<h> {
        a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(h hVar, h hVar2) {
            return (int) Math.signum(hVar2.g() - hVar.g());
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f19112a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ int[] f19113b = {1, 2};
    }

    public interface d {
        long a();
    }

    private synchronized void l() throws IOException {
        Collection<h> collectionD;
        Bb.m<String, h>.a aVarE = this.f19107c.e();
        try {
            ArrayList<h> arrayList = new ArrayList();
            Iterator<h> itB = this.f19107c.b();
            while (itB.hasNext()) {
                h next = itB.next();
                ListIterator<m> listIterator = next.j().listIterator();
                boolean z10 = false;
                while (listIterator.hasNext()) {
                    if (listIterator.next().b() > 5184000000L) {
                        listIterator.remove();
                        z10 = true;
                    }
                }
                if (z10) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() > 0) {
                for (h hVar : arrayList) {
                    this.f19107c.i(aVarE, hVar.e());
                    if (hVar.j().size() > 0 && (collectionD = d(hVar)) != null) {
                        this.f19107c.i(aVarE, hVar.e());
                        Iterator<h> it = collectionD.iterator();
                        while (it.hasNext()) {
                            this.f19107c.g(aVarE, it.next());
                        }
                    }
                }
                aVarE.a();
                aVarE = null;
                arrayList.size();
            }
            if (aVarE != null) {
                aVarE.b();
            }
        } catch (Throwable th2) {
            if (aVarE != null) {
                aVarE.b();
            }
            throw th2;
        }
    }

    public final synchronized List<h> e() throws IOException {
        ArrayList arrayList;
        try {
            i();
            Iterator<h> itB = this.f19107c.b();
            arrayList = new ArrayList();
            while (itB.hasNext()) {
                arrayList.add(itB.next());
            }
            Collections.sort(arrayList, new a());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public static class b implements d {
        @Override // Mb.o.d
        public final long a() {
            return System.currentTimeMillis();
        }
    }

    private static double a(double d10, double d11) {
        return d10 < d11 ? d10 : Math.max(0.0d, d10 - d11);
    }

    private boolean i() throws IOException {
        Mb.b bVarE = this.f19105a.e();
        if (bVarE == null || bVarE.k() < 2) {
            return false;
        }
        List<h> listF = f(this.f19107c.b(), bVarE);
        if (listF.size() == 0) {
            h hVar = new h();
            hVar.k(bVarE);
            this.f19107c.j(hVar);
            hVar.e();
            bVarE.e();
        } else if (listF.size() == 1) {
            h hVar2 = listF.get(0);
            hVar2.k(bVarE);
            this.f19107c.j(hVar2);
            hVar2.e();
            bVarE.e();
        } else {
            h hVarC = c(listF, bVarE);
            Iterator<h> it = listF.iterator();
            while (it.hasNext()) {
                this.f19107c.k(it.next().e());
            }
            this.f19107c.j(hVarC);
        }
        return true;
    }

    private void j() throws IOException {
        if (this.f19105a.a() != null && this.f19105a.a().l() >= 2) {
            Mb.a aVarA = this.f19105a.a();
            ArrayList arrayList = new ArrayList();
            for (j jVar : this.f19109e.values()) {
                if (jVar.j().t(aVarA.k(), 300.0d) && jVar.i().t(aVarA.j(), 300.0d)) {
                    arrayList.add(jVar);
                }
            }
            if (arrayList.size() == 0) {
                j jVar2 = new j();
                this.f19109e.put(jVar2.e(), jVar2);
                jVar2.k(this.f19105a.a());
            } else if (arrayList.size() == 1) {
                ((j) arrayList.get(0)).k(this.f19105a.a());
            }
        }
        this.f19105a.b(null);
    }

    private boolean m(f fVar) throws IOException {
        Mb.b bVarE = this.f19105a.e();
        if (bVarE == null || this.f19105a.e().j().e(fVar) >= 120.0d) {
            return false;
        }
        bVarE.a(fVar);
        this.f19105a.c(bVarE);
        this.f19105a.e().f();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x022d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178 A[Catch: all -> 0x010b, Merged into TryCatch #1 {all -> 0x001f, all -> 0x010b, blocks: (B:4:0x0003, B:6:0x0013, B:9:0x0022, B:17:0x0047, B:22:0x0053, B:24:0x007a, B:26:0x007e, B:27:0x0086, B:86:0x020b, B:88:0x0212, B:89:0x0215, B:92:0x021c, B:94:0x0223, B:95:0x0226, B:96:0x022b, B:12:0x0039, B:28:0x008b, B:30:0x0092, B:32:0x009f, B:36:0x0106, B:43:0x011b, B:51:0x013b, B:53:0x0141, B:55:0x0149, B:59:0x015e, B:61:0x0166, B:62:0x0170, B:64:0x0178, B:65:0x0188, B:66:0x01a2, B:67:0x01ac, B:69:0x01b2, B:71:0x01ba, B:75:0x01cf, B:77:0x01d7, B:78:0x01df, B:80:0x01e5, B:81:0x01e8, B:83:0x01f3, B:84:0x0203, B:85:0x0208), top: B:100:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(Mb.f r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mb.o.g(Mb.f):void");
    }

    public o(Bb.j jVar, Bb.m<String, h> mVar, d dVar) {
        this.f19107c = mVar;
        this.f19105a = new n(jVar);
        this.f19108d = dVar;
    }

    private static h c(Collection<h> collection, m mVar) {
        collection.size();
        h hVar = null;
        for (h hVar2 : collection) {
            if (hVar == null || hVar2.c() < hVar.c()) {
                hVar = hVar2;
            }
        }
        h hVar3 = new h(hVar);
        Iterator<h> it = collection.iterator();
        while (it.hasNext()) {
            Iterator<m> it2 = it.next().j().iterator();
            while (it2.hasNext()) {
                hVar3.k(it2.next());
            }
        }
        hVar3.k(mVar);
        collection.size();
        return hVar3;
    }

    private static Collection<h> d(h hVar) {
        if (hVar.j().size() == 0) {
            return null;
        }
        h hVar2 = new h(hVar);
        Iterator<m> it = hVar.j().iterator();
        hVar2.k(it.next());
        HashMap map = new HashMap();
        map.put(hVar2.e(), hVar2);
        while (it.hasNext()) {
            m next = it.next();
            List<h> listF = f(map.values().iterator(), next);
            if (listF.size() == 0) {
                h hVar3 = new h();
                hVar3.k(next);
                map.put(hVar3.e(), hVar3);
            } else if (listF.size() == 1) {
                listF.get(0).k(next);
            } else {
                h hVarC = c(listF, next);
                Iterator<h> it2 = listF.iterator();
                while (it2.hasNext()) {
                    map.remove(it2.next());
                }
                map.put(hVarC.e(), hVarC);
            }
        }
        return map.values();
    }

    private static List<h> f(Iterator<h> it, m mVar) {
        Mb.d dVarH = mVar.h();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            h next = it.next();
            next.i().e(dVarH);
            if (next.i().p(mVar.h(), 72.0d, 120.0d)) {
                next.e();
                next.i();
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private void h(f fVar) throws IOException {
        j();
        if (!m(fVar)) {
            k(fVar);
        }
    }

    private void k(f fVar) throws IOException {
        boolean zI = i();
        this.f19105a.c(null);
        if (!zI) {
            Mb.b bVar = new Mb.b();
            bVar.a(fVar);
            this.f19105a.c(bVar);
            this.f19105a.e().f();
        }
    }

    private static double b(Double... dArr) {
        double dMin = Double.MAX_VALUE;
        for (int i10 = 0; i10 < 3; i10++) {
            dMin = Math.min(dMin, dArr[i10].doubleValue());
        }
        return dMin;
    }
}

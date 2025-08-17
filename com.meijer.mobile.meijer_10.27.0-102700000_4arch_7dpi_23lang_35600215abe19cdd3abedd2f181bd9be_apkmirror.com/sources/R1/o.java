package R1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f31618g;

    /* renamed from: b, reason: collision with root package name */
    int f31620b;

    /* renamed from: d, reason: collision with root package name */
    int f31622d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<Q1.e> f31619a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    boolean f31621c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a> f31623e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f31624f = -1;

    class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<Q1.e> f31625a;

        /* renamed from: b, reason: collision with root package name */
        int f31626b;

        /* renamed from: c, reason: collision with root package name */
        int f31627c;

        /* renamed from: d, reason: collision with root package name */
        int f31628d;

        /* renamed from: e, reason: collision with root package name */
        int f31629e;

        /* renamed from: f, reason: collision with root package name */
        int f31630f;

        /* renamed from: g, reason: collision with root package name */
        int f31631g;

        public a(Q1.e eVar, M1.d dVar, int i10) {
            this.f31625a = new WeakReference<>(eVar);
            this.f31626b = dVar.x(eVar.f29566N);
            this.f31627c = dVar.x(eVar.f29567O);
            this.f31628d = dVar.x(eVar.f29568P);
            this.f31629e = dVar.x(eVar.f29569Q);
            this.f31630f = dVar.x(eVar.f29570R);
            this.f31631g = i10;
        }
    }

    private int j(M1.d dVar, ArrayList<Q1.e> arrayList, int i10) {
        int iX;
        int iX2;
        Q1.f fVar = (Q1.f) arrayList.get(0).D();
        dVar.D();
        fVar.d(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).d(dVar, false);
        }
        if (i10 == 0 && fVar.f29648V0 > 0) {
            Q1.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.f29649W0 > 0) {
            Q1.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f31623e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f31623e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iX = dVar.x(fVar.f29566N);
            iX2 = dVar.x(fVar.f29568P);
            dVar.D();
        } else {
            iX = dVar.x(fVar.f29567O);
            iX2 = dVar.x(fVar.f29569Q);
            dVar.D();
        }
        return iX2 - iX;
    }

    private String e() {
        int i10 = this.f31622d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    public boolean a(Q1.e eVar) {
        if (this.f31619a.contains(eVar)) {
            return false;
        }
        this.f31619a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f31619a.size();
        if (this.f31624f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f31624f == oVar.f31620b) {
                    g(this.f31622d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f31620b;
    }

    public int d() {
        return this.f31622d;
    }

    public int f(M1.d dVar, int i10) {
        if (this.f31619a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f31619a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<Q1.e> it = this.f31619a.iterator();
        while (it.hasNext()) {
            Q1.e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f29559H0 = oVar.c();
            } else {
                next.f29561I0 = oVar.c();
            }
        }
        this.f31624f = oVar.f31620b;
    }

    public void h(boolean z10) {
        this.f31621c = z10;
    }

    public void i(int i10) {
        this.f31622d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f31620b + "] <";
        Iterator<Q1.e> it = this.f31619a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().o();
        }
        return str + " >";
    }

    public o(int i10) {
        int i11 = f31618g;
        f31618g = i11 + 1;
        this.f31620b = i11;
        this.f31622d = i10;
    }
}

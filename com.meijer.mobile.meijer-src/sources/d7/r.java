package d7;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import d7.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o<Model, Data>> f128250a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.f<List<Throwable>> f128251b;

    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f128252a;

        /* renamed from: b, reason: collision with root package name */
        private final o2.f<List<Throwable>> f128253b;

        /* renamed from: c, reason: collision with root package name */
        private int f128254c;

        /* renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.g f128255d;

        /* renamed from: e, reason: collision with root package name */
        private d.a<? super Data> f128256e;

        /* renamed from: f, reason: collision with root package name */
        private List<Throwable> f128257f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f128258g;

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f128258g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f128252a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        private void g() {
            if (this.f128258g) {
                return;
            }
            if (this.f128254c < this.f128252a.size() - 1) {
                this.f128254c++;
                e(this.f128255d, this.f128256e);
            } else {
                r7.k.d(this.f128257f);
                this.f128256e.c(new GlideException("Fetch failed", new ArrayList(this.f128257f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f128252a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f128257f;
            if (list != null) {
                this.f128253b.a(list);
            }
            this.f128257f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f128252a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) r7.k.d(this.f128257f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public X6.a d() {
            return this.f128252a.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            this.f128255d = gVar;
            this.f128256e = aVar;
            this.f128257f = this.f128253b.b();
            this.f128252a.get(this.f128254c).e(gVar, this);
            if (this.f128258g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Data data) {
            if (data != null) {
                this.f128256e.f(data);
            } else {
                g();
            }
        }

        a(List<com.bumptech.glide.load.data.d<Data>> list, o2.f<List<Throwable>> fVar) {
            this.f128253b = fVar;
            r7.k.c(list);
            this.f128252a = list;
            this.f128254c = 0;
        }
    }

    @Override // d7.o
    public boolean a(Model model) {
        Iterator<o<Model, Data>> it = this.f128250a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // d7.o
    public o.a<Data> b(Model model, int i10, int i11, X6.g gVar) {
        o.a<Data> aVarB;
        int size = this.f128250a.size();
        ArrayList arrayList = new ArrayList(size);
        X6.e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            o<Model, Data> oVar = this.f128250a.get(i12);
            if (oVar.a(model) && (aVarB = oVar.b(model, i10, i11, gVar)) != null) {
                eVar = aVarB.f128243a;
                arrayList.add(aVarB.f128245c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new o.a<>(eVar, new a(arrayList, this.f128251b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f128250a.toArray()) + '}';
    }

    r(List<o<Model, Data>> list, o2.f<List<Throwable>> fVar) {
        this.f128250a = list;
        this.f128251b = fVar;
    }
}

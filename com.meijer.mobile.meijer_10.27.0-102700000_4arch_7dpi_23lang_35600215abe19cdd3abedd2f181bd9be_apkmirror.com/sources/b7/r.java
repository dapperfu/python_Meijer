package b7;

import b7.o;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o<Model, Data>> f60015a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.f<List<Throwable>> f60016b;

    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f60017a;

        /* renamed from: b, reason: collision with root package name */
        private final o2.f<List<Throwable>> f60018b;

        /* renamed from: c, reason: collision with root package name */
        private int f60019c;

        /* renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.g f60020d;

        /* renamed from: e, reason: collision with root package name */
        private d.a<? super Data> f60021e;

        /* renamed from: f, reason: collision with root package name */
        private List<Throwable> f60022f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f60023g;

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f60023g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f60017a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        private void g() {
            if (this.f60023g) {
                return;
            }
            if (this.f60019c < this.f60017a.size() - 1) {
                this.f60019c++;
                e(this.f60020d, this.f60021e);
            } else {
                p7.k.d(this.f60022f);
                this.f60021e.c(new GlideException("Fetch failed", new ArrayList(this.f60022f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f60017a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f60022f;
            if (list != null) {
                this.f60018b.a(list);
            }
            this.f60022f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f60017a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) p7.k.d(this.f60022f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public V6.a d() {
            return this.f60017a.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            this.f60020d = gVar;
            this.f60021e = aVar;
            this.f60022f = this.f60018b.b();
            this.f60017a.get(this.f60019c).e(gVar, this);
            if (this.f60023g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Data data) {
            if (data != null) {
                this.f60021e.f(data);
            } else {
                g();
            }
        }

        a(List<com.bumptech.glide.load.data.d<Data>> list, o2.f<List<Throwable>> fVar) {
            this.f60018b = fVar;
            p7.k.c(list);
            this.f60017a = list;
            this.f60019c = 0;
        }
    }

    @Override // b7.o
    public boolean a(Model model) {
        Iterator<o<Model, Data>> it = this.f60015a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // b7.o
    public o.a<Data> b(Model model, int i10, int i11, V6.g gVar) {
        o.a<Data> aVarB;
        int size = this.f60015a.size();
        ArrayList arrayList = new ArrayList(size);
        V6.e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            o<Model, Data> oVar = this.f60015a.get(i12);
            if (oVar.a(model) && (aVarB = oVar.b(model, i10, i11, gVar)) != null) {
                eVar = aVarB.f60008a;
                arrayList.add(aVarB.f60010c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new o.a<>(eVar, new a(arrayList, this.f60016b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f60015a.toArray()) + '}';
    }

    r(List<o<Model, Data>> list, o2.f<List<Throwable>> fVar) {
        this.f60015a = list;
        this.f60016b = fVar;
    }
}

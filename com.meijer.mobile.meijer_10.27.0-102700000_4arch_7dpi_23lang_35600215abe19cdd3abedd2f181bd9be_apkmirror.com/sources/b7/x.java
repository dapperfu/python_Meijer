package b7;

import b7.o;
import com.bumptech.glide.load.data.d;

/* loaded from: classes4.dex */
public class x<Model> implements o<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    private static final x<?> f60044a = new x<>();

    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        private static final a<?> f60045a = new a<>();

        public static <T> a<T> a() {
            return (a<T>) f60045a;
        }

        @Deprecated
        public a() {
        }

        @Override // b7.p
        public o<Model, Model> d(s sVar) {
            return x.c();
        }
    }

    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a, reason: collision with root package name */
        private final Model f60046a;

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f60046a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public V6.a d() {
            return V6.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Model> aVar) {
            aVar.f(this.f60046a);
        }

        b(Model model) {
            this.f60046a = model;
        }
    }

    @Override // b7.o
    public boolean a(Model model) {
        return true;
    }

    public static <T> x<T> c() {
        return (x<T>) f60044a;
    }

    @Override // b7.o
    public o.a<Model> b(Model model, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(model), new b(model));
    }

    @Deprecated
    public x() {
    }
}

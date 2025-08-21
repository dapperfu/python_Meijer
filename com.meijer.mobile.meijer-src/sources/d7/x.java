package d7;

import com.bumptech.glide.load.data.d;
import d7.o;

/* loaded from: classes4.dex */
public class x<Model> implements o<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    private static final x<?> f128279a = new x<>();

    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        private static final a<?> f128280a = new a<>();

        public static <T> a<T> a() {
            return (a<T>) f128280a;
        }

        @Deprecated
        public a() {
        }

        @Override // d7.p
        public o<Model, Model> d(s sVar) {
            return x.c();
        }
    }

    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a, reason: collision with root package name */
        private final Model f128281a;

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f128281a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public X6.a d() {
            return X6.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Model> aVar) {
            aVar.f(this.f128281a);
        }

        b(Model model) {
            this.f128281a = model;
        }
    }

    @Override // d7.o
    public boolean a(Model model) {
        return true;
    }

    public static <T> x<T> c() {
        return (x<T>) f128279a;
    }

    @Override // d7.o
    public o.a<Model> b(Model model, int i10, int i11, X6.g gVar) {
        return new o.a<>(new q7.d(model), new b(model));
    }

    @Deprecated
    public x() {
    }
}

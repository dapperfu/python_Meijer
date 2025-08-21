package d7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public interface o<Model, Data> {

    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final X6.e f128243a;

        /* renamed from: b, reason: collision with root package name */
        public final List<X6.e> f128244b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f128245c;

        public a(X6.e eVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(eVar, Collections.EMPTY_LIST, dVar);
        }

        public a(X6.e eVar, List<X6.e> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f128243a = (X6.e) r7.k.d(eVar);
            this.f128244b = (List) r7.k.d(list);
            this.f128245c = (com.bumptech.glide.load.data.d) r7.k.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, X6.g gVar);
}

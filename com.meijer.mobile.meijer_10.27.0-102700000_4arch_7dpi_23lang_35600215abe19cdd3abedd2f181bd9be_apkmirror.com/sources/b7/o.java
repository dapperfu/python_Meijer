package b7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public interface o<Model, Data> {

    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final V6.e f60008a;

        /* renamed from: b, reason: collision with root package name */
        public final List<V6.e> f60009b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f60010c;

        public a(V6.e eVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(eVar, Collections.EMPTY_LIST, dVar);
        }

        public a(V6.e eVar, List<V6.e> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f60008a = (V6.e) p7.k.d(eVar);
            this.f60009b = (List) p7.k.d(list);
            this.f60010c = (com.bumptech.glide.load.data.d) p7.k.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, V6.g gVar);
}

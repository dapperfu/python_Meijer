package a5;

import d5.InterfaceC13626j;
import g5.i;
import g5.m;
import h5.InterfaceC14468b;
import i5.InterfaceC14687b;
import j5.InterfaceC14945d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15673l;
import r5.C16839c;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001)B«\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J?\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b/\u0010,R9\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b-\u0010,R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b)\u0010,¨\u00060"}, d2 = {"La5/b;", "", "", "Lh5/b;", "interceptors", "Lkotlin/Pair;", "Lj5/d;", "Ljava/lang/Class;", "mappers", "Li5/b;", "keyers", "Lg5/i$a;", "fetcherFactories", "Ld5/j$a;", "decoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Lm5/l;", "options", "g", "(Ljava/lang/Object;Lm5/l;)Ljava/lang/Object;", "", "f", "(Ljava/lang/Object;Lm5/l;)Ljava/lang/String;", "La5/h;", "imageLoader", "", "startIndex", "Lg5/i;", "j", "(Ljava/lang/Object;Lm5/l;La5/h;I)Lkotlin/Pair;", "Lg5/m;", "result", "Ld5/j;", "i", "(Lg5/m;Lm5/l;La5/h;I)Lkotlin/Pair;", "La5/b$a;", "h", "()La5/b$a;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "e", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC14468b> interceptors;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<InterfaceC14945d<? extends Object, ? extends Object>, Class<? extends Object>>> mappers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<InterfaceC14687b<? extends Object>, Class<? extends Object>>> keyers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<i.a<? extends Object>, Class<? extends Object>>> fetcherFactories;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC13626j.a> decoderFactories;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR@\u0010\"\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b!\u0010\u001eR<\u0010$\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b#\u0010\u001eR<\u0010&\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b%\u0010\u001eR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b'\u0010\u001e¨\u0006)"}, d2 = {"La5/b$a;", "", "La5/b;", "registry", "<init>", "(La5/b;)V", "T", "Lj5/d;", "mapper", "Ljava/lang/Class;", "type", "d", "(Lj5/d;Ljava/lang/Class;)La5/b$a;", "Li5/b;", "keyer", "c", "(Li5/b;Ljava/lang/Class;)La5/b$a;", "Lg5/i$a;", "factory", "b", "(Lg5/i$a;Ljava/lang/Class;)La5/b$a;", "Ld5/j$a;", "a", "(Ld5/j$a;)La5/b$a;", "e", "()La5/b;", "", "Lh5/b;", "Ljava/util/List;", "getInterceptors$coil_base_release", "()Ljava/util/List;", "interceptors", "Lkotlin/Pair;", "getMappers$coil_base_release", "mappers", "getKeyers$coil_base_release", "keyers", "g", "fetcherFactories", "f", "decoderFactories", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<InterfaceC14468b> interceptors;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<InterfaceC14945d<? extends Object, ?>, Class<? extends Object>>> mappers;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<InterfaceC14687b<? extends Object>, Class<? extends Object>>> keyers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<i.a<? extends Object>, Class<? extends Object>>> fetcherFactories;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<InterfaceC13626j.a> decoderFactories;

        public final a a(InterfaceC13626j.a factory) {
            this.decoderFactories.add(factory);
            return this;
        }

        public final <T> a b(i.a<T> factory, Class<T> type) {
            this.fetcherFactories.add(TuplesKt.a(factory, type));
            return this;
        }

        public final <T> a c(InterfaceC14687b<T> keyer, Class<T> type) {
            this.keyers.add(TuplesKt.a(keyer, type));
            return this;
        }

        public final <T> a d(InterfaceC14945d<T, ?> mapper, Class<T> type) {
            this.mappers.add(TuplesKt.a(mapper, type));
            return this;
        }

        public final b e() {
            return new b(C16839c.a(this.interceptors), C16839c.a(this.mappers), C16839c.a(this.keyers), C16839c.a(this.fetcherFactories), C16839c.a(this.decoderFactories), null);
        }

        public final List<InterfaceC13626j.a> f() {
            return this.decoderFactories;
        }

        public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> g() {
            return this.fetcherFactories;
        }

        public a(b bVar) {
            this.interceptors = CollectionsKt.m1(bVar.c());
            this.mappers = CollectionsKt.m1(bVar.e());
            this.keyers = CollectionsKt.m1(bVar.d());
            this.fetcherFactories = CollectionsKt.m1(bVar.b());
            this.decoderFactories = CollectionsKt.m1(bVar.a());
        }
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(List<? extends InterfaceC14468b> list, List<? extends Pair<? extends InterfaceC14945d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends InterfaceC14687b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends i.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends InterfaceC13626j.a> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.fetcherFactories = list4;
        this.decoderFactories = list5;
    }

    public final List<InterfaceC13626j.a> a() {
        return this.decoderFactories;
    }

    public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> b() {
        return this.fetcherFactories;
    }

    public final List<InterfaceC14468b> c() {
        return this.interceptors;
    }

    public final List<Pair<InterfaceC14687b<? extends Object>, Class<? extends Object>>> d() {
        return this.keyers;
    }

    public final List<Pair<InterfaceC14945d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.mappers;
    }

    public final String f(Object data, C15673l options) {
        List<Pair<InterfaceC14687b<? extends Object>, Class<? extends Object>>> list = this.keyers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<InterfaceC14687b<? extends Object>, Class<? extends Object>> pair = list.get(i10);
            InterfaceC14687b<? extends Object> interfaceC14687bA = pair.a();
            if (pair.b().isAssignableFrom(data.getClass())) {
                Intrinsics.h(interfaceC14687bA, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strA = interfaceC14687bA.a(data, options);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    public final Object g(Object data, C15673l options) {
        List<Pair<InterfaceC14945d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<InterfaceC14945d<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i10);
            InterfaceC14945d<? extends Object, ? extends Object> interfaceC14945dA = pair.a();
            if (pair.b().isAssignableFrom(data.getClass())) {
                Intrinsics.h(interfaceC14945dA, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objA = interfaceC14945dA.a(data, options);
                if (objA != null) {
                    data = objA;
                }
            }
        }
        return data;
    }

    public final a h() {
        return new a(this);
    }

    @JvmOverloads
    public final Pair<InterfaceC13626j, Integer> i(m result, C15673l options, h imageLoader, int startIndex) {
        int size = this.decoderFactories.size();
        while (startIndex < size) {
            InterfaceC13626j interfaceC13626jA = this.decoderFactories.get(startIndex).a(result, options, imageLoader);
            if (interfaceC13626jA != null) {
                return TuplesKt.a(interfaceC13626jA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    @JvmOverloads
    public final Pair<g5.i, Integer> j(Object data, C15673l options, h imageLoader, int startIndex) {
        int size = this.fetcherFactories.size();
        while (startIndex < size) {
            Pair<i.a<? extends Object>, Class<? extends Object>> pair = this.fetcherFactories.get(startIndex);
            i.a<? extends Object> aVarA = pair.a();
            if (pair.b().isAssignableFrom(data.getClass())) {
                Intrinsics.h(aVarA, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                g5.i iVarA = aVarA.a(data, options, imageLoader);
                if (iVarA != null) {
                    return TuplesKt.a(iVarA, Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }

    public b() {
        this(CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m());
    }
}

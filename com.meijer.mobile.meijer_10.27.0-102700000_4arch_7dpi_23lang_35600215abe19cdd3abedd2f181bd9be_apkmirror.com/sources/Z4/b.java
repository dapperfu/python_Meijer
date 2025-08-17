package Z4;

import c5.InterfaceC6364j;
import f5.i;
import f5.m;
import g5.InterfaceC14199b;
import h5.InterfaceC14378b;
import i5.InterfaceC14686d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15376l;
import q5.C16451c;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001)B«\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J?\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b/\u0010,R9\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b-\u0010,R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b)\u0010,¨\u00060"}, d2 = {"LZ4/b;", "", "", "Lg5/b;", "interceptors", "Lkotlin/Pair;", "Li5/d;", "Ljava/lang/Class;", "mappers", "Lh5/b;", "keyers", "Lf5/i$a;", "fetcherFactories", "Lc5/j$a;", "decoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Ll5/l;", "options", "g", "(Ljava/lang/Object;Ll5/l;)Ljava/lang/Object;", "", "f", "(Ljava/lang/Object;Ll5/l;)Ljava/lang/String;", "LZ4/h;", "imageLoader", "", "startIndex", "Lf5/i;", "j", "(Ljava/lang/Object;Ll5/l;LZ4/h;I)Lkotlin/Pair;", "Lf5/m;", "result", "Lc5/j;", "i", "(Lf5/m;Ll5/l;LZ4/h;I)Lkotlin/Pair;", "LZ4/b$a;", "h", "()LZ4/b$a;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "e", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC14199b> interceptors;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<InterfaceC14686d<? extends Object, ? extends Object>, Class<? extends Object>>> mappers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<InterfaceC14378b<? extends Object>, Class<? extends Object>>> keyers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<i.a<? extends Object>, Class<? extends Object>>> fetcherFactories;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC6364j.a> decoderFactories;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR@\u0010\"\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b!\u0010\u001eR<\u0010$\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b#\u0010\u001eR<\u0010&\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b%\u0010\u001eR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b'\u0010\u001e¨\u0006)"}, d2 = {"LZ4/b$a;", "", "LZ4/b;", "registry", "<init>", "(LZ4/b;)V", "T", "Li5/d;", "mapper", "Ljava/lang/Class;", "type", "d", "(Li5/d;Ljava/lang/Class;)LZ4/b$a;", "Lh5/b;", "keyer", "c", "(Lh5/b;Ljava/lang/Class;)LZ4/b$a;", "Lf5/i$a;", "factory", "b", "(Lf5/i$a;Ljava/lang/Class;)LZ4/b$a;", "Lc5/j$a;", "a", "(Lc5/j$a;)LZ4/b$a;", "e", "()LZ4/b;", "", "Lg5/b;", "Ljava/util/List;", "getInterceptors$coil_base_release", "()Ljava/util/List;", "interceptors", "Lkotlin/Pair;", "getMappers$coil_base_release", "mappers", "getKeyers$coil_base_release", "keyers", "g", "fetcherFactories", "f", "decoderFactories", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<InterfaceC14199b> interceptors;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<InterfaceC14686d<? extends Object, ?>, Class<? extends Object>>> mappers;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<InterfaceC14378b<? extends Object>, Class<? extends Object>>> keyers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<i.a<? extends Object>, Class<? extends Object>>> fetcherFactories;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<InterfaceC6364j.a> decoderFactories;

        public final a a(InterfaceC6364j.a factory) {
            this.decoderFactories.add(factory);
            return this;
        }

        public final <T> a b(i.a<T> factory, Class<T> type) {
            this.fetcherFactories.add(TuplesKt.a(factory, type));
            return this;
        }

        public final <T> a c(InterfaceC14378b<T> keyer, Class<T> type) {
            this.keyers.add(TuplesKt.a(keyer, type));
            return this;
        }

        public final <T> a d(InterfaceC14686d<T, ?> mapper, Class<T> type) {
            this.mappers.add(TuplesKt.a(mapper, type));
            return this;
        }

        public final b e() {
            return new b(C16451c.a(this.interceptors), C16451c.a(this.mappers), C16451c.a(this.keyers), C16451c.a(this.fetcherFactories), C16451c.a(this.decoderFactories), null);
        }

        public final List<InterfaceC6364j.a> f() {
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
    private b(List<? extends InterfaceC14199b> list, List<? extends Pair<? extends InterfaceC14686d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends InterfaceC14378b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends i.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends InterfaceC6364j.a> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.fetcherFactories = list4;
        this.decoderFactories = list5;
    }

    public final List<InterfaceC6364j.a> a() {
        return this.decoderFactories;
    }

    public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> b() {
        return this.fetcherFactories;
    }

    public final List<InterfaceC14199b> c() {
        return this.interceptors;
    }

    public final List<Pair<InterfaceC14378b<? extends Object>, Class<? extends Object>>> d() {
        return this.keyers;
    }

    public final List<Pair<InterfaceC14686d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.mappers;
    }

    public final String f(Object data, C15376l options) {
        List<Pair<InterfaceC14378b<? extends Object>, Class<? extends Object>>> list = this.keyers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<InterfaceC14378b<? extends Object>, Class<? extends Object>> pair = list.get(i10);
            InterfaceC14378b<? extends Object> interfaceC14378bA = pair.a();
            if (pair.b().isAssignableFrom(data.getClass())) {
                Intrinsics.h(interfaceC14378bA, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strA = interfaceC14378bA.a(data, options);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    public final Object g(Object data, C15376l options) {
        List<Pair<InterfaceC14686d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<InterfaceC14686d<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i10);
            InterfaceC14686d<? extends Object, ? extends Object> interfaceC14686dA = pair.a();
            if (pair.b().isAssignableFrom(data.getClass())) {
                Intrinsics.h(interfaceC14686dA, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objA = interfaceC14686dA.a(data, options);
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
    public final Pair<InterfaceC6364j, Integer> i(m result, C15376l options, h imageLoader, int startIndex) {
        int size = this.decoderFactories.size();
        while (startIndex < size) {
            InterfaceC6364j interfaceC6364jA = this.decoderFactories.get(startIndex).a(result, options, imageLoader);
            if (interfaceC6364jA != null) {
                return TuplesKt.a(interfaceC6364jA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    @JvmOverloads
    public final Pair<f5.i, Integer> j(Object data, C15376l options, h imageLoader, int startIndex) {
        int size = this.fetcherFactories.size();
        while (startIndex < size) {
            Pair<i.a<? extends Object>, Class<? extends Object>> pair = this.fetcherFactories.get(startIndex);
            i.a<? extends Object> aVarA = pair.a();
            if (pair.b().isAssignableFrom(data.getClass())) {
                Intrinsics.h(aVarA, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                f5.i iVarA = aVarA.a(data, options, imageLoader);
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

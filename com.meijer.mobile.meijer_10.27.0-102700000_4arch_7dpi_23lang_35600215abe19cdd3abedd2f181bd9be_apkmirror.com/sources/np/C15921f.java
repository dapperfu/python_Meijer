package np;

import Qo.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnp/f;", "Lnp/e;", "LQo/l$i;", "LRo/c;", "productsRepository", "<init>", "(LRo/c;)V", "query", "c", "(LQo/l$i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LRo/c;", "b", "()LRo/c;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: np.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15921f implements InterfaceC15920e<l.Search> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.search.SearchProductQueryDataSource", f = "SearchProductQueryDataSource.kt", l = {28}, m = "load")
    /* renamed from: np.f$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f152257a;

        /* renamed from: b, reason: collision with root package name */
        Object f152258b;

        /* renamed from: c, reason: collision with root package name */
        Object f152259c;

        /* renamed from: d, reason: collision with root package name */
        Object f152260d;

        /* renamed from: e, reason: collision with root package name */
        Object f152261e;

        /* renamed from: f, reason: collision with root package name */
        int f152262f;

        /* renamed from: g, reason: collision with root package name */
        int f152263g;

        /* renamed from: h, reason: collision with root package name */
        int f152264h;

        /* renamed from: i, reason: collision with root package name */
        int f152265i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f152266j;

        /* renamed from: l, reason: collision with root package name */
        int f152268l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152266j = obj;
            this.f152268l |= Integer.MIN_VALUE;
            return C15921f.this.a(null, this);
        }
    }

    public C15921f(Ro.c productsRepository) {
        Intrinsics.j(productsRepository, "productsRepository");
        this.productsRepository = productsRepository;
    }

    /* renamed from: b, reason: from getter */
    public final Ro.c getProductsRepository() {
        return this.productsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // np.InterfaceC15920e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.Search r59, kotlin.coroutines.Continuation<? super Qo.l.Search> r60) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np.C15921f.a(Qo.l$i, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

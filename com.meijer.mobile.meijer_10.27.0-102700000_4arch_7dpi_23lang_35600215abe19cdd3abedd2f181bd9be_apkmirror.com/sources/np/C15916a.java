package np;

import Qo.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnp/a;", "Lnp/e;", "LQo/l$a;", "LRo/c;", "productsRepository", "<init>", "(LRo/c;)V", "query", "c", "(LQo/l$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LRo/c;", "b", "()LRo/c;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: np.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15916a implements InterfaceC15920e<l.BrowseCollection> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.search.CollectionProductQueryDataSource", f = "CollectionProductQueryDataSource.kt", l = {25}, m = "load")
    /* renamed from: np.a$a, reason: collision with other inner class name */
    static final class C2358a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f152205a;

        /* renamed from: b, reason: collision with root package name */
        Object f152206b;

        /* renamed from: c, reason: collision with root package name */
        Object f152207c;

        /* renamed from: d, reason: collision with root package name */
        Object f152208d;

        /* renamed from: e, reason: collision with root package name */
        Object f152209e;

        /* renamed from: f, reason: collision with root package name */
        int f152210f;

        /* renamed from: g, reason: collision with root package name */
        int f152211g;

        /* renamed from: h, reason: collision with root package name */
        int f152212h;

        /* renamed from: i, reason: collision with root package name */
        int f152213i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f152214j;

        /* renamed from: l, reason: collision with root package name */
        int f152216l;

        C2358a(Continuation<? super C2358a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152214j = obj;
            this.f152216l |= Integer.MIN_VALUE;
            return C15916a.this.a(null, this);
        }
    }

    public C15916a(Ro.c productsRepository) {
        Intrinsics.j(productsRepository, "productsRepository");
        this.productsRepository = productsRepository;
    }

    /* renamed from: b, reason: from getter */
    public final Ro.c getProductsRepository() {
        return this.productsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // np.InterfaceC15920e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.BrowseCollection r50, kotlin.coroutines.Continuation<? super Qo.l.BrowseCollection> r51) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np.C15916a.a(Qo.l$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package np;

import Qo.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnp/c;", "Lnp/e;", "LQo/l$d;", "LRo/c;", "productsRepository", "<init>", "(LRo/c;)V", "query", "c", "(LQo/l$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LRo/c;", "b", "()LRo/c;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: np.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15918c implements InterfaceC15920e<l.Department> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.search.DepartmentProductQueryDataSource", f = "DepartmentProductQueryDataSource.kt", l = {25}, m = "load")
    /* renamed from: np.c$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f152231a;

        /* renamed from: b, reason: collision with root package name */
        Object f152232b;

        /* renamed from: c, reason: collision with root package name */
        Object f152233c;

        /* renamed from: d, reason: collision with root package name */
        Object f152234d;

        /* renamed from: e, reason: collision with root package name */
        Object f152235e;

        /* renamed from: f, reason: collision with root package name */
        int f152236f;

        /* renamed from: g, reason: collision with root package name */
        int f152237g;

        /* renamed from: h, reason: collision with root package name */
        int f152238h;

        /* renamed from: i, reason: collision with root package name */
        int f152239i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f152240j;

        /* renamed from: l, reason: collision with root package name */
        int f152242l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152240j = obj;
            this.f152242l |= Integer.MIN_VALUE;
            return C15918c.this.a(null, this);
        }
    }

    public C15918c(Ro.c productsRepository) {
        Intrinsics.j(productsRepository, "productsRepository");
        this.productsRepository = productsRepository;
    }

    /* renamed from: b, reason: from getter */
    public final Ro.c getProductsRepository() {
        return this.productsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // np.InterfaceC15920e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.Department r50, kotlin.coroutines.Continuation<? super Qo.l.Department> r51) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np.C15918c.a(Qo.l$d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

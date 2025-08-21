package np;

import Qo.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnp/b;", "Lnp/e;", "LQo/l$c;", "LZo/c;", "mperksOffersRepository", "<init>", "(LZo/c;)V", "query", "c", "(LQo/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LZo/c;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: np.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15993b implements InterfaceC15996e<l.Coupon> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Zo.c mperksOffersRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.search.CouponProductQueryDataSource", f = "CouponProductQueryDataSource.kt", l = {24}, m = "load")
    /* renamed from: np.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f152670a;

        /* renamed from: b, reason: collision with root package name */
        Object f152671b;

        /* renamed from: c, reason: collision with root package name */
        Object f152672c;

        /* renamed from: d, reason: collision with root package name */
        Object f152673d;

        /* renamed from: e, reason: collision with root package name */
        Object f152674e;

        /* renamed from: f, reason: collision with root package name */
        int f152675f;

        /* renamed from: g, reason: collision with root package name */
        int f152676g;

        /* renamed from: h, reason: collision with root package name */
        int f152677h;

        /* renamed from: i, reason: collision with root package name */
        int f152678i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f152679j;

        /* renamed from: l, reason: collision with root package name */
        int f152681l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152679j = obj;
            this.f152681l |= Integer.MIN_VALUE;
            return C15993b.this.a(null, this);
        }
    }

    public C15993b(Zo.c mperksOffersRepository) {
        Intrinsics.j(mperksOffersRepository, "mperksOffersRepository");
        this.mperksOffersRepository = mperksOffersRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // np.InterfaceC15996e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.Coupon r11, kotlin.coroutines.Continuation<? super Qo.l.Coupon> r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np.C15993b.a(Qo.l$c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package np;

import Qo.l;
import jp.C15058b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnp/d;", "Lnp/e;", "LQo/l$f;", "Ljp/b;", "productRecommendationsRepository", "<init>", "(Ljp/b;)V", "query", "c", "(LQo/l$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljp/b;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: np.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15995d implements InterfaceC15996e<l.Personalized> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15058b productRecommendationsRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.search.PersonalizedProductQueryDataSource", f = "PersonalizedProductQueryDataSource.kt", l = {25}, m = "load")
    /* renamed from: np.d$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f152696a;

        /* renamed from: b, reason: collision with root package name */
        Object f152697b;

        /* renamed from: c, reason: collision with root package name */
        Object f152698c;

        /* renamed from: d, reason: collision with root package name */
        Object f152699d;

        /* renamed from: e, reason: collision with root package name */
        Object f152700e;

        /* renamed from: f, reason: collision with root package name */
        int f152701f;

        /* renamed from: g, reason: collision with root package name */
        int f152702g;

        /* renamed from: h, reason: collision with root package name */
        int f152703h;

        /* renamed from: i, reason: collision with root package name */
        int f152704i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f152705j;

        /* renamed from: l, reason: collision with root package name */
        int f152707l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f152705j = obj;
            this.f152707l |= Integer.MIN_VALUE;
            return C15995d.this.a(null, this);
        }
    }

    public C15995d(C15058b productRecommendationsRepository) {
        Intrinsics.j(productRecommendationsRepository, "productRecommendationsRepository");
        this.productRecommendationsRepository = productRecommendationsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // np.InterfaceC15996e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.Personalized r19, kotlin.coroutines.Continuation<? super Qo.l.Personalized> r20) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: np.C15995d.a(Qo.l$f, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

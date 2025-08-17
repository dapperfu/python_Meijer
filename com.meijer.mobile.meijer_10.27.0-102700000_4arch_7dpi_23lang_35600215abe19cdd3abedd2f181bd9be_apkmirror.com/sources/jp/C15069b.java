package jp;

import ip.PersonalizedProductsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.d;
import yl.k;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0011\u0010\u000eJ\"\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\n2\u0006\u0010\u000f\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0013\u0010\u000eJ\"\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\n2\u0006\u0010\t\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljp/b;", "", "Ljp/a;", "productRecommendationsDataSource", "Lyl/k;", "featureManager", "<init>", "(Ljp/a;Lyl/k;)V", "Lmk/d;", "recommendationType", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "e", "(Lmk/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "Lip/a;", "d", "c", "g", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljp/a;", "b", "Lyl/k;", "recommendations_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jp.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15069b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15068a productRecommendationsDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.recommendations.ProductRecommendationsRepository", f = "ProductRecommendationsRepository.kt", l = {44, 47}, m = "getProductRecommendations")
    /* renamed from: jp.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f140897a;

        /* renamed from: b, reason: collision with root package name */
        Object f140898b;

        /* renamed from: c, reason: collision with root package name */
        Object f140899c;

        /* renamed from: d, reason: collision with root package name */
        Object f140900d;

        /* renamed from: e, reason: collision with root package name */
        Object f140901e;

        /* renamed from: f, reason: collision with root package name */
        int f140902f;

        /* renamed from: g, reason: collision with root package name */
        int f140903g;

        /* renamed from: h, reason: collision with root package name */
        int f140904h;

        /* renamed from: i, reason: collision with root package name */
        int f140905i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f140906j;

        /* renamed from: l, reason: collision with root package name */
        int f140908l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f140906j = obj;
            this.f140908l |= Integer.MIN_VALUE;
            return C15069b.this.g(null, this);
        }
    }

    public C15069b(C15068a productRecommendationsDataSource, k featureManager) {
        Intrinsics.j(productRecommendationsDataSource, "productRecommendationsDataSource");
        Intrinsics.j(featureManager, "featureManager");
        this.productRecommendationsDataSource = productRecommendationsDataSource;
        this.featureManager = featureManager;
    }

    private final Object e(d dVar, Continuation<? super List<String>> continuation) {
        return C15068a.k(this.productRecommendationsDataSource, dVar, null, continuation, 2, null);
    }

    public final Object f(String str, Continuation<? super List<String>> continuation) {
        return C15068a.m(this.productRecommendationsDataSource, str, null, continuation, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(mk.d r9, kotlin.coroutines.Continuation<? super ip.PersonalizedProductsResponse> r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.C15069b.g(mk.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object c(d dVar, Continuation<? super List<String>> continuation) {
        return e(dVar, continuation);
    }

    public final Object d(d dVar, Continuation<? super PersonalizedProductsResponse> continuation) {
        return g(dVar, continuation);
    }
}

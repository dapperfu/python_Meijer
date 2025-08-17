package com.meijer.mobile.meijer.activity.personalized.modals;

import Qo.l;
import jp.C15069b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import np.InterfaceC15920e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/i1;", "Lnp/e;", "LQo/l$g;", "Ljp/b;", "productRecommendationsRepository", "LRo/c;", "productsRepository", "<init>", "(Ljp/b;LRo/c;)V", "query", "c", "(LQo/l$g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljp/b;", "b", "LRo/c;", "getProductsRepository", "()LRo/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class i1 implements InterfaceC15920e<l.Recommendations> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15069b productRecommendationsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.RecommendationProductQueryDataSource", f = "RecommendationProductQueryDataSource.kt", l = {24, 34}, m = "load")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f111455a;

        /* renamed from: b, reason: collision with root package name */
        Object f111456b;

        /* renamed from: c, reason: collision with root package name */
        Object f111457c;

        /* renamed from: d, reason: collision with root package name */
        Object f111458d;

        /* renamed from: e, reason: collision with root package name */
        Object f111459e;

        /* renamed from: f, reason: collision with root package name */
        int f111460f;

        /* renamed from: g, reason: collision with root package name */
        int f111461g;

        /* renamed from: h, reason: collision with root package name */
        int f111462h;

        /* renamed from: i, reason: collision with root package name */
        int f111463i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f111464j;

        /* renamed from: l, reason: collision with root package name */
        int f111466l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111464j = obj;
            this.f111466l |= Integer.MIN_VALUE;
            return i1.this.a(null, this);
        }
    }

    public i1(C15069b productRecommendationsRepository, Ro.c productsRepository) {
        Intrinsics.j(productRecommendationsRepository, "productRecommendationsRepository");
        Intrinsics.j(productsRepository, "productsRepository");
        this.productRecommendationsRepository = productRecommendationsRepository;
        this.productsRepository = productsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // np.InterfaceC15920e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.Recommendations r23, kotlin.coroutines.Continuation<? super Qo.l.Recommendations> r24) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.i1.a(Qo.l$g, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

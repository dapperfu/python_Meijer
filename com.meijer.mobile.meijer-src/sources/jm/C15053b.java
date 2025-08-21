package jm;

import Tl.MarketingBannersDecorator;
import Vl.MarketingBanner;
import Vl.e;
import Zl.e;
import com.meijer.mobile.home.service.models.contentManagementSystem.HomeCMSBannerResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mobile.meijer.com.target.models.TargetBannerResponse;
import mv.AbstractC15779K;
import mv.C15784P;
import mv.C15805i;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0015B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001b"}, d2 = {"Ljm/b;", "", "LJv/b;", "targetRepository", "LZl/e;", "cmsContentDataSource", "Lmv/K;", "ioDispatcher", "<init>", "(LJv/b;LZl/e;Lmv/K;)V", "", "", "mBoxNames", "LTl/a;", "c", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bannerPositions", "LVl/i;", "f", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LJv/b;", "b", "LZl/e;", "Lmv/K;", "d", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jm.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15053b {

    /* renamed from: e, reason: collision with root package name */
    public static final int f140947e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f140948f = CollectionsKt.p("item1", "item2", "item3", "item4", "item5");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Jv.b targetRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e cmsContentDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LTl/a;", "<anonymous>", "(Lmv/O;)LTl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchAllBanners$2", f = "MarketingBannerRepository.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: jm.b$b, reason: collision with other inner class name */
    static final class C2227b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super MarketingBannersDecorator>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140952a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f140954c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LTl/a;", "<anonymous>", "(Lmv/O;)LTl/a;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchAllBanners$2$1", f = "MarketingBannerRepository.kt", l = {44, 45, 48}, m = "invokeSuspend")
        /* renamed from: jm.b$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super MarketingBannersDecorator>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f140955a;

            /* renamed from: b, reason: collision with root package name */
            Object f140956b;

            /* renamed from: c, reason: collision with root package name */
            Object f140957c;

            /* renamed from: d, reason: collision with root package name */
            int f140958d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f140959e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C15053b f140960f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<String> f140961g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LTl/a;", "<anonymous>", "(Lmv/O;)LTl/a;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchAllBanners$2$1$cmsBannerList$1", f = "MarketingBannerRepository.kt", l = {43}, m = "invokeSuspend")
            /* renamed from: jm.b$b$a$a, reason: collision with other inner class name */
            static final class C2228a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super MarketingBannersDecorator>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f140962a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C15053b f140963b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2228a(C15053b c15053b, Continuation<? super C2228a> continuation) {
                    super(2, continuation);
                    this.f140963b = c15053b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2228a(this.f140963b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super MarketingBannersDecorator> continuation) {
                    return ((C2228a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f140962a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    C15053b c15053b = this.f140963b;
                    this.f140962a = 1;
                    Object objE = c15053b.e(this);
                    if (objE == objF) {
                        return objF;
                    }
                    return objE;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LVl/i;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchAllBanners$2$1$targetBannerList$1", f = "MarketingBannerRepository.kt", l = {42}, m = "invokeSuspend")
            /* renamed from: jm.b$b$a$b, reason: collision with other inner class name */
            static final class C2229b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends MarketingBanner>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f140964a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C15053b f140965b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<String> f140966c;

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends MarketingBanner>> continuation) {
                    return invoke2(interfaceC15783O, (Continuation<? super List<MarketingBanner>>) continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2229b(C15053b c15053b, List<String> list, Continuation<? super C2229b> continuation) {
                    super(2, continuation);
                    this.f140965b = c15053b;
                    this.f140966c = list;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2229b(this.f140965b, this.f140966c, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<MarketingBanner>> continuation) {
                    return ((C2229b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f140964a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    C15053b c15053b = this.f140965b;
                    List<String> list = this.f140966c;
                    this.f140964a = 1;
                    Object objF2 = c15053b.f(list, this);
                    if (objF2 == objF) {
                        return objF;
                    }
                    return objF2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15053b c15053b, List<String> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f140960f = c15053b;
                this.f140961g = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f140960f, this.f140961g, continuation);
                aVar.f140959e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super MarketingBannersDecorator> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r13.f140958d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L50
                    if (r1 == r4) goto L3e
                    if (r1 == r3) goto L2e
                    if (r1 != r2) goto L26
                    java.lang.Object r0 = r13.f140957c
                    Tl.a r0 = (Tl.MarketingBannersDecorator) r0
                    java.lang.Object r1 = r13.f140956b
                    mv.W r1 = (mv.W) r1
                    java.lang.Object r1 = r13.f140955a
                    mv.W r1 = (mv.W) r1
                    java.lang.Object r1 = r13.f140959e
                    mv.O r1 = (mv.InterfaceC15783O) r1
                    kotlin.ResultKt.b(r14)
                    goto Lb2
                L26:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L2e:
                    java.lang.Object r1 = r13.f140956b
                    mv.W r1 = (mv.W) r1
                    java.lang.Object r3 = r13.f140955a
                    mv.W r3 = (mv.W) r3
                    java.lang.Object r4 = r13.f140959e
                    mv.O r4 = (mv.InterfaceC15783O) r4
                    kotlin.ResultKt.b(r14)
                    goto L9d
                L3e:
                    java.lang.Object r1 = r13.f140956b
                    mv.W r1 = (mv.W) r1
                    java.lang.Object r4 = r13.f140955a
                    mv.W r4 = (mv.W) r4
                    java.lang.Object r5 = r13.f140959e
                    mv.O r5 = (mv.InterfaceC15783O) r5
                    kotlin.ResultKt.b(r14)
                    r14 = r4
                L4e:
                    r4 = r5
                    goto L8b
                L50:
                    kotlin.ResultKt.b(r14)
                    java.lang.Object r14 = r13.f140959e
                    r5 = r14
                    mv.O r5 = (mv.InterfaceC15783O) r5
                    jm.b$b$a$b r8 = new jm.b$b$a$b
                    jm.b r14 = r13.f140960f
                    java.util.List<java.lang.String> r1 = r13.f140961g
                    r11 = 0
                    r8.<init>(r14, r1, r11)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    mv.W r14 = mv.C15805i.b(r5, r6, r7, r8, r9, r10)
                    jm.b$b$a$a r8 = new jm.b$b$a$a
                    jm.b r1 = r13.f140960f
                    r8.<init>(r1, r11)
                    mv.W r1 = mv.C15805i.b(r5, r6, r7, r8, r9, r10)
                    mv.W[] r6 = new mv.W[r3]
                    r7 = 0
                    r6[r7] = r14
                    r6[r4] = r1
                    r13.f140959e = r5
                    r13.f140955a = r14
                    r13.f140956b = r1
                    r13.f140958d = r4
                    java.lang.Object r4 = mv.C15799f.b(r6, r13)
                    if (r4 != r0) goto L4e
                    goto Laf
                L8b:
                    r13.f140959e = r4
                    r13.f140955a = r14
                    r13.f140956b = r1
                    r13.f140958d = r3
                    java.lang.Object r3 = r1.H(r13)
                    if (r3 != r0) goto L9a
                    goto Laf
                L9a:
                    r12 = r3
                    r3 = r14
                    r14 = r12
                L9d:
                    Tl.a r14 = (Tl.MarketingBannersDecorator) r14
                    r13.f140959e = r4
                    r13.f140955a = r3
                    r13.f140956b = r1
                    r13.f140957c = r14
                    r13.f140958d = r2
                    java.lang.Object r1 = r3.H(r13)
                    if (r1 != r0) goto Lb0
                Laf:
                    return r0
                Lb0:
                    r0 = r14
                    r14 = r1
                Lb2:
                    java.util.List r14 = (java.util.List) r14
                    java.util.List r1 = r0.b()
                    java.lang.String r0 = r0.getSpecialOffersBanner()
                    Tl.a r2 = new Tl.a
                    r2.<init>(r1, r0, r14)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: jm.C15053b.C2227b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2227b(List<String> list, Continuation<? super C2227b> continuation) {
            super(2, continuation);
            this.f140954c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15053b.this.new C2227b(this.f140954c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super MarketingBannersDecorator> continuation) {
            return ((C2227b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f140952a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            a aVar = new a(C15053b.this, this.f140954c, null);
            this.f140952a = 1;
            Object objG = C15784P.g(aVar, this);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LTl/a;", "<anonymous>", "(Lmv/O;)LTl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchCMSBanners$2", f = "MarketingBannerRepository.kt", l = {71, 73, 76, 85}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jm.b$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super MarketingBannersDecorator>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f140967a;

        /* renamed from: b, reason: collision with root package name */
        Object f140968b;

        /* renamed from: c, reason: collision with root package name */
        Object f140969c;

        /* renamed from: d, reason: collision with root package name */
        Object f140970d;

        /* renamed from: e, reason: collision with root package name */
        Object f140971e;

        /* renamed from: f, reason: collision with root package name */
        Object f140972f;

        /* renamed from: g, reason: collision with root package name */
        int f140973g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f140974h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchCMSBanners$2$cmsBanners$1", f = "MarketingBannerRepository.kt", l = {68}, m = "invokeSuspend")
        /* renamed from: jm.b$c$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super HomeCMSBannerResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f140976a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15053b f140977b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C15053b c15053b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f140977b = c15053b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f140977b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super HomeCMSBannerResponse> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f140976a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                e eVar = this.f140977b.cmsContentDataSource;
                e.a.C0856a c0856a = e.a.C0856a.f39987a;
                this.f140976a = 1;
                Object objC = eVar.c(c0856a, this);
                if (objC == objF) {
                    return objF;
                }
                return objC;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchCMSBanners$2$specialOffer$1", f = "MarketingBannerRepository.kt", l = {70}, m = "invokeSuspend")
        /* renamed from: jm.b$c$b, reason: collision with other inner class name */
        static final class C2230b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super HomeCMSBannerResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f140978a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15053b f140979b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2230b(C15053b c15053b, Continuation<? super C2230b> continuation) {
                super(2, continuation);
                this.f140979b = c15053b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2230b(this.f140979b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super HomeCMSBannerResponse> continuation) {
                return ((C2230b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f140978a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Zl.e eVar = this.f140979b.cmsContentDataSource;
                e.a.b bVar = e.a.b.f39988a;
                this.f140978a = 1;
                Object objC = eVar.c(bVar, this);
                if (objC == objF) {
                    return objF;
                }
                return objC;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C15053b.this.new c(continuation);
            cVar.f140974h = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super MarketingBannersDecorator> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 332
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jm.C15053b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LVl/i;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchTargetBanner$2", f = "MarketingBannerRepository.kt", l = {58}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jm.b$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends MarketingBanner>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140980a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f140982c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends MarketingBanner>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<MarketingBanner>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<String> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f140982c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15053b.this.new d(this.f140982c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<MarketingBanner>> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f140980a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Jv.b bVar = C15053b.this.targetRepository;
                List<String> list = this.f140982c;
                this.f140980a = 1;
                obj = bVar.b(list, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Collection collectionValues = ((Map) obj).values();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionValues, 10));
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(Lv.a.a((TargetBannerResponse) it.next()));
            }
            return arrayList;
        }
    }

    public C15053b(Jv.b targetRepository, Zl.e cmsContentDataSource, AbstractC15779K ioDispatcher) {
        Intrinsics.j(targetRepository, "targetRepository");
        Intrinsics.j(cmsContentDataSource, "cmsContentDataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.targetRepository = targetRepository;
        this.cmsContentDataSource = cmsContentDataSource;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object d(C15053b c15053b, List list, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = f140948f;
        }
        return c15053b.c(list, continuation);
    }

    public final Object c(List<String> list, Continuation<? super MarketingBannersDecorator> continuation) {
        return C15805i.g(this.ioDispatcher, new C2227b(list, null), continuation);
    }

    public final Object e(Continuation<? super MarketingBannersDecorator> continuation) {
        return C15805i.g(this.ioDispatcher, new c(null), continuation);
    }

    public final Object f(List<String> list, Continuation<? super List<MarketingBanner>> continuation) {
        return C15805i.g(this.ioDispatcher, new d(list, null), continuation);
    }
}

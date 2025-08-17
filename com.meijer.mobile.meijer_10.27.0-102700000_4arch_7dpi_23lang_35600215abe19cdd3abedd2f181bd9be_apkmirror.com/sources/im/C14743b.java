package im;

import Sl.MarketingBannersDecorator;
import Ul.MarketingBanner;
import Ul.e;
import Yl.e;
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
import qv.AbstractC16618K;
import qv.C16623P;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0015B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001b"}, d2 = {"Lim/b;", "", "LNv/b;", "targetRepository", "LYl/e;", "cmsContentDataSource", "Lqv/K;", "ioDispatcher", "<init>", "(LNv/b;LYl/e;Lqv/K;)V", "", "", "mBoxNames", "LSl/a;", "c", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bannerPositions", "LUl/i;", "f", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LNv/b;", "b", "LYl/e;", "Lqv/K;", "d", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: im.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14743b {

    /* renamed from: e, reason: collision with root package name */
    public static final int f138061e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f138062f = CollectionsKt.p("item1", "item2", "item3", "item4", "item5");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Nv.b targetRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e cmsContentDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LSl/a;", "<anonymous>", "(Lqv/O;)LSl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchAllBanners$2", f = "MarketingBannerRepository.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: im.b$b, reason: collision with other inner class name */
    static final class C2176b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MarketingBannersDecorator>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138066a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f138068c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LSl/a;", "<anonymous>", "(Lqv/O;)LSl/a;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchAllBanners$2$1", f = "MarketingBannerRepository.kt", l = {44, 45, 48}, m = "invokeSuspend")
        /* renamed from: im.b$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MarketingBannersDecorator>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f138069a;

            /* renamed from: b, reason: collision with root package name */
            Object f138070b;

            /* renamed from: c, reason: collision with root package name */
            Object f138071c;

            /* renamed from: d, reason: collision with root package name */
            int f138072d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f138073e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C14743b f138074f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<String> f138075g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LSl/a;", "<anonymous>", "(Lqv/O;)LSl/a;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchAllBanners$2$1$cmsBannerList$1", f = "MarketingBannerRepository.kt", l = {43}, m = "invokeSuspend")
            /* renamed from: im.b$b$a$a, reason: collision with other inner class name */
            static final class C2177a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MarketingBannersDecorator>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f138076a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14743b f138077b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2177a(C14743b c14743b, Continuation<? super C2177a> continuation) {
                    super(2, continuation);
                    this.f138077b = c14743b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2177a(this.f138077b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MarketingBannersDecorator> continuation) {
                    return ((C2177a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f138076a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    C14743b c14743b = this.f138077b;
                    this.f138076a = 1;
                    Object objE = c14743b.e(this);
                    if (objE == objF) {
                        return objF;
                    }
                    return objE;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LUl/i;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchAllBanners$2$1$targetBannerList$1", f = "MarketingBannerRepository.kt", l = {42}, m = "invokeSuspend")
            /* renamed from: im.b$b$a$b, reason: collision with other inner class name */
            static final class C2178b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends MarketingBanner>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f138078a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14743b f138079b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<String> f138080c;

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends MarketingBanner>> continuation) {
                    return invoke2(interfaceC16622O, (Continuation<? super List<MarketingBanner>>) continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2178b(C14743b c14743b, List<String> list, Continuation<? super C2178b> continuation) {
                    super(2, continuation);
                    this.f138079b = c14743b;
                    this.f138080c = list;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2178b(this.f138079b, this.f138080c, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<MarketingBanner>> continuation) {
                    return ((C2178b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f138078a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    C14743b c14743b = this.f138079b;
                    List<String> list = this.f138080c;
                    this.f138078a = 1;
                    Object objF2 = c14743b.f(list, this);
                    if (objF2 == objF) {
                        return objF;
                    }
                    return objF2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14743b c14743b, List<String> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f138074f = c14743b;
                this.f138075g = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f138074f, this.f138075g, continuation);
                aVar.f138073e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MarketingBannersDecorator> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                    int r1 = r13.f138072d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L50
                    if (r1 == r4) goto L3e
                    if (r1 == r3) goto L2e
                    if (r1 != r2) goto L26
                    java.lang.Object r0 = r13.f138071c
                    Sl.a r0 = (Sl.MarketingBannersDecorator) r0
                    java.lang.Object r1 = r13.f138070b
                    qv.W r1 = (qv.W) r1
                    java.lang.Object r1 = r13.f138069a
                    qv.W r1 = (qv.W) r1
                    java.lang.Object r1 = r13.f138073e
                    qv.O r1 = (qv.InterfaceC16622O) r1
                    kotlin.ResultKt.b(r14)
                    goto Lb2
                L26:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L2e:
                    java.lang.Object r1 = r13.f138070b
                    qv.W r1 = (qv.W) r1
                    java.lang.Object r3 = r13.f138069a
                    qv.W r3 = (qv.W) r3
                    java.lang.Object r4 = r13.f138073e
                    qv.O r4 = (qv.InterfaceC16622O) r4
                    kotlin.ResultKt.b(r14)
                    goto L9d
                L3e:
                    java.lang.Object r1 = r13.f138070b
                    qv.W r1 = (qv.W) r1
                    java.lang.Object r4 = r13.f138069a
                    qv.W r4 = (qv.W) r4
                    java.lang.Object r5 = r13.f138073e
                    qv.O r5 = (qv.InterfaceC16622O) r5
                    kotlin.ResultKt.b(r14)
                    r14 = r4
                L4e:
                    r4 = r5
                    goto L8b
                L50:
                    kotlin.ResultKt.b(r14)
                    java.lang.Object r14 = r13.f138073e
                    r5 = r14
                    qv.O r5 = (qv.InterfaceC16622O) r5
                    im.b$b$a$b r8 = new im.b$b$a$b
                    im.b r14 = r13.f138074f
                    java.util.List<java.lang.String> r1 = r13.f138075g
                    r11 = 0
                    r8.<init>(r14, r1, r11)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    qv.W r14 = qv.C16644i.b(r5, r6, r7, r8, r9, r10)
                    im.b$b$a$a r8 = new im.b$b$a$a
                    im.b r1 = r13.f138074f
                    r8.<init>(r1, r11)
                    qv.W r1 = qv.C16644i.b(r5, r6, r7, r8, r9, r10)
                    qv.W[] r6 = new qv.W[r3]
                    r7 = 0
                    r6[r7] = r14
                    r6[r4] = r1
                    r13.f138073e = r5
                    r13.f138069a = r14
                    r13.f138070b = r1
                    r13.f138072d = r4
                    java.lang.Object r4 = qv.C16638f.b(r6, r13)
                    if (r4 != r0) goto L4e
                    goto Laf
                L8b:
                    r13.f138073e = r4
                    r13.f138069a = r14
                    r13.f138070b = r1
                    r13.f138072d = r3
                    java.lang.Object r3 = r1.B(r13)
                    if (r3 != r0) goto L9a
                    goto Laf
                L9a:
                    r12 = r3
                    r3 = r14
                    r14 = r12
                L9d:
                    Sl.a r14 = (Sl.MarketingBannersDecorator) r14
                    r13.f138073e = r4
                    r13.f138069a = r3
                    r13.f138070b = r1
                    r13.f138071c = r14
                    r13.f138072d = r2
                    java.lang.Object r1 = r3.B(r13)
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
                    Sl.a r2 = new Sl.a
                    r2.<init>(r1, r0, r14)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: im.C14743b.C2176b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2176b(List<String> list, Continuation<? super C2176b> continuation) {
            super(2, continuation);
            this.f138068c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14743b.this.new C2176b(this.f138068c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MarketingBannersDecorator> continuation) {
            return ((C2176b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138066a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            a aVar = new a(C14743b.this, this.f138068c, null);
            this.f138066a = 1;
            Object objG = C16623P.g(aVar, this);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LSl/a;", "<anonymous>", "(Lqv/O;)LSl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchCMSBanners$2", f = "MarketingBannerRepository.kt", l = {71, 73, 76, 85}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: im.b$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super MarketingBannersDecorator>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f138081a;

        /* renamed from: b, reason: collision with root package name */
        Object f138082b;

        /* renamed from: c, reason: collision with root package name */
        Object f138083c;

        /* renamed from: d, reason: collision with root package name */
        Object f138084d;

        /* renamed from: e, reason: collision with root package name */
        Object f138085e;

        /* renamed from: f, reason: collision with root package name */
        Object f138086f;

        /* renamed from: g, reason: collision with root package name */
        int f138087g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f138088h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchCMSBanners$2$cmsBanners$1", f = "MarketingBannerRepository.kt", l = {68}, m = "invokeSuspend")
        /* renamed from: im.b$c$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super HomeCMSBannerResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f138090a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14743b f138091b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C14743b c14743b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f138091b = c14743b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f138091b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super HomeCMSBannerResponse> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f138090a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                e eVar = this.f138091b.cmsContentDataSource;
                e.a.C0791a c0791a = e.a.C0791a.f36106a;
                this.f138090a = 1;
                Object objC = eVar.c(c0791a, this);
                if (objC == objF) {
                    return objF;
                }
                return objC;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchCMSBanners$2$specialOffer$1", f = "MarketingBannerRepository.kt", l = {70}, m = "invokeSuspend")
        /* renamed from: im.b$c$b, reason: collision with other inner class name */
        static final class C2179b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super HomeCMSBannerResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f138092a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14743b f138093b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2179b(C14743b c14743b, Continuation<? super C2179b> continuation) {
                super(2, continuation);
                this.f138093b = c14743b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2179b(this.f138093b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super HomeCMSBannerResponse> continuation) {
                return ((C2179b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f138092a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Yl.e eVar = this.f138093b.cmsContentDataSource;
                e.a.b bVar = e.a.b.f36107a;
                this.f138092a = 1;
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
            c cVar = C14743b.this.new c(continuation);
            cVar.f138088h = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super MarketingBannersDecorator> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
            throw new UnsupportedOperationException("Method not decompiled: im.C14743b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LUl/i;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.repositories.MarketingBannerRepository$fetchTargetBanner$2", f = "MarketingBannerRepository.kt", l = {58}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: im.b$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends MarketingBanner>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138094a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f138096c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends MarketingBanner>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<MarketingBanner>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<String> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f138096c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14743b.this.new d(this.f138096c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<MarketingBanner>> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138094a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Nv.b bVar = C14743b.this.targetRepository;
                List<String> list = this.f138096c;
                this.f138094a = 1;
                obj = bVar.b(list, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Collection collectionValues = ((Map) obj).values();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionValues, 10));
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(Pv.a.a((TargetBannerResponse) it.next()));
            }
            return arrayList;
        }
    }

    public C14743b(Nv.b targetRepository, Yl.e cmsContentDataSource, AbstractC16618K ioDispatcher) {
        Intrinsics.j(targetRepository, "targetRepository");
        Intrinsics.j(cmsContentDataSource, "cmsContentDataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.targetRepository = targetRepository;
        this.cmsContentDataSource = cmsContentDataSource;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object d(C14743b c14743b, List list, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = f138062f;
        }
        return c14743b.c(list, continuation);
    }

    public final Object c(List<String> list, Continuation<? super MarketingBannersDecorator> continuation) {
        return C16644i.g(this.ioDispatcher, new C2176b(list, null), continuation);
    }

    public final Object e(Continuation<? super MarketingBannersDecorator> continuation) {
        return C16644i.g(this.ioDispatcher, new c(null), continuation);
    }

    public final Object f(List<String> list, Continuation<? super List<MarketingBanner>> continuation) {
        return C16644i.g(this.ioDispatcher, new d(list, null), continuation);
    }
}

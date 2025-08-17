package Hl;

import Hl.FulfillmentBarDecorator;
import androidx.view.c0;
import androidx.view.d0;
import ej.ShoppingCart;
import hl.InterfaceC14494f;
import ij.FulfillmentSlot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LHl/b;", "Landroidx/lifecycle/c0;", "Lhl/f;", "cartProvider", "Lsl/h;", "timeSlotRepository", "<init>", "(Lhl/f;Lsl/h;)V", "Ltv/B;", "LHl/a;", "a", "Ltv/B;", "_fulfillmentFlow", "Ltv/P;", "b", "Ltv/P;", "n", "()Ltv/P;", "fulfillmentFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class b extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<FulfillmentBarDecorator> _fulfillmentFlow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final P<FulfillmentBarDecorator> fulfillmentFlow;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lej/C;", "", "Lij/c;", "<destruct>", "", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.fulfillment.ux.FulfillmentBarViewModel$3", f = "FulfillmentBarViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<Pair<? extends ShoppingCart, ? extends List<? extends FulfillmentSlot>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f12712a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f12713b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f12713b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair<ShoppingCart, ? extends List<FulfillmentSlot>> pair, Continuation<? super Unit> continuation) {
            return ((a) create(pair, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f12712a == 0) {
                ResultKt.b(obj);
                Pair pair = (Pair) this.f12713b;
                ShoppingCart shoppingCart = (ShoppingCart) pair.a();
                FulfillmentSlot fulfillmentSlotA = ij.d.a((List) pair.b());
                InterfaceC17140B interfaceC17140B = b.this._fulfillmentFlow;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, FulfillmentBarDecorator.Companion.c(FulfillmentBarDecorator.INSTANCE, shoppingCart, null, fulfillmentSlotA, null, false, 26, null)));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Ltv/g;", "Lkotlin/Pair;", "Lej/C;", "", "Lij/c;", "", "error", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.fulfillment.ux.FulfillmentBarViewModel$4", f = "FulfillmentBarViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Hl.b$b, reason: collision with other inner class name */
    static final class C0201b extends SuspendLambda implements Function3<InterfaceC17153g<? super Pair<? extends ShoppingCart, ? extends List<? extends FulfillmentSlot>>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f12715a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f12716b;

        C0201b(Continuation<? super C0201b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Pair<ShoppingCart, ? extends List<FulfillmentSlot>>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            C0201b c0201b = new C0201b(continuation);
            c0201b.f12716b = th2;
            return c0201b.invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r3.f12715a
                if (r0 != 0) goto L4d
                kotlin.ResultKt.b(r4)
                java.lang.Object r4 = r3.f12716b
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                boolean r0 = r4 instanceof com.meijer.mobile.core.networking.exceptions.RetrofitException
                if (r0 == 0) goto L3b
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                r1 = 400(0x190, float:5.6E-43)
                r2 = 499(0x1f3, float:6.99E-43)
                r0.<init>(r1, r2)
                r1 = r4
                com.meijer.mobile.core.networking.exceptions.RetrofitException r1 = (com.meijer.mobile.core.networking.exceptions.RetrofitException) r1
                retrofit2.Response r1 = r1.d()
                if (r1 == 0) goto L2d
                int r1 = r1.code()
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.d(r1)
                goto L2e
            L2d:
                r1 = 0
            L2e:
                if (r1 == 0) goto L3b
                int r1 = r1.intValue()
                boolean r0 = r0.p(r1)
                if (r0 == 0) goto L3b
                goto L4a
            L3b:
                boolean r0 = r4 instanceof android.security.keystore.UserNotAuthenticatedException
                if (r0 == 0) goto L40
                goto L4a
            L40:
                uw.a$a r0 = uw.a.INSTANCE
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "Failure updating fulfillment bar status."
                r0.f(r4, r2, r1)
            L4a:
                kotlin.Unit r4 = kotlin.Unit.f142422a
                return r4
            L4d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Hl.b.C0201b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c implements InterfaceC17152f<tk.c<ShoppingCart>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f12717a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f12718a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.fulfillment.ux.FulfillmentBarViewModel$special$$inlined$filter$1$2", f = "FulfillmentBarViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Hl.b$c$a$a, reason: collision with other inner class name */
            public static final class C0202a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f12719a;

                /* renamed from: b, reason: collision with root package name */
                int f12720b;

                /* renamed from: c, reason: collision with root package name */
                Object f12721c;

                /* renamed from: d, reason: collision with root package name */
                Object f12722d;

                /* renamed from: f, reason: collision with root package name */
                Object f12724f;

                /* renamed from: g, reason: collision with root package name */
                Object f12725g;

                /* renamed from: h, reason: collision with root package name */
                int f12726h;

                public C0202a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f12719a = obj;
                    this.f12720b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f12718a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Hl.b.c.a.C0202a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Hl.b$c$a$a r0 = (Hl.b.c.a.C0202a) r0
                    int r1 = r0.f12720b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12720b = r1
                    goto L18
                L13:
                    Hl.b$c$a$a r0 = new Hl.b$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f12719a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f12720b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f12725g
                    tv.g r5 = (tv.InterfaceC17153g) r5
                    java.lang.Object r5 = r0.f12722d
                    Hl.b$c$a$a r5 = (Hl.b.c.a.C0202a) r5
                    kotlin.ResultKt.b(r6)
                    goto L5b
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    tv.g r6 = r4.f12718a
                    r2 = r5
                    tk.c r2 = (tk.c) r2
                    java.lang.Object r2 = r2.a()
                    if (r2 == 0) goto L5b
                    r0.f12721c = r5
                    r0.f12722d = r0
                    r0.f12724f = r5
                    r0.f12725g = r6
                    r2 = 0
                    r0.f12726h = r2
                    r0.f12720b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Hl.b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC17152f interfaceC17152f) {
            this.f12717a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super tk.c<ShoppingCart>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f12717a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d implements InterfaceC17152f<Pair<? extends ShoppingCart, ? extends List<? extends FulfillmentSlot>>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f12727a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ sl.h f12728b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f12729a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ sl.h f12730b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.fulfillment.ux.FulfillmentBarViewModel$special$$inlined$map$1$2", f = "FulfillmentBarViewModel.kt", l = {51, 50}, m = "emit")
            /* renamed from: Hl.b$d$a$a, reason: collision with other inner class name */
            public static final class C0203a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f12731a;

                /* renamed from: b, reason: collision with root package name */
                int f12732b;

                /* renamed from: c, reason: collision with root package name */
                Object f12733c;

                /* renamed from: e, reason: collision with root package name */
                Object f12735e;

                /* renamed from: f, reason: collision with root package name */
                Object f12736f;

                /* renamed from: g, reason: collision with root package name */
                Object f12737g;

                /* renamed from: h, reason: collision with root package name */
                Object f12738h;

                /* renamed from: i, reason: collision with root package name */
                Object f12739i;

                /* renamed from: j, reason: collision with root package name */
                Object f12740j;

                /* renamed from: k, reason: collision with root package name */
                int f12741k;

                /* renamed from: l, reason: collision with root package name */
                int f12742l;

                public C0203a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f12731a = obj;
                    this.f12732b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, sl.h hVar) {
                this.f12729a = interfaceC17153g;
                this.f12730b = hVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
            
                if (r2.emit(r12, r4) == r0) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                /*
                    Method dump skipped, instructions count: 194
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: Hl.b.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC17152f interfaceC17152f, sl.h hVar) {
            this.f12727a = interfaceC17152f;
            this.f12728b = hVar;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Pair<? extends ShoppingCart, ? extends List<? extends FulfillmentSlot>>> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f12727a.collect(new a(interfaceC17153g, this.f12728b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    public b(InterfaceC14494f cartProvider, sl.h timeSlotRepository) {
        Intrinsics.j(cartProvider, "cartProvider");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        InterfaceC17140B<FulfillmentBarDecorator> interfaceC17140BA = S.a(new FulfillmentBarDecorator(null, null, null, null, null, 0, 0, false, false, null, 1023, null));
        this._fulfillmentFlow = interfaceC17140BA;
        this.fulfillmentFlow = C17154h.c(interfaceC17140BA);
        C17154h.J(C17154h.g(C17154h.O(new d(new c(C17154h.r(cartProvider.d())), timeSlotRepository), new a(null)), new C0201b(null)), d0.a(this));
    }

    public final P<FulfillmentBarDecorator> n() {
        return this.fulfillmentFlow;
    }
}

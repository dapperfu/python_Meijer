package Il;

import Il.FulfillmentBarDecorator;
import androidx.view.c0;
import androidx.view.d0;
import fj.ShoppingCart;
import il.InterfaceC14774f;
import java.util.List;
import jj.FulfillmentSlot;
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
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LIl/b;", "Landroidx/lifecycle/c0;", "Lil/f;", "cartProvider", "Ltl/h;", "timeSlotRepository", "<init>", "(Lil/f;Ltl/h;)V", "Lpv/B;", "LIl/a;", "a", "Lpv/B;", "_fulfillmentFlow", "Lpv/P;", "b", "Lpv/P;", "n", "()Lpv/P;", "fulfillmentFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class b extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<FulfillmentBarDecorator> _fulfillmentFlow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final P<FulfillmentBarDecorator> fulfillmentFlow;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lfj/C;", "", "Ljj/c;", "<destruct>", "", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.fulfillment.ux.FulfillmentBarViewModel$3", f = "FulfillmentBarViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<Pair<? extends ShoppingCart, ? extends List<? extends FulfillmentSlot>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14863a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14864b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f14864b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair<ShoppingCart, ? extends List<FulfillmentSlot>> pair, Continuation<? super Unit> continuation) {
            return ((a) create(pair, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f14863a == 0) {
                ResultKt.b(obj);
                Pair pair = (Pair) this.f14864b;
                ShoppingCart shoppingCart = (ShoppingCart) pair.a();
                FulfillmentSlot fulfillmentSlotA = jj.d.a((List) pair.b());
                InterfaceC16549B interfaceC16549B = b.this._fulfillmentFlow;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, FulfillmentBarDecorator.Companion.c(FulfillmentBarDecorator.INSTANCE, shoppingCart, null, fulfillmentSlotA, null, false, 26, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lpv/g;", "Lkotlin/Pair;", "Lfj/C;", "", "Ljj/c;", "", "error", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.fulfillment.ux.FulfillmentBarViewModel$4", f = "FulfillmentBarViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Il.b$b, reason: collision with other inner class name */
    static final class C0241b extends SuspendLambda implements Function3<InterfaceC16562g<? super Pair<? extends ShoppingCart, ? extends List<? extends FulfillmentSlot>>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14866a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14867b;

        C0241b(Continuation<? super C0241b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Pair<ShoppingCart, ? extends List<FulfillmentSlot>>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C0241b c0241b = new C0241b(continuation);
            c0241b.f14867b = th2;
            return c0241b.invokeSuspend(Unit.f143329a);
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
                int r0 = r3.f14866a
                if (r0 != 0) goto L4d
                kotlin.ResultKt.b(r4)
                java.lang.Object r4 = r3.f14867b
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
                qw.a$a r0 = qw.a.INSTANCE
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "Failure updating fulfillment bar status."
                r0.f(r4, r2, r1)
            L4a:
                kotlin.Unit r4 = kotlin.Unit.f143329a
                return r4
            L4d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Il.b.C0241b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c implements InterfaceC16561f<uk.c<ShoppingCart>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f14868a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f14869a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.fulfillment.ux.FulfillmentBarViewModel$special$$inlined$filter$1$2", f = "FulfillmentBarViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Il.b$c$a$a, reason: collision with other inner class name */
            public static final class C0242a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f14870a;

                /* renamed from: b, reason: collision with root package name */
                int f14871b;

                /* renamed from: c, reason: collision with root package name */
                Object f14872c;

                /* renamed from: d, reason: collision with root package name */
                Object f14873d;

                /* renamed from: f, reason: collision with root package name */
                Object f14875f;

                /* renamed from: g, reason: collision with root package name */
                Object f14876g;

                /* renamed from: h, reason: collision with root package name */
                int f14877h;

                public C0242a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f14870a = obj;
                    this.f14871b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f14869a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Il.b.c.a.C0242a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Il.b$c$a$a r0 = (Il.b.c.a.C0242a) r0
                    int r1 = r0.f14871b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14871b = r1
                    goto L18
                L13:
                    Il.b$c$a$a r0 = new Il.b$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f14870a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f14871b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f14876g
                    pv.g r5 = (pv.InterfaceC16562g) r5
                    java.lang.Object r5 = r0.f14873d
                    Il.b$c$a$a r5 = (Il.b.c.a.C0242a) r5
                    kotlin.ResultKt.b(r6)
                    goto L5b
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f14869a
                    r2 = r5
                    uk.c r2 = (uk.c) r2
                    java.lang.Object r2 = r2.a()
                    if (r2 == 0) goto L5b
                    r0.f14872c = r5
                    r0.f14873d = r0
                    r0.f14875f = r5
                    r0.f14876g = r6
                    r2 = 0
                    r0.f14877h = r2
                    r0.f14871b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Il.b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC16561f interfaceC16561f) {
            this.f14868a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super uk.c<ShoppingCart>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f14868a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d implements InterfaceC16561f<Pair<? extends ShoppingCart, ? extends List<? extends FulfillmentSlot>>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f14878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ tl.h f14879b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f14880a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ tl.h f14881b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.fulfillment.ux.FulfillmentBarViewModel$special$$inlined$map$1$2", f = "FulfillmentBarViewModel.kt", l = {51, 50}, m = "emit")
            /* renamed from: Il.b$d$a$a, reason: collision with other inner class name */
            public static final class C0243a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f14882a;

                /* renamed from: b, reason: collision with root package name */
                int f14883b;

                /* renamed from: c, reason: collision with root package name */
                Object f14884c;

                /* renamed from: e, reason: collision with root package name */
                Object f14886e;

                /* renamed from: f, reason: collision with root package name */
                Object f14887f;

                /* renamed from: g, reason: collision with root package name */
                Object f14888g;

                /* renamed from: h, reason: collision with root package name */
                Object f14889h;

                /* renamed from: i, reason: collision with root package name */
                Object f14890i;

                /* renamed from: j, reason: collision with root package name */
                Object f14891j;

                /* renamed from: k, reason: collision with root package name */
                int f14892k;

                /* renamed from: l, reason: collision with root package name */
                int f14893l;

                public C0243a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f14882a = obj;
                    this.f14883b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, tl.h hVar) {
                this.f14880a = interfaceC16562g;
                this.f14881b = hVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
            
                if (r2.emit(r12, r4) == r0) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                /*
                    Method dump skipped, instructions count: 194
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: Il.b.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC16561f interfaceC16561f, tl.h hVar) {
            this.f14878a = interfaceC16561f;
            this.f14879b = hVar;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super Pair<? extends ShoppingCart, ? extends List<? extends FulfillmentSlot>>> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f14878a.collect(new a(interfaceC16562g, this.f14879b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    public b(InterfaceC14774f cartProvider, tl.h timeSlotRepository) {
        Intrinsics.j(cartProvider, "cartProvider");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        InterfaceC16549B<FulfillmentBarDecorator> interfaceC16549BA = S.a(new FulfillmentBarDecorator(null, null, null, null, null, 0, 0, false, false, null, 1023, null));
        this._fulfillmentFlow = interfaceC16549BA;
        this.fulfillmentFlow = C16563h.c(interfaceC16549BA);
        C16563h.J(C16563h.g(C16563h.O(new d(new c(C16563h.r(cartProvider.c())), timeSlotRepository), new a(null)), new C0241b(null)), d0.a(this));
    }

    public final P<FulfillmentBarDecorator> n() {
        return this.fulfillmentFlow;
    }
}

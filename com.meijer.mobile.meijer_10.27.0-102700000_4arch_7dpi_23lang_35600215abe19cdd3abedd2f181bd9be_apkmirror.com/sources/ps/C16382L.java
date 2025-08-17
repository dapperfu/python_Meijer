package ps;

import ak.AbstractC5607a;
import ci.CustomerAddress;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import ej.DeliveryMode;
import ej.ShoppingCart;
import hl.InterfaceC14494f;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ps.C16382L;
import qv.C16648k;
import qv.InterfaceC16622O;
import tk.c;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import xk.C18066d;
import yl.AbstractC18227f;
import yo.MeijerUser;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\"8\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&¨\u0006."}, d2 = {"Lps/L;", "Landroidx/lifecycle/c0;", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "Lhl/f;", "cartProvider", "Lyl/k;", "featureManager", "<init>", "(Lyo/k;LTq/j;Lhl/f;Lyl/k;)V", "Lej/C;", "Lps/i;", "t", "(Lej/C;)Lps/i;", "", "code", "", "w", "(Ljava/lang/Integer;)V", "a", "Lyo/k;", "b", "LTq/j;", "c", "Lhl/f;", "d", "Lyl/k;", "Ltv/B;", "Lps/F;", "e", "Ltv/B;", "_headerState", "Ltv/P;", "f", "Ltv/P;", "u", "()Ltv/P;", "headerState", "Lps/t;", "g", "_menuState", "h", "v", "menuState", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.L, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16382L extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14494f cartProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<HeaderDecorator> _headerState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final tv.P<HeaderDecorator> headerState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<DrawerLayoutDecorator> _menuState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final tv.P<DrawerLayoutDecorator> menuState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$1", f = "NavigationDrawerViewModel.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: ps.L$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156404a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$a$a, reason: collision with other inner class name */
        static final class C2427a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16382L f156406a;

            C2427a(C16382L c16382l) {
                this.f156406a = c16382l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
                Object value;
                Object value2;
                InterfaceC17140B interfaceC17140B = this.f156406a._headerState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, HeaderDecorator.b((HeaderDecorator) value, meijerUser.getIsLoggedIn(), meijerUser.getFirstName(), false, null, 0, 28, null)));
                InterfaceC17140B interfaceC17140B2 = this.f156406a._menuState;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value2, false, false, meijerUser.getIsLoggedIn(), false, 0, null, null, 123, null)));
                return Unit.f142422a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16382L.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156404a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                tv.P<MeijerUser> pE = C16382L.this.userManager.E();
                C2427a c2427a = new C2427a(C16382L.this);
                this.f156404a = 1;
                if (pE.collect(c2427a, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$2", f = "NavigationDrawerViewModel.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: ps.L$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156407a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$b$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16382L f156409a;

            a(C16382L c16382l) {
                this.f156409a = c16382l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Tq.k kVar, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC17140B interfaceC17140B = this.f156409a._headerState;
                C16382L c16382l = this.f156409a;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, HeaderDecorator.b((HeaderDecorator) value, false, null, c16382l.storeProvider.b() != 0, c16382l.storeProvider.e(), c16382l.storeProvider.b(), 3, null)));
                return Unit.f142422a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16382L.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156407a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                tv.P<Tq.k> pC = C16382L.this.storeProvider.c();
                a aVar = new a(C16382L.this);
                this.f156407a = 1;
                if (pC.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$3", f = "NavigationDrawerViewModel.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: ps.L$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156410a;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltv/g;", "Ltk/c;", "Lej/C;", "kotlin.jvm.PlatformType", "", "error", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$3$1", f = "NavigationDrawerViewModel.kt", l = {HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
        /* renamed from: ps.L$c$a */
        static final class a extends SuspendLambda implements Function3<InterfaceC17153g<? super tk.c<ShoppingCart>>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f156412a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f156413b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f156414c;

            a(Continuation<? super a> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super tk.c<ShoppingCart>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
                a aVar = new a(continuation);
                aVar.f156413b = interfaceC17153g;
                aVar.f156414c = th2;
                return aVar.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f156412a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f156413b;
                    Throwable th2 = (Throwable) this.f156414c;
                    uw.a.INSTANCE.c(th2, "Exception in cart stream for NavigationDrawerViewModel", new Object[0]);
                    c.Failure failure = new c.Failure(null, th2, 1, null);
                    this.f156413b = interfaceC17153g;
                    this.f156414c = th2;
                    this.f156412a = 1;
                    if (interfaceC17153g.emit(failure, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$c$b */
        static final class b<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16382L f156415a;

            /* JADX INFO: Access modifiers changed from: private */
            public static final int g() {
                return 0;
            }

            b(C16382L c16382l) {
                this.f156415a = c16382l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object emit(tk.c<ShoppingCart> cVar, Continuation<? super Unit> continuation) {
                Object value;
                DrawerLayoutDecorator drawerLayoutDecorator;
                ShoppingCart shoppingCartA;
                InterfaceC17140B interfaceC17140B = this.f156415a._menuState;
                C16382L c16382l = this.f156415a;
                do {
                    value = interfaceC17140B.getValue();
                    drawerLayoutDecorator = (DrawerLayoutDecorator) value;
                    shoppingCartA = cVar.a();
                } while (!interfaceC17140B.e(value, DrawerLayoutDecorator.b(drawerLayoutDecorator, false, false, false, false, C18066d.b(shoppingCartA != null ? Boxing.d(shoppingCartA.getTotalItems()) : null, new Function0() { // from class: ps.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(C16382L.c.b.g());
                    }
                }), c16382l.t(cVar.a()), null, 79, null)));
                return Unit.f142422a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16382L.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156410a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fG = C17154h.g(C17154h.r(xv.h.b(C16382L.this.cartProvider.c())), new a(null));
                b bVar = new b(C16382L.this);
                this.f156410a = 1;
                if (interfaceC17152fG.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$4", f = "NavigationDrawerViewModel.kt", l = {113}, m = "invokeSuspend")
    /* renamed from: ps.L$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156416a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$d$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16382L f156418a;

            a(C16382L c16382l) {
                this.f156418a = c16382l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC17140B interfaceC17140B = this.f156418a._menuState;
                do {
                    value = interfaceC17140B.getValue();
                    Intrinsics.g(bool);
                } while (!interfaceC17140B.e(value, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value, bool.booleanValue(), false, false, false, 0, null, null, 126, null)));
                return Unit.f142422a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16382L.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156416a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fB = xv.h.b(C16382L.this.featureManager.f(AbstractC18227f.O.f170554h));
                a aVar = new a(C16382L.this);
                this.f156416a = 1;
                if (interfaceC17152fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$5", f = "NavigationDrawerViewModel.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
    /* renamed from: ps.L$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156419a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$e$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16382L f156421a;

            a(C16382L c16382l) {
                this.f156421a = c16382l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC17140B interfaceC17140B = this.f156421a._menuState;
                do {
                    value = interfaceC17140B.getValue();
                    Intrinsics.g(bool);
                } while (!interfaceC17140B.e(value, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value, false, bool.booleanValue(), false, false, 0, null, null, 125, null)));
                return Unit.f142422a;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16382L.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156419a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fB = xv.h.b(C16382L.this.featureManager.f(AbstractC18227f.H.f170547h));
                a aVar = new a(C16382L.this);
                this.f156419a = 1;
                if (interfaceC17152fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$6", f = "NavigationDrawerViewModel.kt", l = {l3.f92485d}, m = "invokeSuspend")
    /* renamed from: ps.L$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156422a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$f$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16382L f156424a;

            a(C16382L c16382l) {
                this.f156424a = c16382l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC17140B interfaceC17140B = this.f156424a._menuState;
                do {
                    value = interfaceC17140B.getValue();
                    Intrinsics.g(bool);
                } while (!interfaceC17140B.e(value, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value, false, false, false, bool.booleanValue(), 0, null, null, 119, null)));
                return Unit.f142422a;
            }
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16382L.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f156422a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fB = xv.h.b(C16382L.this.featureManager.f(AbstractC18227f.C18238l.f170588h));
                a aVar = new a(C16382L.this);
                this.f156422a = 1;
                if (interfaceC17152fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$setActiveIntentCode$1", f = "NavigationDrawerViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: ps.L$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156425a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f156427c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Integer num, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f156427c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16382L.this.new g(this.f156427c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f156425a == 0) {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = C16382L.this._menuState;
                Integer num = this.f156427c;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value, false, false, false, false, 0, null, num, 63, null)));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawerFulfillmentBarDecorator t(ShoppingCart shoppingCart) {
        DeliveryMode deliveryMode;
        DeliveryMode deliveryMode2;
        if (Intrinsics.e((shoppingCart == null || (deliveryMode2 = shoppingCart.getDeliveryMode()) == null) ? null : deliveryMode2.getCode(), "pickup")) {
            int i10 = Bj.i.f2738f2;
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i11 = Hl.h.f12762J;
            String displayName = shoppingCart.getPointOfService().getDisplayName();
            return new DrawerFulfillmentBarDecorator(i10, companion.d(i11, displayName != null ? displayName : ""));
        }
        if (!Intrinsics.e((shoppingCart == null || (deliveryMode = shoppingCart.getDeliveryMode()) == null) ? null : deliveryMode.getCode(), "delivery") || shoppingCart.getDeliveryAddress() == null) {
            return new DrawerFulfillmentBarDecorator(Bj.i.f2730d2, AbstractC5607a.INSTANCE.d(Hl.h.f12764L, new Object[0]));
        }
        int i12 = Bj.i.f2730d2;
        AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
        int i13 = Hl.h.f12810u;
        CustomerAddress deliveryAddress = shoppingCart.getDeliveryAddress();
        String line1 = deliveryAddress != null ? deliveryAddress.getLine1() : null;
        return new DrawerFulfillmentBarDecorator(i12, companion2.d(i13, line1 != null ? line1 : ""));
    }

    public C16382L(yo.k userManager, Tq.j storeProvider, InterfaceC14494f cartProvider, yl.k featureManager) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(cartProvider, "cartProvider");
        Intrinsics.j(featureManager, "featureManager");
        this.userManager = userManager;
        this.storeProvider = storeProvider;
        this.cartProvider = cartProvider;
        this.featureManager = featureManager;
        InterfaceC17140B<HeaderDecorator> interfaceC17140BA = tv.S.a(new HeaderDecorator(false, "", false, null, 0));
        this._headerState = interfaceC17140BA;
        this.headerState = C17154h.c(interfaceC17140BA);
        InterfaceC17140B<DrawerLayoutDecorator> interfaceC17140BA2 = tv.S.a(new DrawerLayoutDecorator(false, false, false, false, 0, t(null), null));
        this._menuState = interfaceC17140BA2;
        this.menuState = C17154h.c(interfaceC17140BA2);
        C16648k.d(androidx.view.d0.a(this), null, null, new a(null), 3, null);
        C16648k.d(androidx.view.d0.a(this), null, null, new b(null), 3, null);
        C16648k.d(androidx.view.d0.a(this), null, null, new c(null), 3, null);
        C16648k.d(androidx.view.d0.a(this), null, null, new d(null), 3, null);
        C16648k.d(androidx.view.d0.a(this), null, null, new e(null), 3, null);
        C16648k.d(androidx.view.d0.a(this), null, null, new f(null), 3, null);
    }

    public final tv.P<HeaderDecorator> u() {
        return this.headerState;
    }

    public final tv.P<DrawerLayoutDecorator> v() {
        return this.menuState;
    }

    public final void w(Integer code) {
        C16648k.d(androidx.view.d0.a(this), null, null, new g(code, null), 3, null);
    }
}

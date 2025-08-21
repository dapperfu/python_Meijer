package ps;

import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import di.CustomerAddress;
import fj.DeliveryMode;
import fj.ShoppingCart;
import il.InterfaceC14774f;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import ps.C16508L;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import uk.c;
import yk.C18328d;
import yo.MeijerUser;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\"8\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&¨\u0006."}, d2 = {"Lps/L;", "Landroidx/lifecycle/c0;", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "Lil/f;", "cartProvider", "Lzl/k;", "featureManager", "<init>", "(Lyo/k;LTq/j;Lil/f;Lzl/k;)V", "Lfj/C;", "Lps/i;", "t", "(Lfj/C;)Lps/i;", "", "code", "", "w", "(Ljava/lang/Integer;)V", "a", "Lyo/k;", "b", "LTq/j;", "c", "Lil/f;", "d", "Lzl/k;", "Lpv/B;", "Lps/F;", "e", "Lpv/B;", "_headerState", "Lpv/P;", "f", "Lpv/P;", "u", "()Lpv/P;", "headerState", "Lps/t;", "g", "_menuState", "h", "v", "menuState", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.L, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16508L extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14774f cartProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<HeaderDecorator> _headerState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pv.P<HeaderDecorator> headerState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<DrawerLayoutDecorator> _menuState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final pv.P<DrawerLayoutDecorator> menuState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$1", f = "NavigationDrawerViewModel.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: ps.L$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157177a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$a$a, reason: collision with other inner class name */
        static final class C2433a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16508L f157179a;

            C2433a(C16508L c16508l) {
                this.f157179a = c16508l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
                Object value;
                Object value2;
                InterfaceC16549B interfaceC16549B = this.f157179a._headerState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, HeaderDecorator.b((HeaderDecorator) value, meijerUser.getIsLoggedIn(), meijerUser.getFirstName(), false, null, 0, 28, null)));
                InterfaceC16549B interfaceC16549B2 = this.f157179a._menuState;
                do {
                    value2 = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value2, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value2, false, false, meijerUser.getIsLoggedIn(), false, 0, null, null, 123, null)));
                return Unit.f143329a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16508L.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157177a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                pv.P<MeijerUser> pE = C16508L.this.userManager.E();
                C2433a c2433a = new C2433a(C16508L.this);
                this.f157177a = 1;
                if (pE.collect(c2433a, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$2", f = "NavigationDrawerViewModel.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: ps.L$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157180a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$b$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16508L f157182a;

            a(C16508L c16508l) {
                this.f157182a = c16508l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Tq.k kVar, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC16549B interfaceC16549B = this.f157182a._headerState;
                C16508L c16508l = this.f157182a;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, HeaderDecorator.b((HeaderDecorator) value, false, null, c16508l.storeProvider.b() != 0, c16508l.storeProvider.e(), c16508l.storeProvider.b(), 3, null)));
                return Unit.f143329a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16508L.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157180a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                pv.P<Tq.k> pC = C16508L.this.storeProvider.c();
                a aVar = new a(C16508L.this);
                this.f157180a = 1;
                if (pC.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$3", f = "NavigationDrawerViewModel.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: ps.L$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157183a;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpv/g;", "Luk/c;", "Lfj/C;", "kotlin.jvm.PlatformType", "", "error", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$3$1", f = "NavigationDrawerViewModel.kt", l = {HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
        /* renamed from: ps.L$c$a */
        static final class a extends SuspendLambda implements Function3<InterfaceC16562g<? super uk.c<ShoppingCart>>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f157185a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f157186b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f157187c;

            a(Continuation<? super a> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super uk.c<ShoppingCart>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
                a aVar = new a(continuation);
                aVar.f157186b = interfaceC16562g;
                aVar.f157187c = th2;
                return aVar.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f157185a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f157186b;
                    Throwable th2 = (Throwable) this.f157187c;
                    qw.a.INSTANCE.c(th2, "Exception in cart stream for NavigationDrawerViewModel", new Object[0]);
                    c.Failure failure = new c.Failure(null, th2, 1, null);
                    this.f157186b = interfaceC16562g;
                    this.f157187c = th2;
                    this.f157185a = 1;
                    if (interfaceC16562g.emit(failure, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$c$b */
        static final class b<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16508L f157188a;

            /* JADX INFO: Access modifiers changed from: private */
            public static final int g() {
                return 0;
            }

            b(C16508L c16508l) {
                this.f157188a = c16508l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object emit(uk.c<ShoppingCart> cVar, Continuation<? super Unit> continuation) {
                Object value;
                DrawerLayoutDecorator drawerLayoutDecorator;
                ShoppingCart shoppingCartA;
                InterfaceC16549B interfaceC16549B = this.f157188a._menuState;
                C16508L c16508l = this.f157188a;
                do {
                    value = interfaceC16549B.getValue();
                    drawerLayoutDecorator = (DrawerLayoutDecorator) value;
                    shoppingCartA = cVar.a();
                } while (!interfaceC16549B.e(value, DrawerLayoutDecorator.b(drawerLayoutDecorator, false, false, false, false, C18328d.b(shoppingCartA != null ? Boxing.d(shoppingCartA.getTotalItems()) : null, new Function0() { // from class: ps.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(C16508L.c.b.g());
                    }
                }), c16508l.t(cVar.a()), null, 79, null)));
                return Unit.f143329a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16508L.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157183a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fG = C16563h.g(C16563h.r(tv.h.b(C16508L.this.cartProvider.b())), new a(null));
                b bVar = new b(C16508L.this);
                this.f157183a = 1;
                if (interfaceC16561fG.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$4", f = "NavigationDrawerViewModel.kt", l = {113}, m = "invokeSuspend")
    /* renamed from: ps.L$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157189a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$d$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16508L f157191a;

            a(C16508L c16508l) {
                this.f157191a = c16508l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC16549B interfaceC16549B = this.f157191a._menuState;
                do {
                    value = interfaceC16549B.getValue();
                    Intrinsics.g(bool);
                } while (!interfaceC16549B.e(value, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value, bool.booleanValue(), false, false, false, 0, null, null, 126, null)));
                return Unit.f143329a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16508L.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157189a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fB = tv.h.b(C16508L.this.featureManager.f(AbstractC18503f.O.f172854h));
                a aVar = new a(C16508L.this);
                this.f157189a = 1;
                if (interfaceC16561fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$5", f = "NavigationDrawerViewModel.kt", l = {BinsView.TOTE_HEIGHT_DP}, m = "invokeSuspend")
    /* renamed from: ps.L$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157192a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$e$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16508L f157194a;

            a(C16508L c16508l) {
                this.f157194a = c16508l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC16549B interfaceC16549B = this.f157194a._menuState;
                do {
                    value = interfaceC16549B.getValue();
                    Intrinsics.g(bool);
                } while (!interfaceC16549B.e(value, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value, false, bool.booleanValue(), false, false, 0, null, null, 125, null)));
                return Unit.f143329a;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16508L.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157192a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fB = tv.h.b(C16508L.this.featureManager.f(AbstractC18503f.H.f172847h));
                a aVar = new a(C16508L.this);
                this.f157192a = 1;
                if (interfaceC16561fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$6", f = "NavigationDrawerViewModel.kt", l = {l3.f93324d}, m = "invokeSuspend")
    /* renamed from: ps.L$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157195a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ps.L$f$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16508L f157197a;

            a(C16508L c16508l) {
                this.f157197a = c16508l;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC16549B interfaceC16549B = this.f157197a._menuState;
                do {
                    value = interfaceC16549B.getValue();
                    Intrinsics.g(bool);
                } while (!interfaceC16549B.e(value, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value, false, false, false, bool.booleanValue(), 0, null, null, 119, null)));
                return Unit.f143329a;
            }
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16508L.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157195a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fB = tv.h.b(C16508L.this.featureManager.f(AbstractC18503f.C18514l.f172888h));
                a aVar = new a(C16508L.this);
                this.f157195a = 1;
                if (interfaceC16561fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerViewModel$setActiveIntentCode$1", f = "NavigationDrawerViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: ps.L$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f157198a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f157200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Integer num, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f157200c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16508L.this.new g(this.f157200c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f157198a == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = C16508L.this._menuState;
                Integer num = this.f157200c;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, DrawerLayoutDecorator.b((DrawerLayoutDecorator) value, false, false, false, false, 0, null, num, 63, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawerFulfillmentBarDecorator t(ShoppingCart shoppingCart) {
        DeliveryMode deliveryMode;
        DeliveryMode deliveryMode2;
        if (Intrinsics.e((shoppingCart == null || (deliveryMode2 = shoppingCart.getDeliveryMode()) == null) ? null : deliveryMode2.getCode(), "pickup")) {
            int i10 = Cj.i.f4783f2;
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i11 = Il.h.f14913J;
            String displayName = shoppingCart.getPointOfService().getDisplayName();
            return new DrawerFulfillmentBarDecorator(i10, companion.d(i11, displayName != null ? displayName : ""));
        }
        if (!Intrinsics.e((shoppingCart == null || (deliveryMode = shoppingCart.getDeliveryMode()) == null) ? null : deliveryMode.getCode(), "delivery") || shoppingCart.getDeliveryAddress() == null) {
            return new DrawerFulfillmentBarDecorator(Cj.i.f4775d2, AbstractC6392a.INSTANCE.d(Il.h.f14915L, new Object[0]));
        }
        int i12 = Cj.i.f4775d2;
        AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
        int i13 = Il.h.f14961u;
        CustomerAddress deliveryAddress = shoppingCart.getDeliveryAddress();
        String line1 = deliveryAddress != null ? deliveryAddress.getLine1() : null;
        return new DrawerFulfillmentBarDecorator(i12, companion2.d(i13, line1 != null ? line1 : ""));
    }

    public C16508L(yo.k userManager, Tq.j storeProvider, InterfaceC14774f cartProvider, zl.k featureManager) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(cartProvider, "cartProvider");
        Intrinsics.j(featureManager, "featureManager");
        this.userManager = userManager;
        this.storeProvider = storeProvider;
        this.cartProvider = cartProvider;
        this.featureManager = featureManager;
        InterfaceC16549B<HeaderDecorator> interfaceC16549BA = pv.S.a(new HeaderDecorator(false, "", false, null, 0));
        this._headerState = interfaceC16549BA;
        this.headerState = C16563h.c(interfaceC16549BA);
        InterfaceC16549B<DrawerLayoutDecorator> interfaceC16549BA2 = pv.S.a(new DrawerLayoutDecorator(false, false, false, false, 0, t(null), null));
        this._menuState = interfaceC16549BA2;
        this.menuState = C16563h.c(interfaceC16549BA2);
        C15809k.d(androidx.view.d0.a(this), null, null, new a(null), 3, null);
        C15809k.d(androidx.view.d0.a(this), null, null, new b(null), 3, null);
        C15809k.d(androidx.view.d0.a(this), null, null, new c(null), 3, null);
        C15809k.d(androidx.view.d0.a(this), null, null, new d(null), 3, null);
        C15809k.d(androidx.view.d0.a(this), null, null, new e(null), 3, null);
        C15809k.d(androidx.view.d0.a(this), null, null, new f(null), 3, null);
    }

    public final pv.P<HeaderDecorator> u() {
        return this.headerState;
    }

    public final pv.P<DrawerLayoutDecorator> v() {
        return this.menuState;
    }

    public final void w(Integer code) {
        C15809k.d(androidx.view.d0.a(this), null, null, new g(code, null), 3, null);
    }
}

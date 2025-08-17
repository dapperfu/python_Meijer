package com.meijer.mobile.meijer;

import com.fullstory.FS;
import com.fullstory.FSOnReadyListener;
import ej.ShoppingCart;
import hl.InterfaceC14494f;
import iv.C14764a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.F0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17153g;
import uw.a;
import yo.MeijerUser;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010$\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\u001bR\u0018\u0010;\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/meijer/mobile/meijer/p;", "Luw/a$b;", "Lyo/k;", "userManager", "Lhl/f;", "cartInfo", "LTq/j;", "storeProvider", "Lqv/O;", "coroutineScope", "<init>", "(Lyo/k;Lhl/f;LTq/j;Lqv/O;)V", "", "J", "()V", "LNu/b;", "N", "()LNu/b;", "X", "Lyo/c;", "user", "I", "(Lyo/c;)V", "a0", "b0", "Lcom/fullstory/FSOnReadyListener;", "listener", "Z", "(Lcom/fullstory/FSOnReadyListener;)V", "", "priority", "", "tag", "message", "", "t", "o", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "Lyo/k;", "c", "Lhl/f;", "d", "LTq/j;", "e", "Lqv/O;", "LNu/a;", "f", "LNu/a;", "disposables", "Lqv/C0;", "g", "Lqv/C0;", "storeInfoJob", "", "h", "isStarted", "i", "LNu/b;", "cartSubscription", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12560p extends a.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14494f cartInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C0 storeInfoJob;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isStarted;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Nu.b cartSubscription;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.p$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        a(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LTq/k;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.FullStoryManager$observeStoreInfo$3", f = "FullStoryManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.p$c */
    static final class c extends SuspendLambda implements Function3<InterfaceC17153g<? super Tq.k>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112902a;

        c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Tq.k> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            return new c(continuation).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112902a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.a("FullStoryManager is no longer user's active store.", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final synchronized Nu.b N() {
        Nu.b bVarSubscribe;
        io.reactivex.l<tk.c<ShoppingCart>> lVarDoOnDispose = this.cartInfo.c().subscribeOn(C14764a.b()).doOnDispose(new Pu.a() { // from class: com.meijer.mobile.meijer.j
            @Override // Pu.a
            public final void run() {
                C12560p.R();
            }
        });
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12560p.S((Nu.b) obj);
            }
        };
        io.reactivex.l<tk.c<ShoppingCart>> lVarDoOnSubscribe = lVarDoOnDispose.doOnSubscribe(new Pu.g() { // from class: com.meijer.mobile.meijer.l
            @Override // Pu.g
            public final void accept(Object obj) {
                C12560p.T(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12560p.U((tk.c) obj);
            }
        };
        io.reactivex.l lVarDistinctUntilChanged = lVarDoOnSubscribe.map(new Pu.o() { // from class: com.meijer.mobile.meijer.n
            @Override // Pu.o
            public final Object apply(Object obj) {
                return C12560p.V(function12, obj);
            }
        }).onErrorReturnItem("-1").distinctUntilChanged();
        final Function1 function13 = new Function1() { // from class: com.meijer.mobile.meijer.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12560p.W((String) obj);
            }
        };
        Pu.g gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.d
            @Override // Pu.g
            public final void accept(Object obj) {
                C12560p.O(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: com.meijer.mobile.meijer.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12560p.P((Throwable) obj);
            }
        };
        bVarSubscribe = lVarDistinctUntilChanged.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.f
            @Override // Pu.g
            public final void accept(Object obj) {
                C12560p.Q(function14, obj);
            }
        });
        Intrinsics.i(bVarSubscribe, "subscribe(...)");
        return bVarSubscribe;
    }

    private final synchronized void X() {
        C0 c02 = this.storeInfoJob;
        if (c02 == null || !c02.a()) {
            this.storeInfoJob = C17154h.J(C17154h.O(C17154h.N(C17154h.P(C17154h.t(this.storeProvider.c(), new Function1() { // from class: com.meijer.mobile.meijer.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(C12560p.Y((Tq.k) obj));
                }
            }), new b(null)), new c(null)), new d(null)), this.coroutineScope);
        }
    }

    public final synchronized void a0() {
        try {
            if (this.isStarted) {
                return;
            }
            a.Companion companion = uw.a.INSTANCE;
            companion.a("Starting FullStoryManager...", new Object[0]);
            FS.restart();
            if (!companion.v().contains(this)) {
                companion.w(this);
            }
            J();
            X();
            this.isStarted = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b0() {
        try {
            FS.shutdown();
            this.disposables.d();
            C0 c02 = this.storeInfoJob;
            if (c02 != null && c02.a()) {
                F0.f(c02, "FullStory tracking has been disabled.", null, 2, null);
            }
            this.storeInfoJob = null;
            Nu.b bVar = this.cartSubscription;
            if (bVar != null) {
                if (bVar.isDisposed()) {
                    bVar = null;
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
            this.cartSubscription = null;
            a.Companion companion = uw.a.INSTANCE;
            if (companion.v().contains(this)) {
                companion.y(this);
            }
            this.isStarted = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/g;", "LTq/k;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.FullStoryManager$observeStoreInfo$2", f = "FullStoryManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.p$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Tq.k>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112901a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Tq.k> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112901a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.a("FullStoryManager is now observing user's active store.", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTq/k;", "storeInfo", "", "<anonymous>", "(LTq/k;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.FullStoryManager$observeStoreInfo$4", f = "FullStoryManager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.p$d */
    static final class d extends SuspendLambda implements Function2<Tq.k, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112903a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f112904b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(continuation);
            dVar.f112904b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Tq.k kVar, Continuation<? super Unit> continuation) {
            return ((d) create(kVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112903a == 0) {
                ResultKt.b(obj);
                Tq.k kVar = (Tq.k) this.f112904b;
                uw.a.INSTANCE.a("FullStoryManager received store " + kVar + " for userVars", new Object[0]);
                FS.setUserVars(MapsKt.g(TuplesKt.a("storeNumber", Boxing.d(kVar.getStoreId()))));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C12560p(yo.k userManager, InterfaceC14494f cartInfo, Tq.j storeProvider, InterfaceC16622O coroutineScope) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(cartInfo, "cartInfo");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.userManager = userManager;
        this.cartInfo = cartInfo;
        this.storeProvider = storeProvider;
        this.coroutineScope = coroutineScope;
        this.disposables = new Nu.a();
    }

    private final void J() {
        io.reactivex.l<MeijerUser> lVarDistinctUntilChanged = this.userManager.F().distinctUntilChanged();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12560p.K(this.f112886a, (MeijerUser) obj);
            }
        };
        Pu.g<? super MeijerUser> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.g
            @Override // Pu.g
            public final void accept(Object obj) {
                C12560p.L(function1, obj);
            }
        };
        final a aVar = new a(uw.a.INSTANCE);
        Ck.a.a(lVarDistinctUntilChanged.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.h
            @Override // Pu.g
            public final void accept(Object obj) {
                C12560p.M(aVar, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(C12560p c12560p, MeijerUser meijerUser) {
        uw.a.INSTANCE.a("FullStoryManager received user " + meijerUser, new Object[0]);
        if (meijerUser.getIsLoggedIn()) {
            Intrinsics.g(meijerUser);
            c12560p.I(meijerUser);
            Nu.b bVar = c12560p.cartSubscription;
            if (bVar == null || (bVar != null && bVar.isDisposed())) {
                c12560p.cartSubscription = c12560p.N();
            }
        } else {
            FS.anonymize();
            Nu.b bVar2 = c12560p.cartSubscription;
            if (bVar2 != null) {
                if (bVar2.isDisposed()) {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    bVar2.dispose();
                }
            }
            c12560p.cartSubscription = null;
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(Throwable th2) {
        uw.a.INSTANCE.f(th2, "Error loading cart stream for FullStoryManager", new Object[0]);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R() {
        uw.a.INSTANCE.a("FullStoryManager is no longer observing cart state.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Nu.b bVar) {
        uw.a.INSTANCE.a("FullStoryManager is now observing cart state.", new Object[0]);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String U(tk.c it) {
        String code;
        Intrinsics.j(it, "it");
        ShoppingCart shoppingCart = (ShoppingCart) it.a();
        return (shoppingCart == null || (code = shoppingCart.getCode()) == null) ? "-1" : code;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String V(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (String) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(String str) {
        uw.a.INSTANCE.a("Setting CartID for FullStoryManager: " + str, new Object[0]);
        FS.setUserVars(MapsKt.g(TuplesKt.a("CartID", str)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Y(Tq.k it) {
        Intrinsics.j(it, "it");
        return it.getStoreId();
    }

    public final void Z(FSOnReadyListener listener) {
        Intrinsics.j(listener, "listener");
        FS.setReadyListener(listener);
    }

    @Override // uw.a.b
    protected void o(int priority, String tag, String message, Throwable t10) {
        Intrinsics.j(message, "message");
        if (priority == 2 || priority == 3) {
            return;
        }
        if (priority == 4) {
            FS.log(FS.LogLevel.INFO, message);
        } else if (priority == 5) {
            FS.log(FS.LogLevel.WARN, message);
        } else {
            if (priority != 6) {
                return;
            }
            FS.log(FS.LogLevel.ERROR, message);
        }
    }

    private final void I(MeijerUser user) {
        FS.identify(user.getExternalShopperId(), MapsKt.o(TuplesKt.a("displayName", user.getFirstName() + ' ' + user.getLastName()), TuplesKt.a("email", user.getEmail()), TuplesKt.a("mPerksVersion", user.getMPerksVersion())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}

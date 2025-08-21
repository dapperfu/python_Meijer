package com.meijer.mobile.shoppinglist.activity;

import Bl.g;
import Bq.a;
import Cq.E;
import Cq.X;
import Cq.m0;
import Ki.K;
import Ki.LocalThemeScope;
import Pq.h;
import Qj.m;
import Tq.j;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.C6034t0;
import androidx.view.ComponentActivity;
import androidx.view.L;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.r;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import e.C13737e;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import h.i;
import ii.C14756c;
import ii.TrackingData;
import j0.InterfaceC14894O;
import j0.W;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C18029o1;
import kotlin.EnumC18023m1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;
import nk.l;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import yr.C18370z;
import zl.AbstractC18503f;
import zl.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u0003R\u001b\u0010!\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/shoppinglist/activity/ShoppingListActivity;", "Lcom/meijer/mobile/shoppinglist/di/ShoppingListFeatureActivity;", "<init>", "()V", "", "previousTrackAction", "", "H1", "(Ljava/lang/String;)V", "", "errorResId", "y0", "(I)V", "LPq/h$g;", "event", "Lx0/o1;", "snackbarHostState", "D1", "(LPq/h$g;Lx0/o1;)V", "LCq/X;", "request", "F1", "(LCq/X;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "LPq/h;", "A", "Lkotlin/Lazy;", "C1", "()LPq/h;", "viewModel", "LTq/j;", "B", "LTq/j;", "B1", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "LDl/e;", "C", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lg/c;", "Landroid/content/Intent;", "D", "Lg/c;", "scannerResultLauncher", "E", "a", "LPq/h$h;", "viewState", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ShoppingListActivity extends Hilt_ShoppingListActivity {

    /* renamed from: F, reason: collision with root package name */
    public static final int f117981F = 8;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public j storeProvider;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(h.class), new e(this), new d(this), new f(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> scannerResultLauncher = registerForActivityResult(new i(), new InterfaceC14275b() { // from class: com.meijer.mobile.shoppinglist.activity.a
        @Override // g.InterfaceC14275b
        public final void a(Object obj) {
            ShoppingListActivity.G1(this.f118005a, (C14274a) obj);
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.activity.ShoppingListActivity$handleEvent$2", f = "ShoppingListActivity.kt", l = {207}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117986a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18029o1 f117987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShoppingListActivity f117988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h.AbstractC4614g f117989d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f117987b, this.f117988c, this.f117989d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C18029o1 c18029o1, ShoppingListActivity shoppingListActivity, h.AbstractC4614g abstractC4614g, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f117987b = c18029o1;
            this.f117988c = shoppingListActivity;
            this.f117989d = abstractC4614g;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f117986a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18029o1 c18029o1 = this.f117987b;
                String string = this.f117988c.getString(((h.AbstractC4614g.ShowSnackbarFailureAlert) this.f117989d).getMessageResId());
                Intrinsics.i(string, "getString(...)");
                EnumC18023m1 enumC18023m1 = EnumC18023m1.f169431b;
                this.f117986a = 1;
                if (C18029o1.e(c18029o1, string, null, enumC18023m1, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ShoppingListActivity f117991a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17993c1 f117992b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<h.ShoppingListState> f117993c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.shoppinglist.activity.ShoppingListActivity$c$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1898a extends FunctionReferenceImpl implements Function1<X, Unit> {
                C1898a(Object obj) {
                    super(1, obj, ShoppingListActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/shoppinglist/compose/ShoppingListNavigationRequest;)V", 0);
                }

                public final void a(X p02) {
                    Intrinsics.j(p02, "p0");
                    ((ShoppingListActivity) this.receiver).F1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(X x10) {
                    a(x10);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<h.AbstractC4612e, Unit> {
                b(Object obj) {
                    super(1, obj, h.class, "onAction", "onAction(Lcom/meijer/mobile/shoppinglist/viewmodel/ShoppingListViewModel$Action;)V", 0);
                }

                public final void a(h.AbstractC4612e p02) {
                    Intrinsics.j(p02, "p0");
                    ((h) this.receiver).W(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(h.AbstractC4612e abstractC4612e) {
                    a(abstractC4612e);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.shoppinglist.activity.ShoppingListActivity$c$a$c, reason: collision with other inner class name */
            /* synthetic */ class C1899c extends FunctionReferenceImpl implements Function1<X, Unit> {
                C1899c(Object obj) {
                    super(1, obj, ShoppingListActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/shoppinglist/compose/ShoppingListNavigationRequest;)V", 0);
                }

                public final void a(X p02) {
                    Intrinsics.j(p02, "p0");
                    ((ShoppingListActivity) this.receiver).F1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(X x10) {
                    a(x10);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Bq.a, Unit> {
                d(Object obj) {
                    super(1, obj, h.class, "onShoppingListItemAction", "onShoppingListItemAction(Lcom/meijer/mobile/shoppinglist/action/ShoppingListItemAction;)V", 0);
                }

                public final void a(Bq.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((h) this.receiver).b0(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Bq.a aVar) {
                    a(aVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Bq.b, Unit> {
                e(Object obj) {
                    super(1, obj, h.class, "onShoppingListSearchAction", "onShoppingListSearchAction(Lcom/meijer/mobile/shoppinglist/action/ShoppingListSearchAction;)V", 0);
                }

                public final void a(Bq.b p02) {
                    Intrinsics.j(p02, "p0");
                    ((h) this.receiver).e0(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Bq.b bVar) {
                    a(bVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.shoppinglist.activity.ShoppingListActivity$onCreate$1$1$6$1", f = "ShoppingListActivity.kt", l = {139}, m = "invokeSuspend")
            static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f117994a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ShoppingListActivity f117995b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17993c1 f117996c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPq/h$g;", "it", "", "<anonymous>", "(LPq/h$g;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.shoppinglist.activity.ShoppingListActivity$onCreate$1$1$6$1$1", f = "ShoppingListActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.shoppinglist.activity.ShoppingListActivity$c$a$f$a, reason: collision with other inner class name */
                static final class C1900a extends SuspendLambda implements Function2<h.AbstractC4614g, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f117997a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f117998b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ ShoppingListActivity f117999c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C17993c1 f118000d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1900a c1900a = new C1900a(this.f117999c, this.f118000d, continuation);
                        c1900a.f117998b = obj;
                        return c1900a;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1900a(ShoppingListActivity shoppingListActivity, C17993c1 c17993c1, Continuation<? super C1900a> continuation) {
                        super(2, continuation);
                        this.f117999c = shoppingListActivity;
                        this.f118000d = c17993c1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(h.AbstractC4614g abstractC4614g, Continuation<? super Unit> continuation) {
                        return ((C1900a) create(abstractC4614g, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f117997a == 0) {
                            ResultKt.b(obj);
                            this.f117999c.D1((h.AbstractC4614g) this.f117998b, this.f118000d.getSnackbarHostState());
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new f(this.f117995b, this.f117996c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(ShoppingListActivity shoppingListActivity, C17993c1 c17993c1, Continuation<? super f> continuation) {
                    super(2, continuation);
                    this.f117995b = shoppingListActivity;
                    this.f117996c = c17993c1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f117994a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16561f interfaceC16561fO = C16563h.O(this.f117995b.C1().getEvents(), new C1900a(this.f117995b, this.f117996c, null));
                        this.f117994a = 1;
                        if (C16563h.j(interfaceC16561fO, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(ShoppingListActivity shoppingListActivity, C17993c1 c17993c1, z1<h.ShoppingListState> z1Var) {
                this.f117991a = shoppingListActivity;
                this.f117992b = c17993c1;
                this.f117993c = z1Var;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Composer composer2 = composer;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer2.V(AdsTheme) : composer2.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer2.j()) {
                    composer2.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1145850487, i11, -1, "com.meijer.mobile.shoppinglist.activity.ShoppingListActivity.onCreate.<anonymous>.<anonymous> (ShoppingListActivity.kt:114)");
                }
                if (this.f117991a.t1().b()) {
                    composer2.startReplaceGroup(368577929);
                    Modifier modifierC = C18370z.c(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, 1, null);
                    h.ShoppingListState shoppingListStateC = c.c(this.f117993c);
                    k kVarS1 = this.f117991a.s1();
                    h hVarC1 = this.f117991a.C1();
                    composer2.startReplaceGroup(5004770);
                    boolean zD = composer2.D(hVarC1);
                    Object objB = composer2.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new b(hVarC1);
                        composer2.t(objB);
                    }
                    KFunction kFunction = (KFunction) objB;
                    composer2.P();
                    ShoppingListActivity shoppingListActivity = this.f117991a;
                    composer2.startReplaceGroup(5004770);
                    boolean zD2 = composer2.D(shoppingListActivity);
                    Object objB2 = composer2.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new C1899c(shoppingListActivity);
                        composer2.t(objB2);
                    }
                    KFunction kFunction2 = (KFunction) objB2;
                    composer2.P();
                    h hVarC12 = this.f117991a.C1();
                    composer2.startReplaceGroup(5004770);
                    boolean zD3 = composer2.D(hVarC12);
                    Object objB3 = composer2.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new d(hVarC12);
                        composer2.t(objB3);
                    }
                    KFunction kFunction3 = (KFunction) objB3;
                    composer2.P();
                    h hVarC13 = this.f117991a.C1();
                    composer2.startReplaceGroup(5004770);
                    boolean zD4 = composer2.D(hVarC13);
                    Object objB4 = composer2.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new e(hVarC13);
                        composer2.t(objB4);
                    }
                    composer2.P();
                    E.b(AdsTheme, this.f117992b, shoppingListStateC, kVarS1, modifierC, (Function1) kFunction, (Function1) kFunction2, (Function1) kFunction3, (Function1) ((KFunction) objB4), composer2, (i11 & 14) | LocalThemeScope.f17314g, 0);
                    composer2 = composer2;
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(368267154);
                    Modifier modifierC2 = C18370z.c(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, 1, null);
                    ShoppingListActivity shoppingListActivity2 = this.f117991a;
                    composer2.startReplaceGroup(5004770);
                    boolean zD5 = composer2.D(shoppingListActivity2);
                    Object objB5 = composer2.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new C1898a(shoppingListActivity2);
                        composer2.t(objB5);
                    }
                    composer2.P();
                    m0.e(AdsTheme, modifierC2, (Function1) ((KFunction) objB5), composer2, LocalThemeScope.f17314g | (i11 & 14), 0);
                    composer2.P();
                }
                InterfaceC16553F<h.AbstractC4614g> events = this.f117991a.C1().getEvents();
                composer2.startReplaceGroup(-1633490746);
                boolean zD6 = composer2.D(this.f117991a) | composer2.V(this.f117992b);
                ShoppingListActivity shoppingListActivity3 = this.f117991a;
                C17993c1 c17993c1 = this.f117992b;
                Object objB6 = composer2.B();
                if (zD6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new f(shoppingListActivity3, c17993c1, null);
                    composer2.t(objB6);
                }
                composer2.P();
                J.g(events, (Function2) objB6, composer2, 0);
                if (!W.f(InterfaceC14894O.INSTANCE, composer2, 6)) {
                    InterfaceC5914o.l((InterfaceC5914o) composer2.o(C6034t0.h()), false, 1, null);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(884734264, i10, -1, "com.meijer.mobile.shoppinglist.activity.ShoppingListActivity.onCreate.<anonymous> (ShoppingListActivity.kt:109)");
            }
            K.b(null, ComposableLambdaKt.c(-1145850487, true, new a(ShoppingListActivity.this, C17987a1.g(null, null, composer, 0, 3), o1.b(ShoppingListActivity.this.C1().V(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.ShoppingListState c(z1<h.ShoppingListState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118001f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f118001f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f118001f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118002f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f118002f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f118002f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f118003f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f118004g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f118003f = function0;
            this.f118004g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f118003f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f118004g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(h.AbstractC4614g event, C18029o1 snackbarHostState) {
        if (event instanceof h.AbstractC4614g.f) {
            y0(Aq.b.f1996t);
            return;
        }
        if (event instanceof h.AbstractC4614g.C0485g) {
            if (B1().d()) {
                this.scannerResultLauncher.a(Bl.h.k(this, false, true, s1().e(AbstractC18503f.L.f172851h)));
                return;
            } else {
                new Cl.a(this).g();
                return;
            }
        }
        if (event instanceof h.AbstractC4614g.d) {
            new m(this, Aq.b.f1964L, new String[0]).E(new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.shoppinglist.activity.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ShoppingListActivity.E1(this.f118007a, dialogInterface, i10);
                }
            }).g();
            return;
        }
        if (event instanceof h.AbstractC4614g.ShowSnackbarFailureAlert) {
            C15809k.d(C15784P.a(C15800f0.c()), null, null, new b(snackbarHostState, this, event, null), 3, null);
            return;
        }
        if (event instanceof h.AbstractC4614g.ShareShoppingList) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            String strH = t1().h();
            if (!StringsKt.s0(strH)) {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{strH});
            }
            intent.putExtra("android.intent.extra.SUBJECT", getString(Aq.b.f1970R));
            intent.putExtra("android.intent.extra.TEXT", ((h.AbstractC4614g.ShareShoppingList) event).getShoppingList());
            startActivity(Intent.createChooser(intent, getString(Aq.b.f1971S)));
            return;
        }
        if (event instanceof h.AbstractC4614g.ViewProductDetails) {
            startActivity(g.t(getFeatureEntryPoint(), ((h.AbstractC4614g.ViewProductDetails) event).getProductId(), false, false, "product in shopping list", 4, null));
            return;
        }
        if (event instanceof h.AbstractC4614g.ProductSearch) {
            if (s1().e(AbstractC18503f.t0.f172905h)) {
                startActivity(Bl.h.c(this, Pp.b.f26238a, null, ((h.AbstractC4614g.ProductSearch) event).getItem().getItemDescription(), false, null, 52, null));
                return;
            } else {
                startActivity(Bl.h.g(this, Pp.b.f26238a, null, ((h.AbstractC4614g.ProductSearch) event).getItem().getItemDescription(), false, null, 52, null));
                return;
            }
        }
        if (event instanceof h.AbstractC4614g.ViewCouponDetails) {
            startActivity(getMeijerIntent().h(new l.Coupon(((h.AbstractC4614g.ViewCouponDetails) event).getCoupon())));
        } else if (event instanceof h.AbstractC4614g.ViewWeeklyAd) {
            startActivity(g.D(getFeatureEntryPoint(), ((h.AbstractC4614g.ViewWeeklyAd) event).getListingId(), 0, null, null, 14, null));
        } else {
            if (!(event instanceof h.AbstractC4614g.ShowAlertError)) {
                throw new NoWhenBranchMatchedException();
            }
            y0(((h.AbstractC4614g.ShowAlertError) event).getErrorResId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(X request) {
        if (Intrinsics.e(request, X.a.f5598a)) {
            startActivity(Bl.f.f3124a.a(this, s1().e(AbstractC18503f.h0.f172881h)));
        } else if (Intrinsics.e(request, X.c.f5600a)) {
            startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
        } else {
            if (!Intrinsics.e(request, X.b.f5599a)) {
                throw new NoWhenBranchMatchedException();
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G1(com.meijer.mobile.shoppinglist.activity.ShoppingListActivity r3, g.C14274a r4) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            Pq.h r3 = r3.C1()
            android.content.Intent r4 = r4.getData()
            if (r4 == 0) goto L4b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            java.lang.String r2 = "scanned_items"
            if (r0 < r1) goto L1e
            java.lang.Class<Co.h> r0 = Co.ProductFullDetails.class
            java.util.ArrayList r4 = com.meijer.mobile.coupon.list.C11735b.a(r4, r2, r0)
            goto L22
        L1e:
            java.util.ArrayList r4 = r4.getParcelableArrayListExtra(r2)
        L22:
            if (r4 == 0) goto L4b
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.x(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r4.next()
            Co.h r1 = (Co.ProductFullDetails) r1
            int r2 = r1.getQuantity()
            Fq.c r1 = Fq.d.g(r1, r2)
            r0.add(r1)
            goto L33
        L4b:
            r0 = 0
        L4c:
            if (r0 != 0) goto L52
            java.util.List r0 = kotlin.collections.CollectionsKt.m()
        L52:
            Bq.a$b r4 = new Bq.a$b
            r4.<init>(r0)
            r3.b0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.shoppinglist.activity.ShoppingListActivity.G1(com.meijer.mobile.shoppinglist.activity.ShoppingListActivity, g.a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("shopping list");
        track.p(str);
        return Unit.f143329a;
    }

    private final void y0(int errorResId) {
        if (errorResId != 0) {
            new Qj.j(this, errorResId, new Object[0]).g();
        }
    }

    public final j B1() {
        j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.x("storeProvider");
        return null;
    }

    public final h C1() {
        return (h) this.viewModel.getValue();
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(ShoppingListActivity shoppingListActivity, DialogInterface dialogInterface, int i10) {
        shoppingListActivity.C1().b0(a.f.f3629a);
    }

    private final void H1(final String previousTrackAction) {
        getAnalyticsEngine().b(C14756c.h("Shopping List"), new Function1() { // from class: com.meijer.mobile.shoppinglist.activity.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShoppingListActivity.I1(previousTrackAction, (TrackingData) obj);
            }
        });
    }

    @Override // com.meijer.mobile.shoppinglist.di.Hilt_ShoppingListFeatureActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        getLifecycle().a(C1());
        r.b(this, L.INSTANCE.c(0), null, 2, null);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(884734264, true, new c()), 1, null);
        if (getIntent().hasExtra("com.meijer.intent.extra.FROM_NAV_MENU")) {
            stringExtra = "hamburger menu";
        } else {
            stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_PREVIOUS_TRACK_ACTION");
        }
        H1(stringExtra);
    }

    @Override // com.meijer.mobile.shoppinglist.di.ShoppingListFeatureActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Shopping List").start();
    }
}

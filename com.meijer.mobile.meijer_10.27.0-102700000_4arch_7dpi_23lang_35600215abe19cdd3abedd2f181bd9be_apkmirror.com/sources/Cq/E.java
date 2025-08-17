package Cq;

import Cq.E;
import Fq.ShoppingListItem;
import Ji.LocalThemeScope;
import Pq.h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14814f;
import kotlin.C17893M0;
import kotlin.C17927c1;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u0013\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lx0/c1;", "scaffoldState", "LPq/h$h;", "viewState", "Lyl/k;", "featureManager", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LCq/X;", "onNavigationRequest", "LBq/a;", "onShoppingListItemAction", "LBq/b;", "onShoppingListSearchAction", "b", "(LJi/M;Lx0/c1;LPq/h$h;Lyl/k;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LFq/c;", "shoppingListItem", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4425a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f4426b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17893M0 f4427c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<ShoppingListItem> f4428d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.ShoppingListAuthScreenKt$ShoppingListAuthScreen$1$1$1$1", f = "ShoppingListAuthScreen.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: Cq.E$a$a, reason: collision with other inner class name */
        static final class C0079a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f4429a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f4430b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0079a(C17893M0 c17893m0, Continuation<? super C0079a> continuation) {
                super(2, continuation);
                this.f4430b = c17893m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0079a(this.f4430b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C0079a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f4429a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f4430b;
                    this.f4429a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<ShoppingListItem> interfaceC5730l0) {
            this.f4425a = localThemeScope;
            this.f4426b = interfaceC16622O;
            this.f4427c = c17893m0;
            this.f4428d = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
            C16648k.d(interfaceC16622O, null, null, new C0079a(c17893m0, null), 3, null);
            return Unit.f142422a;
        }

        public final void b(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(819200389, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListAuthScreen.<anonymous> (ShoppingListAuthScreen.kt:53)");
            }
            LocalThemeScope localThemeScope = this.f4425a;
            ShoppingListItem shoppingListItemC = E.c(this.f4428d);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f4426b) | composer.D(this.f4427c);
            final InterfaceC16622O interfaceC16622O = this.f4426b;
            final C17893M0 c17893m0 = this.f4427c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Cq.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.a.c(interfaceC16622O, c17893m0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C3046c.c(localThemeScope, shoppingListItemC, (Function0) objB, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), composer, LocalThemeScope.f15770g | 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            b(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4431a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f4432b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17927c1 f4433c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f4434d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17893M0 f4435e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ yl.k f4436f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC5014e, Unit> f4437g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<X, Unit> f4438h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f4439i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f4440j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<ShoppingListItem> f4441k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.ShoppingListAuthScreenKt$ShoppingListAuthScreen$2$1$1$1", f = "ShoppingListAuthScreen.kt", l = {66}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f4442a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f4443b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17893M0 c17893m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f4443b = c17893m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f4443b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f4442a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f4443b;
                    this.f4442a = 1;
                    if (c17893m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, h.ShoppingListState c0667h, C17927c1 c17927c1, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, yl.k kVar, Function1<? super h.AbstractC5014e, Unit> function1, Function1<? super X, Unit> function12, Function1<? super Bq.a, Unit> function13, Function1<? super Bq.b, Unit> function14, InterfaceC5730l0<ShoppingListItem> interfaceC5730l0) {
            this.f4431a = localThemeScope;
            this.f4432b = c0667h;
            this.f4433c = c17927c1;
            this.f4434d = interfaceC16622O;
            this.f4435e = c17893m0;
            this.f4436f = kVar;
            this.f4437g = function1;
            this.f4438h = function12;
            this.f4439i = function13;
            this.f4440j = function14;
            this.f4441k = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC16622O interfaceC16622O, InterfaceC5730l0 interfaceC5730l0, C17893M0 c17893m0, ShoppingListItem item) {
            Intrinsics.j(item, "item");
            E.d(interfaceC5730l0, item);
            C16648k.d(interfaceC16622O, null, null, new a(c17893m0, null), 3, null);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1004202690, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListAuthScreen.<anonymous> (ShoppingListAuthScreen.kt:60)");
            }
            LocalThemeScope localThemeScope = this.f4431a;
            h.ShoppingListState c0667h = this.f4432b;
            C17927c1 c17927c1 = this.f4433c;
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f4434d) | composer.D(this.f4435e);
            final InterfaceC16622O interfaceC16622O = this.f4434d;
            final InterfaceC5730l0<ShoppingListItem> interfaceC5730l0 = this.f4441k;
            final C17893M0 c17893m0 = this.f4435e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Cq.F
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.b.c(interfaceC16622O, interfaceC5730l0, c17893m0, (ShoppingListItem) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q0.b(localThemeScope, c0667h, c17927c1, null, (Function1) objB, this.f4436f.e(AbstractC18227f.O.f170554h), this.f4436f.e(AbstractC18227f.P.f170555h), this.f4437g, this.f4438h, this.f4439i, this.f4440j, composer, LocalThemeScope.f15770g, 0, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r42, final kotlin.C17927c1 r43, final Pq.h.ShoppingListState r44, final yl.k r45, androidx.compose.ui.Modifier r46, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC5014e, kotlin.Unit> r47, final kotlin.jvm.functions.Function1<? super Cq.X, kotlin.Unit> r48, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r49, final kotlin.jvm.functions.Function1<? super Bq.b, kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.E.b(Ji.M, x0.c1, Pq.h$h, yl.k, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, C17927c1 c17927c1, h.ShoppingListState c0667h, yl.k kVar, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, c17927c1, c0667h, kVar, modifier, function1, function12, function13, function14, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShoppingListItem c(InterfaceC5730l0<ShoppingListItem> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5730l0<ShoppingListItem> interfaceC5730l0, ShoppingListItem shoppingListItem) {
        interfaceC5730l0.setValue(shoppingListItem);
    }
}

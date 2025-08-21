package Cq;

import Cq.E;
import Fq.ShoppingListItem;
import Ki.LocalThemeScope;
import Pq.h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14902f;
import kotlin.C17959M0;
import kotlin.C17993c1;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u0013\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lx0/c1;", "scaffoldState", "LPq/h$h;", "viewState", "Lzl/k;", "featureManager", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LCq/X;", "onNavigationRequest", "LBq/a;", "onShoppingListItemAction", "LBq/b;", "onShoppingListSearchAction", "b", "(LKi/M;Lx0/c1;LPq/h$h;Lzl/k;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LFq/c;", "shoppingListItem", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f5386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17959M0 f5387c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<ShoppingListItem> f5388d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.ShoppingListAuthScreenKt$ShoppingListAuthScreen$1$1$1$1", f = "ShoppingListAuthScreen.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: Cq.E$a$a, reason: collision with other inner class name */
        static final class C0095a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f5389a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f5390b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0095a(C17959M0 c17959m0, Continuation<? super C0095a> continuation) {
                super(2, continuation);
                this.f5390b = c17959m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0095a(this.f5390b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0095a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f5389a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f5390b;
                    this.f5389a = 1;
                    if (c17959m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<ShoppingListItem> interfaceC5872l0) {
            this.f5385a = localThemeScope;
            this.f5386b = interfaceC15783O;
            this.f5387c = c17959m0;
            this.f5388d = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
            C15809k.d(interfaceC15783O, null, null, new C0095a(c17959m0, null), 3, null);
            return Unit.f143329a;
        }

        public final void b(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(819200389, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListAuthScreen.<anonymous> (ShoppingListAuthScreen.kt:53)");
            }
            LocalThemeScope localThemeScope = this.f5385a;
            ShoppingListItem shoppingListItemC = E.c(this.f5388d);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f5386b) | composer.D(this.f5387c);
            final InterfaceC15783O interfaceC15783O = this.f5386b;
            final C17959M0 c17959m0 = this.f5387c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Cq.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.a.c(interfaceC15783O, c17959m0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C3077c.c(localThemeScope, shoppingListItemC, (Function0) objB, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), composer, LocalThemeScope.f17314g | 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            b(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.ShoppingListState f5392b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17993c1 f5393c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f5394d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17959M0 f5395e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ zl.k f5396f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5397g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<X, Unit> f5398h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f5399i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f5400j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<ShoppingListItem> f5401k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.ShoppingListAuthScreenKt$ShoppingListAuthScreen$2$1$1$1", f = "ShoppingListAuthScreen.kt", l = {66}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f5402a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f5403b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17959M0 c17959m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f5403b = c17959m0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f5403b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f5402a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f5403b;
                    this.f5402a = 1;
                    if (c17959m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, h.ShoppingListState c0487h, C17993c1 c17993c1, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, zl.k kVar, Function1<? super h.AbstractC4612e, Unit> function1, Function1<? super X, Unit> function12, Function1<? super Bq.a, Unit> function13, Function1<? super Bq.b, Unit> function14, InterfaceC5872l0<ShoppingListItem> interfaceC5872l0) {
            this.f5391a = localThemeScope;
            this.f5392b = c0487h;
            this.f5393c = c17993c1;
            this.f5394d = interfaceC15783O;
            this.f5395e = c17959m0;
            this.f5396f = kVar;
            this.f5397g = function1;
            this.f5398h = function12;
            this.f5399i = function13;
            this.f5400j = function14;
            this.f5401k = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC15783O interfaceC15783O, InterfaceC5872l0 interfaceC5872l0, C17959M0 c17959m0, ShoppingListItem item) {
            Intrinsics.j(item, "item");
            E.d(interfaceC5872l0, item);
            C15809k.d(interfaceC15783O, null, null, new a(c17959m0, null), 3, null);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1004202690, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListAuthScreen.<anonymous> (ShoppingListAuthScreen.kt:60)");
            }
            LocalThemeScope localThemeScope = this.f5391a;
            h.ShoppingListState c0487h = this.f5392b;
            C17993c1 c17993c1 = this.f5393c;
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f5394d) | composer.D(this.f5395e);
            final InterfaceC15783O interfaceC15783O = this.f5394d;
            final InterfaceC5872l0<ShoppingListItem> interfaceC5872l0 = this.f5401k;
            final C17959M0 c17959m0 = this.f5395e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Cq.F
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.b.c(interfaceC15783O, interfaceC5872l0, c17959m0, (ShoppingListItem) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q0.b(localThemeScope, c0487h, c17993c1, null, (Function1) objB, this.f5396f.e(AbstractC18503f.O.f172854h), this.f5396f.e(AbstractC18503f.P.f172855h), this.f5397g, this.f5398h, this.f5399i, this.f5400j, composer, LocalThemeScope.f17314g, 0, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r42, final kotlin.C17993c1 r43, final Pq.h.ShoppingListState r44, final zl.k r45, androidx.compose.ui.Modifier r46, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC4612e, kotlin.Unit> r47, final kotlin.jvm.functions.Function1<? super Cq.X, kotlin.Unit> r48, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r49, final kotlin.jvm.functions.Function1<? super Bq.b, kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.E.b(Ki.M, x0.c1, Pq.h$h, zl.k, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, C17993c1 c17993c1, h.ShoppingListState c0487h, zl.k kVar, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, c17993c1, c0487h, kVar, modifier, function1, function12, function13, function14, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShoppingListItem c(InterfaceC5872l0<ShoppingListItem> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5872l0<ShoppingListItem> interfaceC5872l0, ShoppingListItem shoppingListItem) {
        interfaceC5872l0.setValue(shoppingListItem);
    }
}

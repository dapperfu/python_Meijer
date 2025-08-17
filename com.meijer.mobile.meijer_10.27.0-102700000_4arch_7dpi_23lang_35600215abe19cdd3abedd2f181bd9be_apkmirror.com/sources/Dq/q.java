package Dq;

import Bq.a;
import Cq.C3050g;
import Cq.K;
import Dq.q;
import Fq.ShoppingListItem;
import Ji.LocalThemeScope;
import Pq.h;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import g1.PointerInputChange;
import g1.U;
import j0.C14801J;
import j0.C14802K;
import java.util.List;
import ji.q1;
import kotlin.C13786D;
import kotlin.C13814m;
import kotlin.C6165d;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.InterfaceC15343c;
import ni.A0;
import ni.P0;
import p1.C16193g;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009d\u0001\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006!²\u0006\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "LFq/c;", "inProgressList", "completedList", "", "isListMoving", "Landroidx/compose/runtime/l0;", "isInEditMode", "isShoppingListIterationTwoEnabled", "isShoppingListIterationThreeEnabled", "Lkotlin/Function1;", "", "onItemSearchIconClicked", "LPq/h$e;", "onAction", "LBq/a;", "onShoppingListItemAction", "g", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;ZLandroidx/compose/runtime/l0;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LDq/i;", "dragDropListState", "", "shoppingListItemCount", "x", "(Landroidx/compose/ui/Modifier;ZLDq/i;I)Landroidx/compose/ui/Modifier;", "shoppingListItems", "inProgressListSize", "completedListSize", "Lqv/C0;", "overScrollJob", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropListKt$ShoppingDragDropList$1$1", f = "ShoppingDragDropList.kt", l = {142}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7159a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f7160b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f7161c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3397i f7162d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f7163e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f7164f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<ShoppingListItem> list, List<ShoppingListItem> list2, C3397i c3397i, InterfaceC5726j0 interfaceC5726j0, InterfaceC5726j0 interfaceC5726j02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7160b = list;
            this.f7161c = list2;
            this.f7162d = c3397i;
            this.f7163e = interfaceC5726j0;
            this.f7164f = interfaceC5726j02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f7160b, this.f7161c, this.f7162d, this.f7163e, this.f7164f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f7159a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (q.p(this.f7163e) < this.f7160b.size() && !this.f7160b.isEmpty() && q.r(this.f7164f) == this.f7161c.size()) {
                    C15339A lazyListState = this.f7162d.getLazyListState();
                    this.f7159a = 1;
                    aVar = this;
                    if (C15339A.l(lazyListState, 0, 0, aVar, 2, null) == objF) {
                        return objF;
                    }
                }
                q.q(aVar.f7163e, aVar.f7160b.size());
                q.s(aVar.f7164f, aVar.f7161c.size());
                return Unit.f142422a;
            }
            aVar = this;
            q.q(aVar.f7163e, aVar.f7160b.size());
            q.s(aVar.f7164f, aVar.f7161c.size());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f7166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f7167c;

        b(boolean z10, LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f7165a = z10;
            this.f7166b = localThemeScope;
            this.f7167c = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d() {
            return Unit.f142422a;
        }

        public final void c(InterfaceC15343c item, Composer composer, int i10) {
            int i11;
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(422674576, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:170)");
            }
            if (this.f7165a) {
                Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, this.f7166b.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null);
                C5658d.f fVarE = C5658d.f48555a.e();
                LocalThemeScope localThemeScope = this.f7166b;
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f7167c;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
                InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5742sR, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14801J c14801j = C14801J.f139030a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
                String strC = C16193g.c(Aq.b.f1478W, composer, 0);
                int i12 = LocalThemeScope.f15770g;
                ri.j.h(localThemeScope, label, strC, null, composer, i12 | (q1.Label.f140080j << 3), 4);
                composer.startReplaceGroup(-1738031599);
                if (interfaceC5730l0.getValue().booleanValue()) {
                    i11 = i12;
                } else {
                    A0 a02 = A0.f151413a;
                    String strC2 = C16193g.c(Aq.b.f1480a, composer, 0);
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Dq.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return q.b.d();
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    i11 = i12;
                    P0.k(localThemeScope, a02, strC2, (Function0) objB, null, null, false, 0L, false, composer, i12 | 3072 | (A0.f151414b << 3), 248);
                }
                composer.P();
                A0 a03 = A0.f151413a;
                String strC3 = C16193g.c(interfaceC5730l0.getValue().booleanValue() ? Aq.b.f1498s : Aq.b.f1496q, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(interfaceC5730l0);
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Dq.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q.b.e(interfaceC5730l0);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope, a03, strC3, (Function0) objB2, null, null, false, 0L, false, composer, i11 | (A0.f151414b << 3), 248);
                composer.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            c(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5730l0 interfaceC5730l0) {
            interfaceC5730l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5730l0.getValue()).booleanValue()));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3397i f7168a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7169b;

        c(C3397i c3397i, int i10) {
            this.f7168a = c3397i;
            this.f7169b = i10;
        }

        public final void a(androidx.compose.ui.graphics.e graphicsLayer) {
            Intrinsics.j(graphicsLayer, "$this$graphicsLayer");
            Float fE = this.f7168a.e();
            int i10 = this.f7169b;
            Integer numC = this.f7168a.c();
            if (numC == null || i10 != numC.intValue()) {
                fE = null;
            }
            graphicsLayer.e(fE != null ? fE.floatValue() : 0.0f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7170a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f7171b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f7172c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC5014e, Unit> f7173d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f7174a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f7175b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<h.AbstractC5014e, Unit> f7176c;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, boolean z10, Function1<? super h.AbstractC5014e, Unit> function1) {
                this.f7174a = localThemeScope;
                this.f7175b = z10;
                this.f7176c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(h.AbstractC5014e.b.f28495a);
                return Unit.f142422a;
            }

            public final void b(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(1253965693, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:262)");
                }
                LocalThemeScope localThemeScope = this.f7174a;
                boolean z10 = this.f7175b;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f7176c);
                final Function1<h.AbstractC5014e, Unit> function1 = this.f7176c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Dq.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q.d.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C3050g.d(localThemeScope, null, z10, (Function0) objB, composer, LocalThemeScope.f15770g, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
                b(interfaceC6166e, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0, Function1<? super h.AbstractC5014e, Unit> function1) {
            this.f7170a = z10;
            this.f7171b = localThemeScope;
            this.f7172c = interfaceC5730l0;
            this.f7173d = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1481912149, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:252)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C6165d.f(!this.f7172c.getValue().booleanValue(), companion.then(this.f7170a ? androidx.compose.foundation.layout.D.m(companion, 0.0f, this.f7171b.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null) : companion), androidx.compose.animation.f.k(null, null, false, null, 15, null).c(androidx.compose.animation.f.m(null, 0.0f, 3, null)), androidx.compose.animation.f.E(null, null, 3, null).c(androidx.compose.animation.f.o(null, 0.0f, 3, null)), null, ComposableLambdaKt.c(1253965693, true, new a(this.f7171b, this.f7170a, this.f7173d), composer, 54), composer, 200064, 16);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7177a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f7178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f7179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f7180d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<ShoppingListItem, Unit> f7181e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC5014e, Unit> f7182f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f7183g;

        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z10, InterfaceC5730l0<Boolean> interfaceC5730l0, LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Function1<? super ShoppingListItem, Unit> function1, Function1<? super h.AbstractC5014e, Unit> function12, Function1<? super Bq.a, Unit> function13) {
            this.f7177a = z10;
            this.f7178b = interfaceC5730l0;
            this.f7179c = localThemeScope;
            this.f7180d = shoppingListItem;
            this.f7181e = function1;
            this.f7182f = function12;
            this.f7183g = function13;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(1952560098, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:278)");
            }
            if (this.f7177a) {
                composer.startReplaceGroup(1975865246);
                K.e(this.f7179c, this.f7180d, this.f7178b.getValue().booleanValue(), null, this.f7181e, this.f7182f, this.f7183g, composer, LocalThemeScope.f15770g, 4);
                composer.P();
            } else {
                composer.startReplaceGroup(1976281731);
                B.d(this.f7179c, this.f7180d, this.f7182f, this.f7183g, composer, LocalThemeScope.f15770g);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f7184a;

        f(LocalThemeScope localThemeScope) {
            this.f7184a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1079980926, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:296)");
            }
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f7184a.getAdsSpacing().getFive().getDp()), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final g f7185f = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ShoppingListItem shoppingListItem) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f7186f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f7187g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1, List list) {
            super(1);
            this.f7186f = function1;
            this.f7187g = list;
        }

        public final Object a(int i10) {
            return this.f7186f.invoke(this.f7187g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f7188f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f7189g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function1 function1, List list) {
            super(1);
            this.f7188f = function1;
            this.f7189g = list;
        }

        public final Object a(int i10) {
            return this.f7188f.invoke(this.f7189g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class j extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f7190f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f7191g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f7192h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f7193i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f7194j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f7195k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f7196l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list, InterfaceC5730l0 interfaceC5730l0, boolean z10, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, Function1 function13) {
            super(4);
            this.f7190f = list;
            this.f7191g = interfaceC5730l0;
            this.f7192h = z10;
            this.f7193i = localThemeScope;
            this.f7194j = function1;
            this.f7195k = function12;
            this.f7196l = function13;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ShoppingListItem shoppingListItem = (ShoppingListItem) this.f7190f.get(i10);
            composer.startReplaceGroup(-1837311405);
            C6165d.f(!((Boolean) this.f7191g.getValue()).booleanValue(), null, androidx.compose.animation.f.k(null, null, false, null, 15, null).c(androidx.compose.animation.f.m(null, 0.0f, 3, null)), androidx.compose.animation.f.E(null, null, 3, null).c(androidx.compose.animation.f.o(null, 0.0f, 3, null)), null, ComposableLambdaKt.c(1952560098, true, new e(this.f7192h, this.f7191g, this.f7193i, shoppingListItem, this.f7194j, this.f7195k, this.f7196l), composer, 54), composer, 200064, 18);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2 f7197f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f7198g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function2 function2, List list) {
            super(1);
            this.f7197f = function2;
            this.f7198g = list;
        }

        public final Object a(int i10) {
            return this.f7197f.invoke(Integer.valueOf(i10), this.f7198g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class l extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f7199f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List list) {
            super(1);
            this.f7199f = list;
        }

        public final Object a(int i10) {
            this.f7199f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class m extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f7200f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3397i f7201g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f7202h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f7203i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f7204j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f7205k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f7206l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1 f7207m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f7208n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List list, C3397i c3397i, boolean z10, InterfaceC5730l0 interfaceC5730l0, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, Function1 function13, boolean z11) {
            super(4);
            this.f7200f = list;
            this.f7201g = c3397i;
            this.f7202h = z10;
            this.f7203i = interfaceC5730l0;
            this.f7204j = localThemeScope;
            this.f7205k = function1;
            this.f7206l = function12;
            this.f7207m = function13;
            this.f7208n = z11;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            ShoppingListItem shoppingListItem = (ShoppingListItem) this.f7200f.get(i10);
            composer.startReplaceGroup(-1859010473);
            int i13 = i10 + 1;
            Modifier.Companion companion = Modifier.INSTANCE;
            Float fE = this.f7201g.e();
            Integer numC = this.f7201g.c();
            if (!(numC != null && i13 == numC.intValue())) {
                fE = null;
            }
            Modifier modifierA = P0.o.a(companion, fE != null ? Float.valueOf(1.0f).floatValue() : -1.0f);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f7201g) | composer.d(i13);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new c(this.f7201g, i13);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA2 = androidx.compose.ui.graphics.d.a(modifierA, (Function1) objB);
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA2);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5664j c5664j = C5664j.f48612a;
            if (this.f7202h) {
                composer.startReplaceGroup(-566169121);
                K.e(this.f7204j, shoppingListItem, ((Boolean) this.f7203i.getValue()).booleanValue(), null, this.f7205k, this.f7206l, this.f7207m, composer, LocalThemeScope.f15770g, 4);
                composer.P();
            } else {
                composer.startReplaceGroup(-565779637);
                H.d(this.f7204j, shoppingListItem, ((Boolean) this.f7203i.getValue()).booleanValue(), this.f7208n, this.f7206l, this.f7207m, composer, LocalThemeScope.f15770g);
                composer.P();
            }
            composer.v();
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class n implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7209a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3397i f7210b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7211c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements PointerInputEventHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3397i f7212a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f7213b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<C0> f7214c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f7215d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropListKt$ifInEditMode$1$1$1$4$2$1", f = "ShoppingDragDropList.kt", l = {332}, m = "invokeSuspend")
            /* renamed from: Dq.q$n$a$a, reason: collision with other inner class name */
            static final class C0111a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f7216a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3397i f7217b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f7218c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0111a(C3397i c3397i, float f10, Continuation<? super C0111a> continuation) {
                    super(2, continuation);
                    this.f7217b = c3397i;
                    this.f7218c = f10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0111a(this.f7217b, this.f7218c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C0111a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f7216a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C15339A lazyListState = this.f7217b.getLazyListState();
                        float f10 = this.f7218c;
                        this.f7216a = 1;
                        if (C13786D.c(lazyListState, f10, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(C3397i c3397i, int i10, InterfaceC5730l0<C0> interfaceC5730l0, InterfaceC16622O interfaceC16622O) {
                this.f7212a = c3397i;
                this.f7213b = i10;
                this.f7214c = interfaceC5730l0;
                this.f7215d = interfaceC16622O;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit h(C3397i c3397i, g1.J j10, InterfaceC5730l0 interfaceC5730l0, InterfaceC16622O interfaceC16622O, PointerInputChange change, U0.f fVar) {
                Intrinsics.j(change, "change");
                change.a();
                c3397i.j(fVar.getPackedValue());
                C0 c0D = n.d(interfaceC5730l0);
                if (c0D != null && c0D.a()) {
                    return Unit.f142422a;
                }
                Float fValueOf = Float.valueOf(c3397i.a());
                if (fValueOf.floatValue() == 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    n.e(interfaceC5730l0, C16648k.d(interfaceC16622O, null, null, new C0111a(c3397i, fValueOf.floatValue(), null), 3, null));
                } else {
                    C0 c0D2 = n.d(interfaceC5730l0);
                    if (c0D2 != null) {
                        C0.a.a(c0D2, null, 1, null);
                    }
                }
                return Unit.f142422a;
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(final g1.J j10, Continuation<? super Unit> continuation) {
                final C3397i c3397i = this.f7212a;
                final int i10 = this.f7213b;
                Function1 function1 = new Function1() { // from class: Dq.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.n.a.e(c3397i, i10, (U0.f) obj);
                    }
                };
                final C3397i c3397i2 = this.f7212a;
                Function0 function0 = new Function0() { // from class: Dq.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.n.a.f(c3397i2);
                    }
                };
                final C3397i c3397i3 = this.f7212a;
                Function0 function02 = new Function0() { // from class: Dq.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.n.a.g(c3397i3);
                    }
                };
                final C3397i c3397i4 = this.f7212a;
                final InterfaceC5730l0<C0> interfaceC5730l0 = this.f7214c;
                final InterfaceC16622O interfaceC16622O = this.f7215d;
                Object objH = C13814m.h(j10, function1, function0, function02, new Function2() { // from class: Dq.x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return q.n.a.h(c3397i4, j10, interfaceC5730l0, interfaceC16622O, (PointerInputChange) obj, (U0.f) obj2);
                    }
                }, continuation);
                return objH == IntrinsicsKt.f() ? objH : Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(C3397i c3397i, int i10, U0.f fVar) {
                c3397i.m(fVar.getPackedValue(), i10);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(C3397i c3397i) {
                c3397i.k();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(C3397i c3397i) {
                c3397i.l();
                return Unit.f142422a;
            }
        }

        n(boolean z10, C3397i c3397i, int i10) {
            this.f7209a = z10;
            this.f7210b = c3397i;
            this.f7211c = i10;
        }

        public final Modifier c(Modifier composed, Composer composer, int i10) {
            Intrinsics.j(composed, "$this$composed");
            composer.startReplaceGroup(145320479);
            if (ComposerKt.M()) {
                ComposerKt.U(145320479, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ifInEditMode.<anonymous> (ShoppingDragDropList.kt:314)");
            }
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(null, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
            composer.P();
            if (this.f7209a) {
                Unit unit = Unit.f142422a;
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f7210b) | composer.d(this.f7211c) | composer.D(interfaceC16622O);
                C3397i c3397i = this.f7210b;
                int i11 = this.f7211c;
                Object objB3 = composer.B();
                if (zV || objB3 == companion.a()) {
                    objB3 = new a(c3397i, i11, interfaceC5730l0, interfaceC16622O);
                    composer.t(objB3);
                }
                composer.P();
                composed = U.c(composed, unit, (PointerInputEventHandler) objB3);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return composed;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return c(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0 d(InterfaceC5730l0<C0> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5730l0<C0> interfaceC5730l0, C0 c02) {
            interfaceC5730l0.setValue(c02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b0 A[PHI: r3
      0x03b0: PHI (r3v23 androidx.compose.runtime.l0<java.lang.Boolean>) = (r3v18 androidx.compose.runtime.l0<java.lang.Boolean>), (r3v24 androidx.compose.runtime.l0<java.lang.Boolean>) binds: [B:211:0x03ae, B:207:0x03a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r44, androidx.compose.ui.Modifier r45, final java.util.List<Fq.ShoppingListItem> r46, final java.util.List<Fq.ShoppingListItem> r47, final boolean r48, androidx.compose.runtime.InterfaceC5730l0<java.lang.Boolean> r49, final boolean r50, final boolean r51, final kotlin.jvm.functions.Function1<? super Fq.ShoppingListItem, kotlin.Unit> r52, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC5014e, kotlin.Unit> r53, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dq.q.g(Ji.M, androidx.compose.ui.Modifier, java.util.List, java.util.List, boolean, androidx.compose.runtime.l0, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1, InterfaceC5730l0 interfaceC5730l0, int i10, int i11) {
        int i12 = i10 <= 0 ? 0 : i10 - 1;
        int size = i11 > 0 ? i11 - 1 : 0;
        if (i12 != size && i12 < h(interfaceC5730l0).size()) {
            if (size >= h(interfaceC5730l0).size()) {
                size = h(interfaceC5730l0).size() - 1;
            }
            function1.invoke(new a.MoveItem(h(interfaceC5730l0).get(size), size < h(interfaceC5730l0).size() + (-1) ? h(interfaceC5730l0).get(size + 1) : null));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1, InterfaceC5730l0 interfaceC5730l0, int i10, int i11) {
        int i12 = i10 <= 0 ? 0 : i10 - 1;
        int i13 = i11 > 0 ? i11 - 1 : 0;
        function1.invoke(h.AbstractC5014e.c.f28496a);
        List listM1 = CollectionsKt.m1(h(interfaceC5730l0));
        if (i12 < h(interfaceC5730l0).size() && i13 < h(interfaceC5730l0).size() && i13 >= 0) {
            C3396h.c(listM1, i12, i13);
        }
        k(interfaceC5730l0, listM1);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n(ShoppingListItem it) {
        Intrinsics.j(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(List list, boolean z10, LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, C3397i c3397i, Function1 function1, Function1 function12, Function1 function13, boolean z11, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, -1, null, ComposableLambdaKt.composableLambdaInstance(422674576, true, new b(z10, localThemeScope, interfaceC5730l0)), 2, null);
        List<ShoppingListItem> listH = h(interfaceC5730l02);
        LazyColumn.i(listH.size(), new k(new Function2() { // from class: Dq.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return q.m(((Integer) obj).intValue(), (ShoppingListItem) obj2);
            }
        }, listH), new l(listH), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new m(listH, c3397i, z10, interfaceC5730l0, localThemeScope, function1, function12, function13, z11)));
        if (!list.isEmpty()) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1481912149, true, new d(z10, localThemeScope, interfaceC5730l0, function12)), 3, null);
            LazyColumn.i(list.size(), new h(new Function1() { // from class: Dq.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.n((ShoppingListItem) obj);
                }
            }, list), new i(g.f7185f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new j(list, interfaceC5730l0, z10, localThemeScope, function1, function12, function13)));
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1079980926, true, new f(localThemeScope)), 3, null);
        }
        l0.w.g(LazyColumn, null, null, C3389a.f7098a.a(), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(int i10, ShoppingListItem value) {
        Intrinsics.j(value, "value");
        return Long.valueOf(value.getListItemId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, List list, List list2, boolean z10, InterfaceC5730l0 interfaceC5730l0, boolean z11, boolean z12, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, int i12, Composer composer, int i13) {
        g(localThemeScope, modifier, list, list2, z10, interfaceC5730l0, z11, z12, function1, function12, function13, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    private static final Modifier x(Modifier modifier, boolean z10, C3397i c3397i, int i10) {
        return androidx.compose.ui.b.c(modifier, null, new n(z10, c3397i, i10), 1, null);
    }

    private static final List<ShoppingListItem> h(InterfaceC5730l0<List<ShoppingListItem>> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    private static final void k(InterfaceC5730l0<List<ShoppingListItem>> interfaceC5730l0, List<ShoppingListItem> list) {
        interfaceC5730l0.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }
}

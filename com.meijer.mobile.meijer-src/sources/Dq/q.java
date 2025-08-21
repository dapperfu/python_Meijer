package Dq;

import Bq.a;
import Cq.C3081g;
import Cq.K;
import Dq.q;
import Fq.ShoppingListItem;
import Ki.LocalThemeScope;
import Pq.h;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import g1.PointerInputChange;
import g1.U;
import j0.C14889J;
import j0.C14890K;
import java.util.List;
import ki.q1;
import kotlin.C13896D;
import kotlin.C13924m;
import kotlin.C6304d;
import kotlin.InterfaceC6305e;
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
import l0.C15429A;
import l0.InterfaceC15433c;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import oi.A0;
import oi.P0;
import p1.C16338g;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009d\u0001\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006!²\u0006\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "LFq/c;", "inProgressList", "completedList", "", "isListMoving", "Landroidx/compose/runtime/l0;", "isInEditMode", "isShoppingListIterationTwoEnabled", "isShoppingListIterationThreeEnabled", "Lkotlin/Function1;", "", "onItemSearchIconClicked", "LPq/h$e;", "onAction", "LBq/a;", "onShoppingListItemAction", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;ZLandroidx/compose/runtime/l0;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LDq/i;", "dragDropListState", "", "shoppingListItemCount", "x", "(Landroidx/compose/ui/Modifier;ZLDq/i;I)Landroidx/compose/ui/Modifier;", "shoppingListItems", "inProgressListSize", "completedListSize", "Lmv/C0;", "overScrollJob", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropListKt$ShoppingDragDropList$1$1", f = "ShoppingDragDropList.kt", l = {142}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f6467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f6468c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3125i f6469d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f6470e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f6471f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<ShoppingListItem> list, List<ShoppingListItem> list2, C3125i c3125i, InterfaceC5868j0 interfaceC5868j0, InterfaceC5868j0 interfaceC5868j02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6467b = list;
            this.f6468c = list2;
            this.f6469d = c3125i;
            this.f6470e = interfaceC5868j0;
            this.f6471f = interfaceC5868j02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f6467b, this.f6468c, this.f6469d, this.f6470e, this.f6471f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f6466a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (q.p(this.f6470e) < this.f6467b.size() && !this.f6467b.isEmpty() && q.r(this.f6471f) == this.f6468c.size()) {
                    C15429A lazyListState = this.f6469d.getLazyListState();
                    this.f6466a = 1;
                    aVar = this;
                    if (C15429A.l(lazyListState, 0, 0, aVar, 2, null) == objF) {
                        return objF;
                    }
                }
                q.q(aVar.f6470e, aVar.f6467b.size());
                q.s(aVar.f6471f, aVar.f6468c.size());
                return Unit.f143329a;
            }
            aVar = this;
            q.q(aVar.f6470e, aVar.f6467b.size());
            q.s(aVar.f6471f, aVar.f6468c.size());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6472a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6473b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f6474c;

        b(boolean z10, LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f6472a = z10;
            this.f6473b = localThemeScope;
            this.f6474c = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d() {
            return Unit.f143329a;
        }

        public final void c(InterfaceC15433c item, Composer composer, int i10) {
            int i11;
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(422674576, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:170)");
            }
            if (this.f6472a) {
                Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, this.f6473b.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null);
                C5800d.f fVarE = C5800d.f48779a.e();
                LocalThemeScope localThemeScope = this.f6473b;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f6474c;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
                InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion.e());
                D1.c(composerA, interfaceC5884sR, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion.f());
                C14889J c14889j = C14889J.f139620a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
                String strC = C16338g.c(Aq.b.f1975W, composer, 0);
                int i12 = LocalThemeScope.f17314g;
                si.j.h(localThemeScope, label, strC, null, composer, i12 | (q1.Label.f142335j << 3), 4);
                composer.startReplaceGroup(-1738031599);
                if (interfaceC5872l0.getValue().booleanValue()) {
                    i11 = i12;
                } else {
                    A0 a02 = A0.f153872a;
                    String strC2 = C16338g.c(Aq.b.f1977a, composer, 0);
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
                    P0.k(localThemeScope, a02, strC2, (Function0) objB, null, null, false, 0L, false, composer, i12 | 3072 | (A0.f153873b << 3), 248);
                }
                composer.P();
                A0 a03 = A0.f153872a;
                String strC3 = C16338g.c(interfaceC5872l0.getValue().booleanValue() ? Aq.b.f1995s : Aq.b.f1993q, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(interfaceC5872l0);
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Dq.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q.b.e(interfaceC5872l0);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                P0.k(localThemeScope, a03, strC3, (Function0) objB2, null, null, false, 0L, false, composer, i11 | (A0.f153873b << 3), 248);
                composer.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            c(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5872l0 interfaceC5872l0) {
            interfaceC5872l0.setValue(Boolean.valueOf(!((Boolean) interfaceC5872l0.getValue()).booleanValue()));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3125i f6475a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6476b;

        c(C3125i c3125i, int i10) {
            this.f6475a = c3125i;
            this.f6476b = i10;
        }

        public final void a(androidx.compose.ui.graphics.e graphicsLayer) {
            Intrinsics.j(graphicsLayer, "$this$graphicsLayer");
            Float fE = this.f6475a.e();
            int i10 = this.f6476b;
            Integer numC = this.f6475a.c();
            if (numC == null || i10 != numC.intValue()) {
                fE = null;
            }
            graphicsLayer.e(fE != null ? fE.floatValue() : 0.0f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6477a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6478b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f6479c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f6480d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f6481a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f6482b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<h.AbstractC4612e, Unit> f6483c;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, boolean z10, Function1<? super h.AbstractC4612e, Unit> function1) {
                this.f6481a = localThemeScope;
                this.f6482b = z10;
                this.f6483c = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(h.AbstractC4612e.b.f26377a);
                return Unit.f143329a;
            }

            public final void b(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(1253965693, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:262)");
                }
                LocalThemeScope localThemeScope = this.f6481a;
                boolean z10 = this.f6482b;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f6483c);
                final Function1<h.AbstractC4612e, Unit> function1 = this.f6483c;
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
                C3081g.d(localThemeScope, null, z10, (Function0) objB, composer, LocalThemeScope.f17314g, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
                b(interfaceC6305e, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, Function1<? super h.AbstractC4612e, Unit> function1) {
            this.f6477a = z10;
            this.f6478b = localThemeScope;
            this.f6479c = interfaceC5872l0;
            this.f6480d = function1;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1481912149, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:252)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C6304d.f(!this.f6479c.getValue().booleanValue(), companion.then(this.f6477a ? androidx.compose.foundation.layout.D.m(companion, 0.0f, this.f6478b.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 13, null) : companion), androidx.compose.animation.f.k(null, null, false, null, 15, null).c(androidx.compose.animation.f.m(null, 0.0f, 3, null)), androidx.compose.animation.f.E(null, null, 3, null).c(androidx.compose.animation.f.o(null, 0.0f, 3, null)), null, ComposableLambdaKt.c(1253965693, true, new a(this.f6478b, this.f6477a, this.f6480d), composer, 54), composer, 200064, 16);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6484a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f6485b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6486c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f6487d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<ShoppingListItem, Unit> f6488e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f6489f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f6490g;

        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z10, InterfaceC5872l0<Boolean> interfaceC5872l0, LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Function1<? super ShoppingListItem, Unit> function1, Function1<? super h.AbstractC4612e, Unit> function12, Function1<? super Bq.a, Unit> function13) {
            this.f6484a = z10;
            this.f6485b = interfaceC5872l0;
            this.f6486c = localThemeScope;
            this.f6487d = shoppingListItem;
            this.f6488e = function1;
            this.f6489f = function12;
            this.f6490g = function13;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(1952560098, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:278)");
            }
            if (this.f6484a) {
                composer.startReplaceGroup(1975865246);
                K.e(this.f6486c, this.f6487d, this.f6485b.getValue().booleanValue(), null, this.f6488e, this.f6489f, this.f6490g, composer, LocalThemeScope.f17314g, 4);
                composer.P();
            } else {
                composer.startReplaceGroup(1976281731);
                B.d(this.f6486c, this.f6487d, this.f6489f, this.f6490g, composer, LocalThemeScope.f17314g);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6491a;

        f(LocalThemeScope localThemeScope) {
            this.f6491a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1079980926, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropList.<anonymous>.<anonymous>.<anonymous> (ShoppingDragDropList.kt:296)");
            }
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f6491a.getAdsSpacing().getFive().getDp()), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final g f6492f = new g();

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
        final /* synthetic */ Function1 f6493f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f6494g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1, List list) {
            super(1);
            this.f6493f = function1;
            this.f6494g = list;
        }

        public final Object a(int i10) {
            return this.f6493f.invoke(this.f6494g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f6495f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f6496g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function1 function1, List list) {
            super(1);
            this.f6495f = function1;
            this.f6496g = list;
        }

        public final Object a(int i10) {
            return this.f6495f.invoke(this.f6496g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class j extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f6497f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f6498g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f6499h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6500i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f6501j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f6502k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f6503l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list, InterfaceC5872l0 interfaceC5872l0, boolean z10, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, Function1 function13) {
            super(4);
            this.f6497f = list;
            this.f6498g = interfaceC5872l0;
            this.f6499h = z10;
            this.f6500i = localThemeScope;
            this.f6501j = function1;
            this.f6502k = function12;
            this.f6503l = function13;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15433c) ? 4 : 2);
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
            ShoppingListItem shoppingListItem = (ShoppingListItem) this.f6497f.get(i10);
            composer.startReplaceGroup(-1837311405);
            C6304d.f(!((Boolean) this.f6498g.getValue()).booleanValue(), null, androidx.compose.animation.f.k(null, null, false, null, 15, null).c(androidx.compose.animation.f.m(null, 0.0f, 3, null)), androidx.compose.animation.f.E(null, null, 3, null).c(androidx.compose.animation.f.o(null, 0.0f, 3, null)), null, ComposableLambdaKt.c(1952560098, true, new e(this.f6499h, this.f6498g, this.f6500i, shoppingListItem, this.f6501j, this.f6502k, this.f6503l), composer, 54), composer, 200064, 18);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2 f6504f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f6505g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function2 function2, List list) {
            super(1);
            this.f6504f = function2;
            this.f6505g = list;
        }

        public final Object a(int i10) {
            return this.f6504f.invoke(Integer.valueOf(i10), this.f6505g.get(i10));
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
        final /* synthetic */ List f6506f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List list) {
            super(1);
            this.f6506f = list;
        }

        public final Object a(int i10) {
            this.f6506f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class m extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f6507f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3125i f6508g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f6509h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f6510i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6511j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f6512k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f6513l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1 f6514m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f6515n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List list, C3125i c3125i, boolean z10, InterfaceC5872l0 interfaceC5872l0, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, Function1 function13, boolean z11) {
            super(4);
            this.f6507f = list;
            this.f6508g = c3125i;
            this.f6509h = z10;
            this.f6510i = interfaceC5872l0;
            this.f6511j = localThemeScope;
            this.f6512k = function1;
            this.f6513l = function12;
            this.f6514m = function13;
            this.f6515n = z11;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
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
            ShoppingListItem shoppingListItem = (ShoppingListItem) this.f6507f.get(i10);
            composer.startReplaceGroup(-1859010473);
            int i13 = i10 + 1;
            Modifier.Companion companion = Modifier.INSTANCE;
            Float fE = this.f6508g.e();
            Integer numC = this.f6508g.c();
            if (!(numC != null && i13 == numC.intValue())) {
                fE = null;
            }
            Modifier modifierA = P0.o.a(companion, fE != null ? Float.valueOf(1.0f).floatValue() : -1.0f);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f6508g) | composer.d(i13);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new c(this.f6508g, i13);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA2 = androidx.compose.ui.graphics.d.a(modifierA, (Function1) objB);
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA2);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            if (this.f6509h) {
                composer.startReplaceGroup(-566169121);
                K.e(this.f6511j, shoppingListItem, ((Boolean) this.f6510i.getValue()).booleanValue(), null, this.f6512k, this.f6513l, this.f6514m, composer, LocalThemeScope.f17314g, 4);
                composer.P();
            } else {
                composer.startReplaceGroup(-565779637);
                H.d(this.f6511j, shoppingListItem, ((Boolean) this.f6510i.getValue()).booleanValue(), this.f6515n, this.f6513l, this.f6514m, composer, LocalThemeScope.f17314g);
                composer.P();
            }
            composer.v();
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class n implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6516a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3125i f6517b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6518c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements PointerInputEventHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3125i f6519a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f6520b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<C0> f6521c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f6522d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.dragdroplist.ShoppingDragDropListKt$ifInEditMode$1$1$1$4$2$1", f = "ShoppingDragDropList.kt", l = {332}, m = "invokeSuspend")
            /* renamed from: Dq.q$n$a$a, reason: collision with other inner class name */
            static final class C0125a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f6523a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C3125i f6524b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f6525c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0125a(C3125i c3125i, float f10, Continuation<? super C0125a> continuation) {
                    super(2, continuation);
                    this.f6524b = c3125i;
                    this.f6525c = f10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0125a(this.f6524b, this.f6525c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C0125a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f6523a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C15429A lazyListState = this.f6524b.getLazyListState();
                        float f10 = this.f6525c;
                        this.f6523a = 1;
                        if (C13896D.c(lazyListState, f10, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(C3125i c3125i, int i10, InterfaceC5872l0<C0> interfaceC5872l0, InterfaceC15783O interfaceC15783O) {
                this.f6519a = c3125i;
                this.f6520b = i10;
                this.f6521c = interfaceC5872l0;
                this.f6522d = interfaceC15783O;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit h(C3125i c3125i, g1.J j10, InterfaceC5872l0 interfaceC5872l0, InterfaceC15783O interfaceC15783O, PointerInputChange change, U0.f fVar) {
                Intrinsics.j(change, "change");
                change.a();
                c3125i.j(fVar.getPackedValue());
                C0 c0D = n.d(interfaceC5872l0);
                if (c0D != null && c0D.a()) {
                    return Unit.f143329a;
                }
                Float fValueOf = Float.valueOf(c3125i.a());
                if (fValueOf.floatValue() == 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    n.e(interfaceC5872l0, C15809k.d(interfaceC15783O, null, null, new C0125a(c3125i, fValueOf.floatValue(), null), 3, null));
                } else {
                    C0 c0D2 = n.d(interfaceC5872l0);
                    if (c0D2 != null) {
                        C0.a.a(c0D2, null, 1, null);
                    }
                }
                return Unit.f143329a;
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(final g1.J j10, Continuation<? super Unit> continuation) {
                final C3125i c3125i = this.f6519a;
                final int i10 = this.f6520b;
                Function1 function1 = new Function1() { // from class: Dq.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.n.a.e(c3125i, i10, (U0.f) obj);
                    }
                };
                final C3125i c3125i2 = this.f6519a;
                Function0 function0 = new Function0() { // from class: Dq.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.n.a.f(c3125i2);
                    }
                };
                final C3125i c3125i3 = this.f6519a;
                Function0 function02 = new Function0() { // from class: Dq.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.n.a.g(c3125i3);
                    }
                };
                final C3125i c3125i4 = this.f6519a;
                final InterfaceC5872l0<C0> interfaceC5872l0 = this.f6521c;
                final InterfaceC15783O interfaceC15783O = this.f6522d;
                Object objH = C13924m.h(j10, function1, function0, function02, new Function2() { // from class: Dq.x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return q.n.a.h(c3125i4, j10, interfaceC5872l0, interfaceC15783O, (PointerInputChange) obj, (U0.f) obj2);
                    }
                }, continuation);
                return objH == IntrinsicsKt.f() ? objH : Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(C3125i c3125i, int i10, U0.f fVar) {
                c3125i.m(fVar.getPackedValue(), i10);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(C3125i c3125i) {
                c3125i.k();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(C3125i c3125i) {
                c3125i.l();
                return Unit.f143329a;
            }
        }

        n(boolean z10, C3125i c3125i, int i10) {
            this.f6516a = z10;
            this.f6517b = c3125i;
            this.f6518c = i10;
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
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(null, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB2;
            composer.P();
            if (this.f6516a) {
                Unit unit = Unit.f143329a;
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f6517b) | composer.d(this.f6518c) | composer.D(interfaceC15783O);
                C3125i c3125i = this.f6517b;
                int i11 = this.f6518c;
                Object objB3 = composer.B();
                if (zV || objB3 == companion.a()) {
                    objB3 = new a(c3125i, i11, interfaceC5872l0, interfaceC15783O);
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
        public static final C0 d(InterfaceC5872l0<C0> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5872l0<C0> interfaceC5872l0, C0 c02) {
            interfaceC5872l0.setValue(c02);
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
    public static final void g(final Ki.LocalThemeScope r44, androidx.compose.ui.Modifier r45, final java.util.List<Fq.ShoppingListItem> r46, final java.util.List<Fq.ShoppingListItem> r47, final boolean r48, androidx.compose.runtime.InterfaceC5872l0<java.lang.Boolean> r49, final boolean r50, final boolean r51, final kotlin.jvm.functions.Function1<? super Fq.ShoppingListItem, kotlin.Unit> r52, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC4612e, kotlin.Unit> r53, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dq.q.g(Ki.M, androidx.compose.ui.Modifier, java.util.List, java.util.List, boolean, androidx.compose.runtime.l0, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1, InterfaceC5872l0 interfaceC5872l0, int i10, int i11) {
        int i12 = i10 <= 0 ? 0 : i10 - 1;
        int size = i11 > 0 ? i11 - 1 : 0;
        if (i12 != size && i12 < h(interfaceC5872l0).size()) {
            if (size >= h(interfaceC5872l0).size()) {
                size = h(interfaceC5872l0).size() - 1;
            }
            function1.invoke(new a.MoveItem(h(interfaceC5872l0).get(size), size < h(interfaceC5872l0).size() + (-1) ? h(interfaceC5872l0).get(size + 1) : null));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1, InterfaceC5872l0 interfaceC5872l0, int i10, int i11) {
        int i12 = i10 <= 0 ? 0 : i10 - 1;
        int i13 = i11 > 0 ? i11 - 1 : 0;
        function1.invoke(h.AbstractC4612e.c.f26378a);
        List listM1 = CollectionsKt.m1(h(interfaceC5872l0));
        if (i12 < h(interfaceC5872l0).size() && i13 < h(interfaceC5872l0).size() && i13 >= 0) {
            C3124h.c(listM1, i12, i13);
        }
        k(interfaceC5872l0, listM1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n(ShoppingListItem it) {
        Intrinsics.j(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(List list, boolean z10, LocalThemeScope localThemeScope, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, C3125i c3125i, Function1 function1, Function1 function12, Function1 function13, boolean z11, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, -1, null, ComposableLambdaKt.composableLambdaInstance(422674576, true, new b(z10, localThemeScope, interfaceC5872l0)), 2, null);
        List<ShoppingListItem> listH = h(interfaceC5872l02);
        LazyColumn.i(listH.size(), new k(new Function2() { // from class: Dq.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return q.m(((Integer) obj).intValue(), (ShoppingListItem) obj2);
            }
        }, listH), new l(listH), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new m(listH, c3125i, z10, interfaceC5872l0, localThemeScope, function1, function12, function13, z11)));
        if (!list.isEmpty()) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1481912149, true, new d(z10, localThemeScope, interfaceC5872l0, function12)), 3, null);
            LazyColumn.i(list.size(), new h(new Function1() { // from class: Dq.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.n((ShoppingListItem) obj);
                }
            }, list), new i(g.f6492f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new j(list, interfaceC5872l0, z10, localThemeScope, function1, function12, function13)));
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1079980926, true, new f(localThemeScope)), 3, null);
        }
        l0.w.g(LazyColumn, null, null, C3117a.f6405a.a(), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(int i10, ShoppingListItem value) {
        Intrinsics.j(value, "value");
        return Long.valueOf(value.getListItemId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Modifier modifier, List list, List list2, boolean z10, InterfaceC5872l0 interfaceC5872l0, boolean z11, boolean z12, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, int i12, Composer composer, int i13) {
        g(localThemeScope, modifier, list, list2, z10, interfaceC5872l0, z11, z12, function1, function12, function13, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    private static final Modifier x(Modifier modifier, boolean z10, C3125i c3125i, int i10) {
        return androidx.compose.ui.b.c(modifier, null, new n(z10, c3125i, i10), 1, null);
    }

    private static final List<ShoppingListItem> h(InterfaceC5872l0<List<ShoppingListItem>> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void k(InterfaceC5872l0<List<ShoppingListItem>> interfaceC5872l0, List<ShoppingListItem> list) {
        interfaceC5872l0.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }
}

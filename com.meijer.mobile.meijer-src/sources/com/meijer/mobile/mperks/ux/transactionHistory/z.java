package com.meijer.mobile.mperks.ux.transactionHistory;

import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import Ki.T;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import co.AbstractC6536h;
import co.AbstractC6537i;
import com.meijer.mobile.mperks.ux.j0;
import com.meijer.mobile.mperks.ux.transactionHistory.AbstractC12809a;
import com.meijer.mobile.mperks.ux.transactionHistory.H;
import com.meijer.mobile.mperks.ux.transactionHistory.z;
import j0.C14889J;
import j0.C14903g;
import java.util.List;
import ki.InterfaceC15160b0;
import ki.a1;
import ki.q1;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.InterfaceC15433c;
import mv.InterfaceC15783O;
import no.ExpandableTransactionDetailItem;
import oi.C16206y0;
import oi.P0;
import p1.C16338g;
import qi.C16671b;
import yr.N;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u001aK\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0010\u001a+\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001c\u0010\u0010\u001a%\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010\"\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0007¢\u0006\u0004\b\"\u0010\u0017\u001a\u001d\u0010#\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b#\u0010\u0010\u001aA\u0010(\u001a\u00020\u0007*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b(\u0010)\u001au\u00100\u001a\u00020\u0007*\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020$0*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b0\u00101\u001a!\u00103\u001a\u00020\u0007*\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0003¢\u0006\u0004\b3\u00104¨\u00067²\u0006\u000e\u00105\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "transactionState", "", "isDisclaimerVisible", "Lkotlin/Function1;", "Lco/h;", "", "onNavigationRequest", "Lco/i;", "onResourceAction", "y", "(LKi/M;Lcom/meijer/mobile/mperks/ux/transactionHistory/H;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "G", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "t", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "I", "Lkotlin/Function0;", "onBackClicked", "K", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/mperks/ux/transactionHistory/a;", "pointBalanceState", "w", "(LKi/M;Lcom/meijer/mobile/mperks/ux/transactionHistory/a;Landroidx/compose/runtime/Composer;I)V", "A", "", "pointBalance", "C", "(LKi/M;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "dismissDisclaimer", "E", "S", "Lno/b;", "transaction", "LKi/T;", "backgroundColor", "M", "(LKi/M;Lno/b;LKi/T;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "transactions", "", "continuationToken", "indexToScroll", "isScrollToBottom", "U", "(LKi/M;Ljava/util/List;Ljava/lang/String;IZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onButtonClick", "r", "(LKi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isTransactionDetailExpanded", "isDisclaimerVisibleState", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115756a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115757b;

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f115756a = localThemeScope;
            this.f115757b = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(final Function0 function0, Di.o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            AdsInlineNotification.T(new Function0() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z.a.e(function0);
                }
            });
            return Unit.f143329a;
        }

        public final void c(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-168896348, i10, -1, "com.meijer.mobile.mperks.ux.transactionHistory.PointHistoryDisclaimer.<anonymous>.<anonymous> (TransactionHistoryView.kt:341)");
            }
            LocalThemeScope localThemeScope = this.f115756a;
            String strC = C16338g.c(j0.f115104R, composer, 0);
            q1.m.Inline informational = Assemble.getToastVariant().getInformational();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f115757b);
            final Function0<Unit> function0 = this.f115757b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return z.a.d(function0, (Di.o) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Di.j.i(localThemeScope, null, strC, null, informational, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 5);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            c(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115758a;

        b(LocalThemeScope localThemeScope) {
            this.f115758a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1344669198, i10, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryTopBar.<anonymous> (TransactionHistoryView.kt:198)");
            }
            LocalThemeScope localThemeScope = this.f115758a;
            si.j.h(localThemeScope, new q1.Label(null, this.f115758a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null), C16338g.c(j0.f115087L0, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115760b;

        c(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f115759a = localThemeScope;
            this.f115760b = function0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-63056752, i10, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryTopBar.<anonymous> (TransactionHistoryView.kt:207)");
            }
            LocalThemeScope localThemeScope = this.f115759a;
            C.f.d dVar = C.f.d.f17051e;
            T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
            String strC = C16338g.c(Cj.o.f5080p, composer, 0);
            Modifier modifierI = androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16));
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f115760b);
            final Function0<Unit> function0 = this.f115760b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return z.c.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C16671b.b(localThemeScope, new q1.h.DrawableIcon(dVar, strC, null, null, 0.0f, adsColorInverse, ClickableKt.d(modifierI, false, null, null, (Function0) objB, 7, null), 28, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
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
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f115761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC6537i, Unit> f115763c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f115764d;

        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, LocalThemeScope localThemeScope, Function1<? super AbstractC6537i, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f115761a = z10;
            this.f115762b = localThemeScope;
            this.f115763c = function1;
            this.f115764d = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
            function1.invoke(AbstractC6537i.c.f62758a);
            z.W(interfaceC5872l0, false);
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Composer composer2;
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1272872615, i10, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionsListview.<anonymous>.<anonymous>.<anonymous> (TransactionHistoryView.kt:531)");
            }
            composer.startReplaceGroup(835101153);
            if (this.f115761a && z.V(this.f115764d)) {
                LocalThemeScope localThemeScope = this.f115762b;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f115763c);
                final Function1<AbstractC6537i, Unit> function1 = this.f115763c;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f115764d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.B
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return z.d.c(function1, interfaceC5872l0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                composer2 = composer;
                z.E(localThemeScope, null, (Function0) objB, composer2, LocalThemeScope.f17314g, 1);
            } else {
                composer2 = composer;
            }
            composer2.P();
            z.S(this.f115762b, null, composer2, LocalThemeScope.f17314g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC6537i, Unit> f115766b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f115767c;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, Function1<? super AbstractC6537i, Unit> function1, String str) {
            this.f115765a = localThemeScope;
            this.f115766b = function1;
            this.f115767c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, String str) {
            function1.invoke(new AbstractC6537i.OnLoadMoreButtonClick(str));
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(851804793, i10, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionsListview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TransactionHistoryView.kt:554)");
            }
            LocalThemeScope localThemeScope = this.f115765a;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f115766b) | composer.V(this.f115767c);
            final Function1<AbstractC6537i, Unit> function1 = this.f115766b;
            final String str = this.f115767c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return z.e.c(function1, str);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            z.r(localThemeScope, (Function0) objB, composer, LocalThemeScope.f17314g);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryViewKt$TransactionsListview$2$1", f = "TransactionHistoryView.kt", l = {566}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15429A f115769b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f115770c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f115769b, this.f115770c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C15429A c15429a, int i10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f115769b = c15429a;
            this.f115770c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115768a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C15429A c15429a = this.f115769b;
                int i11 = this.f115770c;
                this.f115768a = 1;
                if (C15429A.l(c15429a, i11, 0, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f115771f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(1);
            this.f115771f = list;
        }

        public final Object a(int i10) {
            this.f115771f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f115772f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115773g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f115774h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f115772f = list;
            this.f115773g = localThemeScope;
            this.f115774h = function1;
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
            ExpandableTransactionDetailItem expandableTransactionDetailItem = (ExpandableTransactionDetailItem) this.f115772f.get(i10);
            composer.startReplaceGroup(-778349926);
            int i13 = i10 % 2;
            Ki.z adsColors = this.f115773g.getAdsColors();
            z.M(this.f115773g, expandableTransactionDetailItem, i13 == 0 ? adsColors.getAdsColorUIBackground02() : adsColors.getAdsColorInverse(), null, this.f115774h, composer, LocalThemeScope.f17314g | (T.f17342b << 6), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void A(final Ki.LocalThemeScope r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.z.A(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void C(final Ki.LocalThemeScope r40, final int r41, androidx.compose.ui.Modifier r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.z.C(Ki.M, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Composer composer, int i13) throws Resources.NotFoundException {
        C(localThemeScope, i10, modifier, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    public static final void E(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> dismissDisclaimer, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(dismissDisclaimer, "dismissDisclaimer");
        Composer composerStartRestartGroup = composer.startRestartGroup(962465973);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(dismissDisclaimer) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(962465973, i12, -1, "com.meijer.mobile.mperks.ux.transactionHistory.PointHistoryDisclaimer (TransactionHistoryView.kt:335)");
            }
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(modifier, H1.h.p(12), H1.h.p(8));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierJ);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            Q.e(localThemeScope, a1.f142015a, ComposableLambdaKt.c(-168896348, true, new a(localThemeScope, dismissDisclaimer), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (a1.f142016b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.F(localThemeScope, modifier2, dismissDisclaimer, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void G(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.z.G(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        G(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        I(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.z.K(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        K(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void M(final Ki.LocalThemeScope r41, final no.ExpandableTransactionDetailItem r42, final Ki.T r43, androidx.compose.ui.Modifier r44, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.z.M(Ki.M, no.b, Ki.T, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5872l0 N() {
        return t1.e(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(LocalThemeScope localThemeScope, ExpandableTransactionDetailItem expandableTransactionDetailItem, T t10, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        M(localThemeScope, expandableTransactionDetailItem, t10, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void S(Ki.LocalThemeScope r37, androidx.compose.ui.Modifier r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.z.S(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        S(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void U(final Ki.LocalThemeScope r26, final java.util.List<no.ExpandableTransactionDetailItem> r27, final java.lang.String r28, final int r29, final boolean r30, final boolean r31, androidx.compose.ui.Modifier r32, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r33, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.z.U(Ki.M, java.util.List, java.lang.String, int, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(List list, String str, boolean z10, LocalThemeScope localThemeScope, Function1 function1, InterfaceC5872l0 interfaceC5872l0, Function1 function12, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1272872615, true, new d(z10, localThemeScope, function1, interfaceC5872l0)), 3, null);
        LazyColumn.i(list.size(), null, new g(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new h(list, localThemeScope, function12)));
        if (str != null) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(851804793, true, new e(localThemeScope, function1, str)), 3, null);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(LocalThemeScope localThemeScope, List list, String str, int i10, boolean z10, boolean z11, Modifier modifier, Function1 function1, Function1 function12, int i11, int i12, Composer composer, int i13) {
        U(localThemeScope, list, str, i10, z10, z11, modifier, function1, function12, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final LocalThemeScope localThemeScope, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1321349704);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1321349704, i11, -1, "com.meijer.mobile.mperks.ux.transactionHistory.LoadMoreButton (TransactionHistoryView.kt:573)");
            }
            P0.k(localThemeScope, C16206y0.f154282a, C16338g.c(j0.f115072G0, composerStartRestartGroup, 0), function0, null, null, false, 0L, false, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | (C16206y0.f154283b << 3) | ((i11 << 6) & 7168), 248);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.s(localThemeScope, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, Function0 function0, int i10, Composer composer, int i11) {
        r(localThemeScope, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void t(final Ki.LocalThemeScope r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function1<? super co.AbstractC6537i, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.z.t(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1) {
        function1.invoke(AbstractC6537i.h.f62768a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void w(LocalThemeScope localThemeScope, final AbstractC12809a pointBalanceState, Composer composer, final int i10) throws Resources.NotFoundException {
        int i11;
        final LocalThemeScope localThemeScope2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(pointBalanceState, "pointBalanceState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1918182458);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(pointBalanceState) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1918182458, i11, -1, "com.meijer.mobile.mperks.ux.transactionHistory.ObservePointBalanceStates (TransactionHistoryView.kt:224)");
            }
            if (pointBalanceState instanceof AbstractC12809a.b) {
                composerStartRestartGroup.startReplaceGroup(832378163);
                A(localThemeScope, null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g, 1);
                composerStartRestartGroup.P();
                localThemeScope2 = localThemeScope;
            } else if (pointBalanceState instanceof AbstractC12809a.PointBalanceSuccess) {
                composerStartRestartGroup.startReplaceGroup(832380682);
                localThemeScope2 = localThemeScope;
                C(localThemeScope2, ((AbstractC12809a.PointBalanceSuccess) pointBalanceState).getPointBalance(), null, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14), 2);
                composerStartRestartGroup.P();
            } else {
                localThemeScope2 = localThemeScope;
                if (!(pointBalanceState instanceof AbstractC12809a.C1828a)) {
                    composerStartRestartGroup.startReplaceGroup(832375896);
                    composerStartRestartGroup.P();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(832383981);
                C(localThemeScope2, 0, null, composerStartRestartGroup, LocalThemeScope.f17314g | 48 | (i11 & 14), 2);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.x(localThemeScope2, pointBalanceState, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, AbstractC12809a abstractC12809a, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        w(localThemeScope, abstractC12809a, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void y(final LocalThemeScope localThemeScope, final H transactionState, final boolean z10, final Function1<? super AbstractC6536h, Unit> onNavigationRequest, final Function1<? super AbstractC6537i, Unit> onResourceAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(transactionState, "transactionState");
        Intrinsics.j(onNavigationRequest, "onNavigationRequest");
        Intrinsics.j(onResourceAction, "onResourceAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(142087959);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(transactionState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onNavigationRequest) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onResourceAction) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(142087959, i11, -1, "com.meijer.mobile.mperks.ux.transactionHistory.ObserveTransactionsStates (TransactionHistoryView.kt:73)");
            }
            if (transactionState instanceof H.d) {
                composerStartRestartGroup.startReplaceGroup(-1895038220);
                I(localThemeScope, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14), 1);
                composerStartRestartGroup.P();
            } else if (transactionState instanceof H.a) {
                composerStartRestartGroup.startReplaceGroup(-1894929410);
                t(localThemeScope, null, onResourceAction, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | ((i11 >> 6) & 896), 1);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.P();
            } else if (transactionState instanceof H.TransactionListState) {
                composerStartRestartGroup.startReplaceGroup(-1894755376);
                H.TransactionListState transactionListState = (H.TransactionListState) transactionState;
                int i12 = i11;
                List<ExpandableTransactionDetailItem> listB = transactionListState.b();
                String continuationToken = transactionListState.getContinuationToken();
                int indexToScroll = transactionListState.getIndexToScroll();
                boolean isScrollToBottom = transactionListState.getIsScrollToBottom();
                int i13 = LocalThemeScope.f17314g | (i12 & 14) | ((i12 << 9) & 458752);
                int i14 = i12 << 12;
                U(localThemeScope, listB, continuationToken, indexToScroll, isScrollToBottom, z10, null, onNavigationRequest, onResourceAction, composerStartRestartGroup, i13 | (29360128 & i14) | (i14 & 234881024), 32);
                composerStartRestartGroup.P();
            } else {
                int i15 = i11;
                if (!(transactionState instanceof H.b)) {
                    composerStartRestartGroup.startReplaceGroup(-892415779);
                    composerStartRestartGroup.P();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1894212008);
                G(localThemeScope, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i15 & 14), 1);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.z(localThemeScope, transactionState, z10, onNavigationRequest, onResourceAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, H h10, boolean z10, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        y(localThemeScope, h10, z10, function1, function12, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final void I(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1505362079);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1505362079, i12, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryLoadingView (TransactionHistoryView.kt:178)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierF);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            N.b(localThemeScope, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 1);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.J(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean O(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void P(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(InterfaceC5872l0 interfaceC5872l0) {
        P(interfaceC5872l0, !O(interfaceC5872l0));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}

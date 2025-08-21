package com.meijer.mobile.mperks.ux.transactionHistory;

import Ki.LocalThemeScope;
import Ki.T;
import L1.C4010g;
import L1.D;
import L1.x;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import co.AbstractC6536h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.ExpandTransactionHeader;
import no.TransactionDetail;
import r1.C16819m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0012\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LKi/M;", "Lno/a;", "expandTransactionHeader", "LKi/T;", "backgroundColor", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lno/f;", "transactionDetails", "Lkotlin/Function1;", "Lco/h;", "", "onNavigationRequest", "g", "(LKi/M;Lno/a;LKi/T;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onViewDetailsClick", "j", "(LKi/M;Lno/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "transactionDetail", "e", "(LKi/M;Lno/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f115644f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f115644f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f115644f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f115645f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f115646g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f115647h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ExpandTransactionHeader f115648i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115649j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f115650k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, ExpandTransactionHeader expandTransactionHeader, LocalThemeScope localThemeScope, Function0 function02) {
            super(2);
            this.f115646g = nVar;
            this.f115647h = function0;
            this.f115648i = expandTransactionHeader;
            this.f115649j = localThemeScope;
            this.f115650k = function02;
            this.f115645f = i10;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(androidx.compose.runtime.Composer r45, int r46) {
            /*
                Method dump skipped, instructions count: 918
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.M.b.a(androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f115651a = new c();

        c() {
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f115652a;

        d(L1.h hVar) {
            this.f115652a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getBottom(), this.f115652a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f115652a.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f115653a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f115654b;

        e(L1.h hVar, L1.h hVar2) {
            this.f115653a = hVar;
            this.f115654b = hVar2;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f115653a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f115654b.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f115655a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f115656b;

        f(L1.h hVar, L1.h hVar2) {
            this.f115655a = hVar;
            this.f115656b = hVar2;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), this.f115655a.getBottom(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), this.f115656b.getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f115657a;

        g(L1.h hVar) {
            this.f115657a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), this.f115657a.getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115658a;

        h(Function0<Unit> function0) {
            this.f115658a = function0;
        }

        public final void a() {
            this.f115658a.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e(final Ki.LocalThemeScope r26, no.TransactionDetail r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.M.e(Ki.M, no.f, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, TransactionDetail transactionDetail, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, transactionDetail, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r25, final no.ExpandTransactionHeader r26, final Ki.T r27, androidx.compose.ui.Modifier r28, java.util.List<no.TransactionDetail> r29, final kotlin.jvm.functions.Function1<? super co.AbstractC6536h, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.M.g(Ki.M, no.a, Ki.T, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, ExpandTransactionHeader expandTransactionHeader) {
        function1.invoke(new AbstractC6536h.OnNavigateToOrderDetail(expandTransactionHeader.getOrderNumber()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, ExpandTransactionHeader expandTransactionHeader, T t10, Modifier modifier, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, expandTransactionHeader, t10, modifier, list, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void j(final LocalThemeScope localThemeScope, ExpandTransactionHeader expandTransactionHeader, Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        final ExpandTransactionHeader expandTransactionHeader2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(135007380);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(expandTransactionHeader) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            expandTransactionHeader2 = expandTransactionHeader;
            function02 = function0;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(135007380, i11, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionsDetailsHeader (TransactionsDetails.kt:91)");
            }
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(16), H1.h.p(12));
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicyA = pairH.a();
            Function0<Unit> function0B = pairH.b();
            Modifier modifierD = C16819m.d(modifierJ, false, new a(a10), 1, null);
            b bVar = new b(nVar, 6, function0B, expandTransactionHeader, localThemeScope, function0);
            expandTransactionHeader2 = expandTransactionHeader;
            function02 = function0;
            androidx.compose.ui.layout.A.a(modifierD, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, bVar), measurePolicyA, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.L
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.k(localThemeScope, expandTransactionHeader2, function02, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, ExpandTransactionHeader expandTransactionHeader, Function0 function0, int i10, Composer composer, int i11) {
        j(localThemeScope, expandTransactionHeader, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}

package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import Hk.Validation;
import Ji.C;
import Ji.LocalThemeScope;
import Oj.a;
import P0.e;
import V0.C5346q0;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.input.KeyboardType;
import ck.C6408b;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z;
import com.meijer.mobile.mperks.ux.j0;
import d0.C13457y;
import j0.InterfaceC14794C;
import ji.InterfaceC14919W;
import ji.InterfaceC14920X;
import ji.R0;
import ji.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import ni.C15801E;
import ni.P0;
import p1.C16190d;
import p1.C16193g;
import yr.C18299z;
import zi.H1;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u001aU\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001aw\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u009c\u0001\u00101\u001a\u00020\u0006*\u00020\u00002\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00060\tH\u0003¢\u0006\u0004\b1\u00102\u001a3\u00106\u001a\u00020\u0006*\u00020\u00002\u0006\u00104\u001a\u0002032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b6\u00107\u001aC\u00109\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b9\u0010:¨\u0006?²\u0006\u000e\u0010;\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010<\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010=\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u0002038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;", "fuelReceiptViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onBackPressed", "navigateBackToEntryPage", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/W;", "onResourceAction", "A", "(LJi/M;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LBi/o;", "loadingStatus", "Lak/a;", "title", "", "primaryButtonText", "secondaryButtonText", "description", "addAnotherReceipt", "P", "(LJi/M;LBi/o;Lak/a;Ljava/lang/String;Ljava/lang/String;Lak/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Ld0/V;", "scrollState", "x", "(LJi/M;Ld0/V;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "L", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "q", "(LJi/M;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "fieldName", "fieldValue", "placeHolder", "viewId", "fieldContentDescription", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/V;", "infoRes", "overlayViewId", "errorMessage", "fieldDescription", "Lz1/W;", "visualTransformation", "Lkotlin/ParameterName;", "name", "newValue", "onValueChange", "C", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/V;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lak/a;Ljava/lang/String;Lz1/W;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "isEnabled", "onClick", "S", "(LJi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onDismiss", "N", "(LJi/M;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/V;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "showOverlayScreen", "hasFocus", "displayError", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P.FuelReceiptViewState f105802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105803b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105804c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105805d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z$a$a, reason: collision with other inner class name */
        static final class C1573a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105806a;

            C1573a(LocalThemeScope localThemeScope) {
                this.f105806a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1443300123, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormScreen.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:105)");
                }
                Dr.g.g(this.f105806a, C16193g.c(Y.f100167l, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(P.FuelReceiptViewState fuelReceiptViewState, Function0<Unit> function0, Function0<Unit> function02, LocalThemeScope localThemeScope) {
            this.f105802a = fuelReceiptViewState;
            this.f105803b = function0;
            this.f105804c = function02;
            this.f105805d = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2115198939, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormScreen.<anonymous> (FuelReceiptFormComposable.kt:103)");
            }
            AbstractC5607a abstractC5607aD = !this.f105802a.getShowReceiptLoading() ? AbstractC5607a.INSTANCE.d(j0.f114269w, new Object[0]) : AbstractC5607a.INSTANCE.d(j0.f114146N, new Object[0]);
            Ji.C c10 = !this.f105802a.getShowReceiptLoading() ? C.f.d.f15507e : C.f.o.f15522e;
            Function0<Unit> function0 = !this.f105802a.getShowReceiptLoading() ? this.f105803b : this.f105804c;
            LocalThemeScope localThemeScope = this.f105805d;
            Dr.g.f(localThemeScope, null, null, null, ComposableLambdaKt.c(1443300123, true, new C1573a(localThemeScope), composer, 54), function0, c10, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.f15502d << 18) | (AbstractC5607a.f45514b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P.FuelReceiptViewState f105807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105808b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0.V f105809c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<W, Unit> f105810d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105811e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105812f;

        /* JADX WARN: Multi-variable type inference failed */
        b(P.FuelReceiptViewState fuelReceiptViewState, LocalThemeScope localThemeScope, d0.V v10, Function1<? super W, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
            this.f105807a = fuelReceiptViewState;
            this.f105808b = localThemeScope;
            this.f105809c = v10;
            this.f105810d = function1;
            this.f105811e = function0;
            this.f105812f = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(W it) {
            Intrinsics.j(it, "it");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k() {
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(W it) {
            Intrinsics.j(it, "it");
            return Unit.f142422a;
        }

        public final void e(InterfaceC14794C contentPadding, Composer composer, int i10) {
            int i11;
            Intrinsics.j(contentPadding, "contentPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(contentPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(826733186, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormScreen.<anonymous> (FuelReceiptFormComposable.kt:126)");
            }
            if (this.f105807a.getShowReceiptLoading()) {
                composer.startReplaceGroup(1866033877);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), contentPadding);
                P.FuelReceiptViewState fuelReceiptViewState = this.f105807a;
                LocalThemeScope localThemeScope = this.f105808b;
                Function0<Unit> function0 = this.f105811e;
                Function1<W, Unit> function1 = this.f105810d;
                Function0<Unit> function02 = this.f105812f;
                MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Oj.a loadingState = fuelReceiptViewState.getLoadingState();
                if ((loadingState instanceof a.Loading) || (loadingState instanceof a.Paging)) {
                    composer.startReplaceGroup(-526815583);
                    Bi.o oVar = Bi.o.f2584a;
                    AbstractC5607a.Companion companion3 = AbstractC5607a.INSTANCE;
                    AbstractC5607a abstractC5607aD = companion3.d(Y.f100005cg, new Object[0]);
                    AbstractC5607a abstractC5607aD2 = companion3.d(Y.f99985bg, new Object[0]);
                    Modifier modifierH2 = androidx.compose.foundation.layout.D.h(companion, contentPadding);
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objB == companion4.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.A
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return z.b.f((W) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    Function1 function12 = (Function1) objB;
                    composer.P();
                    composer.startReplaceGroup(1849434622);
                    Object objB2 = composer.B();
                    if (objB2 == companion4.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.B
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return z.b.g();
                            }
                        };
                        composer.t(objB2);
                    }
                    Function0 function03 = (Function0) objB2;
                    composer.P();
                    int i12 = 905969712 | LocalThemeScope.f15770g;
                    int i13 = AbstractC5607a.f45514b;
                    z.P(localThemeScope, oVar, abstractC5607aD, null, null, abstractC5607aD2, modifierH2, function0, function12, function03, composer, i12 | (i13 << 6) | (i13 << 15), 12);
                    composer.P();
                } else if (loadingState instanceof a.Failed) {
                    composer.startReplaceGroup(-526002546);
                    Bi.o oVar2 = Bi.o.f2585b;
                    AbstractC5607a.Companion companion5 = AbstractC5607a.INSTANCE;
                    AbstractC5607a abstractC5607aD3 = companion5.d(Y.f99965ag, new Object[0]);
                    AbstractC5607a abstractC5607aD4 = companion5.d(Y.f99945Zf, new Object[0]);
                    String strC = C16193g.c(Y.f99525Dd, composer, 0);
                    String strC2 = C16193g.c(Y.f99548Eh, composer, 0);
                    Modifier modifierH3 = androidx.compose.foundation.layout.D.h(companion, contentPadding);
                    composer.startReplaceGroup(1849434622);
                    Object objB3 = composer.B();
                    if (objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.C
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return z.b.k();
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    int i14 = 12582960 | LocalThemeScope.f15770g;
                    int i15 = AbstractC5607a.f45514b;
                    z.P(localThemeScope, oVar2, abstractC5607aD3, strC, strC2, abstractC5607aD4, modifierH3, (Function0) objB3, function1, function02, composer, i14 | (i15 << 6) | (i15 << 15), 0);
                    composer.P();
                } else {
                    if (!(loadingState instanceof a.NotLoading)) {
                        composer.startReplaceGroup(121551021);
                        composer.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-525074716);
                    Bi.o oVar3 = Bi.o.f2586c;
                    AbstractC5607a.Companion companion6 = AbstractC5607a.INSTANCE;
                    AbstractC5607a abstractC5607aD5 = companion6.d(Y.f100045eg, new Object[0]);
                    AbstractC5607a abstractC5607aD6 = companion6.d(Y.f100025dg, new Object[0]);
                    String strC3 = C16193g.c(Y.f99458A3, composer, 0);
                    String strC4 = C16193g.c(Y.f99849Ue, composer, 0);
                    Modifier modifierH4 = androidx.compose.foundation.layout.D.h(companion, contentPadding);
                    composer.startReplaceGroup(1849434622);
                    Object objB4 = composer.B();
                    if (objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.D
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return z.b.l((W) obj);
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    int i16 = 100663344 | LocalThemeScope.f15770g;
                    int i17 = AbstractC5607a.f45514b;
                    z.P(localThemeScope, oVar3, abstractC5607aD5, strC3, strC4, abstractC5607aD6, modifierH4, function0, (Function1) objB4, function02, composer, i16 | (i17 << 6) | (i17 << 15), 0);
                    composer.P();
                }
                composer.v();
                composer.P();
            } else {
                composer.startReplaceGroup(1868918954);
                z.x(this.f105808b, this.f105809c, this.f105807a, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding), this.f105810d, composer, LocalThemeScope.f15770g, 0);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            e(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f105813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105814b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f105815c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f105816d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f105817e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f105818f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f105819g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ z1.W f105820h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f105821i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f105822j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f105823k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f105824l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f105825m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f105826n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f105827o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f105828p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105829a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f105830b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f105831c;

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                this.f105829a = localThemeScope;
                this.f105830b = interfaceC14919W;
                this.f105831c = abstractC5607a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1781150904, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:524)");
                }
                ri.j.h(this.f105829a, this.f105830b.getLabels().getInfoBlockMessage(), C6408b.a(this.f105831c, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5730l0 interfaceC5730l0) {
            z.E(interfaceC5730l0, true);
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, LocalThemeScope localThemeScope, String str, String str2, Function1<? super String, Unit> function1, String str3, AbstractC5607a abstractC5607a, z1.W w10, InterfaceC5772o interfaceC5772o, String str4, String str5, String str6, String str7, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
            this.f105813a = modifier;
            this.f105814b = localThemeScope;
            this.f105815c = str;
            this.f105816d = str2;
            this.f105817e = function1;
            this.f105818f = str3;
            this.f105819g = abstractC5607a;
            this.f105820h = w10;
            this.f105821i = interfaceC5772o;
            this.f105822j = str4;
            this.f105823k = str5;
            this.f105824l = str6;
            this.f105825m = str7;
            this.f105826n = interfaceC5730l0;
            this.f105827o = interfaceC5730l02;
            this.f105828p = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC14919W interfaceC14919W, String str, String str2, String str3, String str4, AbstractC5607a abstractC5607a, final InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.g(interfaceC14919W.getIcons().getLabelIcon(), C.i.h.f15557d, str, new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z.c.q(interfaceC5730l0);
                }
            });
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str2);
            if (str3 != null) {
                AdsInputField.e(interfaceC14919W.getLabels().getDescription(), str3);
            }
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str4);
            if (!C5608b.a(abstractC5607a) && !z.F(interfaceC5730l02) && z.H(interfaceC5730l03)) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1781150904, true, new a(localThemeScope, interfaceC14919W, abstractC5607a)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function1 function1, String str, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            z.G(interfaceC5730l0, onFocusChanged.a());
            if (onFocusChanged.b()) {
                z.I(interfaceC5730l02, true);
            }
            if (!onFocusChanged.a()) {
                function1.invoke(str);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput s(z1.W w10, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, w10 == null ? z1.W.INSTANCE.c() : w10, new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5693z(new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.K
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.c.t(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.L
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.c.u(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 58, null), false, 0, null, null, null, 3983, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            l(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void l(final ji.InterfaceC14919W r22, androidx.compose.runtime.Composer r23, int r24) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.c.l(ji.W, androidx.compose.runtime.Composer, int):void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105832a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f105833b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f105834c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ V f105835d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f105836e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105837f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f105838a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f105839b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ V f105840c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f105841d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105842e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f105843f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z$d$a$a, reason: collision with other inner class name */
            static final class C1574a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Modifier f105844a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f105845b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ V f105846c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f105847d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105848e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f105849f;

                C1574a(Modifier modifier, String str, V v10, String str2, LocalThemeScope localThemeScope, Function0<Unit> function0) {
                    this.f105844a = modifier;
                    this.f105845b = str;
                    this.f105846c = v10;
                    this.f105847d = str2;
                    this.f105848e = localThemeScope;
                    this.f105849f = function0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1550468317, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.OverlayScreen.<anonymous>.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:577)");
                    }
                    Modifier modifierD = androidx.compose.foundation.b.d(C18299z.f(androidx.compose.foundation.layout.J.f(this.f105844a, 0.0f, 1, null), this.f105845b, null, 2, null), C5346q0.INSTANCE.i(), null, 2, null);
                    V v10 = this.f105846c;
                    Modifier modifier = this.f105844a;
                    String str = this.f105847d;
                    LocalThemeScope localThemeScope = this.f105848e;
                    Function0<Unit> function0 = this.f105849f;
                    e.Companion companion = P0.e.INSTANCE;
                    MeasurePolicy measurePolicyG = C5662h.g(companion.o(), false);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                    C13457y.a(C16190d.c(v10.getDrawableRes(), composer, 0), str, c5664j.g(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null), 0.0f, H1.h.p(72), 1, null), companion.e()), null, InterfaceC5784k.INSTANCE.b(), 0.0f, null, composer, 24576, 104);
                    P0.i(localThemeScope, C15801E.f151425a, function0, C.f.o.f15522e, C16193g.c(Y.f100169l1, composer, 0), c5664j.g(modifier, companion.n()), false, false, 0L, composer, LocalThemeScope.f15770g | (C15801E.f151426b << 3) | (C.f.o.f15523f << 9), 224);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(Modifier modifier, String str, V v10, String str2, LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f105838a = modifier;
                this.f105839b = str;
                this.f105840c = v10;
                this.f105841d = str2;
                this.f105842e = localThemeScope;
                this.f105843f = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(149565337, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.OverlayScreen.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:573)");
                }
                t1.a(androidx.compose.foundation.layout.J.f(this.f105838a, 0.0f, 1, null), null, C5346q0.INSTANCE.i(), 0L, null, 0.0f, ComposableLambdaKt.c(1550468317, true, new C1574a(this.f105838a, this.f105839b, this.f105840c, this.f105841d, this.f105842e, this.f105843f), composer, 54), composer, 1573248, 58);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(Function0<Unit> function0, Modifier modifier, String str, V v10, String str2, LocalThemeScope localThemeScope) {
            this.f105832a = function0;
            this.f105833b = modifier;
            this.f105834c = str;
            this.f105835d = v10;
            this.f105836e = str2;
            this.f105837f = localThemeScope;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(350693968, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.OverlayScreen.<anonymous> (FuelReceiptFormComposable.kt:572)");
            }
            Function0<Unit> function0 = this.f105832a;
            androidx.compose.ui.window.a.a(function0, null, ComposableLambdaKt.c(149565337, true, new a(this.f105833b, this.f105834c, this.f105835d, this.f105836e, this.f105837f, function0), composer, 54), composer, 384, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105850a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bi.o f105851b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f105852c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f105853d;

        e(LocalThemeScope localThemeScope, Bi.o oVar, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
            this.f105850a = localThemeScope;
            this.f105851b = oVar;
            this.f105852c = abstractC5607a;
            this.f105853d = abstractC5607a2;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-154480246, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.ReceiptSubmitStateScreen.<anonymous>.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:221)");
            }
            LocalThemeScope localThemeScope = this.f105850a;
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = this.f105851b;
            AbstractC5607a abstractC5607a = this.f105852c;
            int i11 = AbstractC5607a.f45514b;
            Bi.m.d(localThemeScope, null, largeLoading, oVar, C6408b.a(abstractC5607a, composer, i11), C6408b.a(this.f105853d, composer, i11), null, composer, LocalThemeScope.f15770g | (q1.k.Large.f140090f << 6), 33);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0120 A[PHI: r23
      0x0120: PHI (r23v15 int) = (r23v0 int), (r23v6 int), (r23v7 int) binds: [B:102:0x011e, B:112:0x013b, B:111:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void C(final Ji.LocalThemeScope r31, final java.lang.String r32, final java.lang.String r33, final java.lang.String r34, final java.lang.String r35, final java.lang.String r36, final com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.V r37, final java.lang.String r38, androidx.compose.ui.Modifier r39, ak.AbstractC5607a r40, java.lang.String r41, z1.W r42, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.C(Ji.M, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.V, java.lang.String, androidx.compose.ui.Modifier, ak.a, java.lang.String, z1.W, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(InterfaceC5730l0 interfaceC5730l0) {
        E(interfaceC5730l0, false);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P(final Ji.LocalThemeScope r32, final Bi.o r33, final ak.AbstractC5607a r34, java.lang.String r35, java.lang.String r36, final ak.AbstractC5607a r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W, kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.P(Ji.M, Bi.o, ak.a, java.lang.String, java.lang.String, ak.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(final Ji.LocalThemeScope r37, final com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P.FuelReceiptViewState r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.A(Ji.M, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, P.FuelReceiptViewState fuelReceiptViewState, Modifier modifier, Function0 function0, Function0 function02, Function1 function1, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, fuelReceiptViewState, modifier, function0, function02, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, String str5, V v10, String str6, Modifier modifier, AbstractC5607a abstractC5607a, String str7, z1.W w10, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        C(localThemeScope, str, str2, str3, str4, str5, v10, str6, modifier, abstractC5607a, str7, w10, function1, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void L(Ji.LocalThemeScope r37, androidx.compose.ui.Modifier r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.L(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void N(final Ji.LocalThemeScope r12, final com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.V r13, final java.lang.String r14, final java.lang.String r15, androidx.compose.ui.Modifier r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.N(Ji.M, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.V, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, V v10, String str, String str2, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, v10, str, str2, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(LocalThemeScope localThemeScope, Bi.o oVar, AbstractC5607a abstractC5607a, String str, String str2, AbstractC5607a abstractC5607a2, Modifier modifier, Function0 function0, Function1 function1, Function0 function02, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, oVar, abstractC5607a, str, str2, abstractC5607a2, modifier, function0, function1, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void S(final Ji.LocalThemeScope r16, final boolean r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.S(Ji.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        S(localThemeScope, z10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void q(final Ji.LocalThemeScope r31, final com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P.FuelReceiptViewState r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.q(Ji.M, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, String updatedDate) {
        Intrinsics.j(updatedDate, "updatedDate");
        function1.invoke(new W.OnFuelFormFieldChange(new M.Date(new Validation(updatedDate, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, String updatedTxNumber) {
        Intrinsics.j(updatedTxNumber, "updatedTxNumber");
        function1.invoke(new W.OnFuelFormFieldChange(new M.TxNumber(new Validation(updatedTxNumber, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, String updatedTmNumber) {
        Intrinsics.j(updatedTmNumber, "updatedTmNumber");
        function1.invoke(new W.OnFuelFormFieldChange(new M.TmNumber(new Validation(updatedTmNumber, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1, String updatedStNumber) {
        Intrinsics.j(updatedStNumber, "updatedStNumber");
        function1.invoke(new W.OnFuelFormFieldChange(new M.StNumber(new Validation(updatedStNumber, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1, String updatedTime) {
        Intrinsics.j(updatedTime, "updatedTime");
        function1.invoke(new W.OnFuelFormFieldChange(new M.Time(new Validation(updatedTime, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, P.FuelReceiptViewState fuelReceiptViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, fuelReceiptViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final Ji.LocalThemeScope r31, final d0.V r32, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P.FuelReceiptViewState r33, androidx.compose.ui.Modifier r34, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.x(Ji.M, d0.V, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function1 function1, P.FuelReceiptViewState fuelReceiptViewState) {
        function1.invoke(new W.SubmitFuelReceipt(fuelReceiptViewState.getFuelReceiptDecorator()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, d0.V v10, P.FuelReceiptViewState fuelReceiptViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, v10, fuelReceiptViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final boolean D(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(String str, String str2, Function0 function0, Function1 function1) {
        if (Intrinsics.e(str, str2)) {
            function0.invoke();
        } else {
            function1.invoke(W.a.f105709a);
        }
        return Unit.f142422a;
    }
}

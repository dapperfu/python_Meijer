package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import Ai.H1;
import Ik.Validation;
import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import Pj.a;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.input.KeyboardType;
import bk.AbstractC6392a;
import bk.C6393b;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z;
import com.meijer.mobile.mperks.ux.j0;
import d0.C13590y;
import dk.C13698b;
import j0.InterfaceC14882C;
import ki.InterfaceC15153W;
import ki.InterfaceC15154X;
import ki.R0;
import ki.q1;
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
import oi.C16135E;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import yr.C18370z;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u001aU\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001aw\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u009c\u0001\u00101\u001a\u00020\u0006*\u00020\u00002\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00060\tH\u0003¢\u0006\u0004\b1\u00102\u001a3\u00106\u001a\u00020\u0006*\u00020\u00002\u0006\u00104\u001a\u0002032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b6\u00107\u001aC\u00109\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b9\u0010:¨\u0006?²\u0006\u000e\u0010;\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010<\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010=\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u0002038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;", "fuelReceiptViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onBackPressed", "navigateBackToEntryPage", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/W;", "onResourceAction", "A", "(LKi/M;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LCi/o;", "loadingStatus", "Lbk/a;", "title", "", "primaryButtonText", "secondaryButtonText", "description", "addAnotherReceipt", "P", "(LKi/M;LCi/o;Lbk/a;Ljava/lang/String;Ljava/lang/String;Lbk/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Ld0/V;", "scrollState", "x", "(LKi/M;Ld0/V;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "L", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "q", "(LKi/M;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "fieldName", "fieldValue", "placeHolder", "viewId", "fieldContentDescription", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/V;", "infoRes", "overlayViewId", "errorMessage", "fieldDescription", "Lz1/W;", "visualTransformation", "Lkotlin/ParameterName;", "name", "newValue", "onValueChange", "C", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/V;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lbk/a;Ljava/lang/String;Lz1/W;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "isEnabled", "onClick", "S", "(LKi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onDismiss", "N", "(LKi/M;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/V;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "showOverlayScreen", "hasFocus", "displayError", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P.FuelReceiptViewState f106657a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f106658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f106659c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f106660d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z$a$a, reason: collision with other inner class name */
        static final class C1582a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f106661a;

            C1582a(LocalThemeScope localThemeScope) {
                this.f106661a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1443300123, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormScreen.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:105)");
                }
                Dr.g.g(this.f106661a, C16338g.c(Y.f101029l, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        a(P.FuelReceiptViewState fuelReceiptViewState, Function0<Unit> function0, Function0<Unit> function02, LocalThemeScope localThemeScope) {
            this.f106657a = fuelReceiptViewState;
            this.f106658b = function0;
            this.f106659c = function02;
            this.f106660d = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2115198939, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormScreen.<anonymous> (FuelReceiptFormComposable.kt:103)");
            }
            AbstractC6392a abstractC6392aD = !this.f106657a.getShowReceiptLoading() ? AbstractC6392a.INSTANCE.d(j0.f115214w, new Object[0]) : AbstractC6392a.INSTANCE.d(j0.f115089M, new Object[0]);
            Ki.C c10 = !this.f106657a.getShowReceiptLoading() ? C.f.d.f17051e : C.f.o.f17066e;
            Function0<Unit> function0 = !this.f106657a.getShowReceiptLoading() ? this.f106658b : this.f106659c;
            LocalThemeScope localThemeScope = this.f106660d;
            Dr.g.f(localThemeScope, null, null, null, ComposableLambdaKt.c(1443300123, true, new C1582a(localThemeScope), composer, 54), function0, c10, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.f17046d << 18) | (AbstractC6392a.f60445b << 27), 199);
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
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P.FuelReceiptViewState f106662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f106663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0.V f106664c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<W, Unit> f106665d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f106666e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f106667f;

        /* JADX WARN: Multi-variable type inference failed */
        b(P.FuelReceiptViewState fuelReceiptViewState, LocalThemeScope localThemeScope, d0.V v10, Function1<? super W, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
            this.f106662a = fuelReceiptViewState;
            this.f106663b = localThemeScope;
            this.f106664c = v10;
            this.f106665d = function1;
            this.f106666e = function0;
            this.f106667f = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(W it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g() {
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k() {
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(W it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        public final void e(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
            if (this.f106662a.getShowReceiptLoading()) {
                composer.startReplaceGroup(1866033877);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), contentPadding);
                P.FuelReceiptViewState fuelReceiptViewState = this.f106662a;
                LocalThemeScope localThemeScope = this.f106663b;
                Function0<Unit> function0 = this.f106666e;
                Function1<W, Unit> function1 = this.f106665d;
                Function0<Unit> function02 = this.f106667f;
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                Pj.a loadingState = fuelReceiptViewState.getLoadingState();
                if ((loadingState instanceof a.Loading) || (loadingState instanceof a.Paging)) {
                    composer.startReplaceGroup(-526815583);
                    Ci.o oVar = Ci.o.f4629a;
                    AbstractC6392a.Companion companion3 = AbstractC6392a.INSTANCE;
                    AbstractC6392a abstractC6392aD = companion3.d(Y.f100927fg, new Object[0]);
                    AbstractC6392a abstractC6392aD2 = companion3.d(Y.f100907eg, new Object[0]);
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
                    int i12 = 905969712 | LocalThemeScope.f17314g;
                    int i13 = AbstractC6392a.f60445b;
                    z.P(localThemeScope, oVar, abstractC6392aD, null, null, abstractC6392aD2, modifierH2, function0, function12, function03, composer, i12 | (i13 << 6) | (i13 << 15), 12);
                    composer.P();
                } else if (loadingState instanceof a.Failed) {
                    composer.startReplaceGroup(-526002546);
                    Ci.o oVar2 = Ci.o.f4630b;
                    AbstractC6392a.Companion companion5 = AbstractC6392a.INSTANCE;
                    AbstractC6392a abstractC6392aD3 = companion5.d(Y.f100887dg, new Object[0]);
                    AbstractC6392a abstractC6392aD4 = companion5.d(Y.f100867cg, new Object[0]);
                    String strC = C16338g.c(Y.f100444Gd, composer, 0);
                    String strC2 = C16338g.c(Y.f100505Jh, composer, 0);
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
                    int i14 = 12582960 | LocalThemeScope.f17314g;
                    int i15 = AbstractC6392a.f60445b;
                    z.P(localThemeScope, oVar2, abstractC6392aD3, strC, strC2, abstractC6392aD4, modifierH3, (Function0) objB3, function1, function02, composer, i14 | (i15 << 6) | (i15 << 15), 0);
                    composer.P();
                } else {
                    if (!(loadingState instanceof a.NotLoading)) {
                        composer.startReplaceGroup(121551021);
                        composer.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-525074716);
                    Ci.o oVar3 = Ci.o.f4631c;
                    AbstractC6392a.Companion companion6 = AbstractC6392a.INSTANCE;
                    AbstractC6392a abstractC6392aD5 = companion6.d(Y.f100967hg, new Object[0]);
                    AbstractC6392a abstractC6392aD6 = companion6.d(Y.f100947gg, new Object[0]);
                    String strC3 = C16338g.c(Y.f100315A3, composer, 0);
                    String strC4 = C16338g.c(Y.f100768Xe, composer, 0);
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
                    int i16 = 100663344 | LocalThemeScope.f17314g;
                    int i17 = AbstractC6392a.f60445b;
                    z.P(localThemeScope, oVar3, abstractC6392aD5, strC3, strC4, abstractC6392aD6, modifierH4, function0, (Function1) objB4, function02, composer, i16 | (i17 << 6) | (i17 << 15), 0);
                    composer.P();
                }
                composer.v();
                composer.P();
            } else {
                composer.startReplaceGroup(1868918954);
                z.x(this.f106663b, this.f106664c, this.f106662a, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding), this.f106665d, composer, LocalThemeScope.f17314g, 0);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            e(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f106668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f106669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f106670c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f106671d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f106672e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f106673f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f106674g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ z1.W f106675h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f106676i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f106677j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f106678k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f106679l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f106680m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f106681n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f106682o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f106683p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f106684a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f106685b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f106686c;

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, AbstractC6392a abstractC6392a) {
                this.f106684a = localThemeScope;
                this.f106685b = interfaceC15153W;
                this.f106686c = abstractC6392a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1781150904, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:524)");
                }
                si.j.h(this.f106684a, this.f106685b.getLabels().getInfoBlockMessage(), C13698b.a(this.f106686c, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5872l0 interfaceC5872l0) {
            z.E(interfaceC5872l0, true);
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, LocalThemeScope localThemeScope, String str, String str2, Function1<? super String, Unit> function1, String str3, AbstractC6392a abstractC6392a, z1.W w10, InterfaceC5914o interfaceC5914o, String str4, String str5, String str6, String str7, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03) {
            this.f106668a = modifier;
            this.f106669b = localThemeScope;
            this.f106670c = str;
            this.f106671d = str2;
            this.f106672e = function1;
            this.f106673f = str3;
            this.f106674g = abstractC6392a;
            this.f106675h = w10;
            this.f106676i = interfaceC5914o;
            this.f106677j = str4;
            this.f106678k = str5;
            this.f106679l = str6;
            this.f106680m = str7;
            this.f106681n = interfaceC5872l0;
            this.f106682o = interfaceC5872l02;
            this.f106683p = interfaceC5872l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC15153W interfaceC15153W, String str, String str2, String str3, String str4, AbstractC6392a abstractC6392a, final InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.g(interfaceC15153W.getIcons().getLabelIcon(), C.i.h.f17101d, str, new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z.c.q(interfaceC5872l0);
                }
            });
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), str2);
            if (str3 != null) {
                AdsInputField.f(interfaceC15153W.getLabels().getDescription(), str3);
            }
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), str4);
            if (!C6393b.a(abstractC6392a) && !z.F(interfaceC5872l02) && z.H(interfaceC5872l03)) {
                AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1781150904, true, new a(localThemeScope, interfaceC15153W, abstractC6392a)));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function1 function1, String str, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            z.G(interfaceC5872l0, onFocusChanged.a());
            if (onFocusChanged.b()) {
                z.I(interfaceC5872l02, true);
            }
            if (!onFocusChanged.a()) {
                function1.invoke(str);
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput s(z1.W w10, final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, w10 == null ? z1.W.INSTANCE.c() : w10, new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5835z(new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.K
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.c.t(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.L
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.c.u(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, null, null, 58, null), false, 0, null, null, null, 3983, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5914o.e(C5905f.INSTANCE.a());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            l(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void l(final ki.InterfaceC15153W r22, androidx.compose.runtime.Composer r23, int r24) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.c.l(ki.W, androidx.compose.runtime.Composer, int):void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f106687a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f106688b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f106689c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ V f106690d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f106691e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f106692f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f106693a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f106694b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ V f106695c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f106696d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f106697e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f106698f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z$d$a$a, reason: collision with other inner class name */
            static final class C1583a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Modifier f106699a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f106700b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ V f106701c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f106702d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106703e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f106704f;

                C1583a(Modifier modifier, String str, V v10, String str2, LocalThemeScope localThemeScope, Function0<Unit> function0) {
                    this.f106699a = modifier;
                    this.f106700b = str;
                    this.f106701c = v10;
                    this.f106702d = str2;
                    this.f106703e = localThemeScope;
                    this.f106704f = function0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1550468317, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.OverlayScreen.<anonymous>.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:577)");
                    }
                    Modifier modifierD = androidx.compose.foundation.b.d(C18370z.f(androidx.compose.foundation.layout.J.f(this.f106699a, 0.0f, 1, null), this.f106700b, null, 2, null), C5489q0.INSTANCE.i(), null, 2, null);
                    V v10 = this.f106701c;
                    Modifier modifier = this.f106699a;
                    String str = this.f106702d;
                    LocalThemeScope localThemeScope = this.f106703e;
                    Function0<Unit> function0 = this.f106704f;
                    e.Companion companion = P0.e.INSTANCE;
                    MeasurePolicy measurePolicyG = C5804h.g(companion.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                    C13590y.a(C16335d.c(v10.getDrawableRes(), composer, 0), str, c5806j.g(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null), 0.0f, H1.h.p(72), 1, null), companion.e()), null, InterfaceC5926k.INSTANCE.b(), 0.0f, null, composer, 24576, 104);
                    P0.i(localThemeScope, C16135E.f153884a, function0, C.f.o.f17066e, C16338g.c(Y.f101031l1, composer, 0), c5806j.g(modifier, companion.n()), false, false, 0L, composer, LocalThemeScope.f17314g | (C16135E.f153885b << 3) | (C.f.o.f17067f << 9), 224);
                    composer.v();
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

            a(Modifier modifier, String str, V v10, String str2, LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f106693a = modifier;
                this.f106694b = str;
                this.f106695c = v10;
                this.f106696d = str2;
                this.f106697e = localThemeScope;
                this.f106698f = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(149565337, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.OverlayScreen.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:573)");
                }
                t1.a(androidx.compose.foundation.layout.J.f(this.f106693a, 0.0f, 1, null), null, C5489q0.INSTANCE.i(), 0L, null, 0.0f, ComposableLambdaKt.c(1550468317, true, new C1583a(this.f106693a, this.f106694b, this.f106695c, this.f106696d, this.f106697e, this.f106698f), composer, 54), composer, 1573248, 58);
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

        d(Function0<Unit> function0, Modifier modifier, String str, V v10, String str2, LocalThemeScope localThemeScope) {
            this.f106687a = function0;
            this.f106688b = modifier;
            this.f106689c = str;
            this.f106690d = v10;
            this.f106691e = str2;
            this.f106692f = localThemeScope;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(350693968, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.OverlayScreen.<anonymous> (FuelReceiptFormComposable.kt:572)");
            }
            Function0<Unit> function0 = this.f106687a;
            androidx.compose.ui.window.a.a(function0, null, ComposableLambdaKt.c(149565337, true, new a(this.f106688b, this.f106689c, this.f106690d, this.f106691e, this.f106692f, function0), composer, 54), composer, 384, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f106705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ci.o f106706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f106707c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f106708d;

        e(LocalThemeScope localThemeScope, Ci.o oVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
            this.f106705a = localThemeScope;
            this.f106706b = oVar;
            this.f106707c = abstractC6392a;
            this.f106708d = abstractC6392a2;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-154480246, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.ReceiptSubmitStateScreen.<anonymous>.<anonymous>.<anonymous> (FuelReceiptFormComposable.kt:221)");
            }
            LocalThemeScope localThemeScope = this.f106705a;
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.o oVar = this.f106706b;
            AbstractC6392a abstractC6392a = this.f106707c;
            int i11 = AbstractC6392a.f60445b;
            Ci.m.d(localThemeScope, null, largeLoading, oVar, C13698b.a(abstractC6392a, composer, i11), C13698b.a(this.f106708d, composer, i11), null, composer, LocalThemeScope.f17314g | (q1.k.Large.f142345f << 6), 33);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
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
    private static final void C(final Ki.LocalThemeScope r31, final java.lang.String r32, final java.lang.String r33, final java.lang.String r34, final java.lang.String r35, final java.lang.String r36, final com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.V r37, final java.lang.String r38, androidx.compose.ui.Modifier r39, bk.AbstractC6392a r40, java.lang.String r41, z1.W r42, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.C(Ki.M, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.V, java.lang.String, androidx.compose.ui.Modifier, bk.a, java.lang.String, z1.W, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(InterfaceC5872l0 interfaceC5872l0) {
        E(interfaceC5872l0, false);
        return Unit.f143329a;
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
    public static final void P(final Ki.LocalThemeScope r32, final Ci.o r33, final bk.AbstractC6392a r34, java.lang.String r35, java.lang.String r36, final bk.AbstractC6392a r37, androidx.compose.ui.Modifier r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r39, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W, kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.P(Ki.M, Ci.o, bk.a, java.lang.String, java.lang.String, bk.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void A(final Ki.LocalThemeScope r37, final com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P.FuelReceiptViewState r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.A(Ki.M, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, P.FuelReceiptViewState fuelReceiptViewState, Modifier modifier, Function0 function0, Function0 function02, Function1 function1, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, fuelReceiptViewState, modifier, function0, function02, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, String str5, V v10, String str6, Modifier modifier, AbstractC6392a abstractC6392a, String str7, z1.W w10, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        C(localThemeScope, str, str2, str3, str4, str5, v10, str6, modifier, abstractC6392a, str7, w10, function1, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
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
    private static final void L(Ki.LocalThemeScope r37, androidx.compose.ui.Modifier r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.L(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    private static final void N(final Ki.LocalThemeScope r12, final com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.V r13, final java.lang.String r14, final java.lang.String r15, androidx.compose.ui.Modifier r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.N(Ki.M, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.V, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, V v10, String str, String str2, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, v10, str, str2, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(LocalThemeScope localThemeScope, Ci.o oVar, AbstractC6392a abstractC6392a, String str, String str2, AbstractC6392a abstractC6392a2, Modifier modifier, Function0 function0, Function1 function1, Function0 function02, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, oVar, abstractC6392a, str, str2, abstractC6392a2, modifier, function0, function1, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    private static final void S(final Ki.LocalThemeScope r16, final boolean r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.S(Ki.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        S(localThemeScope, z10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    private static final void q(final Ki.LocalThemeScope r31, final com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P.FuelReceiptViewState r32, androidx.compose.ui.Modifier r33, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.q(Ki.M, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, String updatedDate) {
        Intrinsics.j(updatedDate, "updatedDate");
        function1.invoke(new W.OnFuelFormFieldChange(new M.Date(new Validation(updatedDate, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, String updatedTxNumber) {
        Intrinsics.j(updatedTxNumber, "updatedTxNumber");
        function1.invoke(new W.OnFuelFormFieldChange(new M.TxNumber(new Validation(updatedTxNumber, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, String updatedTmNumber) {
        Intrinsics.j(updatedTmNumber, "updatedTmNumber");
        function1.invoke(new W.OnFuelFormFieldChange(new M.TmNumber(new Validation(updatedTmNumber, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1, String updatedStNumber) {
        Intrinsics.j(updatedStNumber, "updatedStNumber");
        function1.invoke(new W.OnFuelFormFieldChange(new M.StNumber(new Validation(updatedStNumber, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1, String updatedTime) {
        Intrinsics.j(updatedTime, "updatedTime");
        function1.invoke(new W.OnFuelFormFieldChange(new M.Time(new Validation(updatedTime, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, P.FuelReceiptViewState fuelReceiptViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, fuelReceiptViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void x(final Ki.LocalThemeScope r31, final d0.V r32, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P.FuelReceiptViewState r33, androidx.compose.ui.Modifier r34, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.W, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.z.x(Ki.M, d0.V, com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function1 function1, P.FuelReceiptViewState fuelReceiptViewState) {
        function1.invoke(new W.SubmitFuelReceipt(fuelReceiptViewState.getFuelReceiptDecorator()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, d0.V v10, P.FuelReceiptViewState fuelReceiptViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, v10, fuelReceiptViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final boolean D(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(String str, String str2, Function0 function0, Function1 function1) {
        if (Intrinsics.e(str, str2)) {
            function0.invoke();
        } else {
            function1.invoke(W.a.f106564a);
        }
        return Unit.f143329a;
    }
}

package com.meijer.mobile.singlepagecheckout;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u008d\u0001\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0016\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;", "viewState", "", "isBopasEnabled", "isBunchaEnabled", "isSinglePageCheckoutEnabled", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/q1$g;", "", "onAction", "Lkotlin/Function0;", "onInformationButtonClick", "updateActivityExtra", "content", "h", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/E1;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "errorTitle", "errorMessage", "f", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.singlepagecheckout.l0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13066l0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.l0$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlotsViewState f119264a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<q1.g, Unit> f119266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f119267d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f119268e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119269f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f119270g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119271h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f119272i;

        /* JADX WARN: Multi-variable type inference failed */
        a(FulfillmentSlotsViewState fulfillmentSlotsViewState, LocalThemeScope localThemeScope, Function1<? super q1.g, Unit> function1, boolean z10, boolean z11, Function0<Unit> function0, boolean z12, Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function2) {
            this.f119264a = fulfillmentSlotsViewState;
            this.f119265b = localThemeScope;
            this.f119266c = function1;
            this.f119267d = z10;
            this.f119268e = z11;
            this.f119269f = function0;
            this.f119270g = z12;
            this.f119271h = function02;
            this.f119272i = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1) {
            function1.invoke(q1.g.b.f103930a);
            return Unit.f143329a;
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x02d1  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x02db  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x02f2 A[EDGE_INSN: B:131:0x02f2->B:124:0x02f2 BREAK  A[LOOP:0: B:117:0x02d5->B:132:?]] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0264  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(androidx.compose.runtime.Composer r24, int r25) {
            /*
                Method dump skipped, instructions count: 791
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.C13066l0.a.c(androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r34, androidx.compose.ui.Modifier r35, final java.lang.String r36, final java.lang.String r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.C13066l0.f(Ki.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, str, str2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r25, androidx.compose.ui.Modifier r26, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsViewState r27, boolean r28, boolean r29, boolean r30, kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.q1.g, kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.C13066l0.h(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.E1, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(q1.g it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, FulfillmentSlotsViewState fulfillmentSlotsViewState, boolean z10, boolean z11, boolean z12, Function1 function1, Function0 function0, Function0 function02, Function2 function2, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, fulfillmentSlotsViewState, z10, z11, z12, function1, function0, function02, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

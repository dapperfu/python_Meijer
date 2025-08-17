package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import Ji.LocalThemeScope;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.C11886e;
import j0.InterfaceC14800I;
import ji.j1;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import p1.C16193g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aU\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJi/M;", "", "points", "Landroidx/compose/ui/Modifier;", "modifier", "availableRewards", "appliedRewards", "Lkotlin/Function0;", "", "navigateToHVP", "navigateToClaimRewards", "f", "(LJi/M;ILandroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "d", "(LJi/M;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11886e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.e$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103348a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f103349b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103350c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103351d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.e$a$a, reason: collision with other inner class name */
        static final class C1472a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103352a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f103353b;

            C1472a(LocalThemeScope localThemeScope, int i10) {
                this.f103352a = localThemeScope;
                this.f103353b = i10;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1646194486, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoCartSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HighValuePromoCartSection.kt:110)");
                }
                LocalThemeScope localThemeScope = this.f103352a;
                ri.j.h(localThemeScope, new q1.Label(null, this.f103352a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(this.f103353b > 0 ? Y.f99969b0 : Y.f100070g1, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, int i10, Function0<Unit> function0, Function0<Unit> function02) {
            this.f103348a = localThemeScope;
            this.f103349b = i10;
            this.f103350c = function0;
            this.f103351d = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(int i10, Function0 function0, Function0 function02) {
            if (i10 > 0) {
                function0.invoke();
            } else {
                function02.invoke();
            }
            return Unit.f142422a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(197155357, i10, -1, "com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoCartSection.<anonymous>.<anonymous>.<anonymous> (HighValuePromoCartSection.kt:98)");
            }
            LocalThemeScope localThemeScope = this.f103348a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, 1, null), false, null, 895, null);
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.d(this.f103349b) | composer.V(this.f103350c) | composer.V(this.f103351d);
            final int i11 = this.f103349b;
            final Function0<Unit> function0 = this.f103350c;
            final Function0<Unit> function02 = this.f103351d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C11886e.a.c(i11, function0, function02);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1646194486, true, new C1472a(this.f103348a, this.f103349b), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(final Ji.LocalThemeScope r29, final int r30, final int r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.C11886e.d(Ji.M, int, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, int i10, int i11, Modifier modifier, int i12, int i13, Composer composer, int i14) throws Resources.NotFoundException {
        d(localThemeScope, i10, i11, modifier, composer, J0.a(i12 | 1), i13);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r37, final int r38, androidx.compose.ui.Modifier r39, int r40, int r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.C11886e.f(Ji.M, int, androidx.compose.ui.Modifier, int, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, int i12, Function0 function0, Function0 function02, int i13, int i14, Composer composer, int i15) {
        f(localThemeScope, i10, modifier, i11, i12, function0, function02, composer, J0.a(i13 | 1), i14);
        return Unit.f142422a;
    }
}

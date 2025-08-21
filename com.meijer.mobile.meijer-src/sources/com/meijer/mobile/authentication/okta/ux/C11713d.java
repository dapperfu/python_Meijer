package com.meijer.mobile.authentication.okta.ux;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14888I;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16338g;
import r0.C16806i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aO\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "", "errorMessage", "Landroidx/compose/ui/Modifier;", "modifier", "", "shouldShowCloseIcon", "Lkotlin/Function0;", "", "onRetry", "onCancel", "d", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "okta-ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.authentication.okta.ux.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11713d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.authentication.okta.ux.d$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f96163b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.authentication.okta.ux.d$a$a, reason: collision with other inner class name */
        static final class C1363a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f96164a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f96165b;

            C1363a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f96164a = localThemeScope;
                this.f96165b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1797975326, i10, -1, "com.meijer.mobile.authentication.okta.ux.BottomSheetContentError.<anonymous>.<anonymous>.<anonymous> (BottomSheetContentError.kt:66)");
                }
                si.j.h(this.f96164a, this.f96165b.getLabels().getEnabledLabel(), C16338g.c(B.f96091n, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f96162a = localThemeScope;
            this.f96163b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(706038321, i10, -1, "com.meijer.mobile.authentication.okta.ux.BottomSheetContentError.<anonymous>.<anonymous> (BottomSheetContentError.kt:57)");
            }
            E0.b(this.f96162a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, C16806i.c(H1.h.p(12)), null, null, null, androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)).then(J.h(Assemble.getButtons().getEnabledButton().getModifier(), 0.0f, 1, null)), false, null, 887, null), this.f96163b, ComposableLambdaKt.c(1797975326, true, new C1363a(this.f96162a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r32, final java.lang.String r33, androidx.compose.ui.Modifier r34, boolean r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.authentication.okta.ux.C11713d.d(Ki.M, java.lang.String, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, String str, Modifier modifier, boolean z10, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, str, modifier, z10, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

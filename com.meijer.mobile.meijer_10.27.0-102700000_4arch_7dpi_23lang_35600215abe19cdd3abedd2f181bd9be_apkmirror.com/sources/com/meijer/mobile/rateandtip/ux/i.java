package com.meijer.mobile.rateandtip.ux;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14814f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15860s0;
import ni.C15866v0;
import ni.P0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a]\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "primaryActionButtonText", "secondaryActionButtonText", "Lkotlin/Function0;", "", "primaryActionButtonClick", "secondaryActionButtonClick", "", "isPrimaryActionButtonEnabled", "isLoading", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f115141b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f115143d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f115144e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f115145f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f115146g;

        a(LocalThemeScope localThemeScope, String str, Function0<Unit> function0, boolean z10, boolean z11, String str2, Function0<Unit> function02) {
            this.f115140a = localThemeScope;
            this.f115141b = str;
            this.f115142c = function0;
            this.f115143d = z10;
            this.f115144e = z11;
            this.f115145f = str2;
            this.f115146g = function02;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-784581748, i10, -1, "com.meijer.mobile.rateandtip.ux.BottomBar.<anonymous> (RateAndTipActivity.kt:271)");
            }
            LocalThemeScope localThemeScope = this.f115140a;
            C15860s0 c15860s0 = C15860s0.f151792a;
            String str = this.f115141b;
            Function0<Unit> function0 = this.f115142c;
            boolean z10 = this.f115143d && !this.f115144e;
            int i11 = LocalThemeScope.f15770g;
            P0.k(localThemeScope, c15860s0, str, function0, null, null, true, 0L, z10, composer, i11 | 1572864 | (C15860s0.f151793b << 3), 88);
            P0.k(this.f115140a, C15866v0.f151806a, this.f115145f, this.f115146g, null, null, true, 0L, !this.f115144e, composer, i11 | 1572864 | (C15866v0.f151807b << 3), 88);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final java.lang.String r24, final java.lang.String r25, final kotlin.jvm.functions.Function0<kotlin.Unit> r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, boolean r28, boolean r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.rateandtip.ux.i.b(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, Function0 function0, Function0 function02, boolean z10, boolean z11, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, str2, function0, function02, z10, z11, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}

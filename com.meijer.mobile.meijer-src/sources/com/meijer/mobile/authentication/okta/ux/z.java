package com.meijer.mobile.authentication.okta.ux;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.meijer.mobile.authentication.okta.ux.A;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dk.C13698b;
import ki.InterfaceC15154X;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aO\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/authentication/okta/ux/A$c;", "logoutViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onSignOut", "onCancel", "onSuccess", "b", "(LKi/M;Lcom/meijer/mobile/authentication/okta/ux/A$c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "okta-ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96259a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A.c f96260b;

        a(LocalThemeScope localThemeScope, A.c cVar) {
            this.f96259a = localThemeScope;
            this.f96260b = cVar;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1653722407, i10, -1, "com.meijer.mobile.authentication.okta.ux.OktaLogoutSheetContent.<anonymous>.<anonymous> (OktaLogoutSheetContent.kt:46)");
            }
            q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
            Ci.m.e(this.f96259a, androidx.compose.foundation.layout.D.k(J.b(J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), 0.0f, this.f96259a.getAdsSpacing().getEleven().getDp(), 1, null), largeLoadingV2, Ci.o.f4629a, null, C13698b.a(((A.c.Loading) this.f96260b).getMessage(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.LargeV2.f142351f << 6), 40);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f96261a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A.c f96262b;

        b(LocalThemeScope localThemeScope, A.c cVar) {
            this.f96261a = localThemeScope;
            this.f96262b = cVar;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1992225577, i10, -1, "com.meijer.mobile.authentication.okta.ux.OktaLogoutSheetContent.<anonymous>.<anonymous> (OktaLogoutSheetContent.kt:67)");
            }
            q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
            Ci.m.e(this.f96261a, androidx.compose.foundation.layout.D.k(J.b(J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, H1.h.p(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES), 1, null), 0.0f, this.f96261a.getAdsSpacing().getEleven().getDp(), 1, null), largeLoadingV2, Ci.o.f4631c, null, C13698b.a(((A.c.Success) this.f96262b).getMessage(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.LargeV2.f142351f << 6), 40);
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r17, final com.meijer.mobile.authentication.okta.ux.A.c r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.authentication.okta.ux.z.b(Ki.M, com.meijer.mobile.authentication.okta.ux.A$c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, A.c cVar, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, cVar, modifier, function0, function02, function03, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

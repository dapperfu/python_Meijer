package ds;

import Ki.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C6484c;
import j0.C14890K;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import si.j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "name", "image", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDepartmentClicked", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ds.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13726h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ds.h$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f128872a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f128873b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f128874c;

        a(LocalThemeScope localThemeScope, String str, String str2) {
            this.f128872a = localThemeScope;
            this.f128873b = str;
            this.f128874c = str2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1512741298, i10, -1, "com.meijer.mobile.ui.homescreen.departments.DepartmentItem.<anonymous> (DepartmentItem.kt:50)");
            }
            e.b bVarG = P0.e.INSTANCE.g();
            C5800d.m mVarH = C5800d.f48779a.h();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierK = D.k(companion, this.f128872a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            LocalThemeScope localThemeScope = this.f128872a;
            String str = this.f128873b;
            String str2 = this.f128874c;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, bVarG, composer, 54);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
            C6484c.e(new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(str).c(), null, a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), J.v(companion, H1.h.p(64)), null, null, null, InterfaceC5926k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12586032, 0, 8048);
            j.h(localThemeScope, new q1.Label(D.k(companion, 0.0f, localThemeScope.getAdsSpacing().getFour().getDp(), 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 382, null), str2, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r19, final java.lang.String r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ds.C13726h.b(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

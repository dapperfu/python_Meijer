package oi;

import Ki.LocalThemeScope;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.InterfaceC14898b;
import kotlin.C17982Y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001af\u0010\u0010\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lh0/l;", "interactionSource", "LKi/T;", "backgroundColor", "pressedColor", "rippleColor", "", "enabled", "Lkotlin/Function1;", "Lj0/b;", "", "Lkotlin/ExtensionFunctionType;", "content", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lh0/l;LKi/T;LKi/T;LKi/T;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: oi.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16150c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: oi.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f154146a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.l f154147b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f154148c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14898b, Composer, Integer, Unit> f154149d;

        /* JADX WARN: Multi-variable type inference failed */
        a(long j10, h0.l lVar, Modifier modifier, Function3<? super InterfaceC14898b, ? super Composer, ? super Integer, Unit> function3) {
            this.f154146a = j10;
            this.f154147b = lVar;
            this.f154148c = modifier;
            this.f154149d = function3;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(470854107, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.RippleScope.<anonymous> (AcresRipple.kt:86)");
            }
            Modifier modifierThen = androidx.compose.foundation.j.b(androidx.compose.foundation.b.d(Modifier.INSTANCE, this.f154146a, null, 2, null), this.f154147b, C17982Y0.e(true, H1.h.INSTANCE.c(), C5489q0.INSTANCE.j())).then(this.f154148c);
            Function3<InterfaceC14898b, Composer, Integer, Unit> function3 = this.f154149d;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierThen);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            function3.invoke(C5806j.f48836a, composer, 6);
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

    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, h0.l r19, Ki.T r20, Ki.T r21, Ki.T r22, final boolean r23, final kotlin.jvm.functions.Function3<? super j0.InterfaceC14898b, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.C16150c.b(Ki.M, androidx.compose.ui.Modifier, h0.l, Ki.T, Ki.T, Ki.T, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, h0.l lVar, Ki.T t10, Ki.T t11, Ki.T t12, boolean z10, Function3 function3, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, lVar, t10, t11, t12, z10, function3, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}

package Tj;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import d0.InterfaceC13591z;
import j0.InterfaceC14882C;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aS\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "title", "Landroidx/compose/ui/Modifier;", "modifier", "Lj0/C;", "contentPadding", "", "startExpanded", "Ld0/z;", "indication", "Lkotlin/Function0;", "", "content", "c", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lj0/C;ZLd0/z;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isExpanded", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f36419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f36420b;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC14882C interfaceC14882C, Function2<? super Composer, ? super Integer, Unit> function2) {
            this.f36419a = interfaceC14882C;
            this.f36420b = function2;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(952880935, i10, -1, "com.meijer.mobile.core.design.widget.cards.ExpandableCardViewCompose.<anonymous>.<anonymous> (ExpandableCardViewCompose.kt:94)");
            }
            Modifier modifierH = D.h(Modifier.INSTANCE, this.f36419a);
            Function2<Composer, Integer, Unit> function2 = this.f36420b;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            function2.invoke(composer, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r41, final java.lang.String r42, androidx.compose.ui.Modifier r43, j0.InterfaceC14882C r44, boolean r45, d0.InterfaceC13591z r46, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.f.c(Ki.M, java.lang.String, androidx.compose.ui.Modifier, j0.C, boolean, d0.z, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, String str, Modifier modifier, InterfaceC14882C interfaceC14882C, boolean z10, InterfaceC13591z interfaceC13591z, Function2 function2, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, str, modifier, interfaceC14882C, z10, interfaceC13591z, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void e(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(InterfaceC5872l0 interfaceC5872l0) {
        e(interfaceC5872l0, !d(interfaceC5872l0));
        return Unit.f143329a;
    }
}

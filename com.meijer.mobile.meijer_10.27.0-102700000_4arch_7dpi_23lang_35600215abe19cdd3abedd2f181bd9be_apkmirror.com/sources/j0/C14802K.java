package j0;

import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.InterfaceC5811g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14802K {
    public static final void a(Modifier modifier, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        C14803L c14803l = C14803L.f139031a;
        int iA = C5717f.a(composer, 0);
        Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
        InterfaceC5742s interfaceC5742sR = composer.r();
        InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
        Function0<InterfaceC5811g> function0A = companion.a();
        if (composer.k() == null) {
            C5717f.c();
        }
        composer.F();
        if (composer.h()) {
            composer.I(function0A);
        } else {
            composer.s();
        }
        Composer composerA = D1.a(composer);
        D1.c(composerA, c14803l, companion.e());
        D1.c(composerA, interfaceC5742sR, companion.g());
        D1.c(composerA, modifierE, companion.f());
        Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
            composerA.t(Integer.valueOf(iA));
            composerA.n(Integer.valueOf(iA), function2B);
        }
        composer.v();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }
}

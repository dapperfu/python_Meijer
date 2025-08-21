package kotlin;

import V0.D1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import d0.BorderStroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0082\u0001\u0010\u0015\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "LV0/D1;", "shape", "LV0/q0;", "backgroundColor", "contentColor", "Ld0/h;", "border", "LH1/h;", "elevation", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/compose/ui/Modifier;LV0/D1;JJLd0/h;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onClick", "", "enabled", "Lh0/l;", "interactionSource", "b", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLV0/D1;JJLd0/h;FLh0/l;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18051y {
    public static final void a(Modifier modifier, D1 d12, long j10, long j11, BorderStroke borderStroke, float f10, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            d12 = C17943E0.f167967a.b(composer, 6).getMedium();
        }
        D1 d13 = d12;
        long jN = (i11 & 4) != 0 ? C17943E0.f167967a.a(composer, 6).n() : j10;
        long jB = (i11 & 8) != 0 ? C17942E.b(jN, composer, (i10 >> 6) & 14) : j11;
        BorderStroke borderStroke2 = (i11 & 16) != 0 ? null : borderStroke;
        float fP = (i11 & 32) != 0 ? H1.h.p(1) : f10;
        if (ComposerKt.M()) {
            ComposerKt.U(1956755640, i10, -1, "androidx.compose.material.Card (Card.kt:64)");
        }
        t1.a(modifier, d13, jN, jB, borderStroke2, fP, function2, composer, i10 & 4194302, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    public static final void b(Function0<Unit> function0, Modifier modifier, boolean z10, D1 d12, long j10, long j11, BorderStroke borderStroke, float f10, h0.l lVar, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        D1 medium = (i11 & 8) != 0 ? C17943E0.f167967a.b(composer, 6).getMedium() : d12;
        long jN = (i11 & 16) != 0 ? C17943E0.f167967a.a(composer, 6).n() : j10;
        long jB = (i11 & 32) != 0 ? C17942E.b(jN, composer, (i10 >> 12) & 14) : j11;
        BorderStroke borderStroke2 = (i11 & 64) != 0 ? null : borderStroke;
        float fP = (i11 & 128) != 0 ? H1.h.p(1) : f10;
        h0.l lVar2 = (i11 & 256) == 0 ? lVar : null;
        if (ComposerKt.M()) {
            ComposerKt.U(778538979, i10, -1, "androidx.compose.material.Card (Card.kt:116)");
        }
        float f11 = fP;
        t1.b(function0, modifier2, z11, medium, jN, jB, borderStroke2, f11, lVar2, function2, composer, i10 & 2147483646, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }
}

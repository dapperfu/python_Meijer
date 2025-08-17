package androidx.compose.foundation.layout;

import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "LP0/e$c;", "verticalAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "b", "(Landroidx/compose/foundation/layout/d$e;LP0/e$c;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "LH1/b;", "a", "(ZIIII)J", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy$annotations", "()V", "DefaultRowMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final MeasurePolicy f48436a = new RowMeasurePolicy(C5658d.f48555a.g(), P0.e.INSTANCE.l());

    public static final long a(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? H1.c.a(i10, i12, i11, i13) : H1.b.INSTANCE.b(i10, i12, i11, i13);
    }

    @PublishedApi
    public static final MeasurePolicy b(C5658d.e eVar, e.c cVar, Composer composer, int i10) {
        boolean z10;
        MeasurePolicy measurePolicy;
        if (ComposerKt.M()) {
            ComposerKt.U(-837807694, i10, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:121)");
        }
        if (Intrinsics.e(eVar, C5658d.f48555a.g()) && Intrinsics.e(cVar, P0.e.INSTANCE.l())) {
            composer.startReplaceGroup(-848964613);
            composer.P();
            measurePolicy = f48436a;
        } else {
            composer.startReplaceGroup(-848913742);
            boolean z11 = false;
            if ((((i10 & 14) ^ 6) > 4 && composer.V(eVar)) || (i10 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((((i10 & 112) ^ 48) > 32 && composer.V(cVar)) || (i10 & 48) == 32) {
                z11 = true;
            }
            boolean z12 = z10 | z11;
            Object objB = composer.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new RowMeasurePolicy(eVar, cVar);
                composer.t(objB);
            }
            measurePolicy = (RowMeasurePolicy) objB;
            composer.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return measurePolicy;
    }
}

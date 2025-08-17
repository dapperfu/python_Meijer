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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "LP0/e$b;", "horizontalAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "a", "(Landroidx/compose/foundation/layout/d$m;LP0/e$b;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "LH1/b;", "b", "(ZIIII)J", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5665k {

    /* renamed from: a, reason: collision with root package name */
    private static final MeasurePolicy f48614a = new ColumnMeasurePolicy(C5658d.f48555a.h(), P0.e.INSTANCE.k());

    public static final long b(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? H1.c.a(i11, i13, i10, i12) : H1.b.INSTANCE.a(i11, i13, i10, i12);
    }

    @PublishedApi
    public static final MeasurePolicy a(C5658d.m mVar, e.b bVar, Composer composer, int i10) {
        boolean z10;
        MeasurePolicy measurePolicy;
        if (ComposerKt.M()) {
            ComposerKt.U(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (Intrinsics.e(mVar, C5658d.f48555a.h()) && Intrinsics.e(bVar, P0.e.INSTANCE.k())) {
            composer.startReplaceGroup(346089448);
            composer.P();
            measurePolicy = f48614a;
        } else {
            composer.startReplaceGroup(346143295);
            boolean z11 = false;
            if ((((i10 & 14) ^ 6) > 4 && composer.V(mVar)) || (i10 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((((i10 & 112) ^ 48) > 32 && composer.V(bVar)) || (i10 & 48) == 32) {
                z11 = true;
            }
            boolean z12 = z10 | z11;
            Object objB = composer.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new ColumnMeasurePolicy(mVar, bVar);
                composer.t(objB);
            }
            measurePolicy = (ColumnMeasurePolicy) objB;
            composer.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return measurePolicy;
    }
}

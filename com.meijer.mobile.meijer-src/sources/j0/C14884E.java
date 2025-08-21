package j0;

import androidx.compose.foundation.layout.AbstractC5809m;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\b*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/layout/r;", "Lj0/H;", "c", "(Landroidx/compose/ui/layout/r;)Lj0/H;", "rowColumnParentData", "Landroidx/compose/ui/layout/f0;", "d", "(Landroidx/compose/ui/layout/f0;)Lj0/H;", "", "e", "(Lj0/H;)F", "weight", "", "b", "(Lj0/H;)Z", "fill", "Landroidx/compose/foundation/layout/m;", "a", "(Lj0/H;)Landroidx/compose/foundation/layout/m;", "crossAxisAlignment", "f", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14884E {
    public static final AbstractC5809m a(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean b(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final float e(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    public static final RowColumnParentData c(androidx.compose.ui.layout.r rVar) {
        Object objA = rVar.a();
        if (objA instanceof RowColumnParentData) {
            return (RowColumnParentData) objA;
        }
        return null;
    }

    public static final RowColumnParentData d(f0 f0Var) {
        Object objA = f0Var.a();
        if (objA instanceof RowColumnParentData) {
            return (RowColumnParentData) objA;
        }
        return null;
    }

    public static final boolean f(RowColumnParentData rowColumnParentData) {
        AbstractC5809m abstractC5809mA = a(rowColumnParentData);
        if (abstractC5809mA != null) {
            return abstractC5809mA.c();
        }
        return false;
    }
}

package C0;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SlotWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f*\f\b\u0000\u0010\u0010\"\u00020\u00052\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/Applier;", "", "applier", "", "index", "", "e", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;I)V", "c", "(Landroidx/compose/runtime/SlotWriter;)I", "Landroidx/compose/runtime/Anchor;", "anchor", "d", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Applier;)I", "IntParameter", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {
    private static final int c(SlotWriter slotWriter) {
        int iE0;
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.t0(parent)) {
            parent = slotWriter.parent(parent);
        }
        int iGroupSize = parent + 1;
        int i10 = 0;
        while (iGroupSize < currentGroup) {
            if (slotWriter.n0(currentGroup, iGroupSize)) {
                if (slotWriter.t0(iGroupSize)) {
                    i10 = 0;
                }
                iGroupSize++;
            } else {
                if (slotWriter.t0(iGroupSize)) {
                    iE0 = 1;
                } else {
                    iE0 = slotWriter.E0(iGroupSize);
                }
                i10 += iE0;
                iGroupSize += slotWriter.groupSize(iGroupSize);
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        boolean z10;
        int iE = slotWriter.E(anchor);
        boolean z11 = true;
        if (slotWriter.getCurrentGroup() < iE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ComposerKt.t("Check failed");
        }
        e(slotWriter, applier, iE);
        int iC = c(slotWriter);
        while (slotWriter.getCurrentGroup() < iE) {
            if (slotWriter.m0(iE)) {
                if (slotWriter.s0()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    iC = 0;
                }
                slotWriter.i1();
            } else {
                iC += slotWriter.Y0();
            }
        }
        if (slotWriter.getCurrentGroup() != iE) {
            z11 = false;
        }
        if (!z11) {
            ComposerKt.t("Check failed");
        }
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SlotWriter slotWriter, Applier<Object> applier, int i10) {
        while (!slotWriter.o0(i10)) {
            slotWriter.Z0();
            if (slotWriter.t0(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.T();
        }
    }
}

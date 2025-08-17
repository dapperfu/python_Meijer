package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"LZ/S;", "Landroidx/compose/ui/layout/a;", "a", "", "", "b", "", "c", "(LZ/S;Ljava/util/Map;)Z", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/node/f0;", "type", "stopType", "Landroidx/compose/ui/Modifier$c;", "d", "(Landroidx/compose/ui/node/j;II)Landroidx/compose/ui/Modifier$c;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5808e0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(Z.S<androidx.compose.ui.layout.AbstractC5774a> r14, java.util.Map<androidx.compose.ui.layout.AbstractC5774a, java.lang.Integer> r15) {
        /*
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            int r1 = r14.get_size()
            int r2 = r15.size()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            java.lang.Object[] r1 = r14.keys
            int[] r2 = r14.values
            long[] r14 = r14.metadata
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L64
            r4 = r0
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5f
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r0
        L35:
            if (r9 >= r7) goto L5d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L59
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r1[r10]
            r10 = r2[r10]
            androidx.compose.ui.layout.a r11 = (androidx.compose.ui.layout.AbstractC5774a) r11
            java.lang.Object r11 = r15.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L52
            goto L58
        L52:
            int r11 = r11.intValue()
            if (r11 == r10) goto L59
        L58:
            return r0
        L59:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L5d:
            if (r7 != r8) goto L64
        L5f:
            if (r4 == r3) goto L64
            int r4 = r4 + 1
            goto L1b
        L64:
            r14 = 1
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C5808e0.c(Z.S, java.util.Map):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.c d(InterfaceC5814j interfaceC5814j, int i10, int i11) {
        Modifier.c child = interfaceC5814j.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i10) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i11) != 0) {
                return null;
            }
            if ((kindSet & i10) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}

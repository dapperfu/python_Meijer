package r1;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\"\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "mergingEnabled", "Lr1/n;", "a", "(Landroidx/compose/ui/node/LayoutNode;Z)Lr1/n;", "", "e", "(Lr1/n;)I", "h", "Landroidx/compose/ui/node/u0;", "f", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/u0;", "outerMergingSemantics", "Landroidx/compose/ui/semantics/Role;", "g", "(Lr1/n;)Landroidx/compose/ui/semantics/Role;", "role", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16707o {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r1.C16706n a(androidx.compose.ui.node.LayoutNode r10, boolean r11) {
        /*
            androidx.compose.ui.node.c0 r0 = r10.getNodes()
            r1 = 8
            int r1 = androidx.compose.ui.node.C5810f0.a(r1)
            int r2 = androidx.compose.ui.node.C5804c0.c(r0)
            r2 = r2 & r1
            r3 = 0
            if (r2 == 0) goto L7a
            androidx.compose.ui.Modifier$c r0 = r0.getHead()
        L16:
            if (r0 == 0) goto L7a
            int r2 = r0.getKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L6e
            r2 = r0
            r4 = r3
        L21:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof androidx.compose.ui.node.u0
            if (r5 == 0) goto L29
            r3 = r2
            goto L7a
        L29:
            int r5 = r2.getKindSet()
            r5 = r5 & r1
            if (r5 == 0) goto L69
            boolean r5 = r2 instanceof androidx.compose.ui.node.AbstractC5817m
            if (r5 == 0) goto L69
            r5 = r2
            androidx.compose.ui.node.m r5 = (androidx.compose.ui.node.AbstractC5817m) r5
            androidx.compose.ui.Modifier$c r5 = r5.getDelegate()
            r6 = 0
            r7 = r6
        L3d:
            r8 = 1
            if (r5 == 0) goto L66
            int r9 = r5.getKindSet()
            r9 = r9 & r1
            if (r9 == 0) goto L61
            int r7 = r7 + 1
            if (r7 != r8) goto L4d
            r2 = r5
            goto L61
        L4d:
            if (r4 != 0) goto L58
            D0.c r4 = new D0.c
            r8 = 16
            androidx.compose.ui.Modifier$c[] r8 = new androidx.compose.ui.Modifier.c[r8]
            r4.<init>(r8, r6)
        L58:
            if (r2 == 0) goto L5e
            r4.c(r2)
            r2 = r3
        L5e:
            r4.c(r5)
        L61:
            androidx.compose.ui.Modifier$c r5 = r5.getChild()
            goto L3d
        L66:
            if (r7 != r8) goto L69
            goto L21
        L69:
            androidx.compose.ui.Modifier$c r2 = androidx.compose.ui.node.C5815k.b(r4)
            goto L21
        L6e:
            int r2 = r0.getAggregateChildKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L7a
            androidx.compose.ui.Modifier$c r0 = r0.getChild()
            goto L16
        L7a:
            kotlin.jvm.internal.Intrinsics.g(r3)
            androidx.compose.ui.node.u0 r3 = (androidx.compose.ui.node.u0) r3
            androidx.compose.ui.Modifier$c r0 = r3.getNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r10.getSemanticsConfiguration()
            if (r1 != 0) goto L8e
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = new androidx.compose.ui.semantics.SemanticsConfiguration
            r1.<init>()
        L8e:
            r1.n r2 = new r1.n
            r2.<init>(r0, r11, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C16707o.a(androidx.compose.ui.node.LayoutNode, boolean):r1.n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(C16706n c16706n) {
        return c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() + 2000000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.node.u0 f(androidx.compose.ui.node.LayoutNode r9) {
        /*
            androidx.compose.ui.node.c0 r9 = r9.getNodes()
            r0 = 8
            int r0 = androidx.compose.ui.node.C5810f0.a(r0)
            int r1 = androidx.compose.ui.node.C5804c0.c(r9)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L83
            androidx.compose.ui.Modifier$c r9 = r9.getHead()
        L16:
            if (r9 == 0) goto L83
            int r1 = r9.getKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto L77
            r1 = r9
            r3 = r2
        L21:
            if (r1 == 0) goto L77
            boolean r4 = r1 instanceof androidx.compose.ui.node.u0
            if (r4 == 0) goto L32
            r4 = r1
            androidx.compose.ui.node.u0 r4 = (androidx.compose.ui.node.u0) r4
            boolean r4 = r4.getMergeDescendants()
            if (r4 == 0) goto L72
            r2 = r1
            goto L83
        L32:
            int r4 = r1.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L72
            boolean r4 = r1 instanceof androidx.compose.ui.node.AbstractC5817m
            if (r4 == 0) goto L72
            r4 = r1
            androidx.compose.ui.node.m r4 = (androidx.compose.ui.node.AbstractC5817m) r4
            androidx.compose.ui.Modifier$c r4 = r4.getDelegate()
            r5 = 0
            r6 = r5
        L46:
            r7 = 1
            if (r4 == 0) goto L6f
            int r8 = r4.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L6a
            int r6 = r6 + 1
            if (r6 != r7) goto L56
            r1 = r4
            goto L6a
        L56:
            if (r3 != 0) goto L61
            D0.c r3 = new D0.c
            r7 = 16
            androidx.compose.ui.Modifier$c[] r7 = new androidx.compose.ui.Modifier.c[r7]
            r3.<init>(r7, r5)
        L61:
            if (r1 == 0) goto L67
            r3.c(r1)
            r1 = r2
        L67:
            r3.c(r4)
        L6a:
            androidx.compose.ui.Modifier$c r4 = r4.getChild()
            goto L46
        L6f:
            if (r6 != r7) goto L72
            goto L21
        L72:
            androidx.compose.ui.Modifier$c r1 = androidx.compose.ui.node.C5815k.b(r3)
            goto L21
        L77:
            int r1 = r9.getAggregateChildKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto L83
            androidx.compose.ui.Modifier$c r9 = r9.getChild()
            goto L16
        L83:
            androidx.compose.ui.node.u0 r2 = (androidx.compose.ui.node.u0) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C16707o.f(androidx.compose.ui.node.LayoutNode):androidx.compose.ui.node.u0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role g(C16706n c16706n) {
        return (Role) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(C16706n c16706n) {
        return c16706n.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() + 1000000000;
    }
}

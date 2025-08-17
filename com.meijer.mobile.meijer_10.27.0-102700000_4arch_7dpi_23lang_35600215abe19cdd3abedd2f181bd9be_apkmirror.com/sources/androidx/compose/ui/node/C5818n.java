package androidx.compose.ui.node;

import com.google.android.gms.common.api.a;
import j1.C14832a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/n;", "", "", "extraAssertions", "<init>", "(Z)V", "LZ/S;", "Landroidx/compose/ui/node/LayoutNode;", "f", "()LZ/S;", "node", "b", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "a", "(Landroidx/compose/ui/node/LayoutNode;)V", "e", "d", "()Landroidx/compose/ui/node/LayoutNode;", "c", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "LZ/S;", "mapOfOriginalDepth", "Landroidx/compose/ui/node/D0;", "Landroidx/compose/ui/node/D0;", "set", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5818n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean extraAssertions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Z.S<LayoutNode> mapOfOriginalDepth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D0<LayoutNode> set = new D0<>(C5819o.f51560a);

    private final Z.S<LayoutNode> f() {
        if (this.mapOfOriginalDepth == null) {
            this.mapOfOriginalDepth = Z.b0.b();
        }
        Z.S<LayoutNode> s10 = this.mapOfOriginalDepth;
        Intrinsics.g(s10);
        return s10;
    }

    public final boolean b(LayoutNode node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == f().a(node))) {
                C14832a.b("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean c() {
        return this.set.isEmpty();
    }

    public final LayoutNode d() {
        LayoutNode layoutNodeFirst = this.set.first();
        e(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public String toString() {
        return this.set.toString();
    }

    public C5818n(boolean z10) {
        this.extraAssertions = z10;
    }

    public final void a(LayoutNode node) {
        boolean z10;
        if (!node.isAttached()) {
            C14832a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            Z.S<LayoutNode> sF = f();
            int iE = sF.e(node, a.e.API_PRIORITY_OTHER);
            if (iE == Integer.MAX_VALUE) {
                sF.u(node, node.getDepth());
            } else {
                if (iE == node.getDepth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    C14832a.b("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean e(LayoutNode node) {
        int depth;
        boolean z10;
        if (!node.isAttached()) {
            C14832a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            Z.S<LayoutNode> sF = f();
            if (sF.a(node)) {
                int iC = sF.c(node);
                sF.r(node);
                if (zRemove) {
                    depth = node.getDepth();
                } else {
                    depth = a.e.API_PRIORITY_OTHER;
                }
                if (iC == depth) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    C14832a.b("invalid node depth");
                }
            }
        }
        return zRemove;
    }
}

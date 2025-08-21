package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/p;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "affectsLookahead", "e", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "d", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "c", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "i", "f", "()Z", "g", "(Z)Z", "h", "Landroidx/compose/ui/node/n;", "a", "Landroidx/compose/ui/node/n;", "lookaheadSet", "b", "set", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5962p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5960n lookaheadSet;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5960n set;

    public final void c(LayoutNode node, boolean affectsLookahead) {
        if (affectsLookahead) {
            this.lookaheadSet.a(node);
            this.set.a(node);
        } else {
            if (this.lookaheadSet.b(node)) {
                return;
            }
            this.set.a(node);
        }
    }

    public final boolean d(LayoutNode node) {
        return this.lookaheadSet.b(node) || this.set.b(node);
    }

    public final boolean e(LayoutNode node, boolean affectsLookahead) {
        boolean zB = this.lookaheadSet.b(node);
        return affectsLookahead ? zB : zB || this.set.b(node);
    }

    public final boolean f() {
        return this.set.c() && this.lookaheadSet.c();
    }

    public final boolean g(boolean affectsLookahead) {
        return (affectsLookahead ? this.lookaheadSet : this.set).c();
    }

    public final boolean i(LayoutNode node) {
        return this.set.e(node) || this.lookaheadSet.e(node);
    }

    public C5962p(boolean z10) {
        this.lookaheadSet = new C5960n(z10);
        this.set = new C5960n(z10);
    }

    public final boolean h() {
        return !f();
    }
}

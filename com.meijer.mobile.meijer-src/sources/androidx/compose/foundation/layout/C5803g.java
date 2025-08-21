package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.n0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0000*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/g;", "Landroidx/compose/ui/node/n0;", "Landroidx/compose/ui/Modifier$c;", "LP0/e;", "alignment", "", "matchParentSize", "<init>", "(LP0/e;Z)V", "LH1/d;", "", "parentData", "M2", "(LH1/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/g;", "o", "LP0/e;", "K2", "()LP0/e;", "N2", "(LP0/e;)V", "p", "Z", "L2", "()Z", "O2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5803g extends Modifier.c implements n0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private P0.e alignment;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean matchParentSize;

    @Override // androidx.compose.ui.node.n0
    /* renamed from: M2, reason: merged with bridge method [inline-methods] */
    public C5803g R(H1.d dVar, Object obj) {
        return this;
    }

    /* renamed from: K2, reason: from getter */
    public final P0.e getAlignment() {
        return this.alignment;
    }

    /* renamed from: L2, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public final void N2(P0.e eVar) {
        this.alignment = eVar;
    }

    public final void O2(boolean z10) {
        this.matchParentSize = z10;
    }

    public C5803g(P0.e eVar, boolean z10) {
        this.alignment = eVar;
        this.matchParentSize = z10;
    }
}

package androidx.compose.foundation.lazy.layout;

import H1.n;
import androidx.compose.ui.node.Y;
import kotlin.C15875h;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Landroidx/compose/ui/node/Y;", "Ln0/h;", "Lc0/F;", "", "fadeInSpec", "LH1/n;", "placementSpec", "fadeOutSpec", "<init>", "(Lc0/F;Lc0/F;Lc0/F;)V", "k", "()Ln0/h;", "node", "", "n", "(Ln0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lc0/F;", "c", "d", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LazyLayoutAnimateItemElement extends Y<C15875h> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6419F<Float> fadeInSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6419F<n> placementSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6419F<Float> fadeOutSpec;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) other;
        return Intrinsics.e(this.fadeInSpec, lazyLayoutAnimateItemElement.fadeInSpec) && Intrinsics.e(this.placementSpec, lazyLayoutAnimateItemElement.placementSpec) && Intrinsics.e(this.fadeOutSpec, lazyLayoutAnimateItemElement.fadeOutSpec);
    }

    public int hashCode() {
        InterfaceC6419F<Float> interfaceC6419F = this.fadeInSpec;
        int iHashCode = (interfaceC6419F == null ? 0 : interfaceC6419F.hashCode()) * 31;
        InterfaceC6419F<n> interfaceC6419F2 = this.placementSpec;
        int iHashCode2 = (iHashCode + (interfaceC6419F2 == null ? 0 : interfaceC6419F2.hashCode())) * 31;
        InterfaceC6419F<Float> interfaceC6419F3 = this.fadeOutSpec;
        return iHashCode2 + (interfaceC6419F3 != null ? interfaceC6419F3.hashCode() : 0);
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.fadeInSpec + ", placementSpec=" + this.placementSpec + ", fadeOutSpec=" + this.fadeOutSpec + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C15875h b() {
        return new C15875h(this.fadeInSpec, this.placementSpec, this.fadeOutSpec);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(C15875h node) {
        node.N2(this.fadeInSpec);
        node.P2(this.placementSpec);
        node.O2(this.fadeOutSpec);
    }

    public LazyLayoutAnimateItemElement(InterfaceC6419F<Float> interfaceC6419F, InterfaceC6419F<n> interfaceC6419F2, InterfaceC6419F<Float> interfaceC6419F3) {
        this.fadeInSpec = interfaceC6419F;
        this.placementSpec = interfaceC6419F2;
        this.fadeOutSpec = interfaceC6419F3;
    }
}

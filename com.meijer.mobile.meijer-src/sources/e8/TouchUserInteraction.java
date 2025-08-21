package e8;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Le8/e;", "", "", "Le8/c;", "positions", "Le8/k;", "element", "ancestor", "<init>", "(Ljava/util/List;Le8/k;Le8/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Le8/k;", "()Le8/k;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e8.e, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class TouchUserInteraction {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TouchEvent> positions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final UiElement element;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final UiElement ancestor;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchUserInteraction)) {
            return false;
        }
        TouchUserInteraction touchUserInteraction = (TouchUserInteraction) other;
        return Intrinsics.e(this.positions, touchUserInteraction.positions) && Intrinsics.e(this.element, touchUserInteraction.element) && Intrinsics.e(this.ancestor, touchUserInteraction.ancestor);
    }

    public TouchUserInteraction(List<TouchEvent> positions, UiElement element, UiElement uiElement) {
        Intrinsics.j(positions, "positions");
        Intrinsics.j(element, "element");
        this.positions = positions;
        this.element = element;
        this.ancestor = uiElement;
    }

    /* renamed from: a, reason: from getter */
    public final UiElement getAncestor() {
        return this.ancestor;
    }

    /* renamed from: b, reason: from getter */
    public final UiElement getElement() {
        return this.element;
    }

    public final List<TouchEvent> c() {
        return this.positions;
    }

    public int hashCode() {
        int iHashCode = ((this.positions.hashCode() * 31) + this.element.hashCode()) * 31;
        UiElement uiElement = this.ancestor;
        return iHashCode + (uiElement == null ? 0 : uiElement.hashCode());
    }

    public String toString() {
        return "TouchUserInteraction(positions=" + this.positions + ", element=" + this.element + ", ancestor=" + this.ancestor + ')';
    }
}

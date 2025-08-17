package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.AbstractC16684a;
import r0.C16692i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lx0/e1;", "", "Lr0/a;", "small", "medium", "large", "<init>", "(Lr0/a;Lr0/a;Lr0/a;)V", "a", "(Lr0/a;Lr0/a;Lr0/a;)Lx0/e1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lr0/a;", "e", "()Lr0/a;", "b", "d", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.e1, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class Shapes {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC16684a small;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC16684a medium;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC16684a large;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) other;
        return Intrinsics.e(this.small, shapes.small) && Intrinsics.e(this.medium, shapes.medium) && Intrinsics.e(this.large, shapes.large);
    }

    public Shapes(AbstractC16684a abstractC16684a, AbstractC16684a abstractC16684a2, AbstractC16684a abstractC16684a3) {
        this.small = abstractC16684a;
        this.medium = abstractC16684a2;
        this.large = abstractC16684a3;
    }

    public static /* synthetic */ Shapes b(Shapes shapes, AbstractC16684a abstractC16684a, AbstractC16684a abstractC16684a2, AbstractC16684a abstractC16684a3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC16684a = shapes.small;
        }
        if ((i10 & 2) != 0) {
            abstractC16684a2 = shapes.medium;
        }
        if ((i10 & 4) != 0) {
            abstractC16684a3 = shapes.large;
        }
        return shapes.a(abstractC16684a, abstractC16684a2, abstractC16684a3);
    }

    public final Shapes a(AbstractC16684a small, AbstractC16684a medium, AbstractC16684a large) {
        return new Shapes(small, medium, large);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC16684a getLarge() {
        return this.large;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC16684a getMedium() {
        return this.medium;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC16684a getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }

    public /* synthetic */ Shapes(AbstractC16684a abstractC16684a, AbstractC16684a abstractC16684a2, AbstractC16684a abstractC16684a3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16692i.c(H1.h.p(4)) : abstractC16684a, (i10 & 2) != 0 ? C16692i.c(H1.h.p(4)) : abstractC16684a2, (i10 & 4) != 0 ? C16692i.c(H1.h.p(0)) : abstractC16684a3);
    }
}

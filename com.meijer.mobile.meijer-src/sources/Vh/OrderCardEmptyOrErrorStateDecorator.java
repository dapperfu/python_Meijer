package Vh;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LVh/b;", "", "", "emptyOrErrorStateImage", "Lbk/a;", "emptyOrErrorStateTitle", "emptyOrErrorStateDescription", "<init>", "(ILbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lbk/a;", "c", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vh.b, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class OrderCardEmptyOrErrorStateDecorator {

    /* renamed from: d, reason: collision with root package name */
    public static final int f39922d = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int emptyOrErrorStateImage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a emptyOrErrorStateTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a emptyOrErrorStateDescription;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderCardEmptyOrErrorStateDecorator)) {
            return false;
        }
        OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator = (OrderCardEmptyOrErrorStateDecorator) other;
        return this.emptyOrErrorStateImage == orderCardEmptyOrErrorStateDecorator.emptyOrErrorStateImage && Intrinsics.e(this.emptyOrErrorStateTitle, orderCardEmptyOrErrorStateDecorator.emptyOrErrorStateTitle) && Intrinsics.e(this.emptyOrErrorStateDescription, orderCardEmptyOrErrorStateDecorator.emptyOrErrorStateDescription);
    }

    public OrderCardEmptyOrErrorStateDecorator(int i10, AbstractC6392a emptyOrErrorStateTitle, AbstractC6392a emptyOrErrorStateDescription) {
        Intrinsics.j(emptyOrErrorStateTitle, "emptyOrErrorStateTitle");
        Intrinsics.j(emptyOrErrorStateDescription, "emptyOrErrorStateDescription");
        this.emptyOrErrorStateImage = i10;
        this.emptyOrErrorStateTitle = emptyOrErrorStateTitle;
        this.emptyOrErrorStateDescription = emptyOrErrorStateDescription;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getEmptyOrErrorStateDescription() {
        return this.emptyOrErrorStateDescription;
    }

    /* renamed from: b, reason: from getter */
    public final int getEmptyOrErrorStateImage() {
        return this.emptyOrErrorStateImage;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getEmptyOrErrorStateTitle() {
        return this.emptyOrErrorStateTitle;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.emptyOrErrorStateImage) * 31) + this.emptyOrErrorStateTitle.hashCode()) * 31) + this.emptyOrErrorStateDescription.hashCode();
    }

    public String toString() {
        return "OrderCardEmptyOrErrorStateDecorator(emptyOrErrorStateImage=" + this.emptyOrErrorStateImage + ", emptyOrErrorStateTitle=" + this.emptyOrErrorStateTitle + ", emptyOrErrorStateDescription=" + this.emptyOrErrorStateDescription + ')';
    }
}

package hk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lhk/a;", "", "", "isAvailable", "", "itemCount", "<init>", "(ZI)V", "a", "(ZI)Lhk/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "I", "c", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hk.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class CartPreviewDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemCount;

    /* JADX WARN: Multi-variable type inference failed */
    public CartPreviewDecorator() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartPreviewDecorator)) {
            return false;
        }
        CartPreviewDecorator cartPreviewDecorator = (CartPreviewDecorator) other;
        return this.isAvailable == cartPreviewDecorator.isAvailable && this.itemCount == cartPreviewDecorator.itemCount;
    }

    public CartPreviewDecorator(boolean z10, int i10) {
        this.isAvailable = z10;
        this.itemCount = i10;
    }

    public static /* synthetic */ CartPreviewDecorator b(CartPreviewDecorator cartPreviewDecorator, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = cartPreviewDecorator.isAvailable;
        }
        if ((i11 & 2) != 0) {
            i10 = cartPreviewDecorator.itemCount;
        }
        return cartPreviewDecorator.a(z10, i10);
    }

    public final CartPreviewDecorator a(boolean isAvailable, int itemCount) {
        return new CartPreviewDecorator(isAvailable, itemCount);
    }

    /* renamed from: c, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isAvailable) * 31) + Integer.hashCode(this.itemCount);
    }

    public String toString() {
        return "CartPreviewDecorator(isAvailable=" + this.isAvailable + ", itemCount=" + this.itemCount + ')';
    }

    public /* synthetic */ CartPreviewDecorator(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10);
    }
}

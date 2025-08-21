package n5;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln5/g;", "Landroid/view/View;", "T", "Ln5/l;", "view", "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "c", "Z", "t", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: n5.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15910g<T extends View> implements InterfaceC15915l<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T view;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean subtractPadding;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15910g)) {
            return false;
        }
        C15910g c15910g = (C15910g) other;
        return Intrinsics.e(getView(), c15910g.getView()) && getSubtractPadding() == c15910g.getSubtractPadding();
    }

    @Override // n5.InterfaceC15915l
    public T getView() {
        return this.view;
    }

    @Override // n5.InterfaceC15915l
    /* renamed from: t, reason: from getter */
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    public C15910g(T t10, boolean z10) {
        this.view = t10;
        this.subtractPadding = z10;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(getSubtractPadding());
    }
}

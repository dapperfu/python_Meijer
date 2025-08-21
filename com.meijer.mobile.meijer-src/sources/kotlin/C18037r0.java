package kotlin;

import androidx.compose.runtime.H0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lx0/r0;", "T", "", "<init>", "()V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", "current", "", "Lx0/q0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "Landroidx/compose/runtime/H0;", "c", "Landroidx/compose/runtime/H0;", "()Landroidx/compose/runtime/H0;", "e", "(Landroidx/compose/runtime/H0;)V", "scope", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C18037r0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object current = new Object();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<FadeInFadeOutAnimationItem<T>> items = new ArrayList();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private H0 scope;

    /* renamed from: a, reason: from getter */
    public final Object getCurrent() {
        return this.current;
    }

    public final List<FadeInFadeOutAnimationItem<T>> b() {
        return this.items;
    }

    /* renamed from: c, reason: from getter */
    public final H0 getScope() {
        return this.scope;
    }

    public final void d(Object obj) {
        this.current = obj;
    }

    public final void e(H0 h02) {
        this.scope = h02;
    }
}

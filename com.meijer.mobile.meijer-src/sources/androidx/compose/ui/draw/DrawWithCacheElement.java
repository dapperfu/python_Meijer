package androidx.compose.ui.draw;

import T0.i;
import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/draw/a;", "Lkotlin/Function1;", "LT0/d;", "LT0/i;", "Lkotlin/ExtensionFunctionType;", "onBuildDrawCache", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "k", "()Landroidx/compose/ui/draw/a;", "node", "", "n", "(Landroidx/compose/ui/draw/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkotlin/jvm/functions/Function1;", "getOnBuildDrawCache", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawWithCacheElement extends Y<a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<T0.d, i> onBuildDrawCache;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawWithCacheElement) && Intrinsics.e(this.onBuildDrawCache, ((DrawWithCacheElement) other).onBuildDrawCache);
    }

    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a(new T0.d(), this.onBuildDrawCache);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(a node) {
        node.N2(this.onBuildDrawCache);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(Function1<? super T0.d, i> function1) {
        this.onBuildDrawCache = function1;
    }
}

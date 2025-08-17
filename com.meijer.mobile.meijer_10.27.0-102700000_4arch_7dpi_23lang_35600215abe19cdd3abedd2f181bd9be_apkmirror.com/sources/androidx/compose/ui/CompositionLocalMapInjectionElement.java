package androidx.compose.ui;

import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.ui.node.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/c;", "Landroidx/compose/runtime/s;", "map", "<init>", "(Landroidx/compose/runtime/s;)V", "n", "()Landroidx/compose/ui/c;", "node", "", "o", "(Landroidx/compose/ui/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/runtime/s;", "getMap", "()Landroidx/compose/runtime/s;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement extends Y<c> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5742s map;

    public boolean equals(Object other) {
        return (other instanceof CompositionLocalMapInjectionElement) && Intrinsics.e(((CompositionLocalMapInjectionElement) other).map, this.map);
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.map);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(c node) {
        node.K2(this.map);
    }

    public CompositionLocalMapInjectionElement(InterfaceC5742s interfaceC5742s) {
        this.map = interfaceC5742s;
    }
}

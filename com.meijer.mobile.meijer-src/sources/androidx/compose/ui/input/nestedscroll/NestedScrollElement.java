package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.Y;
import f1.C13939b;
import f1.C13940c;
import f1.InterfaceC13938a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/Y;", "Lf1/c;", "Lf1/a;", "connection", "Lf1/b;", "dispatcher", "<init>", "(Lf1/a;Lf1/b;)V", "k", "()Lf1/c;", "node", "", "n", "(Lf1/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lf1/a;", "getConnection", "()Lf1/a;", "c", "Lf1/b;", "getDispatcher", "()Lf1/b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class NestedScrollElement extends Y<C13940c> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13938a connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13939b dispatcher;

    public boolean equals(Object other) {
        if (!(other instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) other;
        return Intrinsics.e(nestedScrollElement.connection, this.connection) && Intrinsics.e(nestedScrollElement.dispatcher, this.dispatcher);
    }

    public int hashCode() {
        int iHashCode = this.connection.hashCode() * 31;
        C13939b c13939b = this.dispatcher;
        return iHashCode + (c13939b != null ? c13939b.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C13940c b() {
        return new C13940c(this.connection, this.dispatcher);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(C13940c node) {
        node.R2(this.connection, this.dispatcher);
    }

    public NestedScrollElement(InterfaceC13938a interfaceC13938a, C13939b c13939b) {
        this.connection = interfaceC13938a;
        this.dispatcher = c13939b;
    }
}

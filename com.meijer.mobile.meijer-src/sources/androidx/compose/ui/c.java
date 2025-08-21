package androidx.compose.ui;

import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.C5957k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/c;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/runtime/s;", "map", "<init>", "(Landroidx/compose/runtime/s;)V", "", "t2", "()V", "value", "o", "Landroidx/compose/runtime/s;", "getMap", "()Landroidx/compose/runtime/s;", "K2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends Modifier.c {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5884s map;

    public final void K2(InterfaceC5884s interfaceC5884s) {
        this.map = interfaceC5884s;
        C5957k.o(this).o(interfaceC5884s);
    }

    public c(InterfaceC5884s interfaceC5884s) {
        this.map = interfaceC5884s;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        C5957k.o(this).o(this.map);
    }
}

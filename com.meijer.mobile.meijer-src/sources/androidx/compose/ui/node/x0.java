package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/x0;", "Landroidx/compose/ui/Modifier$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "t2", "u2", "", "o", "Z", "K2", "()Z", "setAttachHasBeenRun", "(Z)V", "attachHasBeenRun", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x0 extends Modifier.c {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean attachHasBeenRun;

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        this.attachHasBeenRun = true;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        this.attachHasBeenRun = false;
    }

    /* renamed from: K2, reason: from getter */
    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }

    public String toString() {
        return "<tail>";
    }

    public x0() {
        z2(0);
    }
}

package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/D;", "Landroidx/compose/ui/focus/B;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/focus/y;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/y;)V", "", "t2", "()V", "u2", "o", "Landroidx/compose/ui/focus/y;", "K2", "()Landroidx/compose/ui/focus/y;", "L2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class D extends Modifier.c implements B {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private y focusRequester;

    /* renamed from: K2, reason: from getter */
    public final y getFocusRequester() {
        return this.focusRequester;
    }

    public final void L2(y yVar) {
        this.focusRequester = yVar;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        this.focusRequester.e().s(this);
        super.u2();
    }

    public D(y yVar) {
        this.focusRequester = yVar;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        super.t2();
        this.focusRequester.e().c(this);
    }
}

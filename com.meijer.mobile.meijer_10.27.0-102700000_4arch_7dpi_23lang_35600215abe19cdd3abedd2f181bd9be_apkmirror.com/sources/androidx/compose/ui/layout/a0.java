package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/a0;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/C;", "Lkotlin/Function1;", "LH1/r;", "", "onSizeChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "K2", "size", "f", "(J)V", "o", "Lkotlin/jvm/functions/Function1;", "", "p", "Z", "o2", "()Z", "shouldAutoInvalidate", "q", "J", "previousSize", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class a0 extends Modifier.c implements androidx.compose.ui.node.C {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super H1.r, Unit> onSizeChanged;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate = true;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long previousSize;

    public final void K2(Function1<? super H1.r, Unit> onSizeChanged) {
        this.onSizeChanged = onSizeChanged;
        long j10 = Integer.MIN_VALUE;
        this.previousSize = H1.r.c((j10 & 4294967295L) | (j10 << 32));
    }

    @Override // androidx.compose.ui.node.C
    public void f(long size) {
        if (H1.r.e(this.previousSize, size)) {
            return;
        }
        this.onSizeChanged.invoke(H1.r.b(size));
        this.previousSize = size;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public a0(Function1<? super H1.r, Unit> function1) {
        this.onSizeChanged = function1;
        long j10 = Integer.MIN_VALUE;
        this.previousSize = H1.r.c((j10 & 4294967295L) | (j10 << 32));
    }
}

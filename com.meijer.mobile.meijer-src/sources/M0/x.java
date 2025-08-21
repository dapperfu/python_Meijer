package M0;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"LM0/x;", "LM0/w;", "<init>", "()V", "Landroidx/compose/runtime/snapshots/e;", "reader", "", "L", "(I)V", "", "w", "(I)Z", "LJ0/a;", "a", "LJ0/a;", "readerKind", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class x implements w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final J0.a readerKind = new J0.a(0);

    public final void L(int reader) {
        int iA;
        do {
            iA = androidx.compose.runtime.snapshots.e.a(this.readerKind.get());
            if ((iA & reader) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(iA, androidx.compose.runtime.snapshots.e.a(iA | reader)));
    }

    public final boolean w(int reader) {
        return (reader & androidx.compose.runtime.snapshots.e.a(this.readerKind.get())) != 0;
    }
}

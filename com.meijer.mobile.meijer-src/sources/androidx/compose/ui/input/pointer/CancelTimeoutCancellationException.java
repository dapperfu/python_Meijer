package androidx.compose.ui.input.pointer;

import g1.V;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "()V", "fillInStackTrace", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CancelTimeoutCancellationException extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public static final CancelTimeoutCancellationException f51169a = new CancelTimeoutCancellationException();

    private CancelTimeoutCancellationException() {
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(V.f133888a);
        return this;
    }
}

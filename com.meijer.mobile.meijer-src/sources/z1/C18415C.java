package z1;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lz1/C;", "Lz1/z;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Lz1/v;", "", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C18415C extends z {
    public C18415C(InputConnection inputConnection, Function1<? super InterfaceInputConnectionC18438v, Unit> function1) {
        super(inputConnection, function1);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture gesture, Executor executor, IntConsumer consumer) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            delegate.performHandwritingGesture(gesture, executor, consumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.previewHandwritingGesture(gesture, cancellationSignal);
        }
        return false;
    }
}

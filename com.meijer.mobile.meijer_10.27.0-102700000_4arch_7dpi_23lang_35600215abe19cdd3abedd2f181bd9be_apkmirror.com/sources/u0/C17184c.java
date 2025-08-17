package u0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.Q1;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.C17708Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z1.InterfaceC18363i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0014\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lu0/c;", "", "<init>", "()V", "Landroidx/compose/foundation/text/B;", "legacyTextFieldState", "Lw0/Q;", "textFieldSelectionManager", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Landroidx/compose/ui/platform/Q1;", "viewConfiguration", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "Lkotlin/Function1;", "Lz1/i;", "", "editCommandConsumer", "b", "(Landroidx/compose/foundation/text/B;Lw0/Q;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/Q1;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "d", "(Landroidx/compose/foundation/text/B;Lw0/Q;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17184c {

    /* renamed from: a, reason: collision with root package name */
    public static final C17184c f162488a = new C17184c();

    public final void b(androidx.compose.foundation.text.B legacyTextFieldState, C17708Q textFieldSelectionManager, HandwritingGesture gesture, Q1 viewConfiguration, Executor executor, final IntConsumer consumer, Function1<? super InterfaceC18363i, Unit> editCommandConsumer) {
        final int iF = legacyTextFieldState != null ? i0.f162515a.f(legacyTextFieldState, gesture, textFieldSelectionManager, viewConfiguration, editCommandConsumer) : 3;
        if (consumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: u0.b
                @Override // java.lang.Runnable
                public final void run() {
                    C17184c.c(consumer, iF);
                }
            });
        } else {
            consumer.accept(iF);
        }
    }

    public final boolean d(androidx.compose.foundation.text.B legacyTextFieldState, C17708Q textFieldSelectionManager, PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return i0.f162515a.p(legacyTextFieldState, gesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }

    private C17184c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }
}

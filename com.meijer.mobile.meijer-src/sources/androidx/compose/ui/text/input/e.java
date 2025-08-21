package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.input.b;
import androidx.compose.ui.text.y;
import androidx.emoji2.text.f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import s2.C16994c;
import z1.TextFieldValue;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "i", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lz1/M;", "textFieldValue", "h", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Lz1/M;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "d", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "g", "(II)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {
    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: z1.Q
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                androidx.compose.ui.text.input.e.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: z1.S
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                androidx.compose.ui.text.input.e.f(runnable, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    public static final void h(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int imeAction = imeOptions.getImeAction();
        a.Companion companion = a.INSTANCE;
        int i10 = 6;
        if (a.m(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (a.m(imeAction, companion.e())) {
            i10 = 1;
        } else if (a.m(imeAction, companion.c())) {
            i10 = 2;
        } else if (a.m(imeAction, companion.d())) {
            i10 = 5;
        } else if (a.m(imeAction, companion.f())) {
            i10 = 7;
        } else if (a.m(imeAction, companion.g())) {
            i10 = 3;
        } else if (a.m(imeAction, companion.h())) {
            i10 = 4;
        } else if (!a.m(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        imeOptions.g();
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.n(keyboardType, companion2.h())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.n(keyboardType, companion2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.n(keyboardType, companion2.d())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.n(keyboardType, companion2.g())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.n(keyboardType, companion2.j())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.n(keyboardType, companion2.c())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.n(keyboardType, companion2.f())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.n(keyboardType, companion2.e())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.n(keyboardType, companion2.b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type");
        }
        if (!imeOptions.getSingleLine() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (a.m(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            b.Companion companion3 = b.INSTANCE;
            if (b.i(capitalization, companion3.a())) {
                editorInfo.inputType |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            } else if (b.i(capitalization, companion3.e())) {
                editorInfo.inputType |= 8192;
            } else if (b.i(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = y.n(textFieldValue.getSelection());
        editorInfo.initialSelEnd = y.i(textFieldValue.getSelection());
        C16994c.f(editorInfo, textFieldValue.h());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (!f.k()) {
            return;
        }
        f.c().x(editorInfo);
    }
}

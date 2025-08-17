package u0;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.input.b;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import s0.C16844b;
import s2.C16848c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "Landroidx/compose/ui/text/y;", "selection", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "", "contentMimeTypes", "", "b", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "", "bits", "flag", "", "a", "(II)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17170A {
    private static final boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j10, ImeOptions imeOptions, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j10, imeOptions, strArr);
    }

    public static final void b(EditorInfo editorInfo, CharSequence charSequence, long j10, ImeOptions imeOptions, String[] strArr) {
        int imeAction = imeOptions.getImeAction();
        a.Companion companion = androidx.compose.ui.text.input.a.INSTANCE;
        int i10 = 3;
        int i11 = 6;
        if (androidx.compose.ui.text.input.a.m(imeAction, companion.a())) {
            if (!imeOptions.getSingleLine()) {
                i11 = 0;
            }
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.e())) {
            i11 = 1;
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.c())) {
            i11 = 2;
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.d())) {
            i11 = 5;
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.f())) {
            i11 = 7;
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.g())) {
            i11 = 3;
        } else if (androidx.compose.ui.text.input.a.m(imeAction, companion.h())) {
            i11 = 4;
        } else if (!androidx.compose.ui.text.input.a.m(imeAction, companion.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i11;
        imeOptions.g();
        t0.f162578a.a(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.n(keyboardType, companion2.h())) {
            i10 = 1;
        } else if (KeyboardType.n(keyboardType, companion2.a())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (KeyboardType.n(keyboardType, companion2.d())) {
            i10 = 2;
        } else if (!KeyboardType.n(keyboardType, companion2.g())) {
            if (KeyboardType.n(keyboardType, companion2.j())) {
                i10 = 17;
            } else if (KeyboardType.n(keyboardType, companion2.c())) {
                i10 = 33;
            } else if (KeyboardType.n(keyboardType, companion2.f())) {
                i10 = 129;
            } else if (KeyboardType.n(keyboardType, companion2.e())) {
                i10 = 18;
            } else if (KeyboardType.n(keyboardType, companion2.b())) {
                i10 = 8194;
            } else {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
        }
        editorInfo.inputType = i10;
        if (!imeOptions.getSingleLine() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (androidx.compose.ui.text.input.a.m(imeOptions.getImeAction(), companion.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            b.Companion companion3 = androidx.compose.ui.text.input.b.INSTANCE;
            if (androidx.compose.ui.text.input.b.i(capitalization, companion3.a())) {
                editorInfo.inputType |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            } else if (androidx.compose.ui.text.input.b.i(capitalization, companion3.e())) {
                editorInfo.inputType |= 8192;
            } else if (androidx.compose.ui.text.input.b.i(capitalization, companion3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = androidx.compose.ui.text.y.n(j10);
        editorInfo.initialSelEnd = androidx.compose.ui.text.y.i(j10);
        C16848c.f(editorInfo, charSequence);
        if (strArr != null) {
            C16848c.d(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (C16844b.a() && !KeyboardType.n(imeOptions.getKeyboardType(), companion2.f()) && !KeyboardType.n(imeOptions.getKeyboardType(), companion2.e())) {
            C16848c.g(editorInfo, true);
            C17206z.f162591a.a(editorInfo);
        } else {
            C16848c.g(editorInfo, false);
        }
    }
}

package u0;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H&¢\u0006\u0004\b\u0018\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lu0/l0;", "", "", "a", "()Z", "", "d", "()V", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "b", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "c", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "e", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "f", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l0 {
    boolean a();

    void b(int token, ExtractedText extractedText);

    void c(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd);

    void d();

    void e(CursorAnchorInfo cursorAnchorInfo);

    void f();
}

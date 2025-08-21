package J2;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import com.google.android.gms.common.api.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f15399a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15400b;

    /* renamed from: c, reason: collision with root package name */
    private f.AbstractC1120f f15401c;

    /* renamed from: d, reason: collision with root package name */
    private int f15402d = a.e.API_PRIORITY_OTHER;

    /* renamed from: e, reason: collision with root package name */
    private int f15403e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15404f = true;

    static class a extends f.AbstractC1120f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<EditText> f15405a;

        @Override // java.lang.Runnable
        public void run() {
            g.b(this.f15405a.get(), 1);
        }

        a(EditText editText) {
            this.f15405a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC1120f
        public void b() {
            Handler handler;
            super.b();
            EditText editText = this.f15405a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().r(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    private boolean d() {
        if (this.f15404f) {
            return (this.f15400b || androidx.emoji2.text.f.k()) ? false : true;
        }
        return true;
    }

    f.AbstractC1120f a() {
        if (this.f15401c == null) {
            this.f15401c = new a(this.f15399a);
        }
        return this.f15401c;
    }

    public void c(boolean z10) {
        if (this.f15404f != z10) {
            if (this.f15401c != null) {
                androidx.emoji2.text.f.c().w(this.f15401c);
            }
            this.f15404f = z10;
            if (z10) {
                b(this.f15399a, androidx.emoji2.text.f.c().g());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f15399a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iG = androidx.emoji2.text.f.c().g();
        if (iG != 0) {
            if (iG == 1) {
                androidx.emoji2.text.f.c().u((Spannable) charSequence, i10, i10 + i12, this.f15402d, this.f15403e);
                return;
            } else if (iG != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().v(a());
    }

    g(EditText editText, boolean z10) {
        this.f15399a = editText;
        this.f15400b = z10;
    }
}

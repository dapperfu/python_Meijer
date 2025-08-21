package J2;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f15388a;

    /* renamed from: b, reason: collision with root package name */
    private f.AbstractC1120f f15389b;

    static class a extends f.AbstractC1120f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<TextView> f15390a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference<d> f15391b;

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence charSequenceR;
            TextView textView = this.f15390a.get();
            if (c(textView, this.f15391b.get()) && textView.isAttachedToWindow() && text != (charSequenceR = androidx.emoji2.text.f.c().r((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceR);
                int selectionEnd = Selection.getSelectionEnd(charSequenceR);
                textView.setText(charSequenceR);
                if (charSequenceR instanceof Spannable) {
                    d.b((Spannable) charSequenceR, selectionStart, selectionEnd);
                }
            }
        }

        a(TextView textView, d dVar) {
            this.f15390a = new WeakReference(textView);
            this.f15391b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.f.AbstractC1120f
        public void b() {
            Handler handler;
            super.b();
            TextView textView = this.f15390a.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    f.AbstractC1120f a() {
        if (this.f15389b == null) {
            this.f15389b = new a(this.f15388a, this);
        }
        return this.f15389b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f15388a.isInEditMode()) {
            return charSequence;
        }
        int iG = androidx.emoji2.text.f.c().g();
        if (iG != 0) {
            if (iG == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f15388a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.f.c().s(charSequence, 0, charSequence.length());
            }
            if (iG != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.c().v(a());
        return charSequence;
    }

    d(TextView textView) {
        this.f15388a = textView;
    }
}

package u1;

import F1.e;
import F1.f;
import F1.j;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import u1.p;
import v1.U;
import v1.o0;
import x1.C17991c;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001f\u001a\u00020\u0002*\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LF1/j;", "align", "", "m", "(I)I", "LF1/e;", "hyphens", "o", "LF1/f$b;", "breakStrategy", "n", "LF1/f$c;", "lineBreakStrictness", "p", "LF1/f$d;", "lineBreakWordStyle", "q", "Lv1/o0;", "maxHeight", "k", "(Lv1/o0;I)I", "Landroidx/compose/ui/text/z;", "textStyle", "", "ellipsis", "l", "(Landroidx/compose/ui/text/z;Z)Z", "", "j", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Lu1/p;", "r", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17209a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(TextStyle textStyle, boolean z10) {
        if (z10 && !H1.v.e(textStyle.q(), H1.w.i(0)) && !H1.v.e(textStyle.q(), H1.v.INSTANCE.a())) {
            int iZ = textStyle.z();
            j.Companion companion = F1.j.INSTANCE;
            if (!F1.j.k(iZ, companion.g()) && !F1.j.k(textStyle.z(), companion.f()) && !F1.j.k(textStyle.z(), companion.c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i10) {
        j.Companion companion = F1.j.INSTANCE;
        if (F1.j.k(i10, companion.d())) {
            return 3;
        }
        if (F1.j.k(i10, companion.e())) {
            return 4;
        }
        if (F1.j.k(i10, companion.a())) {
            return 2;
        }
        return (!F1.j.k(i10, companion.f()) && F1.j.k(i10, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i10) {
        f.b.Companion companion = f.b.INSTANCE;
        if (f.b.e(i10, companion.c())) {
            return 0;
        }
        if (f.b.e(i10, companion.b())) {
            return 1;
        }
        return f.b.e(i10, companion.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i10) {
        e.Companion companion = F1.e.INSTANCE;
        if (F1.e.g(i10, companion.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        F1.e.g(i10, companion.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i10) {
        f.c.Companion companion = f.c.INSTANCE;
        if (f.c.f(i10, companion.a())) {
            return 0;
        }
        if (f.c.f(i10, companion.b())) {
            return 1;
        }
        if (f.c.f(i10, companion.c())) {
            return 2;
        }
        return f.c.f(i10, companion.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i10) {
        f.d.Companion companion = f.d.INSTANCE;
        return (!f.d.d(i10, companion.a()) && f.d.d(i10, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i10) {
        p.Companion companion = p.INSTANCE;
        return (!p.d(i10, companion.a()) && p.d(i10, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(CharSequence charSequence) {
        Spannable spannableString;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = null;
        }
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!U.a(spannableString, C17991c.class)) {
            D1.c.w(spannableString, new C17991c(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(o0 o0Var, int i10) {
        int lineCount = o0Var.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (o0Var.l(i11) > i10) {
                return i11;
            }
        }
        return o0Var.getLineCount();
    }
}

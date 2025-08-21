package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import c3.C6476a;
import d3.C13599a;

/* loaded from: classes4.dex */
final class C {
    public static float f(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof c3.e);
    }

    public static void c(C6476a.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) C13599a.e(bVar.e()), new De.q() { // from class: androidx.media3.ui.A
                @Override // De.q
                public final boolean apply(Object obj) {
                    return C.b(obj);
                }
            });
        }
        d(bVar);
    }

    public static void d(C6476a.b bVar) {
        bVar.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.o(SpannableString.valueOf(bVar.e()));
            }
            e((Spannable) C13599a.e(bVar.e()), new De.q() { // from class: androidx.media3.ui.B
                @Override // De.q
                public final boolean apply(Object obj) {
                    return C.a(obj);
                }
            });
        }
    }

    private static void e(Spannable spannable, De.q<Object> qVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (qVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}

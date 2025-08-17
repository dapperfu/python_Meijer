package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
class r implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f54665a = false;

    /* renamed from: b, reason: collision with root package name */
    private Spannable f54666b;

    static class b {
        boolean a(CharSequence charSequence) {
            return charSequence instanceof m2.r;
        }

        b() {
        }
    }

    r(Spannable spannable) {
        this.f54666b = spannable;
    }

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.r.b
        boolean a(CharSequence charSequence) {
            if (!m2.c.a(charSequence) && !(charSequence instanceof m2.r)) {
                return false;
            }
            return true;
        }
    }

    private void a() {
        Spannable spannable = this.f54666b;
        if (!this.f54665a && c().a(spannable)) {
            this.f54666b = new SpannableString(spannable);
        }
        this.f54665a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f54666b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f54666b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f54666b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f54666b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f54666b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f54666b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f54666b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f54666b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f54666b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f54666b.nextSpanTransition(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f54666b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f54666b.toString();
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f54666b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f54666b.setSpan(obj, i10, i11, i12);
    }

    r(CharSequence charSequence) {
        this.f54666b = new SpannableString(charSequence);
    }
}

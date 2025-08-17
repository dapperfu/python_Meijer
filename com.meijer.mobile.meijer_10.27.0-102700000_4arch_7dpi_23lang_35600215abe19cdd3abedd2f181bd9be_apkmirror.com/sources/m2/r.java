package m2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class r implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f149776d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Spannable f149777a;

    /* renamed from: b, reason: collision with root package name */
    private final a f149778b;

    /* renamed from: c, reason: collision with root package name */
    private final PrecomputedText f149779c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f149780a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f149781b;

        /* renamed from: c, reason: collision with root package name */
        private final int f149782c;

        /* renamed from: d, reason: collision with root package name */
        private final int f149783d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f149784e;

        /* renamed from: m2.r$a$a, reason: collision with other inner class name */
        public static class C2299a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f149785a;

            /* renamed from: c, reason: collision with root package name */
            private int f149787c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f149788d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f149786b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a a() {
                return new a(this.f149785a, this.f149786b, this.f149787c, this.f149788d);
            }

            public C2299a b(int i10) {
                this.f149787c = i10;
                return this;
            }

            public C2299a c(int i10) {
                this.f149788d = i10;
                return this;
            }

            public C2299a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f149786b = textDirectionHeuristic;
                return this;
            }

            public C2299a(TextPaint textPaint) {
                this.f149785a = textPaint;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f149784e = q.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f149784e = null;
            }
            this.f149780a = textPaint;
            this.f149781b = textDirectionHeuristic;
            this.f149782c = i10;
            this.f149783d = i11;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f149781b == aVar.d();
        }

        public boolean a(a aVar) {
            if (this.f149782c == aVar.b() && this.f149783d == aVar.c() && this.f149780a.getTextSize() == aVar.e().getTextSize() && this.f149780a.getTextScaleX() == aVar.e().getTextScaleX() && this.f149780a.getTextSkewX() == aVar.e().getTextSkewX() && this.f149780a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f149780a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f149780a.getFlags() == aVar.e().getFlags() && this.f149780a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f149780a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f149780a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f149782c;
        }

        public int c() {
            return this.f149783d;
        }

        public TextDirectionHeuristic d() {
            return this.f149781b;
        }

        public TextPaint e() {
            return this.f149780a;
        }

        public int hashCode() {
            return o2.c.b(Float.valueOf(this.f149780a.getTextSize()), Float.valueOf(this.f149780a.getTextScaleX()), Float.valueOf(this.f149780a.getTextSkewX()), Float.valueOf(this.f149780a.getLetterSpacing()), Integer.valueOf(this.f149780a.getFlags()), this.f149780a.getTextLocales(), this.f149780a.getTypeface(), Boolean.valueOf(this.f149780a.isElegantTextHeight()), this.f149781b, Integer.valueOf(this.f149782c), Integer.valueOf(this.f149783d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f149780a.getTextSize());
            sb2.append(", textScaleX=" + this.f149780a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f149780a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f149780a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f149780a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f149780a.getTextLocales());
            sb2.append(", typeface=" + this.f149780a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f149780a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f149781b);
            sb2.append(", breakStrategy=" + this.f149782c);
            sb2.append(", hyphenationFrequency=" + this.f149783d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f149780a = params.getTextPaint();
            this.f149781b = params.getTextDirection();
            this.f149782c = params.getBreakStrategy();
            this.f149783d = params.getHyphenationFrequency();
            this.f149784e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }

    public a a() {
        return this.f149778b;
    }

    public PrecomputedText b() {
        if (c.a(this.f149777a)) {
            return d.a(this.f149777a);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f149777a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f149777a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f149777a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f149777a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f149779c.getSpans(i10, i11, cls) : (T[]) this.f149777a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f149777a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f149777a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f149779c.removeSpan(obj);
        } else {
            this.f149777a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f149779c.setSpan(obj, i10, i11, i12);
        } else {
            this.f149777a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f149777a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f149777a.toString();
    }
}

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
    private static final Object f150518d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Spannable f150519a;

    /* renamed from: b, reason: collision with root package name */
    private final a f150520b;

    /* renamed from: c, reason: collision with root package name */
    private final PrecomputedText f150521c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f150522a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f150523b;

        /* renamed from: c, reason: collision with root package name */
        private final int f150524c;

        /* renamed from: d, reason: collision with root package name */
        private final int f150525d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f150526e;

        /* renamed from: m2.r$a$a, reason: collision with other inner class name */
        public static class C2321a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f150527a;

            /* renamed from: c, reason: collision with root package name */
            private int f150529c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f150530d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f150528b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a a() {
                return new a(this.f150527a, this.f150528b, this.f150529c, this.f150530d);
            }

            public C2321a b(int i10) {
                this.f150529c = i10;
                return this;
            }

            public C2321a c(int i10) {
                this.f150530d = i10;
                return this;
            }

            public C2321a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f150528b = textDirectionHeuristic;
                return this;
            }

            public C2321a(TextPaint textPaint) {
                this.f150527a = textPaint;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f150526e = q.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f150526e = null;
            }
            this.f150522a = textPaint;
            this.f150523b = textDirectionHeuristic;
            this.f150524c = i10;
            this.f150525d = i11;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f150523b == aVar.d();
        }

        public boolean a(a aVar) {
            if (this.f150524c == aVar.b() && this.f150525d == aVar.c() && this.f150522a.getTextSize() == aVar.e().getTextSize() && this.f150522a.getTextScaleX() == aVar.e().getTextScaleX() && this.f150522a.getTextSkewX() == aVar.e().getTextSkewX() && this.f150522a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f150522a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f150522a.getFlags() == aVar.e().getFlags() && this.f150522a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f150522a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f150522a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f150524c;
        }

        public int c() {
            return this.f150525d;
        }

        public TextDirectionHeuristic d() {
            return this.f150523b;
        }

        public TextPaint e() {
            return this.f150522a;
        }

        public int hashCode() {
            return o2.c.b(Float.valueOf(this.f150522a.getTextSize()), Float.valueOf(this.f150522a.getTextScaleX()), Float.valueOf(this.f150522a.getTextSkewX()), Float.valueOf(this.f150522a.getLetterSpacing()), Integer.valueOf(this.f150522a.getFlags()), this.f150522a.getTextLocales(), this.f150522a.getTypeface(), Boolean.valueOf(this.f150522a.isElegantTextHeight()), this.f150523b, Integer.valueOf(this.f150524c), Integer.valueOf(this.f150525d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f150522a.getTextSize());
            sb2.append(", textScaleX=" + this.f150522a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f150522a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f150522a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f150522a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f150522a.getTextLocales());
            sb2.append(", typeface=" + this.f150522a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f150522a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f150523b);
            sb2.append(", breakStrategy=" + this.f150524c);
            sb2.append(", hyphenationFrequency=" + this.f150525d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f150522a = params.getTextPaint();
            this.f150523b = params.getTextDirection();
            this.f150524c = params.getBreakStrategy();
            this.f150525d = params.getHyphenationFrequency();
            this.f150526e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }

    public a a() {
        return this.f150520b;
    }

    public PrecomputedText b() {
        if (c.a(this.f150519a)) {
            return d.a(this.f150519a);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f150519a.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f150519a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f150519a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f150519a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f150521c.getSpans(i10, i11, cls) : (T[]) this.f150519a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f150519a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f150519a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f150521c.removeSpan(obj);
        } else {
            this.f150519a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f150521c.setSpan(obj, i10, i11, i12);
        } else {
            this.f150519a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f150519a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f150519a.toString();
    }
}

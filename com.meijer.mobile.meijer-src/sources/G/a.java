package G;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f11062a = new Rational(4, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final Rational f11063b = new Rational(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final Rational f11064c = new Rational(16, 9);

    /* renamed from: d, reason: collision with root package name */
    public static final Rational f11065d = new Rational(9, 16);

    public static boolean b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (N.c.b(size) >= N.c.b(size2)) {
            return c(size, rational);
        }
        return false;
    }

    /* renamed from: G.a$a, reason: collision with other inner class name */
    public static final class C0182a implements Comparator<Rational> {

        /* renamed from: a, reason: collision with root package name */
        private final Rational f11066a;

        /* renamed from: b, reason: collision with root package name */
        private final RectF f11067b;

        /* renamed from: c, reason: collision with root package name */
        private final Rational f11068c;

        public C0182a(Rational rational, Rational rational2) {
            this.f11066a = rational;
            this.f11068c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f11067b = d(rational);
        }

        private float b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        private float c(RectF rectF, RectF rectF2) {
            float fWidth;
            float fHeight;
            if (rectF.width() < rectF2.width()) {
                fWidth = rectF.width();
            } else {
                fWidth = rectF2.width();
            }
            if (rectF.height() < rectF2.height()) {
                fHeight = rectF.height();
            } else {
                fHeight = rectF2.height();
            }
            return fWidth * fHeight;
        }

        private RectF d(Rational rational) {
            if (rational.floatValue() == this.f11068c.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f11068c.getNumerator(), this.f11068c.getDenominator());
            }
            if (rational.floatValue() > this.f11068c.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f11068c.getNumerator(), (rational.getDenominator() * this.f11068c.getNumerator()) / rational.getNumerator());
            }
            return new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f11068c.getDenominator()) / rational.getDenominator(), this.f11068c.getDenominator());
        }

        private boolean e(RectF rectF, RectF rectF2) {
            if (rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF rectFD = d(rational);
            RectF rectFD2 = d(rational2);
            boolean zE = e(rectFD, this.f11067b);
            boolean zE2 = e(rectFD2, this.f11067b);
            if (zE && zE2) {
                return (int) Math.signum(b(rectFD) - b(rectFD2));
            }
            if (zE) {
                return -1;
            }
            if (zE2) {
                return 1;
            }
            return -((int) Math.signum(c(rectFD, this.f11067b) - c(rectFD2, this.f11067b)));
        }
    }

    public static boolean a(Size size, Rational rational) {
        return b(size, rational, N.c.f20522c);
    }

    private static boolean d(int i10, int i11, Rational rational) {
        o2.i.a(i11 % 16 == 0);
        double numerator = (i10 * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }

    private static boolean c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i10 = width % 16;
        if (i10 == 0 && height % 16 == 0) {
            if (!d(Math.max(0, height - 16), width, rational) && !d(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
            return true;
        }
        if (i10 == 0) {
            return d(height, width, rational);
        }
        if (height % 16 != 0) {
            return false;
        }
        return d(width, height, rational2);
    }
}

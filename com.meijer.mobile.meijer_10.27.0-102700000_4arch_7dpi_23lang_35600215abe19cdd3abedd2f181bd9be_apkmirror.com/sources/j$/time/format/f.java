package j$.time.format;

import j$.time.temporal.TemporalField;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class f extends j {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f138839g;

    @Override // j$.time.format.j, j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        boolean z10 = vVar.f138889c;
        DateTimeFormatter dateTimeFormatter = vVar.f138887a;
        int i11 = (z10 || b(vVar)) ? this.f138846b : 0;
        int i12 = (vVar.f138889c || b(vVar)) ? this.f138847c : 9;
        int length = charSequence.length();
        if (i10 != length) {
            if (this.f138839g) {
                char cCharAt = charSequence.charAt(i10);
                dateTimeFormatter.f138816c.getClass();
                if (cCharAt == '.') {
                    i10++;
                } else if (i11 > 0) {
                    return ~i10;
                }
            }
            int i13 = i10;
            int i14 = i11 + i13;
            if (i14 > length) {
                return ~i13;
            }
            int iMin = Math.min(i12 + i13, length);
            int i15 = 0;
            int i16 = i13;
            while (true) {
                if (i16 >= iMin) {
                    break;
                }
                int i17 = i16 + 1;
                char cCharAt2 = charSequence.charAt(i16);
                dateTimeFormatter.f138816c.getClass();
                int i18 = cCharAt2 - '0';
                if (i18 < 0 || i18 > 9) {
                    i18 = -1;
                }
                if (i18 >= 0) {
                    i15 = (i15 * 10) + i18;
                    i16 = i17;
                } else if (i17 < i14) {
                    return ~i13;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i15).movePointLeft(i16 - i13);
            j$.time.temporal.p pVarQ = this.f138845a.Q();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(pVarQ.f138963a);
            return vVar.g(this.f138845a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(pVarQ.f138966d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i13, i16);
        }
        if (i11 > 0) {
            return ~i10;
        }
        return i10;
    }

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        return vVar.f138889c && this.f138846b == this.f138847c && !this.f138839g;
    }

    public f(TemporalField temporalField, int i10, int i11, boolean z10) {
        this(temporalField, i10, i11, z10, 0);
        Objects.requireNonNull(temporalField, "field");
        j$.time.temporal.p pVarQ = temporalField.Q();
        if (pVarQ.f138963a != pVarQ.f138964b || pVarQ.f138965c != pVarQ.f138966d) {
            throw new IllegalArgumentException(j$.time.b.a("Field must have a fixed set of values: ", temporalField));
        }
        if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
    }

    public f(TemporalField temporalField, int i10, int i11, boolean z10, int i12) {
        super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i12);
        this.f138839g = z10;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.f138849e == -1) {
            return this;
        }
        return new f(this.f138845a, this.f138846b, this.f138847c, this.f138839g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i10) {
        return new f(this.f138845a, this.f138846b, this.f138847c, this.f138839g, this.f138849e + i10);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        TemporalField temporalField = this.f138845a;
        Long lA = wVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        A a10 = wVar.f138893b.f138816c;
        long jLongValue = lA.longValue();
        j$.time.temporal.p pVarQ = temporalField.Q();
        pVarQ.b(jLongValue, temporalField);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(pVarQ.f138963a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(pVarQ.f138966d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z10 = this.f138839g;
        int i10 = this.f138846b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.f138847c), roundingMode).toPlainString().substring(2);
            a10.getClass();
            if (z10) {
                sb2.append('.');
            }
            sb2.append(strSubstring);
            return true;
        }
        if (i10 > 0) {
            if (z10) {
                a10.getClass();
                sb2.append('.');
            }
            for (int i11 = 0; i11 < i10; i11++) {
                a10.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.f138845a + "," + this.f138846b + "," + this.f138847c + (this.f138839g ? ",DecimalPoint" : "") + ")";
    }
}

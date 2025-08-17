package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalField;

/* loaded from: classes3.dex */
public class j implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f138844f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a, reason: collision with root package name */
    public final TemporalField f138845a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138847c;

    /* renamed from: d, reason: collision with root package name */
    public final SignStyle f138848d;

    /* renamed from: e, reason: collision with root package name */
    public final int f138849e;

    public long a(w wVar, long j10) {
        return j10;
    }

    public j(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
        this.f138845a = temporalField;
        this.f138846b = i10;
        this.f138847c = i11;
        this.f138848d = signStyle;
        this.f138849e = 0;
    }

    public j(TemporalField temporalField, int i10, int i11, SignStyle signStyle, int i12) {
        this.f138845a = temporalField;
        this.f138846b = i10;
        this.f138847c = i11;
        this.f138848d = signStyle;
        this.f138849e = i12;
    }

    public j d() {
        if (this.f138849e == -1) {
            return this;
        }
        return new j(this.f138845a, this.f138846b, this.f138847c, this.f138848d, -1);
    }

    public j e(int i10) {
        return new j(this.f138845a, this.f138846b, this.f138847c, this.f138848d, this.f138849e + i10);
    }

    @Override // j$.time.format.e
    public boolean C(w wVar, StringBuilder sb2) {
        TemporalField temporalField = this.f138845a;
        Long lA = wVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        long jA = a(wVar, lA.longValue());
        A a10 = wVar.f138893b.f138816c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i10 = this.f138847c;
        if (length > i10) {
            throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i10);
        }
        a10.getClass();
        int i11 = this.f138846b;
        SignStyle signStyle = this.f138848d;
        if (jA >= 0) {
            int i12 = AbstractC14789b.f138835a[signStyle.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb2.append('+');
                }
            } else if (i11 < 19 && jA >= f138844f[i11]) {
                sb2.append('+');
            }
        } else {
            int i13 = AbstractC14789b.f138835a[signStyle.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb2.append('-');
            } else if (i13 == 4) {
                throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - string.length(); i14++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public boolean b(v vVar) {
        int i10 = this.f138849e;
        if (i10 != -1) {
            return i10 > 0 && this.f138846b == this.f138847c && this.f138848d == SignStyle.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0174, code lost:
    
        if (r6 <= r10) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0198  */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int H(j$.time.format.v r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.H(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public int c(v vVar, long j10, int i10, int i11) {
        return vVar.g(this.f138845a, j10, i10, i11);
    }

    public String toString() {
        int i10 = this.f138847c;
        TemporalField temporalField = this.f138845a;
        SignStyle signStyle = this.f138848d;
        int i11 = this.f138846b;
        if (i11 == 1 && i10 == 19 && signStyle == SignStyle.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i11 == i10 && signStyle == SignStyle.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i11 + ")";
        }
        return "Value(" + temporalField + "," + i11 + "," + i10 + "," + signStyle + ")";
    }
}

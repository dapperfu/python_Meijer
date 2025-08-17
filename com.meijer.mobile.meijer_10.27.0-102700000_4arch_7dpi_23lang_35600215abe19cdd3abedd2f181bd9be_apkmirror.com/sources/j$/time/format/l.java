package j$.time.format;

import j$.time.DateTimeException;

/* loaded from: classes3.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f138856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138857b;

    /* renamed from: c, reason: collision with root package name */
    public final char f138858c;

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        boolean z10 = vVar.f138889c;
        if (i10 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        int length = this.f138857b + i10;
        if (length > charSequence.length()) {
            if (z10) {
                return ~i10;
            }
            length = charSequence.length();
        }
        int i11 = i10;
        while (i11 < length && vVar.a(charSequence.charAt(i11), this.f138858c)) {
            i11++;
        }
        int iH = this.f138856a.H(vVar, charSequence.subSequence(0, length), i11);
        return (iH == length || !z10) ? iH : ~(i10 + i11);
    }

    public l(e eVar, int i10, char c10) {
        this.f138856a = eVar;
        this.f138857b = i10;
        this.f138858c = c10;
    }

    @Override // j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f138856a.C(wVar, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i10 = this.f138857b;
        if (length2 <= i10) {
            for (int i11 = 0; i11 < i10 - length2; i11++) {
                sb2.insert(length, this.f138858c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i10);
    }

    public final String toString() {
        String str;
        char c10 = this.f138858c;
        if (c10 == ' ') {
            str = ")";
        } else {
            str = ",'" + c10 + "')";
        }
        return "Pad(" + this.f138856a + "," + this.f138857b + str;
    }
}

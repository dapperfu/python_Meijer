package j$.time.format;

/* renamed from: j$.time.format.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14790c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final char f138836a;

    public C14790c(char c10) {
        this.f138836a = c10;
    }

    @Override // j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        sb2.append(this.f138836a);
        return true;
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        char c10 = this.f138836a;
        return (cCharAt == c10 || (!vVar.f138888b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c10) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c10)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        char c10 = this.f138836a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}

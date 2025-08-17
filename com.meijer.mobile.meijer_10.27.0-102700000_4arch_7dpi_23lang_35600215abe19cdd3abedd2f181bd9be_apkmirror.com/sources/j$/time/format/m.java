package j$.time.format;

/* loaded from: classes3.dex */
public final class m extends n {
    @Override // j$.time.format.n
    public final n d(String str, String str2, n nVar) {
        return new m(str, str2, nVar);
    }

    @Override // j$.time.format.n
    public final boolean b(char c10, char c11) {
        return v.b(c10, c11);
    }

    @Override // j$.time.format.n
    public final boolean e(CharSequence charSequence, int i10, int i11) {
        int length = this.f138859a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!v.b(this.f138859a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}

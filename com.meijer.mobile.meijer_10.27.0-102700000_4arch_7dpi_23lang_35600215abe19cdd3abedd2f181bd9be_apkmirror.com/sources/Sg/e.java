package Sg;

import com.google.zxing.NotFoundException;

/* loaded from: classes7.dex */
final class e extends i {

    /* renamed from: c, reason: collision with root package name */
    private final String f33613c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33614d;

    @Override // Sg.i
    protected void h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f33614d);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    e(Gg.a aVar, String str, String str2) {
        super(aVar);
        this.f33613c = str2;
        this.f33614d = str;
    }

    private void k(StringBuilder sb2, int i10) {
        int iF = b().f(i10, 16);
        if (iF == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f33613c);
        sb2.append(')');
        int i11 = iF % 32;
        int i12 = iF / 32;
        int i13 = (i12 % 12) + 1;
        int i14 = i12 / 12;
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i13 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i13);
        if (i11 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i11);
    }

    @Override // Sg.j
    public String d() throws NotFoundException {
        if (c().l() == 84) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            j(sb2, 48, 20);
            k(sb2, 68);
            return sb2.toString();
        }
        throw NotFoundException.a();
    }

    @Override // Sg.i
    protected int i(int i10) {
        return i10 % 100000;
    }
}

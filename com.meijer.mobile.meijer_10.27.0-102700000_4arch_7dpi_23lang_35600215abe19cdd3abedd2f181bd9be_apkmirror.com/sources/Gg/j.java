package Gg;

import com.google.zxing.FormatException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private StringBuilder f11435a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f11436b;

    /* renamed from: c, reason: collision with root package name */
    private Charset f11437c;

    public j() {
        this.f11437c = StandardCharsets.ISO_8859_1;
        this.f11435a = new StringBuilder();
    }

    private void g() {
        Charset charset = this.f11437c;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (charset.equals(charset2)) {
            if (this.f11435a.length() > 0) {
                StringBuilder sb2 = this.f11436b;
                if (sb2 == null) {
                    this.f11436b = this.f11435a;
                    this.f11435a = new StringBuilder();
                    return;
                } else {
                    sb2.append((CharSequence) this.f11435a);
                    this.f11435a = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (this.f11435a.length() > 0) {
            byte[] bytes = this.f11435a.toString().getBytes(charset2);
            this.f11435a = new StringBuilder();
            StringBuilder sb3 = this.f11436b;
            if (sb3 == null) {
                this.f11436b = new StringBuilder(new String(bytes, this.f11437c));
            } else {
                sb3.append(new String(bytes, this.f11437c));
            }
        }
    }

    public void a(byte b10) {
        this.f11435a.append((char) (b10 & 255));
    }

    public void b(char c10) {
        this.f11435a.append((char) (c10 & 255));
    }

    public void d(String str) {
        this.f11435a.append(str);
    }

    public boolean h() {
        if (this.f11435a.length() != 0) {
            return false;
        }
        StringBuilder sb2 = this.f11436b;
        return sb2 == null || sb2.length() == 0;
    }

    public void c(int i10) {
        d(String.valueOf(i10));
    }

    public void e(StringBuilder sb2) {
        g();
        this.f11436b.append((CharSequence) sb2);
    }

    public void f(int i10) throws FormatException {
        g();
        d dVarE = d.e(i10);
        if (dVarE != null) {
            this.f11437c = dVarE.l();
            return;
        }
        throw FormatException.a();
    }

    public int i() {
        return toString().length();
    }

    public String toString() {
        g();
        StringBuilder sb2 = this.f11436b;
        if (sb2 == null) {
            return "";
        }
        return sb2.toString();
    }

    public j(int i10) {
        this.f11437c = StandardCharsets.ISO_8859_1;
        this.f11435a = new StringBuilder(i10);
    }
}

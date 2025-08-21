package j$.desugar.sun.nio.fs;

import com.medallia.digital.mobilesdk.q2;
import j$.nio.file.AbstractC14864h;
import j$.nio.file.M;
import j$.nio.file.Path;
import j$.nio.file.attribute.B;
import java.util.Set;

/* loaded from: classes3.dex */
public final class i extends AbstractC14864h {

    /* renamed from: a, reason: collision with root package name */
    public final String f139158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139159b;

    /* renamed from: c, reason: collision with root package name */
    public final m f139160c;

    @Override // j$.nio.file.AbstractC14864h
    public final boolean g() {
        return false;
    }

    @Override // j$.nio.file.AbstractC14864h
    public final boolean isOpen() {
        return true;
    }

    @Override // j$.nio.file.AbstractC14864h
    public final j$.nio.file.spi.c i() {
        return this.f139160c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC14864h
    public final String e() {
        return q2.f93563c;
    }

    @Override // j$.nio.file.AbstractC14864h
    public final Iterable d() {
        return g.o(new Object[]{new o(this, q2.f93563c, this.f139158a, this.f139159b)});
    }

    @Override // j$.nio.file.AbstractC14864h
    public final Iterable a() {
        throw new UnsupportedOperationException("");
    }

    @Override // j$.nio.file.AbstractC14864h
    public final Set j() {
        return g.p(new Object[]{"basic"});
    }

    public i(m mVar, String str, String str2) {
        this.f139160c = mVar;
        this.f139158a = str;
        this.f139159b = str2;
    }

    @Override // j$.nio.file.AbstractC14864h
    public final Path b(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb2.length() > 0) {
                        sb2.append('/');
                    }
                    sb2.append(str2);
                }
            }
            str = sb2.toString();
        }
        return new o(this, str, this.f139158a, this.f139159b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x011f, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0139, code lost:
    
        if (r7 != ']') goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013b, code lost:
    
        r1.append("]]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014b, code lost:
    
        throw new java.util.regex.PatternSyntaxException("Missing ']", r0, r3 - 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00fe A[SYNTHETIC] */
    @Override // j$.nio.file.AbstractC14864h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.nio.file.D c(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.desugar.sun.nio.fs.i.c(java.lang.String):j$.nio.file.D");
    }

    @Override // j$.nio.file.AbstractC14864h
    public final B f() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC14864h
    public final M h() {
        throw new UnsupportedOperationException();
    }
}

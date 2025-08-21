package sf;

import com.google.maps.android.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import qf.C16649i;
import sf.h;

/* loaded from: classes8.dex */
class i implements d {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f160363d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final File f160364a;

    /* renamed from: b, reason: collision with root package name */
    private final int f160365b;

    /* renamed from: c, reason: collision with root package name */
    private h f160366c;

    class a implements h.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f160367a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f160368b;

        a(byte[] bArr, int[] iArr) {
            this.f160367a = bArr;
            this.f160368b = iArr;
        }

        @Override // sf.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f160367a, this.f160368b[0], i10);
                int[] iArr = this.f160368b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f160370a;

        /* renamed from: b, reason: collision with root package name */
        public final int f160371b;

        b(byte[] bArr, int i10) {
            this.f160370a = bArr;
            this.f160371b = i10;
        }
    }

    private void f(long j10, String str) {
        if (this.f160366c == null) {
            return;
        }
        if (str == null) {
            str = BuildConfig.TRAVIS;
        }
        try {
            int i10 = this.f160365b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f160366c.g(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f160363d));
            while (!this.f160366c.p() && this.f160366c.R() > this.f160365b) {
                this.f160366c.H();
            }
        } catch (IOException e10) {
            nf.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f160364a.exists()) {
            return null;
        }
        h();
        h hVar = this.f160366c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.R()];
        try {
            this.f160366c.l(new a(bArr, iArr));
        } catch (IOException e10) {
            nf.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f160366c == null) {
            try {
                this.f160366c = new h(this.f160364a);
            } catch (IOException e10) {
                nf.g.f().e("Could not open log file: " + this.f160364a, e10);
            }
        }
    }

    @Override // sf.d
    public void a() throws IOException {
        C16649i.f(this.f160366c, "There was a problem closing the Crashlytics log file.");
        this.f160366c = null;
    }

    i(File file, int i10) {
        this.f160364a = file;
        this.f160365b = i10;
    }

    @Override // sf.d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f160363d);
        }
        return null;
    }

    @Override // sf.d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f160371b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f160370a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // sf.d
    public void d() throws IOException {
        a();
        this.f160364a.delete();
    }

    @Override // sf.d
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}

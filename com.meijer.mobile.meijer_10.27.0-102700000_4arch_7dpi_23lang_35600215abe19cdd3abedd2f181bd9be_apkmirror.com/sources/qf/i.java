package qf;

import com.google.maps.android.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import of.C16041i;
import qf.h;

/* loaded from: classes7.dex */
class i implements d {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f157248d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final File f157249a;

    /* renamed from: b, reason: collision with root package name */
    private final int f157250b;

    /* renamed from: c, reason: collision with root package name */
    private h f157251c;

    class a implements h.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f157252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f157253b;

        a(byte[] bArr, int[] iArr) {
            this.f157252a = bArr;
            this.f157253b = iArr;
        }

        @Override // qf.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f157252a, this.f157253b[0], i10);
                int[] iArr = this.f157253b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f157255a;

        /* renamed from: b, reason: collision with root package name */
        public final int f157256b;

        b(byte[] bArr, int i10) {
            this.f157255a = bArr;
            this.f157256b = i10;
        }
    }

    private void f(long j10, String str) {
        if (this.f157251c == null) {
            return;
        }
        if (str == null) {
            str = BuildConfig.TRAVIS;
        }
        try {
            int i10 = this.f157250b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f157251c.g(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f157248d));
            while (!this.f157251c.p() && this.f157251c.R() > this.f157250b) {
                this.f157251c.H();
            }
        } catch (IOException e10) {
            lf.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f157249a.exists()) {
            return null;
        }
        h();
        h hVar = this.f157251c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.R()];
        try {
            this.f157251c.l(new a(bArr, iArr));
        } catch (IOException e10) {
            lf.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f157251c == null) {
            try {
                this.f157251c = new h(this.f157249a);
            } catch (IOException e10) {
                lf.g.f().e("Could not open log file: " + this.f157249a, e10);
            }
        }
    }

    @Override // qf.d
    public void a() throws IOException {
        C16041i.f(this.f157251c, "There was a problem closing the Crashlytics log file.");
        this.f157251c = null;
    }

    i(File file, int i10) {
        this.f157249a = file;
        this.f157250b = i10;
    }

    @Override // qf.d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f157248d);
        }
        return null;
    }

    @Override // qf.d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f157256b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f157255a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // qf.d
    public void d() throws IOException {
        a();
        this.f157249a.delete();
    }

    @Override // qf.d
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}

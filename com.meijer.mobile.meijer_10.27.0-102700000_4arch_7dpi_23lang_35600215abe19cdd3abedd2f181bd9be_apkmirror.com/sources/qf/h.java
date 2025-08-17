package qf;

import androidx.recyclerview.widget.RecyclerView;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
class h implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f157232g = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f157233a;

    /* renamed from: b, reason: collision with root package name */
    int f157234b;

    /* renamed from: c, reason: collision with root package name */
    private int f157235c;

    /* renamed from: d, reason: collision with root package name */
    private b f157236d;

    /* renamed from: e, reason: collision with root package name */
    private b f157237e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f157238f = new byte[16];

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f157239a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f157240b;

        a(StringBuilder sb2) {
            this.f157240b = sb2;
        }

        @Override // qf.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            if (this.f157239a) {
                this.f157239a = false;
            } else {
                this.f157240b.append(", ");
            }
            this.f157240b.append(i10);
        }
    }

    static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f157242c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f157243a;

        /* renamed from: b, reason: collision with root package name */
        final int f157244b;

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f157243a + ", length = " + this.f157244b + "]";
        }

        b(int i10, int i11) {
            this.f157243a = i10;
            this.f157244b = i11;
        }
    }

    private final class c extends InputStream implements InputStreamRetargetInterface {

        /* renamed from: a, reason: collision with root package name */
        private int f157245a;

        /* renamed from: b, reason: collision with root package name */
        private int f157246b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.u(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f157246b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.J(this.f157245a, bArr, i10, i11);
            this.f157245a = h.this.T(this.f157245a + i11);
            this.f157246b -= i11;
            return i11;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        private c(b bVar) {
            this.f157245a = h.this.T(bVar.f157243a + 4);
            this.f157246b = bVar.f157244b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f157246b == 0) {
                return -1;
            }
            h.this.f157233a.seek(this.f157245a);
            int i10 = h.this.f157233a.read();
            this.f157245a = h.this.T(this.f157245a + 1);
            this.f157246b--;
            return i10;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10) throws IOException;
    }

    private static void e0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            c0(bArr, i10, i11);
            i10 += 4;
        }
    }

    public synchronized void H() throws IOException {
        try {
            if (p()) {
                throw new NoSuchElementException();
            }
            if (this.f157235c == 1) {
                i();
            } else {
                b bVar = this.f157236d;
                int iT = T(bVar.f157243a + 4 + bVar.f157244b);
                J(iT, this.f157238f, 0, 4);
                int iB = B(this.f157238f, 0);
                Z(this.f157234b, this.f157235c - 1, iT, this.f157237e.f157243a);
                this.f157235c--;
                this.f157236d = new b(iT, iB);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f157233a.close();
    }

    public void g(byte[] bArr) throws IOException {
        h(bArr, 0, bArr.length);
    }

    public synchronized void h(byte[] bArr, int i10, int i11) throws IOException {
        int iT;
        try {
            u(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            j(i11);
            boolean zP = p();
            if (zP) {
                iT = 16;
            } else {
                b bVar = this.f157237e;
                iT = T(bVar.f157243a + 4 + bVar.f157244b);
            }
            b bVar2 = new b(iT, i11);
            c0(this.f157238f, 0, i11);
            K(bVar2.f157243a, this.f157238f, 0, 4);
            K(bVar2.f157243a + 4, bArr, i10, i11);
            Z(this.f157234b, this.f157235c + 1, zP ? bVar2.f157243a : this.f157236d.f157243a, bVar2.f157243a);
            this.f157237e = bVar2;
            this.f157235c++;
            if (zP) {
                this.f157236d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void i() throws IOException {
        try {
            Z(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
            this.f157235c = 0;
            b bVar = b.f157242c;
            this.f157236d = bVar;
            this.f157237e = bVar;
            if (this.f157234b > 4096) {
                O(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            this.f157234b = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void l(d dVar) throws IOException {
        int iT = this.f157236d.f157243a;
        for (int i10 = 0; i10 < this.f157235c; i10++) {
            b bVarZ = z(iT);
            dVar.a(new c(this, bVarZ, null), bVarZ.f157244b);
            iT = T(bVarZ.f157243a + 4 + bVarZ.f157244b);
        }
    }

    public synchronized boolean p() {
        return this.f157235c == 0;
    }

    private void A() throws IOException {
        this.f157233a.seek(0L);
        this.f157233a.readFully(this.f157238f);
        int iB = B(this.f157238f, 0);
        this.f157234b = iB;
        if (iB <= this.f157233a.length()) {
            this.f157235c = B(this.f157238f, 4);
            int iB2 = B(this.f157238f, 8);
            int iB3 = B(this.f157238f, 12);
            this.f157236d = z(iB2);
            this.f157237e = z(iB3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f157234b + ", Actual length: " + this.f157233a.length());
    }

    private static int B(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int D() {
        return this.f157234b - R();
    }

    private void O(int i10) throws IOException {
        this.f157233a.setLength(i10);
        this.f157233a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int T(int i10) {
        int i11 = this.f157234b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void Z(int i10, int i11, int i12, int i13) throws IOException {
        e0(this.f157238f, i10, i11, i12, i13);
        this.f157233a.seek(0L);
        this.f157233a.write(this.f157238f);
    }

    private static void c0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private void j(int i10) throws IOException {
        int i11 = i10 + 4;
        int iD = D();
        if (iD >= i11) {
            return;
        }
        int i12 = this.f157234b;
        do {
            iD += i12;
            i12 <<= 1;
        } while (iD < i11);
        O(i12);
        b bVar = this.f157237e;
        int iT = T(bVar.f157243a + 4 + bVar.f157244b);
        if (iT < this.f157236d.f157243a) {
            FileChannel channel = this.f157233a.getChannel();
            channel.position(this.f157234b);
            long j10 = iT - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f157237e.f157243a;
        int i14 = this.f157236d.f157243a;
        if (i13 < i14) {
            int i15 = (this.f157234b + i13) - 16;
            Z(i12, this.f157235c, i14, i15);
            this.f157237e = new b(i15, this.f157237e.f157244b);
        } else {
            Z(i12, this.f157235c, i14, i13);
        }
        this.f157234b = i12;
    }

    private static void m(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileW = w(file2);
        try {
            randomAccessFileW.setLength(4096L);
            randomAccessFileW.seek(0L);
            byte[] bArr = new byte[16];
            e0(bArr, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
            randomAccessFileW.write(bArr);
            randomAccessFileW.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileW.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T u(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile w(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private b z(int i10) throws IOException {
        if (i10 == 0) {
            return b.f157242c;
        }
        this.f157233a.seek(i10);
        return new b(i10, this.f157233a.readInt());
    }

    public int R() {
        if (this.f157235c == 0) {
            return 16;
        }
        b bVar = this.f157237e;
        int i10 = bVar.f157243a;
        int i11 = this.f157236d.f157243a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f157244b + 16 : (((i10 + 4) + bVar.f157244b) + this.f157234b) - i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f157234b);
        sb2.append(", size=");
        sb2.append(this.f157235c);
        sb2.append(", first=");
        sb2.append(this.f157236d);
        sb2.append(", last=");
        sb2.append(this.f157237e);
        sb2.append(", element lengths=[");
        try {
            l(new a(sb2));
        } catch (IOException e10) {
            f157232g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            m(file);
        }
        this.f157233a = w(file);
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iT = T(i10);
        int i13 = iT + i12;
        int i14 = this.f157234b;
        if (i13 <= i14) {
            this.f157233a.seek(iT);
            this.f157233a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iT;
        this.f157233a.seek(iT);
        this.f157233a.readFully(bArr, i11, i15);
        this.f157233a.seek(16L);
        this.f157233a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void K(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iT = T(i10);
        int i13 = iT + i12;
        int i14 = this.f157234b;
        if (i13 <= i14) {
            this.f157233a.seek(iT);
            this.f157233a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iT;
        this.f157233a.seek(iT);
        this.f157233a.write(bArr, i11, i15);
        this.f157233a.seek(16L);
        this.f157233a.write(bArr, i11 + i15, i12 - i15);
    }
}

package sf;

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

/* loaded from: classes8.dex */
class h implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f160347g = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f160348a;

    /* renamed from: b, reason: collision with root package name */
    int f160349b;

    /* renamed from: c, reason: collision with root package name */
    private int f160350c;

    /* renamed from: d, reason: collision with root package name */
    private b f160351d;

    /* renamed from: e, reason: collision with root package name */
    private b f160352e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f160353f = new byte[16];

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f160354a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f160355b;

        a(StringBuilder sb2) {
            this.f160355b = sb2;
        }

        @Override // sf.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            if (this.f160354a) {
                this.f160354a = false;
            } else {
                this.f160355b.append(", ");
            }
            this.f160355b.append(i10);
        }
    }

    static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f160357c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f160358a;

        /* renamed from: b, reason: collision with root package name */
        final int f160359b;

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f160358a + ", length = " + this.f160359b + "]";
        }

        b(int i10, int i11) {
            this.f160358a = i10;
            this.f160359b = i11;
        }
    }

    private final class c extends InputStream implements InputStreamRetargetInterface {

        /* renamed from: a, reason: collision with root package name */
        private int f160360a;

        /* renamed from: b, reason: collision with root package name */
        private int f160361b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.u(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f160361b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.J(this.f160360a, bArr, i10, i11);
            this.f160360a = h.this.T(this.f160360a + i11);
            this.f160361b -= i11;
            return i11;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        private c(b bVar) {
            this.f160360a = h.this.T(bVar.f160358a + 4);
            this.f160361b = bVar.f160359b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f160361b == 0) {
                return -1;
            }
            h.this.f160348a.seek(this.f160360a);
            int i10 = h.this.f160348a.read();
            this.f160360a = h.this.T(this.f160360a + 1);
            this.f160361b--;
            return i10;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10) throws IOException;
    }

    private static void e0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            b0(bArr, i10, i11);
            i10 += 4;
        }
    }

    public synchronized void H() throws IOException {
        try {
            if (p()) {
                throw new NoSuchElementException();
            }
            if (this.f160350c == 1) {
                i();
            } else {
                b bVar = this.f160351d;
                int iT = T(bVar.f160358a + 4 + bVar.f160359b);
                J(iT, this.f160353f, 0, 4);
                int iB = B(this.f160353f, 0);
                Y(this.f160349b, this.f160350c - 1, iT, this.f160352e.f160358a);
                this.f160350c--;
                this.f160351d = new b(iT, iB);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f160348a.close();
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
                b bVar = this.f160352e;
                iT = T(bVar.f160358a + 4 + bVar.f160359b);
            }
            b bVar2 = new b(iT, i11);
            b0(this.f160353f, 0, i11);
            K(bVar2.f160358a, this.f160353f, 0, 4);
            K(bVar2.f160358a + 4, bArr, i10, i11);
            Y(this.f160349b, this.f160350c + 1, zP ? bVar2.f160358a : this.f160351d.f160358a, bVar2.f160358a);
            this.f160352e = bVar2;
            this.f160350c++;
            if (zP) {
                this.f160351d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void i() throws IOException {
        try {
            Y(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 0, 0, 0);
            this.f160350c = 0;
            b bVar = b.f160357c;
            this.f160351d = bVar;
            this.f160352e = bVar;
            if (this.f160349b > 4096) {
                O(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            this.f160349b = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void l(d dVar) throws IOException {
        int iT = this.f160351d.f160358a;
        for (int i10 = 0; i10 < this.f160350c; i10++) {
            b bVarZ = z(iT);
            dVar.a(new c(this, bVarZ, null), bVarZ.f160359b);
            iT = T(bVarZ.f160358a + 4 + bVarZ.f160359b);
        }
    }

    public synchronized boolean p() {
        return this.f160350c == 0;
    }

    private void A() throws IOException {
        this.f160348a.seek(0L);
        this.f160348a.readFully(this.f160353f);
        int iB = B(this.f160353f, 0);
        this.f160349b = iB;
        if (iB <= this.f160348a.length()) {
            this.f160350c = B(this.f160353f, 4);
            int iB2 = B(this.f160353f, 8);
            int iB3 = B(this.f160353f, 12);
            this.f160351d = z(iB2);
            this.f160352e = z(iB3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f160349b + ", Actual length: " + this.f160348a.length());
    }

    private static int B(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int D() {
        return this.f160349b - R();
    }

    private void O(int i10) throws IOException {
        this.f160348a.setLength(i10);
        this.f160348a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int T(int i10) {
        int i11 = this.f160349b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void Y(int i10, int i11, int i12, int i13) throws IOException {
        e0(this.f160353f, i10, i11, i12, i13);
        this.f160348a.seek(0L);
        this.f160348a.write(this.f160353f);
    }

    private static void b0(byte[] bArr, int i10, int i11) {
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
        int i12 = this.f160349b;
        do {
            iD += i12;
            i12 <<= 1;
        } while (iD < i11);
        O(i12);
        b bVar = this.f160352e;
        int iT = T(bVar.f160358a + 4 + bVar.f160359b);
        if (iT < this.f160351d.f160358a) {
            FileChannel channel = this.f160348a.getChannel();
            channel.position(this.f160349b);
            long j10 = iT - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f160352e.f160358a;
        int i14 = this.f160351d.f160358a;
        if (i13 < i14) {
            int i15 = (this.f160349b + i13) - 16;
            Y(i12, this.f160350c, i14, i15);
            this.f160352e = new b(i15, this.f160352e.f160359b);
        } else {
            Y(i12, this.f160350c, i14, i13);
        }
        this.f160349b = i12;
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
            return b.f160357c;
        }
        this.f160348a.seek(i10);
        return new b(i10, this.f160348a.readInt());
    }

    public int R() {
        if (this.f160350c == 0) {
            return 16;
        }
        b bVar = this.f160352e;
        int i10 = bVar.f160358a;
        int i11 = this.f160351d.f160358a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f160359b + 16 : (((i10 + 4) + bVar.f160359b) + this.f160349b) - i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f160349b);
        sb2.append(", size=");
        sb2.append(this.f160350c);
        sb2.append(", first=");
        sb2.append(this.f160351d);
        sb2.append(", last=");
        sb2.append(this.f160352e);
        sb2.append(", element lengths=[");
        try {
            l(new a(sb2));
        } catch (IOException e10) {
            f160347g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            m(file);
        }
        this.f160348a = w(file);
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iT = T(i10);
        int i13 = iT + i12;
        int i14 = this.f160349b;
        if (i13 <= i14) {
            this.f160348a.seek(iT);
            this.f160348a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iT;
        this.f160348a.seek(iT);
        this.f160348a.readFully(bArr, i11, i15);
        this.f160348a.seek(16L);
        this.f160348a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void K(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iT = T(i10);
        int i13 = iT + i12;
        int i14 = this.f160349b;
        if (i13 <= i14) {
            this.f160348a.seek(iT);
            this.f160348a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iT;
        this.f160348a.seek(iT);
        this.f160348a.write(bArr, i11, i15);
        this.f160348a.seek(16L);
        this.f160348a.write(bArr, i11 + i15, i12 - i15);
    }
}

package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import com.medallia.digital.mobilesdk.q2;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fsimpl.C14170dq;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class a {

    /* renamed from: T, reason: collision with root package name */
    private static SimpleDateFormat f54910T;

    /* renamed from: U, reason: collision with root package name */
    private static SimpleDateFormat f54911U;

    /* renamed from: Y, reason: collision with root package name */
    private static final d[] f54915Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final d[] f54916Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final d[] f54917a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final d[] f54918b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final d[] f54919c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final d f54920d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final d[] f54921e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final d[] f54922f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final d[] f54923g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final d[] f54924h0;

    /* renamed from: i0, reason: collision with root package name */
    static final d[][] f54925i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final d[] f54926j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final HashMap<Integer, d>[] f54927k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final HashMap<String, d>[] f54928l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final HashSet<String> f54929m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f54930n0;

    /* renamed from: o0, reason: collision with root package name */
    static final Charset f54931o0;

    /* renamed from: p0, reason: collision with root package name */
    static final byte[] f54932p0;

    /* renamed from: q0, reason: collision with root package name */
    private static final byte[] f54933q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final Pattern f54934r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final Pattern f54935s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final Pattern f54936t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final Pattern f54938u0;

    /* renamed from: a, reason: collision with root package name */
    private String f54944a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f54945b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f54946c;

    /* renamed from: d, reason: collision with root package name */
    private int f54947d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f54948e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, c>[] f54949f;

    /* renamed from: g, reason: collision with root package name */
    private Set<Integer> f54950g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f54951h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f54952i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f54953j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f54954k;

    /* renamed from: l, reason: collision with root package name */
    private int f54955l;

    /* renamed from: m, reason: collision with root package name */
    private int f54956m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f54957n;

    /* renamed from: o, reason: collision with root package name */
    private int f54958o;

    /* renamed from: p, reason: collision with root package name */
    private int f54959p;

    /* renamed from: q, reason: collision with root package name */
    private int f54960q;

    /* renamed from: r, reason: collision with root package name */
    private int f54961r;

    /* renamed from: s, reason: collision with root package name */
    private int f54962s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f54963t;

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f54937u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v, reason: collision with root package name */
    private static final List<Integer> f54939v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w, reason: collision with root package name */
    private static final List<Integer> f54940w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f54941x = {8, 8, 8};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f54942y = {4};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f54943z = {8};

    /* renamed from: A, reason: collision with root package name */
    static final byte[] f54891A = {-1, -40, -1};

    /* renamed from: B, reason: collision with root package name */
    private static final byte[] f54892B = {102, 116, 121, 112};

    /* renamed from: C, reason: collision with root package name */
    private static final byte[] f54893C = {109, 105, 102, 49};

    /* renamed from: D, reason: collision with root package name */
    private static final byte[] f54894D = {104, 101, 105, 99};

    /* renamed from: E, reason: collision with root package name */
    private static final byte[] f54895E = {79, 76, 89, 77, 80, 0};

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f54896F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f54897G = {-119, 80, 78, 71, C14170dq.DARKEN, 10, 26, 10};

    /* renamed from: H, reason: collision with root package name */
    private static final byte[] f54898H = {101, 88, 73, 102};

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f54899I = {73, 72, 68, 82};

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f54900J = {73, 69, 78, 68};

    /* renamed from: K, reason: collision with root package name */
    private static final byte[] f54901K = {82, 73, 70, 70};

    /* renamed from: L, reason: collision with root package name */
    private static final byte[] f54902L = {87, 69, 66, 80};

    /* renamed from: M, reason: collision with root package name */
    private static final byte[] f54903M = {69, 88, 73, 70};

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f54904N = {-99, 1, 42};

    /* renamed from: O, reason: collision with root package name */
    private static final byte[] f54905O = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    private static final byte[] f54906P = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    private static final byte[] f54907Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    private static final byte[] f54908R = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f54909S = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V, reason: collision with root package name */
    static final String[] f54912V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W, reason: collision with root package name */
    static final int[] f54913W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X, reason: collision with root package name */
    static final byte[] f54914X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C1121a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        long f54964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f54965b;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        C1121a(f fVar) {
            this.f54965b = fVar;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f54964a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f54965b.available()) {
                        return -1;
                    }
                    this.f54965b.h(j10);
                    this.f54964a = j10;
                }
                if (i11 > this.f54965b.available()) {
                    i11 = this.f54965b.available();
                }
                int i12 = this.f54965b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f54964a += i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f54964a = -1L;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput, InputStreamRetargetInterface {

        /* renamed from: a, reason: collision with root package name */
        protected final DataInputStream f54967a;

        /* renamed from: b, reason: collision with root package name */
        protected int f54968b;

        /* renamed from: c, reason: collision with root package name */
        private ByteOrder f54969c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f54970d;

        /* renamed from: e, reason: collision with root package name */
        private int f54971e;

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f54971e = bArr.length;
        }

        public void g(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f54967a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f54970d == null) {
                        this.f54970d = new byte[8192];
                    }
                    iSkip = this.f54967a.read(this.f54970d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f54968b += i11;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f54968b++;
            return this.f54967a.read();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f54968b += i11;
            this.f54967a.readFully(bArr, i10, i11);
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        public int a() {
            return this.f54971e;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f54967a.available();
        }

        public int b() {
            return this.f54968b;
        }

        public void d(ByteOrder byteOrder) {
            this.f54969c = byteOrder;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f54968b++;
            return this.f54967a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f54968b++;
            int i10 = this.f54967a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f54968b += 2;
            return this.f54967a.readChar();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f54968b += 4;
            int i10 = this.f54967a.read();
            int i11 = this.f54967a.read();
            int i12 = this.f54967a.read();
            int i13 = this.f54967a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f54969c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f54969c);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            FS.log_d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f54968b += 8;
            int i10 = this.f54967a.read();
            int i11 = this.f54967a.read();
            int i12 = this.f54967a.read();
            int i13 = this.f54967a.read();
            int i14 = this.f54967a.read();
            int i15 = this.f54967a.read();
            int i16 = this.f54967a.read();
            int i17 = this.f54967a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f54969c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i17 << 56) + (i16 << 48) + (i15 << 40) + (i14 << 32) + (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 56) + (i11 << 48) + (i12 << 40) + (i13 << 32) + (i14 << 24) + (i15 << 16) + (i16 << 8) + i17;
            }
            throw new IOException("Invalid byte order: " + this.f54969c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f54968b += 2;
            int i10 = this.f54967a.read();
            int i11 = this.f54967a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f54969c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f54969c);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f54968b += 2;
            return this.f54967a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f54968b++;
            return this.f54967a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f54968b += 2;
            int i10 = this.f54967a.read();
            int i11 = this.f54967a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f54969c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f54969c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public long c() throws IOException {
            return readInt() & 4294967295L;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f54967a.read(bArr, i10, i11);
            this.f54968b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f54968b += bArr.length;
            this.f54967a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f54967a = dataInputStream;
            dataInputStream.mark(0);
            this.f54968b = 0;
            this.f54969c = byteOrder;
            this.f54971e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f54972a;

        /* renamed from: b, reason: collision with root package name */
        public final int f54973b;

        /* renamed from: c, reason: collision with root package name */
        public final long f54974c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f54975d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f54972a = i10;
            this.f54973b = i11;
            this.f54974c = j10;
            this.f54975d = bArr;
        }

        public static c b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f54913W[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new c(12, dArr.length, byteBufferWrap.array());
        }

        public static c c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f54913W[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new c(9, iArr.length, byteBufferWrap.array());
        }

        public static c d(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f54913W[10] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f54980a);
                byteBufferWrap.putInt((int) eVar.f54981b);
            }
            return new c(10, eVarArr.length, byteBufferWrap.array());
        }

        public static c e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f54931o0);
            return new c(2, bytes.length, bytes);
        }

        public static c g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f54913W[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c i(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f54913W[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f54980a);
                byteBufferWrap.putInt((int) eVar.f54981b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f54913W[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:18:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:114:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v20, types: [int[]] */
        /* JADX WARN: Type inference failed for: r11v22, types: [long[]] */
        /* JADX WARN: Type inference failed for: r11v24, types: [androidx.exifinterface.media.a$e[]] */
        /* JADX WARN: Type inference failed for: r11v26, types: [int[]] */
        /* JADX WARN: Type inference failed for: r11v28, types: [int[]] */
        /* JADX WARN: Type inference failed for: r11v30, types: [androidx.exifinterface.media.a$e[]] */
        /* JADX WARN: Type inference failed for: r11v32, types: [double[]] */
        /* JADX WARN: Type inference failed for: r11v35, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object o(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.c.o(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.f54912V[this.f54972a] + ", data length:" + this.f54975d.length + ")";
        }

        public static c a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new c(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f54931o0);
            return new c(1, bytes.length, bytes);
        }

        public static c h(e eVar, ByteOrder byteOrder) {
            return i(new e[]{eVar}, byteOrder);
        }

        public static c j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO != null) {
                if (objO instanceof String) {
                    return Double.parseDouble((String) objO);
                }
                if (objO instanceof long[]) {
                    if (((long[]) objO).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objO instanceof int[]) {
                    if (((int[]) objO).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objO instanceof double[]) {
                    double[] dArr = (double[]) objO;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objO instanceof e[]) {
                    e[] eVarArr = (e[]) objO;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO != null) {
                if (objO instanceof String) {
                    return Integer.parseInt((String) objO);
                }
                if (objO instanceof long[]) {
                    long[] jArr = (long[]) objO;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objO instanceof int[]) {
                    int[] iArr = (int[]) objO;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objO instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objO;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f54980a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f54981b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f54976a;

        /* renamed from: b, reason: collision with root package name */
        public final String f54977b;

        /* renamed from: c, reason: collision with root package name */
        public final int f54978c;

        /* renamed from: d, reason: collision with root package name */
        public final int f54979d;

        d(String str, int i10, int i11) {
            this.f54977b = str;
            this.f54976a = i10;
            this.f54978c = i11;
            this.f54979d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f54978c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f54979d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f54977b = str;
            this.f54976a = i10;
            this.f54978c = i11;
            this.f54979d = i12;
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f54980a;

        /* renamed from: b, reason: collision with root package name */
        public final long f54981b;

        e(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f54980a = 0L;
                this.f54981b = 1L;
            } else {
                this.f54980a = j10;
                this.f54981b = j11;
            }
        }

        public double a() {
            return this.f54980a / this.f54981b;
        }

        public String toString() {
            return this.f54980a + q2.f93563c + this.f54981b;
        }
    }

    private static class f extends b {
        f(byte[] bArr) throws IOException {
            super(bArr);
            this.f54967a.mark(a.e.API_PRIORITY_OTHER);
        }

        public void h(long j10) throws IOException {
            int i10 = this.f54968b;
            if (i10 > j10) {
                this.f54968b = 0;
                this.f54967a.reset();
            } else {
                j10 -= i10;
            }
            g((int) j10);
        }

        f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f54967a.mark(a.e.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", l3.f93323c, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, 3), new d("Software", HttpResponseStatus.REDIRECTION_USE_PROXY, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f54915Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f54916Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f54917a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f54918b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", l3.f93323c, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, 3), new d("Software", HttpResponseStatus.REDIRECTION_USE_PROXY, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f54919c0 = dVarArr5;
        f54920d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f54921e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f54922f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f54923g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f54924h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f54925i0 = dVarArr10;
        f54926j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f54927k0 = new HashMap[dVarArr10.length];
        f54928l0 = new HashMap[dVarArr10.length];
        f54929m0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f54930n0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f54931o0 = charsetForName;
        f54932p0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f54933q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f54910T = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f54911U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f54925i0;
            if (i10 >= dVarArr11.length) {
                HashMap<Integer, Integer> map = f54930n0;
                d[] dVarArr12 = f54926j0;
                map.put(Integer.valueOf(dVarArr12[0].f54976a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f54976a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f54976a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f54976a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f54976a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f54976a), 8);
                f54934r0 = Pattern.compile(".*[1-9].*");
                f54935s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f54936t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f54938u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f54927k0[i10] = new HashMap<>();
            f54928l0[i10] = new HashMap<>();
            for (d dVar : dVarArr11[i10]) {
                f54927k0[i10].put(Integer.valueOf(dVar.f54976a), dVar);
                f54928l0[i10].put(dVar.f54977b, dVar);
            }
            i10++;
        }
    }

    public a(String str) throws Throwable {
        d[][] dVarArr = f54925i0;
        this.f54949f = new HashMap[dVarArr.length];
        this.f54950g = new HashSet(dVarArr.length);
        this.f54951h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        w(str);
    }

    private static boolean A(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f54891A;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean B(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderM = M(bVar2);
                this.f54951h = byteOrderM;
                bVar2.d(byteOrderM);
                short s10 = bVar2.readShort();
                boolean z10 = s10 == 20306 || s10 == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean C(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f54897G;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean E(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderM = M(bVar2);
                this.f54951h = byteOrderM;
                bVar2.d(byteOrderM);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean I(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f54901K;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f54902L;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f54901K.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void L() {
        for (int i10 = 0; i10 < this.f54949f.length; i10++) {
            FS.log_d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f54949f[i10].size());
            for (Map.Entry<String, c> entry : this.f54949f[i10].entrySet()) {
                c value = entry.getValue();
                FS.log_d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f54951h) + "'");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O(androidx.exifinterface.media.a.f r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.O(androidx.exifinterface.media.a$f, int):void");
    }

    private static boolean T(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void W() throws Throwable {
        U(0, 5);
        U(0, 4);
        U(5, 4);
        c cVar = this.f54949f[1].get("PixelXDimension");
        c cVar2 = this.f54949f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f54949f[0].put("ImageWidth", cVar);
            this.f54949f[0].put("ImageLength", cVar2);
        }
        if (this.f54949f[4].isEmpty() && H(this.f54949f[5])) {
            HashMap<String, c>[] mapArr = this.f54949f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!H(this.f54949f[4])) {
            FS.log_d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        P(0, "ThumbnailOrientation", "Orientation");
        P(0, "ThumbnailImageLength", "ImageLength");
        P(0, "ThumbnailImageWidth", "ImageWidth");
        P(5, "ThumbnailOrientation", "Orientation");
        P(5, "ThumbnailImageLength", "ImageLength");
        P(5, "ThumbnailImageWidth", "ImageWidth");
        P(4, "Orientation", "ThumbnailOrientation");
        P(4, "ImageLength", "ThumbnailImageLength");
        P(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private static Pair<Integer, Integer> t(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairT = t(strArrSplit[0]);
            if (((Integer) pairT.first).intValue() == 2) {
                return pairT;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairT2 = t(strArrSplit[i10]);
                int iIntValue = (((Integer) pairT2.first).equals(pairT.first) || ((Integer) pairT2.second).equals(pairT.first)) ? ((Integer) pairT.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairT.second).intValue() == -1 || !(((Integer) pairT2.first).equals(pairT.second) || ((Integer) pairT2.second).equals(pairT.second))) ? -1 : ((Integer) pairT.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairT = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairT = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairT;
        }
        if (!str.contains(q2.f93563c)) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    return (j10 < 0 || j10 > 65535) ? j10 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(q2.f93563c, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private boolean z(byte[] bArr) throws Throwable {
        b bVar;
        long length;
        byte[] bArr2;
        long j10;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            length = bVar.readInt();
            bArr2 = new byte[4];
            bVar.readFully(bArr2);
        } catch (Exception e11) {
            e = e11;
            bVar2 = bVar;
            if (f54937u) {
                FS.log_d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f54892B)) {
            bVar.close();
            return false;
        }
        if (length == 1) {
            length = bVar.readLong();
            j10 = 16;
            if (length < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (length > bArr.length) {
            length = bArr.length;
        }
        long j11 = length - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            try {
                bVar.readFully(bArr3);
                if (j12 != 1) {
                    if (Arrays.equals(bArr3, f54893C)) {
                        z10 = true;
                    } else if (Arrays.equals(bArr3, f54894D)) {
                        z11 = true;
                    }
                    if (z10 && z11) {
                        bVar.close();
                        return true;
                    }
                }
            } catch (EOFException unused) {
                bVar.close();
                return false;
            }
        }
        bVar.close();
        return false;
    }

    private boolean D(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private static boolean F(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f54937u) {
                return false;
            }
            FS.log_d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean G(HashMap map) throws IOException {
        c cVar;
        int iM;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.o(this.f54951h);
            int[] iArr2 = f54941x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f54947d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iM = cVar.m(this.f54951h)) == 1 && Arrays.equals(iArr, f54943z)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f54937u) {
            return false;
        }
        FS.log_d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean H(HashMap map) throws IOException {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.m(this.f54951h) <= 512 && cVar2.m(this.f54951h) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:48:0x009b, B:50:0x009f), top: B:61:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lba
            r0 = 0
            r1 = r0
        L4:
            androidx.exifinterface.media.a$d[][] r2 = androidx.exifinterface.media.a.f54925i0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$c>[] r2 = r4.f54949f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Laf
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f54948e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.k(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f54947d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f54947d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = T(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            androidx.exifinterface.media.a$f r0 = new androidx.exifinterface.media.a$f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f54948e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.r(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f54947d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.h(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.l(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.q(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.o(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f54959p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.h(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.S(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f54947d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.i(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.m(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.n(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.s(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = androidx.exifinterface.media.a.f54937u
            if (r5 == 0) goto Lae
            r4.L()
            return
        L9b:
            boolean r0 = androidx.exifinterface.media.a.f54937u     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            com.fullstory.FS.log_w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lae
            r4.L()
        Lae:
            return
        Laf:
            r4.a()
            boolean r0 = androidx.exifinterface.media.a.f54937u
            if (r0 == 0) goto Lb9
            r4.L()
        Lb9:
            throw r5
        Lba:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.J(java.io.InputStream):void");
    }

    private void N(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        K(fVar);
        O(fVar, i10);
    }

    private void P(int i10, String str, String str2) {
        if (this.f54949f[i10].isEmpty() || this.f54949f[i10].get(str) == null) {
            return;
        }
        HashMap<String, c> map = this.f54949f[i10];
        map.put(str2, map.get(str));
        this.f54949f[i10].remove(str);
    }

    private void Q(f fVar, int i10) throws Throwable {
        c cVar = this.f54949f[i10].get("ImageLength");
        c cVar2 = this.f54949f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = this.f54949f[i10].get("JPEGInterchangeFormat");
            c cVar4 = this.f54949f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int iM = cVar3.m(this.f54951h);
            int iM2 = cVar3.m(this.f54951h);
            fVar.h(iM);
            byte[] bArr = new byte[iM2];
            fVar.readFully(bArr);
            i(new b(bArr), iM, i10);
        }
    }

    private void S(b bVar) throws Throwable {
        HashMap<String, c> map = this.f54949f[4];
        c cVar = map.get("Compression");
        if (cVar == null) {
            this.f54958o = 6;
            u(bVar, map);
            return;
        }
        int iM = cVar.m(this.f54951h);
        this.f54958o = iM;
        if (iM != 1) {
            if (iM == 6) {
                u(bVar, map);
                return;
            } else if (iM != 7) {
                return;
            }
        }
        if (G(map)) {
            v(bVar, map);
        }
    }

    private void U(int i10, int i11) throws Throwable {
        if (this.f54949f[i10].isEmpty() || this.f54949f[i11].isEmpty()) {
            if (f54937u) {
                FS.log_d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = this.f54949f[i10].get("ImageLength");
        c cVar2 = this.f54949f[i10].get("ImageWidth");
        c cVar3 = this.f54949f[i11].get("ImageLength");
        c cVar4 = this.f54949f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f54937u) {
                FS.log_d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f54937u) {
                FS.log_d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM = cVar.m(this.f54951h);
        int iM2 = cVar2.m(this.f54951h);
        int iM3 = cVar3.m(this.f54951h);
        int iM4 = cVar4.m(this.f54951h);
        if (iM >= iM3 || iM2 >= iM4) {
            return;
        }
        HashMap<String, c>[] mapArr = this.f54949f;
        HashMap<String, c> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private void V(f fVar, int i10) throws Throwable {
        c cVarJ;
        c cVarJ2;
        c cVar = this.f54949f[i10].get("DefaultCropSize");
        c cVar2 = this.f54949f[i10].get("SensorTopBorder");
        c cVar3 = this.f54949f[i10].get("SensorLeftBorder");
        c cVar4 = this.f54949f[i10].get("SensorBottomBorder");
        c cVar5 = this.f54949f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                Q(fVar, i10);
                return;
            }
            int iM = cVar2.m(this.f54951h);
            int iM2 = cVar4.m(this.f54951h);
            int iM3 = cVar5.m(this.f54951h);
            int iM4 = cVar3.m(this.f54951h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            c cVarJ3 = c.j(iM2 - iM, this.f54951h);
            c cVarJ4 = c.j(iM3 - iM4, this.f54951h);
            this.f54949f[i10].put("ImageLength", cVarJ3);
            this.f54949f[i10].put("ImageWidth", cVarJ4);
            return;
        }
        if (cVar.f54972a == 5) {
            e[] eVarArr = (e[]) cVar.o(this.f54951h);
            if (eVarArr == null || eVarArr.length != 2) {
                FS.log_w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarJ = c.h(eVarArr[0], this.f54951h);
            cVarJ2 = c.h(eVarArr[1], this.f54951h);
        } else {
            int[] iArr = (int[]) cVar.o(this.f54951h);
            if (iArr == null || iArr.length != 2) {
                FS.log_w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarJ = c.j(iArr[0], this.f54951h);
            cVarJ2 = c.j(iArr[1], this.f54951h);
        }
        this.f54949f[i10].put("ImageWidth", cVarJ);
        this.f54949f[i10].put("ImageLength", cVarJ2);
    }

    private void a() {
        String strD = d("DateTimeOriginal");
        if (strD != null && d("DateTime") == null) {
            this.f54949f[0].put("DateTime", c.e(strD));
        }
        if (d("ImageWidth") == null) {
            this.f54949f[0].put("ImageWidth", c.f(0L, this.f54951h));
        }
        if (d("ImageLength") == null) {
            this.f54949f[0].put("ImageLength", c.f(0L, this.f54951h));
        }
        if (d("Orientation") == null) {
            this.f54949f[0].put("Orientation", c.f(0L, this.f54951h));
        }
        if (d("LightSource") == null) {
            this.f54949f[1].put("LightSource", c.f(0L, this.f54951h));
        }
    }

    private static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split(q2.f93563c, -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(q2.f93563c, -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(q2.f93563c, -1);
            double d12 = d10 + (d11 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private c g(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f54937u) {
                FS.log_d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f54925i0.length; i10++) {
            c cVar = this.f54949f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void h(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C1122b.a(mediaMetadataRetriever, new C1121a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f54949f[0].put("ImageWidth", c.j(Integer.parseInt(strExtractMetadata), this.f54951h));
                }
                if (strExtractMetadata2 != null) {
                    this.f54949f[0].put("ImageLength", c.j(Integer.parseInt(strExtractMetadata2), this.f54951h));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    this.f54949f[0].put("Orientation", c.j(i10 != 90 ? i10 != 180 ? i10 != 270 ? 1 : 8 : 3 : 6, this.f54951h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.h(i11);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, f54932p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    fVar.readFully(bArr2);
                    this.f54959p = i13;
                    N(bArr2, 0);
                }
                if (f54937u) {
                    FS.log_d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x017b, code lost:
    
        r21.d(r20.f54951h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0180, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(androidx.exifinterface.media.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.i(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int k(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (A(bArr)) {
            return 4;
        }
        if (D(bArr)) {
            return 9;
        }
        if (z(bArr)) {
            return 12;
        }
        if (B(bArr)) {
            return 7;
        }
        if (E(bArr)) {
            return 10;
        }
        if (C(bArr)) {
            return 13;
        }
        return I(bArr) ? 14 : 0;
    }

    private void m(b bVar) throws Throwable {
        if (f54937u) {
            FS.log_d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f54897G;
        bVar.g(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f54899I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f54900J)) {
                    return;
                }
                if (Arrays.equals(bArr2, f54898H)) {
                    byte[] bArr3 = new byte[i10];
                    bVar.readFully(bArr3);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f54959p = i11;
                        N(bArr3, 0);
                        W();
                        S(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.g(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void n(b bVar) throws Throwable {
        boolean z10 = f54937u;
        if (z10) {
            FS.log_d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.g(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.g(i10 - bVar.b());
        bVar.readFully(bArr4);
        i(new b(bArr4), i10, 5);
        bVar.g(i12 - bVar.b());
        bVar.d(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            FS.log_d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f54920d0.f54976a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarJ = c.j(s10, this.f54951h);
                c cVarJ2 = c.j(s11, this.f54951h);
                this.f54949f[0].put("ImageLength", cVarJ);
                this.f54949f[0].put("ImageWidth", cVarJ2);
                if (f54937u) {
                    FS.log_d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.g(unsignedShort2);
        }
    }

    private void q(f fVar) throws Throwable {
        if (f54937u) {
            FS.log_d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        o(fVar);
        c cVar = this.f54949f[0].get("JpgFromRaw");
        if (cVar != null) {
            i(new b(cVar.f54975d), (int) cVar.f54974c, 5);
        }
        c cVar2 = this.f54949f[0].get("ISO");
        c cVar3 = this.f54949f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f54949f[1].put("PhotographicSensitivity", cVar2);
    }

    private void r(f fVar) throws IOException {
        byte[] bArr = f54932p0;
        fVar.g(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f54959p = bArr.length;
        N(bArr2, 0);
    }

    private void s(b bVar) throws Throwable {
        if (f54937u) {
            FS.log_d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.LITTLE_ENDIAN);
        bVar.g(f54901K.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f54902L;
        bVar.g(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f54903M, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    bVar.readFully(bArr3);
                    this.f54959p = i12;
                    N(bArr3, 0);
                    S(new b(bArr3));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.g(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void u(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iM = cVar.m(this.f54951h);
        int iM2 = cVar2.m(this.f54951h);
        if (this.f54947d == 7) {
            iM += this.f54960q;
        }
        if (iM > 0 && iM2 > 0) {
            this.f54952i = true;
            if (this.f54944a == null && this.f54946c == null && this.f54945b == null) {
                byte[] bArr = new byte[iM2];
                bVar.g(iM);
                bVar.readFully(bArr);
                this.f54957n = bArr;
            }
            this.f54955l = iM;
            this.f54956m = iM2;
        }
        if (f54937u) {
            FS.log_d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iM2);
        }
    }

    private void v(b bVar, HashMap map) throws IOException {
        int i10;
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrB = androidx.exifinterface.media.b.b(cVar.o(this.f54951h));
        long[] jArrB2 = androidx.exifinterface.media.b.b(cVar2.o(this.f54951h));
        if (jArrB == null || jArrB.length == 0) {
            FS.log_w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrB2 == null || jArrB2.length == 0) {
            FS.log_w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrB.length != jArrB2.length) {
            FS.log_w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrB2) {
            j10 += j11;
        }
        int i11 = (int) j10;
        byte[] bArr = new byte[i11];
        int i12 = 1;
        this.f54954k = true;
        this.f54953j = true;
        this.f54952i = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < jArrB.length) {
            int i16 = (int) jArrB[i13];
            int i17 = (int) jArrB2[i13];
            if (i13 < jArrB.length - i12) {
                i10 = i13;
                if (i16 + i17 != jArrB[i10 + 1]) {
                    this.f54954k = false;
                }
            } else {
                i10 = i13;
            }
            int i18 = i16 - i14;
            if (i18 < 0) {
                FS.log_d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.g(i18);
                int i19 = i14 + i18;
                byte[] bArr2 = new byte[i17];
                try {
                    bVar.readFully(bArr2);
                    i14 = i19 + i17;
                    System.arraycopy(bArr2, 0, bArr, i15, i17);
                    i15 += i17;
                    i13 = i10 + 1;
                    i12 = 1;
                } catch (EOFException unused) {
                    FS.log_d("ExifInterface", "Failed to read " + i17 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                FS.log_d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                return;
            }
        }
        this.f54957n = bArr;
        if (this.f54954k) {
            this.f54955l = (int) jArrB[0];
            this.f54956m = i11;
        }
    }

    private void w(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f54946c = null;
        this.f54944a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (F(fileInputStream.getFD())) {
                this.f54945b = fileInputStream.getFD();
            } else {
                this.f54945b = null;
            }
            J(fileInputStream);
            androidx.exifinterface.media.b.a(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.a(fileInputStream2);
            throw th;
        }
    }

    private static boolean x(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f54932p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f54932p0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    public void R(String str, String str2) throws NumberFormatException {
        d dVar;
        int i10;
        int i11;
        int i12;
        String str3;
        int i13;
        String str4 = str;
        String strReplaceAll = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        String str5 = "ExifInterface";
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && strReplaceAll != null) {
            boolean zFind = f54936t0.matcher(strReplaceAll).find();
            boolean zFind2 = f54938u0.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                FS.log_w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (f54937u) {
                FS.log_d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i14 = 2;
        int i15 = 1;
        if (strReplaceAll != null && f54929m0.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f54935s0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    FS.log_w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new e(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    FS.log_w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i17 < f54925i0.length) {
            if ((i17 != 4 || this.f54952i) && (dVar = f54928l0[i17].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairT = t(strReplaceAll);
                    if (dVar.f54978c == ((Integer) pairT.first).intValue() || dVar.f54978c == ((Integer) pairT.second).intValue()) {
                        i10 = dVar.f54978c;
                    } else {
                        int i18 = dVar.f54979d;
                        if (i18 == -1 || !(i18 == ((Integer) pairT.first).intValue() || dVar.f54979d == ((Integer) pairT.second).intValue())) {
                            int i19 = dVar.f54978c;
                            if (i19 == i15 || i19 == 7 || i19 == i14) {
                                i10 = i19;
                            } else if (f54937u) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f54912V;
                                sb2.append(strArr[dVar.f54978c]);
                                sb2.append(dVar.f54979d == -1 ? "" : ", " + strArr[dVar.f54979d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairT.first).intValue()]);
                                sb2.append(((Integer) pairT.second).intValue() != -1 ? ", " + strArr[((Integer) pairT.second).intValue()] : "");
                                sb2.append(")");
                                FS.log_d(str5, sb2.toString());
                            }
                        } else {
                            i10 = dVar.f54979d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            this.f54949f[i12].put(str4, c.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            this.f54949f[i12].put(str4, c.e(strReplaceAll));
                            break;
                        case 3:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i20 = i11; i20 < strArrSplit.length; i20++) {
                                iArr[i20] = Integer.parseInt(strArrSplit[i20]);
                            }
                            this.f54949f[i12].put(str4, c.k(iArr, this.f54951h));
                            break;
                        case 4:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i21 = i11; i21 < strArrSplit2.length; i21++) {
                                jArr[i21] = Long.parseLong(strArrSplit2[i21]);
                            }
                            this.f54949f[i12].put(str4, c.g(jArr, this.f54951h));
                            break;
                        case 5:
                            i11 = i16;
                            i13 = i15;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            e[] eVarArr = new e[strArrSplit3.length];
                            int i22 = i11;
                            while (i22 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i22].split(q2.f93563c, -1);
                                eVarArr[i22] = new e((long) Double.parseDouble(strArrSplit4[i11]), (long) Double.parseDouble(strArrSplit4[i13]));
                                i22++;
                                str5 = str5;
                                i17 = i17;
                            }
                            i12 = i17;
                            str3 = str5;
                            this.f54949f[i12].put(str4, c.i(eVarArr, this.f54951h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f54937u) {
                                FS.log_d(str5, "Data format isn't one of expected formats: " + i10);
                                break;
                            }
                            break;
                        case 9:
                            i11 = i16;
                            i13 = i15;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i23 = i11; i23 < strArrSplit5.length; i23++) {
                                iArr2[i23] = Integer.parseInt(strArrSplit5[i23]);
                            }
                            this.f54949f[i17].put(str4, c.c(iArr2, this.f54951h));
                            i12 = i17;
                            str3 = str5;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            e[] eVarArr2 = new e[strArrSplit6.length];
                            int i24 = i16;
                            while (i24 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i24].split(q2.f93563c, -1);
                                eVarArr2[i24] = new e((long) Double.parseDouble(strArrSplit7[i16]), (long) Double.parseDouble(strArrSplit7[i15]));
                                i24++;
                                i16 = i16;
                                i15 = i15;
                                strArrSplit6 = strArrSplit6;
                            }
                            i11 = i16;
                            i13 = i15;
                            this.f54949f[i17].put(str4, c.d(eVarArr2, this.f54951h));
                            i12 = i17;
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i25 = i16; i25 < strArrSplit8.length; i25++) {
                                dArr[i25] = Double.parseDouble(strArrSplit8[i25]);
                            }
                            this.f54949f[i17].put(str4, c.b(dArr, this.f54951h));
                            break;
                    }
                } else {
                    this.f54949f[i17].remove(str4);
                }
                i11 = i16;
                i12 = i17;
                str3 = str5;
                i13 = i15;
            } else {
                i11 = i16;
                i12 = i17;
                str3 = str5;
                i13 = i15;
            }
            i17 = i12 + 1;
            i16 = i11;
            str5 = str3;
            i15 = i13;
            i14 = 2;
        }
    }

    public double c(double d10) {
        double dE = e("GPSAltitude", -1.0d);
        int iF = f("GPSAltitudeRef", -1);
        if (dE < 0.0d || iF < 0) {
            return d10;
        }
        return dE * (iF != 1 ? 1 : -1);
    }

    public String d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarG = g(str);
        if (cVarG != null) {
            if (!f54929m0.contains(str)) {
                return cVarG.n(this.f54951h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarG.f54972a;
                if (i10 != 5 && i10 != 10) {
                    FS.log_w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarG.f54972a);
                    return null;
                }
                e[] eVarArr = (e[]) cVarG.o(this.f54951h);
                if (eVarArr == null || eVarArr.length != 3) {
                    FS.log_w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f54980a / eVar.f54981b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f54980a / eVar2.f54981b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f54980a / eVar3.f54981b)));
            }
            try {
                return Double.toString(cVarG.l(this.f54951h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public double e(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarG = g(str);
        if (cVarG != null) {
            try {
                return cVarG.l(this.f54951h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    public int f(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarG = g(str);
        if (cVarG != null) {
            try {
                return cVarG.m(this.f54951h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public double[] j() {
        String strD = d("GPSLatitude");
        String strD2 = d("GPSLatitudeRef");
        String strD3 = d("GPSLongitude");
        String strD4 = d("GPSLongitudeRef");
        if (strD == null || strD2 == null || strD3 == null || strD4 == null) {
            return null;
        }
        try {
            return new double[]{b(strD, strD2), b(strD3, strD4)};
        } catch (IllegalArgumentException unused) {
            FS.log_w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strD, strD2, strD3, strD4));
            return null;
        }
    }

    public int p() {
        switch (f("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public boolean y() {
        int iF = f("Orientation", 1);
        return iF == 2 || iF == 7 || iF == 4 || iF == 5;
    }

    private void K(b bVar) throws IOException {
        ByteOrder byteOrderM = M(bVar);
        this.f54951h = byteOrderM;
        bVar.d(byteOrderM);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f54947d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 >= 8) {
            int i12 = i11 - 8;
            if (i12 > 0) {
                bVar.g(i12);
                return;
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + i11);
    }

    private ByteOrder M(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 != 18761) {
            if (s10 == 19789) {
                if (f54937u) {
                    FS.log_d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
        }
        if (f54937u) {
            FS.log_d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void l(f fVar) throws Throwable {
        int i10;
        int i11;
        o(fVar);
        c cVar = this.f54949f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f54975d);
            fVar2.d(this.f54951h);
            byte[] bArr = f54895E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.h(0L);
            byte[] bArr3 = f54896F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.h(12L);
            }
            O(fVar2, 6);
            c cVar2 = this.f54949f[7].get("PreviewImageStart");
            c cVar3 = this.f54949f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f54949f[5].put("JPEGInterchangeFormat", cVar2);
                this.f54949f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f54949f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.o(this.f54951h);
                if (iArr != null && iArr.length == 4) {
                    int i12 = iArr[2];
                    int i13 = iArr[0];
                    if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                        int i14 = (i12 - i13) + 1;
                        int i15 = (i10 - i11) + 1;
                        if (i14 < i15) {
                            int i16 = i14 + i15;
                            i15 = i16 - i15;
                            i14 = i16 - i15;
                        }
                        c cVarJ = c.j(i14, this.f54951h);
                        c cVarJ2 = c.j(i15, this.f54951h);
                        this.f54949f[0].put("ImageWidth", cVarJ);
                        this.f54949f[0].put("ImageLength", cVarJ2);
                        return;
                    }
                    return;
                }
                FS.log_w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    private void o(f fVar) throws Throwable {
        c cVar;
        K(fVar);
        O(fVar, 0);
        V(fVar, 0);
        V(fVar, 5);
        V(fVar, 4);
        W();
        if (this.f54947d == 8 && (cVar = this.f54949f[1].get("MakerNote")) != null) {
            f fVar2 = new f(cVar.f54975d);
            fVar2.d(this.f54951h);
            fVar2.g(6);
            O(fVar2, 9);
            c cVar2 = this.f54949f[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f54949f[1].put("ColorSpace", cVar2);
            }
        }
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.io.InputStream r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.a$d[][] r0 = androidx.exifinterface.media.a.f54925i0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f54949f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f54950g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f54951h = r0
            if (r4 == 0) goto L6a
            r0 = 0
            r3.f54944a = r0
            r1 = 1
            if (r5 != r1) goto L3c
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = androidx.exifinterface.media.a.f54932p0
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = x(r5)
            if (r4 != 0) goto L34
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            com.fullstory.FS.log_w(r4, r5)
            return
        L34:
            r3.f54948e = r1
            r3.f54946c = r0
            r3.f54945b = r0
            r4 = r5
            goto L66
        L3c:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L48
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f54946c = r5
            r3.f54945b = r0
            goto L66
        L48:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L62
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = F(r1)
            if (r1 == 0) goto L62
            r3.f54946c = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f54945b = r5
            goto L66
        L62:
            r3.f54946c = r0
            r3.f54945b = r0
        L66:
            r3.J(r4)
            return
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.<init>(java.io.InputStream, int):void");
    }
}

package P3;

import U3.r;
import a3.C5569i;
import a3.C5570j;
import a3.o;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13466a;
import d3.D;
import d3.P;
import d3.s;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import x3.C18002g;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;
import x3.O;
import x3.r;
import x3.u;

/* loaded from: classes4.dex */
public class e implements InterfaceC18011p {

    /* renamed from: f0, reason: collision with root package name */
    @Deprecated
    public static final u f24610f0 = new u() { // from class: P3.d
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return e.d();
        }
    };

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f24611g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: h0, reason: collision with root package name */
    private static final byte[] f24612h0 = P.q0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: i0, reason: collision with root package name */
    private static final byte[] f24613i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: j0, reason: collision with root package name */
    private static final byte[] f24614j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: k0, reason: collision with root package name */
    private static final UUID f24615k0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: l0, reason: collision with root package name */
    private static final Map<String, Integer> f24616l0;

    /* renamed from: A, reason: collision with root package name */
    private long f24617A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f24618B;

    /* renamed from: C, reason: collision with root package name */
    private long f24619C;

    /* renamed from: D, reason: collision with root package name */
    private long f24620D;

    /* renamed from: E, reason: collision with root package name */
    private long f24621E;

    /* renamed from: F, reason: collision with root package name */
    private s f24622F;

    /* renamed from: G, reason: collision with root package name */
    private s f24623G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f24624H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f24625I;

    /* renamed from: J, reason: collision with root package name */
    private int f24626J;

    /* renamed from: K, reason: collision with root package name */
    private long f24627K;

    /* renamed from: L, reason: collision with root package name */
    private long f24628L;

    /* renamed from: M, reason: collision with root package name */
    private int f24629M;

    /* renamed from: N, reason: collision with root package name */
    private int f24630N;

    /* renamed from: O, reason: collision with root package name */
    private int[] f24631O;

    /* renamed from: P, reason: collision with root package name */
    private int f24632P;

    /* renamed from: Q, reason: collision with root package name */
    private int f24633Q;

    /* renamed from: R, reason: collision with root package name */
    private int f24634R;

    /* renamed from: S, reason: collision with root package name */
    private int f24635S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f24636T;

    /* renamed from: U, reason: collision with root package name */
    private long f24637U;

    /* renamed from: V, reason: collision with root package name */
    private int f24638V;

    /* renamed from: W, reason: collision with root package name */
    private int f24639W;

    /* renamed from: X, reason: collision with root package name */
    private int f24640X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f24641Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f24642Z;

    /* renamed from: a, reason: collision with root package name */
    private final P3.c f24643a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f24644a0;

    /* renamed from: b, reason: collision with root package name */
    private final g f24645b;

    /* renamed from: b0, reason: collision with root package name */
    private int f24646b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f24647c;

    /* renamed from: c0, reason: collision with root package name */
    private byte f24648c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24649d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f24650d0;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24651e;

    /* renamed from: e0, reason: collision with root package name */
    private r f24652e0;

    /* renamed from: f, reason: collision with root package name */
    private final r.a f24653f;

    /* renamed from: g, reason: collision with root package name */
    private final D f24654g;

    /* renamed from: h, reason: collision with root package name */
    private final D f24655h;

    /* renamed from: i, reason: collision with root package name */
    private final D f24656i;

    /* renamed from: j, reason: collision with root package name */
    private final D f24657j;

    /* renamed from: k, reason: collision with root package name */
    private final D f24658k;

    /* renamed from: l, reason: collision with root package name */
    private final D f24659l;

    /* renamed from: m, reason: collision with root package name */
    private final D f24660m;

    /* renamed from: n, reason: collision with root package name */
    private final D f24661n;

    /* renamed from: o, reason: collision with root package name */
    private final D f24662o;

    /* renamed from: p, reason: collision with root package name */
    private final D f24663p;

    /* renamed from: q, reason: collision with root package name */
    private ByteBuffer f24664q;

    /* renamed from: r, reason: collision with root package name */
    private long f24665r;

    /* renamed from: s, reason: collision with root package name */
    private long f24666s;

    /* renamed from: t, reason: collision with root package name */
    private long f24667t;

    /* renamed from: u, reason: collision with root package name */
    private long f24668u;

    /* renamed from: v, reason: collision with root package name */
    private long f24669v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f24670w;

    /* renamed from: x, reason: collision with root package name */
    private c f24671x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f24672y;

    /* renamed from: z, reason: collision with root package name */
    private int f24673z;

    private final class b implements P3.b {
        private b() {
        }

        @Override // P3.b
        public void a(int i10) throws ParserException {
            e.this.q(i10);
        }

        @Override // P3.b
        public void b(int i10, double d10) throws ParserException {
            e.this.t(i10, d10);
        }

        @Override // P3.b
        public void c(int i10, long j10) throws ParserException {
            e.this.z(i10, j10);
        }

        @Override // P3.b
        public int d(int i10) {
            return e.this.w(i10);
        }

        @Override // P3.b
        public boolean e(int i10) {
            return e.this.B(i10);
        }

        @Override // P3.b
        public void f(int i10, String str) throws ParserException {
            e.this.I(i10, str);
        }

        @Override // P3.b
        public void g(int i10, int i11, InterfaceC18012q interfaceC18012q) throws IOException {
            e.this.n(i10, i11, interfaceC18012q);
        }

        @Override // P3.b
        public void h(int i10, long j10, long j11) throws ParserException {
            e.this.H(i10, j10, j11);
        }
    }

    protected static final class c {

        /* renamed from: P, reason: collision with root package name */
        public byte[] f24690P;

        /* renamed from: V, reason: collision with root package name */
        public x3.P f24696V;

        /* renamed from: W, reason: collision with root package name */
        public boolean f24697W;

        /* renamed from: Z, reason: collision with root package name */
        public O f24700Z;

        /* renamed from: a, reason: collision with root package name */
        public boolean f24701a;

        /* renamed from: a0, reason: collision with root package name */
        public int f24702a0;

        /* renamed from: b, reason: collision with root package name */
        public String f24703b;

        /* renamed from: c, reason: collision with root package name */
        public String f24704c;

        /* renamed from: d, reason: collision with root package name */
        public int f24705d;

        /* renamed from: e, reason: collision with root package name */
        public int f24706e;

        /* renamed from: f, reason: collision with root package name */
        public int f24707f;

        /* renamed from: g, reason: collision with root package name */
        public int f24708g;

        /* renamed from: h, reason: collision with root package name */
        private int f24709h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f24710i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f24711j;

        /* renamed from: k, reason: collision with root package name */
        public O.a f24712k;

        /* renamed from: l, reason: collision with root package name */
        public byte[] f24713l;

        /* renamed from: m, reason: collision with root package name */
        public o f24714m;

        /* renamed from: n, reason: collision with root package name */
        public int f24715n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f24716o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f24717p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f24718q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f24719r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f24720s = 0;

        /* renamed from: t, reason: collision with root package name */
        public int f24721t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f24722u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public float f24723v = 0.0f;

        /* renamed from: w, reason: collision with root package name */
        public float f24724w = 0.0f;

        /* renamed from: x, reason: collision with root package name */
        public byte[] f24725x = null;

        /* renamed from: y, reason: collision with root package name */
        public int f24726y = -1;

        /* renamed from: z, reason: collision with root package name */
        public boolean f24727z = false;

        /* renamed from: A, reason: collision with root package name */
        public int f24675A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f24676B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f24677C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f24678D = 1000;

        /* renamed from: E, reason: collision with root package name */
        public int f24679E = HttpResponseStatus.SUCCESS_OK;

        /* renamed from: F, reason: collision with root package name */
        public float f24680F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f24681G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f24682H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f24683I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f24684J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f24685K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f24686L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f24687M = -1.0f;

        /* renamed from: N, reason: collision with root package name */
        public float f24688N = -1.0f;

        /* renamed from: O, reason: collision with root package name */
        public float f24689O = -1.0f;

        /* renamed from: Q, reason: collision with root package name */
        public int f24691Q = 1;

        /* renamed from: R, reason: collision with root package name */
        public int f24692R = -1;

        /* renamed from: S, reason: collision with root package name */
        public int f24693S = 8000;

        /* renamed from: T, reason: collision with root package name */
        public long f24694T = 0;

        /* renamed from: U, reason: collision with root package name */
        public long f24695U = 0;

        /* renamed from: X, reason: collision with root package name */
        public boolean f24698X = true;

        /* renamed from: Y, reason: collision with root package name */
        private String f24699Y = "eng";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x0462  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0464  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0471  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0483  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x05ad  */
        /* JADX WARN: Removed duplicated region for block: B:302:0x05c8  */
        /* JADX WARN: Removed duplicated region for block: B:303:0x05cb  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(x3.r r19, int r20) throws androidx.media3.common.ParserException {
            /*
                Method dump skipped, instructions count: 1744
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: P3.e.c.i(x3.r, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            C13466a.e(this.f24700Z);
        }

        private byte[] g(String str) throws ParserException {
            byte[] bArr = this.f24713l;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.f24680F == -1.0f || this.f24681G == -1.0f || this.f24682H == -1.0f || this.f24683I == -1.0f || this.f24684J == -1.0f || this.f24685K == -1.0f || this.f24686L == -1.0f || this.f24687M == -1.0f || this.f24688N == -1.0f || this.f24689O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f24680F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f24681G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f24682H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f24683I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f24684J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f24685K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f24686L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f24687M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f24688N + 0.5f));
            byteBufferOrder.putShort((short) (this.f24689O + 0.5f));
            byteBufferOrder.putShort((short) this.f24678D);
            byteBufferOrder.putShort((short) this.f24679E);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(D d10) throws ParserException {
            try {
                d10.X(16);
                long jX = d10.x();
                if (jX == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jX == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jX != 826496599) {
                    d3.r.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrE = d10.e();
                for (int iF = d10.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & l3.f92484c) != 255) {
                        break;
                    }
                    i12 += l3.f92484c;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & l3.f92484c);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & l3.f92484c) != 255) {
                        break;
                    }
                    i16 += l3.f92484c;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & l3.f92484c);
                if (bArr[i17] != 1) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            return "A_OPUS".equals(this.f24704c) ? z10 : this.f24708g > 0;
        }

        public void j() {
            x3.P p10 = this.f24696V;
            if (p10 != null) {
                p10.a(this.f24700Z, this.f24712k);
            }
        }

        public void n() {
            x3.P p10 = this.f24696V;
            if (p10 != null) {
                p10.b();
            }
        }

        protected c() {
        }

        private static boolean l(D d10) throws ParserException {
            try {
                int iZ = d10.z();
                if (iZ == 1) {
                    return true;
                }
                if (iZ == 65534) {
                    d10.W(24);
                    if (d10.A() == e.f24615k0.getMostSignificantBits()) {
                        if (d10.A() == e.f24615k0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing MS/ACM codec private", null);
            }
        }
    }

    public e(r.a aVar, int i10) {
        this(new P3.a(), i10, aVar);
    }

    private void E() {
        this.f24638V = 0;
        this.f24639W = 0;
        this.f24640X = 0;
        this.f24641Y = false;
        this.f24642Z = false;
        this.f24644a0 = false;
        this.f24646b0 = 0;
        this.f24648c0 = (byte) 0;
        this.f24650d0 = false;
        this.f24659l.S(0);
    }

    private void K(InterfaceC18012q interfaceC18012q, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f24660m.b() < length) {
            this.f24660m.T(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f24660m.e(), 0, bArr.length);
        }
        interfaceC18012q.readFully(this.f24660m.e(), bArr.length, i10);
        this.f24660m.W(0);
        this.f24660m.V(length);
    }

    @Override // x3.InterfaceC18011p
    public final int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        this.f24625I = false;
        boolean zA = true;
        while (zA && !this.f24625I) {
            zA = this.f24643a.a(interfaceC18012q);
            if (zA && C(i10, interfaceC18012q.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f24647c.size(); i11++) {
            c cVarValueAt = this.f24647c.valueAt(i11);
            cVarValueAt.f();
            cVarValueAt.j();
        }
        return -1;
    }

    @Override // x3.InterfaceC18011p
    public final void release() {
    }

    protected void y(c cVar, int i10, InterfaceC18012q interfaceC18012q, int i11) throws IOException {
        if (i10 != 4 || !"V_VP9".equals(cVar.f24704c)) {
            interfaceC18012q.k(i11);
        } else {
            this.f24663p.S(i11);
            interfaceC18012q.readFully(this.f24663p.e(), 0, i11);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f24616l0 = Collections.unmodifiableMap(map);
    }

    e(P3.c cVar, int i10, r.a aVar) {
        this.f24666s = -1L;
        this.f24667t = -9223372036854775807L;
        this.f24668u = -9223372036854775807L;
        this.f24669v = -9223372036854775807L;
        this.f24619C = -1L;
        this.f24620D = -1L;
        this.f24621E = -9223372036854775807L;
        this.f24643a = cVar;
        cVar.b(new b());
        this.f24653f = aVar;
        this.f24649d = (i10 & 1) == 0;
        this.f24651e = (i10 & 2) == 0;
        this.f24645b = new g();
        this.f24647c = new SparseArray<>();
        this.f24656i = new D(4);
        this.f24657j = new D(ByteBuffer.allocate(4).putInt(-1).array());
        this.f24658k = new D(4);
        this.f24654g = new D(e3.f.f128084a);
        this.f24655h = new D(4);
        this.f24659l = new D();
        this.f24660m = new D();
        this.f24661n = new D(8);
        this.f24662o = new D();
        this.f24663p = new D();
        this.f24631O = new int[1];
    }

    private boolean C(I i10, long j10) {
        if (this.f24618B) {
            this.f24620D = j10;
            i10.f169077a = this.f24619C;
            this.f24618B = false;
            return true;
        }
        if (this.f24672y) {
            long j11 = this.f24620D;
            if (j11 != -1) {
                i10.f169077a = j11;
                this.f24620D = -1L;
                return true;
            }
        }
        return false;
    }

    private void D(InterfaceC18012q interfaceC18012q, int i10) throws IOException {
        if (this.f24656i.g() >= i10) {
            return;
        }
        if (this.f24656i.b() < i10) {
            D d10 = this.f24656i;
            d10.c(Math.max(d10.b() * 2, i10));
        }
        interfaceC18012q.readFully(this.f24656i.e(), this.f24656i.g(), i10 - this.f24656i.g());
        this.f24656i.V(i10);
    }

    private long F(long j10) throws ParserException {
        long j11 = this.f24667t;
        if (j11 != -9223372036854775807L) {
            return P.V0(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private int J(InterfaceC18012q interfaceC18012q, c cVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f24704c)) {
            K(interfaceC18012q, f24611g0, i10);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.f24704c)) {
            K(interfaceC18012q, f24613i0, i10);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f24704c)) {
            K(interfaceC18012q, f24614j0, i10);
            return s();
        }
        O o10 = cVar.f24700Z;
        if (!this.f24641Y) {
            if (cVar.f24710i) {
                this.f24634R &= -1073741825;
                if (!this.f24642Z) {
                    interfaceC18012q.readFully(this.f24656i.e(), 0, 1);
                    this.f24638V++;
                    if ((this.f24656i.e()[0] & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f24648c0 = this.f24656i.e()[0];
                    this.f24642Z = true;
                }
                byte b10 = this.f24648c0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.f24634R |= 1073741824;
                    if (!this.f24650d0) {
                        interfaceC18012q.readFully(this.f24661n.e(), 0, 8);
                        this.f24638V += 8;
                        this.f24650d0 = true;
                        this.f24656i.e()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f24656i.W(0);
                        o10.e(this.f24656i, 1, 1);
                        this.f24639W++;
                        this.f24661n.W(0);
                        o10.e(this.f24661n, 8, 1);
                        this.f24639W += 8;
                    }
                    if (z11) {
                        if (!this.f24644a0) {
                            interfaceC18012q.readFully(this.f24656i.e(), 0, 1);
                            this.f24638V++;
                            this.f24656i.W(0);
                            this.f24646b0 = this.f24656i.H();
                            this.f24644a0 = true;
                        }
                        int i12 = this.f24646b0 * 4;
                        this.f24656i.S(i12);
                        interfaceC18012q.readFully(this.f24656i.e(), 0, i12);
                        this.f24638V += i12;
                        short s10 = (short) ((this.f24646b0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f24664q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f24664q = ByteBuffer.allocate(i13);
                        }
                        this.f24664q.position(0);
                        this.f24664q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f24646b0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iL = this.f24656i.L();
                            if (i14 % 2 == 0) {
                                this.f24664q.putShort((short) (iL - i15));
                            } else {
                                this.f24664q.putInt(iL - i15);
                            }
                            i14++;
                            i15 = iL;
                        }
                        int i16 = (i10 - this.f24638V) - i15;
                        if (i11 % 2 == 1) {
                            this.f24664q.putInt(i16);
                        } else {
                            this.f24664q.putShort((short) i16);
                            this.f24664q.putInt(0);
                        }
                        this.f24662o.U(this.f24664q.array(), i13);
                        o10.e(this.f24662o, i13, 1);
                        this.f24639W += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f24711j;
                if (bArr != null) {
                    this.f24659l.U(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.f24634R |= 268435456;
                this.f24663p.S(0);
                int iG = (this.f24659l.g() + i10) - this.f24638V;
                this.f24656i.S(4);
                this.f24656i.e()[0] = (byte) ((iG >> 24) & l3.f92484c);
                this.f24656i.e()[1] = (byte) ((iG >> 16) & l3.f92484c);
                this.f24656i.e()[2] = (byte) ((iG >> 8) & l3.f92484c);
                this.f24656i.e()[3] = (byte) (iG & l3.f92484c);
                o10.e(this.f24656i, 4, 2);
                this.f24639W += 4;
            }
            this.f24641Y = true;
        }
        int iG2 = i10 + this.f24659l.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f24704c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f24704c)) {
            if (cVar.f24696V != null) {
                C13466a.g(this.f24659l.g() == 0);
                cVar.f24696V.d(interfaceC18012q);
            }
            while (true) {
                int i17 = this.f24638V;
                if (i17 >= iG2) {
                    break;
                }
                int iL2 = L(interfaceC18012q, o10, iG2 - i17);
                this.f24638V += iL2;
                this.f24639W += iL2;
            }
        } else {
            byte[] bArrE = this.f24655h.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i18 = cVar.f24702a0;
            int i19 = 4 - i18;
            while (this.f24638V < iG2) {
                int i20 = this.f24640X;
                if (i20 == 0) {
                    M(interfaceC18012q, bArrE, i19, i18);
                    this.f24638V += i18;
                    this.f24655h.W(0);
                    this.f24640X = this.f24655h.L();
                    this.f24654g.W(0);
                    o10.d(this.f24654g, 4);
                    this.f24639W += 4;
                } else {
                    int iL3 = L(interfaceC18012q, o10, i20);
                    this.f24638V += iL3;
                    this.f24639W += iL3;
                    this.f24640X -= iL3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f24704c)) {
            this.f24657j.W(0);
            o10.d(this.f24657j, 4);
            this.f24639W += 4;
        }
        return s();
    }

    private int L(InterfaceC18012q interfaceC18012q, O o10, int i10) throws IOException {
        int iA = this.f24659l.a();
        if (iA <= 0) {
            return o10.g(interfaceC18012q, i10, false);
        }
        int iMin = Math.min(i10, iA);
        o10.d(this.f24659l, iMin);
        return iMin;
    }

    private void M(InterfaceC18012q interfaceC18012q, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.f24659l.a());
        interfaceC18012q.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f24659l.l(bArr, i10, iMin);
        }
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new e(r.a.f35728a, 2)};
    }

    private void k(int i10) throws ParserException {
        if (this.f24622F == null || this.f24623G == null) {
            throw ParserException.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void l(int i10) throws ParserException {
        if (this.f24671x != null) {
            return;
        }
        throw ParserException.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void m() {
        C13466a.i(this.f24652e0);
    }

    private J o(s sVar, s sVar2) {
        int i10;
        if (this.f24666s == -1 || this.f24669v == -9223372036854775807L || sVar == null || sVar.d() == 0 || sVar2 == null || sVar2.d() != sVar.d()) {
            return new J.b(this.f24669v);
        }
        int iD = sVar.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            jArrCopyOf3[i12] = sVar.c(i12);
            jArrCopyOf[i12] = this.f24666s + sVar2.c(i12);
        }
        while (true) {
            i10 = iD - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArrCopyOf3[i14] > this.f24669v) {
            i14--;
        }
        iArrCopyOf[i14] = (int) ((this.f24666s + this.f24665r) - jArrCopyOf[i14]);
        jArrCopyOf2[i14] = this.f24669v - jArrCopyOf3[i14];
        if (i14 < i10) {
            d3.r.i("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
        }
        return new C18002g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p(P3.e.c r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            x3.P r2 = r1.f24696V
            r9 = 1
            if (r2 == 0) goto L1c
            r3 = r2
            x3.O r2 = r1.f24700Z
            x3.O$a r8 = r1.f24712k
            r5 = r21
            r6 = r22
            r7 = r23
            r1 = r3
            r3 = r19
            r1.c(r2, r3, r5, r6, r7, r8)
            goto Lc8
        L1c:
            java.lang.String r2 = "S_TEXT/UTF8"
            java.lang.String r3 = r1.f24704c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "S_TEXT/ASS"
            java.lang.String r3 = r1.f24704c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "S_TEXT/WEBVTT"
            java.lang.String r3 = r1.f24704c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L56
        L3a:
            int r2 = r0.f24630N
            java.lang.String r3 = "MatroskaExtractor"
            if (r2 <= r9) goto L46
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            d3.r.i(r3, r2)
            goto L56
        L46:
            long r4 = r0.f24628L
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L59
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            d3.r.i(r3, r2)
        L56:
            r2 = r22
            goto L98
        L59:
            java.lang.String r2 = r1.f24704c
            d3.D r3 = r0.f24660m
            byte[] r3 = r3.e()
            G(r2, r4, r3)
            d3.D r2 = r0.f24660m
            int r2 = r2.f()
        L6a:
            d3.D r3 = r0.f24660m
            int r3 = r3.g()
            if (r2 >= r3) goto L85
            d3.D r3 = r0.f24660m
            byte[] r3 = r3.e()
            r3 = r3[r2]
            if (r3 != 0) goto L82
            d3.D r3 = r0.f24660m
            r3.V(r2)
            goto L85
        L82:
            int r2 = r2 + 1
            goto L6a
        L85:
            x3.O r2 = r1.f24700Z
            d3.D r3 = r0.f24660m
            int r4 = r3.g()
            r2.d(r3, r4)
            d3.D r2 = r0.f24660m
            int r2 = r2.g()
            int r2 = r22 + r2
        L98:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r21 & r3
            if (r3 == 0) goto Lb8
            int r3 = r0.f24630N
            if (r3 <= r9) goto La9
            d3.D r3 = r0.f24663p
            r4 = 0
            r3.S(r4)
            goto Lb8
        La9:
            d3.D r3 = r0.f24663p
            int r3 = r3.g()
            x3.O r4 = r1.f24700Z
            d3.D r5 = r0.f24663p
            r6 = 2
            r4.e(r5, r3, r6)
            int r2 = r2 + r3
        Lb8:
            r14 = r2
            x3.O r10 = r1.f24700Z
            x3.O$a r1 = r1.f24712k
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.c(r11, r13, r14, r15, r16)
        Lc8:
            r0.f24625I = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.e.p(P3.e$c, long, int, int, int):void");
    }

    private static int[] r(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int s() {
        int i10 = this.f24639W;
        E();
        return i10;
    }

    protected void I(int i10, String str) throws ParserException {
        if (i10 == 134) {
            v(i10).f24704c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                v(i10).f24703b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                v(i10).f24699Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f24670w = Objects.equals(str, "webm");
            return;
        }
        throw ParserException.a("DocType " + str + " not supported", null);
    }

    @Override // x3.InterfaceC18011p
    public final void c(x3.r rVar) {
        if (this.f24651e) {
            rVar = new U3.s(rVar, this.f24653f);
        }
        this.f24652e0 = rVar;
    }

    @Override // x3.InterfaceC18011p
    public final boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        return new f().b(interfaceC18012q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void n(int i10, int i11, InterfaceC18012q interfaceC18012q) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        InterfaceC18012q interfaceC18012q2 = interfaceC18012q;
        int i20 = 0;
        int i21 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.f24626J != 2) {
                    return;
                }
                y(this.f24647c.get(this.f24632P), this.f24635S, interfaceC18012q2, i11);
                return;
            }
            if (i10 == 16877) {
                x(v(i10), interfaceC18012q2, i11);
                return;
            }
            if (i10 == 16981) {
                l(i10);
                byte[] bArr = new byte[i11];
                this.f24671x.f24711j = bArr;
                interfaceC18012q2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                interfaceC18012q2.readFully(bArr2, 0, i11);
                v(i10).f24712k = new O.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f24658k.e(), (byte) 0);
                interfaceC18012q2.readFully(this.f24658k.e(), 4 - i11, i11);
                this.f24658k.W(0);
                this.f24673z = (int) this.f24658k.J();
                return;
            }
            if (i10 == 25506) {
                l(i10);
                byte[] bArr3 = new byte[i11];
                this.f24671x.f24713l = bArr3;
                interfaceC18012q2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw ParserException.a("Unexpected id: " + i10, null);
            }
            l(i10);
            byte[] bArr4 = new byte[i11];
            this.f24671x.f24725x = bArr4;
            interfaceC18012q2.readFully(bArr4, 0, i11);
            return;
        }
        int i22 = 8;
        if (this.f24626J == 0) {
            this.f24632P = (int) this.f24645b.d(interfaceC18012q2, false, true, 8);
            this.f24633Q = this.f24645b.b();
            this.f24628L = -9223372036854775807L;
            this.f24626J = 1;
            this.f24656i.S(0);
        }
        c cVar = this.f24647c.get(this.f24632P);
        if (cVar == null) {
            interfaceC18012q2.k(i11 - this.f24633Q);
            this.f24626J = 0;
            return;
        }
        cVar.f();
        if (this.f24626J == 1) {
            D(interfaceC18012q2, 3);
            int i23 = (this.f24656i.e()[2] & 6) >> 1;
            if (i23 == 0) {
                this.f24630N = 1;
                int[] iArrR = r(this.f24631O, 1);
                this.f24631O = iArrR;
                iArrR[0] = (i11 - this.f24633Q) - 3;
            } else {
                D(interfaceC18012q2, 4);
                int i24 = (this.f24656i.e()[3] & 255) + 1;
                this.f24630N = i24;
                int[] iArrR2 = r(this.f24631O, i24);
                this.f24631O = iArrR2;
                if (i23 == 2) {
                    int i25 = (i11 - this.f24633Q) - 4;
                    int i26 = this.f24630N;
                    Arrays.fill(iArrR2, 0, i26, i25 / i26);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            throw ParserException.a("Unexpected lacing value: " + i23, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = this.f24630N;
                            i12 = i21;
                            if (i27 >= i30 - 1) {
                                i13 = i20;
                                this.f24631O[i30 - 1] = ((i11 - this.f24633Q) - i29) - i28;
                                break;
                            }
                            this.f24631O[i27] = i20;
                            int i31 = i29 + 1;
                            D(interfaceC18012q2, i31);
                            if (this.f24656i.e()[i29] == 0) {
                                throw ParserException.a("No valid varint length mask found", null);
                            }
                            int i32 = i20;
                            while (true) {
                                if (i32 >= i22) {
                                    i14 = i20;
                                    i15 = i22;
                                    i16 = i27;
                                    j10 = 0;
                                    break;
                                }
                                i15 = i22;
                                int i33 = i12 << (7 - i32);
                                i14 = i20;
                                if ((this.f24656i.e()[i29] & i33) != 0) {
                                    i31 += i32;
                                    D(interfaceC18012q2, i31);
                                    int i34 = i29 + 1;
                                    j10 = this.f24656i.e()[i29] & 255 & (~i33);
                                    while (true) {
                                        int i35 = i34;
                                        if (i35 >= i31) {
                                            break;
                                        }
                                        i34 = i35 + 1;
                                        j10 = (j10 << i15) | (this.f24656i.e()[i35] & 255);
                                        i27 = i27;
                                    }
                                    i16 = i27;
                                    if (i16 > 0) {
                                        j10 -= (1 << ((i32 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i32++;
                                    interfaceC18012q2 = interfaceC18012q;
                                    i20 = i14;
                                    i22 = i15;
                                }
                            }
                            i29 = i31;
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i36 = (int) j10;
                            int[] iArr = this.f24631O;
                            if (i16 != 0) {
                                i36 += iArr[i16 - 1];
                            }
                            iArr[i16] = i36;
                            i28 += i36;
                            i27 = i16 + 1;
                            interfaceC18012q2 = interfaceC18012q;
                            i21 = i12;
                            i20 = i14;
                            i22 = i15;
                        }
                        throw ParserException.a("EBML lacing sample size out of range.", null);
                    }
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        i17 = this.f24630N;
                        if (i37 >= i17 - 1) {
                            break;
                        }
                        this.f24631O[i37] = 0;
                        while (true) {
                            i18 = i39 + 1;
                            D(interfaceC18012q2, i18);
                            int i40 = this.f24656i.e()[i39] & 255;
                            int[] iArr2 = this.f24631O;
                            i19 = iArr2[i37] + i40;
                            iArr2[i37] = i19;
                            if (i40 != 255) {
                                break;
                            } else {
                                i39 = i18;
                            }
                        }
                        i38 += i19;
                        i37++;
                        i39 = i18;
                    }
                    this.f24631O[i17 - 1] = ((i11 - this.f24633Q) - i39) - i38;
                }
            }
            i13 = 0;
            i12 = 1;
            this.f24627K = this.f24621E + F((this.f24656i.e()[i13] << 8) | (this.f24656i.e()[i12] & 255));
            this.f24634R = (cVar.f24706e == 2 || (i10 == 163 && (this.f24656i.e()[2] & 128) == 128)) ? i12 : i13;
            this.f24626J = 2;
            this.f24629M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i41 = this.f24629M;
                if (i41 >= this.f24630N) {
                    this.f24626J = 0;
                    return;
                }
                int iJ = J(interfaceC18012q, cVar, this.f24631O[i41], false);
                c cVar2 = cVar;
                p(cVar2, this.f24627K + ((this.f24629M * cVar.f24707f) / 1000), this.f24634R, iJ, 0);
                this.f24629M++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i42 = this.f24629M;
                if (i42 >= this.f24630N) {
                    return;
                }
                int[] iArr3 = this.f24631O;
                boolean z10 = i12;
                iArr3[i42] = J(interfaceC18012q, cVar, iArr3[i42], z10);
                this.f24629M += z10 ? 1 : 0;
            }
        }
    }

    protected void t(int i10, double d10) throws ParserException {
        if (i10 == 181) {
            v(i10).f24693S = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f24668u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                v(i10).f24680F = (float) d10;
                break;
            case 21970:
                v(i10).f24681G = (float) d10;
                break;
            case 21971:
                v(i10).f24682H = (float) d10;
                break;
            case 21972:
                v(i10).f24683I = (float) d10;
                break;
            case 21973:
                v(i10).f24684J = (float) d10;
                break;
            case 21974:
                v(i10).f24685K = (float) d10;
                break;
            case 21975:
                v(i10).f24686L = (float) d10;
                break;
            case 21976:
                v(i10).f24687M = (float) d10;
                break;
            case 21977:
                v(i10).f24688N = (float) d10;
                break;
            case 21978:
                v(i10).f24689O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        v(i10).f24722u = (float) d10;
                        break;
                    case 30324:
                        v(i10).f24723v = (float) d10;
                        break;
                    case 30325:
                        v(i10).f24724w = (float) d10;
                        break;
                }
        }
    }

    protected void z(int i10, long j10) throws ParserException {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw ParserException.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw ParserException.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                v(i10).f24706e = (int) j10;
                return;
            case 136:
                v(i10).f24698X = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.f24628L = F(j10);
                return;
            case 159:
                v(i10).f24691Q = (int) j10;
                return;
            case 176:
                v(i10).f24715n = (int) j10;
                return;
            case 179:
                k(i10);
                this.f24622F.a(F(j10));
                return;
            case 186:
                v(i10).f24716o = (int) j10;
                return;
            case 215:
                v(i10).f24705d = (int) j10;
                return;
            case 231:
                this.f24621E = F(j10);
                return;
            case 238:
                this.f24635S = (int) j10;
                return;
            case 241:
                if (this.f24624H) {
                    return;
                }
                k(i10);
                this.f24623G.a(j10);
                this.f24624H = true;
                return;
            case 251:
                this.f24636T = true;
                return;
            case 16871:
                v(i10).f24709h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw ParserException.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw ParserException.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw ParserException.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f24617A = j10 + this.f24666s;
                return;
            case 21432:
                int i11 = (int) j10;
                l(i10);
                if (i11 == 0) {
                    this.f24671x.f24726y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f24671x.f24726y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f24671x.f24726y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f24671x.f24726y = 3;
                    return;
                }
            case 21680:
                v(i10).f24718q = (int) j10;
                return;
            case 21682:
                v(i10).f24720s = (int) j10;
                return;
            case 21690:
                v(i10).f24719r = (int) j10;
                return;
            case 21930:
                v(i10).f24697W = j10 == 1;
                return;
            case 21938:
                l(i10);
                c cVar = this.f24671x;
                cVar.f24727z = true;
                cVar.f24717p = (int) j10;
                return;
            case 21998:
                v(i10).f24708g = (int) j10;
                return;
            case 22186:
                v(i10).f24694T = j10;
                return;
            case 22203:
                v(i10).f24695U = j10;
                return;
            case 25188:
                v(i10).f24692R = (int) j10;
                return;
            case 30114:
                this.f24637U = j10;
                return;
            case 30321:
                l(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f24671x.f24721t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f24671x.f24721t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f24671x.f24721t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f24671x.f24721t = 3;
                    return;
                }
            case 2352003:
                v(i10).f24707f = (int) j10;
                return;
            case 2807729:
                this.f24667t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        l(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f24671x.f24677C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f24671x.f24677C = 1;
                            return;
                        }
                    case 21946:
                        l(i10);
                        int iK = C5570j.k((int) j10);
                        if (iK != -1) {
                            this.f24671x.f24676B = iK;
                            return;
                        }
                        return;
                    case 21947:
                        l(i10);
                        this.f24671x.f24727z = true;
                        int iJ = C5570j.j((int) j10);
                        if (iJ != -1) {
                            this.f24671x.f24675A = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        v(i10).f24678D = (int) j10;
                        return;
                    case 21949:
                        v(i10).f24679E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    private static boolean A(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private static void G(String str, long j10, byte[] bArr) {
        byte[] bArrU;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                bArrU = u(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrU = u(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrU = u(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrU, 0, bArr, i10, bArrU.length);
    }

    protected boolean B(int i10) {
        if (i10 != 357149030 && i10 != 524531317 && i10 != 475249515 && i10 != 374648427) {
            return false;
        }
        return true;
    }

    protected void H(int i10, long j10, long j11) throws ParserException {
        m();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 187) {
                    if (i10 != 19899) {
                        if (i10 != 20533) {
                            if (i10 != 21968) {
                                if (i10 != 408125543) {
                                    if (i10 != 475249515) {
                                        if (i10 == 524531317 && !this.f24672y) {
                                            if (this.f24649d && this.f24619C != -1) {
                                                this.f24618B = true;
                                                return;
                                            } else {
                                                this.f24652e0.g(new J.b(this.f24669v));
                                                this.f24672y = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.f24622F = new s();
                                    this.f24623G = new s();
                                    return;
                                }
                                long j12 = this.f24666s;
                                if (j12 != -1 && j12 != j10) {
                                    throw ParserException.a("Multiple Segment elements not supported", null);
                                }
                                this.f24666s = j10;
                                this.f24665r = j11;
                                return;
                            }
                            v(i10).f24727z = true;
                            return;
                        }
                        v(i10).f24710i = true;
                        return;
                    }
                    this.f24673z = -1;
                    this.f24617A = -1L;
                    return;
                }
                this.f24624H = false;
                return;
            }
            c cVar = new c();
            this.f24671x = cVar;
            cVar.f24701a = this.f24670w;
            return;
        }
        this.f24636T = false;
        this.f24637U = 0L;
    }

    protected void q(int i10) throws ParserException {
        m();
        if (i10 != 160) {
            if (i10 != 174) {
                if (i10 != 19899) {
                    if (i10 != 25152) {
                        if (i10 != 28032) {
                            if (i10 != 357149030) {
                                if (i10 != 374648427) {
                                    if (i10 == 475249515) {
                                        if (!this.f24672y) {
                                            this.f24652e0.g(o(this.f24622F, this.f24623G));
                                            this.f24672y = true;
                                        }
                                        this.f24622F = null;
                                        this.f24623G = null;
                                        return;
                                    }
                                    return;
                                }
                                if (this.f24647c.size() != 0) {
                                    this.f24652e0.p();
                                    return;
                                }
                                throw ParserException.a("No valid tracks were found", null);
                            }
                            if (this.f24667t == -9223372036854775807L) {
                                this.f24667t = 1000000L;
                            }
                            long j10 = this.f24668u;
                            if (j10 != -9223372036854775807L) {
                                this.f24669v = F(j10);
                                return;
                            }
                            return;
                        }
                        l(i10);
                        c cVar = this.f24671x;
                        if (cVar.f24710i && cVar.f24711j != null) {
                            throw ParserException.a("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    l(i10);
                    c cVar2 = this.f24671x;
                    if (cVar2.f24710i) {
                        if (cVar2.f24712k != null) {
                            cVar2.f24714m = new o(new o.b(C5569i.f43832a, "video/webm", this.f24671x.f24712k.f169095b));
                            return;
                        }
                        throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i11 = this.f24673z;
                if (i11 != -1) {
                    long j11 = this.f24617A;
                    if (j11 != -1) {
                        if (i11 == 475249515) {
                            this.f24619C = j11;
                            return;
                        }
                        return;
                    }
                }
                throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
            }
            c cVar3 = (c) C13466a.i(this.f24671x);
            String str = cVar3.f24704c;
            if (str != null) {
                if (A(str)) {
                    cVar3.i(this.f24652e0, cVar3.f24705d);
                    this.f24647c.put(cVar3.f24705d, cVar3);
                }
                this.f24671x = null;
                return;
            }
            throw ParserException.a("CodecId is missing in TrackEntry element", null);
        }
        if (this.f24626J != 2) {
            return;
        }
        c cVar4 = this.f24647c.get(this.f24632P);
        cVar4.f();
        if (this.f24637U > 0 && "A_OPUS".equals(cVar4.f24704c)) {
            this.f24663p.T(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f24637U).array());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f24630N; i13++) {
            i12 += this.f24631O[i13];
        }
        int i14 = 0;
        while (i14 < this.f24630N) {
            long j12 = this.f24627K + ((cVar4.f24707f * i14) / 1000);
            int i15 = this.f24634R;
            if (i14 == 0 && !this.f24636T) {
                i15 |= 1;
            }
            int i16 = this.f24631O[i14];
            int i17 = i12 - i16;
            p(cVar4, j12, i15, i16, i17);
            i14++;
            i12 = i17;
        }
        this.f24626J = 0;
    }

    protected c v(int i10) throws ParserException {
        l(i10);
        return this.f24671x;
    }

    protected int w(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void x(c cVar, InterfaceC18012q interfaceC18012q, int i10) throws IOException {
        if (cVar.f24709h != 1685485123 && cVar.f24709h != 1685480259) {
            interfaceC18012q.k(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f24690P = bArr;
        interfaceC18012q.readFully(bArr, 0, i10);
    }

    private static byte[] u(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        return P.q0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f24621E = -9223372036854775807L;
        this.f24626J = 0;
        this.f24643a.reset();
        this.f24645b.e();
        E();
        for (int i10 = 0; i10 < this.f24647c.size(); i10++) {
            this.f24647c.valueAt(i10).n();
        }
    }
}

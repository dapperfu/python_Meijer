package P3;

import U3.r;
import a3.C5652i;
import a3.C5653j;
import a3.o;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13599a;
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
import x3.C18068g;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.O;
import x3.r;
import x3.u;

/* loaded from: classes4.dex */
public class e implements InterfaceC18077p {

    /* renamed from: f0, reason: collision with root package name */
    @Deprecated
    public static final u f25308f0 = new u() { // from class: P3.d
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return e.d();
        }
    };

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f25309g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: h0, reason: collision with root package name */
    private static final byte[] f25310h0 = P.q0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: i0, reason: collision with root package name */
    private static final byte[] f25311i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: j0, reason: collision with root package name */
    private static final byte[] f25312j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: k0, reason: collision with root package name */
    private static final UUID f25313k0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: l0, reason: collision with root package name */
    private static final Map<String, Integer> f25314l0;

    /* renamed from: A, reason: collision with root package name */
    private long f25315A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f25316B;

    /* renamed from: C, reason: collision with root package name */
    private long f25317C;

    /* renamed from: D, reason: collision with root package name */
    private long f25318D;

    /* renamed from: E, reason: collision with root package name */
    private long f25319E;

    /* renamed from: F, reason: collision with root package name */
    private s f25320F;

    /* renamed from: G, reason: collision with root package name */
    private s f25321G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f25322H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f25323I;

    /* renamed from: J, reason: collision with root package name */
    private int f25324J;

    /* renamed from: K, reason: collision with root package name */
    private long f25325K;

    /* renamed from: L, reason: collision with root package name */
    private long f25326L;

    /* renamed from: M, reason: collision with root package name */
    private int f25327M;

    /* renamed from: N, reason: collision with root package name */
    private int f25328N;

    /* renamed from: O, reason: collision with root package name */
    private int[] f25329O;

    /* renamed from: P, reason: collision with root package name */
    private int f25330P;

    /* renamed from: Q, reason: collision with root package name */
    private int f25331Q;

    /* renamed from: R, reason: collision with root package name */
    private int f25332R;

    /* renamed from: S, reason: collision with root package name */
    private int f25333S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f25334T;

    /* renamed from: U, reason: collision with root package name */
    private long f25335U;

    /* renamed from: V, reason: collision with root package name */
    private int f25336V;

    /* renamed from: W, reason: collision with root package name */
    private int f25337W;

    /* renamed from: X, reason: collision with root package name */
    private int f25338X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f25339Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f25340Z;

    /* renamed from: a, reason: collision with root package name */
    private final P3.c f25341a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f25342a0;

    /* renamed from: b, reason: collision with root package name */
    private final g f25343b;

    /* renamed from: b0, reason: collision with root package name */
    private int f25344b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f25345c;

    /* renamed from: c0, reason: collision with root package name */
    private byte f25346c0;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25347d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f25348d0;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25349e;

    /* renamed from: e0, reason: collision with root package name */
    private r f25350e0;

    /* renamed from: f, reason: collision with root package name */
    private final r.a f25351f;

    /* renamed from: g, reason: collision with root package name */
    private final D f25352g;

    /* renamed from: h, reason: collision with root package name */
    private final D f25353h;

    /* renamed from: i, reason: collision with root package name */
    private final D f25354i;

    /* renamed from: j, reason: collision with root package name */
    private final D f25355j;

    /* renamed from: k, reason: collision with root package name */
    private final D f25356k;

    /* renamed from: l, reason: collision with root package name */
    private final D f25357l;

    /* renamed from: m, reason: collision with root package name */
    private final D f25358m;

    /* renamed from: n, reason: collision with root package name */
    private final D f25359n;

    /* renamed from: o, reason: collision with root package name */
    private final D f25360o;

    /* renamed from: p, reason: collision with root package name */
    private final D f25361p;

    /* renamed from: q, reason: collision with root package name */
    private ByteBuffer f25362q;

    /* renamed from: r, reason: collision with root package name */
    private long f25363r;

    /* renamed from: s, reason: collision with root package name */
    private long f25364s;

    /* renamed from: t, reason: collision with root package name */
    private long f25365t;

    /* renamed from: u, reason: collision with root package name */
    private long f25366u;

    /* renamed from: v, reason: collision with root package name */
    private long f25367v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f25368w;

    /* renamed from: x, reason: collision with root package name */
    private c f25369x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f25370y;

    /* renamed from: z, reason: collision with root package name */
    private int f25371z;

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
        public void g(int i10, int i11, InterfaceC18078q interfaceC18078q) throws IOException {
            e.this.n(i10, i11, interfaceC18078q);
        }

        @Override // P3.b
        public void h(int i10, long j10, long j11) throws ParserException {
            e.this.H(i10, j10, j11);
        }
    }

    protected static final class c {

        /* renamed from: P, reason: collision with root package name */
        public byte[] f25388P;

        /* renamed from: V, reason: collision with root package name */
        public x3.P f25394V;

        /* renamed from: W, reason: collision with root package name */
        public boolean f25395W;

        /* renamed from: Z, reason: collision with root package name */
        public O f25398Z;

        /* renamed from: a, reason: collision with root package name */
        public boolean f25399a;

        /* renamed from: a0, reason: collision with root package name */
        public int f25400a0;

        /* renamed from: b, reason: collision with root package name */
        public String f25401b;

        /* renamed from: c, reason: collision with root package name */
        public String f25402c;

        /* renamed from: d, reason: collision with root package name */
        public int f25403d;

        /* renamed from: e, reason: collision with root package name */
        public int f25404e;

        /* renamed from: f, reason: collision with root package name */
        public int f25405f;

        /* renamed from: g, reason: collision with root package name */
        public int f25406g;

        /* renamed from: h, reason: collision with root package name */
        private int f25407h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f25408i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f25409j;

        /* renamed from: k, reason: collision with root package name */
        public O.a f25410k;

        /* renamed from: l, reason: collision with root package name */
        public byte[] f25411l;

        /* renamed from: m, reason: collision with root package name */
        public o f25412m;

        /* renamed from: n, reason: collision with root package name */
        public int f25413n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f25414o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f25415p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f25416q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f25417r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f25418s = 0;

        /* renamed from: t, reason: collision with root package name */
        public int f25419t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f25420u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public float f25421v = 0.0f;

        /* renamed from: w, reason: collision with root package name */
        public float f25422w = 0.0f;

        /* renamed from: x, reason: collision with root package name */
        public byte[] f25423x = null;

        /* renamed from: y, reason: collision with root package name */
        public int f25424y = -1;

        /* renamed from: z, reason: collision with root package name */
        public boolean f25425z = false;

        /* renamed from: A, reason: collision with root package name */
        public int f25373A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f25374B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f25375C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f25376D = 1000;

        /* renamed from: E, reason: collision with root package name */
        public int f25377E = HttpResponseStatus.SUCCESS_OK;

        /* renamed from: F, reason: collision with root package name */
        public float f25378F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f25379G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f25380H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f25381I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f25382J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f25383K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f25384L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f25385M = -1.0f;

        /* renamed from: N, reason: collision with root package name */
        public float f25386N = -1.0f;

        /* renamed from: O, reason: collision with root package name */
        public float f25387O = -1.0f;

        /* renamed from: Q, reason: collision with root package name */
        public int f25389Q = 1;

        /* renamed from: R, reason: collision with root package name */
        public int f25390R = -1;

        /* renamed from: S, reason: collision with root package name */
        public int f25391S = 8000;

        /* renamed from: T, reason: collision with root package name */
        public long f25392T = 0;

        /* renamed from: U, reason: collision with root package name */
        public long f25393U = 0;

        /* renamed from: X, reason: collision with root package name */
        public boolean f25396X = true;

        /* renamed from: Y, reason: collision with root package name */
        private String f25397Y = "eng";

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
            C13599a.e(this.f25398Z);
        }

        private byte[] g(String str) throws ParserException {
            byte[] bArr = this.f25411l;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.f25378F == -1.0f || this.f25379G == -1.0f || this.f25380H == -1.0f || this.f25381I == -1.0f || this.f25382J == -1.0f || this.f25383K == -1.0f || this.f25384L == -1.0f || this.f25385M == -1.0f || this.f25386N == -1.0f || this.f25387O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f25378F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f25379G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f25380H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f25381I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f25382J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f25383K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f25384L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f25385M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f25386N + 0.5f));
            byteBufferOrder.putShort((short) (this.f25387O + 0.5f));
            byteBufferOrder.putShort((short) this.f25376D);
            byteBufferOrder.putShort((short) this.f25377E);
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
                    if ((i10 & l3.f93323c) != 255) {
                        break;
                    }
                    i12 += l3.f93323c;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & l3.f93323c);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & l3.f93323c) != 255) {
                        break;
                    }
                    i16 += l3.f93323c;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & l3.f93323c);
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
            return "A_OPUS".equals(this.f25402c) ? z10 : this.f25406g > 0;
        }

        public void j() {
            x3.P p10 = this.f25394V;
            if (p10 != null) {
                p10.a(this.f25398Z, this.f25410k);
            }
        }

        public void n() {
            x3.P p10 = this.f25394V;
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
                    if (d10.A() == e.f25313k0.getMostSignificantBits()) {
                        if (d10.A() == e.f25313k0.getLeastSignificantBits()) {
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
        this.f25336V = 0;
        this.f25337W = 0;
        this.f25338X = 0;
        this.f25339Y = false;
        this.f25340Z = false;
        this.f25342a0 = false;
        this.f25344b0 = 0;
        this.f25346c0 = (byte) 0;
        this.f25348d0 = false;
        this.f25357l.S(0);
    }

    private void K(InterfaceC18078q interfaceC18078q, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f25358m.b() < length) {
            this.f25358m.T(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f25358m.e(), 0, bArr.length);
        }
        interfaceC18078q.readFully(this.f25358m.e(), bArr.length, i10);
        this.f25358m.W(0);
        this.f25358m.V(length);
    }

    @Override // x3.InterfaceC18077p
    public final int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        this.f25323I = false;
        boolean zA = true;
        while (zA && !this.f25323I) {
            zA = this.f25341a.a(interfaceC18078q);
            if (zA && C(i10, interfaceC18078q.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f25345c.size(); i11++) {
            c cVarValueAt = this.f25345c.valueAt(i11);
            cVarValueAt.f();
            cVarValueAt.j();
        }
        return -1;
    }

    @Override // x3.InterfaceC18077p
    public final void release() {
    }

    protected void y(c cVar, int i10, InterfaceC18078q interfaceC18078q, int i11) throws IOException {
        if (i10 != 4 || !"V_VP9".equals(cVar.f25402c)) {
            interfaceC18078q.k(i11);
        } else {
            this.f25361p.S(i11);
            interfaceC18078q.readFully(this.f25361p.e(), 0, i11);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f25314l0 = Collections.unmodifiableMap(map);
    }

    e(P3.c cVar, int i10, r.a aVar) {
        this.f25364s = -1L;
        this.f25365t = -9223372036854775807L;
        this.f25366u = -9223372036854775807L;
        this.f25367v = -9223372036854775807L;
        this.f25317C = -1L;
        this.f25318D = -1L;
        this.f25319E = -9223372036854775807L;
        this.f25341a = cVar;
        cVar.b(new b());
        this.f25351f = aVar;
        this.f25347d = (i10 & 1) == 0;
        this.f25349e = (i10 & 2) == 0;
        this.f25343b = new g();
        this.f25345c = new SparseArray<>();
        this.f25354i = new D(4);
        this.f25355j = new D(ByteBuffer.allocate(4).putInt(-1).array());
        this.f25356k = new D(4);
        this.f25352g = new D(e3.f.f129420a);
        this.f25353h = new D(4);
        this.f25357l = new D();
        this.f25358m = new D();
        this.f25359n = new D(8);
        this.f25360o = new D();
        this.f25361p = new D();
        this.f25329O = new int[1];
    }

    private boolean C(I i10, long j10) {
        if (this.f25316B) {
            this.f25318D = j10;
            i10.f170165a = this.f25317C;
            this.f25316B = false;
            return true;
        }
        if (this.f25370y) {
            long j11 = this.f25318D;
            if (j11 != -1) {
                i10.f170165a = j11;
                this.f25318D = -1L;
                return true;
            }
        }
        return false;
    }

    private void D(InterfaceC18078q interfaceC18078q, int i10) throws IOException {
        if (this.f25354i.g() >= i10) {
            return;
        }
        if (this.f25354i.b() < i10) {
            D d10 = this.f25354i;
            d10.c(Math.max(d10.b() * 2, i10));
        }
        interfaceC18078q.readFully(this.f25354i.e(), this.f25354i.g(), i10 - this.f25354i.g());
        this.f25354i.V(i10);
    }

    private long F(long j10) throws ParserException {
        long j11 = this.f25365t;
        if (j11 != -9223372036854775807L) {
            return P.V0(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private int J(InterfaceC18078q interfaceC18078q, c cVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f25402c)) {
            K(interfaceC18078q, f25309g0, i10);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.f25402c)) {
            K(interfaceC18078q, f25311i0, i10);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f25402c)) {
            K(interfaceC18078q, f25312j0, i10);
            return s();
        }
        O o10 = cVar.f25398Z;
        if (!this.f25339Y) {
            if (cVar.f25408i) {
                this.f25332R &= -1073741825;
                if (!this.f25340Z) {
                    interfaceC18078q.readFully(this.f25354i.e(), 0, 1);
                    this.f25336V++;
                    if ((this.f25354i.e()[0] & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f25346c0 = this.f25354i.e()[0];
                    this.f25340Z = true;
                }
                byte b10 = this.f25346c0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.f25332R |= 1073741824;
                    if (!this.f25348d0) {
                        interfaceC18078q.readFully(this.f25359n.e(), 0, 8);
                        this.f25336V += 8;
                        this.f25348d0 = true;
                        this.f25354i.e()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f25354i.W(0);
                        o10.e(this.f25354i, 1, 1);
                        this.f25337W++;
                        this.f25359n.W(0);
                        o10.e(this.f25359n, 8, 1);
                        this.f25337W += 8;
                    }
                    if (z11) {
                        if (!this.f25342a0) {
                            interfaceC18078q.readFully(this.f25354i.e(), 0, 1);
                            this.f25336V++;
                            this.f25354i.W(0);
                            this.f25344b0 = this.f25354i.H();
                            this.f25342a0 = true;
                        }
                        int i12 = this.f25344b0 * 4;
                        this.f25354i.S(i12);
                        interfaceC18078q.readFully(this.f25354i.e(), 0, i12);
                        this.f25336V += i12;
                        short s10 = (short) ((this.f25344b0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f25362q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f25362q = ByteBuffer.allocate(i13);
                        }
                        this.f25362q.position(0);
                        this.f25362q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f25344b0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iL = this.f25354i.L();
                            if (i14 % 2 == 0) {
                                this.f25362q.putShort((short) (iL - i15));
                            } else {
                                this.f25362q.putInt(iL - i15);
                            }
                            i14++;
                            i15 = iL;
                        }
                        int i16 = (i10 - this.f25336V) - i15;
                        if (i11 % 2 == 1) {
                            this.f25362q.putInt(i16);
                        } else {
                            this.f25362q.putShort((short) i16);
                            this.f25362q.putInt(0);
                        }
                        this.f25360o.U(this.f25362q.array(), i13);
                        o10.e(this.f25360o, i13, 1);
                        this.f25337W += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f25409j;
                if (bArr != null) {
                    this.f25357l.U(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.f25332R |= 268435456;
                this.f25361p.S(0);
                int iG = (this.f25357l.g() + i10) - this.f25336V;
                this.f25354i.S(4);
                this.f25354i.e()[0] = (byte) ((iG >> 24) & l3.f93323c);
                this.f25354i.e()[1] = (byte) ((iG >> 16) & l3.f93323c);
                this.f25354i.e()[2] = (byte) ((iG >> 8) & l3.f93323c);
                this.f25354i.e()[3] = (byte) (iG & l3.f93323c);
                o10.e(this.f25354i, 4, 2);
                this.f25337W += 4;
            }
            this.f25339Y = true;
        }
        int iG2 = i10 + this.f25357l.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f25402c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f25402c)) {
            if (cVar.f25394V != null) {
                C13599a.g(this.f25357l.g() == 0);
                cVar.f25394V.d(interfaceC18078q);
            }
            while (true) {
                int i17 = this.f25336V;
                if (i17 >= iG2) {
                    break;
                }
                int iL2 = L(interfaceC18078q, o10, iG2 - i17);
                this.f25336V += iL2;
                this.f25337W += iL2;
            }
        } else {
            byte[] bArrE = this.f25353h.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i18 = cVar.f25400a0;
            int i19 = 4 - i18;
            while (this.f25336V < iG2) {
                int i20 = this.f25338X;
                if (i20 == 0) {
                    M(interfaceC18078q, bArrE, i19, i18);
                    this.f25336V += i18;
                    this.f25353h.W(0);
                    this.f25338X = this.f25353h.L();
                    this.f25352g.W(0);
                    o10.d(this.f25352g, 4);
                    this.f25337W += 4;
                } else {
                    int iL3 = L(interfaceC18078q, o10, i20);
                    this.f25336V += iL3;
                    this.f25337W += iL3;
                    this.f25338X -= iL3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f25402c)) {
            this.f25355j.W(0);
            o10.d(this.f25355j, 4);
            this.f25337W += 4;
        }
        return s();
    }

    private int L(InterfaceC18078q interfaceC18078q, O o10, int i10) throws IOException {
        int iA = this.f25357l.a();
        if (iA <= 0) {
            return o10.g(interfaceC18078q, i10, false);
        }
        int iMin = Math.min(i10, iA);
        o10.d(this.f25357l, iMin);
        return iMin;
    }

    private void M(InterfaceC18078q interfaceC18078q, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.f25357l.a());
        interfaceC18078q.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f25357l.l(bArr, i10, iMin);
        }
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new e(r.a.f37064a, 2)};
    }

    private void k(int i10) throws ParserException {
        if (this.f25320F == null || this.f25321G == null) {
            throw ParserException.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void l(int i10) throws ParserException {
        if (this.f25369x != null) {
            return;
        }
        throw ParserException.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void m() {
        C13599a.i(this.f25350e0);
    }

    private J o(s sVar, s sVar2) {
        int i10;
        if (this.f25364s == -1 || this.f25367v == -9223372036854775807L || sVar == null || sVar.d() == 0 || sVar2 == null || sVar2.d() != sVar.d()) {
            return new J.b(this.f25367v);
        }
        int iD = sVar.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            jArrCopyOf3[i12] = sVar.c(i12);
            jArrCopyOf[i12] = this.f25364s + sVar2.c(i12);
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
        while (i14 > 0 && jArrCopyOf3[i14] > this.f25367v) {
            i14--;
        }
        iArrCopyOf[i14] = (int) ((this.f25364s + this.f25363r) - jArrCopyOf[i14]);
        jArrCopyOf2[i14] = this.f25367v - jArrCopyOf3[i14];
        if (i14 < i10) {
            d3.r.i("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
        }
        return new C18068g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
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
            x3.P r2 = r1.f25394V
            r9 = 1
            if (r2 == 0) goto L1c
            r3 = r2
            x3.O r2 = r1.f25398Z
            x3.O$a r8 = r1.f25410k
            r5 = r21
            r6 = r22
            r7 = r23
            r1 = r3
            r3 = r19
            r1.c(r2, r3, r5, r6, r7, r8)
            goto Lc8
        L1c:
            java.lang.String r2 = "S_TEXT/UTF8"
            java.lang.String r3 = r1.f25402c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "S_TEXT/ASS"
            java.lang.String r3 = r1.f25402c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "S_TEXT/WEBVTT"
            java.lang.String r3 = r1.f25402c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L56
        L3a:
            int r2 = r0.f25328N
            java.lang.String r3 = "MatroskaExtractor"
            if (r2 <= r9) goto L46
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            d3.r.i(r3, r2)
            goto L56
        L46:
            long r4 = r0.f25326L
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L59
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            d3.r.i(r3, r2)
        L56:
            r2 = r22
            goto L98
        L59:
            java.lang.String r2 = r1.f25402c
            d3.D r3 = r0.f25358m
            byte[] r3 = r3.e()
            G(r2, r4, r3)
            d3.D r2 = r0.f25358m
            int r2 = r2.f()
        L6a:
            d3.D r3 = r0.f25358m
            int r3 = r3.g()
            if (r2 >= r3) goto L85
            d3.D r3 = r0.f25358m
            byte[] r3 = r3.e()
            r3 = r3[r2]
            if (r3 != 0) goto L82
            d3.D r3 = r0.f25358m
            r3.V(r2)
            goto L85
        L82:
            int r2 = r2 + 1
            goto L6a
        L85:
            x3.O r2 = r1.f25398Z
            d3.D r3 = r0.f25358m
            int r4 = r3.g()
            r2.d(r3, r4)
            d3.D r2 = r0.f25358m
            int r2 = r2.g()
            int r2 = r22 + r2
        L98:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r21 & r3
            if (r3 == 0) goto Lb8
            int r3 = r0.f25328N
            if (r3 <= r9) goto La9
            d3.D r3 = r0.f25361p
            r4 = 0
            r3.S(r4)
            goto Lb8
        La9:
            d3.D r3 = r0.f25361p
            int r3 = r3.g()
            x3.O r4 = r1.f25398Z
            d3.D r5 = r0.f25361p
            r6 = 2
            r4.e(r5, r3, r6)
            int r2 = r2 + r3
        Lb8:
            r14 = r2
            x3.O r10 = r1.f25398Z
            x3.O$a r1 = r1.f25410k
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.c(r11, r13, r14, r15, r16)
        Lc8:
            r0.f25323I = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.e.p(P3.e$c, long, int, int, int):void");
    }

    private static int[] r(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int s() {
        int i10 = this.f25337W;
        E();
        return i10;
    }

    protected void I(int i10, String str) throws ParserException {
        if (i10 == 134) {
            v(i10).f25402c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                v(i10).f25401b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                v(i10).f25397Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f25368w = Objects.equals(str, "webm");
            return;
        }
        throw ParserException.a("DocType " + str + " not supported", null);
    }

    @Override // x3.InterfaceC18077p
    public final void c(x3.r rVar) {
        if (this.f25349e) {
            rVar = new U3.s(rVar, this.f25351f);
        }
        this.f25350e0 = rVar;
    }

    @Override // x3.InterfaceC18077p
    public final boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        return new f().b(interfaceC18078q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void n(int i10, int i11, InterfaceC18078q interfaceC18078q) throws IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        InterfaceC18078q interfaceC18078q2 = interfaceC18078q;
        int i20 = 0;
        int i21 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.f25324J != 2) {
                    return;
                }
                y(this.f25345c.get(this.f25330P), this.f25333S, interfaceC18078q2, i11);
                return;
            }
            if (i10 == 16877) {
                x(v(i10), interfaceC18078q2, i11);
                return;
            }
            if (i10 == 16981) {
                l(i10);
                byte[] bArr = new byte[i11];
                this.f25369x.f25409j = bArr;
                interfaceC18078q2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                interfaceC18078q2.readFully(bArr2, 0, i11);
                v(i10).f25410k = new O.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f25356k.e(), (byte) 0);
                interfaceC18078q2.readFully(this.f25356k.e(), 4 - i11, i11);
                this.f25356k.W(0);
                this.f25371z = (int) this.f25356k.J();
                return;
            }
            if (i10 == 25506) {
                l(i10);
                byte[] bArr3 = new byte[i11];
                this.f25369x.f25411l = bArr3;
                interfaceC18078q2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw ParserException.a("Unexpected id: " + i10, null);
            }
            l(i10);
            byte[] bArr4 = new byte[i11];
            this.f25369x.f25423x = bArr4;
            interfaceC18078q2.readFully(bArr4, 0, i11);
            return;
        }
        int i22 = 8;
        if (this.f25324J == 0) {
            this.f25330P = (int) this.f25343b.d(interfaceC18078q2, false, true, 8);
            this.f25331Q = this.f25343b.b();
            this.f25326L = -9223372036854775807L;
            this.f25324J = 1;
            this.f25354i.S(0);
        }
        c cVar = this.f25345c.get(this.f25330P);
        if (cVar == null) {
            interfaceC18078q2.k(i11 - this.f25331Q);
            this.f25324J = 0;
            return;
        }
        cVar.f();
        if (this.f25324J == 1) {
            D(interfaceC18078q2, 3);
            int i23 = (this.f25354i.e()[2] & 6) >> 1;
            if (i23 == 0) {
                this.f25328N = 1;
                int[] iArrR = r(this.f25329O, 1);
                this.f25329O = iArrR;
                iArrR[0] = (i11 - this.f25331Q) - 3;
            } else {
                D(interfaceC18078q2, 4);
                int i24 = (this.f25354i.e()[3] & 255) + 1;
                this.f25328N = i24;
                int[] iArrR2 = r(this.f25329O, i24);
                this.f25329O = iArrR2;
                if (i23 == 2) {
                    int i25 = (i11 - this.f25331Q) - 4;
                    int i26 = this.f25328N;
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
                            int i30 = this.f25328N;
                            i12 = i21;
                            if (i27 >= i30 - 1) {
                                i13 = i20;
                                this.f25329O[i30 - 1] = ((i11 - this.f25331Q) - i29) - i28;
                                break;
                            }
                            this.f25329O[i27] = i20;
                            int i31 = i29 + 1;
                            D(interfaceC18078q2, i31);
                            if (this.f25354i.e()[i29] == 0) {
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
                                if ((this.f25354i.e()[i29] & i33) != 0) {
                                    i31 += i32;
                                    D(interfaceC18078q2, i31);
                                    int i34 = i29 + 1;
                                    j10 = this.f25354i.e()[i29] & 255 & (~i33);
                                    while (true) {
                                        int i35 = i34;
                                        if (i35 >= i31) {
                                            break;
                                        }
                                        i34 = i35 + 1;
                                        j10 = (j10 << i15) | (this.f25354i.e()[i35] & 255);
                                        i27 = i27;
                                    }
                                    i16 = i27;
                                    if (i16 > 0) {
                                        j10 -= (1 << ((i32 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i32++;
                                    interfaceC18078q2 = interfaceC18078q;
                                    i20 = i14;
                                    i22 = i15;
                                }
                            }
                            i29 = i31;
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i36 = (int) j10;
                            int[] iArr = this.f25329O;
                            if (i16 != 0) {
                                i36 += iArr[i16 - 1];
                            }
                            iArr[i16] = i36;
                            i28 += i36;
                            i27 = i16 + 1;
                            interfaceC18078q2 = interfaceC18078q;
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
                        i17 = this.f25328N;
                        if (i37 >= i17 - 1) {
                            break;
                        }
                        this.f25329O[i37] = 0;
                        while (true) {
                            i18 = i39 + 1;
                            D(interfaceC18078q2, i18);
                            int i40 = this.f25354i.e()[i39] & 255;
                            int[] iArr2 = this.f25329O;
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
                    this.f25329O[i17 - 1] = ((i11 - this.f25331Q) - i39) - i38;
                }
            }
            i13 = 0;
            i12 = 1;
            this.f25325K = this.f25319E + F((this.f25354i.e()[i13] << 8) | (this.f25354i.e()[i12] & 255));
            this.f25332R = (cVar.f25404e == 2 || (i10 == 163 && (this.f25354i.e()[2] & 128) == 128)) ? i12 : i13;
            this.f25324J = 2;
            this.f25327M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i41 = this.f25327M;
                if (i41 >= this.f25328N) {
                    this.f25324J = 0;
                    return;
                }
                int iJ = J(interfaceC18078q, cVar, this.f25329O[i41], false);
                c cVar2 = cVar;
                p(cVar2, this.f25325K + ((this.f25327M * cVar.f25405f) / 1000), this.f25332R, iJ, 0);
                this.f25327M++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i42 = this.f25327M;
                if (i42 >= this.f25328N) {
                    return;
                }
                int[] iArr3 = this.f25329O;
                boolean z10 = i12;
                iArr3[i42] = J(interfaceC18078q, cVar, iArr3[i42], z10);
                this.f25327M += z10 ? 1 : 0;
            }
        }
    }

    protected void t(int i10, double d10) throws ParserException {
        if (i10 == 181) {
            v(i10).f25391S = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f25366u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                v(i10).f25378F = (float) d10;
                break;
            case 21970:
                v(i10).f25379G = (float) d10;
                break;
            case 21971:
                v(i10).f25380H = (float) d10;
                break;
            case 21972:
                v(i10).f25381I = (float) d10;
                break;
            case 21973:
                v(i10).f25382J = (float) d10;
                break;
            case 21974:
                v(i10).f25383K = (float) d10;
                break;
            case 21975:
                v(i10).f25384L = (float) d10;
                break;
            case 21976:
                v(i10).f25385M = (float) d10;
                break;
            case 21977:
                v(i10).f25386N = (float) d10;
                break;
            case 21978:
                v(i10).f25387O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        v(i10).f25420u = (float) d10;
                        break;
                    case 30324:
                        v(i10).f25421v = (float) d10;
                        break;
                    case 30325:
                        v(i10).f25422w = (float) d10;
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
                v(i10).f25404e = (int) j10;
                return;
            case 136:
                v(i10).f25396X = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.f25326L = F(j10);
                return;
            case 159:
                v(i10).f25389Q = (int) j10;
                return;
            case 176:
                v(i10).f25413n = (int) j10;
                return;
            case 179:
                k(i10);
                this.f25320F.a(F(j10));
                return;
            case 186:
                v(i10).f25414o = (int) j10;
                return;
            case 215:
                v(i10).f25403d = (int) j10;
                return;
            case 231:
                this.f25319E = F(j10);
                return;
            case 238:
                this.f25333S = (int) j10;
                return;
            case 241:
                if (this.f25322H) {
                    return;
                }
                k(i10);
                this.f25321G.a(j10);
                this.f25322H = true;
                return;
            case 251:
                this.f25334T = true;
                return;
            case 16871:
                v(i10).f25407h = (int) j10;
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
                this.f25315A = j10 + this.f25364s;
                return;
            case 21432:
                int i11 = (int) j10;
                l(i10);
                if (i11 == 0) {
                    this.f25369x.f25424y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f25369x.f25424y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f25369x.f25424y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f25369x.f25424y = 3;
                    return;
                }
            case 21680:
                v(i10).f25416q = (int) j10;
                return;
            case 21682:
                v(i10).f25418s = (int) j10;
                return;
            case 21690:
                v(i10).f25417r = (int) j10;
                return;
            case 21930:
                v(i10).f25395W = j10 == 1;
                return;
            case 21938:
                l(i10);
                c cVar = this.f25369x;
                cVar.f25425z = true;
                cVar.f25415p = (int) j10;
                return;
            case 21998:
                v(i10).f25406g = (int) j10;
                return;
            case 22186:
                v(i10).f25392T = j10;
                return;
            case 22203:
                v(i10).f25393U = j10;
                return;
            case 25188:
                v(i10).f25390R = (int) j10;
                return;
            case 30114:
                this.f25335U = j10;
                return;
            case 30321:
                l(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f25369x.f25419t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f25369x.f25419t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f25369x.f25419t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f25369x.f25419t = 3;
                    return;
                }
            case 2352003:
                v(i10).f25405f = (int) j10;
                return;
            case 2807729:
                this.f25365t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        l(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f25369x.f25375C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f25369x.f25375C = 1;
                            return;
                        }
                    case 21946:
                        l(i10);
                        int iK = C5653j.k((int) j10);
                        if (iK != -1) {
                            this.f25369x.f25374B = iK;
                            return;
                        }
                        return;
                    case 21947:
                        l(i10);
                        this.f25369x.f25425z = true;
                        int iJ = C5653j.j((int) j10);
                        if (iJ != -1) {
                            this.f25369x.f25373A = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        v(i10).f25376D = (int) j10;
                        return;
                    case 21949:
                        v(i10).f25377E = (int) j10;
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
                                        if (i10 == 524531317 && !this.f25370y) {
                                            if (this.f25347d && this.f25317C != -1) {
                                                this.f25316B = true;
                                                return;
                                            } else {
                                                this.f25350e0.g(new J.b(this.f25367v));
                                                this.f25370y = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.f25320F = new s();
                                    this.f25321G = new s();
                                    return;
                                }
                                long j12 = this.f25364s;
                                if (j12 != -1 && j12 != j10) {
                                    throw ParserException.a("Multiple Segment elements not supported", null);
                                }
                                this.f25364s = j10;
                                this.f25363r = j11;
                                return;
                            }
                            v(i10).f25425z = true;
                            return;
                        }
                        v(i10).f25408i = true;
                        return;
                    }
                    this.f25371z = -1;
                    this.f25315A = -1L;
                    return;
                }
                this.f25322H = false;
                return;
            }
            c cVar = new c();
            this.f25369x = cVar;
            cVar.f25399a = this.f25368w;
            return;
        }
        this.f25334T = false;
        this.f25335U = 0L;
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
                                        if (!this.f25370y) {
                                            this.f25350e0.g(o(this.f25320F, this.f25321G));
                                            this.f25370y = true;
                                        }
                                        this.f25320F = null;
                                        this.f25321G = null;
                                        return;
                                    }
                                    return;
                                }
                                if (this.f25345c.size() != 0) {
                                    this.f25350e0.p();
                                    return;
                                }
                                throw ParserException.a("No valid tracks were found", null);
                            }
                            if (this.f25365t == -9223372036854775807L) {
                                this.f25365t = 1000000L;
                            }
                            long j10 = this.f25366u;
                            if (j10 != -9223372036854775807L) {
                                this.f25367v = F(j10);
                                return;
                            }
                            return;
                        }
                        l(i10);
                        c cVar = this.f25369x;
                        if (cVar.f25408i && cVar.f25409j != null) {
                            throw ParserException.a("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    l(i10);
                    c cVar2 = this.f25369x;
                    if (cVar2.f25408i) {
                        if (cVar2.f25410k != null) {
                            cVar2.f25412m = new o(new o.b(C5652i.f44650a, "video/webm", this.f25369x.f25410k.f170183b));
                            return;
                        }
                        throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i11 = this.f25371z;
                if (i11 != -1) {
                    long j11 = this.f25315A;
                    if (j11 != -1) {
                        if (i11 == 475249515) {
                            this.f25317C = j11;
                            return;
                        }
                        return;
                    }
                }
                throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
            }
            c cVar3 = (c) C13599a.i(this.f25369x);
            String str = cVar3.f25402c;
            if (str != null) {
                if (A(str)) {
                    cVar3.i(this.f25350e0, cVar3.f25403d);
                    this.f25345c.put(cVar3.f25403d, cVar3);
                }
                this.f25369x = null;
                return;
            }
            throw ParserException.a("CodecId is missing in TrackEntry element", null);
        }
        if (this.f25324J != 2) {
            return;
        }
        c cVar4 = this.f25345c.get(this.f25330P);
        cVar4.f();
        if (this.f25335U > 0 && "A_OPUS".equals(cVar4.f25402c)) {
            this.f25361p.T(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f25335U).array());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f25328N; i13++) {
            i12 += this.f25329O[i13];
        }
        int i14 = 0;
        while (i14 < this.f25328N) {
            long j12 = this.f25325K + ((cVar4.f25405f * i14) / 1000);
            int i15 = this.f25332R;
            if (i14 == 0 && !this.f25334T) {
                i15 |= 1;
            }
            int i16 = this.f25329O[i14];
            int i17 = i12 - i16;
            p(cVar4, j12, i15, i16, i17);
            i14++;
            i12 = i17;
        }
        this.f25324J = 0;
    }

    protected c v(int i10) throws ParserException {
        l(i10);
        return this.f25369x;
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

    protected void x(c cVar, InterfaceC18078q interfaceC18078q, int i10) throws IOException {
        if (cVar.f25407h != 1685485123 && cVar.f25407h != 1685480259) {
            interfaceC18078q.k(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f25388P = bArr;
        interfaceC18078q.readFully(bArr, 0, i10);
    }

    private static byte[] u(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        return P.q0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f25319E = -9223372036854775807L;
        this.f25324J = 0;
        this.f25341a.reset();
        this.f25343b.e();
        E();
        for (int i10 = 0; i10 < this.f25345c.size(); i10++) {
            this.f25345c.valueAt(i10).n();
        }
    }
}

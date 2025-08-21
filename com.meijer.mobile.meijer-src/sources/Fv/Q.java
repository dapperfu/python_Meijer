package Fv;

import Bv.m;
import Ev.AbstractC3260b;
import Ev.JsonConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00013B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J=\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\b\u00109\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010!J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u00105J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001aH\u0016¢\u0006\u0004\bD\u0010\u001cJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010'J\u0017\u0010S\u001a\u00020R2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010XR\u0014\u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010^\u001a\u00020[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010\\\u001a\u0004\bY\u0010]R\u0016\u0010`\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010_R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010aR\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u0004\u0018\u00010f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006j"}, d2 = {"LFv/Q;", "LEv/h;", "", "LCv/a;", "LEv/b;", "json", "LFv/Z;", "mode", "LFv/a;", "lexer", "LBv/f;", "descriptor", "LFv/Q$a;", "discriminatorHolder", "<init>", "(LEv/b;LFv/Z;LFv/a;LBv/f;LFv/Q$a;)V", "", "unknownKey", "", "R", "(LFv/Q$a;Ljava/lang/String;)Z", "", "Q", "(LBv/f;)V", "J", "()V", "", "M", "()I", "index", "K", "(LBv/f;I)Z", "N", "(LBv/f;)I", "key", "P", "(Ljava/lang/String;)Z", "L", "O", "()Ljava/lang/String;", "LEv/i;", "j", "()LEv/i;", "T", "Lzv/a;", "deserializer", "z", "(Lzv/a;)Ljava/lang/Object;", "LCv/c;", "b", "(LBv/f;)LCv/c;", "a", "E", "()Z", "", "l", "()Ljava/lang/Void;", "previousValue", "e", "(LBv/f;ILzv/a;Ljava/lang/Object;)Ljava/lang/Object;", "f", "v", "", "G", "()B", "", "r", "()S", "k", "", "n", "()J", "", "s", "()F", "", "t", "()D", "", "x", "()C", "B", "LCv/e;", "y", "(LBv/f;)LCv/e;", "LEv/b;", "d", "()LEv/b;", "LFv/Z;", "c", "LFv/a;", "LIv/c;", "LIv/c;", "()LIv/c;", "serializersModule", "I", "currentIndex", "LFv/Q$a;", "LEv/g;", "g", "LEv/g;", "configuration", "LFv/z;", "h", "LFv/z;", "elementMarker", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class Q extends Cv.a implements Ev.h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3260b json;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Z mode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final JsonReader lexer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Iv.c serializersModule;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a discriminatorHolder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final JsonConfiguration configuration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C3615z elementMarker;

    private final boolean R(a aVar, String str) {
        if (aVar == null || !Intrinsics.e(aVar.discriminatorToSkip, str)) {
            return false;
        }
        aVar.discriminatorToSkip = null;
        return true;
    }

    @Override // Cv.a, Cv.e
    public Void l() {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LFv/Q$a;", "", "", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public String discriminatorToSkip;

        public a(String str) {
            this.discriminatorToSkip = str;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Z.values().length];
            try {
                iArr[Z.f11025d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z.f11026e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Z.f11027f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Z.f11024c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Q(AbstractC3260b json, Z mode, JsonReader lexer, Bv.f descriptor, a aVar) {
        Intrinsics.j(json, "json");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(lexer, "lexer");
        Intrinsics.j(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = aVar;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new C3615z(descriptor);
    }

    private final void J() {
        if (this.lexer.G() != 4) {
            return;
        }
        JsonReader.x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean K(Bv.f descriptor, int index) {
        String strH;
        AbstractC3260b abstractC3260b = this.json;
        boolean zN = descriptor.n(index);
        Bv.f fVarL = descriptor.l(index);
        if (zN && !fVarL.g() && this.lexer.O(true)) {
            return true;
        }
        if (!Intrinsics.e(fVarL.getKind(), m.b.f3727a) || ((fVarL.g() && this.lexer.O(false)) || (strH = this.lexer.H(this.configuration.getIsLenient())) == null)) {
            return false;
        }
        int i10 = C.i(fVarL, abstractC3260b, strH);
        boolean z10 = !abstractC3260b.getConfiguration().getExplicitNulls() && fVarL.g();
        if (i10 == -3 && (zN || z10)) {
            this.lexer.o();
            return true;
        }
        return false;
    }

    private final int L() {
        boolean zN = this.lexer.N();
        if (!this.lexer.e()) {
            if (!zN || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            A.g(this.lexer, "array");
            throw new KotlinNothingValueException();
        }
        int i10 = this.currentIndex;
        if (i10 != -1 && !zN) {
            JsonReader.x(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.currentIndex = i11;
        return i11;
    }

    private final int M() {
        int i10 = this.currentIndex;
        boolean zN = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.lexer.l(':');
        } else if (i10 != -1) {
            zN = this.lexer.N();
        }
        if (!this.lexer.e()) {
            if (!zN || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            A.h(this.lexer, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (this.currentIndex == -1) {
                JsonReader jsonReader = this.lexer;
                int i11 = jsonReader.currentPosition;
                if (zN) {
                    JsonReader.x(jsonReader, "Unexpected leading comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                JsonReader jsonReader2 = this.lexer;
                boolean z11 = zN;
                int i12 = jsonReader2.currentPosition;
                if (!z11) {
                    JsonReader.x(jsonReader2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.currentIndex + 1;
        this.currentIndex = i13;
        return i13;
    }

    private final int N(Bv.f descriptor) {
        int i10;
        boolean zN;
        boolean zN2 = this.lexer.N();
        while (true) {
            boolean z10 = true;
            if (!this.lexer.e()) {
                if (zN2 && !this.json.getConfiguration().getAllowTrailingComma()) {
                    A.h(this.lexer, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                C3615z c3615z = this.elementMarker;
                if (c3615z != null) {
                    return c3615z.d();
                }
                return -1;
            }
            String strO = O();
            this.lexer.l(':');
            i10 = C.i(descriptor, this.json, strO);
            if (i10 == -3) {
                zN = false;
            } else {
                if (!this.configuration.getCoerceInputValues() || !K(descriptor, i10)) {
                    break;
                }
                zN = this.lexer.N();
                z10 = false;
            }
            zN2 = z10 ? P(strO) : zN;
        }
        C3615z c3615z2 = this.elementMarker;
        if (c3615z2 != null) {
            c3615z2.c(i10);
        }
        return i10;
    }

    private final String O() {
        return this.configuration.getIsLenient() ? this.lexer.r() : this.lexer.i();
    }

    private final boolean P(String key) {
        if (this.configuration.getIgnoreUnknownKeys() || R(this.discriminatorHolder, key)) {
            this.lexer.J(this.configuration.getIsLenient());
        } else {
            this.lexer.A(key);
        }
        return this.lexer.N();
    }

    @Override // Cv.a, Cv.e
    public String B() {
        return this.configuration.getIsLenient() ? this.lexer.r() : this.lexer.o();
    }

    @Override // Cv.a, Cv.e
    public boolean E() {
        C3615z c3615z = this.elementMarker;
        return ((c3615z != null ? c3615z.getIsUnmarkedNull() : false) || JsonReader.P(this.lexer, false, 1, null)) ? false : true;
    }

    @Override // Cv.a, Cv.e
    public byte G() {
        long jM = this.lexer.m();
        byte b10 = (byte) jM;
        if (jM == b10) {
            return b10;
        }
        JsonReader.x(this.lexer, "Failed to parse byte for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Cv.a, Cv.c
    public void a(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            Q(descriptor);
        }
        if (this.lexer.N() && !this.json.getConfiguration().getAllowTrailingComma()) {
            A.g(this.lexer, "");
            throw new KotlinNothingValueException();
        }
        this.lexer.l(this.mode.end);
        this.lexer.path.b();
    }

    @Override // Cv.a, Cv.e
    public Cv.c b(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        Z zB = a0.b(this.json, descriptor);
        this.lexer.path.c(descriptor);
        this.lexer.l(zB.begin);
        J();
        int i10 = b.$EnumSwitchMapping$0[zB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new Q(this.json, zB, this.lexer, descriptor, this.discriminatorHolder) : (this.mode == zB && this.json.getConfiguration().getExplicitNulls()) ? this : new Q(this.json, zB, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // Cv.c
    /* renamed from: c, reason: from getter */
    public Iv.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // Ev.h
    /* renamed from: d, reason: from getter */
    public final AbstractC3260b getJson() {
        return this.json;
    }

    @Override // Cv.a, Cv.c
    public <T> T e(Bv.f descriptor, int index, InterfaceC18555a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        boolean z10 = this.mode == Z.f11026e && (index & 1) == 0;
        if (z10) {
            this.lexer.path.d();
        }
        T t10 = (T) super.e(descriptor, index, deserializer, previousValue);
        if (z10) {
            this.lexer.path.f(t10);
        }
        return t10;
    }

    @Override // Cv.c
    public int f(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        int i10 = b.$EnumSwitchMapping$0[this.mode.ordinal()];
        int iL = i10 != 2 ? i10 != 4 ? L() : N(descriptor) : M();
        if (this.mode != Z.f11026e) {
            this.lexer.path.g(iL);
        }
        return iL;
    }

    @Override // Ev.h
    public Ev.i j() {
        return new K(this.json.getConfiguration(), this.lexer).e();
    }

    @Override // Cv.a, Cv.e
    public int k() {
        long jM = this.lexer.m();
        int i10 = (int) jM;
        if (jM == i10) {
            return i10;
        }
        JsonReader.x(this.lexer, "Failed to parse int for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Cv.a, Cv.e
    public long n() {
        return this.lexer.m();
    }

    @Override // Cv.a, Cv.e
    public short r() {
        long jM = this.lexer.m();
        short s10 = (short) jM;
        if (jM == s10) {
            return s10;
        }
        JsonReader.x(this.lexer, "Failed to parse short for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Cv.a, Cv.e
    public float s() throws NumberFormatException {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            float f10 = Float.parseFloat(strQ);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return f10;
            }
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            A.k(this.lexer, Float.valueOf(f10));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'float' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Cv.a, Cv.e
    public double t() throws NumberFormatException {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            double d10 = Double.parseDouble(strQ);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return d10;
            }
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            A.k(this.lexer, Double.valueOf(d10));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'double' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Cv.a, Cv.e
    public boolean v() {
        return this.lexer.g();
    }

    @Override // Cv.a, Cv.e
    public char x() {
        String strQ = this.lexer.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        JsonReader.x(this.lexer, "Expected single char, but got '" + strQ + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Cv.a, Cv.e
    public Cv.e y(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return T.b(descriptor) ? new C3614y(this.lexer, this.json) : super.y(descriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    @Override // Cv.a, Cv.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T z(zv.InterfaceC18555a<? extends T> r12) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fv.Q.z(zv.a):java.lang.Object");
    }

    private final void Q(Bv.f descriptor) {
        while (f(descriptor) != -1) {
        }
    }
}

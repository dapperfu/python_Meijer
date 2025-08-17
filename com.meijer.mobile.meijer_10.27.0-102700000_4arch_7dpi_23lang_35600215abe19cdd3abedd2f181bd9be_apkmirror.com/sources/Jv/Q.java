package Jv;

import Fv.m;
import Iv.AbstractC3761b;
import Iv.JsonConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00013B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J=\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\b\u00109\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010!J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u00105J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001aH\u0016¢\u0006\u0004\bD\u0010\u001cJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010'J\u0017\u0010S\u001a\u00020R2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR\u001a\u0010^\u001a\u00020[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010\\\u001a\u0004\bX\u0010]R\u0016\u0010a\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010bR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010dR\u0016\u0010h\u001a\u0004\u0018\u00010f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010g¨\u0006i"}, d2 = {"LJv/Q;", "LIv/h;", "", "LGv/a;", "LIv/b;", "json", "LJv/Z;", "mode", "LJv/a;", "lexer", "LFv/f;", "descriptor", "LJv/Q$a;", "discriminatorHolder", "<init>", "(LIv/b;LJv/Z;LJv/a;LFv/f;LJv/Q$a;)V", "", "unknownKey", "", "R", "(LJv/Q$a;Ljava/lang/String;)Z", "", "Q", "(LFv/f;)V", "J", "()V", "", "M", "()I", "index", "K", "(LFv/f;I)Z", "N", "(LFv/f;)I", "key", "P", "(Ljava/lang/String;)Z", "L", "O", "()Ljava/lang/String;", "LIv/i;", "g", "()LIv/i;", "T", "LDv/a;", "deserializer", "G", "(LDv/a;)Ljava/lang/Object;", "LGv/c;", "c", "(LFv/f;)LGv/c;", "a", "B", "()Z", "", "i", "()Ljava/lang/Void;", "previousValue", "m", "(LFv/f;ILDv/a;Ljava/lang/Object;)Ljava/lang/Object;", "v", "s", "", "E", "()B", "", "o", "()S", "h", "", "k", "()J", "", "p", "()F", "", "q", "()D", "", "t", "()C", "A", "LGv/e;", "f", "(LFv/f;)LGv/e;", "LIv/b;", "d", "()LIv/b;", "b", "LJv/Z;", "LJv/a;", "LMv/c;", "LMv/c;", "()LMv/c;", "serializersModule", "e", "I", "currentIndex", "LJv/Q$a;", "LIv/g;", "LIv/g;", "configuration", "LJv/z;", "LJv/z;", "elementMarker", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public class Q extends Gv.a implements Iv.h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3761b json;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Z mode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final JsonReader lexer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Mv.c serializersModule;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a discriminatorHolder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final JsonConfiguration configuration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C3942z elementMarker;

    private final boolean R(a aVar, String str) {
        if (aVar == null || !Intrinsics.e(aVar.discriminatorToSkip, str)) {
            return false;
        }
        aVar.discriminatorToSkip = null;
        return true;
    }

    @Override // Gv.a, Gv.e
    public Void i() {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LJv/Q$a;", "", "", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                iArr[Z.f16226d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z.f16227e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Z.f16228f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Z.f16225c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Q(AbstractC3761b json, Z mode, JsonReader lexer, Fv.f descriptor, a aVar) {
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
        this.elementMarker = configuration.getExplicitNulls() ? null : new C3942z(descriptor);
    }

    private final void J() {
        if (this.lexer.G() != 4) {
            return;
        }
        JsonReader.x(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean K(Fv.f descriptor, int index) {
        String strH;
        AbstractC3761b abstractC3761b = this.json;
        boolean zN = descriptor.n(index);
        Fv.f fVarL = descriptor.l(index);
        if (zN && !fVarL.g() && this.lexer.O(true)) {
            return true;
        }
        if (!Intrinsics.e(fVarL.getKind(), m.b.f11132a) || ((fVarL.g() && this.lexer.O(false)) || (strH = this.lexer.H(this.configuration.getIsLenient())) == null)) {
            return false;
        }
        int i10 = C.i(fVarL, abstractC3761b, strH);
        boolean z10 = !abstractC3761b.getConfiguration().getExplicitNulls() && fVarL.g();
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

    private final int N(Fv.f descriptor) {
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
                C3942z c3942z = this.elementMarker;
                if (c3942z != null) {
                    return c3942z.d();
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
        C3942z c3942z2 = this.elementMarker;
        if (c3942z2 != null) {
            c3942z2.c(i10);
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

    @Override // Gv.a, Gv.e
    public String A() {
        return this.configuration.getIsLenient() ? this.lexer.r() : this.lexer.o();
    }

    @Override // Gv.a, Gv.e
    public boolean B() {
        C3942z c3942z = this.elementMarker;
        return ((c3942z != null ? c3942z.getIsUnmarkedNull() : false) || JsonReader.P(this.lexer, false, 1, null)) ? false : true;
    }

    @Override // Gv.a, Gv.e
    public byte E() {
        long jM = this.lexer.m();
        byte b10 = (byte) jM;
        if (jM == b10) {
            return b10;
        }
        JsonReader.x(this.lexer, "Failed to parse byte for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    @Override // Gv.a, Gv.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T G(Dv.a<? extends T> r12) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jv.Q.G(Dv.a):java.lang.Object");
    }

    @Override // Gv.a, Gv.c
    public void a(Fv.f descriptor) {
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

    @Override // Gv.c
    /* renamed from: b, reason: from getter */
    public Mv.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // Gv.a, Gv.e
    public Gv.c c(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        Z zB = a0.b(this.json, descriptor);
        this.lexer.path.c(descriptor);
        this.lexer.l(zB.begin);
        J();
        int i10 = b.$EnumSwitchMapping$0[zB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new Q(this.json, zB, this.lexer, descriptor, this.discriminatorHolder) : (this.mode == zB && this.json.getConfiguration().getExplicitNulls()) ? this : new Q(this.json, zB, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // Iv.h
    /* renamed from: d, reason: from getter */
    public final AbstractC3761b getJson() {
        return this.json;
    }

    @Override // Gv.a, Gv.e
    public Gv.e f(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return T.b(descriptor) ? new C3941y(this.lexer, this.json) : super.f(descriptor);
    }

    @Override // Iv.h
    public Iv.i g() {
        return new K(this.json.getConfiguration(), this.lexer).e();
    }

    @Override // Gv.a, Gv.e
    public int h() {
        long jM = this.lexer.m();
        int i10 = (int) jM;
        if (jM == i10) {
            return i10;
        }
        JsonReader.x(this.lexer, "Failed to parse int for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Gv.a, Gv.e
    public long k() {
        return this.lexer.m();
    }

    @Override // Gv.a, Gv.c
    public <T> T m(Fv.f descriptor, int index, Dv.a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        boolean z10 = this.mode == Z.f16227e && (index & 1) == 0;
        if (z10) {
            this.lexer.path.d();
        }
        T t10 = (T) super.m(descriptor, index, deserializer, previousValue);
        if (z10) {
            this.lexer.path.f(t10);
        }
        return t10;
    }

    @Override // Gv.a, Gv.e
    public short o() {
        long jM = this.lexer.m();
        short s10 = (short) jM;
        if (jM == s10) {
            return s10;
        }
        JsonReader.x(this.lexer, "Failed to parse short for input '" + jM + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Gv.a, Gv.e
    public float p() throws NumberFormatException {
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

    @Override // Gv.a, Gv.e
    public double q() throws NumberFormatException {
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

    @Override // Gv.a, Gv.e
    public boolean s() {
        return this.lexer.g();
    }

    @Override // Gv.a, Gv.e
    public char t() {
        String strQ = this.lexer.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        JsonReader.x(this.lexer, "Expected single char, but got '" + strQ + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // Gv.c
    public int v(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        int i10 = b.$EnumSwitchMapping$0[this.mode.ordinal()];
        int iL = i10 != 2 ? i10 != 4 ? L() : N(descriptor) : M();
        if (this.mode != Z.f16227e) {
            this.lexer.path.g(iL);
        }
        return iL;
    }

    private final void Q(Fv.f descriptor) {
        while (v(descriptor) != -1) {
        }
    }
}

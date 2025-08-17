package C6;

import com.google.maps.android.BuildConfig;
import fsimpl.C14045dq;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.InterfaceC15329f;
import y6.InterfaceC18172F;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\f\u0018\u0000 :2\u00020\u0001:\u0001<B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0001H\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0001H\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010\u001fJ\u0017\u0010*\u001a\u00020\u00012\u0006\u0010&\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00012\u0006\u0010&\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00012\u0006\u0010&\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00012\u0006\u0010&\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u0010&\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b:\u0010%J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010>R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u001e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010BR\u0018\u0010K\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010>R\u0014\u0010M\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010LR\u0014\u0010O\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010L¨\u0006P"}, d2 = {"LC6/c;", "LC6/g;", "Lkw/f;", "sink", "", "indent", "<init>", "(Lkw/f;Ljava/lang/String;)V", "", "empty", "openBracket", "j", "(ILjava/lang/String;)LC6/g;", "nonempty", "closeBracket", "d", "(IILjava/lang/String;)LC6/g;", "", "w", "()V", "i", "b", "c", "l", "()I", "newTop", "m", "(I)V", "topOfStack", "p", "y", "()LC6/g;", "x", "s", "F", "name", "x1", "(Ljava/lang/String;)LC6/g;", "value", "f2", "D3", "", "E0", "(Z)LC6/g;", "", "d0", "(D)LC6/g;", "W", "(I)LC6/g;", "", "U", "(J)LC6/g;", "LC6/e;", "L1", "(LC6/e;)LC6/g;", "Ly6/F;", "u", "(Ly6/F;)LC6/c;", "h", "close", "a", "Lkw/f;", "Ljava/lang/String;", "I", "stackSize", "", "[I", "scopes", "", "e", "[Ljava/lang/String;", "pathNames", "f", "pathIndices", "g", "deferredName", "()Ljava/lang/String;", "separator", "getPath", "path", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c implements g {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f3670i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15329f sink;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String indent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int stackSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int[] scopes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String[] pathNames;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int[] pathIndices;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String deferredName;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LC6/c$a;", "", "<init>", "()V", "", "", "b", "(B)Ljava/lang/String;", "Lkw/f;", "sink", "value", "", "c", "(Lkw/f;Ljava/lang/String;)V", "HEX_ARRAY", "Ljava/lang/String;", "", "REPLACEMENT_CHARS", "[Ljava/lang/String;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: C6.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte b10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("0123456789abcdef".charAt(b10 >>> 4));
            sb2.append("0123456789abcdef".charAt(b10 & C14045dq.MULTIPLY));
            return sb2.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(kw.InterfaceC15329f r8, java.lang.String r9) throws java.io.IOException {
            /*
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.j(r8, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.j(r9, r0)
                java.lang.String[] r0 = C6.c.a()
                r1 = 34
                r8.writeByte(r1)
                int r2 = r9.length()
                r3 = 0
                r4 = r3
            L19:
                if (r3 >= r2) goto L42
                char r5 = r9.charAt(r3)
                r6 = 128(0x80, float:1.8E-43)
                if (r5 >= r6) goto L28
                r5 = r0[r5]
                if (r5 != 0) goto L35
                goto L3f
            L28:
                r6 = 8232(0x2028, float:1.1535E-41)
                if (r5 != r6) goto L2f
                java.lang.String r5 = "\\u2028"
                goto L35
            L2f:
                r6 = 8233(0x2029, float:1.1537E-41)
                if (r5 != r6) goto L3f
                java.lang.String r5 = "\\u2029"
            L35:
                if (r4 >= r3) goto L3a
                r8.Q0(r9, r4, r3)
            L3a:
                r8.I0(r5)
                int r4 = r3 + 1
            L3f:
                int r3 = r3 + 1
                goto L19
            L42:
                if (r4 >= r2) goto L47
                r8.Q0(r9, r4, r2)
            L47:
                r8.writeByte(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: C6.c.Companion.c(kw.f, java.lang.String):void");
        }
    }

    @Override // C6.g
    public g F() {
        return d(3, 5, "}");
    }

    @Override // C6.g
    public g x() {
        return d(1, 2, "]");
    }

    static {
        String[] strArr = new String[128];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u00" + INSTANCE.b((byte) i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        f3670i = strArr;
    }

    @JvmOverloads
    public c(InterfaceC15329f sink, String str) {
        Intrinsics.j(sink, "sink");
        this.sink = sink;
        this.indent = str;
        this.scopes = new int[64];
        this.pathNames = new String[64];
        this.pathIndices = new int[64];
        m(6);
    }

    private final String g() {
        String str = this.indent;
        return (str == null || str.length() == 0) ? ":" : ": ";
    }

    private final void i() throws IOException {
        if (this.indent == null) {
            return;
        }
        this.sink.writeByte(10);
        int i10 = this.stackSize;
        for (int i11 = 1; i11 < i10; i11++) {
            this.sink.I0(this.indent);
        }
    }

    private final int l() {
        int i10 = this.stackSize;
        if (i10 != 0) {
            return this.scopes[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void m(int newTop) {
        int i10 = this.stackSize;
        int[] iArr = this.scopes;
        if (i10 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.i(iArrCopyOf, "copyOf(...)");
            this.scopes = iArrCopyOf;
            String[] strArr = this.pathNames;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length * 2);
            Intrinsics.i(objArrCopyOf, "copyOf(...)");
            this.pathNames = (String[]) objArrCopyOf;
            int[] iArr2 = this.pathIndices;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length * 2);
            Intrinsics.i(iArrCopyOf2, "copyOf(...)");
            this.pathIndices = iArrCopyOf2;
        }
        int[] iArr3 = this.scopes;
        int i11 = this.stackSize;
        this.stackSize = i11 + 1;
        iArr3[i11] = newTop;
    }

    private final void p(int topOfStack) {
        this.scopes[this.stackSize - 1] = topOfStack;
    }

    private final void w() throws IOException {
        if (this.deferredName != null) {
            b();
            Companion companion = INSTANCE;
            InterfaceC15329f interfaceC15329f = this.sink;
            String str = this.deferredName;
            Intrinsics.g(str);
            companion.c(interfaceC15329f, str);
            this.deferredName = null;
        }
    }

    @Override // C6.g
    public g D3() {
        return h(BuildConfig.TRAVIS);
    }

    @Override // C6.g
    public g E0(boolean value) {
        return h(value ? "true" : "false");
    }

    @Override // C6.g
    public g L1(e value) {
        Intrinsics.j(value, "value");
        return h(value.getValue());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.sink.close();
        int i10 = this.stackSize;
        if (i10 > 1 || (i10 == 1 && this.scopes[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    @Override // C6.g
    public g f2(String value) throws IOException {
        Intrinsics.j(value, "value");
        w();
        c();
        INSTANCE.c(this.sink, value);
        int[] iArr = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // C6.g
    public String getPath() {
        return CollectionsKt.B0(D6.b.f5050a.a(this.stackSize, this.scopes, this.pathNames, this.pathIndices), ".", null, null, 0, null, null, 62, null);
    }

    public final g h(String value) throws IOException {
        Intrinsics.j(value, "value");
        w();
        c();
        this.sink.I0(value);
        int[] iArr = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // C6.g
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public c I2(InterfaceC18172F value) {
        Intrinsics.j(value, "value");
        D3();
        return this;
    }

    @Override // C6.g
    public g x1(String name) {
        Intrinsics.j(name, "name");
        int i10 = this.stackSize;
        if (i10 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.deferredName = name;
        this.pathNames[i10 - 1] = name;
        return this;
    }

    private final void b() throws IOException {
        int iL = l();
        if (iL == 5) {
            this.sink.writeByte(44);
        } else if (iL != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        i();
        p(4);
    }

    private final void c() throws IOException {
        int iL = l();
        if (iL != 1) {
            if (iL != 2) {
                if (iL != 4) {
                    if (iL != 6) {
                        if (iL != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                    p(7);
                    return;
                }
                this.sink.I0(g());
                p(5);
                return;
            }
            this.sink.writeByte(44);
            i();
            return;
        }
        p(2);
        i();
    }

    private final g d(int empty, int nonempty, String closeBracket) throws IOException {
        int iL = l();
        if (iL != nonempty && iL != empty) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName == null) {
            int i10 = this.stackSize;
            int i11 = i10 - 1;
            this.stackSize = i11;
            this.pathNames[i11] = null;
            int[] iArr = this.pathIndices;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            if (iL == nonempty) {
                i();
            }
            this.sink.I0(closeBracket);
            return this;
        }
        throw new IllegalStateException(("Dangling name: " + this.deferredName).toString());
    }

    private final g j(int empty, String openBracket) throws IOException {
        c();
        m(empty);
        this.pathIndices[this.stackSize - 1] = 0;
        this.sink.I0(openBracket);
        return this;
    }

    @Override // C6.g
    public g U(long value) {
        return h(String.valueOf(value));
    }

    @Override // C6.g
    public g W(int value) {
        return h(String.valueOf(value));
    }

    @Override // C6.g
    public g d0(double value) {
        if (!Double.isNaN(value) && !Double.isInfinite(value)) {
            return h(String.valueOf(value));
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + value).toString());
    }

    @Override // C6.g
    public g s() throws IOException {
        w();
        return j(3, "{");
    }

    @Override // C6.g
    public g y() throws IOException {
        w();
        return j(1, "[");
    }
}

package kw;

import fsimpl.C14045dq;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0016\u0018\u0000 W2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0010J#\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0019H\u0010¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u0019H\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0003H\u0010¢\u0006\u0004\b(\u0010'J'\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0019H\u0010¢\u0006\u0004\b.\u0010/J/\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0019H\u0016¢\u0006\u0004\b3\u00104J/\u00105\u001a\u0002022\u0006\u0010+\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u0002022\u0006\u00107\u001a\u00020\u0000¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u0002022\u0006\u0010:\u001a\u00020\u0000¢\u0006\u0004\b;\u00109J!\u0010=\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00002\b\b\u0002\u0010<\u001a\u00020\u0019H\u0007¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u0019H\u0017¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00002\b\b\u0002\u0010<\u001a\u00020\u0019H\u0007¢\u0006\u0004\bA\u0010>J!\u0010B\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u0019H\u0017¢\u0006\u0004\bB\u0010@J\u001a\u0010D\u001a\u0002022\b\u00100\u001a\u0004\u0018\u00010CH\u0096\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0019H\u0016¢\u0006\u0004\bF\u0010%J\u0018\u0010G\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0007H\u0016¢\u0006\u0004\bI\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010'R\"\u0010F\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\bL\u0010%\"\u0004\bM\u0010NR$\u0010T\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\t\"\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\bU\u0010%¨\u0006X"}, d2 = {"Lkw/h;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "", "c0", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "X", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "a", "N", "()Lkw/h;", "T", "U", "algorithm", "o", "(Ljava/lang/String;)Lkw/h;", "b", "E", "a0", "", "beginIndex", "endIndex", "Y", "(II)Lkw/h;", "pos", "", "J", "(I)B", "index", "u", "C", "()I", "b0", "()[B", "I", "Lkw/e;", "buffer", "offset", "byteCount", "", "d0", "(Lkw/e;II)V", "other", "otherOffset", "", "P", "(ILkw/h;II)Z", "Q", "(I[BII)Z", "prefix", "W", "(Lkw/h;)Z", "suffix", "t", "fromIndex", "F", "(Lkw/h;I)I", "G", "([BI)I", "K", "L", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "e", "(Lkw/h;)I", "toString", "[B", "z", "B", "R", "(I)V", "c", "Ljava/lang/String;", "D", "S", "(Ljava/lang/String;)V", "utf8", "V", "size", "d", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kw.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C15331h implements Serializable, Comparable<C15331h> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final C15331h f148095e = new C15331h(new byte[0]);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private transient int hashCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private transient String utf8;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u0007*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u0013\u0010\u0017\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lkw/h$a;", "", "<init>", "()V", "", "", "data", "Lkw/h;", "e", "([B)Lkw/h;", "", "offset", "byteCount", "f", "([BII)Lkw/h;", "", "d", "(Ljava/lang/String;)Lkw/h;", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lkw/h;", "a", "b", "", "serialVersionUID", "J", "EMPTY", "Lkw/h;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kw.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ C15331h g(Companion companion, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = C15325b.c();
            }
            return companion.f(bArr, i10, i11);
        }

        @JvmStatic
        public final C15331h a(String str) {
            Intrinsics.j(str, "<this>");
            byte[] bArrA = C15324a.a(str);
            if (bArrA != null) {
                return new C15331h(bArrA);
            }
            return null;
        }

        @JvmStatic
        public final C15331h b(String str) {
            Intrinsics.j(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((lw.c.b(str.charAt(i11)) << 4) + lw.c.b(str.charAt(i11 + 1)));
            }
            return new C15331h(bArr);
        }

        @JvmStatic
        @JvmName
        public final C15331h c(String str, Charset charset) {
            Intrinsics.j(str, "<this>");
            Intrinsics.j(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.i(bytes, "getBytes(...)");
            return new C15331h(bytes);
        }

        @JvmStatic
        public final C15331h d(String str) {
            Intrinsics.j(str, "<this>");
            C15331h c15331h = new C15331h(N.a(str));
            c15331h.S(str);
            return c15331h;
        }

        @JvmStatic
        public final C15331h e(byte... data) {
            Intrinsics.j(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            Intrinsics.i(bArrCopyOf, "copyOf(...)");
            return new C15331h(bArrCopyOf);
        }

        @JvmStatic
        @JvmName
        public final C15331h f(byte[] bArr, int i10, int i11) {
            Intrinsics.j(bArr, "<this>");
            int iF = C15325b.f(bArr, i11);
            C15325b.b(bArr.length, i10, iF);
            return new C15331h(ArraysKt.u(bArr, i10, iF + i10));
        }
    }

    @JvmStatic
    public static final C15331h O(byte... bArr) {
        return INSTANCE.e(bArr);
    }

    @JvmStatic
    public static final C15331h l(String str) {
        return INSTANCE.a(str);
    }

    @JvmStatic
    public static final C15331h m(String str) {
        return INSTANCE.b(str);
    }

    @JvmStatic
    public static final C15331h p(String str) {
        return INSTANCE.d(str);
    }

    public C15331h a0() {
        for (int i10 = 0; i10 < getData().length; i10++) {
            byte b10 = getData()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                Intrinsics.i(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C15331h(bArrCopyOf);
            }
        }
        return this;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof C15331h) {
            C15331h c15331h = (C15331h) other;
            if (c15331h.V() == getData().length && c15331h.Q(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    public C15331h(byte[] data) {
        Intrinsics.j(data, "data");
        this.data = data;
    }

    public static /* synthetic */ int H(C15331h c15331h, C15331h c15331h2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c15331h.F(c15331h2, i10);
    }

    public static /* synthetic */ int M(C15331h c15331h, C15331h c15331h2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = C15325b.c();
        }
        return c15331h.K(c15331h2, i10);
    }

    public static /* synthetic */ C15331h Z(C15331h c15331h, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = C15325b.c();
        }
        return c15331h.Y(i10, i11);
    }

    /* renamed from: B, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    /* renamed from: D, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    @JvmOverloads
    public final int F(C15331h other, int fromIndex) {
        Intrinsics.j(other, "other");
        return G(other.I(), fromIndex);
    }

    @JvmOverloads
    public int G(byte[] other, int fromIndex) {
        Intrinsics.j(other, "other");
        int length = getData().length - other.length;
        int iMax = Math.max(fromIndex, 0);
        if (iMax > length) {
            return -1;
        }
        while (!C15325b.a(getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @JvmOverloads
    public final int K(C15331h other, int fromIndex) {
        Intrinsics.j(other, "other");
        return L(other.I(), fromIndex);
    }

    @JvmOverloads
    public int L(byte[] other, int fromIndex) {
        Intrinsics.j(other, "other");
        for (int iMin = Math.min(C15325b.e(this, fromIndex), getData().length - other.length); -1 < iMin; iMin--) {
            if (C15325b.a(getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final C15331h N() {
        return o("MD5");
    }

    public boolean P(int offset, C15331h other, int otherOffset, int byteCount) {
        Intrinsics.j(other, "other");
        return other.Q(otherOffset, getData(), offset, byteCount);
    }

    public boolean Q(int offset, byte[] other, int otherOffset, int byteCount) {
        Intrinsics.j(other, "other");
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && C15325b.a(getData(), offset, other, otherOffset, byteCount);
    }

    public final void R(int i10) {
        this.hashCode = i10;
    }

    public final void S(String str) {
        this.utf8 = str;
    }

    public final C15331h T() {
        return o("SHA-1");
    }

    public final C15331h U() {
        return o("SHA-256");
    }

    public final boolean W(C15331h prefix) {
        Intrinsics.j(prefix, "prefix");
        return P(0, prefix, 0, prefix.V());
    }

    public String X(Charset charset) {
        Intrinsics.j(charset, "charset");
        return new String(this.data, charset);
    }

    public void d0(C15328e buffer, int offset, int byteCount) {
        Intrinsics.j(buffer, "buffer");
        lw.b.c(this, buffer, offset, byteCount);
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(C15331h other) {
        Intrinsics.j(other, "other");
        int iV = V();
        int iV2 = other.V();
        int iMin = Math.min(iV, iV2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iU = u(i10) & 255;
            int iU2 = other.u(i10) & 255;
            if (iU != iU2) {
                return iU < iU2 ? -1 : 1;
            }
        }
        if (iV == iV2) {
            return 0;
        }
        return iV < iV2 ? -1 : 1;
    }

    public C15331h o(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.j(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, V());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.g(bArrDigest);
        return new C15331h(bArrDigest);
    }

    public final boolean t(C15331h suffix) {
        Intrinsics.j(suffix, "suffix");
        return P(V() - suffix.V(), suffix, 0, suffix.V());
    }

    /* renamed from: z, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public int C() {
        return getData().length;
    }

    public String E() {
        char[] cArr = new char[getData().length * 2];
        int i10 = 0;
        for (byte b10 : getData()) {
            int i11 = i10 + 1;
            cArr[i10] = lw.b.d()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = lw.b.d()[b10 & C14045dq.MULTIPLY];
        }
        return StringsKt.A(cArr);
    }

    public byte[] I() {
        return getData();
    }

    public byte J(int pos) {
        return getData()[pos];
    }

    @JvmName
    public final int V() {
        return C();
    }

    @JvmOverloads
    public C15331h Y(int beginIndex, int endIndex) {
        int iE = C15325b.e(this, endIndex);
        if (beginIndex >= 0) {
            if (iE <= getData().length) {
                if (iE - beginIndex >= 0) {
                    if (beginIndex == 0 && iE == getData().length) {
                        return this;
                    }
                    return new C15331h(ArraysKt.u(getData(), beginIndex, iE));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String a() {
        return C15324a.c(getData(), null, 1, null);
    }

    public String b() {
        return C15324a.b(getData(), C15324a.d());
    }

    public byte[] b0() {
        byte[] data = getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.i(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String c0() {
        String utf8 = getUtf8();
        if (utf8 == null) {
            String strC = N.c(I());
            S(strC);
            return strC;
        }
        return utf8;
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(getData());
        R(iHashCode);
        return iHashCode;
    }

    public String toString() {
        C15331h c15331h;
        if (getData().length != 0) {
            int iB = lw.b.b(getData(), 64);
            if (iB == -1) {
                if (getData().length <= 64) {
                    return "[hex=" + E() + ']';
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(getData().length);
                sb2.append(" hex=");
                int iE = C15325b.e(this, 64);
                if (iE <= getData().length) {
                    if (iE >= 0) {
                        if (iE == getData().length) {
                            c15331h = this;
                        } else {
                            c15331h = new C15331h(ArraysKt.u(getData(), 0, iE));
                        }
                        sb2.append(c15331h.E());
                        sb2.append("…]");
                        return sb2.toString();
                    }
                    throw new IllegalArgumentException("endIndex < beginIndex");
                }
                throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
            }
            String strC0 = c0();
            String strSubstring = strC0.substring(0, iB);
            Intrinsics.i(strSubstring, "substring(...)");
            String strQ = StringsKt.Q(StringsKt.Q(StringsKt.Q(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iB < strC0.length()) {
                return "[size=" + getData().length + " text=" + strQ + "…]";
            }
            return "[text=" + strQ + ']';
        }
        return "[size=0]";
    }

    @JvmName
    public final byte u(int index) {
        return J(index);
    }
}

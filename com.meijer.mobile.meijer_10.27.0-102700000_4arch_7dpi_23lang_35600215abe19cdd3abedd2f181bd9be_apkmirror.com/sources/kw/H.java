package kw;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J#\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0010¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J'\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0010¢\u0006\u0004\b*\u0010+J/\u0010/\u001a\u00020.2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0016¢\u0006\u0004\b/\u00100J/\u00101\u001a\u00020.2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u0018H\u0016¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0003H\u0010¢\u0006\u0004\b7\u0010$J\u001a\u00109\u001a\u00020.2\b\u0010,\u001a\u0004\u0018\u000108H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0018H\u0016¢\u0006\u0004\b;\u0010\"J\u000f\u0010<\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lkw/H;", "Lkw/h;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "g0", "()Lkw/h;", "Ljava/nio/charset/Charset;", "charset", "", "X", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "a", "()Ljava/lang/String;", "E", "a0", "algorithm", "o", "(Ljava/lang/String;)Lkw/h;", "b", "", "beginIndex", "endIndex", "Y", "(II)Lkw/h;", "pos", "", "J", "(I)B", "C", "()I", "b0", "()[B", "Lkw/e;", "buffer", "offset", "byteCount", "", "d0", "(Lkw/e;II)V", "other", "otherOffset", "", "P", "(ILkw/h;II)Z", "Q", "(I[BII)Z", "fromIndex", "G", "([BI)I", "L", "I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "f", "[[B", "f0", "()[[B", "g", "[I", "e0", "()[I", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class H extends C15331h {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final transient byte[][] segments;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final transient int[] directory;

    @Override // kw.C15331h
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof C15331h) {
            C15331h c15331h = (C15331h) other;
            if (c15331h.V() == V() && P(0, c15331h, 0, V())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(byte[][] segments, int[] directory) {
        super(C15331h.f148095e.getData());
        Intrinsics.j(segments, "segments");
        Intrinsics.j(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final C15331h g0() {
        return new C15331h(b0());
    }

    @Override // kw.C15331h
    public int G(byte[] other, int fromIndex) {
        Intrinsics.j(other, "other");
        return g0().G(other, fromIndex);
    }

    @Override // kw.C15331h
    public int L(byte[] other, int fromIndex) {
        Intrinsics.j(other, "other");
        return g0().L(other, fromIndex);
    }

    @Override // kw.C15331h
    public boolean P(int offset, C15331h other, int otherOffset, int byteCount) {
        Intrinsics.j(other, "other");
        if (offset < 0 || offset > V() - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iB = lw.g.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!other.Q(otherOffset, getSegments()[iB], i13 + (offset - i11), iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // kw.C15331h
    public boolean Q(int offset, byte[] other, int otherOffset, int byteCount) {
        Intrinsics.j(other, "other");
        if (offset < 0 || offset > V() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iB = lw.g.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!C15325b.a(getSegments()[iB], i13 + (offset - i11), other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // kw.C15331h
    public String X(Charset charset) {
        Intrinsics.j(charset, "charset");
        return g0().X(charset);
    }

    @Override // kw.C15331h
    public void d0(C15328e buffer, int offset, int byteCount) {
        Intrinsics.j(buffer, "buffer");
        int i10 = offset + byteCount;
        int iB = lw.g.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = i13 + (offset - i11);
            F f10 = new F(getSegments()[iB], i14, i14 + iMin, true, false);
            F f11 = buffer.head;
            if (f11 == null) {
                f10.prev = f10;
                f10.next = f10;
                buffer.head = f10;
            } else {
                Intrinsics.g(f11);
                F f12 = f11.prev;
                Intrinsics.g(f12);
                f12.c(f10);
            }
            offset += iMin;
            iB++;
        }
        buffer.K(buffer.getSize() + byteCount);
    }

    /* renamed from: e0, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    /* renamed from: f0, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // kw.C15331h
    public C15331h o(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.j(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            messageDigest.update(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.g(bArrDigest);
        return new C15331h(bArrDigest);
    }

    @Override // kw.C15331h
    public int C() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // kw.C15331h
    public String E() {
        return g0().E();
    }

    @Override // kw.C15331h
    public byte[] I() {
        return b0();
    }

    @Override // kw.C15331h
    public byte J(int pos) {
        int i10;
        C15325b.b(getDirectory()[getSegments().length - 1], pos, 1L);
        int iB = lw.g.b(this, pos);
        if (iB == 0) {
            i10 = 0;
        } else {
            i10 = getDirectory()[iB - 1];
        }
        return getSegments()[iB][(pos - i10) + getDirectory()[getSegments().length + iB]];
    }

    @Override // kw.C15331h
    public C15331h Y(int beginIndex, int endIndex) {
        int iE = C15325b.e(this, endIndex);
        if (beginIndex >= 0) {
            if (iE <= V()) {
                int i10 = iE - beginIndex;
                if (i10 >= 0) {
                    if (beginIndex == 0 && iE == V()) {
                        return this;
                    }
                    if (beginIndex == iE) {
                        return C15331h.f148095e;
                    }
                    int iB = lw.g.b(this, beginIndex);
                    int iB2 = lw.g.b(this, iE - 1);
                    byte[][] bArr = (byte[][]) ArraysKt.w(getSegments(), iB, iB2 + 1);
                    int[] iArr = new int[bArr.length * 2];
                    int i11 = 0;
                    if (iB <= iB2) {
                        int i12 = iB;
                        int i13 = 0;
                        while (true) {
                            iArr[i13] = Math.min(getDirectory()[i12] - beginIndex, i10);
                            int i14 = i13 + 1;
                            iArr[i13 + bArr.length] = getDirectory()[getSegments().length + i12];
                            if (i12 == iB2) {
                                break;
                            }
                            i12++;
                            i13 = i14;
                        }
                    }
                    if (iB != 0) {
                        i11 = getDirectory()[iB - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (beginIndex - i11);
                    return new H(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + iE + " < beginIndex=" + beginIndex).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + iE + " > length(" + V() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + beginIndex + " < 0").toString());
    }

    @Override // kw.C15331h
    public String a() {
        return g0().a();
    }

    @Override // kw.C15331h
    public C15331h a0() {
        return g0().a0();
    }

    @Override // kw.C15331h
    public String b() {
        return g0().b();
    }

    @Override // kw.C15331h
    public byte[] b0() {
        byte[] bArr = new byte[V()];
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            int i15 = i14 - i11;
            ArraysKt.j(getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // kw.C15331h
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            byte[] bArr = getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        R(i11);
        return i11;
    }

    @Override // kw.C15331h
    public String toString() {
        return g0().toString();
    }
}

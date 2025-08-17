package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* loaded from: classes13.dex */
class b extends ByteString {

    /* renamed from: b, reason: collision with root package name */
    protected final byte[] f145934b;

    /* renamed from: c, reason: collision with root package name */
    private int f145935c = 0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b$b, reason: collision with other inner class name */
    private class C2266b implements ByteString.ByteIterator {

        /* renamed from: a, reason: collision with root package name */
        private int f145936a;

        /* renamed from: b, reason: collision with root package name */
        private final int f145937b;

        private C2266b() {
            this.f145936a = 0;
            this.f145937b = b.this.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte b() {
            try {
                byte[] bArr = b.this.f145934b;
                int i10 = this.f145936a;
                this.f145936a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f145936a < this.f145937b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }
    }

    static int G(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    protected int F() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof b) {
            return E((b) obj, 0, size());
        }
        if (obj instanceof c) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int o() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected boolean p() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    void C(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f145934b, F() + i10, i11);
    }

    public byte D(int i10) {
        return this.f145934b[i10];
    }

    public int hashCode() {
        int iU = this.f145935c;
        if (iU == 0) {
            int size = size();
            iU = u(size, 0, size);
            if (iU == 0) {
                iU = 1;
            }
            this.f145935c = iU;
        }
        return iU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f145934b, i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ByteString.ByteIterator iterator() {
        return new C2266b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f145934b.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int u(int i10, int i11, int i12) {
        return G(i10, this.f145934b, F() + i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int w() {
        return this.f145935c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String y(String str) throws UnsupportedEncodingException {
        return new String(this.f145934b, F(), size(), str);
    }

    b(byte[] bArr) {
        this.f145934b = bArr;
    }

    boolean E(b bVar, int i10, int i11) {
        if (i11 <= bVar.size()) {
            if (i10 + i11 <= bVar.size()) {
                byte[] bArr = this.f145934b;
                byte[] bArr2 = bVar.f145934b;
                int iF = F() + i11;
                int iF2 = F();
                int iF3 = bVar.F() + i10;
                while (iF2 < iF) {
                    if (bArr[iF2] != bArr2[iF3]) {
                        return false;
                    }
                    iF2++;
                    iF3++;
                }
                return true;
            }
            int size = bVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        int size2 = size();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i11);
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean q() {
        int iF = F();
        return e.f(this.f145934b, iF, size() + iF);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream s() {
        return CodedInputStream.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int v(int i10, int i11, int i12) {
        int iF = F() + i11;
        return e.g(i10, this.f145934b, iF, i12 + iF);
    }
}

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* loaded from: classes14.dex */
class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {

    /* renamed from: d, reason: collision with root package name */
    private final int f146836d;

    /* renamed from: e, reason: collision with root package name */
    private final int f146837e;

    private class b implements ByteString.ByteIterator {

        /* renamed from: a, reason: collision with root package name */
        private int f146838a;

        /* renamed from: b, reason: collision with root package name */
        private final int f146839b;

        private b() {
            int iF = a.this.F();
            this.f146838a = iF;
            this.f146839b = iF + a.this.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte b() {
            int i10 = this.f146838a;
            if (i10 >= this.f146839b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = a.this.f146841b;
            this.f146838a = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f146838a < this.f146839b;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.b
    public byte D(int i10) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < size()) {
            return this.f146841b[this.f146836d + i10];
        }
        int size = size();
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.b
    protected int F() {
        return this.f146836d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void n(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f146841b, F() + i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* renamed from: r */
    public ByteString.ByteIterator iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.b, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f146837e;
    }

    a(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (i10 + i11 <= bArr.length) {
                    this.f146836d = i10;
                    this.f146837e = i11;
                    return;
                }
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Offset+Length too large: ");
                sb2.append(i10);
                sb2.append("+");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(29);
        sb4.append("Offset too small: ");
        sb4.append(i10);
        throw new IllegalArgumentException(sb4.toString());
    }
}

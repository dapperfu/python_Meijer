package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes13.dex */
public abstract class ByteString implements Iterable<Byte> {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteString f145819a = new b(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte b();
    }

    public static final class Output extends OutputStream {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f145820f = new byte[0];

        /* renamed from: a, reason: collision with root package name */
        private final int f145821a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<ByteString> f145822b;

        /* renamed from: c, reason: collision with root package name */
        private int f145823c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f145824d;

        /* renamed from: e, reason: collision with root package name */
        private int f145825e;

        public synchronized int d() {
            return this.f145823c + this.f145825e;
        }

        public synchronized ByteString g() {
            c();
            return ByteString.f(this.f145822b);
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f145825e == this.f145824d.length) {
                    b(1);
                }
                byte[] bArr = this.f145824d;
                int i11 = this.f145825e;
                this.f145825e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void b(int i10) {
            this.f145822b.add(new b(this.f145824d));
            int length = this.f145823c + this.f145824d.length;
            this.f145823c = length;
            this.f145824d = new byte[Math.max(this.f145821a, Math.max(i10, length >>> 1))];
            this.f145825e = 0;
        }

        private void c() {
            int i10 = this.f145825e;
            byte[] bArr = this.f145824d;
            if (i10 >= bArr.length) {
                this.f145822b.add(new b(this.f145824d));
                this.f145824d = f145820f;
            } else if (i10 > 0) {
                this.f145822b.add(new b(a(bArr, i10)));
            }
            this.f145823c += this.f145825e;
            this.f145825e = 0;
        }

        Output(int i10) {
            if (i10 >= 0) {
                this.f145821a = i10;
                this.f145822b = new ArrayList<>();
                this.f145824d = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f145824d;
                int length = bArr2.length;
                int i12 = this.f145825e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f145825e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    b(i13);
                    System.arraycopy(bArr, i10 + length2, this.f145824d, 0, i13);
                    this.f145825e = i13;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static ByteString a(Iterator<ByteString> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).e(a(it, i10 - i11));
    }

    public static ByteString h(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    abstract void C(OutputStream outputStream, int i10, int i11) throws IOException;

    protected abstract void n(byte[] bArr, int i10, int i11, int i12);

    protected abstract int o();

    protected abstract boolean p();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* renamed from: r */
    public abstract ByteIterator iterator();

    public abstract CodedInputStream s();

    public abstract int size();

    protected abstract int u(int i10, int i11, int i12);

    protected abstract int v(int i10, int i11, int i12);

    protected abstract int w();

    public abstract String y(String str) throws UnsupportedEncodingException;

    public static ByteString f(Iterable<ByteString> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? f145819a : a(arrayList.iterator(), arrayList.size());
    }

    public static ByteString k(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new b(bArr2);
    }

    public static ByteString l(String str) {
        try {
            return new b(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static Output t() {
        return new Output(128);
    }

    void B(OutputStream outputStream, int i10, int i11) throws IOException {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                C(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public void m(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                n(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public String z() {
        try {
            return y("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    ByteString() {
    }

    public ByteString e(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 < 2147483647L) {
            return c.G(this, byteString);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public byte[] x() {
        int size = size();
        if (size == 0) {
            return Internal.f145874a;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }
}

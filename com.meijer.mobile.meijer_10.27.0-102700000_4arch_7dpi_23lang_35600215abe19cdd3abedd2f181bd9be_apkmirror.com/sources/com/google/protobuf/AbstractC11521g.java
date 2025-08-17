package com.google.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11521g implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC11521g f90504b = new j(C11538y.f90759d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f90505c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<AbstractC11521g> f90506d;

    /* renamed from: a, reason: collision with root package name */
    private int f90507a = 0;

    /* renamed from: com.google.protobuf.g$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f90508a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f90509b;

        a() {
            this.f90509b = AbstractC11521g.this.size();
        }

        @Override // com.google.protobuf.AbstractC11521g.InterfaceC1297g
        public byte b() {
            int i10 = this.f90508a;
            if (i10 >= this.f90509b) {
                throw new NoSuchElementException();
            }
            this.f90508a = i10 + 1;
            return AbstractC11521g.this.m(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f90508a < this.f90509b;
        }
    }

    /* renamed from: com.google.protobuf.g$c */
    static abstract class c implements InterfaceC1297g {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }
    }

    /* renamed from: com.google.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.AbstractC11521g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.g$e */
    private static final class e extends j {

        /* renamed from: f, reason: collision with root package name */
        private final int f90511f;

        /* renamed from: g, reason: collision with root package name */
        private final int f90512g;

        @Override // com.google.protobuf.AbstractC11521g.j
        protected int F() {
            return this.f90511f;
        }

        @Override // com.google.protobuf.AbstractC11521g.j, com.google.protobuf.AbstractC11521g
        byte m(int i10) {
            return this.f90515e[this.f90511f + i10];
        }

        @Override // com.google.protobuf.AbstractC11521g.j, com.google.protobuf.AbstractC11521g
        public int size() {
            return this.f90512g;
        }

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC11521g.h(i10, i10 + i11, bArr.length);
            this.f90511f = i10;
            this.f90512g = i11;
        }

        @Override // com.google.protobuf.AbstractC11521g.j, com.google.protobuf.AbstractC11521g
        public byte e(int i10) {
            AbstractC11521g.f(i10, size());
            return this.f90515e[this.f90511f + i10];
        }
    }

    /* renamed from: com.google.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC1297g extends Iterator<Byte> {
        byte b();
    }

    /* renamed from: com.google.protobuf.g$h */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f90513a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f90514b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f90514b = bArr;
            this.f90513a = CodedOutputStream.c0(bArr);
        }

        public AbstractC11521g a() {
            this.f90513a.c();
            return new j(this.f90514b);
        }

        public CodedOutputStream b() {
            return this.f90513a;
        }
    }

    /* renamed from: com.google.protobuf.g$j */
    private static class j extends i {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f90515e;

        protected int F() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC11521g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC11521g) || size() != ((AbstractC11521g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iS = s();
            int iS2 = jVar.s();
            if (iS == 0 || iS2 == 0 || iS == iS2) {
                return E(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC11521g
        final void D(AbstractC11520f abstractC11520f) throws IOException {
            abstractC11520f.a(this.f90515e, F(), size());
        }

        @Override // com.google.protobuf.AbstractC11521g
        public byte e(int i10) {
            return this.f90515e[i10];
        }

        @Override // com.google.protobuf.AbstractC11521g
        byte m(int i10) {
            return this.f90515e[i10];
        }

        @Override // com.google.protobuf.AbstractC11521g
        public final AbstractC11522h q() {
            return AbstractC11522h.i(this.f90515e, F(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC11521g
        protected final int r(int i10, int i11, int i12) {
            return C11538y.i(i10, this.f90515e, F() + i11, i12);
        }

        @Override // com.google.protobuf.AbstractC11521g
        public int size() {
            return this.f90515e.length;
        }

        @Override // com.google.protobuf.AbstractC11521g
        protected final String x(Charset charset) {
            return new String(this.f90515e, F(), size(), charset);
        }

        j(byte[] bArr) {
            bArr.getClass();
            this.f90515e = bArr;
        }

        final boolean E(AbstractC11521g abstractC11521g, int i10, int i11) {
            if (i11 <= abstractC11521g.size()) {
                int i12 = i10 + i11;
                if (i12 <= abstractC11521g.size()) {
                    if (abstractC11521g instanceof j) {
                        j jVar = (j) abstractC11521g;
                        byte[] bArr = this.f90515e;
                        byte[] bArr2 = jVar.f90515e;
                        int iF = F() + i11;
                        int iF2 = F();
                        int iF3 = jVar.F() + i10;
                        while (iF2 < iF) {
                            if (bArr[iF2] != bArr2[iF3]) {
                                return false;
                            }
                            iF2++;
                            iF3++;
                        }
                        return true;
                    }
                    return abstractC11521g.t(i10, i12).equals(t(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC11521g.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        @Override // com.google.protobuf.AbstractC11521g
        public final boolean n() {
            int iF = F();
            return q0.n(this.f90515e, iF, size() + iF);
        }

        @Override // com.google.protobuf.AbstractC11521g
        public final AbstractC11521g t(int i10, int i11) {
            int iH = AbstractC11521g.h(i10, i11, size());
            if (iH == 0) {
                return AbstractC11521g.f90504b;
            }
            return new e(this.f90515e, F() + i10, iH);
        }
    }

    /* renamed from: com.google.protobuf.g$k */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.AbstractC11521g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int u(byte b10) {
        return b10 & 255;
    }

    abstract void D(AbstractC11520f abstractC11520f) throws IOException;

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    abstract byte m(int i10);

    public abstract boolean n();

    public abstract AbstractC11522h q();

    protected abstract int r(int i10, int i11, int i12);

    public abstract int size();

    public abstract AbstractC11521g t(int i10, int i11);

    protected abstract String x(Charset charset);

    /* renamed from: com.google.protobuf.g$b */
    class b implements Comparator<AbstractC11521g> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC11521g abstractC11521g, AbstractC11521g abstractC11521g2) {
            InterfaceC1297g it = abstractC11521g.iterator();
            InterfaceC1297g it2 = abstractC11521g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC11521g.u(it.b())).compareTo(Integer.valueOf(AbstractC11521g.u(it2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC11521g.size()).compareTo(Integer.valueOf(abstractC11521g2.size()));
        }
    }

    /* renamed from: com.google.protobuf.g$i */
    static abstract class i extends AbstractC11521g {
        i() {
        }

        @Override // com.google.protobuf.AbstractC11521g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    static {
        a aVar = null;
        f90505c = C11518d.c() ? new k(aVar) : new d(aVar);
        f90506d = new b();
    }

    static AbstractC11521g B(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC11521g C(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int h(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC11521g k(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f90505c.a(bArr, i10, i11));
    }

    public static AbstractC11521g l(String str) {
        return new j(str.getBytes(C11538y.f90757b));
    }

    static h p(int i10) {
        return new h(i10, null);
    }

    public final int hashCode() {
        int iR = this.f90507a;
        if (iR == 0) {
            int size = size();
            iR = r(size, 0, size);
            if (iR == 0) {
                iR = 1;
            }
            this.f90507a = iR;
        }
        return iR;
    }

    @Override // java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public InterfaceC1297g iterator() {
        return new a();
    }

    protected final int s() {
        return this.f90507a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), z());
    }

    public final String y() {
        return v(C11538y.f90757b);
    }

    AbstractC11521g() {
    }

    private String z() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(t(0, 47)) + "...";
    }

    public final String v(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return x(charset);
    }
}

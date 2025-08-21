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
/* loaded from: classes8.dex */
public abstract class AbstractC11646g implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC11646g f91343b = new j(C11663y.f91598d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f91344c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<AbstractC11646g> f91345d;

    /* renamed from: a, reason: collision with root package name */
    private int f91346a = 0;

    /* renamed from: com.google.protobuf.g$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f91347a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f91348b;

        a() {
            this.f91348b = AbstractC11646g.this.size();
        }

        @Override // com.google.protobuf.AbstractC11646g.InterfaceC1306g
        public byte b() {
            int i10 = this.f91347a;
            if (i10 >= this.f91348b) {
                throw new NoSuchElementException();
            }
            this.f91347a = i10 + 1;
            return AbstractC11646g.this.m(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f91347a < this.f91348b;
        }
    }

    /* renamed from: com.google.protobuf.g$c */
    static abstract class c implements InterfaceC1306g {
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

        @Override // com.google.protobuf.AbstractC11646g.f
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
        private final int f91350f;

        /* renamed from: g, reason: collision with root package name */
        private final int f91351g;

        @Override // com.google.protobuf.AbstractC11646g.j
        protected int F() {
            return this.f91350f;
        }

        @Override // com.google.protobuf.AbstractC11646g.j, com.google.protobuf.AbstractC11646g
        byte m(int i10) {
            return this.f91354e[this.f91350f + i10];
        }

        @Override // com.google.protobuf.AbstractC11646g.j, com.google.protobuf.AbstractC11646g
        public int size() {
            return this.f91351g;
        }

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC11646g.h(i10, i10 + i11, bArr.length);
            this.f91350f = i10;
            this.f91351g = i11;
        }

        @Override // com.google.protobuf.AbstractC11646g.j, com.google.protobuf.AbstractC11646g
        public byte e(int i10) {
            AbstractC11646g.f(i10, size());
            return this.f91354e[this.f91350f + i10];
        }
    }

    /* renamed from: com.google.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC1306g extends Iterator<Byte> {
        byte b();
    }

    /* renamed from: com.google.protobuf.g$h */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f91352a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f91353b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f91353b = bArr;
            this.f91352a = CodedOutputStream.c0(bArr);
        }

        public AbstractC11646g a() {
            this.f91352a.c();
            return new j(this.f91353b);
        }

        public CodedOutputStream b() {
            return this.f91352a;
        }
    }

    /* renamed from: com.google.protobuf.g$j */
    private static class j extends i {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f91354e;

        protected int F() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC11646g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC11646g) || size() != ((AbstractC11646g) obj).size()) {
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

        @Override // com.google.protobuf.AbstractC11646g
        final void D(AbstractC11645f abstractC11645f) throws IOException {
            abstractC11645f.a(this.f91354e, F(), size());
        }

        @Override // com.google.protobuf.AbstractC11646g
        public byte e(int i10) {
            return this.f91354e[i10];
        }

        @Override // com.google.protobuf.AbstractC11646g
        byte m(int i10) {
            return this.f91354e[i10];
        }

        @Override // com.google.protobuf.AbstractC11646g
        public final AbstractC11647h q() {
            return AbstractC11647h.i(this.f91354e, F(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC11646g
        protected final int r(int i10, int i11, int i12) {
            return C11663y.i(i10, this.f91354e, F() + i11, i12);
        }

        @Override // com.google.protobuf.AbstractC11646g
        public int size() {
            return this.f91354e.length;
        }

        @Override // com.google.protobuf.AbstractC11646g
        protected final String x(Charset charset) {
            return new String(this.f91354e, F(), size(), charset);
        }

        j(byte[] bArr) {
            bArr.getClass();
            this.f91354e = bArr;
        }

        final boolean E(AbstractC11646g abstractC11646g, int i10, int i11) {
            if (i11 <= abstractC11646g.size()) {
                int i12 = i10 + i11;
                if (i12 <= abstractC11646g.size()) {
                    if (abstractC11646g instanceof j) {
                        j jVar = (j) abstractC11646g;
                        byte[] bArr = this.f91354e;
                        byte[] bArr2 = jVar.f91354e;
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
                    return abstractC11646g.t(i10, i12).equals(t(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC11646g.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        @Override // com.google.protobuf.AbstractC11646g
        public final boolean n() {
            int iF = F();
            return q0.n(this.f91354e, iF, size() + iF);
        }

        @Override // com.google.protobuf.AbstractC11646g
        public final AbstractC11646g t(int i10, int i11) {
            int iH = AbstractC11646g.h(i10, i11, size());
            if (iH == 0) {
                return AbstractC11646g.f91343b;
            }
            return new e(this.f91354e, F() + i10, iH);
        }
    }

    /* renamed from: com.google.protobuf.g$k */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.AbstractC11646g.f
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

    abstract void D(AbstractC11645f abstractC11645f) throws IOException;

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    abstract byte m(int i10);

    public abstract boolean n();

    public abstract AbstractC11647h q();

    protected abstract int r(int i10, int i11, int i12);

    public abstract int size();

    public abstract AbstractC11646g t(int i10, int i11);

    protected abstract String x(Charset charset);

    /* renamed from: com.google.protobuf.g$b */
    class b implements Comparator<AbstractC11646g> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC11646g abstractC11646g, AbstractC11646g abstractC11646g2) {
            InterfaceC1306g it = abstractC11646g.iterator();
            InterfaceC1306g it2 = abstractC11646g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC11646g.u(it.b())).compareTo(Integer.valueOf(AbstractC11646g.u(it2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC11646g.size()).compareTo(Integer.valueOf(abstractC11646g2.size()));
        }
    }

    /* renamed from: com.google.protobuf.g$i */
    static abstract class i extends AbstractC11646g {
        i() {
        }

        @Override // com.google.protobuf.AbstractC11646g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    static {
        a aVar = null;
        f91344c = C11643d.c() ? new k(aVar) : new d(aVar);
        f91345d = new b();
    }

    static AbstractC11646g B(byte[] bArr) {
        return new j(bArr);
    }

    static AbstractC11646g C(byte[] bArr, int i10, int i11) {
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

    public static AbstractC11646g k(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f91344c.a(bArr, i10, i11));
    }

    public static AbstractC11646g l(String str) {
        return new j(str.getBytes(C11663y.f91596b));
    }

    static h p(int i10) {
        return new h(i10, null);
    }

    public final int hashCode() {
        int iR = this.f91346a;
        if (iR == 0) {
            int size = size();
            iR = r(size, 0, size);
            if (iR == 0) {
                iR = 1;
            }
            this.f91346a = iR;
        }
        return iR;
    }

    @Override // java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public InterfaceC1306g iterator() {
        return new a();
    }

    protected final int s() {
        return this.f91346a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), z());
    }

    public final String y() {
        return v(C11663y.f91596b);
    }

    AbstractC11646g() {
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

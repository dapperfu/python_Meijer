package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5941g implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5941g f54232b = new j(C5958y.f54484d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f54233c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<AbstractC5941g> f54234d;

    /* renamed from: a, reason: collision with root package name */
    private int f54235a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f54236a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f54237b;

        a() {
            this.f54237b = AbstractC5941g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g.InterfaceC1103g
        public byte b() {
            int i10 = this.f54236a;
            if (i10 >= this.f54237b) {
                throw new NoSuchElementException();
            }
            this.f54236a = i10 + 1;
            return AbstractC5941g.this.o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54236a < this.f54237b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements InterfaceC1103g {
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

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends j {

        /* renamed from: f, reason: collision with root package name */
        private final int f54239f;

        /* renamed from: g, reason: collision with root package name */
        private final int f54240g;

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g.j
        protected int E() {
            return this.f54239f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g.j, androidx.datastore.preferences.protobuf.AbstractC5941g
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f54243e, E() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g.j, androidx.datastore.preferences.protobuf.AbstractC5941g
        byte o(int i10) {
            return this.f54243e[this.f54239f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g.j, androidx.datastore.preferences.protobuf.AbstractC5941g
        public int size() {
            return this.f54240g;
        }

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC5941g.h(i10, i10 + i11, bArr.length);
            this.f54239f = i10;
            this.f54240g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g.j, androidx.datastore.preferences.protobuf.AbstractC5941g
        public byte e(int i10) {
            AbstractC5941g.f(i10, size());
            return this.f54243e[this.f54239f + i10];
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC1103g extends Iterator<Byte> {
        byte b();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f54241a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f54242b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f54242b = bArr;
            this.f54241a = CodedOutputStream.f0(bArr);
        }

        public AbstractC5941g a() {
            this.f54241a.c();
            return new j(this.f54242b);
        }

        public CodedOutputStream b() {
            return this.f54241a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    static abstract class i extends AbstractC5941g {
        /* synthetic */ i(a aVar) {
            this();
        }

        private i() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static class j extends i {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f54243e;

        j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f54243e = bArr;
        }

        protected int E() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC5941g) || size() != ((AbstractC5941g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iT = t();
            int iT2 = jVar.t();
            if (iT == 0 || iT2 == 0 || iT == iT2) {
                return D(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        final void C(AbstractC5940f abstractC5940f) throws IOException {
            abstractC5940f.a(this.f54243e, E(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        public byte e(int i10) {
            return this.f54243e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f54243e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        byte o(int i10) {
            return this.f54243e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        public final AbstractC5942h r() {
            return AbstractC5942h.k(this.f54243e, E(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        protected final int s(int i10, int i11, int i12) {
            return C5958y.h(i10, this.f54243e, E() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        public int size() {
            return this.f54243e.length;
        }

        final boolean D(AbstractC5941g abstractC5941g, int i10, int i11) {
            if (i11 <= abstractC5941g.size()) {
                int i12 = i10 + i11;
                if (i12 <= abstractC5941g.size()) {
                    if (abstractC5941g instanceof j) {
                        j jVar = (j) abstractC5941g;
                        byte[] bArr = this.f54243e;
                        byte[] bArr2 = jVar.f54243e;
                        int iE = E() + i11;
                        int iE2 = E();
                        int iE3 = jVar.E() + i10;
                        while (iE2 < iE) {
                            if (bArr[iE2] != bArr2[iE3]) {
                                return false;
                            }
                            iE2++;
                            iE3++;
                        }
                        return true;
                    }
                    return abstractC5941g.u(i10, i12).equals(u(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC5941g.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g
        public final AbstractC5941g u(int i10, int i11) {
            int iH = AbstractC5941g.h(i10, i11, size());
            if (iH == 0) {
                return AbstractC5941g.f54232b;
            }
            return new e(this.f54243e, E() + i10, iH);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$k */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5941g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    public static AbstractC5941g k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(byte b10) {
        return b10 & 255;
    }

    abstract void C(AbstractC5940f abstractC5940f) throws IOException;

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    protected abstract void n(byte[] bArr, int i10, int i11, int i12);

    abstract byte o(int i10);

    public abstract AbstractC5942h r();

    protected abstract int s(int i10, int i11, int i12);

    public abstract int size();

    public abstract AbstractC5941g u(int i10, int i11);

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    class b implements Comparator<AbstractC5941g> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC5941g abstractC5941g, AbstractC5941g abstractC5941g2) {
            InterfaceC1103g it = abstractC5941g.iterator();
            InterfaceC1103g it2 = abstractC5941g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC5941g.x(it.b())).compareTo(Integer.valueOf(AbstractC5941g.x(it2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC5941g.size()).compareTo(Integer.valueOf(abstractC5941g2.size()));
        }
    }

    static {
        a aVar = null;
        f54233c = C5938d.c() ? new k(aVar) : new d(aVar);
        f54234d = new b();
    }

    static AbstractC5941g B(byte[] bArr, int i10, int i11) {
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

    public static AbstractC5941g l(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f54233c.a(bArr, i10, i11));
    }

    public static AbstractC5941g m(String str) {
        return new j(str.getBytes(C5958y.f54482b));
    }

    static h q(int i10) {
        return new h(i10, null);
    }

    static AbstractC5941g z(byte[] bArr) {
        return new j(bArr);
    }

    public final int hashCode() {
        int iS = this.f54235a;
        if (iS == 0) {
            int size = size();
            iS = s(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.f54235a = iS;
        }
        return iS;
    }

    @Override // java.lang.Iterable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceC1103g iterator() {
        return new a();
    }

    protected final int t() {
        return this.f54235a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), y());
    }

    AbstractC5941g() {
    }

    private String y() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(u(0, 47)) + "...";
    }

    public final byte[] v() {
        int size = size();
        if (size == 0) {
            return C5958y.f54484d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }
}

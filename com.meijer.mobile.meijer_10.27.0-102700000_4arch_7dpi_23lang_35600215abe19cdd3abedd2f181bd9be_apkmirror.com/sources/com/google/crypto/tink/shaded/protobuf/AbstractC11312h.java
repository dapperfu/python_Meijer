package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11312h implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC11312h f88342b = new j(C11329z.f88594d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f88343c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<AbstractC11312h> f88344d;

    /* renamed from: a, reason: collision with root package name */
    private int f88345a = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f88346a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f88347b;

        a() {
            this.f88347b = AbstractC11312h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h.g
        public byte b() {
            int i10 = this.f88346a;
            if (i10 >= this.f88347b) {
                throw new NoSuchElementException();
            }
            this.f88346a = i10 + 1;
            return AbstractC11312h.this.o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88346a < this.f88347b;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    static abstract class c implements g {
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

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    private static final class e extends j {

        /* renamed from: f, reason: collision with root package name */
        private final int f88349f;

        /* renamed from: g, reason: collision with root package name */
        private final int f88350g;

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h.j
        protected int E() {
            return this.f88349f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h.j, com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f88353e, E() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h.j, com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        byte o(int i10) {
            return this.f88353e[this.f88349f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h.j, com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        public int size() {
            return this.f88350g;
        }

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC11312h.h(i10, i10 + i11, bArr.length);
            this.f88349f = i10;
            this.f88350g = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h.j, com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        public byte e(int i10) {
            AbstractC11312h.f(i10, size());
            return this.f88353e[this.f88349f + i10];
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    static final class C1280h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f88351a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f88352b;

        /* synthetic */ C1280h(int i10, a aVar) {
            this(i10);
        }

        private C1280h(int i10) {
            byte[] bArr = new byte[i10];
            this.f88352b = bArr;
            this.f88351a = CodedOutputStream.c0(bArr);
        }

        public AbstractC11312h a() {
            this.f88351a.c();
            return new j(this.f88352b);
        }

        public CodedOutputStream b() {
            return this.f88351a;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    static abstract class i extends AbstractC11312h {
        /* synthetic */ i(a aVar) {
            this();
        }

        private i() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    private static class j extends i {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f88353e;

        j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f88353e = bArr;
        }

        protected int E() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC11312h) || size() != ((AbstractC11312h) obj).size()) {
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

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        final void C(AbstractC11311g abstractC11311g) throws IOException {
            abstractC11311g.a(this.f88353e, E(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        public byte e(int i10) {
            return this.f88353e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f88353e, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        byte o(int i10) {
            return this.f88353e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        public final AbstractC11313i r() {
            return AbstractC11313i.k(this.f88353e, E(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        protected final int s(int i10, int i11, int i12) {
            return C11329z.h(i10, this.f88353e, E() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        public int size() {
            return this.f88353e.length;
        }

        final boolean D(AbstractC11312h abstractC11312h, int i10, int i11) {
            if (i11 <= abstractC11312h.size()) {
                int i12 = i10 + i11;
                if (i12 <= abstractC11312h.size()) {
                    if (abstractC11312h instanceof j) {
                        j jVar = (j) abstractC11312h;
                        byte[] bArr = this.f88353e;
                        byte[] bArr2 = jVar.f88353e;
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
                    return abstractC11312h.u(i10, i12).equals(u(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC11312h.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h
        public final AbstractC11312h u(int i10, int i11) {
            int iH = AbstractC11312h.h(i10, i11, size());
            if (iH == 0) {
                return AbstractC11312h.f88342b;
            }
            return new e(this.f88353e, E() + i10, iH);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11312h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    public static AbstractC11312h k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(byte b10) {
        return b10 & 255;
    }

    abstract void C(AbstractC11311g abstractC11311g) throws IOException;

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    protected abstract void n(byte[] bArr, int i10, int i11, int i12);

    abstract byte o(int i10);

    public abstract AbstractC11313i r();

    protected abstract int s(int i10, int i11, int i12);

    public abstract int size();

    public abstract AbstractC11312h u(int i10, int i11);

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    class b implements Comparator<AbstractC11312h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC11312h abstractC11312h, AbstractC11312h abstractC11312h2) {
            g it = abstractC11312h.iterator();
            g it2 = abstractC11312h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC11312h.x(it.b())).compareTo(Integer.valueOf(AbstractC11312h.x(it2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC11312h.size()).compareTo(Integer.valueOf(abstractC11312h2.size()));
        }
    }

    static {
        a aVar = null;
        f88343c = C11308d.c() ? new k(aVar) : new d(aVar);
        f88344d = new b();
    }

    static AbstractC11312h B(byte[] bArr, int i10, int i11) {
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

    public static AbstractC11312h l(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f88343c.a(bArr, i10, i11));
    }

    public static AbstractC11312h m(String str) {
        return new j(str.getBytes(C11329z.f88592b));
    }

    static C1280h q(int i10) {
        return new C1280h(i10, null);
    }

    static AbstractC11312h z(byte[] bArr) {
        return new j(bArr);
    }

    public final int hashCode() {
        int iS = this.f88345a;
        if (iS == 0) {
            int size = size();
            iS = s(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.f88345a = iS;
        }
        return iS;
    }

    @Override // java.lang.Iterable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    protected final int t() {
        return this.f88345a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), y());
    }

    AbstractC11312h() {
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
            return C11329z.f88594d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }
}

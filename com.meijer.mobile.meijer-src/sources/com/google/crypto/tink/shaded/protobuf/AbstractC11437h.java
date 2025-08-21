package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11437h implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC11437h f89182b = new j(C11454z.f89434d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f89183c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<AbstractC11437h> f89184d;

    /* renamed from: a, reason: collision with root package name */
    private int f89185a = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f89186a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f89187b;

        a() {
            this.f89187b = AbstractC11437h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h.g
        public byte b() {
            int i10 = this.f89186a;
            if (i10 >= this.f89187b) {
                throw new NoSuchElementException();
            }
            this.f89186a = i10 + 1;
            return AbstractC11437h.this.o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f89186a < this.f89187b;
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

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h.f
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
        private final int f89189f;

        /* renamed from: g, reason: collision with root package name */
        private final int f89190g;

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h.j
        protected int E() {
            return this.f89189f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h.j, com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f89193e, E() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h.j, com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        byte o(int i10) {
            return this.f89193e[this.f89189f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h.j, com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        public int size() {
            return this.f89190g;
        }

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC11437h.h(i10, i10 + i11, bArr.length);
            this.f89189f = i10;
            this.f89190g = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h.j, com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        public byte e(int i10) {
            AbstractC11437h.f(i10, size());
            return this.f89193e[this.f89189f + i10];
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
    static final class C1289h {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f89191a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f89192b;

        /* synthetic */ C1289h(int i10, a aVar) {
            this(i10);
        }

        private C1289h(int i10) {
            byte[] bArr = new byte[i10];
            this.f89192b = bArr;
            this.f89191a = CodedOutputStream.c0(bArr);
        }

        public AbstractC11437h a() {
            this.f89191a.c();
            return new j(this.f89192b);
        }

        public CodedOutputStream b() {
            return this.f89191a;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    static abstract class i extends AbstractC11437h {
        /* synthetic */ i(a aVar) {
            this();
        }

        private i() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    private static class j extends i {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f89193e;

        j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f89193e = bArr;
        }

        protected int E() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC11437h) || size() != ((AbstractC11437h) obj).size()) {
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

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        final void C(AbstractC11436g abstractC11436g) throws IOException {
            abstractC11436g.a(this.f89193e, E(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        public byte e(int i10) {
            return this.f89193e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f89193e, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        byte o(int i10) {
            return this.f89193e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        public final AbstractC11438i r() {
            return AbstractC11438i.k(this.f89193e, E(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        protected final int s(int i10, int i11, int i12) {
            return C11454z.h(i10, this.f89193e, E() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        public int size() {
            return this.f89193e.length;
        }

        final boolean D(AbstractC11437h abstractC11437h, int i10, int i11) {
            if (i11 <= abstractC11437h.size()) {
                int i12 = i10 + i11;
                if (i12 <= abstractC11437h.size()) {
                    if (abstractC11437h instanceof j) {
                        j jVar = (j) abstractC11437h;
                        byte[] bArr = this.f89193e;
                        byte[] bArr2 = jVar.f89193e;
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
                    return abstractC11437h.u(i10, i12).equals(u(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC11437h.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h
        public final AbstractC11437h u(int i10, int i11) {
            int iH = AbstractC11437h.h(i10, i11, size());
            if (iH == 0) {
                return AbstractC11437h.f89182b;
            }
            return new e(this.f89193e, E() + i10, iH);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11437h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    public static AbstractC11437h k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(byte b10) {
        return b10 & 255;
    }

    abstract void C(AbstractC11436g abstractC11436g) throws IOException;

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    protected abstract void n(byte[] bArr, int i10, int i11, int i12);

    abstract byte o(int i10);

    public abstract AbstractC11438i r();

    protected abstract int s(int i10, int i11, int i12);

    public abstract int size();

    public abstract AbstractC11437h u(int i10, int i11);

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    class b implements Comparator<AbstractC11437h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC11437h abstractC11437h, AbstractC11437h abstractC11437h2) {
            g it = abstractC11437h.iterator();
            g it2 = abstractC11437h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC11437h.x(it.b())).compareTo(Integer.valueOf(AbstractC11437h.x(it2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC11437h.size()).compareTo(Integer.valueOf(abstractC11437h2.size()));
        }
    }

    static {
        a aVar = null;
        f89183c = C11433d.c() ? new k(aVar) : new d(aVar);
        f89184d = new b();
    }

    static AbstractC11437h B(byte[] bArr, int i10, int i11) {
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

    public static AbstractC11437h l(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f89183c.a(bArr, i10, i11));
    }

    public static AbstractC11437h m(String str) {
        return new j(str.getBytes(C11454z.f89432b));
    }

    static C1289h q(int i10) {
        return new C1289h(i10, null);
    }

    static AbstractC11437h z(byte[] bArr) {
        return new j(bArr);
    }

    public final int hashCode() {
        int iS = this.f89185a;
        if (iS == 0) {
            int size = size();
            iS = s(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.f89185a = iS;
        }
        return iS;
    }

    @Override // java.lang.Iterable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    protected final int t() {
        return this.f89185a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), y());
    }

    AbstractC11437h() {
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
            return C11454z.f89434d;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }
}

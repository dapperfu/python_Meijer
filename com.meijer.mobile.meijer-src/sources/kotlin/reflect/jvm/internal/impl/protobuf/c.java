package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.common.api.a;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* loaded from: classes14.dex */
class c extends ByteString {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f146846h;

    /* renamed from: b, reason: collision with root package name */
    private final int f146847b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteString f146848c;

    /* renamed from: d, reason: collision with root package name */
    private final ByteString f146849d;

    /* renamed from: e, reason: collision with root package name */
    private final int f146850e;

    /* renamed from: f, reason: collision with root package name */
    private final int f146851f;

    /* renamed from: g, reason: collision with root package name */
    private int f146852g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$c, reason: collision with other inner class name */
    private static class C2276c implements Iterator<kotlin.reflect.jvm.internal.impl.protobuf.b> {

        /* renamed from: a, reason: collision with root package name */
        private final Stack<c> f146854a;

        /* renamed from: b, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.b f146855b;

        private C2276c(ByteString byteString) {
            this.f146854a = new Stack<>();
            this.f146855b = a(byteString);
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.b a(ByteString byteString) {
            while (byteString instanceof c) {
                c cVar = (c) byteString;
                this.f146854a.push(cVar);
                byteString = cVar.f146848c;
            }
            return (kotlin.reflect.jvm.internal.impl.protobuf.b) byteString;
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.b c() {
            while (!this.f146854a.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.protobuf.b bVarA = a(this.f146854a.pop().f146849d);
                if (!bVarA.isEmpty()) {
                    return bVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.protobuf.b next() {
            kotlin.reflect.jvm.internal.impl.protobuf.b bVar = this.f146855b;
            if (bVar == null) {
                throw new NoSuchElementException();
            }
            this.f146855b = c();
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f146855b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class d implements ByteString.ByteIterator {

        /* renamed from: a, reason: collision with root package name */
        private final C2276c f146856a;

        /* renamed from: b, reason: collision with root package name */
        private ByteString.ByteIterator f146857b;

        /* renamed from: c, reason: collision with root package name */
        int f146858c;

        private d() {
            C2276c c2276c = new C2276c(c.this);
            this.f146856a = c2276c;
            this.f146857b = c2276c.next().iterator();
            this.f146858c = c.this.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte b() {
            if (!this.f146857b.hasNext()) {
                this.f146857b = this.f146856a.next().iterator();
            }
            this.f146858c--;
            return this.f146857b.b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f146858c > 0;
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

    private class e extends InputStream implements InputStreamRetargetInterface {

        /* renamed from: a, reason: collision with root package name */
        private C2276c f146860a;

        /* renamed from: b, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.b f146861b;

        /* renamed from: c, reason: collision with root package name */
        private int f146862c;

        /* renamed from: d, reason: collision with root package name */
        private int f146863d;

        /* renamed from: e, reason: collision with root package name */
        private int f146864e;

        /* renamed from: f, reason: collision with root package name */
        private int f146865f;

        private int c(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (true) {
                if (i12 <= 0) {
                    break;
                }
                a();
                if (this.f146861b != null) {
                    int iMin = Math.min(this.f146862c - this.f146863d, i12);
                    if (bArr != null) {
                        this.f146861b.m(bArr, this.f146863d, i10, iMin);
                        i10 += iMin;
                    }
                    this.f146863d += iMin;
                    i12 -= iMin;
                } else if (i12 == i11) {
                    return -1;
                }
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            return c(bArr, i10, i11);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            b();
            c(null, 0, this.f146865f);
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        public e() {
            b();
        }

        private void a() {
            if (this.f146861b != null) {
                int i10 = this.f146863d;
                int i11 = this.f146862c;
                if (i10 == i11) {
                    this.f146864e += i11;
                    this.f146863d = 0;
                    if (!this.f146860a.hasNext()) {
                        this.f146861b = null;
                        this.f146862c = 0;
                    } else {
                        kotlin.reflect.jvm.internal.impl.protobuf.b next = this.f146860a.next();
                        this.f146861b = next;
                        this.f146862c = next.size();
                    }
                }
            }
        }

        private void b() {
            C2276c c2276c = new C2276c(c.this);
            this.f146860a = c2276c;
            kotlin.reflect.jvm.internal.impl.protobuf.b next = c2276c.next();
            this.f146861b = next;
            this.f146862c = next.size();
            this.f146863d = 0;
            this.f146864e = 0;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return c.this.size() - (this.f146864e + this.f146863d);
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f146865f = this.f146864e + this.f146863d;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return c(null, 0, (int) j10);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            kotlin.reflect.jvm.internal.impl.protobuf.b bVar = this.f146861b;
            if (bVar == null) {
                return -1;
            }
            int i10 = this.f146863d;
            this.f146863d = i10 + 1;
            return bVar.D(i10) & 255;
        }
    }

    public boolean equals(Object obj) {
        int iW;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f146847b != byteString.size()) {
            return false;
        }
        if (this.f146847b == 0) {
            return true;
        }
        if (this.f146852g == 0 || (iW = byteString.w()) == 0 || this.f146852g == iW) {
            return I(byteString);
        }
        return false;
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Stack<ByteString> f146853a;

        private b() {
            this.f146853a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteStringPop = this.f146853a.pop();
            while (!this.f146853a.isEmpty()) {
                byteStringPop = new c(this.f146853a.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        private void c(ByteString byteString) {
            if (byteString.p()) {
                e(byteString);
                return;
            }
            if (byteString instanceof c) {
                c cVar = (c) byteString;
                c(cVar.f146848c);
                c(cVar.f146849d);
            } else {
                String strValueOf = String.valueOf(byteString.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(c.f146846h, i10);
            if (iBinarySearch < 0) {
                return (-(iBinarySearch + 1)) - 1;
            }
            return iBinarySearch;
        }

        private void e(ByteString byteString) {
            int iD = d(byteString.size());
            int i10 = c.f146846h[iD + 1];
            if (!this.f146853a.isEmpty() && this.f146853a.peek().size() < i10) {
                int i11 = c.f146846h[iD];
                ByteString byteStringPop = this.f146853a.pop();
                while (true) {
                    if (this.f146853a.isEmpty() || this.f146853a.peek().size() >= i11) {
                        break;
                    } else {
                        byteStringPop = new c(this.f146853a.pop(), byteStringPop);
                    }
                }
                c cVar = new c(byteStringPop, byteString);
                while (!this.f146853a.isEmpty()) {
                    if (this.f146853a.peek().size() >= c.f146846h[d(cVar.size()) + 1]) {
                        break;
                    } else {
                        cVar = new c(this.f146853a.pop(), cVar);
                    }
                }
                this.f146853a.push(cVar);
                return;
            }
            this.f146853a.push(byteString);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.valueOf(a.e.API_PRIORITY_OTHER));
        f146846h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f146846h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    private c(ByteString byteString, ByteString byteString2) {
        this.f146852g = 0;
        this.f146848c = byteString;
        this.f146849d = byteString2;
        int size = byteString.size();
        this.f146850e = size;
        this.f146847b = size + byteString2.size();
        this.f146851f = Math.max(byteString.o(), byteString2.o()) + 1;
    }

    static ByteString G(ByteString byteString, ByteString byteString2) {
        c cVar = byteString instanceof c ? (c) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return H(byteString, byteString2);
        }
        if (cVar != null && cVar.f146849d.size() + byteString2.size() < 128) {
            return new c(cVar.f146848c, H(cVar.f146849d, byteString2));
        }
        if (cVar == null || cVar.f146848c.o() <= cVar.f146849d.o() || cVar.o() <= byteString2.o()) {
            return size >= f146846h[Math.max(byteString.o(), byteString2.o()) + 1] ? new c(byteString, byteString2) : new b().b(byteString, byteString2);
        }
        return new c(cVar.f146848c, new c(cVar.f146849d, byteString2));
    }

    private boolean I(ByteString byteString) {
        C2276c c2276c = new C2276c(this);
        kotlin.reflect.jvm.internal.impl.protobuf.b next = c2276c.next();
        C2276c c2276c2 = new C2276c(byteString);
        kotlin.reflect.jvm.internal.impl.protobuf.b next2 = c2276c2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next.size() - i10;
            int size2 = next2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next.E(next2, i11, iMin) : next2.E(next, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f146847b;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = c2276c.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                next2 = c2276c2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    void C(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.f146850e;
        if (i12 <= i13) {
            this.f146848c.C(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f146849d.C(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f146848c.C(outputStream, i10, i14);
            this.f146849d.C(outputStream, 0, i11 - i14);
        }
    }

    public int hashCode() {
        int iU = this.f146852g;
        if (iU == 0) {
            int i10 = this.f146847b;
            iU = u(i10, 0, i10);
            if (iU == 0) {
                iU = 1;
            }
            this.f146852g = iU;
        }
        return iU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void n(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f146850e;
        if (i13 <= i14) {
            this.f146848c.n(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f146849d.n(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f146848c.n(bArr, i10, i11, i15);
            this.f146849d.n(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int o() {
        return this.f146851f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected boolean p() {
        return this.f146847b >= f146846h[this.f146851f];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean q() {
        int iV = this.f146848c.v(0, 0, this.f146850e);
        ByteString byteString = this.f146849d;
        return byteString.v(iV, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* renamed from: r */
    public ByteString.ByteIterator iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream s() {
        return CodedInputStream.g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f146847b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int u(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f146850e;
        if (i13 <= i14) {
            return this.f146848c.u(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f146849d.u(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f146849d.u(this.f146848c.u(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int v(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f146850e;
        if (i13 <= i14) {
            return this.f146848c.v(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f146849d.v(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f146849d.v(this.f146848c.v(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int w() {
        return this.f146852g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String y(String str) throws UnsupportedEncodingException {
        return new String(x(), str);
    }

    private static kotlin.reflect.jvm.internal.impl.protobuf.b H(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.m(bArr, 0, 0, size);
        byteString2.m(bArr, 0, size, size2);
        return new kotlin.reflect.jvm.internal.impl.protobuf.b(bArr);
    }
}

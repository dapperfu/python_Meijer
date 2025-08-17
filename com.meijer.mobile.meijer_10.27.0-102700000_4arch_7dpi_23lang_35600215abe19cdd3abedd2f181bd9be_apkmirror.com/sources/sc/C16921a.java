package sc;

import java.util.Arrays;
import sc.AbstractC16926f;

/* renamed from: sc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16921a extends AbstractC16926f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<rc.i> f160389a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f160390b;

    /* renamed from: sc.a$b */
    static final class b extends AbstractC16926f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable<rc.i> f160391a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f160392b;

        @Override // sc.AbstractC16926f.a
        public AbstractC16926f a() {
            String str = "";
            if (this.f160391a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C16921a(this.f160391a, this.f160392b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // sc.AbstractC16926f.a
        public AbstractC16926f.a b(Iterable<rc.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f160391a = iterable;
            return this;
        }

        @Override // sc.AbstractC16926f.a
        public AbstractC16926f.a c(byte[] bArr) {
            this.f160392b = bArr;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16926f) {
            AbstractC16926f abstractC16926f = (AbstractC16926f) obj;
            if (this.f160389a.equals(abstractC16926f.b())) {
                if (Arrays.equals(this.f160390b, abstractC16926f instanceof C16921a ? ((C16921a) abstractC16926f).f160390b : abstractC16926f.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    private C16921a(Iterable<rc.i> iterable, byte[] bArr) {
        this.f160389a = iterable;
        this.f160390b = bArr;
    }

    @Override // sc.AbstractC16926f
    public Iterable<rc.i> b() {
        return this.f160389a;
    }

    @Override // sc.AbstractC16926f
    public byte[] c() {
        return this.f160390b;
    }

    public int hashCode() {
        return ((this.f160389a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f160390b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f160389a + ", extras=" + Arrays.toString(this.f160390b) + "}";
    }
}

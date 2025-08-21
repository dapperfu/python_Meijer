package uc;

import java.util.Arrays;
import uc.AbstractC17373f;

/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17368a extends AbstractC17373f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<tc.i> f163875a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f163876b;

    /* renamed from: uc.a$b */
    static final class b extends AbstractC17373f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable<tc.i> f163877a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f163878b;

        @Override // uc.AbstractC17373f.a
        public AbstractC17373f a() {
            String str = "";
            if (this.f163877a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C17368a(this.f163877a, this.f163878b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // uc.AbstractC17373f.a
        public AbstractC17373f.a b(Iterable<tc.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f163877a = iterable;
            return this;
        }

        @Override // uc.AbstractC17373f.a
        public AbstractC17373f.a c(byte[] bArr) {
            this.f163878b = bArr;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17373f) {
            AbstractC17373f abstractC17373f = (AbstractC17373f) obj;
            if (this.f163875a.equals(abstractC17373f.b())) {
                if (Arrays.equals(this.f163876b, abstractC17373f instanceof C17368a ? ((C17368a) abstractC17373f).f163876b : abstractC17373f.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    private C17368a(Iterable<tc.i> iterable, byte[] bArr) {
        this.f163875a = iterable;
        this.f163876b = bArr;
    }

    @Override // uc.AbstractC17373f
    public Iterable<tc.i> b() {
        return this.f163875a;
    }

    @Override // uc.AbstractC17373f
    public byte[] c() {
        return this.f163876b;
    }

    public int hashCode() {
        return ((this.f163875a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f163876b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f163875a + ", extras=" + Arrays.toString(this.f163876b) + "}";
    }
}

package oh;

import java.io.Closeable;
import java.net.URI;
import java.util.Date;

/* renamed from: oh.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC16071m extends Closeable {

    /* renamed from: oh.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f153767a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f153768b;

        /* renamed from: c, reason: collision with root package name */
        private Date f153769c;

        public Date a() {
            return this.f153769c;
        }

        public boolean b() {
            return this.f153768b;
        }

        public a(boolean z10, boolean z11, Date date) {
            this.f153767a = z10;
            this.f153768b = z11;
            this.f153769c = date;
        }
    }

    a Q(byte[] bArr, URI uri);

    a R2(byte[] bArr, int i10, URI uri);
}

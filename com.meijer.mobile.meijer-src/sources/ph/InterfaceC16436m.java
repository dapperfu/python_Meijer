package ph;

import java.io.Closeable;
import java.net.URI;
import java.util.Date;

/* renamed from: ph.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC16436m extends Closeable {

    /* renamed from: ph.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f156527a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f156528b;

        /* renamed from: c, reason: collision with root package name */
        private Date f156529c;

        public Date a() {
            return this.f156529c;
        }

        public boolean b() {
            return this.f156528b;
        }

        public a(boolean z10, boolean z11, Date date) {
            this.f156527a = z10;
            this.f156528b = z11;
            this.f156529c = date;
        }
    }

    a Q(byte[] bArr, URI uri);

    a R2(byte[] bArr, int i10, URI uri);
}

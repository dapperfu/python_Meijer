package androidx.media3.exoplayer.drm;

import a3.o;
import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import g3.InterfaceC14195b;
import i3.E1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface m {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f56121a;

        /* renamed from: b, reason: collision with root package name */
        private final String f56122b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56123c;

        public byte[] a() {
            return this.f56121a;
        }

        public String b() {
            return this.f56122b;
        }

        public a(byte[] bArr, String str, int i10) {
            this.f56121a = bArr;
            this.f56122b = str;
            this.f56123c = i10;
        }
    }

    public interface b {
        void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    public interface c {
        m a(UUID uuid);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f56124a;

        /* renamed from: b, reason: collision with root package name */
        private final String f56125b;

        public byte[] a() {
            return this.f56124a;
        }

        public String b() {
            return this.f56125b;
        }

        public d(byte[] bArr, String str) {
            this.f56124a = bArr;
            this.f56125b = str;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    byte[] c() throws MediaDrmException;

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr) throws DeniedByServerException;

    int f();

    InterfaceC14195b g(byte[] bArr) throws MediaCryptoException;

    boolean h(byte[] bArr, String str);

    void i(byte[] bArr);

    byte[] j(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void k(b bVar);

    default void l(byte[] bArr, E1 e12) {
    }

    a m(byte[] bArr, List<o.b> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    void release();
}

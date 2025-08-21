package androidx.media3.exoplayer.drm;

import a3.o;
import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import g3.InterfaceC14324b;
import i3.E1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface m {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f56345a;

        /* renamed from: b, reason: collision with root package name */
        private final String f56346b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56347c;

        public byte[] a() {
            return this.f56345a;
        }

        public String b() {
            return this.f56346b;
        }

        public a(byte[] bArr, String str, int i10) {
            this.f56345a = bArr;
            this.f56346b = str;
            this.f56347c = i10;
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
        private final byte[] f56348a;

        /* renamed from: b, reason: collision with root package name */
        private final String f56349b;

        public byte[] a() {
            return this.f56348a;
        }

        public String b() {
            return this.f56349b;
        }

        public d(byte[] bArr, String str) {
            this.f56348a = bArr;
            this.f56349b = str;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    byte[] c() throws MediaDrmException;

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr) throws DeniedByServerException;

    int f();

    InterfaceC14324b g(byte[] bArr) throws MediaCryptoException;

    boolean h(byte[] bArr, String str);

    void i(byte[] bArr);

    byte[] j(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void k(b bVar);

    default void l(byte[] bArr, E1 e12) {
    }

    a m(byte[] bArr, List<o.b> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    void release();
}

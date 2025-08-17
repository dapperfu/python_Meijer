package Qe;

import Ie.C3728b;
import Ie.E;
import Ie.InterfaceC3727a;
import Ie.i;
import Ie.m;
import Ie.p;
import Ie.q;
import Ie.s;
import Ie.v;
import Ue.A;
import Ve.k;
import android.content.Context;
import android.preference.PreferenceManager;
import com.fullstory.FS;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f29996d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final String f29997e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final s f29998a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3727a f29999b;

    /* renamed from: c, reason: collision with root package name */
    private q f30000c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f30001a = null;

        /* renamed from: b, reason: collision with root package name */
        private String f30002b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f30003c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f30004d = null;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC3727a f30005e = null;

        /* renamed from: f, reason: collision with root package name */
        private boolean f30006f = true;

        /* renamed from: g, reason: collision with root package name */
        private m f30007g = null;

        /* renamed from: h, reason: collision with root package name */
        private A f30008h = null;

        /* renamed from: i, reason: collision with root package name */
        private q f30009i;

        public synchronized a f() throws GeneralSecurityException, IOException {
            a aVar;
            try {
                if (this.f30002b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                A a10 = this.f30008h;
                if (a10 != null && this.f30007g == null) {
                    this.f30007g = m.a(E.a(a10.o()));
                }
                synchronized (a.f29996d) {
                    try {
                        byte[] bArrH = h(this.f30001a, this.f30002b, this.f30003c);
                        if (bArrH == null) {
                            if (this.f30004d != null) {
                                this.f30005e = k();
                            }
                            this.f30009i = g();
                        } else if (this.f30004d == null || !a.f()) {
                            this.f30009i = i(bArrH);
                        } else {
                            this.f30009i = j(bArrH);
                        }
                        aVar = new a(this);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return aVar;
        }

        private q g() throws GeneralSecurityException, IOException {
            m mVar = this.f30007g;
            if (mVar == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            p pVarN = p.n(mVar);
            a.g(pVarN, new e(this.f30001a, this.f30002b, this.f30003c), this.f30005e);
            return q.b(pVarN);
        }

        private static byte[] h(Context context, String str, String str2) throws IOException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        private q j(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.f30005e = new d().b(this.f30004d);
                try {
                    return q.b(v.a(C3728b.b(bArr), this.f30005e, new byte[0]));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    q qVarI = i(bArr);
                    FS.log_w(a.f29997e, "cannot use Android Keystore, it'll be disabled", e11);
                    return qVarI;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private InterfaceC3727a k() throws GeneralSecurityException {
            if (!a.f()) {
                FS.log_w(a.f29997e, "Android Keystore requires at least Android M");
                return null;
            }
            d dVar = new d();
            try {
                boolean zD = d.d(this.f30004d);
                try {
                    return dVar.b(this.f30004d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f30004d), e10);
                    }
                    FS.log_w(a.f29997e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                FS.log_w(a.f29997e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public b l(m mVar) {
            this.f30007g = mVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f30006f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f30004d = str;
            return this;
        }

        public b n(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f30001a = context;
            this.f30002b = str;
            this.f30003c = str2;
            return this;
        }

        private q i(byte[] bArr) throws GeneralSecurityException, IOException {
            return q.b(v.b(C3728b.b(bArr), i.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f() {
        return true;
    }

    public synchronized p e() throws GeneralSecurityException {
        return this.f30000c.a();
    }

    private a(b bVar) {
        this.f29998a = new e(bVar.f30001a, bVar.f30002b, bVar.f30003c);
        this.f29999b = bVar.f30005e;
        this.f30000c = bVar.f30009i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(p pVar, s sVar, InterfaceC3727a interfaceC3727a) throws GeneralSecurityException {
        try {
            if (interfaceC3727a != null) {
                v.c(pVar, sVar, interfaceC3727a, new byte[0]);
            } else {
                v.d(pVar, sVar, i.a());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}

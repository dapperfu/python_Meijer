package Se;

import Ke.C3887b;
import Ke.E;
import Ke.InterfaceC3886a;
import Ke.i;
import Ke.m;
import Ke.p;
import Ke.q;
import Ke.s;
import Ke.v;
import We.A;
import Xe.k;
import android.content.Context;
import android.preference.PreferenceManager;
import com.fullstory.FS;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f34546d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final String f34547e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final s f34548a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3886a f34549b;

    /* renamed from: c, reason: collision with root package name */
    private q f34550c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f34551a = null;

        /* renamed from: b, reason: collision with root package name */
        private String f34552b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f34553c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f34554d = null;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC3886a f34555e = null;

        /* renamed from: f, reason: collision with root package name */
        private boolean f34556f = true;

        /* renamed from: g, reason: collision with root package name */
        private m f34557g = null;

        /* renamed from: h, reason: collision with root package name */
        private A f34558h = null;

        /* renamed from: i, reason: collision with root package name */
        private q f34559i;

        public synchronized a f() throws GeneralSecurityException, IOException {
            a aVar;
            try {
                if (this.f34552b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                A a10 = this.f34558h;
                if (a10 != null && this.f34557g == null) {
                    this.f34557g = m.a(E.a(a10.o()));
                }
                synchronized (a.f34546d) {
                    try {
                        byte[] bArrH = h(this.f34551a, this.f34552b, this.f34553c);
                        if (bArrH == null) {
                            if (this.f34554d != null) {
                                this.f34555e = k();
                            }
                            this.f34559i = g();
                        } else if (this.f34554d == null || !a.f()) {
                            this.f34559i = i(bArrH);
                        } else {
                            this.f34559i = j(bArrH);
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
            m mVar = this.f34557g;
            if (mVar == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            p pVarN = p.n(mVar);
            a.g(pVarN, new e(this.f34551a, this.f34552b, this.f34553c), this.f34555e);
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
                this.f34555e = new d().b(this.f34554d);
                try {
                    return q.b(v.a(C3887b.b(bArr), this.f34555e, new byte[0]));
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
                    FS.log_w(a.f34547e, "cannot use Android Keystore, it'll be disabled", e11);
                    return qVarI;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private InterfaceC3886a k() throws GeneralSecurityException {
            if (!a.f()) {
                FS.log_w(a.f34547e, "Android Keystore requires at least Android M");
                return null;
            }
            d dVar = new d();
            try {
                boolean zD = d.d(this.f34554d);
                try {
                    return dVar.b(this.f34554d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f34554d), e10);
                    }
                    FS.log_w(a.f34547e, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                FS.log_w(a.f34547e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public b l(m mVar) {
            this.f34557g = mVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f34556f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f34554d = str;
            return this;
        }

        public b n(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f34551a = context;
            this.f34552b = str;
            this.f34553c = str2;
            return this;
        }

        private q i(byte[] bArr) throws GeneralSecurityException, IOException {
            return q.b(v.b(C3887b.b(bArr), i.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f() {
        return true;
    }

    public synchronized p e() throws GeneralSecurityException {
        return this.f34550c.a();
    }

    private a(b bVar) {
        this.f34548a = new e(bVar.f34551a, bVar.f34552b, bVar.f34553c);
        this.f34549b = bVar.f34555e;
        this.f34550c = bVar.f34559i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(p pVar, s sVar, InterfaceC3886a interfaceC3886a) throws GeneralSecurityException {
        try {
            if (interfaceC3886a != null) {
                v.c(pVar, sVar, interfaceC3886a, new byte[0]);
            } else {
                v.d(pVar, sVar, i.a());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}

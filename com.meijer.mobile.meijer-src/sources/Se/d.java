package Se;

import Ke.InterfaceC3886a;
import Ke.t;
import Xe.p;
import Xe.r;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class d implements t {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f34563b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f34564a;

    public d() throws GeneralSecurityException {
        this(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e() {
        return true;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f34565a = null;

        public a() {
            if (d.e()) {
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }
    }

    private d(a aVar) {
        this.f34564a = aVar.f34565a;
    }

    static boolean d(String str) throws GeneralSecurityException {
        synchronized (f34563b) {
            try {
                String strB = r.b("android-keystore://", str);
                if (b.e(strB)) {
                    return false;
                }
                b.a(strB);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static InterfaceC3886a f(InterfaceC3886a interfaceC3886a) throws GeneralSecurityException {
        byte[] bArrA = p.a(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrA, interfaceC3886a.b(interfaceC3886a.a(bArrA, bArr), bArr))) {
            return interfaceC3886a;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // Ke.t
    public boolean a(String str) {
        String str2 = this.f34564a;
        if (str2 == null || !str2.equals(str)) {
            return this.f34564a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // Ke.t
    public InterfaceC3886a b(String str) throws GeneralSecurityException {
        InterfaceC3886a interfaceC3886aF;
        String str2 = this.f34564a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f34564a, str));
        }
        try {
            synchronized (f34563b) {
                interfaceC3886aF = f(new c(r.b("android-keystore://", str)));
            }
            return interfaceC3886aF;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}

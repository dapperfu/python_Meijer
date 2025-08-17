package Qe;

import Ie.InterfaceC3727a;
import Ie.t;
import Ve.p;
import Ve.r;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class d implements t {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f30013b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f30014a;

    public d() throws GeneralSecurityException {
        this(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e() {
        return true;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f30015a = null;

        public a() {
            if (d.e()) {
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }
    }

    private d(a aVar) {
        this.f30014a = aVar.f30015a;
    }

    static boolean d(String str) throws GeneralSecurityException {
        synchronized (f30013b) {
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

    private static InterfaceC3727a f(InterfaceC3727a interfaceC3727a) throws GeneralSecurityException {
        byte[] bArrA = p.a(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrA, interfaceC3727a.b(interfaceC3727a.a(bArrA, bArr), bArr))) {
            return interfaceC3727a;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // Ie.t
    public boolean a(String str) {
        String str2 = this.f30014a;
        if (str2 == null || !str2.equals(str)) {
            return this.f30014a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return true;
    }

    @Override // Ie.t
    public InterfaceC3727a b(String str) throws GeneralSecurityException {
        InterfaceC3727a interfaceC3727aF;
        String str2 = this.f30014a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f30014a, str));
        }
        try {
            synchronized (f30013b) {
                interfaceC3727aF = f(new c(r.b("android-keystore://", str)));
            }
            return interfaceC3727aF;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}

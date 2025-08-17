package e2;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import j2.C14836d;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C13606a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f128064a;

    /* renamed from: e2.a$a, reason: collision with other inner class name */
    class C2017a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f128065a;

        C2017a(c cVar) {
            this.f128065a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f128065a.a(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f128065a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f128065a.c(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f128065a.d(new d(C13606a.g(b.b(authenticationResult))));
        }
    }

    /* renamed from: e2.a$b */
    static class b {
        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }

        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }
    }

    /* renamed from: e2.a$c */
    public static abstract class c {
        public abstract void a(int i10, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i10, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    /* renamed from: e2.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final e f128066a;

        public e a() {
            return this.f128066a;
        }

        public d(e eVar) {
            this.f128066a = eVar;
        }
    }

    /* renamed from: e2.a$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f128067a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f128068b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f128069c;

        public e(Signature signature) {
            this.f128067a = signature;
            this.f128068b = null;
            this.f128069c = null;
        }

        public Cipher a() {
            return this.f128068b;
        }

        public Mac b() {
            return this.f128069c;
        }

        public Signature c() {
            return this.f128067a;
        }

        public e(Cipher cipher) {
            this.f128068b = cipher;
            this.f128067a = null;
            this.f128069c = null;
        }

        public e(Mac mac) {
            this.f128069c = mac;
            this.f128068b = null;
            this.f128067a = null;
        }
    }

    public static C13606a c(Context context) {
        return new C13606a(context);
    }

    private static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new C2017a(cVar);
    }

    public void a(e eVar, int i10, CancellationSignal cancellationSignal, c cVar, Handler handler) {
        FingerprintManager fingerprintManagerD = d(this.f128064a);
        if (fingerprintManagerD != null) {
            b.a(fingerprintManagerD, i(eVar), cancellationSignal, i10, h(cVar), handler);
        }
    }

    @Deprecated
    public void b(e eVar, int i10, C14836d c14836d, c cVar, Handler handler) {
        a(eVar, i10, c14836d != null ? (CancellationSignal) c14836d.b() : null, cVar, handler);
    }

    public boolean e() {
        FingerprintManager fingerprintManagerD = d(this.f128064a);
        return fingerprintManagerD != null && b.d(fingerprintManagerD);
    }

    public boolean f() {
        FingerprintManager fingerprintManagerD = d(this.f128064a);
        return fingerprintManagerD != null && b.e(fingerprintManagerD);
    }

    private C13606a(Context context) {
        this.f128064a = context;
    }

    private static FingerprintManager d(Context context) {
        return b.c(context);
    }

    static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    private static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }
}

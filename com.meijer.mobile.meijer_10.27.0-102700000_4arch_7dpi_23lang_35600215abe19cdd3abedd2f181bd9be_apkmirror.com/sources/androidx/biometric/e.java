package androidx.biometric;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.f0;
import com.fullstory.FS;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private FragmentManager f47086a;

    public static abstract class a {
        public void a(int i10, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(b bVar) {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f47087a;

        /* renamed from: b, reason: collision with root package name */
        private final int f47088b;

        public int a() {
            return this.f47088b;
        }

        public c b() {
            return this.f47087a;
        }

        b(c cVar, int i10) {
            this.f47087a = cVar;
            this.f47088b = i10;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f47089a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f47090b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f47091c;

        /* renamed from: d, reason: collision with root package name */
        private final IdentityCredential f47092d;

        public c(Signature signature) {
            this.f47089a = signature;
            this.f47090b = null;
            this.f47091c = null;
            this.f47092d = null;
        }

        public Cipher a() {
            return this.f47090b;
        }

        public IdentityCredential b() {
            return this.f47092d;
        }

        public Mac c() {
            return this.f47091c;
        }

        public Signature d() {
            return this.f47089a;
        }

        public c(Cipher cipher) {
            this.f47089a = null;
            this.f47090b = cipher;
            this.f47091c = null;
            this.f47092d = null;
        }

        public c(Mac mac) {
            this.f47089a = null;
            this.f47090b = null;
            this.f47091c = mac;
            this.f47092d = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f47089a = null;
            this.f47090b = null;
            this.f47091c = null;
            this.f47092d = identityCredential;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f47093a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f47094b;

        /* renamed from: c, reason: collision with root package name */
        private final CharSequence f47095c;

        /* renamed from: d, reason: collision with root package name */
        private final CharSequence f47096d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f47097e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f47098f;

        /* renamed from: g, reason: collision with root package name */
        private final int f47099g;

        public int a() {
            return this.f47099g;
        }

        public CharSequence b() {
            return this.f47095c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f47096d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f47094b;
        }

        public CharSequence e() {
            return this.f47093a;
        }

        public boolean f() {
            return this.f47097e;
        }

        @Deprecated
        public boolean g() {
            return this.f47098f;
        }
    }

    private void c(d dVar, c cVar) {
        FragmentManager fragmentManager = this.f47086a;
        if (fragmentManager == null) {
            FS.log_e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.isStateSaved()) {
            FS.log_e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            e(this.f47086a).r0(dVar, cVar);
        }
    }

    private static BiometricFragment d(FragmentManager fragmentManager) {
        return (BiometricFragment) fragmentManager.findFragmentByTag("androidx.biometric.BiometricFragment");
    }

    private static f f(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            return (f) new f0(fragmentActivity).a(f.class);
        }
        return null;
    }

    private void g(FragmentManager fragmentManager, f fVar, Executor executor, a aVar) {
        this.f47086a = fragmentManager;
        if (fVar != null) {
            if (executor != null) {
                fVar.X(executor);
            }
            fVar.W(aVar);
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        c(dVar, null);
    }

    public void b(d dVar, c cVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int iA = androidx.biometric.b.a(dVar, cVar);
        if (androidx.biometric.b.e(iA)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && androidx.biometric.b.b(iA)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        c(dVar, cVar);
    }

    @SuppressLint({"LambdaLast"})
    public e(FragmentActivity fragmentActivity, Executor executor, a aVar) {
        if (fragmentActivity != null) {
            if (executor != null) {
                if (aVar != null) {
                    g(fragmentActivity.getSupportFragmentManager(), f(fragmentActivity), executor, aVar);
                    return;
                }
                throw new IllegalArgumentException("AuthenticationCallback must not be null.");
            }
            throw new IllegalArgumentException("Executor must not be null.");
        }
        throw new IllegalArgumentException("FragmentActivity must not be null.");
    }

    private static BiometricFragment e(FragmentManager fragmentManager) {
        BiometricFragment biometricFragmentD = d(fragmentManager);
        if (biometricFragmentD == null) {
            BiometricFragment biometricFragmentX0 = BiometricFragment.X0();
            fragmentManager.beginTransaction().e(biometricFragmentX0, "androidx.biometric.BiometricFragment").i();
            fragmentManager.executePendingTransactions();
            return biometricFragmentX0;
        }
        return biometricFragmentD;
    }
}

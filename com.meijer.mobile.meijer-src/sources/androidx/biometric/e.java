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
    private FragmentManager f47310a;

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
        private final c f47311a;

        /* renamed from: b, reason: collision with root package name */
        private final int f47312b;

        public int a() {
            return this.f47312b;
        }

        public c b() {
            return this.f47311a;
        }

        b(c cVar, int i10) {
            this.f47311a = cVar;
            this.f47312b = i10;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f47313a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f47314b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f47315c;

        /* renamed from: d, reason: collision with root package name */
        private final IdentityCredential f47316d;

        public c(Signature signature) {
            this.f47313a = signature;
            this.f47314b = null;
            this.f47315c = null;
            this.f47316d = null;
        }

        public Cipher a() {
            return this.f47314b;
        }

        public IdentityCredential b() {
            return this.f47316d;
        }

        public Mac c() {
            return this.f47315c;
        }

        public Signature d() {
            return this.f47313a;
        }

        public c(Cipher cipher) {
            this.f47313a = null;
            this.f47314b = cipher;
            this.f47315c = null;
            this.f47316d = null;
        }

        public c(Mac mac) {
            this.f47313a = null;
            this.f47314b = null;
            this.f47315c = mac;
            this.f47316d = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f47313a = null;
            this.f47314b = null;
            this.f47315c = null;
            this.f47316d = identityCredential;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f47317a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f47318b;

        /* renamed from: c, reason: collision with root package name */
        private final CharSequence f47319c;

        /* renamed from: d, reason: collision with root package name */
        private final CharSequence f47320d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f47321e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f47322f;

        /* renamed from: g, reason: collision with root package name */
        private final int f47323g;

        public int a() {
            return this.f47323g;
        }

        public CharSequence b() {
            return this.f47319c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f47320d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f47318b;
        }

        public CharSequence e() {
            return this.f47317a;
        }

        public boolean f() {
            return this.f47321e;
        }

        @Deprecated
        public boolean g() {
            return this.f47322f;
        }
    }

    private void c(d dVar, c cVar) {
        FragmentManager fragmentManager = this.f47310a;
        if (fragmentManager == null) {
            FS.log_e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.isStateSaved()) {
            FS.log_e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            e(this.f47310a).u0(dVar, cVar);
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
        this.f47310a = fragmentManager;
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
            BiometricFragment biometricFragmentV0 = BiometricFragment.V0();
            fragmentManager.beginTransaction().e(biometricFragmentV0, "androidx.biometric.BiometricFragment").i();
            fragmentManager.executePendingTransactions();
            return biometricFragmentV0;
        }
        return biometricFragmentD;
    }
}

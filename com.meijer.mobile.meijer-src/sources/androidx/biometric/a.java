package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import androidx.biometric.e;
import e2.C13754a;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f47299a;

    /* renamed from: b, reason: collision with root package name */
    private C13754a.c f47300b;

    /* renamed from: c, reason: collision with root package name */
    final d f47301c;

    /* renamed from: androidx.biometric.a$a, reason: collision with other inner class name */
    class C0972a extends C13754a.c {
        C0972a() {
        }

        @Override // e2.C13754a.c
        public void a(int i10, CharSequence charSequence) {
            a.this.f47301c.a(i10, charSequence);
        }

        @Override // e2.C13754a.c
        public void b() {
            a.this.f47301c.b();
        }

        @Override // e2.C13754a.c
        public void c(int i10, CharSequence charSequence) {
            a.this.f47301c.c(charSequence);
        }

        @Override // e2.C13754a.c
        public void d(C13754a.d dVar) {
            a.this.f47301c.d(new e.b(dVar != null ? h.c(dVar.a()) : null, 2));
        }
    }

    private static class b {

        /* renamed from: androidx.biometric.a$b$a, reason: collision with other inner class name */
        class C0973a extends BiometricPrompt$AuthenticationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f47303a;

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }

            C0973a(d dVar) {
                this.f47303a = dVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f47303a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f47303a.b();
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                e.c cVarB = authenticationResult != null ? h.b(authenticationResult.getCryptoObject()) : null;
                int i10 = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        iA = c.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    iA = 2;
                }
                this.f47303a.d(new e.b(cVarB, iA));
            }
        }

        static BiometricPrompt$AuthenticationCallback a(d dVar) {
            return new C0973a(dVar);
        }
    }

    private static class c {
        static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    static class d {
        void a(int i10, CharSequence charSequence) {
            throw null;
        }

        void b() {
            throw null;
        }

        void c(CharSequence charSequence) {
            throw null;
        }

        void d(e.b bVar) {
            throw null;
        }

        d() {
        }
    }

    BiometricPrompt$AuthenticationCallback a() {
        if (this.f47299a == null) {
            this.f47299a = b.a(this.f47301c);
        }
        return this.f47299a;
    }

    C13754a.c b() {
        if (this.f47300b == null) {
            this.f47300b = new C0972a();
        }
        return this.f47300b;
    }

    a(d dVar) {
        this.f47301c = dVar;
    }
}

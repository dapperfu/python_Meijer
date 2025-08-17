package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import com.fullstory.FS;
import e2.C13606a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0961d f47082a;

    /* renamed from: b, reason: collision with root package name */
    private final BiometricManager f47083b;

    /* renamed from: c, reason: collision with root package name */
    private final C13606a f47084c;

    private static class a {
        static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }

        static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }
    }

    private static class c implements InterfaceC0961d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f47085a;

        @Override // androidx.biometric.d.InterfaceC0961d
        public boolean a() {
            return k.a(this.f47085a) != null;
        }

        @Override // androidx.biometric.d.InterfaceC0961d
        public boolean b() {
            return k.b(this.f47085a);
        }

        @Override // androidx.biometric.d.InterfaceC0961d
        public boolean c() {
            return i.a(this.f47085a, Build.MODEL);
        }

        @Override // androidx.biometric.d.InterfaceC0961d
        public C13606a d() {
            return C13606a.c(this.f47085a);
        }

        @Override // androidx.biometric.d.InterfaceC0961d
        public BiometricManager e() {
            return a.b(this.f47085a);
        }

        @Override // androidx.biometric.d.InterfaceC0961d
        public boolean f() {
            return l.a(this.f47085a);
        }

        c(Context context) {
            this.f47085a = context.getApplicationContext();
        }
    }

    /* renamed from: androidx.biometric.d$d, reason: collision with other inner class name */
    interface InterfaceC0961d {
        boolean a();

        boolean b();

        boolean c();

        C13606a d();

        BiometricManager e();

        boolean f();
    }

    private static class b {
        static int a(BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    private int c() {
        C13606a c13606a = this.f47084c;
        if (c13606a == null) {
            FS.log_e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (c13606a.f()) {
            return !this.f47084c.e() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        return !this.f47082a.b() ? c() : c() == 0 ? 0 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int e() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r4 = this;
            java.lang.String r0 = "BiometricManager"
            java.lang.reflect.Method r1 = androidx.biometric.d.a.c()
            if (r1 == 0) goto L38
            androidx.biometric.e$c r2 = androidx.biometric.h.a()
            android.hardware.biometrics.BiometricPrompt$CryptoObject r2 = androidx.biometric.h.d(r2)
            if (r2 == 0) goto L38
            android.hardware.biometrics.BiometricManager r3 = r4.f47083b     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalArgumentException -> L29 java.lang.IllegalAccessException -> L2b
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalArgumentException -> L29 java.lang.IllegalAccessException -> L2b
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalArgumentException -> L29 java.lang.IllegalAccessException -> L2b
            boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalArgumentException -> L29 java.lang.IllegalAccessException -> L2b
            if (r2 == 0) goto L2d
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalArgumentException -> L29 java.lang.IllegalAccessException -> L2b
            int r0 = r1.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalArgumentException -> L29 java.lang.IllegalAccessException -> L2b
            return r0
        L27:
            r1 = move-exception
            goto L33
        L29:
            r1 = move-exception
            goto L33
        L2b:
            r1 = move-exception
            goto L33
        L2d:
            java.lang.String r1 = "Invalid return type for canAuthenticate(CryptoObject)."
            com.fullstory.FS.log_w(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalArgumentException -> L29 java.lang.IllegalAccessException -> L2b
            goto L38
        L33:
            java.lang.String r2 = "Failed to invoke canAuthenticate(CryptoObject)."
            com.fullstory.FS.log_w(r0, r2, r1)
        L38:
            int r0 = r4.f()
            androidx.biometric.d$d r1 = r4.f47082a
            boolean r1 = r1.c()
            if (r1 != 0) goto L4b
            if (r0 == 0) goto L47
            goto L4b
        L47:
            int r0 = r4.d()
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.d.e():int");
    }

    private int f() {
        BiometricManager biometricManager = this.f47083b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        FS.log_e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static d g(Context context) {
        return new d(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f47083b;
        if (biometricManager != null) {
            return b.a(biometricManager, i10);
        }
        FS.log_e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    d(InterfaceC0961d interfaceC0961d) {
        BiometricManager biometricManagerE;
        this.f47082a = interfaceC0961d;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            biometricManagerE = interfaceC0961d.e();
        } else {
            biometricManagerE = null;
        }
        this.f47083b = biometricManagerE;
        this.f47084c = i10 <= 29 ? interfaceC0961d.d() : null;
    }

    private int b(int i10) {
        if (!androidx.biometric.b.d(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f47082a.a()) {
            return 12;
        }
        if (androidx.biometric.b.b(i10)) {
            if (this.f47082a.b()) {
                return 0;
            }
            return 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            if (androidx.biometric.b.e(i10)) {
                return f();
            }
            return e();
        }
        if (i11 == 28) {
            if (!this.f47082a.f()) {
                return 12;
            }
            return d();
        }
        return c();
    }
}

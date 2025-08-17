package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.biometric.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC5989E;
import androidx.view.f0;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import e2.C13606a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class BiometricFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    Handler f47042a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    androidx.biometric.f f47043b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47044a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f47045b;

        a(int i10, CharSequence charSequence) {
            this.f47044a = i10;
            this.f47045b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f47043b.t().a(this.f47044a, this.f47045b);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f47043b.t().b();
        }
    }

    class c implements InterfaceC5989E<e.b> {
        c() {
        }

        @Override // androidx.view.InterfaceC5989E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(e.b bVar) {
            if (bVar != null) {
                BiometricFragment.this.h1(bVar);
                BiometricFragment.this.f47043b.T(null);
            }
        }
    }

    class d implements InterfaceC5989E<androidx.biometric.c> {
        d() {
        }

        @Override // androidx.view.InterfaceC5989E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(androidx.biometric.c cVar) {
            if (cVar != null) {
                BiometricFragment.this.Y0(cVar.b(), cVar.c());
                BiometricFragment.this.f47043b.Q(null);
            }
        }
    }

    class e implements InterfaceC5989E<CharSequence> {
        e() {
        }

        @Override // androidx.view.InterfaceC5989E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(CharSequence charSequence) {
            if (charSequence != null) {
                BiometricFragment.this.g1(charSequence);
                BiometricFragment.this.f47043b.Q(null);
            }
        }
    }

    class f implements InterfaceC5989E<Boolean> {
        f() {
        }

        @Override // androidx.view.InterfaceC5989E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                BiometricFragment.this.Z0();
                BiometricFragment.this.f47043b.R(false);
            }
        }
    }

    class g implements InterfaceC5989E<Boolean> {
        g() {
        }

        @Override // androidx.view.InterfaceC5989E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                if (BiometricFragment.this.L0()) {
                    BiometricFragment.this.j1();
                } else {
                    BiometricFragment.this.i1();
                }
                BiometricFragment.this.f47043b.h0(false);
            }
        }
    }

    class h implements InterfaceC5989E<Boolean> {
        h() {
        }

        @Override // androidx.view.InterfaceC5989E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                BiometricFragment.this.y0(1);
                BiometricFragment.this.dismiss();
                BiometricFragment.this.f47043b.b0(false);
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f47043b.c0(false);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f47056b;

        j(int i10, CharSequence charSequence) {
            this.f47055a = i10;
            this.f47056b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.k1(this.f47055a, this.f47056b);
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.b f47058a;

        k(e.b bVar) {
            this.f47058a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f47043b.t().c(this.f47058a);
        }
    }

    private static class m {
        static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class p implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f47060a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f47060a.post(runnable);
        }

        p() {
        }
    }

    private static class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<BiometricFragment> f47061a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47061a.get() != null) {
                this.f47061a.get().s1();
            }
        }

        q(BiometricFragment biometricFragment) {
            this.f47061a = new WeakReference<>(biometricFragment);
        }
    }

    private static class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<androidx.biometric.f> f47062a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47062a.get() != null) {
                this.f47062a.get().a0(false);
            }
        }

        r(androidx.biometric.f fVar) {
            this.f47062a = new WeakReference<>(fVar);
        }
    }

    private static class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<androidx.biometric.f> f47063a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47063a.get() != null) {
                this.f47063a.get().g0(false);
            }
        }

        s(androidx.biometric.f fVar) {
            this.f47063a = new WeakReference<>(fVar);
        }
    }

    private void F0(int i10) {
        if (i10 == -1) {
            n1(new e.b(null, 1));
        } else {
            k1(10, getString(r.g.f157748l));
        }
    }

    void y0(int i10) {
        if (i10 == 3 || !this.f47043b.N()) {
            if (O0()) {
                this.f47043b.V(i10);
                if (i10 == 1) {
                    l1(10, androidx.biometric.j.a(getContext(), 10));
                }
            }
            this.f47043b.s().a();
        }
    }

    private static class l {
        static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    private static class n {
        static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    private static class o {
        static void a(BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    private void B0() {
        this.f47043b.k0(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.findFragmentByTag("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.beginTransaction().q(fingerprintDialogFragment).i();
                }
            }
        }
    }

    private boolean K0() {
        return Build.VERSION.SDK_INT == 28 && !androidx.biometric.l.a(getContext());
    }

    private boolean O0() {
        return Build.VERSION.SDK_INT < 28 || J0() || K0();
    }

    static BiometricFragment X0() {
        return new BiometricFragment();
    }

    private void l1(int i10, CharSequence charSequence) {
        if (this.f47043b.J()) {
            FS.log_v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f47043b.H()) {
            FS.log_w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f47043b.U(false);
            this.f47043b.u().execute(new a(i10, charSequence));
        }
    }

    private void m1() {
        if (this.f47043b.H()) {
            this.f47043b.u().execute(new b());
        } else {
            FS.log_w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void o1(e.b bVar) {
        if (!this.f47043b.H()) {
            FS.log_w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.f47043b.U(false);
            this.f47043b.u().execute(new k(bVar));
        }
    }

    private void r1(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(r.g.f157738b);
        }
        this.f47043b.f0(2);
        this.f47043b.d0(charSequence);
    }

    boolean L0() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.b.b(this.f47043b.m());
    }

    void dismiss() {
        this.f47043b.k0(false);
        B0();
        if (!this.f47043b.J() && isAdded()) {
            getParentFragmentManager().beginTransaction().q(this).i();
        }
        Context context = getContext();
        if (context == null || !androidx.biometric.i.e(context, Build.MODEL)) {
            return;
        }
        this.f47043b.a0(true);
        this.f47042a.postDelayed(new r(this.f47043b), 600L);
    }

    void i1() {
        CharSequence charSequenceD = this.f47043b.D();
        if (charSequenceD == null) {
            charSequenceD = getString(r.g.f157738b);
        }
        k1(13, charSequenceD);
        y0(2);
    }

    void s0(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectD = androidx.biometric.h.d(this.f47043b.v());
        CancellationSignal cancellationSignalB = this.f47043b.s().b();
        p pVar = new p();
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackA = this.f47043b.n().a();
        try {
            if (cryptoObjectD == null) {
                m.b(biometricPrompt, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            } else {
                m.a(biometricPrompt, cryptoObjectD, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            }
        } catch (NullPointerException e10) {
            FS.log_e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
            k1(1, context != null ? context.getString(r.g.f157738b) : "");
        }
    }

    void s1() {
        if (this.f47043b.P()) {
            return;
        }
        if (getContext() == null) {
            FS.log_w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f47043b.k0(true);
        this.f47043b.U(true);
        if (O0()) {
            q1();
        } else {
            p1();
        }
    }

    void t0(C13606a c13606a, Context context) {
        try {
            c13606a.b(androidx.biometric.h.e(this.f47043b.v()), 0, this.f47043b.s().c(), this.f47043b.n().b(), null);
        } catch (NullPointerException e10) {
            FS.log_e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
            k1(1, androidx.biometric.j.a(context, 1));
        }
    }

    private void A0() {
        if (getActivity() == null) {
            return;
        }
        androidx.biometric.f fVar = (androidx.biometric.f) new f0(getActivity()).a(androidx.biometric.f.class);
        this.f47043b = fVar;
        fVar.q().i(this, new c());
        this.f47043b.o().i(this, new d());
        this.f47043b.p().i(this, new e());
        this.f47043b.G().i(this, new f());
        this.f47043b.O().i(this, new g());
        this.f47043b.L().i(this, new h());
    }

    private int E0() {
        Context context = getContext();
        if (context != null && androidx.biometric.i.f(context, Build.MODEL)) {
            return 0;
        }
        return 2000;
    }

    private boolean H0() {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            return true;
        }
        return false;
    }

    private boolean J0() {
        FragmentActivity activity = getActivity();
        if (activity != null && this.f47043b.v() != null && androidx.biometric.i.g(activity, Build.MANUFACTURER, Build.MODEL)) {
            return true;
        }
        return false;
    }

    private void T0() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            FS.log_e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = androidx.biometric.k.a(activity);
        if (keyguardManagerA == null) {
            k1(12, getString(r.g.f157747k));
            return;
        }
        CharSequence charSequenceF = this.f47043b.F();
        CharSequence charSequenceE = this.f47043b.E();
        CharSequence charSequenceW = this.f47043b.w();
        if (charSequenceE == null) {
            charSequenceE = charSequenceW;
        }
        Intent intentA = l.a(keyguardManagerA, charSequenceF, charSequenceE);
        if (intentA == null) {
            k1(14, getString(r.g.f157746j));
            return;
        }
        this.f47043b.Y(true);
        if (O0()) {
            B0();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    private void n1(e.b bVar) {
        o1(bVar);
        dismiss();
    }

    private void p1() {
        BiometricPrompt.Builder builderD = m.d(requireContext().getApplicationContext());
        CharSequence charSequenceF = this.f47043b.F();
        CharSequence charSequenceE = this.f47043b.E();
        CharSequence charSequenceW = this.f47043b.w();
        if (charSequenceF != null) {
            m.h(builderD, charSequenceF);
        }
        if (charSequenceE != null) {
            m.g(builderD, charSequenceE);
        }
        if (charSequenceW != null) {
            m.e(builderD, charSequenceW);
        }
        CharSequence charSequenceD = this.f47043b.D();
        if (!TextUtils.isEmpty(charSequenceD)) {
            m.f(builderD, charSequenceD, this.f47043b.u(), this.f47043b.C());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            n.a(builderD, this.f47043b.I());
        }
        int iM = this.f47043b.m();
        if (i10 >= 30) {
            o.a(builderD, iM);
        } else if (i10 >= 29) {
            n.b(builderD, androidx.biometric.b.b(iM));
        }
        s0(m.c(builderD), getContext());
    }

    private void q1() {
        Context applicationContext = requireContext().getApplicationContext();
        C13606a c13606aC = C13606a.c(applicationContext);
        int iZ0 = z0(c13606aC);
        if (iZ0 != 0) {
            k1(iZ0, androidx.biometric.j.a(applicationContext, iZ0));
            return;
        }
        if (isAdded()) {
            this.f47043b.c0(true);
            if (!androidx.biometric.i.f(applicationContext, Build.MODEL)) {
                this.f47042a.postDelayed(new i(), 500L);
                FingerprintDialogFragment.F0().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f47043b.V(0);
            t0(c13606aC, applicationContext);
        }
    }

    private static int z0(C13606a c13606a) {
        if (!c13606a.f()) {
            return 12;
        }
        if (!c13606a.e()) {
            return 11;
        }
        return 0;
    }

    void Y0(int i10, CharSequence charSequence) {
        if (!androidx.biometric.j.b(i10)) {
            i10 = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && androidx.biometric.j.c(i10) && context != null && androidx.biometric.k.b(context) && androidx.biometric.b.b(this.f47043b.m())) {
            T0();
            return;
        }
        if (O0()) {
            if (charSequence == null) {
                charSequence = androidx.biometric.j.a(getContext(), i10);
            }
            if (i10 == 5) {
                int iR = this.f47043b.r();
                if (iR == 0 || iR == 3) {
                    l1(i10, charSequence);
                }
                dismiss();
                return;
            }
            if (this.f47043b.M()) {
                k1(i10, charSequence);
            } else {
                r1(charSequence);
                this.f47042a.postDelayed(new j(i10, charSequence), E0());
            }
            this.f47043b.c0(true);
            return;
        }
        if (charSequence == null) {
            charSequence = getString(r.g.f157738b) + " " + i10;
        }
        k1(i10, charSequence);
    }

    void Z0() {
        if (O0()) {
            r1(getString(r.g.f157745i));
        }
        m1();
    }

    void g1(CharSequence charSequence) {
        if (O0()) {
            r1(charSequence);
        }
    }

    void h1(e.b bVar) {
        n1(bVar);
    }

    void j1() {
        T0();
    }

    void k1(int i10, CharSequence charSequence) {
        l1(i10, charSequence);
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            this.f47043b.Y(false);
            F0(i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.b.b(this.f47043b.m())) {
            this.f47043b.g0(true);
            this.f47042a.postDelayed(new s(this.f47043b), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT < 29 && !this.f47043b.J() && !H0()) {
            y0(0);
        }
    }

    void r0(e.d dVar, e.c cVar) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            FS.log_e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f47043b.j0(dVar);
        int iA = androidx.biometric.b.a(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && iA == 15 && cVar == null) {
            this.f47043b.Z(androidx.biometric.h.a());
        } else {
            this.f47043b.Z(cVar);
        }
        if (L0()) {
            this.f47043b.i0(getString(r.g.f157737a));
        } else {
            this.f47043b.i0(null);
        }
        if (L0() && androidx.biometric.d.g(activity).a(l3.f92484c) != 0) {
            this.f47043b.U(true);
            T0();
        } else if (this.f47043b.K()) {
            this.f47042a.postDelayed(new q(this), 600L);
        } else {
            s1();
        }
    }
}

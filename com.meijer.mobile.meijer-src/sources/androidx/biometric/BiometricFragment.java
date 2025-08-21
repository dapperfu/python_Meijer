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
import androidx.view.InterfaceC6131E;
import androidx.view.f0;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import e2.C13754a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class BiometricFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    Handler f47266a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    androidx.biometric.f f47267b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f47269b;

        a(int i10, CharSequence charSequence) {
            this.f47268a = i10;
            this.f47269b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f47267b.t().a(this.f47268a, this.f47269b);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f47267b.t().b();
        }
    }

    class c implements InterfaceC6131E<e.b> {
        c() {
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(e.b bVar) {
            if (bVar != null) {
                BiometricFragment.this.h1(bVar);
                BiometricFragment.this.f47267b.T(null);
            }
        }
    }

    class d implements InterfaceC6131E<androidx.biometric.c> {
        d() {
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(androidx.biometric.c cVar) {
            if (cVar != null) {
                BiometricFragment.this.Y0(cVar.b(), cVar.c());
                BiometricFragment.this.f47267b.Q(null);
            }
        }
    }

    class e implements InterfaceC6131E<CharSequence> {
        e() {
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(CharSequence charSequence) {
            if (charSequence != null) {
                BiometricFragment.this.g1(charSequence);
                BiometricFragment.this.f47267b.Q(null);
            }
        }
    }

    class f implements InterfaceC6131E<Boolean> {
        f() {
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                BiometricFragment.this.a1();
                BiometricFragment.this.f47267b.R(false);
            }
        }
    }

    class g implements InterfaceC6131E<Boolean> {
        g() {
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                if (BiometricFragment.this.M0()) {
                    BiometricFragment.this.j1();
                } else {
                    BiometricFragment.this.i1();
                }
                BiometricFragment.this.f47267b.h0(false);
            }
        }
    }

    class h implements InterfaceC6131E<Boolean> {
        h() {
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                BiometricFragment.this.x0(1);
                BiometricFragment.this.dismiss();
                BiometricFragment.this.f47267b.b0(false);
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f47267b.c0(false);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47279a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f47280b;

        j(int i10, CharSequence charSequence) {
            this.f47279a = i10;
            this.f47280b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.k1(this.f47279a, this.f47280b);
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.b f47282a;

        k(e.b bVar) {
            this.f47282a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            BiometricFragment.this.f47267b.t().c(this.f47282a);
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
        private final Handler f47284a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f47284a.post(runnable);
        }

        p() {
        }
    }

    private static class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<BiometricFragment> f47285a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47285a.get() != null) {
                this.f47285a.get().s1();
            }
        }

        q(BiometricFragment biometricFragment) {
            this.f47285a = new WeakReference<>(biometricFragment);
        }
    }

    private static class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<androidx.biometric.f> f47286a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47286a.get() != null) {
                this.f47286a.get().a0(false);
            }
        }

        r(androidx.biometric.f fVar) {
            this.f47286a = new WeakReference<>(fVar);
        }
    }

    private static class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<androidx.biometric.f> f47287a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47287a.get() != null) {
                this.f47287a.get().g0(false);
            }
        }

        s(androidx.biometric.f fVar) {
            this.f47287a = new WeakReference<>(fVar);
        }
    }

    private void H0(int i10) {
        if (i10 == -1) {
            n1(new e.b(null, 1));
        } else {
            k1(10, getString(r.g.f159134l));
        }
    }

    void x0(int i10) {
        if (i10 == 3 || !this.f47267b.N()) {
            if (N0()) {
                this.f47267b.V(i10);
                if (i10 == 1) {
                    l1(10, androidx.biometric.j.a(getContext(), 10));
                }
            }
            this.f47267b.s().a();
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

    private void E0() {
        this.f47267b.k0(false);
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

    private boolean L0() {
        return Build.VERSION.SDK_INT == 28 && !androidx.biometric.l.a(getContext());
    }

    private boolean N0() {
        return Build.VERSION.SDK_INT < 28 || K0() || L0();
    }

    static BiometricFragment V0() {
        return new BiometricFragment();
    }

    private void l1(int i10, CharSequence charSequence) {
        if (this.f47267b.J()) {
            FS.log_v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f47267b.H()) {
            FS.log_w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f47267b.U(false);
            this.f47267b.u().execute(new a(i10, charSequence));
        }
    }

    private void m1() {
        if (this.f47267b.H()) {
            this.f47267b.u().execute(new b());
        } else {
            FS.log_w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void o1(e.b bVar) {
        if (!this.f47267b.H()) {
            FS.log_w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.f47267b.U(false);
            this.f47267b.u().execute(new k(bVar));
        }
    }

    private void r1(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(r.g.f159124b);
        }
        this.f47267b.f0(2);
        this.f47267b.d0(charSequence);
    }

    boolean M0() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.b.b(this.f47267b.m());
    }

    void dismiss() {
        this.f47267b.k0(false);
        E0();
        if (!this.f47267b.J() && isAdded()) {
            getParentFragmentManager().beginTransaction().q(this).i();
        }
        Context context = getContext();
        if (context == null || !androidx.biometric.i.e(context, Build.MODEL)) {
            return;
        }
        this.f47267b.a0(true);
        this.f47266a.postDelayed(new r(this.f47267b), 600L);
    }

    void i1() {
        CharSequence charSequenceD = this.f47267b.D();
        if (charSequenceD == null) {
            charSequenceD = getString(r.g.f159124b);
        }
        k1(13, charSequenceD);
        x0(2);
    }

    void s1() {
        if (this.f47267b.P()) {
            return;
        }
        if (getContext() == null) {
            FS.log_w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f47267b.k0(true);
        this.f47267b.U(true);
        if (N0()) {
            q1();
        } else {
            p1();
        }
    }

    void v0(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectD = androidx.biometric.h.d(this.f47267b.v());
        CancellationSignal cancellationSignalB = this.f47267b.s().b();
        p pVar = new p();
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackA = this.f47267b.n().a();
        try {
            if (cryptoObjectD == null) {
                m.b(biometricPrompt, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            } else {
                m.a(biometricPrompt, cryptoObjectD, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            }
        } catch (NullPointerException e10) {
            FS.log_e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
            k1(1, context != null ? context.getString(r.g.f159124b) : "");
        }
    }

    void w0(C13754a c13754a, Context context) {
        try {
            c13754a.b(androidx.biometric.h.e(this.f47267b.v()), 0, this.f47267b.s().c(), this.f47267b.n().b(), null);
        } catch (NullPointerException e10) {
            FS.log_e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e10);
            k1(1, androidx.biometric.j.a(context, 1));
        }
    }

    private static int C0(C13754a c13754a) {
        if (!c13754a.f()) {
            return 12;
        }
        if (!c13754a.e()) {
            return 11;
        }
        return 0;
    }

    private void D0() {
        if (getActivity() == null) {
            return;
        }
        androidx.biometric.f fVar = (androidx.biometric.f) new f0(getActivity()).a(androidx.biometric.f.class);
        this.f47267b = fVar;
        fVar.q().i(this, new c());
        this.f47267b.o().i(this, new d());
        this.f47267b.p().i(this, new e());
        this.f47267b.G().i(this, new f());
        this.f47267b.O().i(this, new g());
        this.f47267b.L().i(this, new h());
    }

    private int F0() {
        Context context = getContext();
        if (context != null && androidx.biometric.i.f(context, Build.MODEL)) {
            return 0;
        }
        return 2000;
    }

    private boolean J0() {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            return true;
        }
        return false;
    }

    private boolean K0() {
        FragmentActivity activity = getActivity();
        if (activity != null && this.f47267b.v() != null && androidx.biometric.i.g(activity, Build.MANUFACTURER, Build.MODEL)) {
            return true;
        }
        return false;
    }

    private void U0() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            FS.log_e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = androidx.biometric.k.a(activity);
        if (keyguardManagerA == null) {
            k1(12, getString(r.g.f159133k));
            return;
        }
        CharSequence charSequenceF = this.f47267b.F();
        CharSequence charSequenceE = this.f47267b.E();
        CharSequence charSequenceW = this.f47267b.w();
        if (charSequenceE == null) {
            charSequenceE = charSequenceW;
        }
        Intent intentA = l.a(keyguardManagerA, charSequenceF, charSequenceE);
        if (intentA == null) {
            k1(14, getString(r.g.f159132j));
            return;
        }
        this.f47267b.Y(true);
        if (N0()) {
            E0();
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
        CharSequence charSequenceF = this.f47267b.F();
        CharSequence charSequenceE = this.f47267b.E();
        CharSequence charSequenceW = this.f47267b.w();
        if (charSequenceF != null) {
            m.h(builderD, charSequenceF);
        }
        if (charSequenceE != null) {
            m.g(builderD, charSequenceE);
        }
        if (charSequenceW != null) {
            m.e(builderD, charSequenceW);
        }
        CharSequence charSequenceD = this.f47267b.D();
        if (!TextUtils.isEmpty(charSequenceD)) {
            m.f(builderD, charSequenceD, this.f47267b.u(), this.f47267b.C());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            n.a(builderD, this.f47267b.I());
        }
        int iM = this.f47267b.m();
        if (i10 >= 30) {
            o.a(builderD, iM);
        } else if (i10 >= 29) {
            n.b(builderD, androidx.biometric.b.b(iM));
        }
        v0(m.c(builderD), getContext());
    }

    private void q1() {
        Context applicationContext = requireContext().getApplicationContext();
        C13754a c13754aC = C13754a.c(applicationContext);
        int iC0 = C0(c13754aC);
        if (iC0 != 0) {
            k1(iC0, androidx.biometric.j.a(applicationContext, iC0));
            return;
        }
        if (isAdded()) {
            this.f47267b.c0(true);
            if (!androidx.biometric.i.f(applicationContext, Build.MODEL)) {
                this.f47266a.postDelayed(new i(), 500L);
                FingerprintDialogFragment.H0().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f47267b.V(0);
            w0(c13754aC, applicationContext);
        }
    }

    void Y0(int i10, CharSequence charSequence) {
        if (!androidx.biometric.j.b(i10)) {
            i10 = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && androidx.biometric.j.c(i10) && context != null && androidx.biometric.k.b(context) && androidx.biometric.b.b(this.f47267b.m())) {
            U0();
            return;
        }
        if (N0()) {
            if (charSequence == null) {
                charSequence = androidx.biometric.j.a(getContext(), i10);
            }
            if (i10 == 5) {
                int iR = this.f47267b.r();
                if (iR == 0 || iR == 3) {
                    l1(i10, charSequence);
                }
                dismiss();
                return;
            }
            if (this.f47267b.M()) {
                k1(i10, charSequence);
            } else {
                r1(charSequence);
                this.f47266a.postDelayed(new j(i10, charSequence), F0());
            }
            this.f47267b.c0(true);
            return;
        }
        if (charSequence == null) {
            charSequence = getString(r.g.f159124b) + " " + i10;
        }
        k1(i10, charSequence);
    }

    void a1() {
        if (N0()) {
            r1(getString(r.g.f159131i));
        }
        m1();
    }

    void g1(CharSequence charSequence) {
        if (N0()) {
            r1(charSequence);
        }
    }

    void h1(e.b bVar) {
        n1(bVar);
    }

    void j1() {
        U0();
    }

    void k1(int i10, CharSequence charSequence) {
        l1(i10, charSequence);
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            this.f47267b.Y(false);
            H0(i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        D0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.b.b(this.f47267b.m())) {
            this.f47267b.g0(true);
            this.f47266a.postDelayed(new s(this.f47267b), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT < 29 && !this.f47267b.J() && !J0()) {
            x0(0);
        }
    }

    void u0(e.d dVar, e.c cVar) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            FS.log_e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f47267b.j0(dVar);
        int iA = androidx.biometric.b.a(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && iA == 15 && cVar == null) {
            this.f47267b.Z(androidx.biometric.h.a());
        } else {
            this.f47267b.Z(cVar);
        }
        if (M0()) {
            this.f47267b.i0(getString(r.g.f159123a));
        } else {
            this.f47267b.i0(null);
        }
        if (M0() && androidx.biometric.d.g(activity).a(l3.f93323c) != 0) {
            this.f47267b.U(true);
            U0();
        } else if (this.f47267b.K()) {
            this.f47266a.postDelayed(new q(this), 600L);
        } else {
            s1();
        }
    }
}

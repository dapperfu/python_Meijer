package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.maps.android.BuildConfig;
import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class M4 extends AbstractC11261f2 {

    /* renamed from: c, reason: collision with root package name */
    private volatile E4 f85952c;

    /* renamed from: d, reason: collision with root package name */
    private volatile E4 f85953d;

    /* renamed from: e, reason: collision with root package name */
    protected E4 f85954e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f85955f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.J0 f85956g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f85957h;

    /* renamed from: i, reason: collision with root package name */
    private volatile E4 f85958i;

    /* renamed from: j, reason: collision with root package name */
    private E4 f85959j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f85960k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f85961l;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E(com.google.android.gms.measurement.internal.E4 r15, com.google.android.gms.measurement.internal.E4 r16, long r17, boolean r19, android.os.Bundle r20) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r20
            r14.f()
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2a
            long r7 = r0.f85840c
            long r9 = r1.f85840c
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L2a
            java.lang.String r7 = r1.f85839b
            java.lang.String r8 = r0.f85839b
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 == 0) goto L2a
            java.lang.String r7 = r1.f85838a
            java.lang.String r8 = r0.f85838a
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 != 0) goto L2c
        L2a:
            r7 = r6
            goto L2d
        L2c:
            r7 = r5
        L2d:
            if (r19 == 0) goto L34
            com.google.android.gms.measurement.internal.E4 r8 = r14.f85954e
            if (r8 == 0) goto L34
            r5 = r6
        L34:
            if (r7 == 0) goto Lbf
            if (r4 == 0) goto L3f
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r4)
        L3d:
            r13 = r7
            goto L45
        L3f:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            goto L3d
        L45:
            com.google.android.gms.measurement.internal.z6.i0(r15, r13, r6)
            if (r1 == 0) goto L63
            java.lang.String r4 = r1.f85838a
            if (r4 == 0) goto L53
            java.lang.String r7 = "_pn"
            r13.putString(r7, r4)
        L53:
            java.lang.String r4 = r1.f85839b
            if (r4 == 0) goto L5c
            java.lang.String r7 = "_pc"
            r13.putString(r7, r4)
        L5c:
            long r7 = r1.f85840c
            java.lang.String r1 = "_pi"
            r13.putLong(r1, r7)
        L63:
            r7 = 0
            if (r5 == 0) goto L82
            com.google.android.gms.measurement.internal.X2 r1 = r14.f85708a
            com.google.android.gms.measurement.internal.N5 r1 = r1.x()
            com.google.android.gms.measurement.internal.L5 r1 = r1.f85977f
            long r9 = r1.f85943b
            long r9 = r2 - r9
            r1.f85943b = r2
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L82
            com.google.android.gms.measurement.internal.X2 r1 = r14.f85708a
            com.google.android.gms.measurement.internal.z6 r1 = r1.A()
            r1.X(r13, r9)
        L82:
            com.google.android.gms.measurement.internal.X2 r1 = r14.f85708a
            com.google.android.gms.measurement.internal.m r4 = r1.u()
            boolean r4 = r4.L()
            if (r4 != 0) goto L95
            java.lang.String r4 = "_mst"
            r9 = 1
            r13.putLong(r4, r9)
        L95:
            boolean r4 = r0.f85842e
            if (r6 == r4) goto L9c
            java.lang.String r9 = "auto"
            goto L9e
        L9c:
            java.lang.String r9 = "app"
        L9e:
            com.google.android.gms.common.util.f r1 = r1.zzaZ()
            long r10 = r1.a()
            if (r4 == 0) goto Lb3
            r19 = r7
            long r7 = r0.f85843f
            int r1 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r1 != 0) goto Lb1
            goto Lb3
        Lb1:
            r11 = r7
            goto Lb4
        Lb3:
            r11 = r10
        Lb4:
            com.google.android.gms.measurement.internal.X2 r1 = r14.f85708a
            java.lang.String r10 = "_vs"
            com.google.android.gms.measurement.internal.x4 r8 = r1.z()
            r8.s(r9, r10, r11, r13)
        Lbf:
            if (r5 == 0) goto Lc6
            com.google.android.gms.measurement.internal.E4 r1 = r14.f85954e
            r14.m(r1, r6, r2)
        Lc6:
            r14.f85954e = r0
            boolean r1 = r0.f85842e
            if (r1 == 0) goto Lce
            r14.f85959j = r0
        Lce:
            com.google.android.gms.measurement.internal.X2 r1 = r14.f85708a
            com.google.android.gms.measurement.internal.w5 r1 = r1.H()
            r1.s(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.M4.E(com.google.android.gms.measurement.internal.E4, com.google.android.gms.measurement.internal.E4, long, boolean, android.os.Bundle):void");
    }

    final /* synthetic */ void A(E4 e42, boolean z10, long j10) {
        m(e42, false, j10);
    }

    final /* synthetic */ E4 B() {
        return this.f85959j;
    }

    final /* synthetic */ void C(E4 e42) {
        this.f85959j = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11261f2
    protected final boolean k() {
        return false;
    }

    public final E4 s() {
        return this.f85952c;
    }

    final /* synthetic */ void z(E4 e42, E4 e43, long j10, boolean z10, Bundle bundle) {
        E(e42, e43, j10, z10, null);
    }

    private final void D(String str, E4 e42, boolean z10) throws IllegalStateException {
        E4 e43;
        E4 e44 = this.f85952c == null ? this.f85953d : this.f85952c;
        if (e42.f85839b == null) {
            e43 = new E4(e42.f85838a, str != null ? p(str, "Activity") : null, e42.f85840c, e42.f85842e, e42.f85843f);
        } else {
            e43 = e42;
        }
        this.f85953d = this.f85952c;
        this.f85952c = e43;
        X2 x22 = this.f85708a;
        x22.b().r(new G4(this, e43, e44, x22.zzaZ().c(), z10));
    }

    private final void m(E4 e42, boolean z10, long j10) {
        X2 x22 = this.f85708a;
        x22.K().i(x22.zzaZ().c());
        if (!x22.x().f85977f.d(e42 != null && e42.f85841d, z10, j10) || e42 == null) {
            return;
        }
        e42.f85841d = false;
    }

    final String p(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        X2 x22 = this.f85708a;
        return str3.length() > x22.u().v(null, false) ? str3.substring(0, x22.u().v(null, false)) : str3;
    }

    public final void q(Bundle bundle, long j10) throws IllegalStateException {
        synchronized (this.f85961l) {
            try {
                if (!this.f85960k) {
                    this.f85708a.a().r().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f85708a.u().v(null, false))) {
                    this.f85708a.a().r().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f85708a.u().v(null, false))) {
                    this.f85708a.a().r().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.J0 j02 = this.f85956g;
                    string2 = j02 != null ? p(j02.f82642b, "Activity") : "Activity";
                }
                E4 e42 = this.f85952c;
                if (this.f85957h && e42 != null) {
                    this.f85957h = false;
                    boolean zEquals = Objects.equals(e42.f85839b, string2);
                    boolean zEquals2 = Objects.equals(e42.f85838a, string);
                    if (zEquals && zEquals2) {
                        this.f85708a.a().r().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                X2 x22 = this.f85708a;
                x22.a().u().c("Logging screen view with name, class", string == null ? BuildConfig.TRAVIS : string, string2 == null ? BuildConfig.TRAVIS : string2);
                E4 e43 = this.f85952c == null ? this.f85953d : this.f85952c;
                E4 e44 = new E4(string, string2, x22.A().n0(), true, j10);
                this.f85952c = e44;
                this.f85953d = e43;
                this.f85958i = e44;
                x22.b().r(new F4(this, bundle, e44, e43, x22.zzaZ().c()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public final void r(com.google.android.gms.internal.measurement.J0 j02, String str, String str2) throws IllegalStateException {
        X2 x22 = this.f85708a;
        if (!x22.u().L()) {
            x22.a().r().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        E4 e42 = this.f85952c;
        if (e42 == null) {
            x22.a().r().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f85955f;
        Integer numValueOf = Integer.valueOf(j02.f82641a);
        if (map.get(numValueOf) == null) {
            x22.a().r().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = p(j02.f82642b, "Activity");
        }
        String str3 = e42.f85839b;
        String str4 = e42.f85838a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            x22.a().r().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > x22.u().v(null, false))) {
            x22.a().r().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > x22.u().v(null, false))) {
            x22.a().r().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        x22.a().u().c("Setting current screen to name, class", str == null ? BuildConfig.TRAVIS : str, str2);
        E4 e43 = new E4(str, str2, x22.A().n0());
        map.put(numValueOf, e43);
        D(j02.f82642b, e43, true);
    }

    public final void t(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        Bundle bundle2;
        if (!this.f85708a.u().L() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f85955f.put(Integer.valueOf(j02.f82641a), new E4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(PreferencesHelper.PREF_ID)));
    }

    public final void u(com.google.android.gms.internal.measurement.J0 j02) throws IllegalStateException {
        Object obj = this.f85961l;
        synchronized (obj) {
            this.f85960k = true;
            if (!Objects.equals(j02, this.f85956g)) {
                synchronized (obj) {
                    this.f85956g = j02;
                    this.f85957h = false;
                    X2 x22 = this.f85708a;
                    if (x22.u().L()) {
                        this.f85958i = null;
                        x22.b().r(new L4(this));
                    }
                }
            }
        }
        X2 x23 = this.f85708a;
        if (!x23.u().L()) {
            this.f85952c = this.f85958i;
            x23.b().r(new H4(this));
            return;
        }
        D(j02.f82642b, n(j02), false);
        C0 c0K = this.f85708a.K();
        X2 x24 = c0K.f85708a;
        x24.b().r(new RunnableC11227b0(c0K, x24.zzaZ().c()));
    }

    public final void v(com.google.android.gms.internal.measurement.J0 j02) throws IllegalStateException {
        synchronized (this.f85961l) {
            this.f85960k = false;
            this.f85957h = true;
        }
        X2 x22 = this.f85708a;
        long jC = x22.zzaZ().c();
        if (!x22.u().L()) {
            this.f85952c = null;
            x22.b().r(new I4(this, jC));
        } else {
            E4 e4N = n(j02);
            this.f85953d = this.f85952c;
            this.f85952c = null;
            x22.b().r(new J4(this, e4N, jC));
        }
    }

    public final void w(com.google.android.gms.internal.measurement.J0 j02, Bundle bundle) {
        E4 e42;
        if (!this.f85708a.u().L() || bundle == null || (e42 = (E4) this.f85955f.get(Integer.valueOf(j02.f82641a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(PreferencesHelper.PREF_ID, e42.f85840c);
        bundle2.putString("name", e42.f85838a);
        bundle2.putString("referrer_name", e42.f85839b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void x(com.google.android.gms.internal.measurement.J0 j02) {
        synchronized (this.f85961l) {
            try {
                if (Objects.equals(this.f85956g, j02)) {
                    this.f85956g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f85708a.u().L()) {
            this.f85955f.remove(Integer.valueOf(j02.f82641a));
        }
    }

    final /* synthetic */ void y(Bundle bundle, E4 e42, E4 e43, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        E(e42, e43, j10, true, this.f85708a.A().r(null, "screen_view", bundle, null, false));
    }

    public M4(X2 x22) {
        super(x22);
        this.f85961l = new Object();
        this.f85955f = new ConcurrentHashMap();
    }

    private final E4 n(com.google.android.gms.internal.measurement.J0 j02) {
        com.google.android.gms.common.internal.r.l(j02);
        Integer numValueOf = Integer.valueOf(j02.f82641a);
        Map map = this.f85955f;
        E4 e42 = (E4) map.get(numValueOf);
        if (e42 == null) {
            E4 e43 = new E4(null, p(j02.f82642b, "Activity"), this.f85708a.A().n0());
            map.put(numValueOf, e43);
            e42 = e43;
        }
        if (this.f85958i != null) {
            return this.f85958i;
        }
        return e42;
    }

    public final E4 o(boolean z10) {
        h();
        f();
        if (!z10) {
            return this.f85954e;
        }
        E4 e42 = this.f85954e;
        if (e42 != null) {
            return e42;
        }
        return this.f85959j;
    }
}

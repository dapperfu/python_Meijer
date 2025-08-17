package com.google.android.gms.measurement.internal;

import Ce.M;
import Z.C5503a;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.C10497p7;
import com.google.android.gms.internal.measurement.EnumC10476n4;
import com.google.android.gms.internal.measurement.EnumC10485o4;
import com.medallia.digital.mobilesdk.l8;
import com.scandit.datacapture.core.source.CameraSettings;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import n4.AbstractC15776a;

/* renamed from: com.google.android.gms.measurement.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11268x4 extends AbstractC11136f2 {

    /* renamed from: c, reason: collision with root package name */
    protected C11185l4 f86006c;

    /* renamed from: d, reason: collision with root package name */
    private Od.z f86007d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f86008e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f86009f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f86010g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f86011h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f86012i;

    /* renamed from: j, reason: collision with root package name */
    private int f86013j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC11263x f86014k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC11263x f86015l;

    /* renamed from: m, reason: collision with root package name */
    private PriorityQueue f86016m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f86017n;

    /* renamed from: o, reason: collision with root package name */
    private E3 f86018o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicLong f86019p;

    /* renamed from: q, reason: collision with root package name */
    private long f86020q;

    /* renamed from: r, reason: collision with root package name */
    final H6 f86021r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f86022s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC11263x f86023t;

    /* renamed from: u, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f86024u;

    /* renamed from: v, reason: collision with root package name */
    private AbstractC11263x f86025v;

    /* renamed from: w, reason: collision with root package name */
    private final y6 f86026w;

    final /* synthetic */ void U(Boolean bool, boolean z10) throws IllegalStateException {
        d0(bool, true);
    }

    final /* synthetic */ void X(boolean z10) {
        this.f86012i = false;
    }

    final /* synthetic */ int Y() {
        return this.f86013j;
    }

    final /* synthetic */ void Z(int i10) {
        this.f86013j = i10;
    }

    final /* synthetic */ AbstractC11263x a0() {
        return this.f86023t;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11136f2
    protected final boolean k() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    protected final void t(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z13;
        boolean z14;
        X2 x22;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        com.google.android.gms.common.internal.r.f(str5);
        com.google.android.gms.common.internal.r.l(bundle);
        f();
        h();
        X2 x23 = this.f84868a;
        if (!x23.e()) {
            this.f84868a.a().t().a("Event not sent since app measurement is disabled");
            return;
        }
        List listU = this.f84868a.J().u();
        if (listU != null && !listU.contains(str2)) {
            this.f84868a.a().t().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f86009f) {
            this.f86009f = true;
            try {
                try {
                    (!x23.E() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f84868a.zzaY().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f84868a.zzaY());
                } catch (Exception e10) {
                    this.f84868a.a().p().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f84868a.a().s().a("Tag Manager is not found and thus will not be used");
            }
        }
        X2 x24 = this.f84868a;
        if (!x24.u().F(null, C11120d2.f85470g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            x24.c();
            z(CameraSettings.FOCUS_STRATEGY_AUTO, "_lgclid", bundle.getString("gclid"), x24.zzaZ().a());
        }
        C11268x4 c11268x4 = this;
        x24.c();
        if (z10 && z6.S(str2)) {
            x24.A().u(bundle, x24.v().f84994z.a());
        }
        if (!z12) {
            x24.c();
            if (!"_iap".equals(str2)) {
                X2 x25 = c11268x4.f84868a;
                z6 z6VarA = x25.A();
                int i10 = 2;
                if (z6VarA.r0("event", str2)) {
                    if (z6VarA.t0("event", Od.w.f23586a, Od.w.f23587b, str2)) {
                        z6VarA.f84868a.u();
                        if (z6VarA.u0("event", 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                }
                if (i10 != 0) {
                    x24.a().o().b("Invalid public event name. Event will not be logged (FE)", x24.B().a(str2));
                    z6 z6VarA2 = x25.A();
                    x25.u();
                    x25.A().z(c11268x4.f86026w, null, i10, "_ev", z6VarA2.o(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        x24.c();
        X2 x26 = c11268x4.f84868a;
        E4 e4O = x26.G().o(false);
        if (e4O != null && !bundle.containsKey("_sc")) {
            e4O.f85001d = true;
        }
        z6.i0(e4O, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str5);
        boolean zL = z6.L(str2);
        if (!z10 || c11268x4.f86007d == null || zL) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                x24.a().t().c("Passing event to registered event handler (FE)", x24.B().a(str2), x24.B().e(bundle));
                com.google.android.gms.common.internal.r.l(c11268x4.f86007d);
                c11268x4.f86007d.a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        X2 x27 = c11268x4.f84868a;
        if (x27.k()) {
            int iV0 = x24.A().v0(str2);
            if (iV0 != 0) {
                x24.a().o().b("Invalid event name. Event will not be logged (FE)", x24.B().a(str2));
                z6 z6VarA3 = x24.A();
                x24.u();
                x27.A().z(c11268x4.f86026w, str3, iV0, "_ev", z6VarA3.o(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleR = x24.A().r(str3, str2, bundle, com.google.android.gms.common.util.g.b("_o", "_sn", "_sc", "_si"), z12);
            com.google.android.gms.common.internal.r.l(bundleR);
            x24.c();
            if (x26.G().o(false) == null || !"_ae".equals(str2)) {
                z14 = 0;
                x22 = x26;
                j11 = 0;
            } else {
                L5 l52 = x26.x().f85137f;
                j11 = 0;
                long jC = l52.f85105d.f84868a.zzaZ().c();
                boolean z15 = false;
                x22 = x26;
                long j14 = jC - l52.f85103b;
                l52.f85103b = jC;
                z14 = z15;
                if (j14 > 0) {
                    x24.A().X(bundleR, j14);
                    z14 = z15;
                }
            }
            if (!CameraSettings.FOCUS_STRATEGY_AUTO.equals(str5) && "_ssr".equals(str2)) {
                z6 z6VarA4 = x24.A();
                String string = bundleR.getString("_ffr");
                if (com.google.android.gms.common.util.r.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                X2 x28 = z6VarA4.f84868a;
                if (Objects.equals(string, x28.v().f84991w.a())) {
                    x28.a().t().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                x28.v().f84991w.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = x24.A().f84868a.v().f84991w.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleR.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleR);
            boolean zN = x24.u().F(null, C11120d2.f85441V0) ? x22.x().n() : x24.v().f84988t.a();
            if (x24.v().f84985q.a() > j11 && x24.v().y(j10) && zN) {
                x24.a().u().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                z(CameraSettings.FOCUS_STRATEGY_AUTO, "_sid", null, x24.zzaZ().a());
                z(CameraSettings.FOCUS_STRATEGY_AUTO, "_sno", null, x24.zzaZ().a());
                z(CameraSettings.FOCUS_STRATEGY_AUTO, "_se", null, x24.zzaZ().a());
                c11268x4 = this;
                x24.v().f84986r.b(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (bundleR.getLong("extend_session", j12) == 1) {
                x24.a().u().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                x27.x().f85136e.b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(bundleR.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i11 = z14; i11 < size; i11++) {
                String str6 = (String) arrayList2.get(i11);
                if (str6 != null) {
                    x24.A();
                    Object obj = bundleR.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[z14] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleR.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i12 = z14;
            while (i12 < arrayList.size()) {
                Bundle bundleO = (Bundle) arrayList.get(i12);
                String str7 = i12 != 0 ? "_ep" : str2;
                bundleO.putString("_o", str5);
                if (z11) {
                    bundleO = x24.A().O(bundleO, null);
                }
                Bundle bundle2 = bundleO;
                x22.H().a0(new G(str7, new E(bundle2), str5, j13), str3);
                if (!z13) {
                    Iterator it = c11268x4.f86008e.iterator();
                    while (it.hasNext()) {
                        ((Od.A) it.next()).a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i12++;
                str5 = str;
                j13 = j10;
            }
            x24.c();
            if (x22.G().o(z14) == null || !str4.equals(str2)) {
                return;
            }
            x22.x().f85137f.d(true, true, x24.zzaZ().c());
        }
    }

    final boolean t0() {
        return this.f86017n;
    }

    private final Od.F c0(final X5 x52) throws IllegalStateException, MalformedURLException {
        try {
            URL url = new URI(x52.f85308c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strQ = this.f84868a.J().q();
            X2 x22 = this.f84868a;
            C11204o2 c11204o2U = x22.a().u();
            Long lValueOf = Long.valueOf(x52.f85306a);
            c11204o2U.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, x52.f85308c, Integer.valueOf(x52.f85307b.length));
            if (!TextUtils.isEmpty(x52.f85312g)) {
                x22.a().u().c("[sgtm] Uploading data from app. row_id", lValueOf, x52.f85312g);
            }
            HashMap map = new HashMap();
            Bundle bundle = x52.f85309d;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            B4 b4D = x22.D();
            byte[] bArr = x52.f85307b;
            InterfaceC11275y4 interfaceC11275y4 = new InterfaceC11275y4() { // from class: com.google.android.gms.measurement.internal.m4
                /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.InterfaceC11275y4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) throws java.lang.IllegalStateException {
                    /*
                        r6 = this;
                        com.google.android.gms.measurement.internal.x4 r7 = r6.f85689a
                        r7.f()
                        com.google.android.gms.measurement.internal.X5 r10 = r3
                        r11 = 200(0xc8, float:2.8E-43)
                        if (r8 == r11) goto L14
                        r11 = 204(0xcc, float:2.86E-43)
                        if (r8 == r11) goto L14
                        r11 = 304(0x130, float:4.26E-43)
                        if (r8 != r11) goto L2e
                        r8 = r11
                    L14:
                        if (r9 != 0) goto L2e
                        com.google.android.gms.measurement.internal.X2 r8 = r7.f84868a
                        com.google.android.gms.measurement.internal.q2 r8 = r8.a()
                        com.google.android.gms.measurement.internal.o2 r8 = r8.u()
                        long r0 = r10.f85306a
                        java.lang.Long r9 = java.lang.Long.valueOf(r0)
                        java.lang.String r11 = "[sgtm] Upload succeeded for row_id"
                        r8.b(r11, r9)
                        Od.F r8 = Od.F.SUCCESS
                        goto L69
                    L2e:
                        com.google.android.gms.measurement.internal.X2 r11 = r7.f84868a
                        com.google.android.gms.measurement.internal.q2 r11 = r11.a()
                        com.google.android.gms.measurement.internal.o2 r11 = r11.p()
                        long r0 = r10.f85306a
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r11.d(r2, r0, r1, r9)
                        com.google.android.gms.measurement.internal.c2 r9 = com.google.android.gms.measurement.internal.C11120d2.f85502u
                        r11 = 0
                        java.lang.Object r9 = r9.b(r11)
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.String r11 = ","
                        java.lang.String[] r9 = r9.split(r11)
                        java.util.List r9 = java.util.Arrays.asList(r9)
                        java.lang.String r8 = java.lang.String.valueOf(r8)
                        boolean r8 = r9.contains(r8)
                        if (r8 == 0) goto L67
                        Od.F r8 = Od.F.BACKOFF
                        goto L69
                    L67:
                        Od.F r8 = Od.F.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r9 = r2
                        com.google.android.gms.measurement.internal.X2 r11 = r7.f84868a
                        com.google.android.gms.measurement.internal.w5 r11 = r11.H()
                        com.google.android.gms.measurement.internal.g r0 = new com.google.android.gms.measurement.internal.g
                        long r1 = r10.f85306a
                        int r3 = r8.zza()
                        long r4 = r10.f85311f
                        r0.<init>(r1, r3, r4)
                        r11.i0(r0)
                        com.google.android.gms.measurement.internal.X2 r7 = r7.f84868a
                        com.google.android.gms.measurement.internal.q2 r7 = r7.a()
                        com.google.android.gms.measurement.internal.o2 r7 = r7.u()
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)
                        java.lang.String r11 = "[sgtm] Updated status for row_id"
                        r7.c(r11, r10, r8)
                        monitor-enter(r9)
                        r9.set(r8)     // Catch: java.lang.Throwable -> L9d
                        r9.notifyAll()     // Catch: java.lang.Throwable -> L9d
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        return
                    L9d:
                        r0 = move-exception
                        r7 = r0
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11192m4.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            b4D.j();
            com.google.android.gms.common.internal.r.l(url);
            com.google.android.gms.common.internal.r.l(bArr);
            com.google.android.gms.common.internal.r.l(interfaceC11275y4);
            b4D.f84868a.b().u(new A4(b4D, strQ, url, bArr, map, interfaceC11275y4));
            try {
                X2 x23 = x22.A().f84868a;
                long jA = x23.zzaZ().a();
                long j10 = jA + l8.b.f92525b;
                synchronized (atomicReference) {
                    for (long jA2 = l8.b.f92525b; atomicReference.get() == null && jA2 > 0; jA2 = j10 - x23.zzaZ().a()) {
                        try {
                            atomicReference.wait(jA2);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f84868a.a().p().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? Od.F.UNKNOWN : (Od.F) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f84868a.a().m().d("[sgtm] Bad upload url for row_id", x52.f85308c, Long.valueOf(x52.f85306a), e10);
            return Od.F.FAILURE;
        }
    }

    public final Map A(String str, String str2, boolean z10) {
        X2 x22 = this.f84868a;
        if (x22.b().n()) {
            x22.a().m().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        x22.c();
        if (C11133f.a()) {
            x22.a().m().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f84868a.b().s(atomicReference, 5000L, "get user properties", new Z3(this, atomicReference, null, str, str2, z10));
        List<v6> list = (List) atomicReference.get();
        if (list == null) {
            x22.a().m().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        C5503a c5503a = new C5503a(list.size());
        for (v6 v6Var : list) {
            Object objB = v6Var.B();
            if (objB != null) {
                c5503a.put(v6Var.f85926b, objB);
            }
        }
        return c5503a;
    }

    public final String B() {
        return (String) this.f86010g.get();
    }

    final void C(String str) {
        this.f86010g.set(str);
    }

    public final void E(long j10) throws IllegalStateException {
        this.f86010g.set(null);
        this.f84868a.b().r(new V3(this, j10));
    }

    public final void K(Bundle bundle) throws IllegalStateException {
        L(bundle, this.f84868a.zzaZ().a());
    }

    public final void M(String str, String str2, Bundle bundle) throws IllegalStateException {
        X2 x22 = this.f84868a;
        long jA = x22.zzaZ().a();
        com.google.android.gms.common.internal.r.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        x22.b().r(new X3(this, bundle2));
    }

    public final ArrayList N(String str, String str2) {
        X2 x22 = this.f84868a;
        if (x22.b().n()) {
            x22.a().m().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        x22.c();
        if (C11133f.a()) {
            x22.a().m().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f84868a.b().s(atomicReference, 5000L, "get conditional user properties", new Y3(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return z6.f0(list);
        }
        x22.a().m().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String O() {
        E4 e4S = this.f84868a.G().s();
        if (e4S != null) {
            return e4S.f84998a;
        }
        return null;
    }

    public final String P() {
        E4 e4S = this.f84868a.G().s();
        if (e4S != null) {
            return e4S.f84999b;
        }
        return null;
    }

    public final String Q() {
        try {
            return Od.H.a(this.f84868a.zzaY(), "google_app_id", this.f84868a.F());
        } catch (IllegalStateException e10) {
            this.f84868a.a().m().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    final /* synthetic */ void R(SharedPreferences sharedPreferences, String str) {
        X2 x22 = this.f84868a;
        if (!x22.u().F(null, C11120d2.f85452a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                x22.a().u().a("IABTCF_TCString change picked up in listener.");
                ((AbstractC11263x) com.google.android.gms.common.internal.r.l(this.f86025v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            x22.a().u().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC11263x) com.google.android.gms.common.internal.r.l(this.f86025v)).b(500L);
        }
    }

    final /* synthetic */ void T(int i10) {
        if (this.f86014k == null) {
            this.f86014k = new L3(this, this.f84868a);
        }
        this.f86014k.b(i10 * 1000);
    }

    public final void f0() {
        X2 x22 = this.f84868a;
        if (!(x22.zzaY().getApplicationContext() instanceof Application) || this.f86006c == null) {
            return;
        }
        ((Application) x22.zzaY().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f86006c);
    }

    public final Boolean g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f84868a.b().s(atomicReference, 15000L, "boolean test flag value", new T3(this, atomicReference));
    }

    public final String h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f84868a.b().s(atomicReference, 15000L, "String test flag value", new RunnableC11114c4(this, atomicReference));
    }

    public final Long i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f84868a.b().s(atomicReference, 15000L, "long test flag value", new RunnableC11122d4(this, atomicReference));
    }

    public final Integer j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f84868a.b().s(atomicReference, 15000L, "int test flag value", new RunnableC11130e4(this, atomicReference));
    }

    public final Double k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f84868a.b().s(atomicReference, 15000L, "double test flag value", new RunnableC11138f4(this, atomicReference));
    }

    public final void n(String str, String str2, Bundle bundle) throws IllegalStateException {
        o(str, str2, bundle, true, true, this.f84868a.zzaZ().a());
    }

    final void n0(C11270y c11270y, boolean z10) {
        RunnableC11154h4 runnableC11154h4 = new RunnableC11154h4(this, c11270y);
        if (!z10) {
            this.f84868a.b().r(runnableC11154h4);
        } else {
            f();
            runnableC11154h4.run();
        }
    }

    public final void o(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws IllegalStateException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f84868a.G().q(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f86007d != null && !z6.L(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = "app";
        }
        v(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        X2 x22;
        O5 o52;
        O5 o53;
        EnumC10485o4 enumC10485o4;
        f();
        X2 x23 = this.f84868a;
        x23.a().t().a("Handle tcf update.");
        SharedPreferences sharedPreferencesO = x23.v().o();
        HashMap map = new HashMap();
        C11112c2 c11112c2 = C11120d2.f85452a1;
        if (((Boolean) c11112c2.b(null)).booleanValue()) {
            Ce.L l10 = Q5.f85184a;
            EnumC10476n4 enumC10476n4 = EnumC10476n4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            P5 p52 = P5.CONSENT;
            Map.Entry entryA = Od.D.a(enumC10476n4, p52);
            int i10 = 2;
            EnumC10476n4 enumC10476n42 = EnumC10476n4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i11 = 1;
            P5 p53 = P5.FLEXIBLE_LEGITIMATE_INTEREST;
            x22 = x23;
            Ce.M mX = Ce.M.x(entryA, Od.D.a(enumC10476n42, p53), Od.D.a(EnumC10476n4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, p52), Od.D.a(EnumC10476n4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, p52), Od.D.a(EnumC10476n4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, p53), Od.D.a(EnumC10476n4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, p53), Od.D.a(EnumC10476n4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, p53));
            Ce.O oY = Ce.O.y("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesO.contains("IABTCF_TCString");
            int iB = Q5.b(sharedPreferencesO, "IABTCF_CmpSdkID");
            int iB2 = Q5.b(sharedPreferencesO, "IABTCF_PolicyVersion");
            int iB3 = Q5.b(sharedPreferencesO, "IABTCF_gdprApplies");
            int iB4 = Q5.b(sharedPreferencesO, "IABTCF_PurposeOneTreatment");
            int iB5 = Q5.b(sharedPreferencesO, "IABTCF_EnableAdvertiserConsentMode");
            String strA = Q5.a(sharedPreferencesO, "IABTCF_PublisherCC");
            M.a aVarA = Ce.M.a();
            Ce.y0 it = mX.keySet().iterator();
            while (it.hasNext()) {
                EnumC10476n4 enumC10476n43 = (EnumC10476n4) it.next();
                int iZza = enumC10476n43.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(iZza);
                String strA2 = Q5.a(sharedPreferencesO, sb2.toString());
                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                    enumC10485o4 = EnumC10485o4.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strA2.charAt(754), 10);
                    enumC10485o4 = (iDigit < 0 || iDigit > EnumC10485o4.values().length || iDigit == 0) ? EnumC10485o4.PURPOSE_RESTRICTION_NOT_ALLOWED : iDigit != i11 ? iDigit != i10 ? EnumC10485o4.PURPOSE_RESTRICTION_UNDEFINED : EnumC10485o4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : EnumC10485o4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                aVarA.f(enumC10476n43, enumC10485o4);
                i10 = 2;
                i11 = 1;
            }
            Ce.M mC = aVarA.c();
            String strA3 = Q5.a(sharedPreferencesO, "IABTCF_PurposeConsents");
            String strA4 = Q5.a(sharedPreferencesO, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = Q5.a(sharedPreferencesO, "IABTCF_PurposeLegitimateInterests");
            String strA6 = Q5.a(sharedPreferencesO, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr[0] = '2';
            o52 = new O5(Q5.d(mX, mC, oY, cArr, iB, iB5, iB3, iB2, iB4, strA, strA3, strA5, z10, z11, zContains));
        } else {
            x22 = x23;
            String strA7 = Q5.a(sharedPreferencesO, "IABTCF_VendorConsents");
            if (!"".equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            int iB6 = Q5.b(sharedPreferencesO, "IABTCF_gdprApplies");
            if (iB6 != -1) {
                map.put("gdprApplies", String.valueOf(iB6));
            }
            int iB7 = Q5.b(sharedPreferencesO, "IABTCF_EnableAdvertiserConsentMode");
            if (iB7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iB7));
            }
            int iB8 = Q5.b(sharedPreferencesO, "IABTCF_PolicyVersion");
            if (iB8 != -1) {
                map.put("PolicyVersion", String.valueOf(iB8));
            }
            String strA8 = Q5.a(sharedPreferencesO, "IABTCF_PurposeConsents");
            if (!"".equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            int iB9 = Q5.b(sharedPreferencesO, "IABTCF_CmpSdkID");
            if (iB9 != -1) {
                map.put("CmpSdkID", String.valueOf(iB9));
            }
            o52 = new O5(map);
        }
        x22.a().u().b("Tcf preferences read", o52);
        if (!x22.u().F(null, c11112c2)) {
            if (x22.v().v(o52)) {
                Bundle bundleB = o52.b();
                x22.a().u().b("Consent generated from Tcf", bundleB);
                if (bundleB != Bundle.EMPTY) {
                    m0(bundleB, -30, x22.zzaZ().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", o52.e());
                r(CameraSettings.FOCUS_STRATEGY_AUTO, "_tcf", bundle);
                return;
            }
            return;
        }
        E2 e2V = x22.v();
        e2V.f();
        String string = e2V.n().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            o53 = new O5(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && Q5.f85184a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            o53 = new O5(map2);
        }
        if (x22.v().v(o52)) {
            Bundle bundleB2 = o52.b();
            x22.a().u().b("Consent generated from Tcf", bundleB2);
            if (bundleB2 != Bundle.EMPTY) {
                m0(bundleB2, -30, x22.zzaZ().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", o52.d(o53));
            bundle2.putString("_tcfd2", o52.c());
            bundle2.putString("_tcfd", o52.e());
            r(CameraSettings.FOCUS_STRATEGY_AUTO, "_tcf", bundle2);
        }
    }

    @TargetApi(30)
    final PriorityQueue u0() {
        if (this.f86016m == null) {
            this.f86016m = new PriorityQueue(Comparator.comparing(C11220q4.f85780a, C11226r4.f85834a));
        }
        return this.f86016m;
    }

    protected final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) throws IllegalStateException {
        int i10 = z6.f86077k;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.f84868a.b().r(new R3(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    public final void w(String str, String str2, Object obj, boolean z10) throws IllegalStateException {
        x(CameraSettings.FOCUS_STRATEGY_AUTO, "_ldl", obj, true, this.f84868a.zzaZ().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) throws java.lang.IllegalStateException {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L17
            com.google.android.gms.measurement.internal.X2 r5 = r0.f84868a
            com.google.android.gms.measurement.internal.z6 r5 = r5.A()
            int r5 = r5.w0(r2)
        L15:
            r12 = r5
            goto L41
        L17:
            com.google.android.gms.measurement.internal.X2 r5 = r0.f84868a
            com.google.android.gms.measurement.internal.z6 r5 = r5.A()
            java.lang.String r6 = "user property"
            boolean r7 = r5.r0(r6, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = Od.y.f23594a
            r9 = 0
            boolean r7 = r5.t0(r6, r7, r9, r2)
            if (r7 != 0) goto L34
            r5 = 15
            goto L15
        L34:
            com.google.android.gms.measurement.internal.X2 r7 = r5.f84868a
            r7.u()
            boolean r5 = r5.u0(r6, r4, r2)
            if (r5 != 0) goto L40
            goto L26
        L40:
            r12 = r3
        L41:
            r5 = 1
            if (r12 == 0) goto L67
            com.google.android.gms.measurement.internal.X2 r1 = r0.f84868a
            com.google.android.gms.measurement.internal.z6 r6 = r1.A()
            r1.u()
            java.lang.String r14 = r6.o(r2, r4, r5)
            if (r2 == 0) goto L57
            int r3 = r2.length()
        L57:
            r15 = r3
            com.google.android.gms.measurement.internal.X2 r1 = r0.f84868a
            com.google.android.gms.measurement.internal.y6 r10 = r0.f86026w
            com.google.android.gms.measurement.internal.z6 r9 = r1.A()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.z(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r6 = "app"
            goto L6e
        L6c:
            r6 = r17
        L6e:
            if (r1 == 0) goto Lbb
            com.google.android.gms.measurement.internal.X2 r7 = r0.f84868a
            com.google.android.gms.measurement.internal.z6 r8 = r7.A()
            int r12 = r8.w(r2, r1)
            if (r12 == 0) goto Laa
            com.google.android.gms.measurement.internal.z6 r6 = r7.A()
            r7.u()
            java.lang.String r14 = r6.o(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r3
            goto L9b
        L92:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            goto L90
        L9b:
            com.google.android.gms.measurement.internal.X2 r1 = r0.f84868a
            com.google.android.gms.measurement.internal.y6 r10 = r0.f86026w
            com.google.android.gms.measurement.internal.z6 r9 = r1.A()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.z(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            com.google.android.gms.measurement.internal.z6 r3 = r7.A()
            java.lang.Object r5 = r3.x(r2, r1)
            if (r5 == 0) goto Lba
            r3 = r21
            r1 = r6
            r0.y(r1, r2, r3, r5)
        Lba:
            return
        Lbb:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.y(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11268x4.x(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    final void y(String str, String str2, long j10, Object obj) throws IllegalStateException {
        this.f84868a.b().r(new S3(this, str, str2, obj, j10));
    }

    protected C11268x4(X2 x22) {
        super(x22);
        this.f86008e = new CopyOnWriteArraySet();
        this.f86011h = new Object();
        this.f86012i = false;
        this.f86013j = 1;
        this.f86022s = true;
        this.f86026w = new C11106b4(this);
        this.f86010g = new AtomicReference();
        this.f86018o = E3.f84995c;
        this.f86020q = -1L;
        this.f86019p = new AtomicLong(0L);
        this.f86021r = new H6(x22);
    }

    private final void d0(Boolean bool, boolean z10) throws IllegalStateException {
        f();
        h();
        X2 x22 = this.f84868a;
        x22.a().t().b("Setting app measurement enabled (FE)", bool);
        x22.v().q(bool);
        if (z10) {
            E2 e2V = x22.v();
            X2 x23 = e2V.f84868a;
            e2V.f();
            SharedPreferences.Editor editorEdit = e2V.n().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (!this.f84868a.h() && (bool == null || bool.booleanValue())) {
            return;
        }
        W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final void W() throws IllegalStateException {
        C11268x4 c11268x4;
        long j10;
        f();
        X2 x22 = this.f84868a;
        String strA = x22.v().f84982n.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                c11268x4 = this;
                c11268x4.z("app", "_npa", null, x22.zzaZ().a());
            } else {
                if (true != "true".equals(strA)) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                z("app", "_npa", Long.valueOf(j10), x22.zzaZ().a());
                c11268x4 = this;
            }
        } else {
            c11268x4 = this;
        }
        if (c11268x4.f84868a.e() && c11268x4.f86022s) {
            x22.a().t().a("Recording app launch after enabling measurement for the first time (FE)");
            F();
            c11268x4.f84868a.x().f85136e.a();
            x22.b().r(new N3(this));
            return;
        }
        x22.a().t().a("Updating Scion state (FE)");
        c11268x4.f84868a.H().V();
    }

    public final void D() {
        f();
        X2 x22 = this.f84868a;
        if (!x22.v().f84989u.a()) {
            long jA = x22.v().f84990v.a();
            x22.v().f84990v.b(1 + jA);
            x22.u();
            if (jA >= 5) {
                x22.a().p().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                x22.v().f84989u.b(true);
                return;
            } else {
                if (this.f86023t == null) {
                    this.f86023t = new U3(this, this.f84868a);
                }
                this.f86023t.b(0L);
                return;
            }
        }
        x22.a().t().a("Deferred Deep Link already retrieved. Not fetching again.");
    }

    public final void F() {
        f();
        h();
        if (this.f84868a.k()) {
            X2 x22 = this.f84868a;
            C11187m c11187mU = x22.u();
            c11187mU.f84868a.c();
            Boolean boolH = c11187mU.H("google_analytics_deferred_deep_link_enabled");
            if (boolH != null && boolH.booleanValue()) {
                x22.a().t().a("Deferred Deep Link feature enabled.");
                x22.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.v4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f85923a.D();
                    }
                });
            }
            this.f84868a.H().q();
            this.f86022s = false;
            E2 e2V = x22.v();
            e2V.f();
            String string = e2V.n().getString("previous_os_version", null);
            e2V.f84868a.I().j();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = e2V.n().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                x22.I().j();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    r(CameraSettings.FOCUS_STRATEGY_AUTO, "_ou", bundle);
                }
            }
        }
    }

    public final void G(Od.z zVar) {
        Od.z zVar2;
        boolean z10;
        f();
        h();
        if (zVar != null && zVar != (zVar2 = this.f86007d)) {
            if (zVar2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.google.android.gms.common.internal.r.q(z10, "EventInterceptor already set.");
        }
        this.f86007d = zVar;
    }

    public final void H(Od.A a10) {
        h();
        com.google.android.gms.common.internal.r.l(a10);
        if (!this.f86008e.add(a10)) {
            this.f84868a.a().p().a("OnEventListener already registered");
        }
    }

    public final void I(Od.A a10) {
        h();
        com.google.android.gms.common.internal.r.l(a10);
        if (!this.f86008e.remove(a10)) {
            this.f84868a.a().p().a("OnEventListener had not been registered");
        }
    }

    public final int J(String str) {
        com.google.android.gms.common.internal.r.f(str);
        this.f84868a.u();
        return 25;
    }

    public final void L(Bundle bundle, long j10) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f84868a.a().p().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.r.l(bundle2);
        Od.t.b(bundle2, "app_id", String.class, null);
        Od.t.b(bundle2, "origin", String.class, null);
        Od.t.b(bundle2, "name", String.class, null);
        Od.t.b(bundle2, "value", Object.class, null);
        Od.t.b(bundle2, "trigger_event_name", String.class, null);
        Od.t.b(bundle2, "trigger_timeout", Long.class, 0L);
        Od.t.b(bundle2, "timed_out_event_name", String.class, null);
        Od.t.b(bundle2, "timed_out_event_params", Bundle.class, null);
        Od.t.b(bundle2, "triggered_event_name", String.class, null);
        Od.t.b(bundle2, "triggered_event_params", Bundle.class, null);
        Od.t.b(bundle2, "time_to_live", Long.class, 0L);
        Od.t.b(bundle2, "expired_event_name", String.class, null);
        Od.t.b(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.r.f(bundle2.getString("name"));
        com.google.android.gms.common.internal.r.f(bundle2.getString("origin"));
        com.google.android.gms.common.internal.r.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        X2 x22 = this.f84868a;
        if (x22.A().w0(string) == 0) {
            if (x22.A().w(string, obj) == 0) {
                Object objX = x22.A().x(string, obj);
                if (objX == null) {
                    x22.a().m().c("Unable to normalize conditional user property value", x22.B().c(string), obj);
                    return;
                }
                Od.t.a(bundle2, objX);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    x22.u();
                    if (j11 > 15552000000L || j11 < 1) {
                        x22.a().m().c("Invalid conditional user property timeout", x22.B().c(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong("time_to_live");
                x22.u();
                if (j12 <= 15552000000L && j12 >= 1) {
                    x22.b().r(new W3(this, bundle2));
                    return;
                } else {
                    x22.a().m().c("Invalid conditional user property time to live", x22.B().c(string), Long.valueOf(j12));
                    return;
                }
            }
            x22.a().m().c("Invalid conditional user property value", x22.B().c(string), obj);
            return;
        }
        x22.a().m().b("Invalid conditional user property name", x22.B().c(string));
    }

    final /* synthetic */ void S(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            X2 x22 = this.f84868a;
            bundle2 = new Bundle(x22.v().f84994z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (x22.A().z0(obj)) {
                        x22.A().z(this.f86026w, null, 27, null, null, 0);
                    }
                    x22.a().r().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (z6.L(next)) {
                    x22.a().r().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (x22.A().A0("param", next, x22.u().v(null, false), obj)) {
                    x22.A().y(bundle2, next, obj);
                }
            }
            x22.A();
            int iT = x22.u().t();
            if (bundle2.size() > iT) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iT) {
                        bundle2.remove(str);
                    }
                }
                x22.A().z(this.f86026w, null, 26, null, null, 0);
                x22.a().r().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        X2 x23 = this.f84868a;
        x23.v().f84994z.b(bundle2);
        if (bundle.isEmpty() && !x23.u().F(null, C11120d2.f85445X0)) {
            return;
        }
        this.f84868a.H().t(bundle2);
    }

    final /* synthetic */ void V(E3 e32, long j10, boolean z10, boolean z11) {
        f();
        h();
        X2 x22 = this.f84868a;
        E3 e3U = x22.v().u();
        if (j10 <= this.f86020q && E3.u(e3U.b(), e32.b())) {
            x22.a().s().b("Dropped out-of-date consent setting, proposed settings", e32);
            return;
        }
        E2 e2V = x22.v();
        X2 x23 = e2V.f84868a;
        e2V.f();
        int iB = e32.b();
        if (e2V.t(iB)) {
            X2 x24 = this.f84868a;
            SharedPreferences.Editor editorEdit = e2V.n().edit();
            editorEdit.putString("consent_settings", e32.l());
            editorEdit.putInt("consent_source", iB);
            editorEdit.apply();
            x22.a().u().b("Setting storage consent(FE)", e32);
            this.f86020q = j10;
            if (x24.H().B()) {
                x24.H().X(z10);
            } else {
                x24.H().W(z10);
            }
            if (z11) {
                x24.H().o(new AtomicReference());
                return;
            }
            return;
        }
        x22.a().s().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(e32.b()));
    }

    final /* synthetic */ int b0(Throwable th2) {
        String message = th2.getMessage();
        this.f86017n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            if (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) {
                return 2;
            }
            return 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f86017n = true;
        return 1;
    }

    public final void l0(Boolean bool) throws IllegalStateException {
        h();
        this.f84868a.b().r(new RunnableC11146g4(this, bool));
    }

    final void m(E3 e32) {
        boolean z10;
        Boolean boolValueOf;
        f();
        if ((e32.o(Od.v.ANALYTICS_STORAGE) && e32.o(Od.v.AD_STORAGE)) || this.f84868a.H().A()) {
            z10 = true;
        } else {
            z10 = false;
        }
        X2 x22 = this.f84868a;
        if (z10 != x22.h()) {
            x22.g(z10);
            E2 e2V = this.f84868a.v();
            X2 x23 = e2V.f84868a;
            e2V.f();
            if (e2V.n().contains("measurement_enabled_from_api")) {
                boolValueOf = Boolean.valueOf(e2V.n().getBoolean("measurement_enabled_from_api", true));
            } else {
                boolValueOf = null;
            }
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                d0(Boolean.valueOf(z10), false);
            }
        }
    }

    final void m0(Bundle bundle, int i10, long j10) throws IllegalStateException {
        Object obj;
        String str;
        String string;
        h();
        E3 e32 = E3.f84995c;
        Od.v[] vVarArrB = D3.STORAGE.b();
        int length = vVarArrB.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str2 = vVarArrB[i11].f23585a;
            if (bundle.containsKey(str2) && (string = bundle.getString(str2)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            X2 x22 = this.f84868a;
            x22.a().r().b("Ignoring invalid consent setting", obj);
            x22.a().r().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zN = this.f84868a.b().n();
        E3 e3E = E3.e(bundle, i10);
        if (e3E.c()) {
            o0(e3E, zN);
        }
        C11270y c11270yH = C11270y.h(bundle, i10);
        if (c11270yH.d()) {
            n0(c11270yH, zN);
        }
        Boolean boolI = C11270y.i(bundle);
        if (boolI != null) {
            if (i10 == -30) {
                str = "tcf";
            } else {
                str = "app";
            }
            String str3 = str;
            if (zN) {
                z(str3, "allow_personalized_ads", boolI.toString(), j10);
            } else {
                x(str3, "allow_personalized_ads", boolI.toString(), false, j10);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void o0(com.google.android.gms.measurement.internal.E3 r10, boolean r11) {
        /*
            r9 = this;
            r9.h()
            int r0 = r10.b()
            r1 = -10
            if (r0 == r1) goto L2a
            Od.u r2 = r10.p()
            Od.u r3 = Od.u.UNINITIALIZED
            if (r2 != r3) goto L2a
            Od.u r2 = r10.q()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            com.google.android.gms.measurement.internal.X2 r10 = r9.f84868a
            com.google.android.gms.measurement.internal.q2 r10 = r10.a()
            com.google.android.gms.measurement.internal.o2 r10 = r10.r()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.a(r11)
            return
        L2a:
            java.lang.Object r2 = r9.f86011h
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.E3 r3 = r9.f86018o     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.b()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.measurement.internal.E3.u(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            r4 = 0
            if (r3 == 0) goto L64
            com.google.android.gms.measurement.internal.E3 r3 = r9.f86018o     // Catch: java.lang.Throwable -> L53
            boolean r3 = r10.r(r3)     // Catch: java.lang.Throwable -> L53
            Od.v r5 = Od.v.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.o(r5)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            if (r6 == 0) goto L58
            com.google.android.gms.measurement.internal.E3 r6 = r9.f86018o     // Catch: java.lang.Throwable -> L53
            boolean r5 = r6.o(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L58
            r4 = r7
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto Lce
        L58:
            com.google.android.gms.measurement.internal.E3 r5 = r9.f86018o     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.E3 r10 = r10.t(r5)     // Catch: java.lang.Throwable -> L53
            r9.f86018o = r10     // Catch: java.lang.Throwable -> L53
            r8 = r4
            r4 = r7
        L62:
            r5 = r10
            goto L67
        L64:
            r3 = r4
            r8 = r3
            goto L62
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L7a
            com.google.android.gms.measurement.internal.X2 r10 = r9.f84868a
            com.google.android.gms.measurement.internal.q2 r10 = r10.a()
            com.google.android.gms.measurement.internal.o2 r10 = r10.s()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.b(r11, r5)
            return
        L7a:
            java.util.concurrent.atomic.AtomicLong r10 = r9.f86019p
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference r10 = r9.f86010g
            r0 = 0
            r10.set(r0)
            com.google.android.gms.measurement.internal.i4 r3 = new com.google.android.gms.measurement.internal.i4
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L97
            r9.f()
            r3.run()
            return
        L97:
            com.google.android.gms.measurement.internal.X2 r10 = r4.f84868a
            com.google.android.gms.measurement.internal.T2 r10 = r10.b()
            r10.t(r3)
            return
        La1:
            r4 = r9
            com.google.android.gms.measurement.internal.j4 r3 = new com.google.android.gms.measurement.internal.j4
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lb0
            r9.f()
            r3.run()
            return
        Lb0:
            r10 = 30
            if (r0 == r10) goto Lc1
            if (r0 != r1) goto Lb7
            goto Lc1
        Lb7:
            com.google.android.gms.measurement.internal.X2 r10 = r4.f84868a
            com.google.android.gms.measurement.internal.T2 r10 = r10.b()
            r10.r(r3)
            return
        Lc1:
            com.google.android.gms.measurement.internal.X2 r10 = r4.f84868a
            com.google.android.gms.measurement.internal.T2 r10 = r10.b()
            r10.t(r3)
            return
        Lcb:
            r0 = move-exception
            r4 = r9
        Lcd:
            r10 = r0
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r10
        Ld0:
            r0 = move-exception
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11268x4.o0(com.google.android.gms.measurement.internal.E3, boolean):void");
    }

    final void p0(Runnable runnable) throws IllegalStateException, MalformedURLException {
        h();
        X2 x22 = this.f84868a;
        if (!x22.b().n()) {
            if (!x22.b().o()) {
                x22.c();
                if (!C11133f.a()) {
                    x22.a().u().a("[sgtm] Started client-side batch upload work.");
                    boolean z10 = false;
                    int size = 0;
                    int i10 = 0;
                    while (!z10) {
                        x22.a().u().a("[sgtm] Getting upload batches from service (FE)");
                        final AtomicReference atomicReference = new AtomicReference();
                        x22.b().s(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.w4
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws IllegalStateException {
                                this.f85984a.f84868a.H().h0(atomicReference, Od.J.B(Od.G.SGTM_CLIENT));
                            }
                        });
                        Z5 z52 = (Z5) atomicReference.get();
                        if (z52 == null) {
                            break;
                        }
                        List list = z52.f85341a;
                        if (!list.isEmpty()) {
                            x22.a().u().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                            size += list.size();
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Od.F fC0 = c0((X5) it.next());
                                    if (fC0 == Od.F.SUCCESS) {
                                        i10++;
                                    } else if (fC0 == Od.F.BACKOFF) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    x22.a().u().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
                    runnable.run();
                    return;
                }
                x22.a().m().a("Cannot retrieve and upload batches from main thread");
                return;
            }
            x22.a().m().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        x22.a().m().a("Cannot retrieve and upload batches from analytics worker thread");
    }

    public final void q() {
        f();
        X2 x22 = this.f84868a;
        x22.a().t().a("Register tcfPrefChangeListener.");
        if (this.f86024u == null) {
            this.f86025v = new Q3(this, this.f84868a);
            this.f86024u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.s4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f85844a.R(sharedPreferences, str);
                }
            };
        }
        x22.v().o().registerOnSharedPreferenceChangeListener(this.f86024u);
    }

    final void q0(long j10) {
        f();
        if (this.f86015l == null) {
            this.f86015l = new I3(this, this.f84868a);
        }
        this.f86015l.b(j10);
    }

    final void r(String str, String str2, Bundle bundle) {
        f();
        s(str, str2, this.f84868a.zzaZ().a(), bundle);
    }

    final void r0() {
        f();
        AbstractC11263x abstractC11263x = this.f86015l;
        if (abstractC11263x != null) {
            abstractC11263x.d();
        }
    }

    final void s(String str, String str2, long j10, Bundle bundle) {
        f();
        boolean z10 = true;
        if (this.f86007d != null && !z6.L(str2)) {
            z10 = false;
        }
        t(str, str2, j10, bundle, true, z10, true, null);
    }

    final void s0() throws IllegalStateException {
        C10497p7.a();
        X2 x22 = this.f84868a;
        if (x22.u().F(null, C11120d2.f85433R0)) {
            if (!x22.b().n()) {
                x22.c();
                if (!C11133f.a()) {
                    h();
                    x22.a().u().a("Getting trigger URIs (FE)");
                    final AtomicReference atomicReference = new AtomicReference();
                    x22.b().s(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.o4
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() throws IllegalStateException {
                            C11268x4 c11268x4 = this.f85736a;
                            c11268x4.f84868a.H().g0(atomicReference, c11268x4.f84868a.v().f84983o.a());
                        }
                    });
                    final List list = (List) atomicReference.get();
                    if (list == null) {
                        x22.a().o().a("Timed out waiting for get trigger URIs");
                        return;
                    } else {
                        x22.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.p4
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                C11268x4 c11268x4 = this.f85751a;
                                c11268x4.f();
                                if (Build.VERSION.SDK_INT < 30) {
                                    return;
                                }
                                List<S5> list2 = list;
                                SparseArray sparseArrayP = c11268x4.f84868a.v().p();
                                for (S5 s52 : list2) {
                                    int i10 = s52.f85221c;
                                    if (!sparseArrayP.contains(i10) || ((Long) sparseArrayP.get(i10)).longValue() < s52.f85220b) {
                                        c11268x4.u0().add(s52);
                                    }
                                }
                                c11268x4.v0();
                            }
                        });
                        return;
                    }
                }
                x22.a().m().a("Cannot get trigger URIs from main thread");
                return;
            }
            x22.a().m().a("Cannot get trigger URIs from analytics worker thread");
        }
    }

    public final void u(String str, String str2, Bundle bundle, String str3) throws IllegalStateException {
        X2.o();
        v(CameraSettings.FOCUS_STRATEGY_AUTO, str2, this.f84868a.zzaZ().a(), bundle, false, true, true, str3);
    }

    @TargetApi(30)
    final void v0() {
        S5 s52;
        f();
        this.f86017n = false;
        if (!u0().isEmpty() && !this.f86012i && (s52 = (S5) u0().poll()) != null) {
            X2 x22 = this.f84868a;
            AbstractC15776a abstractC15776aF = x22.A().F();
            if (abstractC15776aF != null) {
                this.f86012i = true;
                C11204o2 c11204o2U = x22.a().u();
                String str = s52.f85219a;
                c11204o2U.b("Registering trigger URI", str);
                com.google.common.util.concurrent.q<Unit> qVarD = abstractC15776aF.d(Uri.parse(str));
                if (qVarD == null) {
                    this.f86012i = false;
                    u0().add(s52);
                } else {
                    com.google.common.util.concurrent.k.a(qVarD, new K3(this, s52), new J3(this));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void z(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.r.f(r10)
            com.google.android.gms.common.internal.r.f(r11)
            r9.f()
            r9.h()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L74
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            com.google.android.gms.measurement.internal.X2 r4 = r9.f84868a
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.E2 r11 = r4.v()
            com.google.android.gms.measurement.internal.D2 r11 = r11.f84982n
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.b(r0)
        L51:
            r11 = r1
            goto L63
        L53:
            if (r12 != 0) goto L63
            com.google.android.gms.measurement.internal.X2 r11 = r9.f84868a
            com.google.android.gms.measurement.internal.E2 r11 = r11.v()
            com.google.android.gms.measurement.internal.D2 r11 = r11.f84982n
            java.lang.String r0 = "unset"
            r11.b(r0)
            goto L51
        L63:
            com.google.android.gms.measurement.internal.X2 r0 = r9.f84868a
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()
            com.google.android.gms.measurement.internal.o2 r0 = r0.u()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.c(r1, r2, r12)
        L74:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.X2 r11 = r9.f84868a
            boolean r12 = r11.e()
            if (r12 != 0) goto L8e
            com.google.android.gms.measurement.internal.X2 r10 = r9.f84868a
            com.google.android.gms.measurement.internal.q2 r10 = r10.a()
            com.google.android.gms.measurement.internal.o2 r10 = r10.u()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L8e:
            boolean r11 = r11.k()
            if (r11 != 0) goto L95
            return
        L95:
            com.google.android.gms.measurement.internal.X2 r11 = r9.f84868a
            com.google.android.gms.measurement.internal.v6 r3 = new com.google.android.gms.measurement.internal.v6
            r8 = r10
            r5 = r13
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.w5 r10 = r11.H()
            r10.m(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11268x4.z(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }
}

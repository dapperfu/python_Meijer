package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import com.medallia.digital.mobilesdk.l8;
import gd.C14248g;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import n4.AbstractC15776a;
import qd.C16519f;

/* loaded from: classes6.dex */
public final class z6 extends B3 {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f86075i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f86076j = {"_err"};

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f86077k = 0;

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f86078c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f86079d;

    /* renamed from: e, reason: collision with root package name */
    private int f86080e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC15776a f86081f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f86082g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f86083h;

    static MessageDigest A() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    static boolean D(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private final Object l0(int i10, Object obj, boolean z10, boolean z11, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return o(obj.toString(), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleO = O((Bundle) parcelable, null);
                if (!bundleO.isEmpty()) {
                    arrayList.add(bundleO);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    final boolean A0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i10) {
                this.f84868a.a().r().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final long W(long j10, long j11) {
        return (j10 + (j11 * l8.b.f92525b)) / l8.b.f92527d;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean g() {
        return true;
    }

    public final String o(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    final boolean r0(String str, String str2) {
        if (str2 == null) {
            this.f84868a.a().o().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f84868a.a().o().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f84868a.a().o().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f84868a.a().o().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean s0(String str, String str2) {
        if (str2 == null) {
            this.f84868a.a().o().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f84868a.a().o().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f84868a.a().o().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f84868a.a().o().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean t0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f84868a.a().o().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.r.l(str2);
        String[] strArr3 = f86075i;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f84868a.a().o().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !M(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && M(str2, strArr2)) {
            return true;
        }
        this.f84868a.a().o().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final boolean u0(String str, int i10, String str2) {
        if (str2 == null) {
            this.f84868a.a().o().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f84868a.a().o().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public static boolean S(String str) {
        return !f86076j[0].equals(str);
    }

    public static ArrayList f0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11157i c11157i = (C11157i) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c11157i.f85608a);
            bundle.putString("origin", c11157i.f85609b);
            bundle.putLong("creation_timestamp", c11157i.f85611d);
            bundle.putString("name", c11157i.f85610c.f85926b);
            Od.t.a(bundle, com.google.android.gms.common.internal.r.l(c11157i.f85610c.B()));
            bundle.putBoolean("active", c11157i.f85612e);
            String str = c11157i.f85613f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            G g10 = c11157i.f85614g;
            if (g10 != null) {
                bundle.putString("timed_out_event_name", g10.f85021a);
                E e10 = g10.f85022b;
                if (e10 != null) {
                    bundle.putBundle("timed_out_event_params", e10.W0());
                }
            }
            bundle.putLong("trigger_timeout", c11157i.f85615h);
            G g11 = c11157i.f85616i;
            if (g11 != null) {
                bundle.putString("triggered_event_name", g11.f85021a);
                E e11 = g11.f85022b;
                if (e11 != null) {
                    bundle.putBundle("triggered_event_params", e11.W0());
                }
            }
            bundle.putLong("triggered_timestamp", c11157i.f85610c.f85927c);
            bundle.putLong("time_to_live", c11157i.f85617j);
            G g12 = c11157i.f85618k;
            if (g12 != null) {
                bundle.putString("expired_event_name", g12.f85021a);
                E e12 = g12.f85022b;
                if (e12 != null) {
                    bundle.putBundle("expired_event_params", e12.W0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void i0(E4 e42, Bundle bundle, boolean z10) {
        if (bundle != null && e42 != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = e42.f84998a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = e42.f84999b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", e42.f85000c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && e42 == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    static final boolean k0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    private final int m0(String str) {
        if ("_ldl".equals(str)) {
            this.f84868a.u();
            return RecyclerView.m.FLAG_MOVED;
        }
        if ("_id".equals(str)) {
            this.f84868a.u();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f84868a.u();
            return 100;
        }
        this.f84868a.u();
        return 36;
    }

    final void B0(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int iX0;
        String str4;
        int iP;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        X2 x22 = this.f84868a;
        int i10 = true != x22.u().f84868a.A().T(231100000, true) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                iX0 = !z10 ? x0(str5) : 0;
                if (iX0 == 0) {
                    iX0 = y0(str5);
                }
            } else {
                iX0 = 0;
            }
            if (iX0 != 0) {
                v(bundle, iX0, str5, iX0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (z0(bundle.get(str5))) {
                    x22.a().r().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iP = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iP = p(str, str2, str5, bundle.get(str5), bundle, list2, z10, false);
                }
                if (iP != 0 && !"_ev".equals(str5)) {
                    v(bundle, iP, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (p0(str5) && !M(str5, Od.x.f23593d)) {
                    i11++;
                    if (!T(231100000, true)) {
                        x22.a().o().c("Item array not supported on client's version of Google Play Services (Android Only)", x22.B().a(str2), x22.B().e(bundle));
                        k0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i11 > i10) {
                        if (!x22.u().F(str4, C11120d2.f85467f1) || !z11) {
                            C11204o2 c11204o2O = x22.a().o();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            c11204o2O.c(sb2.toString(), x22.B().a(str2), x22.B().e(bundle));
                        }
                        k0(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        z11 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    final AbstractC15776a F() {
        if (this.f86081f == null) {
            this.f86081f = AbstractC15776a.a(this.f84868a.zzaY());
        }
        return this.f86081f;
    }

    final int G() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    @TargetApi(30)
    final boolean I() throws ExecutionException, InterruptedException, TimeoutException {
        Object e10;
        Integer num;
        if (this.f86082g == null) {
            AbstractC15776a abstractC15776aF = F();
            boolean z10 = false;
            if (abstractC15776aF == null) {
                return false;
            }
            try {
                num = abstractC15776aF.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e11) {
                        e10 = e11;
                        this.f84868a.a().p().b("Measurement manager api exception", e10);
                        this.f86082g = Boolean.FALSE;
                        this.f84868a.a().u().b("Measurement manager api status result", num);
                        return this.f86082g.booleanValue();
                    } catch (CancellationException e12) {
                        e10 = e12;
                        this.f84868a.a().p().b("Measurement manager api exception", e10);
                        this.f86082g = Boolean.FALSE;
                        this.f84868a.a().u().b("Measurement manager api status result", num);
                        return this.f86082g.booleanValue();
                    } catch (ExecutionException e13) {
                        e10 = e13;
                        this.f84868a.a().p().b("Measurement manager api exception", e10);
                        this.f86082g = Boolean.FALSE;
                        this.f84868a.a().u().b("Measurement manager api status result", num);
                        return this.f86082g.booleanValue();
                    } catch (TimeoutException e14) {
                        e10 = e14;
                        this.f84868a.a().p().b("Measurement manager api exception", e10);
                        this.f86082g = Boolean.FALSE;
                        this.f84868a.a().u().b("Measurement manager api status result", num);
                        return this.f86082g.booleanValue();
                    }
                }
                this.f86082g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                e10 = e15;
                num = null;
            }
            this.f84868a.a().u().b("Measurement manager api status result", num);
        }
        return this.f86082g.booleanValue();
    }

    final boolean J(String str) {
        String str2 = (String) C11120d2.f85499s0.b(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    final Bundle O(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objQ = q(str2, bundle.get(str2));
                if (objQ == null) {
                    X2 x22 = this.f84868a;
                    x22.a().r().b("Param value can't be null", x22.B().b(str2));
                } else {
                    y(bundle2, str2, objQ);
                }
            }
        }
        return bundle2;
    }

    final boolean Q(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = C16519f.a(context).f(str, 64);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            this.f84868a.a().m().b("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            this.f84868a.a().m().b("Error obtaining certificate", e11);
            return true;
        }
    }

    final byte[] R(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final boolean T(int i10, boolean z10) {
        Boolean boolV = this.f84868a.H().v();
        if (U() < i10 / 1000) {
            return (boolV == null || boolV.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int U() {
        if (this.f86083h == null) {
            this.f86083h = Integer.valueOf(C14248g.f().a(this.f84868a.zzaY()) / 1000);
        }
        return this.f86083h.intValue();
    }

    public final int V(int i10) {
        return C14248g.f().h(this.f84868a.zzaY(), 12451000);
    }

    final void X(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f84868a.a().p().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void Y(InterfaceC10570y0 interfaceC10570y0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC10570y0.P(bundle);
        } catch (RemoteException e10) {
            this.f84868a.a().p().b("Error returning string value to wrapper", e10);
        }
    }

    public final void Z(InterfaceC10570y0 interfaceC10570y0, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            interfaceC10570y0.P(bundle);
        } catch (RemoteException e10) {
            this.f84868a.a().p().b("Error returning long value to wrapper", e10);
        }
    }

    public final void a0(InterfaceC10570y0 interfaceC10570y0, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            interfaceC10570y0.P(bundle);
        } catch (RemoteException e10) {
            this.f84868a.a().p().b("Error returning int value to wrapper", e10);
        }
    }

    public final void b0(InterfaceC10570y0 interfaceC10570y0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC10570y0.P(bundle);
        } catch (RemoteException e10) {
            this.f84868a.a().p().b("Error returning byte array to wrapper", e10);
        }
    }

    public final void c0(InterfaceC10570y0 interfaceC10570y0, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            interfaceC10570y0.P(bundle);
        } catch (RemoteException e10) {
            this.f84868a.a().p().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void e0(InterfaceC10570y0 interfaceC10570y0, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC10570y0.P(bundle);
        } catch (RemoteException e10) {
            this.f84868a.a().p().b("Error returning bundle list to wrapper", e10);
        }
    }

    final String j0() {
        byte[] bArr = new byte[16];
        o0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long n0() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.f86079d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f86079d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.f84868a.zzaZ().a()).nextLong();
            int i10 = this.f86080e + 1;
            this.f86080e = i10;
            j10 = jNextLong + i10;
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int p(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z6.p(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    final Object q(String str, Object obj) {
        if ("_ev".equals(str)) {
            return l0(this.f84868a.u().w(null, false), obj, true, true, null);
        }
        return l0(L(str) ? this.f84868a.u().w(null, false) : this.f84868a.u().v(null, false), obj, false, true, null);
    }

    final Bundle q0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            this.f84868a.a().p().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    final Bundle r(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iX0;
        List list2 = list;
        boolean zM = M(str2, Od.w.f23589d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        X2 x22 = this.f84868a;
        int iT = x22.u().t();
        int i10 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                iX0 = !z10 ? x0(str3) : 0;
                if (iX0 == 0) {
                    iX0 = y0(str3);
                }
            } else {
                iX0 = 0;
            }
            if (iX0 != 0) {
                v(bundle2, iX0, str3, iX0 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iP = p(str, str2, str3, bundle.get(str3), bundle2, list2, z10, zM);
                if (iP == 17) {
                    v(bundle2, 17, str3, Boolean.FALSE);
                } else if (iP != 0 && !"_ev".equals(str3)) {
                    v(bundle2, iP, iP == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (p0(str3) && (i10 = i10 + 1) > iT) {
                    if (!x22.u().F(null, C11120d2.f85467f1) || !z11) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iT).length() + 37);
                        sb2.append("Event can't contain more than ");
                        sb2.append(iT);
                        sb2.append(" params");
                        x22.a().o().c(sb2.toString(), x22.B().a(str2), x22.B().e(bundle));
                    }
                    k0(bundle2, 5);
                    bundle2.remove(str3);
                    z11 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    final void s(C11224r2 c11224r2, int i10) {
        Bundle bundle = c11224r2.f85830d;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (p0(str) && (i11 = i11 + 1) > i10) {
                X2 x22 = this.f84868a;
                if (!x22.u().F(null, C11120d2.f85467f1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    x22.a().o().c(sb2.toString(), x22.B().a(c11224r2.f85827a), x22.B().e(bundle));
                    k0(bundle, 5);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    final void u(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f84868a.A().y(bundle, str, bundle2.get(str));
            }
        }
    }

    final int v0(String str) {
        if (!s0("event", str)) {
            return 2;
        }
        if (!t0("event", Od.w.f23586a, Od.w.f23587b, str)) {
            return 13;
        }
        this.f84868a.u();
        return !u0("event", 40, str) ? 2 : 0;
    }

    final int w(String str, Object obj) {
        return "_ldl".equals(str) ? A0("user property referrer", str, m0(str), obj) : A0("user property", str, m0(str), obj) ? 0 : 7;
    }

    final int w0(String str) {
        if (!s0("user property", str)) {
            return 6;
        }
        if (!t0("user property", Od.y.f23594a, null, str)) {
            return 15;
        }
        this.f84868a.u();
        return !u0("user property", 24, str) ? 6 : 0;
    }

    final Object x(String str, Object obj) {
        return "_ldl".equals(str) ? l0(m0(str), obj, true, false, null) : l0(m0(str), obj, false, false, null);
    }

    final int x0(String str) {
        if (!r0("event param", str)) {
            return 3;
        }
        if (!t0("event param", null, null, str)) {
            return 14;
        }
        this.f84868a.u();
        return !u0("event param", 40, str) ? 3 : 0;
    }

    final void y(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            X2 x22 = this.f84868a;
            x22.a().r().c("Not putting event parameter. Invalid value type. name, type", x22.B().b(str), simpleName);
        }
    }

    final int y0(String str) {
        if (!s0("event param", str)) {
            return 3;
        }
        if (!t0("event param", null, null, str)) {
            return 14;
        }
        this.f84868a.u();
        return !u0("event param", 40, str) ? 3 : 0;
    }

    final void z(y6 y6Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        k0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        y6Var.W(str, "_err", bundle);
    }

    final boolean z0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    z6(X2 x22) {
        super(x22);
        this.f86083h = null;
        this.f86079d = new AtomicLong(0L);
    }

    static long B(byte[] bArr) {
        boolean z10;
        com.google.android.gms.common.internal.r.l(bArr);
        int length = bArr.length;
        int i10 = 0;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.gms.common.internal.r.p(z10);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    static boolean C(Context context, boolean z10) {
        com.google.android.gms.common.internal.r.l(context);
        return D(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean L(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    private static boolean M(String str, String[] strArr) {
        com.google.android.gms.common.internal.r.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean h0(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.r.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean p0(String str) {
        com.google.android.gms.common.internal.r.f(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    final boolean E() {
        f();
        if (H() == 1) {
            return true;
        }
        return false;
    }

    final long H() {
        long j10;
        f();
        if (!J(this.f84868a.J().o())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            X2 x22 = this.f84868a;
            int iG = G();
            x22.u();
            if (iG < ((Integer) C11120d2.f85487m0.b(null)).intValue()) {
                j10 = 16;
            } else {
                j10 = 0;
            }
        }
        if (!K("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !I()) {
            j10 = 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    final boolean K(String str) {
        f();
        X2 x22 = this.f84868a;
        if (C16519f.a(x22.zzaY()).a(str) == 0) {
            return true;
        }
        x22.a().t().b("Permission not granted", str);
        return false;
    }

    final boolean N(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        X2 x22 = this.f84868a;
        String strG = x22.u().g();
        x22.c();
        return strG.equals(str);
    }

    final G P(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle bundleR = r(str, str2, bundle3, com.google.android.gms.common.util.g.a("_o"), true);
            if (z10) {
                bundleR = O(bundleR, str);
            }
            com.google.android.gms.common.internal.r.l(bundleR);
            return new G(str2, new E(bundleR), str3, j10);
        }
        X2 x22 = this.f84868a;
        x22.a().m().b("Invalid conditional property event name", x22.B().c(str2));
        throw new IllegalArgumentException();
    }

    public final void d0(InterfaceC10570y0 interfaceC10570y0, Bundle bundle) {
        try {
            interfaceC10570y0.P(bundle);
        } catch (RemoteException e10) {
            this.f84868a.a().p().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final URL g0(long j10, String str, String str2, long j11, String str3) {
        try {
            com.google.android.gms.common.internal.r.f(str2);
            com.google.android.gms.common.internal.r.f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(U())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f84868a.u().h())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e10) {
            e = e10;
            this.f84868a.a().m().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e11) {
            e = e11;
            this.f84868a.a().m().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final void h() {
        f();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f84868a.a().p().a("Utils falling back to Random for random id");
            }
        }
        this.f86079d.set(jNextLong);
    }

    final boolean m(String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.common.internal.r.l(str);
            if (!str.matches("^1:\\d+:android:[a-f0-9]+$")) {
                this.f84868a.a().o().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C11218q2.v(str));
                return false;
            }
            return true;
        }
        this.f84868a.a().o().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    final boolean n(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            com.google.android.gms.common.internal.r.l(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    final SecureRandom o0() {
        f();
        if (this.f86078c == null) {
            this.f86078c = new SecureRandom();
        }
        return this.f86078c;
    }

    final void t(Parcelable[] parcelableArr, int i10) {
        com.google.android.gms.common.internal.r.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (p0(str) && !M(str, Od.x.f23593d) && (i11 = i11 + 1) > i10) {
                    X2 x22 = this.f84868a;
                    if (!x22.u().F(null, C11120d2.f85467f1) || !z10) {
                        C11204o2 c11204o2O = x22.a().o();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        c11204o2O.c(sb2.toString(), x22.B().b(str), x22.B().e(bundle));
                    }
                    k0(bundle, 28);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    final void v(Bundle bundle, int i10, String str, Object obj) {
        if (k0(bundle, i10)) {
            this.f84868a.u();
            bundle.putString("_ev", o(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.r.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }
}

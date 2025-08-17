package k8;

import com.google.maps.android.BuildConfig;
import g8.C;
import g8.D;
import g8.InterfaceC14216A;
import h8.InterfaceC14386b;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import okhttp3.d;
import s7.OneAgentConfiguration;
import u7.EnumC17232a;

/* renamed from: k8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15118d {

    /* renamed from: A, reason: collision with root package name */
    public final EnumC17232a f141614A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f141615B;

    /* renamed from: C, reason: collision with root package name */
    public final d.a f141616C;

    /* renamed from: D, reason: collision with root package name */
    public final int f141617D;

    /* renamed from: a, reason: collision with root package name */
    public final String f141618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141619b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141620c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC15115a f141621d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f141622e;

    /* renamed from: f, reason: collision with root package name */
    public final KeyStore f141623f;

    /* renamed from: g, reason: collision with root package name */
    public final KeyManager[] f141624g;

    /* renamed from: h, reason: collision with root package name */
    public final int f141625h;

    /* renamed from: i, reason: collision with root package name */
    public final int f141626i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f141627j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f141628k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f141629l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f141630m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f141631n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f141632o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f141633p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f141634q;

    /* renamed from: r, reason: collision with root package name */
    public final String[] f141635r;

    /* renamed from: s, reason: collision with root package name */
    public final String[] f141636s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f141637t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f141638u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f141639v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f141640w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f141641x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f141642y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f141643z;

    C15118d(String str, String str2, String str3, EnumC15115a enumC15115a, boolean z10, KeyStore keyStore, KeyManager[] keyManagerArr, int i10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String[] strArr, String[] strArr2, boolean z19, boolean z20, boolean z21, boolean z22, InterfaceC14386b interfaceC14386b, boolean z23, boolean z24, boolean z25, EnumC17232a enumC17232a, InterfaceC14216A interfaceC14216A, boolean z26, C c10, d.a aVar, int i12) {
        this.f141618a = str;
        this.f141619b = str2;
        this.f141620c = str3;
        this.f141621d = enumC15115a;
        this.f141622e = z10;
        this.f141623f = keyStore;
        this.f141624g = keyManagerArr;
        this.f141625h = i10;
        this.f141626i = i11;
        this.f141627j = z11;
        this.f141628k = z12;
        this.f141629l = z13;
        this.f141630m = z14;
        this.f141631n = z15;
        this.f141632o = z16;
        this.f141633p = z17;
        this.f141634q = z18;
        this.f141635r = strArr;
        this.f141636s = strArr2;
        this.f141637t = z19;
        this.f141638u = z20;
        this.f141639v = z21;
        this.f141640w = z22;
        this.f141641x = z23;
        this.f141642y = z24;
        this.f141643z = z25;
        this.f141614A = enumC17232a;
        this.f141615B = z26;
        this.f141616C = aVar;
        this.f141617D = i12;
    }

    private static String b(Object obj) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        return obj.getClass().getName() + "@" + System.identityHashCode(obj);
    }

    public String a() {
        return this.f141620c;
    }

    public OneAgentConfiguration c() {
        return new OneAgentConfiguration(D.a(), this.f141618a, this.f141620c, this.f141629l, this.f141630m, this.f141632o, this.f141633p, this.f141617D, this.f141614A);
    }

    public String toString() {
        return "Configuration{applicationId='" + this.f141618a + "', appIdEncoded='" + this.f141619b + "', beaconUrl='" + this.f141620c + "', mode=" + this.f141621d + ", certificateValidation=" + this.f141622e + ", keyStore=" + this.f141623f + ", keyManagers=" + Arrays.toString(this.f141624g) + ", graceTime=" + this.f141625h + ", waitTime=" + this.f141626i + ", sendEmptyAction=" + this.f141627j + ", namePrivacy=" + this.f141628k + ", applicationMonitoring=" + this.f141629l + ", activityMonitoring=" + this.f141630m + ", crashReporting=" + this.f141631n + ", nativeCrashReporting=" + this.f141632o + ", anrReporting=" + this.f141633p + ", webRequestTiming=" + this.f141634q + ", monitoredDomains=" + Arrays.toString(this.f141635r) + ", monitoredHttpsDomains=" + Arrays.toString(this.f141636s) + ", hybridApp=" + this.f141637t + ", fileDomainCookies=" + this.f141638u + ", debugLogLevel=" + this.f141639v + ", autoStart=" + this.f141640w + ", communicationProblemListener=" + b(null) + ", userOptIn=" + this.f141641x + ", startupLoadBalancing=" + this.f141642y + ", startupWithGrailEnabled=" + this.f141643z + ", instrumentationFlavor=" + this.f141614A + ", sessionReplayComponentProvider=" + ((Object) null) + ", isRageTapDetectionEnabled=" + this.f141615B + ", autoUserActionModifier=" + b(null) + ", httpFactory=" + b(this.f141616C) + ", eventThrottlingLimit=" + this.f141617D + '}';
    }
}

package m8;

import com.google.maps.android.BuildConfig;
import i8.C;
import i8.D;
import i8.InterfaceC14692A;
import j8.InterfaceC14964b;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import okhttp3.d;
import u7.OneAgentConfiguration;
import w7.EnumC17849a;

/* renamed from: m8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15689d {

    /* renamed from: A, reason: collision with root package name */
    public final EnumC17849a f150760A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f150761B;

    /* renamed from: C, reason: collision with root package name */
    public final d.a f150762C;

    /* renamed from: D, reason: collision with root package name */
    public final int f150763D;

    /* renamed from: a, reason: collision with root package name */
    public final String f150764a;

    /* renamed from: b, reason: collision with root package name */
    public final String f150765b;

    /* renamed from: c, reason: collision with root package name */
    public final String f150766c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC15686a f150767d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f150768e;

    /* renamed from: f, reason: collision with root package name */
    public final KeyStore f150769f;

    /* renamed from: g, reason: collision with root package name */
    public final KeyManager[] f150770g;

    /* renamed from: h, reason: collision with root package name */
    public final int f150771h;

    /* renamed from: i, reason: collision with root package name */
    public final int f150772i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f150773j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f150774k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f150775l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f150776m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f150777n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f150778o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f150779p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f150780q;

    /* renamed from: r, reason: collision with root package name */
    public final String[] f150781r;

    /* renamed from: s, reason: collision with root package name */
    public final String[] f150782s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f150783t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f150784u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f150785v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f150786w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f150787x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f150788y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f150789z;

    private static String b(Object obj) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        return obj.getClass().getName() + "@" + System.identityHashCode(obj);
    }

    public String a() {
        return this.f150766c;
    }

    public OneAgentConfiguration c() {
        return new OneAgentConfiguration(D.a(), this.f150764a, this.f150766c, this.f150775l, this.f150776m, this.f150778o, this.f150779p, this.f150763D, this.f150760A);
    }

    public String toString() {
        return "Configuration{applicationId='" + this.f150764a + "', appIdEncoded='" + this.f150765b + "', beaconUrl='" + this.f150766c + "', mode=" + this.f150767d + ", certificateValidation=" + this.f150768e + ", keyStore=" + this.f150769f + ", keyManagers=" + Arrays.toString(this.f150770g) + ", graceTime=" + this.f150771h + ", waitTime=" + this.f150772i + ", sendEmptyAction=" + this.f150773j + ", namePrivacy=" + this.f150774k + ", applicationMonitoring=" + this.f150775l + ", activityMonitoring=" + this.f150776m + ", crashReporting=" + this.f150777n + ", nativeCrashReporting=" + this.f150778o + ", anrReporting=" + this.f150779p + ", webRequestTiming=" + this.f150780q + ", monitoredDomains=" + Arrays.toString(this.f150781r) + ", monitoredHttpsDomains=" + Arrays.toString(this.f150782s) + ", hybridApp=" + this.f150783t + ", fileDomainCookies=" + this.f150784u + ", debugLogLevel=" + this.f150785v + ", autoStart=" + this.f150786w + ", communicationProblemListener=" + b(null) + ", userOptIn=" + this.f150787x + ", startupLoadBalancing=" + this.f150788y + ", startupWithGrailEnabled=" + this.f150789z + ", instrumentationFlavor=" + this.f150760A + ", sessionReplayComponentProvider=" + ((Object) null) + ", isRageTapDetectionEnabled=" + this.f150761B + ", autoUserActionModifier=" + b(null) + ", httpFactory=" + b(this.f150762C) + ", eventThrottlingLimit=" + this.f150763D + '}';
    }

    C15689d(String str, String str2, String str3, EnumC15686a enumC15686a, boolean z10, KeyStore keyStore, KeyManager[] keyManagerArr, int i10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String[] strArr, String[] strArr2, boolean z19, boolean z20, boolean z21, boolean z22, InterfaceC14964b interfaceC14964b, boolean z23, boolean z24, boolean z25, EnumC17849a enumC17849a, InterfaceC14692A interfaceC14692A, boolean z26, C c10, d.a aVar, int i12) {
        this.f150764a = str;
        this.f150765b = str2;
        this.f150766c = str3;
        this.f150767d = enumC15686a;
        this.f150768e = z10;
        this.f150769f = keyStore;
        this.f150770g = keyManagerArr;
        this.f150771h = i10;
        this.f150772i = i11;
        this.f150773j = z11;
        this.f150774k = z12;
        this.f150775l = z13;
        this.f150776m = z14;
        this.f150777n = z15;
        this.f150778o = z16;
        this.f150779p = z17;
        this.f150780q = z18;
        this.f150781r = strArr;
        this.f150782s = strArr2;
        this.f150783t = z19;
        this.f150784u = z20;
        this.f150785v = z21;
        this.f150786w = z22;
        this.f150787x = z23;
        this.f150788y = z24;
        this.f150789z = z25;
        this.f150760A = enumC17849a;
        this.f150761B = z26;
        this.f150762C = aVar;
        this.f150763D = i12;
    }
}

package Xc;

import com.google.android.gms.internal.ads.C8913mq;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final String f41850a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41851b;

    /* renamed from: c, reason: collision with root package name */
    private final C8913mq f41852c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.EnumC8247gd a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f41850a
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            r4 = 3
            switch(r1) {
                case -1999289321: goto L2b;
                case -1372958932: goto L21;
                case 543046670: goto L17;
                case 1951953708: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L17:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L21:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r3
            goto L36
        L2b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = -1
        L36:
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L47
            if (r0 == r2) goto L44
            if (r0 == r4) goto L41
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC8247gd.AD_INITIATER_UNSPECIFIED
            return r0
        L41:
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC8247gd.REWARD_BASED_VIDEO_AD
            return r0
        L44:
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC8247gd.AD_LOADER
            return r0
        L47:
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC8247gd.INTERSTITIAL
            return r0
        L4a:
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC8247gd.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Xc.B.a():com.google.android.gms.internal.ads.gd");
    }

    final C8913mq b() {
        return this.f41852c;
    }

    public final String c() {
        return this.f41850a.toLowerCase(Locale.ROOT);
    }

    final String d() {
        return this.f41851b;
    }

    public final Set e() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f41850a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    /* synthetic */ B(C5591z c5591z, A a10) {
        this.f41850a = c5591z.f42089a;
        this.f41851b = c5591z.f42090b;
        this.f41852c = c5591z.f42091c;
    }
}

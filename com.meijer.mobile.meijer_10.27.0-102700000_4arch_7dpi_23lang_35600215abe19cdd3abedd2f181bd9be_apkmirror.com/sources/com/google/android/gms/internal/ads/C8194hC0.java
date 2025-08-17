package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import j3.C14843a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.hC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8194hC0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C8194hC0 f74633c = new C8194hC0(AbstractC7917eh0.u(C8087gC0.f74279d));

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private static final AbstractC7917eh0 f74634d = AbstractC7917eh0.x(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC8238hh0 f74635e;

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f74636a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private final int f74637b;

    @SuppressLint({"InlinedApi"})
    static C8194hC0 d(Context context, Intent intent, HR hr2, C8834nC0 c8834nC0) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (c8834nC0 == null) {
            C8834nC0 c8834nC02 = null;
            if (OV.f69091a >= 33) {
                try {
                    List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(hr2.a().f69186a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        c8834nC02 = new C8834nC0((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            c8834nC0 = c8834nC02;
        }
        int i10 = OV.f69091a;
        if (i10 >= 33 && (OV.m(context) || OV.i(context))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(hr2.a().f69186a);
            HashMap map = new HashMap();
            map.put(2, new HashSet(Ii0.g(12)));
            for (int i11 = 0; i11 < directProfilesForAttributes.size(); i11++) {
                AudioProfile audioProfileA = C14843a.a(directProfilesForAttributes.get(i11));
                if (audioProfileA.getEncapsulationType() != 1) {
                    int format = audioProfileA.getFormat();
                    if (OV.j(format) || f74635e.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(Ii0.g(audioProfileA.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(Ii0.g(audioProfileA.getChannelMasks())));
                        }
                    }
                }
            }
            C7598bh0 c7598bh0 = new C7598bh0();
            for (Map.Entry entry : map.entrySet()) {
                c7598bh0.g(new C8087gC0(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new C8194hC0(c7598bh0.j());
        }
        if (i10 >= 23) {
            AudioDeviceInfo[] devices = c8834nC0 == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{c8834nC0.f77014a};
            C8344ih0 c8344ih0 = new C8344ih0();
            c8344ih0.h(8, 7);
            if (i10 >= 31) {
                c8344ih0.h(26, 27);
            }
            if (i10 >= 33) {
                c8344ih0.g(30);
            }
            AbstractC8450jh0 abstractC8450jh0J = c8344ih0.j();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (abstractC8450jh0J.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f74633c;
                }
            }
        }
        C8344ih0 c8344ih02 = new C8344ih0();
        c8344ih02.g(2);
        if (OV.f69091a >= 29 && (OV.m(context) || OV.i(context))) {
            C7598bh0 c7598bh02 = new C7598bh0();
            AbstractC8559ki0 it = f74635e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (OV.f69091a >= OV.z(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), hr2.a().f69186a)) {
                    c7598bh02.g(num);
                }
            }
            c7598bh02.g(2);
            c8344ih02.i(c7598bh02.j());
            return new C8194hC0(e(Ii0.h(c8344ih02.j()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || f()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c8344ih02.i(f74634d);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C8194hC0(e(Ii0.h(c8344ih02.j()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c8344ih02.i(Ii0.g(intArrayExtra));
        }
        return new C8194hC0(e(Ii0.h(c8344ih02.j()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.C8194hC0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.hC0 r9 = (com.google.android.gms.internal.ads.C8194hC0) r9
            android.util.SparseArray r1 = r8.f74636a
            android.util.SparseArray r3 = r9.f74636a
            int r4 = com.google.android.gms.internal.ads.OV.f69091a
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = d3.M.a(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.f74637b
            int r9 = r9.f74637b
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8194hC0.equals(java.lang.Object):boolean");
    }

    static {
        C8131gh0 c8131gh0 = new C8131gh0();
        c8131gh0.a(5, 6);
        c8131gh0.a(17, 6);
        c8131gh0.a(7, 6);
        c8131gh0.a(30, 10);
        c8131gh0.a(18, 6);
        c8131gh0.a(6, 8);
        c8131gh0.a(8, 8);
        c8131gh0.a(14, 8);
        f74635e = c8131gh0.c();
    }

    @SuppressLint({"UnprotectedReceiver"})
    static C8194hC0 c(Context context, HR hr2, C8834nC0 c8834nC0) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), hr2, c8834nC0);
    }

    private static AbstractC7917eh0 e(int[] iArr, int i10) {
        C7598bh0 c7598bh0 = new C7598bh0();
        for (int i11 : iArr) {
            c7598bh0.g(new C8087gC0(i11, i10));
        }
        return c7598bh0.j();
    }

    private static boolean f() {
        String str = OV.f69093c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r0
      0x003a: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair b(com.google.android.gms.internal.ads.C r9, com.google.android.gms.internal.ads.HR r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f65664o
            r0.getClass()
            java.lang.String r1 = r9.f65660k
            int r0 = com.google.android.gms.internal.ads.C7057Pc.a(r0, r1)
            com.google.android.gms.internal.ads.hh0 r1 = com.google.android.gms.internal.ads.C8194hC0.f74635e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc3
        L19:
            r1 = 7
            r2 = 8
            r3 = 6
            r4 = 18
            if (r0 != r4) goto L2c
            android.util.SparseArray r0 = r8.f74636a
            boolean r0 = com.google.android.gms.internal.ads.OV.g(r0, r4)
            if (r0 != 0) goto L2b
            r0 = r3
            goto L47
        L2b:
            r0 = r4
        L2c:
            if (r0 != r2) goto L3a
            android.util.SparseArray r0 = r8.f74636a
            boolean r0 = com.google.android.gms.internal.ads.OV.g(r0, r2)
            if (r0 == 0) goto L38
            r0 = r2
            goto L3a
        L38:
            r0 = r1
            goto L47
        L3a:
            r5 = 30
            if (r0 != r5) goto L47
            android.util.SparseArray r6 = r8.f74636a
            boolean r5 = com.google.android.gms.internal.ads.OV.g(r6, r5)
            if (r5 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r5 = r8.f74636a
            boolean r5 = com.google.android.gms.internal.ads.OV.g(r5, r0)
            if (r5 == 0) goto Lc3
            android.util.SparseArray r5 = r8.f74636a
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.gC0 r5 = (com.google.android.gms.internal.ads.C8087gC0) r5
            r5.getClass()
            int r6 = r9.f65641D
            r7 = -1
            if (r6 == r7) goto L7e
            if (r0 != r4) goto L62
            goto L7e
        L62:
            java.lang.String r9 = r9.f65664o
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            int r9 = com.google.android.gms.internal.ads.OV.f69091a
            r10 = 33
            if (r9 >= r10) goto L77
            r9 = 10
            if (r6 <= r9) goto L89
            goto Lc3
        L77:
            boolean r9 = r5.b(r6)
            if (r9 != 0) goto L89
            goto Lc3
        L7e:
            int r9 = r9.f65642E
            if (r9 != r7) goto L85
            r9 = 48000(0xbb80, float:6.7262E-41)
        L85:
            int r6 = r5.a(r9, r10)
        L89:
            int r9 = com.google.android.gms.internal.ads.OV.f69091a
            r10 = 28
            if (r9 > r10) goto L9d
            if (r6 != r1) goto L92
            goto L9e
        L92:
            r10 = 3
            if (r6 == r10) goto L9b
            r10 = 4
            if (r6 == r10) goto L9b
            r10 = 5
            if (r6 != r10) goto L9d
        L9b:
            r2 = r3
            goto L9e
        L9d:
            r2 = r6
        L9e:
            r10 = 26
            if (r9 > r10) goto Lb0
            java.lang.String r9 = "fugu"
            java.lang.String r10 = com.google.android.gms.internal.ads.OV.f69092b
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r9 = 1
            if (r2 != r9) goto Lb0
            r2 = 2
        Lb0:
            int r9 = com.google.android.gms.internal.ads.OV.A(r2)
            if (r9 == 0) goto Lc3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc3:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8194hC0.b(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.HR):android.util.Pair");
    }

    public final int hashCode() {
        int iContentHashCode;
        int i10 = OV.f69091a;
        SparseArray sparseArray = this.f74636a;
        if (i10 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
            }
            iContentHashCode = iKeyAt;
        }
        return this.f74637b + (iContentHashCode * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f74637b + ", audioProfiles=" + this.f74636a.toString() + "]";
    }

    private C8194hC0(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C8087gC0 c8087gC0 = (C8087gC0) list.get(i10);
            this.f74636a.put(c8087gC0.f74280a, c8087gC0);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f74636a.size(); i11++) {
            iMax = Math.max(iMax, ((C8087gC0) this.f74636a.valueAt(i11)).f74281b);
        }
        this.f74637b = iMax;
    }

    static Uri a() {
        if (f()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }
}

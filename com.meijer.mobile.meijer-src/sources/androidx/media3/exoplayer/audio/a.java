package androidx.media3.exoplayer.audio;

import Ee.L;
import Ee.M;
import Ee.O;
import Ee.y0;
import a3.C5647d;
import a3.t;
import a3.z;
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
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import d3.C13599a;
import d3.P;
import j3.C14931a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f56105c = new a(L.y(e.f56110d));

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private static final L<Integer> f56106d = L.B(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    static final M<Integer, Integer> f56107e = new M.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<e> f56108a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56109b;

    private static final class b {
        public static boolean b(AudioManager audioManager, androidx.media3.exoplayer.audio.c cVar) {
            AudioDeviceInfo[] devices = cVar == null ? ((AudioManager) C13599a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{cVar.f56129a};
            O<Integer> oA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (oA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }

        private static O<Integer> a() {
            O.a aVarI = new O.a().i(8, 7);
            int i10 = P.f127888a;
            if (i10 >= 31) {
                aVarI.i(26, 27);
            }
            if (i10 >= 33) {
                aVarI.a(30);
            }
            return aVarI.l();
        }
    }

    private static final class c {
        public static int b(int i10, int i11, C5647d c5647d) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iL = P.L(i12);
                if (iL != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iL).build(), c5647d.a().f44641a)) {
                    return i12;
                }
            }
            return 0;
        }

        public static L<Integer> a(C5647d c5647d) {
            L.a aVarP = L.p();
            y0<Integer> it = a.f56107e.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (P.f127888a >= P.J(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c5647d.a().f44641a)) {
                    aVarP.a(next);
                }
            }
            aVarP.a(2);
            return aVarP.k();
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f56110d;

        /* renamed from: a, reason: collision with root package name */
        public final int f56111a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56112b;

        /* renamed from: c, reason: collision with root package name */
        private final O<Integer> f56113c;

        public e(int i10, Set<Integer> set) {
            this.f56111a = i10;
            O<Integer> oS = O.s(set);
            this.f56113c = oS;
            y0<Integer> it = oS.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f56112b = iMax;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f56111a == eVar.f56111a && this.f56112b == eVar.f56112b && Objects.equals(this.f56113c, eVar.f56113c);
        }

        static {
            f56110d = P.f127888a >= 33 ? new e(2, a(10)) : new e(2, 10);
        }

        private static O<Integer> a(int i10) {
            O.a aVar = new O.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(P.L(i11)));
            }
            return aVar.l();
        }

        public int b(int i10, C5647d c5647d) {
            return this.f56113c != null ? this.f56112b : P.f127888a >= 29 ? c.b(this.f56111a, i10, c5647d) : ((Integer) C13599a.e(a.f56107e.getOrDefault(Integer.valueOf(this.f56111a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f56113c == null) {
                return i10 <= this.f56112b;
            }
            int iL = P.L(i10);
            if (iL == 0) {
                return false;
            }
            return this.f56113c.contains(Integer.valueOf(iL));
        }

        public int hashCode() {
            int i10 = ((this.f56111a * 31) + this.f56112b) * 31;
            O<Integer> o10 = this.f56113c;
            return i10 + (o10 == null ? 0 : o10.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f56111a + ", maxChannelCount=" + this.f56112b + ", channelMasks=" + this.f56113c + "]";
        }

        public e(int i10, int i11) {
            this.f56111a = i10;
            this.f56112b = i11;
            this.f56113c = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return P.s(this.f56108a, aVar.f56108a) && this.f56109b == aVar.f56109b;
    }

    private static final class d {
        public static androidx.media3.exoplayer.audio.c b(AudioManager audioManager, C5647d c5647d) {
            try {
                List audioDevicesForAttributes = ((AudioManager) C13599a.e(audioManager)).getAudioDevicesForAttributes(c5647d.a().f44641a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new androidx.media3.exoplayer.audio.c((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }

        public static a a(AudioManager audioManager, C5647d c5647d) {
            return new a(a.c(audioManager.getDirectProfilesForAttributes(c5647d.a().f44641a)));
        }
    }

    private a(List<e> list) {
        this.f56108a = new SparseArray<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            this.f56108a.put(eVar.f56111a, eVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f56108a.size(); i11++) {
            iMax = Math.max(iMax, this.f56108a.valueAt(i11).f56112b);
        }
        this.f56109b = iMax;
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public static L<e> c(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(Je.f.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfileA = C14931a.a(list.get(i10));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (P.C0(format) || f56107e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) C13599a.e((Set) map.get(Integer.valueOf(format)))).addAll(Je.f.c(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(Je.f.c(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        L.a aVarP = L.p();
        for (Map.Entry entry : map.entrySet()) {
            aVarP.a(new e(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return aVarP.k();
    }

    @SuppressLint({"UnprotectedReceiver"})
    static a e(Context context, C5647d c5647d, androidx.media3.exoplayer.audio.c cVar) {
        return f(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c5647d, cVar);
    }

    private static int g(int i10) {
        int i11 = P.f127888a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        return P.L(i10);
    }

    public Pair<Integer, Integer> h(t tVar, C5647d c5647d) {
        int iF = z.f((String) C13599a.e(tVar.f44767o), tVar.f44763k);
        if (!f56107e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !k(18)) {
            iF = 6;
        } else if ((iF == 8 && !k(8)) || (iF == 30 && !k(30))) {
            iF = 7;
        }
        if (!k(iF)) {
            return null;
        }
        e eVar = (e) C13599a.e(this.f56108a.get(iF));
        int iB = tVar.f44742E;
        if (iB == -1 || iF == 18) {
            int i10 = tVar.f44743F;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB = eVar.b(i10, c5647d);
        } else if (!tVar.f44767o.equals("audio/vnd.dts.uhd;profile=p2") || P.f127888a >= 33) {
            if (!eVar.c(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int iG = g(iB);
        if (iG == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iG));
    }

    public int hashCode() {
        return this.f56109b + (P.t(this.f56108a) * 31);
    }

    public boolean k(int i10) {
        return P.q(this.f56108a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f56109b + ", audioProfiles=" + this.f56108a + "]";
    }

    private static L<e> d(int[] iArr, int i10) {
        L.a aVarP = L.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVarP.a(new e(i11, i10));
        }
        return aVarP.k();
    }

    @SuppressLint({"InlinedApi"})
    static a f(Context context, Intent intent, C5647d c5647d, androidx.media3.exoplayer.audio.c cVar) {
        boolean z10;
        AudioManager audioManagerC = b3.m.c(context);
        if (cVar == null) {
            if (P.f127888a >= 33) {
                cVar = d.b(audioManagerC, c5647d);
            } else {
                cVar = null;
            }
        }
        int i10 = P.f127888a;
        if (i10 >= 33 && (P.G0(context) || P.z0(context))) {
            return d.a(audioManagerC, c5647d);
        }
        if (i10 >= 23 && b.b(audioManagerC, cVar)) {
            return f56105c;
        }
        O.a aVar = new O.a();
        aVar.a(2);
        if (i10 >= 29 && (P.G0(context) || P.z0(context))) {
            aVar.j(c.a(c5647d));
            return new a(d(Je.f.l(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f56106d);
        }
        if (intent != null && !z10 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                aVar.j(Je.f.c(intArrayExtra));
            }
            return new a(d(Je.f.l(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new a(d(Je.f.l(aVar.l()), 10));
    }

    static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean j(t tVar, C5647d c5647d) {
        if (h(tVar, c5647d) != null) {
            return true;
        }
        return false;
    }
}

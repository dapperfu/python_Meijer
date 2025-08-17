package androidx.media3.exoplayer.audio;

import Ce.L;
import Ce.M;
import Ce.O;
import Ce.y0;
import a3.C5564d;
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
import d3.C13466a;
import d3.P;
import j3.C14843a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f55881c = new a(L.y(e.f55886d));

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private static final L<Integer> f55882d = L.B(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    static final M<Integer, Integer> f55883e = new M.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<e> f55884a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55885b;

    private static final class b {
        public static boolean b(AudioManager audioManager, androidx.media3.exoplayer.audio.c cVar) {
            AudioDeviceInfo[] devices = cVar == null ? ((AudioManager) C13466a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{cVar.f55905a};
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
            int i10 = P.f127086a;
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
        public static int b(int i10, int i11, C5564d c5564d) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iL = P.L(i12);
                if (iL != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iL).build(), c5564d.a().f43823a)) {
                    return i12;
                }
            }
            return 0;
        }

        public static L<Integer> a(C5564d c5564d) {
            L.a aVarP = L.p();
            y0<Integer> it = a.f55883e.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (P.f127086a >= P.J(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c5564d.a().f43823a)) {
                    aVarP.a(next);
                }
            }
            aVarP.a(2);
            return aVarP.k();
        }
    }

    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f55886d;

        /* renamed from: a, reason: collision with root package name */
        public final int f55887a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55888b;

        /* renamed from: c, reason: collision with root package name */
        private final O<Integer> f55889c;

        public e(int i10, Set<Integer> set) {
            this.f55887a = i10;
            O<Integer> oS = O.s(set);
            this.f55889c = oS;
            y0<Integer> it = oS.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f55888b = iMax;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f55887a == eVar.f55887a && this.f55888b == eVar.f55888b && Objects.equals(this.f55889c, eVar.f55889c);
        }

        static {
            f55886d = P.f127086a >= 33 ? new e(2, a(10)) : new e(2, 10);
        }

        private static O<Integer> a(int i10) {
            O.a aVar = new O.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(P.L(i11)));
            }
            return aVar.l();
        }

        public int b(int i10, C5564d c5564d) {
            return this.f55889c != null ? this.f55888b : P.f127086a >= 29 ? c.b(this.f55887a, i10, c5564d) : ((Integer) C13466a.e(a.f55883e.getOrDefault(Integer.valueOf(this.f55887a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f55889c == null) {
                return i10 <= this.f55888b;
            }
            int iL = P.L(i10);
            if (iL == 0) {
                return false;
            }
            return this.f55889c.contains(Integer.valueOf(iL));
        }

        public int hashCode() {
            int i10 = ((this.f55887a * 31) + this.f55888b) * 31;
            O<Integer> o10 = this.f55889c;
            return i10 + (o10 == null ? 0 : o10.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f55887a + ", maxChannelCount=" + this.f55888b + ", channelMasks=" + this.f55889c + "]";
        }

        public e(int i10, int i11) {
            this.f55887a = i10;
            this.f55888b = i11;
            this.f55889c = null;
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
        return P.s(this.f55884a, aVar.f55884a) && this.f55885b == aVar.f55885b;
    }

    private static final class d {
        public static androidx.media3.exoplayer.audio.c b(AudioManager audioManager, C5564d c5564d) {
            try {
                List audioDevicesForAttributes = ((AudioManager) C13466a.e(audioManager)).getAudioDevicesForAttributes(c5564d.a().f43823a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new androidx.media3.exoplayer.audio.c((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }

        public static a a(AudioManager audioManager, C5564d c5564d) {
            return new a(a.c(audioManager.getDirectProfilesForAttributes(c5564d.a().f43823a)));
        }
    }

    private a(List<e> list) {
        this.f55884a = new SparseArray<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            this.f55884a.put(eVar.f55887a, eVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f55884a.size(); i11++) {
            iMax = Math.max(iMax, this.f55884a.valueAt(i11).f55888b);
        }
        this.f55885b = iMax;
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public static L<e> c(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(He.f.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfileA = C14843a.a(list.get(i10));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (P.C0(format) || f55883e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) C13466a.e((Set) map.get(Integer.valueOf(format)))).addAll(He.f.c(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(He.f.c(audioProfileA.getChannelMasks())));
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
    static a e(Context context, C5564d c5564d, androidx.media3.exoplayer.audio.c cVar) {
        return f(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c5564d, cVar);
    }

    private static int g(int i10) {
        int i11 = P.f127086a;
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

    public Pair<Integer, Integer> h(t tVar, C5564d c5564d) {
        int iF = z.f((String) C13466a.e(tVar.f43949o), tVar.f43945k);
        if (!f55883e.containsKey(Integer.valueOf(iF))) {
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
        e eVar = (e) C13466a.e(this.f55884a.get(iF));
        int iB = tVar.f43924E;
        if (iB == -1 || iF == 18) {
            int i10 = tVar.f43925F;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB = eVar.b(i10, c5564d);
        } else if (!tVar.f43949o.equals("audio/vnd.dts.uhd;profile=p2") || P.f127086a >= 33) {
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
        return this.f55885b + (P.t(this.f55884a) * 31);
    }

    public boolean k(int i10) {
        return P.q(this.f55884a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f55885b + ", audioProfiles=" + this.f55884a + "]";
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
    static a f(Context context, Intent intent, C5564d c5564d, androidx.media3.exoplayer.audio.c cVar) {
        boolean z10;
        AudioManager audioManagerC = b3.m.c(context);
        if (cVar == null) {
            if (P.f127086a >= 33) {
                cVar = d.b(audioManagerC, c5564d);
            } else {
                cVar = null;
            }
        }
        int i10 = P.f127086a;
        if (i10 >= 33 && (P.G0(context) || P.z0(context))) {
            return d.a(audioManagerC, c5564d);
        }
        if (i10 >= 23 && b.b(audioManagerC, cVar)) {
            return f55881c;
        }
        O.a aVar = new O.a();
        aVar.a(2);
        if (i10 >= 29 && (P.G0(context) || P.z0(context))) {
            aVar.j(c.a(c5564d));
            return new a(d(He.f.l(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f55882d);
        }
        if (intent != null && !z10 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                aVar.j(He.f.c(intArrayExtra));
            }
            return new a(d(He.f.l(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new a(d(He.f.l(aVar.l()), 10));
    }

    static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean j(t tVar, C5564d c5564d) {
        if (h(tVar, c5564d) != null) {
            return true;
        }
        return false;
    }
}

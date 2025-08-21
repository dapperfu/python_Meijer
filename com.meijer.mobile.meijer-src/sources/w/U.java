package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import z.C18397n;

/* loaded from: classes.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    private final a f166393a;

    /* renamed from: b, reason: collision with root package name */
    private final C18397n f166394b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, Size[]> f166395c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size[]> f166396d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Size[]> f166397e = new HashMap();

    interface a {
        StreamConfigurationMap a();

        Size[] b(int i10);

        int[] c();

        Size[] d(int i10);
    }

    static U e(StreamConfigurationMap streamConfigurationMap, C18397n c18397n) {
        return new U(streamConfigurationMap, c18397n);
    }

    public Size[] a(int i10) {
        if (this.f166396d.containsKey(Integer.valueOf(i10))) {
            if (this.f166396d.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f166396d.get(Integer.valueOf(i10)).clone();
        }
        Size[] sizeArrD = this.f166393a.d(i10);
        if (sizeArrD != null && sizeArrD.length > 0) {
            sizeArrD = this.f166394b.b(sizeArrD, i10);
        }
        this.f166396d.put(Integer.valueOf(i10), sizeArrD);
        if (sizeArrD != null) {
            return (Size[]) sizeArrD.clone();
        }
        return null;
    }

    public int[] b() {
        int[] iArrC = this.f166393a.c();
        if (iArrC == null) {
            return null;
        }
        return (int[]) iArrC.clone();
    }

    public Size[] c(int i10) {
        if (this.f166395c.containsKey(Integer.valueOf(i10))) {
            if (this.f166395c.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f166395c.get(Integer.valueOf(i10)).clone();
        }
        Size[] sizeArrB = this.f166393a.b(i10);
        if (sizeArrB != null && sizeArrB.length != 0) {
            Size[] sizeArrB2 = this.f166394b.b(sizeArrB, i10);
            this.f166395c.put(Integer.valueOf(i10), sizeArrB2);
            return (Size[]) sizeArrB2.clone();
        }
        C.P.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return sizeArrB;
    }

    public StreamConfigurationMap d() {
        return this.f166393a.a();
    }

    private U(StreamConfigurationMap streamConfigurationMap, C18397n c18397n) {
        this.f166393a = new V(streamConfigurationMap);
        this.f166394b = c18397n;
    }
}

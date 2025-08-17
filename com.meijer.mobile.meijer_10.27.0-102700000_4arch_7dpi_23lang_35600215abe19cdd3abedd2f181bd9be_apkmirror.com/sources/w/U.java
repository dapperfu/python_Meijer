package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import z.C18334n;

/* loaded from: classes.dex */
public class U {

    /* renamed from: a, reason: collision with root package name */
    private final a f165182a;

    /* renamed from: b, reason: collision with root package name */
    private final C18334n f165183b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, Size[]> f165184c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size[]> f165185d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Size[]> f165186e = new HashMap();

    interface a {
        StreamConfigurationMap a();

        Size[] b(int i10);

        int[] c();

        Size[] d(int i10);
    }

    static U e(StreamConfigurationMap streamConfigurationMap, C18334n c18334n) {
        return new U(streamConfigurationMap, c18334n);
    }

    public Size[] a(int i10) {
        if (this.f165185d.containsKey(Integer.valueOf(i10))) {
            if (this.f165185d.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f165185d.get(Integer.valueOf(i10)).clone();
        }
        Size[] sizeArrD = this.f165182a.d(i10);
        if (sizeArrD != null && sizeArrD.length > 0) {
            sizeArrD = this.f165183b.b(sizeArrD, i10);
        }
        this.f165185d.put(Integer.valueOf(i10), sizeArrD);
        if (sizeArrD != null) {
            return (Size[]) sizeArrD.clone();
        }
        return null;
    }

    public int[] b() {
        int[] iArrC = this.f165182a.c();
        if (iArrC == null) {
            return null;
        }
        return (int[]) iArrC.clone();
    }

    public Size[] c(int i10) {
        if (this.f165184c.containsKey(Integer.valueOf(i10))) {
            if (this.f165184c.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f165184c.get(Integer.valueOf(i10)).clone();
        }
        Size[] sizeArrB = this.f165182a.b(i10);
        if (sizeArrB != null && sizeArrB.length != 0) {
            Size[] sizeArrB2 = this.f165183b.b(sizeArrB, i10);
            this.f165184c.put(Integer.valueOf(i10), sizeArrB2);
            return (Size[]) sizeArrB2.clone();
        }
        C.P.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return sizeArrB;
    }

    public StreamConfigurationMap d() {
        return this.f165182a.a();
    }

    private U(StreamConfigurationMap streamConfigurationMap, C18334n c18334n) {
        this.f165182a = new V(streamConfigurationMap);
        this.f165183b = c18334n;
    }
}

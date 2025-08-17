package v;

import F.InterfaceC3625w;
import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.AbstractC5650a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class F0 implements InterfaceC3625w {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, I1> f163668a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC17374f f163669b;

    public F0(Context context, Object obj, Set<String> set) throws CameraUnavailableException {
        this(context, new a(), obj, set);
    }

    class a implements InterfaceC17374f {
        a() {
        }

        @Override // v.InterfaceC17374f
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // v.InterfaceC17374f
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    F0(Context context, InterfaceC17374f interfaceC17374f, Object obj, Set<String> set) throws CameraUnavailableException {
        this.f163668a = new HashMap();
        o2.i.g(interfaceC17374f);
        this.f163669b = interfaceC17374f;
        c(context, obj instanceof w.O ? (w.O) obj : w.O.a(context), set);
    }

    @Override // F.InterfaceC3625w
    public F.v0 b(int i10, String str, int i11, Size size) {
        I1 i12 = this.f163668a.get(str);
        if (i12 != null) {
            return i12.M(i10, i11, size);
        }
        return null;
    }

    private void c(Context context, w.O o10, Set<String> set) throws CameraUnavailableException {
        o2.i.g(context);
        for (String str : set) {
            this.f163668a.put(str, new I1(context, str, o10, this.f163669b));
        }
    }

    @Override // F.InterfaceC3625w
    public Pair<Map<androidx.camera.core.impl.D<?>, androidx.camera.core.impl.x>, Map<AbstractC5650a, androidx.camera.core.impl.x>> a(int i10, String str, List<AbstractC5650a> list, Map<androidx.camera.core.impl.D<?>, List<Size>> map, boolean z10, boolean z11) {
        o2.i.b(!map.isEmpty(), "No new use cases to be bound.");
        I1 i12 = this.f163668a.get(str);
        if (i12 != null) {
            return i12.A(i10, list, map, z10, z11);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }
}

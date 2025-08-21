package v;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class G0 implements F.N {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f164705a;

    /* renamed from: b, reason: collision with root package name */
    private final String f164706b;

    /* renamed from: c, reason: collision with root package name */
    private final int f164707c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Object> f164708d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final F.l0 f164709e;

    public G0(String str, F.l0 l0Var) throws NumberFormatException {
        boolean z10;
        int i10;
        this.f164706b = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            C.P.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f164705a = z10;
        this.f164707c = i10;
        this.f164709e = l0Var;
    }
}

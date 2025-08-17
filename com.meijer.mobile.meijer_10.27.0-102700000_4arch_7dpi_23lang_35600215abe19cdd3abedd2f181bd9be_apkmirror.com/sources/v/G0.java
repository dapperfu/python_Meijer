package v;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class G0 implements F.N {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f163671a;

    /* renamed from: b, reason: collision with root package name */
    private final String f163672b;

    /* renamed from: c, reason: collision with root package name */
    private final int f163673c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Object> f163674d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final F.l0 f163675e;

    public G0(String str, F.l0 l0Var) throws NumberFormatException {
        boolean z10;
        int i10;
        this.f163672b = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            C.P.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f163671a = z10;
        this.f163673c = i10;
        this.f163675e = l0Var;
    }
}

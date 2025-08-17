package v;

import C.C2972o;
import F.InterfaceC3626x;
import F.InterfaceC3628z;
import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: v.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17424w implements InterfaceC3626x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f164196a;

    /* renamed from: b, reason: collision with root package name */
    private final D.a f164197b;

    /* renamed from: c, reason: collision with root package name */
    private final F.F f164198c;

    /* renamed from: d, reason: collision with root package name */
    private final F.E f164199d;

    /* renamed from: e, reason: collision with root package name */
    private final w.O f164200e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f164201f;

    /* renamed from: g, reason: collision with root package name */
    private final C17385i1 f164202g;

    /* renamed from: h, reason: collision with root package name */
    private final long f164203h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, T> f164204i = new HashMap();

    private List<String> e(List<String> list) throws InitializationException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (O0.a(this.f164200e, str)) {
                arrayList.add(str);
            } else {
                C.P.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    @Override // F.InterfaceC3626x
    public InterfaceC3628z a(String str) throws CameraUnavailableException {
        if (this.f164201f.contains(str)) {
            return new M(this.f164196a, this.f164200e, str, f(str), this.f164197b, this.f164199d, this.f164198c.b(), this.f164198c.c(), this.f164202g, this.f164203h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // F.InterfaceC3626x
    public Set<String> b() {
        return new LinkedHashSet(this.f164201f);
    }

    @Override // F.InterfaceC3626x
    public D.a d() {
        return this.f164197b;
    }

    T f(String str) throws CameraUnavailableException {
        try {
            T t10 = this.f164204i.get(str);
            if (t10 != null) {
                return t10;
            }
            T t11 = new T(str, this.f164200e);
            this.f164204i.put(str, t11);
            return t11;
        } catch (CameraAccessExceptionCompat e10) {
            throw R0.a(e10);
        }
    }

    @Override // F.InterfaceC3626x
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public w.O c() {
        return this.f164200e;
    }

    public C17424w(Context context, F.F f10, C2972o c2972o, long j10) throws InitializationException {
        this.f164196a = context;
        this.f164198c = f10;
        w.O oB = w.O.b(context, f10.c());
        this.f164200e = oB;
        this.f164202g = C17385i1.c(context);
        this.f164201f = e(P0.b(this, c2972o));
        A.a aVar = new A.a(oB);
        this.f164197b = aVar;
        F.E e10 = new F.E(aVar, 1);
        this.f164199d = e10;
        aVar.b(e10);
        this.f164203h = j10;
    }
}

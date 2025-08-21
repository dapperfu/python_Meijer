package v;

import C.C3030o;
import F.InterfaceC3288x;
import F.InterfaceC3290z;
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
public final class C17563w implements InterfaceC3288x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f165230a;

    /* renamed from: b, reason: collision with root package name */
    private final D.a f165231b;

    /* renamed from: c, reason: collision with root package name */
    private final F.F f165232c;

    /* renamed from: d, reason: collision with root package name */
    private final F.E f165233d;

    /* renamed from: e, reason: collision with root package name */
    private final w.O f165234e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f165235f;

    /* renamed from: g, reason: collision with root package name */
    private final C17524i1 f165236g;

    /* renamed from: h, reason: collision with root package name */
    private final long f165237h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, T> f165238i = new HashMap();

    private List<String> e(List<String> list) throws InitializationException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (O0.a(this.f165234e, str)) {
                arrayList.add(str);
            } else {
                C.P.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    @Override // F.InterfaceC3288x
    public InterfaceC3290z a(String str) throws CameraUnavailableException {
        if (this.f165235f.contains(str)) {
            return new M(this.f165230a, this.f165234e, str, f(str), this.f165231b, this.f165233d, this.f165232c.b(), this.f165232c.c(), this.f165236g, this.f165237h);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // F.InterfaceC3288x
    public Set<String> b() {
        return new LinkedHashSet(this.f165235f);
    }

    @Override // F.InterfaceC3288x
    public D.a d() {
        return this.f165231b;
    }

    T f(String str) throws CameraUnavailableException {
        try {
            T t10 = this.f165238i.get(str);
            if (t10 != null) {
                return t10;
            }
            T t11 = new T(str, this.f165234e);
            this.f165238i.put(str, t11);
            return t11;
        } catch (CameraAccessExceptionCompat e10) {
            throw R0.a(e10);
        }
    }

    @Override // F.InterfaceC3288x
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public w.O c() {
        return this.f165234e;
    }

    public C17563w(Context context, F.F f10, C3030o c3030o, long j10) throws InitializationException {
        this.f165230a = context;
        this.f165232c = f10;
        w.O oB = w.O.b(context, f10.c());
        this.f165234e = oB;
        this.f165236g = C17524i1.c(context);
        this.f165235f = e(P0.b(this, c3030o));
        A.a aVar = new A.a(oB);
        this.f165231b = aVar;
        F.E e10 = new F.E(aVar, 1);
        this.f165233d = e10;
        aVar.b(e10);
        this.f165237h = j10;
    }
}

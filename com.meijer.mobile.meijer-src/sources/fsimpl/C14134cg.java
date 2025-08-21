package fsimpl;

import android.content.res.Resources;
import java.util.Map;
import java.util.Set;

/* renamed from: fsimpl.cg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14134cg extends AbstractC14135ch {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133167a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC14130cc f133168b;

    static {
        InterfaceC14130cc interfaceC14130ccA = a(fT.a(fT.a(fT.a("androidx.core.graphics.TypefaceCompat"), "sTypefaceCache"), (Object) null));
        f133168b = interfaceC14130ccA;
        f133167a = interfaceC14130ccA != null;
    }

    C14134cg() {
    }

    private static InterfaceC14130cc a(Object obj) {
        if (C14128ca.a(obj)) {
            return new C14128ca(obj);
        }
        return null;
    }

    @Override // fsimpl.AbstractC14135ch
    public void a(Map map, Set set, Resources resources) {
        if (a()) {
            a(map, set, resources, f133168b);
        }
    }

    @Override // fsimpl.AbstractC14135ch
    protected boolean a() {
        if (f133167a) {
            return super.a();
        }
        return false;
    }

    @Override // fsimpl.AbstractC14135ch
    protected boolean b() {
        return false;
    }
}

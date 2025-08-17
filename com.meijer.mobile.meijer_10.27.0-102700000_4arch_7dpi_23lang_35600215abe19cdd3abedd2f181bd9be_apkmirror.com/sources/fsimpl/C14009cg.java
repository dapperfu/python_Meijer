package fsimpl;

import android.content.res.Resources;
import java.util.Map;
import java.util.Set;

/* renamed from: fsimpl.cg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14009cg extends AbstractC14010ch {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f131917a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC14005cc f131918b;

    static {
        InterfaceC14005cc interfaceC14005ccA = a(fT.a(fT.a(fT.a("androidx.core.graphics.TypefaceCompat"), "sTypefaceCache"), (Object) null));
        f131918b = interfaceC14005ccA;
        f131917a = interfaceC14005ccA != null;
    }

    C14009cg() {
    }

    private static InterfaceC14005cc a(Object obj) {
        if (C14003ca.a(obj)) {
            return new C14003ca(obj);
        }
        return null;
    }

    @Override // fsimpl.AbstractC14010ch
    public void a(Map map, Set set, Resources resources) {
        if (a()) {
            a(map, set, resources, f131918b);
        }
    }

    @Override // fsimpl.AbstractC14010ch
    protected boolean a() {
        if (f131917a) {
            return super.a();
        }
        return false;
    }

    @Override // fsimpl.AbstractC14010ch
    protected boolean b() {
        return false;
    }
}

package fsimpl;

import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: fsimpl.bi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14109bi {

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f133080a = new WeakHashMap();

    public C14110bj a(Drawable drawable) {
        C14110bj c14110bj;
        if (gb.b(drawable)) {
            this.f133080a.remove(drawable);
            return null;
        }
        HashMap map = (HashMap) this.f133080a.get(drawable);
        if (map == null || (c14110bj = (C14110bj) map.get(ga.a(drawable))) == null) {
            return null;
        }
        return c14110bj;
    }

    public void a(Drawable drawable, String str, int i10, int i11) {
        if (gb.b(drawable)) {
            return;
        }
        HashMap map = (HashMap) this.f133080a.get(drawable);
        if (map == null) {
            map = new HashMap();
        }
        C14110bj c14110bj = new C14110bj(this);
        c14110bj.f133081a = str;
        c14110bj.f133082b = i10;
        c14110bj.f133083c = i11;
        map.put(ga.a(drawable), c14110bj);
        this.f133080a.put(drawable, map);
    }
}

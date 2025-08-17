package fsimpl;

import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: fsimpl.bi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13984bi {

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f131830a = new WeakHashMap();

    public C13985bj a(Drawable drawable) {
        C13985bj c13985bj;
        if (gb.b(drawable)) {
            this.f131830a.remove(drawable);
            return null;
        }
        HashMap map = (HashMap) this.f131830a.get(drawable);
        if (map == null || (c13985bj = (C13985bj) map.get(ga.a(drawable))) == null) {
            return null;
        }
        return c13985bj;
    }

    public void a(Drawable drawable, String str, int i10, int i11) {
        if (gb.b(drawable)) {
            return;
        }
        HashMap map = (HashMap) this.f131830a.get(drawable);
        if (map == null) {
            map = new HashMap();
        }
        C13985bj c13985bj = new C13985bj(this);
        c13985bj.f131831a = str;
        c13985bj.f131832b = i10;
        c13985bj.f131833c = i11;
        map.put(ga.a(drawable), c13985bj);
        this.f131830a.put(drawable, map);
    }
}

package fsimpl;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fsimpl.bk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13986bk {

    /* renamed from: a, reason: collision with root package name */
    private Map f131835a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private aU f131836b;

    public C13986bk(aU aUVar) {
        this.f131836b = aUVar;
    }

    public int a(Bitmap bitmap) {
        int iA = this.f131836b.a();
        this.f131835a.put(Integer.valueOf(iA), bitmap);
        return iA;
    }

    public Map a() {
        if (this.f131835a.size() == 0) {
            return null;
        }
        Map map = this.f131835a;
        this.f131835a = new HashMap();
        return map;
    }
}

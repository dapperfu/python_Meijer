package fsimpl;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fsimpl.bk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14111bk {

    /* renamed from: a, reason: collision with root package name */
    private Map f133085a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private aU f133086b;

    public C14111bk(aU aUVar) {
        this.f133086b = aUVar;
    }

    public int a(Bitmap bitmap) {
        int iA = this.f133086b.a();
        this.f133085a.put(Integer.valueOf(iA), bitmap);
        return iA;
    }

    public Map a() {
        if (this.f133085a.size() == 0) {
            return null;
        }
        Map map = this.f133085a;
        this.f133085a = new HashMap();
        return map;
    }
}

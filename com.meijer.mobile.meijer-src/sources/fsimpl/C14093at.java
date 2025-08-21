package fsimpl;

import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.WeakHashMap;

/* renamed from: fsimpl.at, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14093at {

    /* renamed from: c, reason: collision with root package name */
    private C14138ck f132965c;

    /* renamed from: b, reason: collision with root package name */
    private WeakHashMap f132964b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C14133cf f132963a = new C14133cf();

    public C14093at(C14138ck c14138ck) {
        this.f132965c = c14138ck;
    }

    private String b(Typeface typeface) {
        String str = (String) this.f132964b.get(typeface);
        return str == null ? this.f132963a.a(typeface) : str;
    }

    public Integer a(Typeface typeface) {
        String strB = b(typeface);
        if (strB == null) {
            return null;
        }
        return (Integer) this.f132965c.H().get(strB);
    }

    public void a(Resources resources) {
        this.f132963a.a(this.f132965c, resources);
    }

    public void a(Typeface typeface, Typeface typeface2) {
        String str = (String) this.f132964b.get(typeface2);
        if (str != null) {
            this.f132964b.put(typeface, str);
        }
    }

    public void a(Typeface typeface, String str) {
        this.f132964b.put(typeface, str);
    }
}

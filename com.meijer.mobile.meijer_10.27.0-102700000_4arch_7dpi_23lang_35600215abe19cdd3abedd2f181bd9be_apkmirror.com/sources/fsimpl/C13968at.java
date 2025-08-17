package fsimpl;

import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.WeakHashMap;

/* renamed from: fsimpl.at, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13968at {

    /* renamed from: c, reason: collision with root package name */
    private C14013ck f131715c;

    /* renamed from: b, reason: collision with root package name */
    private WeakHashMap f131714b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C14008cf f131713a = new C14008cf();

    public C13968at(C14013ck c14013ck) {
        this.f131715c = c14013ck;
    }

    private String b(Typeface typeface) {
        String str = (String) this.f131714b.get(typeface);
        return str == null ? this.f131713a.a(typeface) : str;
    }

    public Integer a(Typeface typeface) {
        String strB = b(typeface);
        if (strB == null) {
            return null;
        }
        return (Integer) this.f131715c.H().get(strB);
    }

    public void a(Resources resources) {
        this.f131713a.a(this.f131715c, resources);
    }

    public void a(Typeface typeface, Typeface typeface2) {
        String str = (String) this.f131714b.get(typeface2);
        if (str != null) {
            this.f131714b.put(typeface, str);
        }
    }

    public void a(Typeface typeface, String str) {
        this.f131714b.put(typeface, str);
    }
}

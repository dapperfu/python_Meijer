package fsimpl;

import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;

/* renamed from: fsimpl.bg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14107bg {

    /* renamed from: a, reason: collision with root package name */
    private static gf f133073a = new gf();

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap f133074b = new WeakHashMap();

    public static synchronized int a(Drawable drawable) {
        return f133073a.b(drawable);
    }

    public static synchronized void a(Drawable drawable, int i10) {
        f133073a.a(drawable, i10);
        f133074b.put(drawable, ga.a(drawable));
    }

    public static synchronized ga b(Drawable drawable) {
        return (ga) f133074b.get(drawable);
    }
}

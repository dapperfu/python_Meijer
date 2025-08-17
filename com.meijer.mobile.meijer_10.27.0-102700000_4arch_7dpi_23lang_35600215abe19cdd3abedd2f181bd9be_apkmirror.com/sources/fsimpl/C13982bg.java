package fsimpl;

import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;

/* renamed from: fsimpl.bg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13982bg {

    /* renamed from: a, reason: collision with root package name */
    private static gf f131823a = new gf();

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap f131824b = new WeakHashMap();

    public static synchronized int a(Drawable drawable) {
        return f131823a.b(drawable);
    }

    public static synchronized void a(Drawable drawable, int i10) {
        f131823a.a(drawable, i10);
        f131824b.put(drawable, ga.a(drawable));
    }

    public static synchronized ga b(Drawable drawable) {
        return (ga) f131824b.get(drawable);
    }
}

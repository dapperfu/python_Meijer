package n6;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.fullstory.FS;
import h6.C14471b;
import java.util.HashMap;
import java.util.Map;
import o6.c;
import o6.i;
import v6.g;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15917a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f152077d;

    /* renamed from: a, reason: collision with root package name */
    private final i<String> f152074a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<i<String>, Typeface> f152075b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f152076c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private String f152078e = ".ttf";

    public void d(C14471b c14471b) {
    }

    private Typeface e(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i10 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : FS.typefaceCreateDerived(typeface, i10);
    }

    public Typeface b(c cVar) {
        this.f152074a.b(cVar.a(), cVar.c());
        Typeface typeface = this.f152075b.get(this.f152074a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.f152075b.put(this.f152074a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f152078e = str;
    }

    public C15917a(Drawable.Callback callback, C14471b c14471b) {
        if (!(callback instanceof View)) {
            g.c("LottieDrawable must be inside of a view for images to work.");
            this.f152077d = null;
        } else {
            this.f152077d = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface a(c cVar) {
        String strA = cVar.a();
        Typeface typeface = this.f152076c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        cVar.c();
        cVar.b();
        if (cVar.d() != null) {
            return cVar.d();
        }
        Typeface typefaceTypefaceCreateFromAsset = FS.typefaceCreateFromAsset(this.f152077d, "fonts/" + strA + this.f152078e);
        this.f152076c.put(strA, typefaceTypefaceCreateFromAsset);
        return typefaceTypefaceCreateFromAsset;
    }
}

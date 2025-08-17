package m6;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.fullstory.FS;
import g6.C14202b;
import java.util.HashMap;
import java.util.Map;
import n6.c;
import n6.i;
import u6.g;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15564a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f149865d;

    /* renamed from: a, reason: collision with root package name */
    private final i<String> f149862a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<i<String>, Typeface> f149863b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f149864c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private String f149866e = ".ttf";

    public void d(C14202b c14202b) {
    }

    private Typeface e(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i10 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : FS.typefaceCreateDerived(typeface, i10);
    }

    public Typeface b(c cVar) {
        this.f149862a.b(cVar.a(), cVar.c());
        Typeface typeface = this.f149863b.get(this.f149862a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.f149863b.put(this.f149862a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f149866e = str;
    }

    public C15564a(Drawable.Callback callback, C14202b c14202b) {
        if (!(callback instanceof View)) {
            g.c("LottieDrawable must be inside of a view for images to work.");
            this.f149865d = null;
        } else {
            this.f149865d = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface a(c cVar) {
        String strA = cVar.a();
        Typeface typeface = this.f149864c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        cVar.c();
        cVar.b();
        if (cVar.d() != null) {
            return cVar.d();
        }
        Typeface typefaceTypefaceCreateFromAsset = FS.typefaceCreateFromAsset(this.f149865d, "fonts/" + strA + this.f149866e);
        this.f149864c.put(strA, typefaceTypefaceCreateFromAsset);
        return typefaceTypefaceCreateFromAsset;
    }
}

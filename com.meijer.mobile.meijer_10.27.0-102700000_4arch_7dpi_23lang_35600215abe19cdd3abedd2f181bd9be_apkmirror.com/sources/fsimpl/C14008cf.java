package fsimpl;

import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: fsimpl.cf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14008cf {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC14010ch f131912a = new C14011ci();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC14010ch f131913b = new C14009cg();

    /* renamed from: c, reason: collision with root package name */
    private static final C14012cj f131914c = new C14012cj();

    /* renamed from: d, reason: collision with root package name */
    private final Map f131915d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Set f131916e = Collections.newSetFromMap(new WeakHashMap());

    public String a(Typeface typeface) {
        return (String) this.f131915d.get(typeface);
    }

    public void a(C14013ck c14013ck, Resources resources) {
        f131912a.a(this.f131915d, this.f131916e, resources);
        f131913b.a(this.f131915d, this.f131916e, resources);
        f131914c.a(c14013ck, this.f131915d);
    }
}

package fsimpl;

import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: fsimpl.cf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14133cf {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC14135ch f133162a = new C14136ci();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC14135ch f133163b = new C14134cg();

    /* renamed from: c, reason: collision with root package name */
    private static final C14137cj f133164c = new C14137cj();

    /* renamed from: d, reason: collision with root package name */
    private final Map f133165d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Set f133166e = Collections.newSetFromMap(new WeakHashMap());

    public String a(Typeface typeface) {
        return (String) this.f133165d.get(typeface);
    }

    public void a(C14138ck c14138ck, Resources resources) {
        f133162a.a(this.f133165d, this.f133166e, resources);
        f133163b.a(this.f133165d, this.f133166e, resources);
        f133164c.a(c14138ck, this.f133165d);
    }
}

package Ed;

import Vd.AbstractC5516j;
import android.content.Context;
import com.google.android.gms.common.internal.C6658o;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import ug.C17405c;
import ug.C17409g;
import ug.C17416n;

/* loaded from: classes6.dex */
public final class M {

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC3194i f7090i = AbstractC3194i.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f7091a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7092b;

    /* renamed from: c, reason: collision with root package name */
    private final F f7093c;

    /* renamed from: d, reason: collision with root package name */
    private final C17416n f7094d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5516j f7095e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5516j f7096f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7097g;

    /* renamed from: h, reason: collision with root package name */
    private final int f7098h;

    public M(Context context, final C17416n c17416n, F f10, String str) {
        int iC;
        new HashMap();
        new HashMap();
        this.f7091a = context.getPackageName();
        this.f7092b = C17405c.a(context);
        this.f7094d = c17416n;
        this.f7093c = f10;
        X.a();
        this.f7097g = str;
        this.f7095e = C17409g.a().b(new Callable() { // from class: Ed.K
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7088a.a();
            }
        });
        C17409g c17409gA = C17409g.a();
        Objects.requireNonNull(c17416n);
        this.f7096f = c17409gA.b(new Callable() { // from class: Ed.L
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c17416n.a();
            }
        });
        AbstractC3194i abstractC3194i = f7090i;
        if (abstractC3194i.containsKey(str)) {
            iC = DynamiteModule.c(context, (String) abstractC3194i.get(str));
        } else {
            iC = -1;
        }
        this.f7098h = iC;
    }

    final /* synthetic */ String a() throws Exception {
        return C6658o.a().b(this.f7097g);
    }
}

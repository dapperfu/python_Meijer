package Cd;

import Td.AbstractC5232j;
import android.content.Context;
import com.google.android.gms.common.internal.C6533o;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import sg.C16958c;
import sg.C16962g;
import sg.C16969n;

/* loaded from: classes6.dex */
public final class M {

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC2991i f3778i = AbstractC2991i.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f3779a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3780b;

    /* renamed from: c, reason: collision with root package name */
    private final F f3781c;

    /* renamed from: d, reason: collision with root package name */
    private final C16969n f3782d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5232j f3783e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5232j f3784f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3785g;

    /* renamed from: h, reason: collision with root package name */
    private final int f3786h;

    public M(Context context, final C16969n c16969n, F f10, String str) {
        int iC;
        new HashMap();
        new HashMap();
        this.f3779a = context.getPackageName();
        this.f3780b = C16958c.a(context);
        this.f3782d = c16969n;
        this.f3781c = f10;
        X.a();
        this.f3785g = str;
        this.f3783e = C16962g.a().b(new Callable() { // from class: Cd.K
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3776a.a();
            }
        });
        C16962g c16962gA = C16962g.a();
        Objects.requireNonNull(c16969n);
        this.f3784f = c16962gA.b(new Callable() { // from class: Cd.L
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c16969n.a();
            }
        });
        AbstractC2991i abstractC2991i = f3778i;
        if (abstractC2991i.containsKey(str)) {
            iC = DynamiteModule.c(context, (String) abstractC2991i.get(str));
        } else {
            iC = -1;
        }
        this.f3786h = iC;
    }

    final /* synthetic */ String a() throws Exception {
        return C6533o.a().b(this.f3785g);
    }
}

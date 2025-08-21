package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.x4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11089x4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile String f85039i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f85040j = new Object();

    public C11089x4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "Cv0JAL9ptzpRvgIi9AFTFGn0l5MhpPgpRN4VfZybymKMuiqBn9AG0bgJaX/QotAk", "/xONYRXeBwNZknPQ1yARx5KZSPQPbfL2mKAb1nbkf2s=", ya2, i10, 1);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f83583e.n("E");
        if (f85039i == null) {
            synchronized (f85040j) {
                try {
                    if (f85039i == null) {
                        f85039i = (String) this.f83584f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f83583e) {
            this.f83583e.n(f85039i);
        }
    }
}

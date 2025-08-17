package com.google.android.gms.internal.pal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.pal.l4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10773l4 extends L4 {

    /* renamed from: j, reason: collision with root package name */
    private static final M4 f83221j = new M4();

    /* renamed from: i, reason: collision with root package name */
    private final Context f83222i;

    public C10773l4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, Context context) {
        super(x32, "joxZSCFIfSio2J1Z0g3HMtlcDGNvogfMyrj1e2b+qPNv6DXnDVXfwkgCXW9zFWFC", "iJiFXDBrMwFOGpG8WmWNKc3sGwXbWv8N6fPQac0mMm0=", ya2, i10, 29);
        this.f83222i = context;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f82743e.n0("E");
        AtomicReference atomicReferenceA = f83221j.a(this.f83222i.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                try {
                    if (atomicReferenceA.get() == null) {
                        atomicReferenceA.set((String) this.f82744f.invoke(null, this.f83222i));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceA.get();
        synchronized (this.f82743e) {
            this.f82743e.n0(N2.a(str.getBytes(), true));
        }
    }
}

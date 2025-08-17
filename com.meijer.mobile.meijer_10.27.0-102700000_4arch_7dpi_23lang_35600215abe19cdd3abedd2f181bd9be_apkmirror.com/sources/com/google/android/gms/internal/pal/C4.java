package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class C4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final StackTraceElement[] f82502i;

    public C4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(x32, "d2tnKFzXPwiZyQGi+81r0jKuUmc/wF2bs8mf3rZLUgisIeswnimQDm/skPYjpEo4", "e/DvqiTz4SkFtBEBn/3V8Pr2h2slHO4xuLOBAItCJ4w=", ya2, i10, 45);
        this.f82502i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f82502i;
        if (stackTraceElementArr != null) {
            Q3 q32 = new Q3((String) this.f82744f.invoke(null, stackTraceElementArr));
            synchronized (this.f82743e) {
                try {
                    this.f82743e.s(q32.f82838b.longValue());
                    if (q32.f82839c.booleanValue()) {
                        this.f82743e.W(true != q32.f82840d.booleanValue() ? 2 : 1);
                    } else {
                        this.f82743e.W(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}

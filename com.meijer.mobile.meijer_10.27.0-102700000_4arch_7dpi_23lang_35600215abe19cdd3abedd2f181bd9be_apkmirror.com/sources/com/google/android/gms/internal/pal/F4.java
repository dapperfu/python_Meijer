package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class F4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC10677f4 f82609i;

    /* renamed from: j, reason: collision with root package name */
    private long f82610j;

    public F4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, ViewOnAttachStateChangeListenerC10677f4 viewOnAttachStateChangeListenerC10677f4) {
        super(x32, "mkunJHFc5vhTAVOcsaNSYx7OvFB6slgbORGrA/joIDO0IYq5rQvDcAbp2AI6CPUh", "k8GEQUoJxJPI/0jAlfeUix8QD7WaaXAfMcSQAzrpgrU=", ya2, i10, 53);
        this.f82609i = viewOnAttachStateChangeListenerC10677f4;
        if (viewOnAttachStateChangeListenerC10677f4 != null) {
            this.f82610j = viewOnAttachStateChangeListenerC10677f4.a();
        }
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f82609i != null) {
            this.f82743e.H(((Long) this.f82744f.invoke(null, Long.valueOf(this.f82610j))).longValue());
        }
    }
}

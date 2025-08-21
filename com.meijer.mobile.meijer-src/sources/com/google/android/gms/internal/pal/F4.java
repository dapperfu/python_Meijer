package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class F4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC10802f4 f83449i;

    /* renamed from: j, reason: collision with root package name */
    private long f83450j;

    public F4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, ViewOnAttachStateChangeListenerC10802f4 viewOnAttachStateChangeListenerC10802f4) {
        super(x32, "mkunJHFc5vhTAVOcsaNSYx7OvFB6slgbORGrA/joIDO0IYq5rQvDcAbp2AI6CPUh", "k8GEQUoJxJPI/0jAlfeUix8QD7WaaXAfMcSQAzrpgrU=", ya2, i10, 53);
        this.f83449i = viewOnAttachStateChangeListenerC10802f4;
        if (viewOnAttachStateChangeListenerC10802f4 != null) {
            this.f83450j = viewOnAttachStateChangeListenerC10802f4.a();
        }
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f83449i != null) {
            this.f83583e.H(((Long) this.f83584f.invoke(null, Long.valueOf(this.f83450j))).longValue());
        }
    }
}

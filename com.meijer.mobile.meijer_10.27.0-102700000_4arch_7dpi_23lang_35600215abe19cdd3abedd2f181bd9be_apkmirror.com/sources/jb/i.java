package jb;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f139561a;

    protected String a(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        throw new com.gimbal.internal.cache.h();
    }

    public i(Context context, String str, Class<T> cls) {
        this.f139561a = new b<>(context, str, cls);
    }
}

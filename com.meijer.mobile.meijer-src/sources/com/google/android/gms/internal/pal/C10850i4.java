package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10850i4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final Activity f84004i;

    /* renamed from: j, reason: collision with root package name */
    private final View f84005j;

    public C10850i4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, View view, Activity activity) {
        super(x32, "uJ6tafbdnitpIiJcEDt3zh4lzBZEYeFsW45S60suhbKyZNy2K2MuNEbuksualim4", "Cv/m6MvBjdOit7tT7cC+xPCpFEqovwYj4XIOcXUxCMs=", ya2, i10, 62);
        this.f84005j = view;
        this.f84004i = activity;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f84005j == null) {
            return;
        }
        Boolean bool = (Boolean) C10718a5.c().b(C10979q5.f84447g2);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f83584f.invoke(null, this.f84005j, this.f84004i, bool);
        synchronized (this.f83583e) {
            try {
                this.f83583e.c0(((Long) objArr[0]).longValue());
                this.f83583e.e0(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f83583e.d0((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

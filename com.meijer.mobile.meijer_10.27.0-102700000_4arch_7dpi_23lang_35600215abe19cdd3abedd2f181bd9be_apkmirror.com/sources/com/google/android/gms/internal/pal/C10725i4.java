package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10725i4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final Activity f83164i;

    /* renamed from: j, reason: collision with root package name */
    private final View f83165j;

    public C10725i4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, View view, Activity activity) {
        super(x32, "uJ6tafbdnitpIiJcEDt3zh4lzBZEYeFsW45S60suhbKyZNy2K2MuNEbuksualim4", "Cv/m6MvBjdOit7tT7cC+xPCpFEqovwYj4XIOcXUxCMs=", ya2, i10, 62);
        this.f83165j = view;
        this.f83164i = activity;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f83165j == null) {
            return;
        }
        Boolean bool = (Boolean) C10593a5.c().b(C10854q5.f83607g2);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f82744f.invoke(null, this.f83165j, this.f83164i, bool);
        synchronized (this.f82743e) {
            try {
                this.f82743e.b0(((Long) objArr[0]).longValue());
                this.f82743e.e0(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f82743e.d0((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

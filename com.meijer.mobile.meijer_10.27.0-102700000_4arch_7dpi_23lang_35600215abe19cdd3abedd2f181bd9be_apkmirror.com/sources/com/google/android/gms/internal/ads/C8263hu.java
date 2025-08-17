package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.hu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8263hu extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f74798a;

    /* renamed from: b, reason: collision with root package name */
    private Context f74799b;

    /* renamed from: c, reason: collision with root package name */
    private Context f74800c;

    public final Activity a() {
        return this.f74798a;
    }

    public final Context b() {
        return this.f74800c;
    }

    public final void c(Intent intent, int i10) {
        if (this.f74798a == null) {
            intent.setFlags(268435456);
            this.f74799b.startActivity(intent);
            return;
        }
        Pc.p0.k("Starting activity for result with intent: " + String.valueOf(intent.getData()) + " and requestCode: 236");
        this.f74798a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f74800c.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f74798a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f74799b.startActivity(intent);
        }
    }

    public C8263hu(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Activity activity;
        Context applicationContext = context.getApplicationContext();
        this.f74799b = applicationContext;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.f74798a = activity;
        this.f74800c = context;
        super.setBaseContext(applicationContext);
    }
}

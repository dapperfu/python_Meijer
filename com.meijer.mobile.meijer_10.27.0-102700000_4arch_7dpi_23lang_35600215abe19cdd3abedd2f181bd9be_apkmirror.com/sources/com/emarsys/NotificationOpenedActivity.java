package com.emarsys;

import N8.a;
import O8.d;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import da.C13500b;
import k9.C15125a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ta.i;
import za.j;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/emarsys/NotificationOpenedActivity;", "Landroid/app/Activity;", "<init>", "()V", "", "a", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "LO8/d;", "LO8/d;", "configLoader", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationOpenedActivity extends Activity {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d configLoader = new d();

    private final void a() throws IllegalArgumentException {
        if (getIntent() != null) {
            if (C13500b.a()) {
                Intent intent = getIntent();
                Intrinsics.i(intent, "getIntent(...)");
                Context applicationContext = getApplicationContext();
                Intrinsics.i(applicationContext, "getApplicationContext(...)");
                j.d(intent, new i(applicationContext));
            } else {
                d dVar = this.configLoader;
                Application application = getApplication();
                Intrinsics.i(application, "getApplication(...)");
                L8.d.p(dVar.a(application, "emarsys_setup_cache").c());
                C15125a.b(a.f21474e);
                Intent intent2 = getIntent();
                Intrinsics.i(intent2, "getIntent(...)");
                Context applicationContext2 = getApplicationContext();
                Intrinsics.i(applicationContext2, "getApplicationContext(...)");
                j.d(intent2, new i(applicationContext2));
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalArgumentException {
        super.onCreate(savedInstanceState);
        a();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) throws IllegalArgumentException {
        super.onNewIntent(intent);
        a();
    }
}

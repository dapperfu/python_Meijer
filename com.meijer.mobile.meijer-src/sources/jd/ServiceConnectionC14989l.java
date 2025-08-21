package jd;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC6646c;
import com.google.android.gms.common.internal.AbstractC6652i;
import com.google.android.gms.common.internal.InterfaceC6654k;
import id.C14719b;
import id.C14720c;
import java.util.Collections;
import java.util.Set;

/* renamed from: jd.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ServiceConnectionC14989l implements a.f, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f140347a;

    /* renamed from: b, reason: collision with root package name */
    private final String f140348b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f140349c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f140350d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14981d f140351e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f140352f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC14990m f140353g;

    /* renamed from: h, reason: collision with root package name */
    private IBinder f140354h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f140355i;

    /* renamed from: j, reason: collision with root package name */
    private String f140356j;

    /* renamed from: k, reason: collision with root package name */
    private String f140357k;

    final /* synthetic */ void a() {
        this.f140355i = false;
        this.f140354h = null;
        this.f140351e.onConnectionSuspended(1);
    }

    final /* synthetic */ void c(IBinder iBinder) {
        this.f140355i = false;
        this.f140354h = iBinder;
        String.valueOf(iBinder);
        this.f140351e.onConnected(new Bundle());
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect() {
        e();
        String.valueOf(this.f140354h);
        try {
            this.f140350d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f140355i = false;
        this.f140354h = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final C14720c[] getAvailableFeatures() {
        return new C14720c[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void getRemoteService(InterfaceC6654k interfaceC6654k, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void onUserSignOut(AbstractC6646c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return false;
    }

    private final void e() {
        if (Thread.currentThread() != this.f140352f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    public final void d(String str) {
        this.f140357k = str;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String getEndpointPackageName() {
        String str = this.f140347a;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.r.l(this.f140349c);
        return this.f140349c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String getLastDisconnectMessage() {
        return this.f140356j;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.EMPTY_SET;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f140352f.post(new Runnable() { // from class: jd.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f140287a.c(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f140352f.post(new Runnable() { // from class: jd.U
            @Override // java.lang.Runnable
            public final void run() {
                this.f140286a.a();
            }
        });
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void connect(AbstractC6646c.InterfaceC1269c interfaceC1269c) {
        e();
        String.valueOf(this.f140354h);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f140349c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f140347a).setAction(this.f140348b);
            }
            boolean zBindService = this.f140350d.bindService(intent, this, AbstractC6652i.a());
            this.f140355i = zBindService;
            if (!zBindService) {
                this.f140354h = null;
                this.f140353g.onConnectionFailed(new C14719b(16));
            }
            String.valueOf(this.f140354h);
        } catch (SecurityException e10) {
            this.f140355i = false;
            this.f140354h = null;
            throw e10;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnected() {
        e();
        if (this.f140354h != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnecting() {
        e();
        return this.f140355i;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect(String str) {
        e();
        this.f140356j = str;
        disconnect();
    }
}

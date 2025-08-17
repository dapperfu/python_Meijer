package hd;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC6521c;
import com.google.android.gms.common.internal.AbstractC6527i;
import com.google.android.gms.common.internal.InterfaceC6529k;
import gd.C14243b;
import gd.C14244c;
import java.util.Collections;
import java.util.Set;

/* renamed from: hd.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ServiceConnectionC14411l implements a.f, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f134658a;

    /* renamed from: b, reason: collision with root package name */
    private final String f134659b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f134660c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f134661d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14403d f134662e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f134663f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC14412m f134664g;

    /* renamed from: h, reason: collision with root package name */
    private IBinder f134665h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f134666i;

    /* renamed from: j, reason: collision with root package name */
    private String f134667j;

    /* renamed from: k, reason: collision with root package name */
    private String f134668k;

    final /* synthetic */ void b() {
        this.f134666i = false;
        this.f134665h = null;
        this.f134662e.onConnectionSuspended(1);
    }

    final /* synthetic */ void c(IBinder iBinder) {
        this.f134666i = false;
        this.f134665h = iBinder;
        String.valueOf(iBinder);
        this.f134662e.onConnected(new Bundle());
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect() {
        e();
        String.valueOf(this.f134665h);
        try {
            this.f134661d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f134666i = false;
        this.f134665h = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final C14244c[] getAvailableFeatures() {
        return new C14244c[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void getRemoteService(InterfaceC6529k interfaceC6529k, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void onUserSignOut(AbstractC6521c.e eVar) {
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
        if (Thread.currentThread() != this.f134663f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    public final void d(String str) {
        this.f134668k = str;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String getEndpointPackageName() {
        String str = this.f134658a;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.r.l(this.f134660c);
        return this.f134660c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String getLastDisconnectMessage() {
        return this.f134667j;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.EMPTY_SET;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f134663f.post(new Runnable() { // from class: hd.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f134598a.c(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f134663f.post(new Runnable() { // from class: hd.U
            @Override // java.lang.Runnable
            public final void run() {
                this.f134597a.b();
            }
        });
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void connect(AbstractC6521c.InterfaceC1260c interfaceC1260c) {
        e();
        String.valueOf(this.f134665h);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f134660c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f134658a).setAction(this.f134659b);
            }
            boolean zBindService = this.f134661d.bindService(intent, this, AbstractC6527i.a());
            this.f134666i = zBindService;
            if (!zBindService) {
                this.f134665h = null;
                this.f134664g.onConnectionFailed(new C14243b(16));
            }
            String.valueOf(this.f134665h);
        } catch (SecurityException e10) {
            this.f134666i = false;
            this.f134665h = null;
            throw e10;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnected() {
        e();
        if (this.f134665h != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnecting() {
        e();
        return this.f134666i;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect(String str) {
        e();
        this.f134667j = str;
        disconnect();
    }
}

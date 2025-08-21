package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.fullstory.FS;
import com.google.android.gms.common.api.Scope;
import com.google.maps.android.BuildConfig;
import id.C14719b;
import id.C14720c;
import id.C14724g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import sd.C17062a;

/* renamed from: com.google.android.gms.common.internal.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6646c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile C17062a zzB;
    private C14719b zzC;
    private boolean zzD;
    private volatile h0 zzE;
    s0 zza;
    final Handler zzb;
    protected InterfaceC1269c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC6652i zzn;
    private final C14724g zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC6657n zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private e0 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final C14720c[] zze = new C14720c[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        void onConnectionFailed(C14719b c14719b);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c, reason: collision with other inner class name */
    public interface InterfaceC1269c {
        void b(C14719b c14719b);
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
        void a();
    }

    protected AbstractC6646c(Context context, Handler handler, AbstractC6652i abstractC6652i, C14724g c14724g, int i10, a aVar, b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        r.m(context, "Context must not be null");
        this.zzl = context;
        r.m(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        r.m(abstractC6652i, "Supervisor must not be null");
        this.zzn = abstractC6652i;
        r.m(c14724g, "API availability must not be null");
        this.zzo = c14724g;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i10, IInterface iInterface) {
        s0 s0Var;
        r.a((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    e0 e0Var = this.zzu;
                    if (e0Var != null) {
                        AbstractC6652i abstractC6652i = this.zzn;
                        String strB = this.zza.b();
                        r.l(strB);
                        abstractC6652i.f(strB, this.zza.a(), 4225, e0Var, zze(), this.zza.c());
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    e0 e0Var2 = this.zzu;
                    if (e0Var2 != null && (s0Var = this.zza) != null) {
                        FS.log_e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + s0Var.b() + " on " + s0Var.a());
                        AbstractC6652i abstractC6652i2 = this.zzn;
                        String strB2 = this.zza.b();
                        r.l(strB2);
                        abstractC6652i2.f(strB2, this.zza.a(), 4225, e0Var2, zze(), this.zza.c());
                        this.zzd.incrementAndGet();
                    }
                    e0 e0Var3 = new e0(this, this.zzd.get());
                    this.zzu = e0Var3;
                    s0 s0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new s0(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new s0(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = s0Var2;
                    if (s0Var2.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.b())));
                    }
                    AbstractC6652i abstractC6652i3 = this.zzn;
                    String strB3 = this.zza.b();
                    r.l(strB3);
                    C14719b c14719bD = abstractC6652i3.d(new l0(strB3, this.zza.a(), 4225, this.zza.c()), e0Var3, zze(), getBindServiceExecutor());
                    if (!c14719bD.I0()) {
                        FS.log_w("GmsClient", "unable to connect to service: " + this.zza.b() + " on " + this.zza.a());
                        int iB = c14719bD.B() == -1 ? 16 : c14719bD.B();
                        if (c14719bD.b0() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, c14719bD.b0());
                        }
                        zzl(iB, bundle, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    r.l(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    protected abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((c0) this.zzt.get(i10)).d();
                }
                this.zzt.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public C17062a getAttributionSourceWrapper() {
        return null;
    }

    protected Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    protected abstract String getServiceDescriptor();

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C6649f getTelemetryConfiguration() {
        h0 h0Var = this.zzE;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f65724d;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(C17062a c17062a) {
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class d implements InterfaceC1269c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC6646c.InterfaceC1269c
        public final void b(C14719b c14719b) {
            if (c14719b.I0()) {
                AbstractC6646c abstractC6646c = AbstractC6646c.this;
                abstractC6646c.getRemoteService(null, abstractC6646c.getScopes());
            } else if (AbstractC6646c.this.zzx != null) {
                AbstractC6646c.this.zzx.onConnectionFailed(c14719b);
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzj(AbstractC6646c abstractC6646c, h0 h0Var) {
        abstractC6646c.zzE = h0Var;
        if (abstractC6646c.usesClientTelemetry()) {
            C6649f c6649f = h0Var.f65724d;
            C6661s.b().c(c6649f == null ? null : c6649f.U0());
        }
    }

    static /* bridge */ /* synthetic */ void zzk(AbstractC6646c abstractC6646c, int i10) {
        int i11;
        int i12;
        synchronized (abstractC6646c.zzp) {
            i11 = abstractC6646c.zzv;
        }
        if (i11 == 3) {
            abstractC6646c.zzD = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC6646c.zzb;
        handler.sendMessage(handler.obtainMessage(i12, abstractC6646c.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(AbstractC6646c abstractC6646c, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC6646c.zzp) {
            try {
                if (abstractC6646c.zzv != i10) {
                    return false;
                }
                abstractC6646c.zzp(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(AbstractC6646c abstractC6646c) throws ClassNotFoundException {
        if (abstractC6646c.zzD || TextUtils.isEmpty(abstractC6646c.getServiceDescriptor()) || TextUtils.isEmpty(abstractC6646c.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(abstractC6646c.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void checkAvailabilityAndConnect() {
        int iH = this.zzo.h(this.zzl, getMinApkVersion());
        if (iH == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), iH, null);
        }
    }

    public void connect(InterfaceC1269c interfaceC1269c) {
        r.m(interfaceC1269c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC1269c;
        zzp(2, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        InterfaceC6657n interfaceC6657n;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC6657n = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append(BuildConfig.TRAVIS);
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC6657n == null) {
            printWriter.println(BuildConfig.TRAVIS);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC6657n.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.b.getStatusCodeString(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public C14720c[] getApiFeatures() {
        return zze;
    }

    public final C14720c[] getAvailableFeatures() {
        h0 h0Var = this.zzE;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f65722b;
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public int getMinApkVersion() {
        return C14724g.f137533a;
    }

    public void getRemoteService(InterfaceC6654k interfaceC6654k, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i10 = this.zzy;
        int i11 = C14724g.f137533a;
        Scope[] scopeArr = C6650g.f65704o;
        Bundle bundle = new Bundle();
        C14720c[] c14720cArr = C6650g.f65705p;
        C6650g c6650g = new C6650g(6, i10, i11, null, null, scopeArr, bundle, null, c14720cArr, c14720cArr, true, 0, false, str);
        c6650g.f65709d = this.zzl.getPackageName();
        c6650g.f65712g = getServiceRequestExtraArgs;
        if (set != null) {
            c6650g.f65711f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c6650g.f65713h = account;
            if (interfaceC6654k != null) {
                c6650g.f65710e = interfaceC6654k.asBinder();
            }
        } else if (requiresAccount()) {
            c6650g.f65713h = getAccount();
        }
        c6650g.f65714i = zze;
        c6650g.f65715j = getApiFeatures();
        if (usesClientTelemetry()) {
            c6650g.f65718m = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC6657n interfaceC6657n = this.zzr;
                    if (interfaceC6657n != null) {
                        interfaceC6657n.f6(new d0(this, this.zzd.get()), c6650g);
                    } else {
                        FS.log_w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            FS.log_w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            FS.log_w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            FS.log_w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final T getService() throws DeadObjectException {
        T t10;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface = this.zzs;
                r.m(iInterface, "Client is connected but service is null");
                t10 = (T) iInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC6657n interfaceC6657n = this.zzr;
                if (interfaceC6657n == null) {
                    return null;
                }
                return interfaceC6657n.asBinder();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    protected void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new f0(this, i10, iBinder, bundle)));
    }

    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    protected void triggerNotAvailable(InterfaceC1269c interfaceC1269c, int i10, PendingIntent pendingIntent) {
        r.m(interfaceC1269c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC1269c;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    protected final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new g0(this, i10, bundle)));
    }

    protected final void checkConnected() {
        if (isConnected()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public String getEndpointPackageName() {
        s0 s0Var;
        if (isConnected() && (s0Var = this.zza) != null) {
            return s0Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    protected boolean getUseDynamicLookup() {
        if (getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    protected void onConnectedLocked(T t10) {
        this.zzh = System.currentTimeMillis();
    }

    protected void onConnectionFailed(C14719b c14719b) {
        this.zzi = c14719b.B();
        this.zzj = System.currentTimeMillis();
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC6646c(Context context, Looper looper, int i10, a aVar, b bVar, String str) {
        AbstractC6652i abstractC6652iB = AbstractC6652i.b(context);
        C14724g c14724gF = C14724g.f();
        r.l(aVar);
        r.l(bVar);
        this(context, looper, abstractC6652iB, c14724gF, i10, aVar, bVar, str);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    protected AbstractC6646c(Context context, Looper looper, AbstractC6652i abstractC6652i, C14724g c14724g, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        r.m(context, "Context must not be null");
        this.zzl = context;
        r.m(looper, "Looper must not be null");
        this.zzm = looper;
        r.m(abstractC6652i, "Supervisor must not be null");
        this.zzn = abstractC6652i;
        r.m(c14724g, "API availability must not be null");
        this.zzo = c14724g;
        this.zzb = new b0(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }
}

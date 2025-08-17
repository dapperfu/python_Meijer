package q5;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import k5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R.\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00030\u00030\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u0012\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R(\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010&\u0012\u0004\b*\u0010\t\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0018R\u0016\u0010,\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b \u0010(¨\u0006."}, d2 = {"Lq5/u;", "Landroid/content/ComponentCallbacks2;", "Lk5/f$a;", "LZ4/k;", "imageLoader", "<init>", "(LZ4/k;)V", "", "d", "()V", "c", "e", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "level", "onTrimMemory", "(I)V", "onLowMemory", "", "isOnline", "a", "(Z)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "Landroid/content/Context;", "b", "Landroid/content/Context;", "application", "Lk5/f;", "Lk5/f;", "networkObserver", "Z", "getShutdown", "()Z", "setShutdown", "getShutdown$annotations", "shutdown", "_isOnline", "f", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: q5.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ComponentCallbacks2C16469u implements ComponentCallbacks2, f.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<Z4.k> imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Context application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private k5.f networkObserver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean shutdown;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean _isOnline = true;

    private final synchronized void d() {
        try {
            Z4.k kVar = this.imageLoader.get();
            if (kVar == null) {
                e();
            } else if (this.networkObserver == null) {
                k5.f fVarA = kVar.getOptions().getNetworkObserverEnabled() ? k5.g.a(kVar.getContext(), this, kVar.getLogger()) : new k5.e();
                this.networkObserver = fVarA;
                this._isOnline = fVarA.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // k5.f.a
    public synchronized void a(boolean isOnline) {
        try {
            Z4.k kVar = this.imageLoader.get();
            if (kVar != null) {
                InterfaceC16467s logger = kVar.getLogger();
                if (logger != null && logger.getLevel() <= 4) {
                    logger.a("NetworkObserver", 4, isOnline ? "ONLINE" : "OFFLINE", null);
                }
                this._isOnline = isOnline;
            } else {
                e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean b() {
        d();
        return this._isOnline;
    }

    public final synchronized void c() {
        try {
            Z4.k kVar = this.imageLoader.get();
            if (kVar == null) {
                e();
            } else if (this.application == null) {
                Context context = kVar.getContext();
                this.application = context;
                context.registerComponentCallbacks(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Context context = this.application;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            k5.f fVar = this.networkObserver;
            if (fVar != null) {
                fVar.shutdown();
            }
            this.imageLoader.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(Configuration newConfig) {
        if (this.imageLoader.get() == null) {
            e();
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int level) {
        try {
            Z4.k kVar = this.imageLoader.get();
            if (kVar != null) {
                InterfaceC16467s logger = kVar.getLogger();
                if (logger != null && logger.getLevel() <= 2) {
                    logger.a("NetworkObserver", 2, "trimMemory, level=" + level, null);
                }
                kVar.o(level);
            } else {
                e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public ComponentCallbacks2C16469u(Z4.k kVar) {
        this.imageLoader = new WeakReference<>(kVar);
    }
}

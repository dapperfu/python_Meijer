package J;

import C.H;
import C.P;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\rB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, d2 = {"LJ/h;", "LC/H$i;", "screenFlash", "<init>", "(LC/H$i;)V", "", "e", "()V", "d", "", "expirationTimeMillis", "LC/H$j;", "screenFlashListener", "a", "(JLC/H$j;)V", "clear", "f", "LC/H$i;", "Ljava/lang/Object;", "b", "Ljava/lang/Object;", "lock", "", "c", "Z", "isClearScreenFlashPending", "LC/H$j;", "pendingListener", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements H.i {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final H.i screenFlash;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isClearScreenFlashPending;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private H.j pendingListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJ/h$a;", "", "<init>", "()V", "LC/H$i;", "screenFlash", "LJ/h;", "a", "(LC/H$i;)LJ/h;", "", "TAG", "Ljava/lang/String;", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: J.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final h a(H.i screenFlash) {
            return new h(screenFlash, null);
        }
    }

    public /* synthetic */ h(H.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar);
    }

    private h(H.i iVar) {
        this.screenFlash = iVar;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(h this$0) {
        Intrinsics.j(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                if (this$0.pendingListener == null) {
                    P.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                this$0.e();
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        Unit unit;
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    H.i iVar = this.screenFlash;
                    if (iVar != null) {
                        iVar.clear();
                        unit = Unit.f143329a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        P.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    P.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                Unit unit2 = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e() {
        synchronized (this.lock) {
            try {
                H.j jVar = this.pendingListener;
                if (jVar != null) {
                    jVar.a();
                }
                this.pendingListener = null;
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @JvmStatic
    public static final h g(H.i iVar) {
        return INSTANCE.a(iVar);
    }

    @Override // C.H.i
    public void a(long expirationTimeMillis, H.j screenFlashListener) {
        Unit unit;
        Intrinsics.j(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            Unit unit2 = Unit.f143329a;
        }
        H.i iVar = this.screenFlash;
        if (iVar != null) {
            iVar.a(expirationTimeMillis, new H.j() { // from class: J.g
                @Override // C.H.j
                public final void a() {
                    h.c(this.f15305a);
                }
            });
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            P.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override // C.H.i
    public void clear() {
        d();
    }

    public final void f() {
        e();
        d();
    }
}

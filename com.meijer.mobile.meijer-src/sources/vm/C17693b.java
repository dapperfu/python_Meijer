package vm;

import Lu.g;
import com.medallia.digital.mobilesdk.l8;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wm.LifecycleEvent;
import yo.k;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lvm/b;", "", "LDk/b;", "bus", "Lyo/k;", "userManager", "<init>", "(LDk/b;Lyo/k;)V", "Lwm/a;", "event", "", "d", "(Lwm/a;)V", "", "c", "()Z", "e", "a", "Lyo/k;", "", "b", "J", "pausedTime", "value", "getTimeInBackground", "()J", "timeInBackground", "Z", "appWasInBackground", "managers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vm.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17693b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long pausedTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long timeInBackground;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean appWasInBackground;

    public C17693b(Dk.b bus, k userManager) {
        Intrinsics.j(bus, "bus");
        Intrinsics.j(userManager, "userManager");
        this.userManager = userManager;
        bus.b(LifecycleEvent.class, new g() { // from class: vm.a
            @Override // Lu.g
            public final void accept(Object obj) {
                C17693b.b(this.f165986a, (LifecycleEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C17693b c17693b, LifecycleEvent event) {
        Intrinsics.j(event, "event");
        c17693b.d(event);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAppWasInBackground() {
        return this.appWasInBackground;
    }

    public final boolean e() {
        return this.appWasInBackground && this.timeInBackground > l8.b.f93364b;
    }

    private final void d(LifecycleEvent event) {
        if (event.getIsPaused()) {
            this.pausedTime = Instant.now().toEpochMilli();
            this.appWasInBackground = false;
            this.timeInBackground = 0L;
            return;
        }
        long epochMilli = Instant.now().toEpochMilli() - this.pausedTime;
        this.timeInBackground = epochMilli;
        qw.a.INSTANCE.a("App was paused for %dms", Long.valueOf(epochMilli));
        if (this.timeInBackground > 3000) {
            this.appWasInBackground = true;
            if (e()) {
                this.userManager.c0(false);
            }
        }
    }
}

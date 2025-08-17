package ca;

import F9.l;
import R8.a;
import S8.d;
import aa.InterfaceC5588a;
import android.app.Activity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import da.C13500b;
import h9.DeviceInfo;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lca/b;", "LR8/a;", "Laa/a;", "clientInternal", "LF9/l;", "", "deviceInfoPayloadStorage", "Lh9/c;", "deviceInfo", "LR8/a$a;", "triggeringLifecycle", "", "priority", "", "repeatable", "<init>", "(Laa/a;LF9/l;Lh9/c;LR8/a$a;IZ)V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "Laa/a;", "b", "LF9/l;", "c", "Lh9/c;", "d", "LR8/a$a;", "()LR8/a$a;", "e", "I", "()I", "f", "Z", "()Z", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b implements R8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5588a clientInternal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<String> deviceInfoPayloadStorage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DeviceInfo deviceInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a.EnumC0721a triggeringLifecycle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean repeatable;

    public b(InterfaceC5588a clientInternal, l<String> deviceInfoPayloadStorage, DeviceInfo deviceInfo, a.EnumC0721a triggeringLifecycle, int i10, boolean z10) {
        Intrinsics.j(clientInternal, "clientInternal");
        Intrinsics.j(deviceInfoPayloadStorage, "deviceInfoPayloadStorage");
        Intrinsics.j(deviceInfo, "deviceInfo");
        Intrinsics.j(triggeringLifecycle, "triggeringLifecycle");
        this.clientInternal = clientInternal;
        this.deviceInfoPayloadStorage = deviceInfoPayloadStorage;
        this.deviceInfo = deviceInfo;
        this.triggeringLifecycle = triggeringLifecycle;
        this.priority = i10;
        this.repeatable = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(b bVar, l9.b bVar2) throws IllegalArgumentException {
        if (bVar.deviceInfoPayloadStorage.get() == null || !Intrinsics.e(bVar.deviceInfoPayloadStorage.get(), bVar.deviceInfo.c())) {
            InterfaceC5588a interfaceC5588a = bVar.clientInternal;
            Object objNewProxyInstance = Proxy.newProxyInstance(interfaceC5588a.getClass().getClassLoader(), interfaceC5588a.getClass().getInterfaces(), new d(interfaceC5588a));
            if (objNewProxyInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.client.ClientServiceInternal");
            }
            InterfaceC5588a interfaceC5588a2 = (InterfaceC5588a) objNewProxyInstance;
            Object objNewProxyInstance2 = Proxy.newProxyInstance(interfaceC5588a2.getClass().getClassLoader(), interfaceC5588a2.getClass().getInterfaces(), new S8.b(interfaceC5588a2, bVar2, 5L));
            if (objNewProxyInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.client.ClientServiceInternal");
            }
            ((InterfaceC5588a) objNewProxyInstance2).a(null);
        }
    }

    @Override // R8.a
    /* renamed from: b, reason: from getter */
    public a.EnumC0721a getTriggeringLifecycle() {
        return this.triggeringLifecycle;
    }

    @Override // R8.a
    /* renamed from: c, reason: from getter */
    public int getPriority() {
        return this.priority;
    }

    @Override // R8.a
    /* renamed from: d, reason: from getter */
    public boolean getRepeatable() {
        return this.repeatable;
    }

    @Override // R8.a
    public void a(Activity activity) {
        final l9.b concurrentHandlerHolder = C13500b.b().getConcurrentHandlerHolder();
        concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: ca.a
            @Override // java.lang.Runnable
            public final void run() throws IllegalArgumentException {
                b.f(this.f61672a, concurrentHandlerHolder);
            }
        });
    }

    public /* synthetic */ b(InterfaceC5588a interfaceC5588a, l lVar, DeviceInfo deviceInfo, a.EnumC0721a enumC0721a, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5588a, lVar, deviceInfo, (i11 & 8) != 0 ? a.EnumC0721a.f31935c : enumC0721a, (i11 & 16) != 0 ? HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES : i10, (i11 & 32) != 0 ? true : z10);
    }
}

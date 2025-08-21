package ka;

import K9.e;
import T8.a;
import android.app.Activity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fa.C13973b;
import ha.InterfaceC14492c;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lka/b;", "LT8/a;", "Lha/c;", "eventServiceInternal", "LH9/l;", "", "contactTokenStorage", "", "priority", "", "repeatable", "LT8/a$a;", "triggeringLifecycle", "<init>", "(Lha/c;LH9/l;IZLT8/a$a;)V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "Lha/c;", "b", "LH9/l;", "c", "I", "()I", "d", "Z", "()Z", "e", "LT8/a$a;", "()LT8/a$a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b implements T8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14492c eventServiceInternal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final H9.l<String> contactTokenStorage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean repeatable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a.EnumC0795a triggeringLifecycle;

    public b(InterfaceC14492c eventServiceInternal, H9.l<String> contactTokenStorage, int i10, boolean z10, a.EnumC0795a triggeringLifecycle) {
        Intrinsics.j(eventServiceInternal, "eventServiceInternal");
        Intrinsics.j(contactTokenStorage, "contactTokenStorage");
        Intrinsics.j(triggeringLifecycle, "triggeringLifecycle");
        this.eventServiceInternal = eventServiceInternal;
        this.contactTokenStorage = contactTokenStorage;
        this.priority = i10;
        this.repeatable = z10;
        this.triggeringLifecycle = triggeringLifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(b bVar, n9.b bVar2) throws IllegalArgumentException {
        if (bVar.contactTokenStorage.get() != null) {
            InterfaceC14492c interfaceC14492c = bVar.eventServiceInternal;
            Object objNewProxyInstance = Proxy.newProxyInstance(interfaceC14492c.getClass().getClassLoader(), interfaceC14492c.getClass().getInterfaces(), new U8.d(interfaceC14492c));
            if (objNewProxyInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.event.EventServiceInternal");
            }
            InterfaceC14492c interfaceC14492c2 = (InterfaceC14492c) objNewProxyInstance;
            Object objNewProxyInstance2 = Proxy.newProxyInstance(interfaceC14492c2.getClass().getClassLoader(), interfaceC14492c2.getClass().getInterfaces(), new U8.b(interfaceC14492c2, bVar2, 5L));
            if (objNewProxyInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.event.EventServiceInternal");
            }
            ((InterfaceC14492c) objNewProxyInstance2).e("app:start", null, null);
        }
        e.Companion.e(K9.e.INSTANCE, new L9.a("app:start", null), false, 2, null);
    }

    @Override // T8.a
    /* renamed from: b, reason: from getter */
    public a.EnumC0795a getTriggeringLifecycle() {
        return this.triggeringLifecycle;
    }

    @Override // T8.a
    /* renamed from: c, reason: from getter */
    public int getPriority() {
        return this.priority;
    }

    @Override // T8.a
    /* renamed from: d, reason: from getter */
    public boolean getRepeatable() {
        return this.repeatable;
    }

    @Override // T8.a
    public void a(Activity activity) {
        final n9.b concurrentHandlerHolder = C13973b.b().getConcurrentHandlerHolder();
        concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: ka.a
            @Override // java.lang.Runnable
            public final void run() throws IllegalArgumentException {
                b.f(this.f141709a, concurrentHandlerHolder);
            }
        });
    }

    public /* synthetic */ b(InterfaceC14492c interfaceC14492c, H9.l lVar, int i10, boolean z10, a.EnumC0795a enumC0795a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14492c, lVar, (i11 & 4) != 0 ? HttpResponseStatus.SUCCESS_OK : i10, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? a.EnumC0795a.f35935c : enumC0795a);
    }
}

package k9;

import H9.l;
import I9.f;
import K9.e;
import T8.i;
import e9.InterfaceC13782a;
import j9.DeviceInfo;
import kotlin.Metadata;
import u9.C17361a;
import v9.C17649a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 ,2\u00020\u0001:\u00010R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lk9/a;", "", "Ln9/b;", "H", "()Ln9/b;", "concurrentHandlerHolder", "LT8/f;", "M", "()LT8/f;", "activityLifecycleWatchdog", "LT8/e;", "x", "()LT8/e;", "activityLifecycleActionRegistry", "Le9/a;", "U", "()Le9/a;", "coreSQLiteDatabase", "Lj9/c;", "D", "()Lj9/c;", "deviceInfo", "Lu9/a;", "T", "()Lu9/a;", "timestampProvider", "Lv9/a;", "E", "()Lv9/a;", "uuidProvider", "Ljava/lang/Runnable;", "Q", "()Ljava/lang/Runnable;", "logShardTrigger", "LK9/e;", "g", "()LK9/e;", "logger", "LI9/f;", "I", "()LI9/f;", "fileDownloader", "LH9/l;", "", "d", "()LH9/l;", "logLevelStorage", "LT8/i;", "a", "()LT8/i;", "transitionSafeCurrentActivityWatchdog", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15112a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f141707a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lk9/a$a;", "", "<init>", "()V", "", "b", "()Z", "Lk9/a;", "Lk9/a;", "a", "()Lk9/a;", "c", "(Lk9/a;)V", "instance", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: k9.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f141707a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static InterfaceC15112a instance;

        public final InterfaceC15112a a() {
            return instance;
        }

        public final boolean b() {
            return instance != null;
        }

        public final void c(InterfaceC15112a interfaceC15112a) {
            instance = interfaceC15112a;
        }

        private Companion() {
        }
    }

    DeviceInfo D();

    C17649a E();

    n9.b H();

    f I();

    T8.f M();

    Runnable Q();

    C17361a T();

    InterfaceC13782a U();

    i a();

    l<String> d();

    e g();

    T8.e x();
}

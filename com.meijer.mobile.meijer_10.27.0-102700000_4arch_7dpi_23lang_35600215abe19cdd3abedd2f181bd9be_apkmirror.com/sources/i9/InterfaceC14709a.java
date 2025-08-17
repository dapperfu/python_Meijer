package i9;

import F9.l;
import G9.f;
import I9.e;
import R8.i;
import c9.InterfaceC6378a;
import h9.DeviceInfo;
import kotlin.Metadata;
import s9.C16914a;
import t9.C17074a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 ,2\u00020\u0001:\u00010R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Li9/a;", "", "Ll9/b;", "H", "()Ll9/b;", "concurrentHandlerHolder", "LR8/f;", "M", "()LR8/f;", "activityLifecycleWatchdog", "LR8/e;", "x", "()LR8/e;", "activityLifecycleActionRegistry", "Lc9/a;", "U", "()Lc9/a;", "coreSQLiteDatabase", "Lh9/c;", "D", "()Lh9/c;", "deviceInfo", "Ls9/a;", "T", "()Ls9/a;", "timestampProvider", "Lt9/a;", "E", "()Lt9/a;", "uuidProvider", "Ljava/lang/Runnable;", "Q", "()Ljava/lang/Runnable;", "logShardTrigger", "LI9/e;", "h", "()LI9/e;", "logger", "LG9/f;", "I", "()LG9/f;", "fileDownloader", "LF9/l;", "", "d", "()LF9/l;", "logLevelStorage", "LR8/i;", "a", "()LR8/i;", "transitionSafeCurrentActivityWatchdog", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: i9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14709a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f137618a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Li9/a$a;", "", "<init>", "()V", "", "b", "()Z", "Li9/a;", "Li9/a;", "a", "()Li9/a;", "c", "(Li9/a;)V", "instance", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: i9.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f137618a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static InterfaceC14709a instance;

        public final InterfaceC14709a a() {
            return instance;
        }

        public final boolean b() {
            return instance != null;
        }

        public final void c(InterfaceC14709a interfaceC14709a) {
            instance = interfaceC14709a;
        }

        private Companion() {
        }
    }

    DeviceInfo D();

    C17074a E();

    l9.b H();

    f I();

    R8.f M();

    Runnable Q();

    C16914a T();

    InterfaceC6378a U();

    i a();

    l<String> d();

    e h();

    R8.e x();
}

package R9;

import Q8.EmarsysConfig;
import fa.InterfaceC13972a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001(J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"LR9/Y0;", "Lfa/a;", "LJa/a;", "LQ8/h;", "emarsysConfig", "", "j", "(LQ8/h;)V", "LQa/b;", "O", "()LQa/b;", "push", "t", "loggingPush", "LHa/h;", "p", "()LHa/h;", "predictRestricted", "G", "loggingPredictRestricted", "LQ8/b;", "b", "()LQ8/b;", "config", "LW9/i;", "V", "()LW9/i;", "mobileEngage", "y", "loggingMobileEngage", "LQ8/c;", "L", "()LQ8/c;", "configInternal", "LO8/b;", "c", "()LO8/b;", "clientService", "m", "loggingClientService", "a", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Y0 extends InterfaceC13972a, Ja.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32214a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"LR9/Y0$a;", "", "<init>", "()V", "LR9/Y0;", "b", "LR9/Y0;", "a", "()LR9/Y0;", "(LR9/Y0;)V", "instance", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: R9.Y0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f32214a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static Y0 instance;

        public final Y0 a() {
            return instance;
        }

        public final void b(Y0 y02) {
            instance = y02;
        }

        private Companion() {
        }
    }

    Ha.h G();

    Q8.c L();

    Qa.b O();

    W9.i V();

    Q8.b b();

    O8.b c();

    void j(EmarsysConfig emarsysConfig);

    O8.b m();

    Ha.h p();

    Qa.b t();

    W9.i y();
}

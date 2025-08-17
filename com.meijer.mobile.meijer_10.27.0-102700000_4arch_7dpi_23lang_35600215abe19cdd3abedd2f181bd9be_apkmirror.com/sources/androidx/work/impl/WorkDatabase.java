package androidx.work.impl;

import A4.d;
import N4.InterfaceC4314b;
import O4.C4443d;
import O4.C4446g;
import O4.C4447h;
import O4.C4448i;
import O4.C4449j;
import O4.C4450k;
import O4.C4451l;
import O4.C4452m;
import O4.C4453n;
import O4.C4454o;
import O4.C4455p;
import O4.C4459u;
import O4.P;
import V4.k;
import V4.q;
import android.content.Context;
import androidx.room.C6136w;
import androidx.room.G;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/G;", "<init>", "()V", "Landroidx/work/impl/model/c;", "l", "()Landroidx/work/impl/model/c;", "LV4/a;", "g", "()LV4/a;", "LV4/q;", "m", "()LV4/q;", "LV4/e;", "i", "()LV4/e;", "LV4/i;", "j", "()LV4/i;", "LV4/k;", "k", "()LV4/k;", "LV4/c;", "h", "()LV4/c;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class WorkDatabase extends G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "LN4/b;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;LN4/b;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A4.d c(Context context, d.b configuration) {
            Intrinsics.j(configuration, "configuration");
            d.b.a aVarA = d.b.INSTANCE.a(context);
            aVarA.d(configuration.name).c(configuration.callback).e(true).a(true);
            return new B4.j().a(aVarA.b());
        }

        @JvmStatic
        public final WorkDatabase b(final Context context, Executor queryExecutor, InterfaceC4314b clock, boolean useTestDatabase) {
            Intrinsics.j(context, "context");
            Intrinsics.j(queryExecutor, "queryExecutor");
            Intrinsics.j(clock, "clock");
            return (WorkDatabase) (useTestDatabase ? C6136w.b(context, WorkDatabase.class).c() : C6136w.a(context, WorkDatabase.class, "androidx.work.workdb").g(new d.c() { // from class: O4.G
                @Override // A4.d.c
                public final A4.d a(d.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).h(queryExecutor).a(new C4443d(clock)).b(C4450k.f23215a).b(new C4459u(context, 2, 3)).b(C4451l.f23216a).b(C4452m.f23217a).b(new C4459u(context, 5, 6)).b(C4453n.f23218a).b(C4454o.f23219a).b(C4455p.f23220a).b(new P(context)).b(new C4459u(context, 10, 11)).b(C4446g.f23211a).b(C4447h.f23212a).b(C4448i.f23213a).b(C4449j.f23214a).b(new C4459u(context, 21, 22)).e().d();
        }
    }

    public abstract V4.a g();

    public abstract V4.c h();

    public abstract V4.e i();

    public abstract V4.i j();

    public abstract k k();

    public abstract androidx.work.impl.model.c l();

    public abstract q m();
}

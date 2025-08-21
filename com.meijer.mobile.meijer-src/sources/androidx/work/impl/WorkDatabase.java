package androidx.work.impl;

import B4.d;
import O4.InterfaceC4354b;
import P4.C4569d;
import P4.C4572g;
import P4.C4573h;
import P4.C4574i;
import P4.C4575j;
import P4.C4576k;
import P4.C4577l;
import P4.C4578m;
import P4.C4579n;
import P4.C4580o;
import P4.C4581p;
import P4.C4585u;
import P4.P;
import W4.k;
import W4.q;
import android.content.Context;
import androidx.room.C6278w;
import androidx.room.G;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/G;", "<init>", "()V", "Landroidx/work/impl/model/c;", "l", "()Landroidx/work/impl/model/c;", "LW4/a;", "g", "()LW4/a;", "LW4/q;", "m", "()LW4/q;", "LW4/e;", "i", "()LW4/e;", "LW4/i;", "j", "()LW4/i;", "LW4/k;", "k", "()LW4/k;", "LW4/c;", "h", "()LW4/c;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class WorkDatabase extends G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "LO4/b;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;LO4/b;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final B4.d c(Context context, d.b configuration) {
            Intrinsics.j(configuration, "configuration");
            d.b.a aVarA = d.b.INSTANCE.a(context);
            aVarA.d(configuration.name).c(configuration.callback).e(true).a(true);
            return new C4.j().a(aVarA.b());
        }

        @JvmStatic
        public final WorkDatabase b(final Context context, Executor queryExecutor, InterfaceC4354b clock, boolean useTestDatabase) {
            Intrinsics.j(context, "context");
            Intrinsics.j(queryExecutor, "queryExecutor");
            Intrinsics.j(clock, "clock");
            return (WorkDatabase) (useTestDatabase ? C6278w.b(context, WorkDatabase.class).c() : C6278w.a(context, WorkDatabase.class, "androidx.work.workdb").g(new d.c() { // from class: P4.G
                @Override // B4.d.c
                public final B4.d a(d.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).h(queryExecutor).a(new C4569d(clock)).b(C4576k.f25555a).b(new C4585u(context, 2, 3)).b(C4577l.f25556a).b(C4578m.f25557a).b(new C4585u(context, 5, 6)).b(C4579n.f25558a).b(C4580o.f25559a).b(C4581p.f25560a).b(new P(context)).b(new C4585u(context, 10, 11)).b(C4572g.f25551a).b(C4573h.f25552a).b(C4574i.f25553a).b(C4575j.f25554a).b(new C4585u(context, 21, 22)).e().d();
        }
    }

    public abstract W4.a g();

    public abstract W4.c h();

    public abstract W4.e i();

    public abstract W4.i j();

    public abstract k k();

    public abstract androidx.work.impl.model.c l();

    public abstract q m();
}

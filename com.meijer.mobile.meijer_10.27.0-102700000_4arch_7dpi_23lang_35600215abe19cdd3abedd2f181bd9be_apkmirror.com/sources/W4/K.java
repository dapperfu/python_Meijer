package W4;

import N4.AbstractC4333v;
import N4.C4322j;
import N4.C4331t;
import N4.InterfaceC4323k;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public class K implements InterfaceC4323k {

    /* renamed from: d, reason: collision with root package name */
    private static final String f38496d = AbstractC4333v.i("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final X4.b f38497a;

    /* renamed from: b, reason: collision with root package name */
    final U4.a f38498b;

    /* renamed from: c, reason: collision with root package name */
    final androidx.work.impl.model.c f38499c;

    @Override // N4.InterfaceC4323k
    public com.google.common.util.concurrent.q<Void> a(final Context context, final UUID uuid, final C4322j c4322j) {
        return C4331t.f(this.f38497a.c(), "setForegroundAsync", new Function0() { // from class: W4.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return K.b(this.f38492a, uuid, c4322j, context);
            }
        });
    }

    @SuppressLint({"LambdaLast"})
    public K(WorkDatabase workDatabase, U4.a aVar, X4.b bVar) {
        this.f38498b = aVar;
        this.f38497a = bVar;
        this.f38499c = workDatabase.l();
    }

    public static /* synthetic */ Void b(K k10, UUID uuid, C4322j c4322j, Context context) {
        k10.getClass();
        String string = uuid.toString();
        WorkSpec workSpecK = k10.f38499c.k(string);
        if (workSpecK != null && !workSpecK.state.b()) {
            k10.f38498b.a(string, c4322j);
            context.startService(androidx.work.impl.foreground.a.d(context, V4.p.a(workSpecK), c4322j));
            return null;
        }
        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}

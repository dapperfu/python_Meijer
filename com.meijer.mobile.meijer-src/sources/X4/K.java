package X4;

import O4.AbstractC4373v;
import O4.C4362j;
import O4.C4371t;
import O4.InterfaceC4363k;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public class K implements InterfaceC4363k {

    /* renamed from: d, reason: collision with root package name */
    private static final String f41566d = AbstractC4373v.i("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final Y4.b f41567a;

    /* renamed from: b, reason: collision with root package name */
    final V4.a f41568b;

    /* renamed from: c, reason: collision with root package name */
    final androidx.work.impl.model.c f41569c;

    @Override // O4.InterfaceC4363k
    public com.google.common.util.concurrent.q<Void> a(final Context context, final UUID uuid, final C4362j c4362j) {
        return C4371t.f(this.f41567a.c(), "setForegroundAsync", new Function0() { // from class: X4.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return K.b(this.f41562a, uuid, c4362j, context);
            }
        });
    }

    @SuppressLint({"LambdaLast"})
    public K(WorkDatabase workDatabase, V4.a aVar, Y4.b bVar) {
        this.f41568b = aVar;
        this.f41567a = bVar;
        this.f41569c = workDatabase.l();
    }

    public static /* synthetic */ Void b(K k10, UUID uuid, C4362j c4362j, Context context) {
        k10.getClass();
        String string = uuid.toString();
        WorkSpec workSpecJ = k10.f41569c.j(string);
        if (workSpecJ != null && !workSpecJ.state.b()) {
            k10.f41568b.a(string, c4362j);
            context.startService(androidx.work.impl.foreground.a.c(context, W4.p.a(workSpecJ), c4362j));
            return null;
        }
        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}

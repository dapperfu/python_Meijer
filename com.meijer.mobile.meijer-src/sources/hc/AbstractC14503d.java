package hc;

import Nb.j;
import eb.C13784a;
import eb.C13785b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jc.C14975c;
import ub.C17367c;
import xb.C18150d;

/* renamed from: hc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14503d<T, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final C13784a f135289b = C13785b.a(AbstractC14503d.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static ExecutorService f135290c;

    /* renamed from: a, reason: collision with root package name */
    protected final Jb.a f135291a;

    /* renamed from: hc.d$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f135292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Tb.a f135293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17367c f135294c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C18150d f135295d;

        a(Object obj, Tb.a aVar, C17367c c17367c, C18150d c18150d) {
            this.f135292a = obj;
            this.f135293b = aVar;
            this.f135294c = c17367c;
            this.f135295d = c18150d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            String message;
            int i10 = Tb.b.PROXIMITY_UNKNOWN_TYPE.f36111a;
            try {
                try {
                    AbstractC14503d.this.b(this.f135292a, this.f135293b, this.f135294c, this.f135295d);
                } catch (Exception e10) {
                    Object obj = this.f135292a;
                    if ((e10 instanceof com.gimbal.internal.i.c) && (!(obj instanceof ic.d) || (message = e10.getMessage()) == null || !message.startsWith("404"))) {
                        com.gimbal.internal.i.c cVar = (com.gimbal.internal.i.c) e10;
                        if (cVar.f65209b != 404) {
                            C13784a unused = AbstractC14503d.f135289b;
                            e10.getMessage();
                            C13784a unused2 = AbstractC14503d.f135289b;
                            e10.toString();
                            new C14975c().parse(cVar.f65208a).a();
                            C13784a unused3 = AbstractC14503d.f135289b;
                        }
                    }
                    this.f135293b.a(i10, "incomplete");
                }
            } catch (Throwable th2) {
                this.f135293b.a(i10, "incomplete");
                throw th2;
            }
        }
    }

    private synchronized ExecutorService c() {
        try {
            if (f135290c == null) {
                f135290c = Executors.newFixedThreadPool(20, new j("ServerCommand", "{0}-{1}"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f135290c;
    }

    public abstract void b(T t10, Tb.a<V> aVar, C17367c c17367c, C18150d c18150d);

    public final void d(T t10, Tb.a<V> aVar, C17367c c17367c, C18150d c18150d) {
        c().execute(new a(t10, aVar, c17367c, c18150d));
    }

    public AbstractC14503d(Jb.a aVar) {
        this.f135291a = aVar;
    }
}

package fc;

import Lb.j;
import cb.C6380a;
import cb.C6381b;
import hc.C14397c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import sb.C16920c;
import vb.C17538d;

/* renamed from: fc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC13873d<T, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final C6380a f130943b = C6381b.a(AbstractC13873d.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static ExecutorService f130944c;

    /* renamed from: a, reason: collision with root package name */
    protected final Hb.a f130945a;

    /* renamed from: fc.d$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f130946a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rb.a f130947b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C16920c f130948c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17538d f130949d;

        a(Object obj, Rb.a aVar, C16920c c16920c, C17538d c17538d) {
            this.f130946a = obj;
            this.f130947b = aVar;
            this.f130948c = c16920c;
            this.f130949d = c17538d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            String message;
            int i10 = Rb.b.PROXIMITY_UNKNOWN_TYPE.f32111a;
            try {
                try {
                    AbstractC13873d.this.b(this.f130946a, this.f130947b, this.f130948c, this.f130949d);
                } catch (Exception e10) {
                    Object obj = this.f130946a;
                    if ((e10 instanceof com.gimbal.internal.i.c) && (!(obj instanceof gc.d) || (message = e10.getMessage()) == null || !message.startsWith("404"))) {
                        com.gimbal.internal.i.c cVar = (com.gimbal.internal.i.c) e10;
                        if (cVar.f64369b != 404) {
                            C6380a unused = AbstractC13873d.f130943b;
                            e10.getMessage();
                            C6380a unused2 = AbstractC13873d.f130943b;
                            e10.toString();
                            new C14397c().parse(cVar.f64368a).a();
                            C6380a unused3 = AbstractC13873d.f130943b;
                        }
                    }
                    this.f130947b.a(i10, "incomplete");
                }
            } catch (Throwable th2) {
                this.f130947b.a(i10, "incomplete");
                throw th2;
            }
        }
    }

    private synchronized ExecutorService c() {
        try {
            if (f130944c == null) {
                f130944c = Executors.newFixedThreadPool(20, new j("ServerCommand", "{0}-{1}"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f130944c;
    }

    public abstract void b(T t10, Rb.a<V> aVar, C16920c c16920c, C17538d c17538d);

    public final void d(T t10, Rb.a<V> aVar, C16920c c16920c, C17538d c17538d) {
        c().execute(new a(t10, aVar, c16920c, c17538d));
    }

    public AbstractC13873d(Hb.a aVar) {
        this.f130945a = aVar;
    }
}

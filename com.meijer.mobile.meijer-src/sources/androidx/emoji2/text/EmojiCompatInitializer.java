package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.f;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements E4.a<Boolean> {

    class a implements InterfaceC6157f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6165l f54787a;

        a(AbstractC6165l abstractC6165l) {
            this.f54787a = abstractC6165l;
        }

        @Override // androidx.view.InterfaceC6157f
        public void onResume(InterfaceC6172s interfaceC6172s) {
            EmojiCompatInitializer.this.e();
            this.f54787a.d(this);
        }
    }

    static class b extends f.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f54789a;

        class a extends f.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.i f54790a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f54791b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f54790a = iVar;
                this.f54791b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th2) {
                try {
                    this.f54790a.a(th2);
                } finally {
                    this.f54791b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f54790a.b(nVar);
                } finally {
                    this.f54791b.shutdown();
                }
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54831a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k kVarA = androidx.emoji2.text.d.a(this.f54789a);
                if (kVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                kVarA.c(threadPoolExecutor);
                kVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }

        c(Context context) {
            this.f54789a = context.getApplicationContext();
        }
    }

    static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                j2.n.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.k()) {
                    f.c().n();
                }
            } finally {
                j2.n.b();
            }
        }

        d() {
        }
    }

    @Override // E4.a
    public List<Class<? extends E4.a<?>>> b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // E4.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean a(Context context) {
        f.j(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        AbstractC6165l lifecycle = ((InterfaceC6172s) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    void e() {
        androidx.emoji2.text.c.c().postDelayed(new d(), 500L);
    }
}

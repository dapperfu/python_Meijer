package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.f;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements D4.a<Boolean> {

    class a implements InterfaceC6015f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6023l f54563a;

        a(AbstractC6023l abstractC6023l) {
            this.f54563a = abstractC6023l;
        }

        @Override // androidx.view.InterfaceC6015f
        public void onResume(InterfaceC6030s interfaceC6030s) {
            EmojiCompatInitializer.this.e();
            this.f54563a.d(this);
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
        private final Context f54565a;

        class a extends f.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.i f54566a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f54567b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f54566a = iVar;
                this.f54567b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th2) {
                try {
                    this.f54566a.a(th2);
                } finally {
                    this.f54567b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f54566a.b(nVar);
                } finally {
                    this.f54567b.shutdown();
                }
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54607a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k kVarA = androidx.emoji2.text.d.a(this.f54565a);
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
            this.f54565a = context.getApplicationContext();
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

    @Override // D4.a
    public List<Class<? extends D4.a<?>>> b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // D4.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean a(Context context) {
        f.j(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        AbstractC6023l lifecycle = ((InterfaceC6030s) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    void e() {
        androidx.emoji2.text.c.c().postDelayed(new d(), 500L);
    }
}

package Va;

import Sa.c;
import Ta.z;
import Ua.e;
import android.os.AsyncTask;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class a extends AsyncTask<Void, Void, C0855a> {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<b> f39822a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f39823b;

    /* renamed from: Va.a$a, reason: collision with other inner class name */
    public static class C0855a {

        /* renamed from: a, reason: collision with root package name */
        private z f39824a;

        /* renamed from: b, reason: collision with root package name */
        private Exception f39825b;

        public Exception c() {
            return this.f39825b;
        }

        public z d() {
            return this.f39824a;
        }

        public boolean e() {
            return this.f39824a != null;
        }

        public void f(Exception exc) {
            this.f39825b = exc;
        }
    }

    public interface b {
        void f(Exception exc);

        void h(z zVar);
    }

    protected C0855a a(Void... voidArr) {
        C0855a c0855a = new C0855a();
        try {
            c0855a.f39824a = ((e) c.c(e.class)).w(this.f39823b);
            return c0855a;
        } catch (Exception e10) {
            c0855a.f39825b = e10;
            return c0855a;
        }
    }

    public void c(InputStream inputStream) {
        this.f39823b = inputStream;
    }

    public a(b bVar) {
        this.f39822a = new WeakReference<>(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(C0855a c0855a) {
        b bVar;
        super.onPostExecute(c0855a);
        if (isCancelled() || (bVar = this.f39822a.get()) == null) {
            return;
        }
        if (c0855a == null) {
            bVar.f(null);
        } else if (!c0855a.e()) {
            bVar.f(c0855a.c());
        } else {
            bVar.h(c0855a.d());
        }
    }
}

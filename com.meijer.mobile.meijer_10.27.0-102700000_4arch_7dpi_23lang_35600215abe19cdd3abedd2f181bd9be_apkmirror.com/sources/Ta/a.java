package Ta;

import Qa.c;
import Ra.z;
import Sa.e;
import android.os.AsyncTask;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class a extends AsyncTask<Void, Void, C0776a> {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<b> f34889a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f34890b;

    /* renamed from: Ta.a$a, reason: collision with other inner class name */
    public static class C0776a {

        /* renamed from: a, reason: collision with root package name */
        private z f34891a;

        /* renamed from: b, reason: collision with root package name */
        private Exception f34892b;

        public Exception c() {
            return this.f34892b;
        }

        public z d() {
            return this.f34891a;
        }

        public boolean e() {
            return this.f34891a != null;
        }

        public void f(Exception exc) {
            this.f34892b = exc;
        }
    }

    public interface b {
        void g(Exception exc);

        void k(z zVar);
    }

    protected C0776a a(Void... voidArr) {
        C0776a c0776a = new C0776a();
        try {
            c0776a.f34891a = ((e) c.c(e.class)).w(this.f34890b);
            return c0776a;
        } catch (Exception e10) {
            c0776a.f34892b = e10;
            return c0776a;
        }
    }

    public void c(InputStream inputStream) {
        this.f34890b = inputStream;
    }

    public a(b bVar) {
        this.f34889a = new WeakReference<>(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(C0776a c0776a) {
        b bVar;
        super.onPostExecute(c0776a);
        if (isCancelled() || (bVar = this.f34889a.get()) == null) {
            return;
        }
        if (c0776a == null) {
            bVar.g(null);
        } else if (!c0776a.e()) {
            bVar.g(c0776a.c());
        } else {
            bVar.k(c0776a.d());
        }
    }
}

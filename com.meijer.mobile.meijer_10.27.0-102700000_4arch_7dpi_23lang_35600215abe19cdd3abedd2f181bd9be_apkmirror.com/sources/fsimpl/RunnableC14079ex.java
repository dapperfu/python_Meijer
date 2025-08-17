package fsimpl;

import com.fullstory.util.Log;
import java.io.IOException;

/* renamed from: fsimpl.ex, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class RunnableC14079ex implements Comparable, Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14070eo f132197a;

    /* renamed from: b, reason: collision with root package name */
    private C14074es f132198b;

    RunnableC14079ex(C14070eo c14070eo, C14074es c14074es) {
        this.f132197a = c14070eo;
        this.f132198b = c14074es;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC14079ex runnableC14079ex) {
        if (runnableC14079ex != null) {
            return this.f132198b.compareTo(runnableC14079ex.f132198b);
        }
        throw new IllegalArgumentException("Null comparable");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f132197a.a(new C14080ey(this));
            this.f132197a.a(this.f132198b.f132183a.f132072a, this.f132198b.f132188f, (IOException) null);
            this.f132197a.f132163c.addAndGet(this.f132198b.f132190h);
            Log.i("Successfully uploaded " + this.f132198b.f132190h + " bytes to " + this.f132198b.f132192j);
            this.f132198b.f132183a.f132075d.remove(this.f132198b);
            this.f132198b.a();
        } catch (IOException e10) {
            this.f132197a.a(this.f132198b.f132183a.f132072a, this.f132198b.f132188f, e10);
            Log.e("I/O error while uploading file, not retrying", e10);
            if ((e10 instanceof C14068em) && ((C14068em) e10).a()) {
                this.f132198b.f132183a.f132075d.remove(this.f132198b);
                this.f132198b.a();
            }
        } catch (Throwable th2) {
            if (th2.getCause() instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            } else {
                Log.e("Unexpected error while uploading file, not retrying", th2);
            }
        }
    }
}

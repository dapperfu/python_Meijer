package fsimpl;

import com.fullstory.util.Log;
import java.io.IOException;

/* renamed from: fsimpl.ex, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class RunnableC14204ex implements Comparable, Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14195eo f133447a;

    /* renamed from: b, reason: collision with root package name */
    private C14199es f133448b;

    RunnableC14204ex(C14195eo c14195eo, C14199es c14199es) {
        this.f133447a = c14195eo;
        this.f133448b = c14199es;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC14204ex runnableC14204ex) {
        if (runnableC14204ex != null) {
            return this.f133448b.compareTo(runnableC14204ex.f133448b);
        }
        throw new IllegalArgumentException("Null comparable");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f133447a.a(new C14205ey(this));
            this.f133447a.a(this.f133448b.f133433a.f133322a, this.f133448b.f133438f, (IOException) null);
            this.f133447a.f133413c.addAndGet(this.f133448b.f133440h);
            Log.i("Successfully uploaded " + this.f133448b.f133440h + " bytes to " + this.f133448b.f133442j);
            this.f133448b.f133433a.f133325d.remove(this.f133448b);
            this.f133448b.a();
        } catch (IOException e10) {
            this.f133447a.a(this.f133448b.f133433a.f133322a, this.f133448b.f133438f, e10);
            Log.e("I/O error while uploading file, not retrying", e10);
            if ((e10 instanceof C14193em) && ((C14193em) e10).a()) {
                this.f133448b.f133433a.f133325d.remove(this.f133448b);
                this.f133448b.a();
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

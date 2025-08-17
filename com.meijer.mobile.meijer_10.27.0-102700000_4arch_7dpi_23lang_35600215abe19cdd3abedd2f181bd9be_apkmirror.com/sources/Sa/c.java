package Sa;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public class c extends Qa.d {

    /* renamed from: a, reason: collision with root package name */
    private b f33492a;

    public interface a {
        void a();

        void b(Bitmap bitmap);
    }

    public interface b {
        void a(String str, a aVar);

        void b(a aVar);
    }

    public void a(a aVar) {
        b bVar = this.f33492a;
        if (bVar != null) {
            bVar.b(aVar);
        }
    }

    public void b(String str, a aVar) {
        b bVar = this.f33492a;
        if (bVar == null) {
            aVar.a();
        } else {
            bVar.a(str, aVar);
        }
    }

    public void c(b bVar) {
        this.f33492a = bVar;
    }
}

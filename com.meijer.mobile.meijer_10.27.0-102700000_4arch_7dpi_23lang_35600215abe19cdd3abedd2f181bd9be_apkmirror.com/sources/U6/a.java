package U6;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: U6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0784a {
        void a(Bitmap bitmap);

        byte[] b(int i10);

        Bitmap c(int i10, int i11, Bitmap.Config config);

        int[] d(int i10);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    void d(Bitmap.Config config);

    int e();

    void f();

    int g();

    ByteBuffer getData();

    int h();
}

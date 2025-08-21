package fsimpl;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* renamed from: fsimpl.ba, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC14101ba {
    int a(long j10, ByteBuffer byteBuffer);

    int a(Bitmap bitmap);

    int a(Path path);

    int a(Shader shader);

    int a(Drawable drawable);

    int a(String str);

    int b(Bitmap bitmap);

    int b(Drawable drawable);

    int c(Bitmap bitmap);

    int d(Bitmap bitmap);
}

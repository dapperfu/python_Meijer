package b7;

import android.util.Log;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p7.C16264a;

/* loaded from: classes4.dex */
public class c implements V6.d<ByteBuffer> {
    @Override // V6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, File file, V6.g gVar) throws Throwable {
        try {
            C16264a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                FS.log_d("ByteBufferEncoder", "Failed to write data", e10);
                return false;
            }
            return false;
        }
    }
}

package d7;

import android.util.Log;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import r7.C16868a;

/* loaded from: classes4.dex */
public class c implements X6.d<ByteBuffer> {
    @Override // X6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, File file, X6.g gVar) throws Throwable {
        try {
            C16868a.f(byteBuffer, file);
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

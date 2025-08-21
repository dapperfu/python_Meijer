package j7;

import android.util.Log;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;
import r7.C16868a;

/* renamed from: j7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14962d implements X6.j<C14961c> {
    @Override // X6.j
    public X6.c a(X6.g gVar) {
        return X6.c.SOURCE;
    }

    @Override // X6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(Z6.c<C14961c> cVar, File file, X6.g gVar) throws Throwable {
        try {
            C16868a.f(cVar.get().c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                FS.log_w("GifEncoder", "Failed to encode GIF drawable data", e10);
                return false;
            }
            return false;
        }
    }
}

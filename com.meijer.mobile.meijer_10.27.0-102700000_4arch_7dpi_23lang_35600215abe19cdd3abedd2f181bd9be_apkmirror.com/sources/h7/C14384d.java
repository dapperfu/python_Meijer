package h7;

import android.util.Log;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;
import p7.C16264a;

/* renamed from: h7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14384d implements V6.j<C14383c> {
    @Override // V6.j
    public V6.c a(V6.g gVar) {
        return V6.c.SOURCE;
    }

    @Override // V6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(X6.c<C14383c> cVar, File file, V6.g gVar) throws Throwable {
        try {
            C16264a.f(cVar.get().c(), file);
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

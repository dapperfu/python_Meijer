package fsimpl;

import android.app.Activity;
import com.fullstory.rust.RustInterface;
import java.util.Collection;

/* renamed from: fsimpl.bt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC14120bt {
    private AbstractC14120bt() {
    }

    public static AbstractC14120bt a(C14138ck c14138ck, RustInterface rustInterface, aL aLVar) {
        if (c14138ck.E()) {
            try {
                return new C14123bw(new C14119bs(rustInterface, aLVar));
            } catch (Throwable th2) {
            }
        }
        return new C14122bv();
    }

    public abstract Collection a();

    public abstract void a(Activity activity);

    public abstract Collection b();

    public abstract void b(Activity activity);
}

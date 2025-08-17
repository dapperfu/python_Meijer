package fsimpl;

import android.app.Activity;
import com.fullstory.rust.RustInterface;
import java.util.Collection;

/* renamed from: fsimpl.bt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC13995bt {
    private AbstractC13995bt() {
    }

    public static AbstractC13995bt a(C14013ck c14013ck, RustInterface rustInterface, aL aLVar) {
        if (c14013ck.E()) {
            try {
                return new C13998bw(new C13994bs(rustInterface, aLVar));
            } catch (Throwable th2) {
            }
        }
        return new C13997bv();
    }

    public abstract Collection a();

    public abstract void a(Activity activity);

    public abstract Collection b();

    public abstract void b(Activity activity);
}

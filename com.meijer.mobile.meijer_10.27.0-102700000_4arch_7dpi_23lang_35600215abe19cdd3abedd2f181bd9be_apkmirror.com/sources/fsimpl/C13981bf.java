package fsimpl;

import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.util.List;

/* renamed from: fsimpl.bf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13981bf {

    /* renamed from: a, reason: collision with root package name */
    private RustInterface f131822a;

    public C13981bf(RustInterface rustInterface) {
        this.f131822a = rustInterface;
    }

    public void a(List list, int i10) {
        if (list == null) {
            return;
        }
        C14103fu.b("String serialization only off main thread", new Object[0]);
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = (String) list.get(i11);
            if (str != null && this.f131822a.d(str) != i11 + i10 + 1) {
                Log.w("Native String Table returned different ID than Android Cache");
            }
        }
    }
}

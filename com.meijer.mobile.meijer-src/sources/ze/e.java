package ze;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public abstract class e extends BinderC18477b implements f {
    public static f a2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new d(iBinder);
    }
}

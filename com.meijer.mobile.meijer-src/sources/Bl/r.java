package Bl;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LBl/r;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isEditMode", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Z)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f3150a = new r();

    public static /* synthetic */ Intent b(r rVar, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return rVar.a(context, z10);
    }

    public final Intent a(Context context, boolean isEditMode) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.singlepagecheckout");
        intentA.putExtra("com.meijer.mobile.meijer.mobile.singlepagecheckout.EXTRA_IS_EDIT_MODE", isEditMode);
        return intentA;
    }

    private r() {
    }
}

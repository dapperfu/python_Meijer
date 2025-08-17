package wk;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.S;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwk/a;", "", "<init>", "()V", "Landroidx/fragment/app/DialogFragment;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "tag", "", "a", "(Landroidx/fragment/app/DialogFragment;Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)V", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C17829a {

    /* renamed from: a, reason: collision with root package name */
    public static final C17829a f166179a = new C17829a();

    public final void a(DialogFragment fragment, FragmentActivity activity, String tag) {
        if (activity == null || fragment == null) {
            return;
        }
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.i(supportFragmentManager, "getSupportFragmentManager(...)");
        S sBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.i(sBeginTransaction, "beginTransaction(...)");
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(tag);
        if (fragmentFindFragmentByTag != null) {
            sBeginTransaction.q(fragmentFindFragmentByTag);
        }
        if (supportFragmentManager.isStateSaved()) {
            return;
        }
        fragment.show(sBeginTransaction, tag);
    }

    private C17829a() {
    }
}

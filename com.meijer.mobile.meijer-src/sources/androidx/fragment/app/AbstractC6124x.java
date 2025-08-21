package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import io.constructor.data.local.PreferencesHelper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ9\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00028\u0000H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010(\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)JS\u0010/\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020*2\u0006\u0010%\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010#2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0017¢\u0006\u0004\b/\u00100J-\u00102\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010%\u001a\u00020\tH\u0017¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000205H\u0016¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b:\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010IR\u0017\u0010N\u001a\u00020J8G¢\u0006\f\n\u0004\b@\u0010K\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Landroidx/fragment/app/x;", "H", "Landroidx/fragment/app/u;", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "context", "Landroid/os/Handler;", "handler", "", "windowAnimations", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "", "i", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "k", "()Landroid/view/LayoutInflater;", "j", "()Ljava/lang/Object;", "p", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/content/Intent;", "intent", "requestCode", "Landroid/os/Bundle;", "options", "n", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "o", "(Landroidx/fragment/app/Fragment;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "permissions", "l", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "permission", "", "m", "(Ljava/lang/String;)Z", PreferencesHelper.PREF_ID, "Landroid/view/View;", "c", "(I)Landroid/view/View;", "d", "()Z", "a", "Landroid/app/Activity;", "e", "()Landroid/app/Activity;", "b", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "Landroid/os/Handler;", "h", "()Landroid/os/Handler;", "I", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "g", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6124x<H> extends AbstractC6121u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Activity activity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int windowAnimations;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    public AbstractC6124x(Activity activity, Context context, Handler handler, int i10) {
        Intrinsics.j(context, "context");
        Intrinsics.j(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i10;
        this.fragmentManager = new G();
    }

    @Override // androidx.fragment.app.AbstractC6121u
    public View c(int id2) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC6121u
    public boolean d() {
        return true;
    }

    public void i(String prefix, FileDescriptor fd2, PrintWriter writer, String[] args) {
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(writer, "writer");
    }

    public abstract H j();

    @Deprecated
    public void l(Fragment fragment, String[] permissions, int requestCode) {
        Intrinsics.j(fragment, "fragment");
        Intrinsics.j(permissions, "permissions");
    }

    public boolean m(String permission) {
        Intrinsics.j(permission, "permission");
        return false;
    }

    public void p() {
    }

    /* renamed from: e, reason: from getter */
    public final Activity getActivity() {
        return this.activity;
    }

    /* renamed from: f, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: g, reason: from getter */
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    /* renamed from: h, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    public LayoutInflater k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        Intrinsics.i(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public void n(Fragment fragment, Intent intent, int requestCode, Bundle options) {
        Intrinsics.j(fragment, "fragment");
        Intrinsics.j(intent, "intent");
        if (requestCode != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Z1.b.o(this.context, intent, options);
    }

    @Deprecated
    public void o(Fragment fragment, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.j(fragment, "fragment");
        Intrinsics.j(intent, "intent");
        if (requestCode != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.activity;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.A(activity, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC6124x(FragmentActivity activity) {
        this(activity, activity, new Handler(), 0);
        Intrinsics.j(activity, "activity");
    }
}

package U4;

import O4.AbstractC4373v;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LU4/l;", "LU4/e;", "", "Landroid/content/Context;", "context", "LY4/b;", "taskExecutor", "<init>", "(Landroid/content/Context;LY4/b;)V", "l", "()Ljava/lang/Boolean;", "Landroid/content/Intent;", "intent", "", "k", "(Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", "j", "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, Y4.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.j(context, "context");
        Intrinsics.j(taskExecutor, "taskExecutor");
    }

    @Override // U4.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // U4.e
    public void k(Intent intent) {
        Intrinsics.j(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        AbstractC4373v.e().a(m.f37102a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    g(Boolean.FALSE);
                }
            } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                g(Boolean.TRUE);
            }
        }
    }

    @Override // U4.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = getAppContext().registerReceiver(null, j());
        boolean z10 = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1181163412) {
                    if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    }
                } else {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                }
                z10 = false;
            } else {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}

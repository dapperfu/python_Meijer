package Rn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"LRn/k;", "Landroid/content/BroadcastReceiver;", "LRn/j;", "manager", "<init>", "(LRn/j;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "LRn/j;", "Landroid/content/IntentFilter;", "()Landroid/content/IntentFilter;", "intentFilter", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rn.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5285k extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5284j manager;

    public C5285k(C5284j manager) {
        Intrinsics.j(manager, "manager");
        this.manager = manager;
    }

    public final IntentFilter a() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.j(context, "context");
        Intrinsics.j(intent, "intent");
        this.manager.a();
    }
}

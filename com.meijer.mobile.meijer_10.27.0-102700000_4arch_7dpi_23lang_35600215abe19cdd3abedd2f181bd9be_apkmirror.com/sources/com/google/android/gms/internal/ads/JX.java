package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
public final class JX implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f67931a;

    /* renamed from: b, reason: collision with root package name */
    public final Mc.d2 f67932b;

    /* renamed from: c, reason: collision with root package name */
    public final List f67933c;

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        AB ab2 = (AB) obj;
        if (((Boolean) C9089pg.f77621a.e()).booleanValue()) {
            Bundle bundle = new Bundle();
            Lc.v.t();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f67931a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("width", this.f67932b.f19217e);
            bundle2.putInt("height", this.f67932b.f19214b);
            bundle.putBundle("size", bundle2);
            if (!this.f67933c.isEmpty()) {
                List list = this.f67933c;
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            ab2.f65088a.putBundle("view_hierarchy", bundle);
        }
    }

    public JX(Context context, Mc.d2 d2Var, List list) {
        this.f67931a = context;
        this.f67932b = d2Var;
        this.f67933c = list;
    }
}

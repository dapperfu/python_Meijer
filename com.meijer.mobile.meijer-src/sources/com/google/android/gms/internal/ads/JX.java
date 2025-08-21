package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
public final class JX implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f68771a;

    /* renamed from: b, reason: collision with root package name */
    public final Oc.d2 f68772b;

    /* renamed from: c, reason: collision with root package name */
    public final List f68773c;

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        AB ab2 = (AB) obj;
        if (((Boolean) C9214pg.f78461a.e()).booleanValue()) {
            Bundle bundle = new Bundle();
            Nc.v.t();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f68771a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("width", this.f68772b.f23404e);
            bundle2.putInt("height", this.f68772b.f23401b);
            bundle.putBundle("size", bundle2);
            if (!this.f68773c.isEmpty()) {
                List list = this.f68773c;
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            ab2.f65928a.putBundle("view_hierarchy", bundle);
        }
    }

    public JX(Context context, Oc.d2 d2Var, List list) {
        this.f68771a = context;
        this.f68772b = d2Var;
        this.f68773c = list;
    }
}

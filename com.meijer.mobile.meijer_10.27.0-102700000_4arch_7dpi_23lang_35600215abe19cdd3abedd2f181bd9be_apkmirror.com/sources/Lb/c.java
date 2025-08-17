package Lb;

import android.content.Context;
import android.os.Process;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f17934a;

    public static boolean c(int i10) {
        return i10 == 0;
    }

    public final int a(String str) {
        return this.f17934a.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public final boolean b() {
        return a("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public c(Context context) {
        this.f17934a = context;
    }
}

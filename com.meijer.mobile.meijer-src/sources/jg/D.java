package jg;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljg/D;", "", "<init>", "()V", "", "c", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "Ljg/C;", "a", "(Landroid/content/Context;)Ljava/util/List;", "b", "(Landroid/content/Context;)Ljg/C;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f140430a = new D();

    private final String c() throws Throwable {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            String strMyProcessName = Process.myProcessName();
            Intrinsics.i(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i10 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strA = com.google.android.gms.common.util.p.a();
        return strA != null ? strA : "";
    }

    public final List<ProcessDetails> a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listM;
        Intrinsics.j(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listM = activityManager.getRunningAppProcesses()) == null) {
            listM = CollectionsKt.m();
        }
        List listP0 = CollectionsKt.p0(listM);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listP0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            Intrinsics.i(processName, "processName");
            arrayList2.add(new ProcessDetails(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.e(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final ProcessDetails b(Context context) {
        Object next;
        Intrinsics.j(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProcessDetails) next).getPid() == iMyPid) {
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? new ProcessDetails(c(), iMyPid, 0, false) : processDetails;
    }

    private D() {
    }
}

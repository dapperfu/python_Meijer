package lf;

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
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rf.AbstractC16777F;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Llf/j;", "", "<init>", "()V", "", "f", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "", "Lrf/F$e$d$a$c;", "d", "(Landroid/content/Context;)Ljava/util/List;", "e", "(Landroid/content/Context;)Lrf/F$e$d$a$c;", "processName", "", "pid", "importance", "", "isDefaultProcess", "b", "(Ljava/lang/String;IIZ)Lrf/F$e$d$a$c;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f148865a = new j();

    @JvmOverloads
    public final AbstractC16777F.e.d.a.c a(String processName, int i10, int i11) {
        Intrinsics.j(processName, "processName");
        return c(this, processName, i10, i11, false, 8, null);
    }

    public static /* synthetic */ AbstractC16777F.e.d.a.c c(j jVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return jVar.b(str, i10, i11, z10);
    }

    private final String f() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 33) {
            return (i10 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        Intrinsics.g(strMyProcessName);
        return strMyProcessName;
    }

    @JvmOverloads
    public final AbstractC16777F.e.d.a.c b(String processName, int pid, int importance, boolean isDefaultProcess) {
        Intrinsics.j(processName, "processName");
        AbstractC16777F.e.d.a.c cVarA = AbstractC16777F.e.d.a.c.a().e(processName).d(pid).c(importance).b(isDefaultProcess).a();
        Intrinsics.i(cVarA, "build(...)");
        return cVarA;
    }

    public final List<AbstractC16777F.e.d.a.c> d(Context context) {
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
            arrayList2.add(AbstractC16777F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(Intrinsics.e(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final AbstractC16777F.e.d.a.c e(Context context) {
        Object next;
        Intrinsics.j(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC16777F.e.d.a.c) next).c() == iMyPid) {
                break;
            }
        }
        AbstractC16777F.e.d.a.c cVar = (AbstractC16777F.e.d.a.c) next;
        return cVar == null ? c(this, f(), iMyPid, 0, false, 12, null) : cVar;
    }

    private j() {
    }
}

package com.radiusnetworks.flybuy.sdk.logging;

import android.util.Log;
import com.fullstory.FS;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001aA\u0010\u0007\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001aA\u0010\u000e\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000f\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001aA\u0010\u000f\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u0010\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001aA\u0010\u0010\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u0011\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001aA\u0010\u0011\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u0012\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001aA\u0010\u0012\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\r¨\u0006\u0013"}, d2 = {"prepareLog", "", "message", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "logd", "", "internal", "", "throwable", "", "(Ljava/lang/Object;ZLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "loge", "logi", "logv", "logw", "logwtf", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogExtensionsKt {
    public static final void logd(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 3) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 3)) {
            return;
        }
        FS.log_d(obj.getClass().getCanonicalName(), message);
    }

    public static /* synthetic */ void logd$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logd(obj, z10, str);
    }

    public static final void loge(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 6) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 6)) {
            return;
        }
        FS.log_e(obj.getClass().getCanonicalName(), message);
    }

    public static /* synthetic */ void loge$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        loge(obj, z10, str);
    }

    public static final void logi(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 4) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 4)) {
            return;
        }
        FS.log_i(obj.getClass().getCanonicalName(), message);
    }

    public static /* synthetic */ void logi$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logi(obj, z10, str);
    }

    public static final void logv(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 2) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 2)) {
            return;
        }
        FS.log_v(obj.getClass().getCanonicalName(), message);
    }

    public static /* synthetic */ void logv$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logv(obj, z10, str);
    }

    public static final void logw(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 5) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 5)) {
            return;
        }
        FS.log_w(obj.getClass().getCanonicalName(), message);
    }

    public static /* synthetic */ void logw$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logw(obj, z10, str);
    }

    public static final void logwtf(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 7) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 7)) {
            return;
        }
        Log.wtf(obj.getClass().getCanonicalName(), message);
    }

    public static /* synthetic */ void logwtf$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logwtf(obj, z10, str);
    }

    private static final String prepareLog(String str, Object... objArr) {
        if (str == null) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{objArr}, 1));
        Intrinsics.i(str2, "format(format, *args)");
        return str2;
    }

    public static final void logd(Object obj, boolean z10, Throwable throwable, String str, Object... args) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(args, "args");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 3) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 3)) {
            return;
        }
        FS.log_d(obj.getClass().getCanonicalName(), prepareLog(str, args), throwable);
    }

    public static /* synthetic */ void logd$default(Object obj, boolean z10, Throwable th2, String str, Object[] objArr, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        logd(obj, z10, th2, str, objArr);
    }

    public static final void loge(Object obj, boolean z10, Throwable throwable, String str, Object... args) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(args, "args");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 6) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 6)) {
            return;
        }
        FS.log_e(obj.getClass().getCanonicalName(), prepareLog(str, args), throwable);
    }

    public static /* synthetic */ void loge$default(Object obj, boolean z10, Throwable th2, String str, Object[] objArr, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        loge(obj, z10, th2, str, objArr);
    }

    public static final void logi(Object obj, boolean z10, Throwable throwable, String str, Object... args) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(args, "args");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 4) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 4)) {
            return;
        }
        FS.log_i(obj.getClass().getCanonicalName(), prepareLog(str, args), throwable);
    }

    public static /* synthetic */ void logi$default(Object obj, boolean z10, Throwable th2, String str, Object[] objArr, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        logi(obj, z10, th2, str, objArr);
    }

    public static final void logv(Object obj, boolean z10, Throwable throwable, String str, Object... args) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(args, "args");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 2) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 2)) {
            return;
        }
        FS.log_v(obj.getClass().getCanonicalName(), prepareLog(str, args), throwable);
    }

    public static /* synthetic */ void logv$default(Object obj, boolean z10, Throwable th2, String str, Object[] objArr, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        logv(obj, z10, th2, str, objArr);
    }

    public static final void logw(Object obj, boolean z10, Throwable throwable, String str, Object... args) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(args, "args");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 5) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 5)) {
            return;
        }
        FS.log_w(obj.getClass().getCanonicalName(), prepareLog(str, args), throwable);
    }

    public static /* synthetic */ void logw$default(Object obj, boolean z10, Throwable th2, String str, Object[] objArr, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        logw(obj, z10, th2, str, objArr);
    }

    public static final void logwtf(Object obj, boolean z10, Throwable throwable, String str, Object... args) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(args, "args");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 7) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 7)) {
            return;
        }
        Log.wtf(obj.getClass().getCanonicalName(), prepareLog(str, args), throwable);
    }

    public static /* synthetic */ void logwtf$default(Object obj, boolean z10, Throwable th2, String str, Object[] objArr, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        logwtf(obj, z10, th2, str, objArr);
    }
}

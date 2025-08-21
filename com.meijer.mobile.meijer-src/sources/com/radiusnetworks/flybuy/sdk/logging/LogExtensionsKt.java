package com.radiusnetworks.flybuy.sdk.logging;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import qw.a;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u001a+\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002H\u0002¢\u0006\u0002\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0001\u001aA\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0001\u001aA\u0010\u0011\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0001\u001aA\u0010\u0012\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0013\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0001\u001aA\u0010\u0013\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0014\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0001\u001aA\u0010\u0014\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0015\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0001\u001aA\u0010\u0015\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002¢\u0006\u0002\u0010\u0010\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0016"}, d2 = {"tagName", "", "", "getTagName", "(Ljava/lang/Object;)Ljava/lang/String;", "prepareLog", "message", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "logd", "", "internal", "", "throwable", "", "(Ljava/lang/Object;ZLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "loge", "logi", "logv", "logw", "logwtf", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LogExtensionsKt {
    public static final void logd(Object obj, boolean z10, Throwable throwable, String str, Object... args) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(args, "args");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 3) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 3)) {
            return;
        }
        a.INSTANCE.z(getTagName(obj)).c(throwable, prepareLog(str, args), new Object[0]);
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
        a.INSTANCE.z(getTagName(obj)).f(throwable, prepareLog(str, args), new Object[0]);
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
        a.INSTANCE.z(getTagName(obj)).l(throwable, prepareLog(str, args), new Object[0]);
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
        a.INSTANCE.z(getTagName(obj)).r(throwable, prepareLog(str, args), new Object[0]);
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
        a.INSTANCE.z(getTagName(obj)).u(throwable, prepareLog(str, args), new Object[0]);
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
        a.INSTANCE.z(getTagName(obj)).w(throwable, prepareLog(str, args), new Object[0]);
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

    public static /* synthetic */ void logd$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logd(obj, z10, str);
    }

    public static /* synthetic */ void loge$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        loge(obj, z10, str);
    }

    public static /* synthetic */ void logi$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logi(obj, z10, str);
    }

    public static /* synthetic */ void logv$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logv(obj, z10, str);
    }

    public static /* synthetic */ void logw$default(Object obj, boolean z10, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        logw(obj, z10, str);
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
        StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{objArr}, 1));
        Intrinsics.i(str2, "format(...)");
        return str2;
    }

    private static final String getTagName(Object obj) {
        String name = obj.getClass().getName();
        Intrinsics.i(name, "getName(...)");
        return StringsKt.r1(name, '.', null, 2, null);
    }

    public static final void logd(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 3) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 3)) {
            return;
        }
        a.INSTANCE.z(getTagName(obj)).a(message, new Object[0]);
    }

    public static final void loge(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 6) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 6)) {
            return;
        }
        a.INSTANCE.z(getTagName(obj)).d(message, new Object[0]);
    }

    public static final void logi(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 4) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 4)) {
            return;
        }
        a.INSTANCE.z(getTagName(obj)).k(message, new Object[0]);
    }

    public static final void logv(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 2) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 2)) {
            return;
        }
        a.INSTANCE.z(getTagName(obj)).q(message, new Object[0]);
    }

    public static final void logw(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 5) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 5)) {
            return;
        }
        a.INSTANCE.z(getTagName(obj)).s(message, new Object[0]);
    }

    public static final void logwtf(Object obj, boolean z10, String message) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(message, "message");
        if ((z10 || FlyBuyLogging.INSTANCE.getLogLevel() > 7) && (!z10 || FlyBuyLogging.INSTANCE.getInternalLogLevel() > 7)) {
            return;
        }
        a.INSTANCE.z(getTagName(obj)).v(message, new Object[0]);
    }
}

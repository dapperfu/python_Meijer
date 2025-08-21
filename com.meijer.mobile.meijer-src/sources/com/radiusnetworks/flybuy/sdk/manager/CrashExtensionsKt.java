package com.radiusnetworks.flybuy.sdk.manager;

import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a)\u0010\u0006\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"catchAndRelease", "T", "", "method", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "catchAndThrow", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CrashExtensionsKt {
    @Keep
    public static final <T> T catchAndRelease(Object obj, Function0<? extends T> method) {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(method, "method");
        try {
            return method.invoke();
        } catch (Exception e10) {
            LogExtensionsKt.logd(obj, true, e10, "catchAndRelease caught exception", new Object[0]);
            FlyBuyCore.INSTANCE.getCrashManager().log("catchAndRelease caught exception");
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            return null;
        }
    }

    @Keep
    public static final <T> T catchAndThrow(Object obj, Function0<? extends T> method) throws Exception {
        Intrinsics.j(obj, "<this>");
        Intrinsics.j(method, "method");
        try {
            return method.invoke();
        } catch (Exception e10) {
            LogExtensionsKt.logd(obj, true, e10, "catchAndThrow caught exception", new Object[0]);
            FlyBuyCore.INSTANCE.getCrashManager().log("catchAndThrow caught exception");
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}

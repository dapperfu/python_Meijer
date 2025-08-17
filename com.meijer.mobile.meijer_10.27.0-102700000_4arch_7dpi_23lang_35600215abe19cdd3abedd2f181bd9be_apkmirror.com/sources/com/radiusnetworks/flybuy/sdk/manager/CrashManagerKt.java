package com.radiusnetworks.flybuy.sdk.manager;

import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0005"}, d2 = {"catchAndThrow", "T", "method", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CrashManagerKt {
    @Keep
    public static final <T> T catchAndThrow(Function0<? extends T> method) throws Exception {
        Intrinsics.j(method, "method");
        try {
            return method.invoke();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}

package com.scandit.datacapture.core.internal.sdk.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J!\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\b\bH&¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/data/Subscription;", "T", "", "dispose", "", "use", "action", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface Subscription<T> {
    void dispose();

    void use(Function1<? super T, Unit> action);
}

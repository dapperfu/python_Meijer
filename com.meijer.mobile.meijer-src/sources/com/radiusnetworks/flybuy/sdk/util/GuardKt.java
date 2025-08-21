package com.radiusnetworks.flybuy.sdk.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u0004\u0018\u0001H\u00012\u0019\u0010\u0002\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"guard", "T", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GuardKt {
    public static final /* synthetic */ <T> T guard(T t10, Function1<? super T, Unit> block) {
        Intrinsics.j(block, "block");
        if (t10 != null) {
            return t10;
        }
        block.invoke(t10);
        Intrinsics.n(4, "T");
        return (T) Object.class.getDeclaredConstructor(null).newInstance(null);
    }
}

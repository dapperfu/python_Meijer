package com.squareup.moshi;

import gu.C14408a;
import gu.C14409b;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lcom/squareup/moshi/t;", "Lkotlin/reflect/KType;", "ktype", "Lcom/squareup/moshi/h;", "a", "(Lcom/squareup/moshi/t;Lkotlin/reflect/KType;)Lcom/squareup/moshi/h;", "moshi"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y {
    @ExperimentalStdlibApi
    public static final <T> h<T> a(t tVar, KType ktype) {
        Intrinsics.j(tVar, "<this>");
        Intrinsics.j(ktype, "ktype");
        h<T> hVarD = tVar.d(TypesJVMKt.f(ktype));
        if ((hVarD instanceof C14409b) || (hVarD instanceof C14408a)) {
            return hVarD;
        }
        if (ktype.e()) {
            h<T> hVarNullSafe = hVarD.nullSafe();
            Intrinsics.i(hVarNullSafe, "{\n    adapter.nullSafe()\n  }");
            return hVarNullSafe;
        }
        h<T> hVarNonNull = hVarD.nonNull();
        Intrinsics.i(hVarNonNull, "{\n    adapter.nonNull()\n  }");
        return hVarNonNull;
    }
}

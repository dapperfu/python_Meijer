package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.PlusCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"plusCode", "Lcom/google/android/libraries/places/api/model/PlusCode;", "actions", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/PlusCode$Builder;", "", "Lkotlin/ExtensionFunctionType;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlusCodeKt {
    public static final PlusCode plusCode(@RecentlyNonNull Function1<? super PlusCode.Builder, Unit> actions) {
        Intrinsics.j(actions, "actions");
        PlusCode.Builder builder = PlusCode.builder();
        actions.invoke(builder);
        PlusCode plusCodeBuild = builder.build();
        Intrinsics.i(plusCodeBuild, "build(...)");
        return plusCodeBuild;
    }
}

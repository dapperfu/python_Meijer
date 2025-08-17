package com.scandit.datacapture.core.internal.sdk.battery;

import com.scandit.datacapture.core.source.BatterySavingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f125375a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f125375a = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Boolean bool = (Boolean) obj;
        bool.getClass();
        b bVar = this.f125375a;
        if (bVar.f125377b == BatterySavingMode.AUTO && (function1 = bVar.f125378c) != null) {
            function1.invoke(bool);
        }
        return Unit.f142422a;
    }
}

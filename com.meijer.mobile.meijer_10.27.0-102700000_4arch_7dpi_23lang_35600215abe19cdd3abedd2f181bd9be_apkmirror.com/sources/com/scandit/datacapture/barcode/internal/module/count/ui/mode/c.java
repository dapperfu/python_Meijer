package com.scandit.datacapture.barcode.internal.module.count.ui.mode;

import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.g;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f121749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f121750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, b bVar) {
        super(0);
        this.f121749a = dVar;
        this.f121750b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j jVar = (j) this.f121749a.f121752b;
        jVar.f121731c.a(jVar.f121730b, g.f121726a);
        this.f121749a.a(new b(this.f121750b.f121747a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f121705b));
        return Unit.f142422a;
    }
}

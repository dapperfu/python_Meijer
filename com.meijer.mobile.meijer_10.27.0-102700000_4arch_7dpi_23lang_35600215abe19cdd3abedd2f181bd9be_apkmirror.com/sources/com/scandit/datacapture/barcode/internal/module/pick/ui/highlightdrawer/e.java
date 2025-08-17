package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f122631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f122632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f122633c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f122634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f122635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, List list, f fVar, List list2) {
        super(0);
        this.f122631a = linkedHashMap;
        this.f122632b = linkedHashMap2;
        this.f122633c = list;
        this.f122634d = fVar;
        this.f122635e = list2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f122631a;
        f fVar = this.f122634d;
        for (Map.Entry entry : map.entrySet()) {
            fVar.f122640e.a((TrackedObject) entry.getKey(), (BarcodePickState) entry.getValue());
        }
        Map map2 = this.f122632b;
        f fVar2 = this.f122634d;
        for (Map.Entry entry2 : map2.entrySet()) {
            fVar2.f122640e.b((TrackedObject) entry2.getKey(), (BarcodePickState) entry2.getValue());
        }
        List list = this.f122633c;
        f fVar3 = this.f122634d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fVar3.f122640e.a(((Number) it.next()).intValue());
        }
        this.f122634d.f122640e.a(this.f122635e);
        f fVar4 = this.f122634d;
        fVar4.f122638c.invoke(Boolean.valueOf(fVar4.f122640e.a()));
        return Unit.f142422a;
    }
}

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

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f123583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f123584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f123585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f123586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f123587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, List list, f fVar, List list2) {
        super(0);
        this.f123583a = linkedHashMap;
        this.f123584b = linkedHashMap2;
        this.f123585c = list;
        this.f123586d = fVar;
        this.f123587e = list2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f123583a;
        f fVar = this.f123586d;
        for (Map.Entry entry : map.entrySet()) {
            fVar.f123592e.a((TrackedObject) entry.getKey(), (BarcodePickState) entry.getValue());
        }
        Map map2 = this.f123584b;
        f fVar2 = this.f123586d;
        for (Map.Entry entry2 : map2.entrySet()) {
            fVar2.f123592e.b((TrackedObject) entry2.getKey(), (BarcodePickState) entry2.getValue());
        }
        List list = this.f123585c;
        f fVar3 = this.f123586d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fVar3.f123592e.a(((Number) it.next()).intValue());
        }
        this.f123586d.f123592e.a(this.f123587e);
        f fVar4 = this.f123586d;
        fVar4.f123590c.invoke(Boolean.valueOf(fVar4.f123592e.a()));
        return Unit.f143329a;
    }
}

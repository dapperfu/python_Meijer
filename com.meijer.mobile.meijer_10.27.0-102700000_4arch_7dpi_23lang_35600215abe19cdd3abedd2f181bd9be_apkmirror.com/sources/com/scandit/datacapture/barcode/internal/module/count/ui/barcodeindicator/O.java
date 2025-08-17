package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.O;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f121403a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f121404b = Executors.newSingleThreadExecutor();

    public static void a(final LinkedHashMap items) {
        Intrinsics.j(items, "items");
        f121404b.execute(new Runnable() { // from class: Kt.a
            @Override // java.lang.Runnable
            public final void run() {
                O.a(items);
            }
        });
    }

    public static final void b(int i10) {
        com.scandit.datacapture.barcode.internal.module.count.ui.status.e eVar;
        Integer num;
        for (Map.Entry entry : f121403a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            com.scandit.datacapture.barcode.internal.module.count.ui.status.b bVar = (com.scandit.datacapture.barcode.internal.module.count.ui.status.b) entry.getValue();
            if ((bVar instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e) && (num = (eVar = (com.scandit.datacapture.barcode.internal.module.count.ui.status.e) bVar).f121797b) != null && num.intValue() == i10) {
                f121403a.put(Integer.valueOf(iIntValue), new com.scandit.datacapture.barcode.internal.module.count.ui.status.e(eVar.f121796a, null));
            }
        }
    }

    public static final void a(Map items) {
        Intrinsics.j(items, "$items");
        LinkedHashMap linkedHashMap = f121403a;
        linkedHashMap.clear();
        linkedHashMap.putAll(items);
    }

    public static Map c() throws ExecutionException, InterruptedException {
        Object obj = f121404b.submit(new Callable() { // from class: Kt.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return O.d();
            }
        }).get();
        Intrinsics.i(obj, "get(...)");
        return (Map) obj;
    }

    public static final Map d() {
        return MapsKt.A(f121403a);
    }

    public static boolean e() throws ExecutionException, InterruptedException {
        Object obj = f121404b.submit(new Callable() { // from class: Kt.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return O.f();
            }
        }).get();
        Intrinsics.i(obj, "get(...)");
        return ((Boolean) obj).booleanValue();
    }

    public static final Boolean f() {
        return Boolean.valueOf(!f121403a.isEmpty());
    }

    public static void a(final int i10) {
        f121404b.execute(new Runnable() { // from class: Kt.d
            @Override // java.lang.Runnable
            public final void run() {
                O.b(i10);
            }
        });
    }

    public static void a() {
        f121404b.execute(new Runnable() { // from class: Kt.b
            @Override // java.lang.Runnable
            public final void run() {
                O.b();
            }
        });
    }

    public static final void b() {
        f121403a.clear();
    }
}

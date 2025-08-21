package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import com.bugsnag.android.e1;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/bugsnag/android/BreadcrumbState;", "Lcom/bugsnag/android/m;", "Lcom/bugsnag/android/v0$a;", "", "maxBreadcrumbs", "Lcom/bugsnag/android/r;", "callbackState", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(ILcom/bugsnag/android/r;Lcom/bugsnag/android/D0;)V", "getBreadcrumbIndex", "()I", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumb", "", "add", "(Lcom/bugsnag/android/Breadcrumb;)V", "", "copy", "()Ljava/util/List;", "Lcom/bugsnag/android/v0;", "writer", "toStream", "(Lcom/bugsnag/android/v0;)V", "I", "Lcom/bugsnag/android/r;", "Lcom/bugsnag/android/D0;", "validIndexMask", "", PlaceTypes.STORE, "[Lcom/bugsnag/android/Breadcrumb;", "Ljava/util/concurrent/atomic/AtomicInteger;", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class BreadcrumbState extends C6606m implements C6624v0.a {
    private final CallbackState callbackState;
    private final D0 logger;
    private final int maxBreadcrumbs;
    private final Breadcrumb[] store;
    private final int validIndexMask = a.e.API_PRIORITY_OTHER;
    private final AtomicInteger index = new AtomicInteger(0);

    private final int getBreadcrumbIndex() {
        int i10;
        do {
            i10 = this.index.get() & this.validIndexMask;
        } while (!this.index.compareAndSet(i10, (i10 + 1) % this.maxBreadcrumbs));
        return i10;
    }

    public final void add(Breadcrumb breadcrumb) {
        if (this.maxBreadcrumbs == 0 || !this.callbackState.f(breadcrumb, this.logger)) {
            return;
        }
        this.store[getBreadcrumbIndex()] = breadcrumb;
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        C6608n c6608n = breadcrumb.impl;
        String str = c6608n.message;
        BreadcrumbType breadcrumbType = c6608n.type;
        String strC = R6.g.c(c6608n.timestamp);
        Map linkedHashMap = breadcrumb.impl.metadata;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        e1.a aVar = new e1.a(str, breadcrumbType, strC, linkedHashMap);
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((R6.r) it.next()).onStateChange(aVar);
        }
    }

    public final List<Breadcrumb> copy() {
        if (this.maxBreadcrumbs == 0) {
            return CollectionsKt.m();
        }
        int andSet = -1;
        while (andSet == -1) {
            andSet = this.index.getAndSet(-1);
        }
        try {
            int i10 = this.maxBreadcrumbs;
            Breadcrumb[] breadcrumbArr = new Breadcrumb[i10];
            ArraysKt.o(this.store, breadcrumbArr, 0, andSet, i10);
            ArraysKt.o(this.store, breadcrumbArr, this.maxBreadcrumbs - andSet, 0, andSet);
            return ArraysKt.c0(breadcrumbArr);
        } finally {
            this.index.set(andSet);
        }
    }

    public BreadcrumbState(int i10, CallbackState callbackState, D0 d02) {
        this.maxBreadcrumbs = i10;
        this.callbackState = callbackState;
        this.logger = d02;
        this.store = new Breadcrumb[i10];
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws Throwable {
        List<Breadcrumb> listCopy = copy();
        writer.c();
        Iterator<T> it = listCopy.iterator();
        while (it.hasNext()) {
            ((Breadcrumb) it.next()).toStream(writer);
        }
        writer.h();
    }
}

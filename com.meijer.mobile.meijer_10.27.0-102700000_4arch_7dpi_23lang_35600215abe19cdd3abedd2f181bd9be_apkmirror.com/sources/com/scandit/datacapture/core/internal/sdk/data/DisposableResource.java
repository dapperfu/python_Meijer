package com.scandit.datacapture.core.internal.sdk.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0014B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/data/DisposableResource;", "T", "", "Lkotlin/Function0;", "factory", "Lkotlin/Function1;", "", "tearDown", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lcom/scandit/datacapture/core/internal/sdk/data/Subscription;", "start", "()Lcom/scandit/datacapture/core/internal/sdk/data/Subscription;", "", "<set-?>", "c", "I", "getCounter$scandit_capture_core", "()I", "counter", "com/scandit/datacapture/core/internal/sdk/data/a", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class DisposableResource<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f125439a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f125440b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int counter;

    /* renamed from: d, reason: collision with root package name */
    private Object f125442d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f125443e;

    public DisposableResource(Function0<? extends T> factory, Function1<? super T, Unit> tearDown) {
        Intrinsics.j(factory, "factory");
        Intrinsics.j(tearDown, "tearDown");
        this.f125439a = factory;
        this.f125440b = tearDown;
        this.f125443e = new Object();
    }

    /* renamed from: getCounter$scandit_capture_core, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    public final Subscription<T> start() {
        synchronized (this.f125443e) {
            try {
                int i10 = this.counter + 1;
                this.counter = i10;
                if (i10 == 1) {
                    this.f125442d = this.f125439a.invoke();
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new a(this);
    }
}

package io.reactivex.observers;

import ev.r;
import io.reactivex.observers.a;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public abstract class a<T, U extends a<T, U>> implements Nu.b {

    /* renamed from: d, reason: collision with root package name */
    protected long f138242d;

    /* renamed from: e, reason: collision with root package name */
    protected Thread f138243e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f138244f;

    /* renamed from: g, reason: collision with root package name */
    protected int f138245g;

    /* renamed from: h, reason: collision with root package name */
    protected int f138246h;

    /* renamed from: b, reason: collision with root package name */
    protected final List<T> f138240b = new r();

    /* renamed from: c, reason: collision with root package name */
    protected final List<Throwable> f138241c = new r();

    /* renamed from: a, reason: collision with root package name */
    protected final CountDownLatch f138239a = new CountDownLatch(1);
}

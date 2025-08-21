package io.reactivex.observers;

import av.r;
import io.reactivex.observers.a;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public abstract class a<T, U extends a<T, U>> implements Ju.b {

    /* renamed from: d, reason: collision with root package name */
    protected long f138884d;

    /* renamed from: e, reason: collision with root package name */
    protected Thread f138885e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f138886f;

    /* renamed from: g, reason: collision with root package name */
    protected int f138887g;

    /* renamed from: h, reason: collision with root package name */
    protected int f138888h;

    /* renamed from: b, reason: collision with root package name */
    protected final List<T> f138882b = new r();

    /* renamed from: c, reason: collision with root package name */
    protected final List<Throwable> f138883c = new r();

    /* renamed from: a, reason: collision with root package name */
    protected final CountDownLatch f138881a = new CountDownLatch(1);
}

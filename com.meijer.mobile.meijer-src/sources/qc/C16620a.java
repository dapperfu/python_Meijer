package qc;

import H1.y;
import f1.C13942e;
import f1.InterfaceC13938a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lqc/a;", "Lf1/a;", "", "consumeHorizontal", "consumeVertical", "Lqc/g;", "pagerState", "<init>", "(ZZLqc/g;)V", "LU0/f;", "consumed", "available", "Lf1/e;", "source", "L0", "(JJI)J", "LH1/y;", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Z", "b", "c", "Lqc/g;", "pager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16620a implements InterfaceC13938a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean consumeHorizontal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean consumeVertical;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PagerState pagerState;

    public C16620a(boolean z10, boolean z11, PagerState pagerState) {
        Intrinsics.j(pagerState, "pagerState");
        this.consumeHorizontal = z10;
        this.consumeVertical = z11;
        this.pagerState = pagerState;
    }

    @Override // f1.InterfaceC13938a
    public long L0(long consumed, long available, int source) {
        return C13942e.f(source, C13942e.INSTANCE.b()) ? C16621b.e(available, this.consumeHorizontal, this.consumeVertical) : U0.f.INSTANCE.c();
    }

    @Override // f1.InterfaceC13938a
    public Object b0(long j10, long j11, Continuation<? super y> continuation) {
        return y.b(this.pagerState.m() == 0.0f ? C16621b.f(j11, this.consumeHorizontal, this.consumeVertical) : y.INSTANCE.a());
    }
}

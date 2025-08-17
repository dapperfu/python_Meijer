package com.meijer.mobile.meijer.activity.find;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0014\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/p0;", "Landroidx/recyclerview/widget/RecyclerView$u;", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "listener", "Lkotlin/Function0;", "", "onScrollCallback", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/p0$b;Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "a", "Lcom/meijer/mobile/meijer/activity/find/p0$b;", "getListener", "()Lcom/meijer/mobile/meijer/activity/find/p0$b;", "b", "Lkotlin/jvm/functions/Function0;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.p0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12104p0 extends RecyclerView.u {

    /* renamed from: d, reason: collision with root package name */
    public static final int f106992d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onScrollCallback;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/p0$b;", "", "", "d0", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.p0$b */
    public interface b {
        void d0();
    }

    public /* synthetic */ C12104p0(b bVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? new Function0() { // from class: com.meijer.mobile.meijer.activity.find.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12104p0.b();
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b() {
        return Unit.f142422a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.j(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, dx, dy);
        this.onScrollCallback.invoke();
        if (dy >= 0 || dx >= 0) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int iA = linearLayoutManager.a();
                if (linearLayoutManager.u2() == RangesKt.f(iA - 10, Math.max(1, iA - 1))) {
                    this.listener.d0();
                }
            }
        }
    }

    public C12104p0(b listener, Function0<Unit> onScrollCallback) {
        Intrinsics.j(listener, "listener");
        Intrinsics.j(onScrollCallback, "onScrollCallback");
        this.listener = listener;
        this.onScrollCallback = onScrollCallback;
    }
}

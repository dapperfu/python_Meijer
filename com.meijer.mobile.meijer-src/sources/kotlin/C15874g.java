package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.AnimationState;
import kotlin.C6456m;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Ln0/g;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "Lc0/k;", "", "Lc0/m;", "previousAnimation", "<init>", "(ILc0/k;)V", "a", "I", "()I", "b", "Lc0/k;", "()Lc0/k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15874g extends CancellationException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int itemOffset;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AnimationState<Float, C6456m> previousAnimation;

    /* renamed from: a, reason: from getter */
    public final int getItemOffset() {
        return this.itemOffset;
    }

    public final AnimationState<Float, C6456m> b() {
        return this.previousAnimation;
    }

    public C15874g(int i10, AnimationState<Float, C6456m> animationState) {
        this.itemOffset = i10;
        this.previousAnimation = animationState;
    }
}

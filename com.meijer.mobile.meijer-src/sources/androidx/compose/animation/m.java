package androidx.compose.animation;

import H1.r;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.u;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012<\u0010\u000b\u001a8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0004¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012RM\u0010\u000b\u001a8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/m;", "Lb0/u;", "", "clip", "Lkotlin/Function2;", "LH1/r;", "Lkotlin/ParameterName;", "name", "initialSize", "targetSize", "Lc0/F;", "sizeAnimationSpec", "<init>", "(ZLkotlin/jvm/functions/Function2;)V", "b", "(JJ)Lc0/F;", "a", "Z", "()Z", "Lkotlin/jvm/functions/Function2;", "getSizeAnimationSpec", "()Lkotlin/jvm/functions/Function2;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class m implements u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean clip;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<r, r, InterfaceC6419F<r>> sizeAnimationSpec;

    @Override // kotlin.u
    /* renamed from: a, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // kotlin.u
    public InterfaceC6419F<r> b(long initialSize, long targetSize) {
        return this.sizeAnimationSpec.invoke(r.b(initialSize), r.b(targetSize));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(boolean z10, Function2<? super r, ? super r, ? extends InterfaceC6419F<r>> function2) {
        this.clip = z10;
        this.sizeAnimationSpec = function2;
    }
}

package kotlin;

import H1.r;
import kotlin.InterfaceC6293F;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR2\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b \u0010$¨\u0006%"}, d2 = {"Lb0/g;", "", "LP0/e;", "alignment", "Lkotlin/Function1;", "LH1/r;", "Lkotlin/ParameterName;", "name", "fullSize", "size", "Lc0/F;", "animationSpec", "", "clip", "<init>", "(LP0/e;Lkotlin/jvm/functions/Function1;Lc0/F;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LP0/e;", "()LP0/e;", "b", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "c", "Lc0/F;", "()Lc0/F;", "Z", "()Z", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class ChangeSize {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final P0.e alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function1<r, r> size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6293F<r> animationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) other;
        return Intrinsics.e(this.alignment, changeSize.alignment) && Intrinsics.e(this.size, changeSize.size) && Intrinsics.e(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    /* renamed from: a, reason: from getter */
    public final P0.e getAlignment() {
        return this.alignment;
    }

    public final InterfaceC6293F<r> b() {
        return this.animationSpec;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final Function1<r, r> d() {
        return this.size;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + Boolean.hashCode(this.clip);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(P0.e eVar, Function1<? super r, r> function1, InterfaceC6293F<r> interfaceC6293F, boolean z10) {
        this.alignment = eVar;
        this.size = function1;
        this.animationSpec = interfaceC6293F;
        this.clip = z10;
    }
}

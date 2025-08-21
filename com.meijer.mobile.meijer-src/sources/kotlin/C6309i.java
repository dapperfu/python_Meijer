package kotlin;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.InterfaceC5866i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lb0/i;", "", "Landroidx/compose/animation/h;", "targetContentEnter", "Landroidx/compose/animation/j;", "initialContentExit", "", "targetContentZIndex", "Lb0/u;", "sizeTransform", "<init>", "(Landroidx/compose/animation/h;Landroidx/compose/animation/j;FLb0/u;)V", "a", "Landroidx/compose/animation/h;", "c", "()Landroidx/compose/animation/h;", "b", "Landroidx/compose/animation/j;", "()Landroidx/compose/animation/j;", "<set-?>", "Landroidx/compose/runtime/i0;", "d", "()F", "setTargetContentZIndex", "(F)V", "Lb0/u;", "()Lb0/u;", "setSizeTransform$animation_release", "(Lb0/u;)V", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: b0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6309i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.animation.h targetContentEnter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.animation.j initialContentExit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 targetContentZIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private u sizeTransform;

    public C6309i(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, float f10, u uVar) {
        this.targetContentEnter = hVar;
        this.initialContentExit = jVar;
        this.targetContentZIndex = A0.a(f10);
        this.sizeTransform = uVar;
    }

    /* renamed from: a, reason: from getter */
    public final androidx.compose.animation.j getInitialContentExit() {
        return this.initialContentExit;
    }

    /* renamed from: b, reason: from getter */
    public final u getSizeTransform() {
        return this.sizeTransform;
    }

    /* renamed from: c, reason: from getter */
    public final androidx.compose.animation.h getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float d() {
        return this.targetContentZIndex.b();
    }

    public /* synthetic */ C6309i(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, float f10, u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, jVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? androidx.compose.animation.a.d(false, null, 3, null) : uVar);
    }
}

package d0;

import V0.C5489q0;
import android.content.Context;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Ld0/b;", "Ld0/K;", "Landroid/content/Context;", "context", "LH1/d;", "density", "LV0/q0;", "glowColor", "Lj0/C;", "glowDrawPadding", "<init>", "(Landroid/content/Context;LH1/d;JLj0/C;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ld0/J;", "a", "()Ld0/J;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Context;", "b", "LH1/d;", "c", "J", "d", "Lj0/C;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13568b implements K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long glowColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14882C glowDrawPadding;

    public /* synthetic */ C13568b(Context context, H1.d dVar, long j10, InterfaceC14882C interfaceC14882C, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, j10, interfaceC14882C);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(C13568b.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C13568b c13568b = (C13568b) other;
        return Intrinsics.e(this.context, c13568b.context) && Intrinsics.e(this.density, c13568b.density) && C5489q0.s(this.glowColor, c13568b.glowColor) && Intrinsics.e(this.glowDrawPadding, c13568b.glowDrawPadding);
    }

    private C13568b(Context context, H1.d dVar, long j10, InterfaceC14882C interfaceC14882C) {
        this.context = context;
        this.density = dVar;
        this.glowColor = j10;
        this.glowDrawPadding = interfaceC14882C;
    }

    @Override // d0.K
    public J a() {
        return new C13567a(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    public int hashCode() {
        return (((((this.context.hashCode() * 31) + this.density.hashCode()) * 31) + C5489q0.y(this.glowColor)) * 31) + this.glowDrawPadding.hashCode();
    }
}

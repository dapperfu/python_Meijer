package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a&\u0010\u000b\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "ratio", "", "matchHeightConstraintsFirst", "a", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "LH1/b;", "", "width", "height", "c", "(JII)Z", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5659e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.e$a */
    public static final class a extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48582f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f48583g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, boolean z10) {
            super(1);
            this.f48582f = f10;
            this.f48583g = z10;
        }

        public final void a(N0 n02) {
            n02.b("aspectRatio");
            n02.getProperties().c("ratio", Float.valueOf(this.f48582f));
            n02.getProperties().c("matchHeightConstraintsFirst", Boolean.valueOf(this.f48583g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    public static final Modifier a(Modifier modifier, float f10, boolean z10) {
        return modifier.then(new AspectRatioElement(f10, z10, L0.b() ? new a(f10, z10) : L0.a()));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(modifier, f10, z10);
    }

    public static final boolean c(long j10, int i10, int i11) {
        int iN = H1.b.n(j10);
        if (i10 <= H1.b.l(j10) && iN <= i10) {
            int iM = H1.b.m(j10);
            if (i11 <= H1.b.k(j10) && iM <= i11) {
                return true;
            }
            return false;
        }
        return false;
    }
}

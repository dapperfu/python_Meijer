package androidx.compose.foundation;

import V0.AbstractC5324i0;
import V0.C5346q0;
import V0.D1;
import V0.x1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "LV0/q0;", "color", "LV0/D1;", "shape", "c", "(Landroidx/compose/ui/Modifier;JLV0/D1;)Landroidx/compose/ui/Modifier;", "LV0/i0;", "brush", "", "alpha", "a", "(Landroidx/compose/ui/Modifier;LV0/i0;LV0/D1;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class a extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48049f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5324i0 f48050g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ D1 f48051h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, AbstractC5324i0 abstractC5324i0, D1 d12) {
            super(1);
            this.f48049f = f10;
            this.f48050g = abstractC5324i0;
            this.f48051h = d12;
        }

        public final void a(N0 n02) {
            n02.b("background");
            n02.getProperties().c("alpha", Float.valueOf(this.f48049f));
            n02.getProperties().c("brush", this.f48050g);
            n02.getProperties().c("shape", this.f48051h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.b$b, reason: collision with other inner class name */
    public static final class C0978b extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f48052f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D1 f48053g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0978b(long j10, D1 d12) {
            super(1);
            this.f48052f = j10;
            this.f48053g = d12;
        }

        public final void a(N0 n02) {
            n02.b("background");
            n02.c(C5346q0.m(this.f48052f));
            n02.getProperties().c("color", C5346q0.m(this.f48052f));
            n02.getProperties().c("shape", this.f48053g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    public static final Modifier a(Modifier modifier, AbstractC5324i0 abstractC5324i0, D1 d12, float f10) {
        return modifier.then(new BackgroundElement(0L, abstractC5324i0, f10, d12, L0.b() ? new a(f10, abstractC5324i0, d12) : L0.a(), 1, null));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, AbstractC5324i0 abstractC5324i0, D1 d12, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d12 = x1.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(modifier, abstractC5324i0, d12, f10);
    }

    public static /* synthetic */ Modifier d(Modifier modifier, long j10, D1 d12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d12 = x1.a();
        }
        return c(modifier, j10, d12);
    }

    public static final Modifier c(Modifier modifier, long j10, D1 d12) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new C0978b(j10, d12);
        } else {
            function1A = L0.a();
        }
        return modifier.then(new BackgroundElement(j10, null, 1.0f, d12, function1A, 2, null));
    }
}

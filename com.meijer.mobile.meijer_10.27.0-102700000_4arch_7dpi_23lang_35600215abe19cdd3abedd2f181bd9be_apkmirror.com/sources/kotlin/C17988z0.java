package kotlin;

import V0.C5346q0;
import a1.q;
import a1.r;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"La1/d;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "tint", "", "b", "(La1/d;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "LZ0/c;", PlaceTypes.PAINTER, "a", "(LZ0/c;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "c", "(Landroidx/compose/ui/Modifier;LZ0/c;)Landroidx/compose/ui/Modifier;", "LU0/k;", "", "d", "(J)Z", "Landroidx/compose/ui/Modifier;", "DefaultIconSizeModifier", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17988z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Modifier f168897a = J.v(Modifier.INSTANCE, H1.h.p(24));

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.z0$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z0.c f168898f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f168899g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f168900h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168901i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168902j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168903k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z0.c cVar, String str, Modifier modifier, long j10, int i10, int i11) {
            super(2);
            this.f168898f = cVar;
            this.f168899g = str;
            this.f168900h = modifier;
            this.f168901i = j10;
            this.f168902j = i10;
            this.f168903k = i11;
        }

        public final void a(Composer composer, int i10) {
            C17988z0.a(this.f168898f, this.f168899g, this.f168900h, this.f168901i, composer, J0.a(this.f168902j | 1), this.f168903k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.z0$b */
    static final class b extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f168904f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f168904f = str;
        }

        public final void a(u uVar) {
            s.g0(uVar, this.f168904f);
            s.s0(uVar, Role.INSTANCE.e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(Z0.c r26, java.lang.String r27, androidx.compose.ui.Modifier r28, long r29, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17988z0.a(Z0.c, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(a1.d dVar, String str, Modifier modifier, long j10, Composer composer, int i10, int i11) {
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        long jQ = (i11 & 8) != 0 ? C5346q0.q(((C5346q0) composer.o(C17894N.a())).getValue(), ((Number) composer.o(C17892M.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.M()) {
            ComposerKt.U(-800853103, i10, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        a(r.g(dVar, composer, i10 & 14), str, modifier2, jQ, composer, q.f43526n | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    private static final Modifier c(Modifier modifier, Z0.c cVar) {
        Modifier modifier2;
        if (!U0.k.f(cVar.k(), U0.k.INSTANCE.a()) && !d(cVar.k())) {
            modifier2 = Modifier.INSTANCE;
        } else {
            modifier2 = f168897a;
        }
        return modifier.then(modifier2);
    }

    private static final boolean d(long j10) {
        if (Float.isInfinite(U0.k.i(j10)) && Float.isInfinite(U0.k.g(j10))) {
            return true;
        }
        return false;
    }
}
